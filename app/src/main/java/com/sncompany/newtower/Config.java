package com.sncompany.newtower;

import static com.sncompany.newtower.DataClasses.DataStage.heroAvail;

import android.content.Context;

import com.sncompany.newtower.DataClasses.DataAward;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * Manages in-game settings and game data alike.
 */
public class Config {
    static final String SAVEFILE_NAME = "SAVEDATA";
    static final String SAVEFILE_NAME2 = "SAVEDATA2";
    public static final int SAVEFILE_SIZE = 27392;
    static byte[] saveTotalBuffer = new byte[SAVEFILE_SIZE];
    public static int musicVolume, effectVolume, musicMaxVolume;
    public static byte lastPlayed;
    public static int heroPoints, killCount, top_money;
    public static long curPlaytime = 0, totalPlaytime;
    public static boolean movie, tutorial, vibration;
    /**
     * Indicates if a given story reward has been claimed
     */
    public static final boolean[] rewardValues = new boolean[10];
    /**
     * Indicates if a misc trophy has been claimed
     */
    public static final boolean[] awardValues = new boolean[62];
    /**
     * Highest score player has on a given stage. -1 means the stage has not been tried ever.
     */
    public static final int[][] highScores = new int[50][3];
    public static final byte[][] stageProg = new byte[50][3]; //-1 = locked, 0 = uncleared, 1 = clear, 2 = perfect
    public static final byte[][] unitUpgrades = new byte[3][6];
    public static final byte[][] heroUpgrades = new byte[3][6];

    public static int getAwardCount() {
        int t = 0;
        for (boolean b : awardValues)
            if (b)
                t++;
        return t;
    }

    public static int getAwardScore() {
        int t = 0;
        for (int i = 0; i < awardValues.length; i++)
            if (awardValues[i])
                t += DataAward.awardScoreValue[i];
        return t;
    }

    public static void saveAll() {
        NewTower context = GameThread.newTower;
        timeSave();
        saveData(context, false);
        saveData(context, true);
    }

    public static void timeSave() {
        long currentTimeMillis = System.currentTimeMillis();
        totalPlaytime += (int) ((currentTimeMillis - curPlaytime) / 1000);
        curPlaytime = currentTimeMillis;
        DataAward.check_time();
    }

    /**
     * Writes save Data
     * @param context ???
     * @param file2 If this data will be saved in file 2
     */
    public static void saveData(Context context, boolean file2) {
        FileOutputStream openFileOutput;
        Arrays.fill(saveTotalBuffer, (byte) 0);

        if (musicVolume > musicMaxVolume)
            musicVolume = musicMaxVolume;
        if (effectVolume > musicMaxVolume)
            effectVolume = musicMaxVolume;

        LongToByteArray(saveTotalBuffer, 0, totalPlaytime);
        IntToByteArray(saveTotalBuffer, 8, heroPoints);
        IntToByteArray(saveTotalBuffer, 12, musicVolume);
        IntToByteArray(saveTotalBuffer, 16, effectVolume);
        IntToByteArray(saveTotalBuffer, 20, killCount);
        IntToByteArray(saveTotalBuffer, 24, top_money);

        int cbit = 28;
        for (int[] highScore : highScores)
            for (int i : highScore) {
                IntToByteArray(saveTotalBuffer, cbit, i);
                cbit += 4;
            }
        //cbit = 628
        for (byte[] stp : stageProg)
            for (byte st : stp)
                saveTotalBuffer[cbit++] = st;
        //cbit = 778
        for (byte[] cups : unitUpgrades)
            for (byte cup : cups)
                saveTotalBuffer[cbit++] = cup;
        //cbit = 796
        for (byte[] hups : heroUpgrades)
            for (byte hup : hups)
                saveTotalBuffer[cbit++] = hup;
        //cbit = 814

        for (int j = 0; j < 3; j++)
            for (int i19 = 0; i19 < 2; i19++) {
                IntToByteArray(saveTotalBuffer, cbit, heroItemType[j][i19]);
                cbit += 4;
            }

        for (int j = 0; j < 24; j++) {
            IntToByteArray(saveTotalBuffer, cbit, itemUnitValue[j]);
            cbit += 4;
        }
        for (int j = 0; j < awardValues.length; j += 2)
            saveTotalBuffer[cbit++] = BooleansToByte(awardValues[j], awardValues[j+1]);
        for (int j = 0; j < rewardValues.length; j += 5)
            saveTotalBuffer[cbit++] = BooleansToByte(rewardValues[j], rewardValues[j+1], rewardValues[j+2], rewardValues[j+3], rewardValues[j+4]);
        saveTotalBuffer[cbit++] = lastPlayed;
        saveTotalBuffer[cbit] = BooleansToByte(movie, tutorial, vibration);
        try {
            openFileOutput = context.openFileOutput(file2 ? SAVEFILE_NAME2 : SAVEFILE_NAME, 0);
            openFileOutput.write(saveTotalBuffer);
            openFileOutput.close();
        } catch (Exception unused) {
        }
    }

