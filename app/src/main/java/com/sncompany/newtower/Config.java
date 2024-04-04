package com.sncompany.newtower;

import java.io.FileOutputStream;
import java.util.Arrays;

/**
 * Manages in-game settings and game data alike.
 */
public class Config {
    static byte[] saveTotalBuffer;
    public static int musicVolume, effectVolume, musicMaxVolume;
    public static byte lastPlayed;
    public static int heroPoints;
    public static long curPlaytime, totalPlaytime;
    public static boolean movie, tutorial, vibration;
    public static boolean[] rewardValues = new boolean[10];

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

        int i7 = 20;
        for (int j = 0; j < highScoreValue.length; j++)
            for (int k = 0; k < highScoreValue[j].length; k++) {
                IntToByteArray(saveTotalBuffer, i7, highScoreValue[j][k]);
                i7 += 4;
            }
        //i7 = 170 by this point (hsv[50][3])
        for (int j = 0; j < 50; j++) {
            for (int i11 = 0; i11 < 3; i11++) {
                IntToByteArray(saveTotalBuffer, i7, gamePlayedCount[j][i11]);
                i7 += 4;
            }
        }
        for (int j = 0; j < 50; j++) {
            for (int i13 = 0; i13 < 3; i13++) {
                IntToByteArray(saveTotalBuffer, i7, gameClearedFlag[j][i13]);
                i7 += 4;
            }
        }
        for (int j = 0; j < 50; j++) {
            for (int i15 = 0; i15 < 3; i15++) {
                IntToByteArray(saveTotalBuffer, i7, gamePerfectFlag[j][i15]);
                i7 += 4;
            }
        }
        for (int j = 0; j < 18; j++) {
            IntToByteArray(saveTotalBuffer, i7, upgradeUnitValue[j]);
            i7 += 4;
        }
        for (int j = 0; j < 3; j++) {
            IntToByteArray(saveTotalBuffer, i7, heroUnitType[j]);
            i7 += 4;
        }
        for (int j = 0; j < 3; j++) {
            for (int i19 = 0; i19 < 2; i19++) {
                IntToByteArray(saveTotalBuffer, i7, heroItemType[j][i19]);
                i7 += 4;
            }
        }
        for (int j = 0; j < 3; j++) {
            for (int i21 = 0; i21 < 6; i21++) {
                IntToByteArray(saveTotalBuffer, i7, heroUpgradeValue[j][i21]);
                i7 += 4;
            }
        }
        for (int j = 0; j < 24; j++) {
            IntToByteArray(saveTotalBuffer, i7, itemUnitValue[j]);
            i7 += 4;
        }
        for (int j = 0; j < 62; j++) {
            IntToByteArray(saveTotalBuffer, i7, awardDataValue[j]);
            i7 += 4;
        }
        for (int j = 0; j < 62; j++) {
            IntToByteArray(saveTotalBuffer, i7, awardDataFlag[j]);
            i7 += 4;
        }
        for (int j = 0; j < 10; j++) {
            saveTotalBuffer[i7] = (byte)(rewardValues[j] ? 1 : 0);
            i7++;
        }
        saveTotalBuffer[i7] = lastPlayed;
        try {
            openFileOutput = context.openFileOutput(file2 ? SAVEFILE_NAME2 : SAVEFILE_NAME, 0);
            openFileOutput.write(saveTotalBuffer);
            openFileOutput.close();
        } catch (Exception unused) {
        }
    }
    public static void IntToByteArray(byte[] bArr, int sect, int num) {
        for (int i3 = 0; i3 < 4; i3++)
            bArr[sect + i3] = (byte) ((num >> (i3 * 8)) & 255);
    }
    public static void LongToByteArray(byte[] bArr, int sect, long num) {
        for (int i3 = 0; i3 < 8; i3++)
            bArr[sect + i3] = (byte) ((num >> (i3 * 8)) & 255);
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
                    Log.d("SET VOLUME", String.format("%d %d", musicVolume, musicMaxVolume));
                } catch (Exception unused) {
                }
            }
        }
    }
}
