package com.sncompany.newtower;

import static com.sncompany.newtower.DataClasses.DataStage.heroAvail;

import androidx.annotation.NonNull;

import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.Pages.LoadingPage;
import com.sncompany.newtower.Pages.ShopPage;
import com.sncompany.newtower.Pages.TPage;
import com.sncompany.newtower.Pages.stage.StagePage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * Manages in-game settings and game data alike.
 */
public class Config {
    public static final int SAVEFILE_SIZE = 868;
    public static int musicVolume, effectVolume, musicMaxVolume;
    public static long curPlaytime = 0;
    public static boolean movie = true, vibration = true, uncensor;

    public static class SaveFile {

        private final int file_index;

        public byte lastPlayed = 0, limitBreak;
        public int heroPoints, killCount;
        public long totalPlaytime = 0;
        public boolean tutorial;

        /**
         * Indicates if a given story reward has been claimed
         */
        public final boolean[] rewardValues = new boolean[10];
        /**
         * Indicates if a misc trophy has been claimed
         */
        public final boolean[] awardValues = new boolean[62];
        /**
         * Highest score player has on a given stage. -1 means the stage has not been tried ever.
         */
        public final int[][] highScores = new int[50][3];
        public final byte[][] stageProg = new byte[50][3]; //-1 = locked, 0 = uncleared, 1 = clear, 2 = perfect
        public final byte[][] unitUpgrades = new byte[3][6];
        public final byte[][] heroUpgrades = new byte[3][6];
        public final byte[][][] heroEquips = new byte[3][2][]; //[i][0] stores type, [i][1] effect degree. Length is 2, but not stored so it inits as null
        public final byte[][] inventory = new byte[24][]; //same as heroEquips

        public SaveFile(int ind, boolean read) {
            file_index = ind;
            if (read)
                readSaveData();
            else
                newGame();
        }