    private static void newGame() {
        for (byte[] prog : stageProg)
            Arrays.fill(prog, (byte) -1);
        stageProg[0][0] = 0;
        for (int[] highScore : highScores)
            Arrays.fill(highScore, (byte) -1);

        vibration = true;
        movie = true;
        tutorial = false;
    }

    public static void readSaveData(NewTower context, int file) {
        Arrays.fill(saveTotalBuffer, (byte)0);
        try (FileInputStream lfile = context.openFileInput(file == 1 ? SAVEFILE_NAME : SAVEFILE_NAME2)) {
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
            musicVolume = ByteArrayToInt(saveTotalBuffer, 12);
            effectVolume = ByteArrayToInt(saveTotalBuffer, 16);
            killCount = ByteArrayToInt(saveTotalBuffer, 20);
            top_money = ByteArrayToInt(saveTotalBuffer, 24);

            int cbit = 28;
            for (int j = 0; j < highScores.length; j++)
                for (int k = 0; k < highScores[j].length; k++) {
                    highScores[j][k] = ByteArrayToInt(saveTotalBuffer, cbit);
                    cbit += 4;
                }
            //cbit = 628
            for (int j = 0; j < stageProg.length; j++)
                for (int k = 0; k < stageProg[j].length; k++)
                    stageProg[j][k] = saveTotalBuffer[cbit++];
            //cbit = 778
            for (int j = 0; j < unitUpgrades.length; j++)
                for (int k = 0; k < unitUpgrades[j].length; k++)
                    unitUpgrades[j][k] = saveTotalBuffer[cbit++];
            //cbit = 796
            for (int j = 0; j < heroUpgrades.length; j++)
                for (int k = 0; k < heroUpgrades[j].length; k++)
                    heroUpgrades[j][k] = saveTotalBuffer[cbit++];
            //cbit = 814
            for (int j = 0; j < 3; j++) {
                    for (int i19 = 0; i19 < 2; i19++) {
                        IntToByteArray(saveTotalBuffer, cbit, heroItemType[j][i19]);
                        cbit += 4;
                    }
                }
                for (int j = 0; j < 24; j++) {
                    IntToByteArray(saveTotalBuffer, cbit, itemUnitValue[j]);
                    cbit += 4;
                }

            for (int j = 0; j < awardValues.length; j += 2) {
                boolean[] bs = ByteToBooleans(saveTotalBuffer[cbit++]);
                awardValues[j] = bs[0];
                awardValues[j + 1] = bs[1];
            }
            for (int j = 0; j < rewardValues.length; j += 5) {
                boolean[] bs = ByteToBooleans(saveTotalBuffer[cbit++]);
                for (int k = 0; k < 5; k++)
                    rewardValues[j + k] = bs[k];
            }
            lastPlayed = saveTotalBuffer[cbit++];
            boolean[] lbs = ByteToBooleans(saveTotalBuffer[cbit]);
            movie = lbs[0];
            tutorial = lbs[1];
            vibration = lbs[2];

            heroAvail[0] = rewardValues[0];
            heroAvail[1] = rewardValues[2];
            heroAvail[2] = rewardValues[4];
        } catch (Exception ignored) {
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
        for (int i3 = 0; i3 < 4; i3++)
            bArr[sect + i3] = (byte) ((num >> (i3 * 8)) & 255);
    }
    public static void LongToByteArray(byte[] bArr, int sect, long num) {
        for (int i3 = 0; i3 < 8; i3++)
            bArr[sect + i3] = (byte) ((num >> (i3 * 8)) & 255);
    }

    public static boolean[] ByteToBooleans(byte b) {
        boolean[] bs = new boolean[8];
        for (byte i = 0; i < 8; i++)
            bs[i] = (b & i) > 0;
        return bs;
    }
    public static int ByteArrayToInt(byte[] bArr, int i) {
        ByteBuffer.allocate(4);
        byte[] bArr2 = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr2[i2] = bArr[(i + 3) - i2];
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        wrap.order(ByteOrder.BIG_ENDIAN);
        return wrap.getInt();
    }
    public static long ByteArrayToLong(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            j = (j << 8) | (bArr[i + i2] & 255);
        }
        return j;
    }

    /**
     * Changes the general setting volume, and updates it for all currently playing sounds
     * @param vol The new volume
     */
    public static void updateVolume(int vol) {
        if (musicVolume == vol)
            return;

        musicVolume = vol;
        for (int i = 0; i < 3; i++) {
            MediaManager[] mediaManagerArr = bgmMedia;
            if (mediaManagerArr[i] != null) {
                try {
                    mediaManagerArr[i].setVolume(musicVolume, musicMaxVolume);
                } catch (Exception ignored) {
                }
            }
        }
    }
}