        /**
         * Writes save Data
         */
        public void saveData() {
            byte[] saveTotalBuffer = new byte[SAVEFILE_SIZE];
            System.out.println(totalPlaytime);
            LongToByteArray(saveTotalBuffer, 0, totalPlaytime);
            System.out.println(ByteArrayToLong(saveTotalBuffer, 0));
            IntToByteArray(saveTotalBuffer, 8, heroPoints);
            IntToByteArray(saveTotalBuffer, 12, killCount);
            int cbit = 16;
            for (int[] highScore : highScores)
                for (int i : highScore) {
                    IntToByteArray(saveTotalBuffer, cbit, i);
                    cbit += 4;
                }
            //cbit = 616
            for (byte[] stp : stageProg)
                for (byte st : stp)
                    saveTotalBuffer[cbit++] = st;
            //cbit = 766
            for (byte[] cups : unitUpgrades)
                for (byte cup : cups)
                    saveTotalBuffer[cbit++] = cup;
            //cbit = 784
            for (byte[] hups : heroUpgrades)
                for (byte hup : hups)
                    saveTotalBuffer[cbit++] = hup;
            //cbit = 802
            for (byte[][] equips : heroEquips) {
                for (byte[] equip : equips)
                    if (equip == null)
                        saveTotalBuffer[cbit++] = -1;
                    else
                        saveTotalBuffer[cbit++] = (byte) ((equip[0] * 10) + equip[1]); //Equip[0] never exceeds EQ_Misc and equip[1] never exceeds 4;
            }
            //cbit = 808
            for (byte[] item : inventory) {
                if (item == null)
                    saveTotalBuffer[cbit++] = -1;
                else
                    saveTotalBuffer[cbit++] = (byte) ((item[0] * 10) + item[1]); //Equip[0] never exceeds EQ_Misc and equip[1] never exceeds 4;
            }
            //cbit = 832
            for (int j = 0; j < awardValues.length; j += 2)
                saveTotalBuffer[cbit++] = BooleansToByte(awardValues[j], awardValues[j + 1]);
            //cbit = 863
            for (int j = 0; j < rewardValues.length; j += 5)
                saveTotalBuffer[cbit++] = BooleansToByte(rewardValues[j], rewardValues[j + 1], rewardValues[j + 2], rewardValues[j + 3], rewardValues[j + 4]);
            //cbit = 865
            saveTotalBuffer[cbit++] = lastPlayed;
            saveTotalBuffer[cbit++] = limitBreak;
            saveTotalBuffer[cbit] = BooleansToByte(tutorial);
            //cbit = 868
            try {
                FileOutputStream openFileOutput = GameThread.newTower.openFileOutput("SAVEDATA" + file_index, 0);
                openFileOutput.write(saveTotalBuffer);
                openFileOutput.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void delete() {
            GameThread.newTower.deleteFile("SAVEDATA" + file_index);
        }

        private void readSaveData() {
            byte[] saveTotalBuffer = new byte[SAVEFILE_SIZE];
            try (FileInputStream lfile = GameThread.newTower.openFileInput("SAVEDATA" + file_index)) {
                int readData = lfile.read(saveTotalBuffer);
                lfile.close();
                if (readData <= 0) {
                    newGame();
                    return;
                }

                totalPlaytime = ByteArrayToLong(saveTotalBuffer, 0);
                if (totalPlaytime == 0) {
                    newGame();
                    return;
                }
                heroPoints = ByteArrayToInt(saveTotalBuffer, 8);
                killCount = ByteArrayToInt(saveTotalBuffer, 12);

                int cbit = 16;
                for (int j = 0; j < highScores.length; j++)
                    for (int k = 0; k < highScores[j].length; k++) {
                        highScores[j][k] = ByteArrayToInt(saveTotalBuffer, cbit);
                        cbit += 4;
                    }
                //cbit = 616
                for (int j = 0; j < stageProg.length; j++)
                    for (int k = 0; k < stageProg[j].length; k++)
                        stageProg[j][k] = saveTotalBuffer[cbit++];
                //cbit = 766
                for (int j = 0; j < unitUpgrades.length; j++)
                    for (int k = 0; k < unitUpgrades[j].length; k++)
                        unitUpgrades[j][k] = saveTotalBuffer[cbit++];
                //cbit = 784
                for (int j = 0; j < heroUpgrades.length; j++)
                    for (int k = 0; k < heroUpgrades[j].length; k++)
                        heroUpgrades[j][k] = saveTotalBuffer[cbit++];
                //cbit = 802
                for (int j = 0; j < heroEquips.length; j++)
                    for (int k = 0; k < 2; k++) {
                        int eq = saveTotalBuffer[cbit++];
                        heroEquips[j][k] = eq == -1 ? null : new byte[]{(byte) (eq / 10), (byte) (eq % 10)};
                    }
                //cbit = 808
                for (int j = 0; j < inventory.length; j++) {
                    int itm = saveTotalBuffer[cbit++];
                    inventory[j] = itm == -1 ? null : new byte[]{(byte)(itm / 10), (byte)(itm % 10)};
                }
                //cbit = 832
                for (int j = 0; j < awardValues.length; j += 2) {
                    boolean[] bs = ByteToBooleans(saveTotalBuffer[cbit++]);
                    awardValues[j] = bs[0];
                    awardValues[j + 1] = bs[1];
                }
                //cbit = 863
                for (int j = 0; j < rewardValues.length; j += 5) {
                    boolean[] bs = ByteToBooleans(saveTotalBuffer[cbit++]);
                    for (int k = 0; k < 5; k++)
                        rewardValues[j + k] = bs[k];
                }
                //cbit = 865
                lastPlayed = saveTotalBuffer[cbit++];
                limitBreak = saveTotalBuffer[cbit++];
                boolean[] lbs = ByteToBooleans(saveTotalBuffer[cbit]);
                //cbit = 868
                tutorial = lbs[0];

                for (int i = 0; i <= 2; i++)
                    heroAvail[i] = rewardValues[i * 2];
            } catch (Exception e) {
                e.printStackTrace();
                newGame();
            }
        }

        private void newGame() {
            for (byte[] prog : stageProg)
                Arrays.fill(prog, (byte) -1);
            stageProg[0][0] = 0;
            for (int[] highScore : highScores)
                Arrays.fill(highScore, (byte) -1);
        }

        public int getAwardCount() {
            int t = 0;
            for (boolean b : awardValues)
                if (b)
                    t++;
            int rwc = t;
            for (int i = DataAward.AWARD_10_Title; i <= DataAward.AWARD_30_Title; i++)
                if (awardValues[i]) rwc--;
                else awardValues[i] = rwc >= (1 + (i - DataAward.AWARD_10_Title)) * 10;
            return t;
        }

        public int getAwardScore() {
            int t = 0;
            for (int i = 0; i < awardValues.length; i++)
                if (awardValues[i])
                    t += DataAward.data[i][2];
            return t;
        }

        @NonNull
        @Override
        public String toString() {
            return GameThread.getString(R.string.file) + " " + file_index;
        }
    }
    public static SaveFile s;
    public static void setFile(SaveFile sf) {
        s = sf;
        curPlaytime = System.currentTimeMillis();
    }

    public static void saveFile() {
        long millis = System.currentTimeMillis();
        s.totalPlaytime += (millis - curPlaytime) / 1000;
        curPlaytime = millis;
        DataAward.check_time();
        s.saveData();
    }

    /**
     * Writes config Data
     */
    public static void saveConfig() {
        byte[] saveTotalBuffer = new byte[9];
        if (musicVolume > musicMaxVolume)
            musicVolume = musicMaxVolume;
        if (effectVolume > musicMaxVolume)
            effectVolume = musicMaxVolume;

        IntToByteArray(saveTotalBuffer, 0, musicVolume);
        IntToByteArray(saveTotalBuffer, 4, effectVolume);
        saveTotalBuffer[8] = BooleansToByte(movie, vibration, uncensor);
        try {
            FileOutputStream openFileOutput = GameThread.newTower.openFileOutput("CFG", 0);
            openFileOutput.write(saveTotalBuffer);
            openFileOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readConfig() {
        byte[] saveTotalBuffer = new byte[9];
        try (FileInputStream lfile = GameThread.newTower.openFileInput("CFG")) {
            int readData = lfile.read(saveTotalBuffer);
            lfile.close();
            if (readData <= 0)
                return;
            musicVolume = ByteArrayToInt(saveTotalBuffer, 0);
            effectVolume = ByteArrayToInt(saveTotalBuffer, 4);
            boolean[] lbs = ByteToBooleans(saveTotalBuffer[8]);
            movie = lbs[0];
            vibration = lbs[1];
            if (lbs[2])
                updateCensor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Convers up to 7 booleans into a byte
     * @param bools The passed bools.
     * @return A byte, containing the bitmask of each bool, where 1 << i = true for each.
     */
    public static byte BooleansToByte(boolean... bools) {
        byte tt = 0;
        for (byte i = 0; i < Math.min(7, bools.length); i++)
            if (bools[i])
                tt |= (byte)(1 << i);
        return tt;
    }
    public static void IntToByteArray(byte[] bArr, int sect, int num) {
        for (int i = 0; i < 4; i++)
            bArr[sect + i] = (byte) ((num >> (i * 8)) & 255);
    }
    public static void LongToByteArray(byte[] bArr, int sect, long num) {
        for (int i = 0; i < 8; i++)
            bArr[sect + i] = (byte) ((num >> (i * 8)) & 255);
    }

    public static boolean[] ByteToBooleans(byte b) {
        boolean[] bs = new boolean[8];
        for (byte i = 0; i < 8; i++)
            bs[i] = (b & (1 << i)) != 0;
        return bs;
    }
    public static int ByteArrayToInt(byte[] bArr, int i) {
        ByteBuffer.allocate(4);
        byte[] b = new byte[4];
        for (int j = 0; j < 4; j++) {
            b[j] = bArr[(i + 3) - j];
        }
        ByteBuffer wrap = ByteBuffer.wrap(b);
        wrap.order(ByteOrder.BIG_ENDIAN);
        return wrap.getInt();
    }
    public static long ByteArrayToLong(byte[] bArr, int i) {
        long j = 0;
        for (int k = 0; k < 8; k++) {
            j += (long)(bArr[i + k] & 255) << (k * 8);
        }
        return j;
    }

    /**
     * Changes the BGM volume, and updates it for all currently playing sounds
     * @param vol The new volume
     */
    public static void setBGMVolume(int vol) {
        if (musicVolume == vol)
            return;

        musicVolume = vol;
        for (int i = 0; i < GameThread.bgmMedia.length; i++) {
            if (GameThread.bgmMedia[i] != null) {
                try {
                    GameThread.bgmMedia[i].setVolume(musicVolume, musicMaxVolume);
                } catch (Exception ignored) {
                }
            }
        }
    }

    public static void updateCensor() {
        uncensor = !uncensor;
        ShopPage.uiShopResource[ShopPage.wizardbody] = uncensor ? R.drawable.ui_shop_wizardbody_u : R.drawable.ui_shop_wizardbody;
        LoadingPage.uiCharFaceResource[5] = uncensor ? R.drawable.ui_char_face_holyeye_u : R.drawable.ui_char_face_holyeye;
        LoadingPage.uiCharFaceResource[9] = uncensor ? R.drawable.ui_char_face_colddiviner_u : R.drawable.ui_char_face_colddiviner;
        LoadingPage.uiCharFaceResource[11] = uncensor ? R.drawable.ui_char_face_magmablaster_u : R.drawable.ui_char_face_magmablaster;
        StagePage.uiCharFaceResource[5] = uncensor ? R.drawable.ui_char_face_holyeye_u : R.drawable.ui_char_face_holyeye;
        StagePage.uiCharFaceResource[9] = uncensor ? R.drawable.ui_char_face_colddiviner_u : R.drawable.ui_char_face_colddiviner;
        StagePage.uiCharFaceResource[11] = uncensor ? R.drawable.ui_char_face_magmablaster_u : R.drawable.ui_char_face_magmablaster;
        StagePage.uiCharFaceResource[14] = uncensor ? R.drawable.ui_char_face_hero2_u : R.drawable.ui_char_face_hero2;
        StagePage.specialIceResource[0] = uncensor ? R.drawable.special_ice_body_u : R.drawable.special_ice_body;
        TPage.alwaysResource[TPage.ALWAYS_R_HERO2] = uncensor ? R.drawable.always_hero2_u : R.drawable.always_hero2;
        if (TPage.alwaysImage[TPage.ALWAYS_R_HERO2].name != -1)
            TPage.alwaysImage[TPage.ALWAYS_R_HERO2].initWithImageName(TPage.alwaysResource[3]);
    }
}
