package com.sncompany.newtower.DataClasses;

import com.sncompany.newtower.Battle.ObjectUnit;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.R;

import java.io.InputStream;

/* loaded from: D:\decomp\classes.dex */
public class DataWave {
    static final int DATA_WAVE_DEFENSE_B = 9;
    static final int DATA_WAVE_DEFENSE_N = 1;
    static final int DATA_WAVE_DROP_MANA_B = 15;
    static final int DATA_WAVE_DROP_MANA_N = 7;
    static final int DATA_WAVE_DROP_MONEY_B = 14;
    static final int DATA_WAVE_DROP_MONEY_N = 6;
    static final int DATA_WAVE_HP_B = 8;
    static final int DATA_WAVE_HP_N = 0;
    static final int DATA_WAVE_INFINITY_POS = 60;
    static final int DATA_WAVE_MIN_SPEED_B = 11;
    static final int DATA_WAVE_MIN_SPEED_N = 3;
    static final int DATA_WAVE_MOVE_SPEED_B = 10;
    static final int DATA_WAVE_MOVE_SPEED_N = 2;
    static final int DATA_WAVE_SLOW_DEFENSE_B = 13;
    static final int DATA_WAVE_SLOW_DEFENSE_N = 5;
    static final int DATA_WAVE_STUN_DEFENSE_B = 12;
    static final int DATA_WAVE_STUN_DEFENSE_N = 4;
    static final int DATA_WAVE_TOTAL_COUNT = 61;
    static final int DATA_WAVE_TYPE_COUNT = 16;
    public static final byte WAVE_MAX_COUNT = 60;
    public static final int[][] monsterWaveData = {new int[]{40, 0, 100, 100, 1, 0, 10, 4, 160, 0, 64, 250, 16, 5, 60, 32}, new int[]{60, 0, 100, 102, 1, 1, 12, 4, 240, 0, 63, 250, 16, 6, 72, 32}, new int[]{80, 0, 100, 104, 2, 1, 12, 5, 321, 0, 63, 250, 17, 6, 72, 40}, new int[]{100, 0, 101, 106, 3, 2, 14, 5, 403, 0, 62, 250, 18, 7, 84, 40}, new int[]{120, 0, 101, 108, 3, 2, 14, 6, 484, 0, 62, 250, 18, 7, 84, 48}, new int[]{140, 0, 101, 110, 4, 3, 16, 6, 566, 0, 62, 250, 19, 8, 96, 48}, new int[]{165, 0, 101, 112, 5, 3, 16, 7, 669, 0, 61, 250, 20, 8, 96, 56}, new int[]{190, 0, 102, 114, 5, 3, 18, 7, 772, 0, 61, 250, 20, 8, 108, 56}, new int[]{215, 0, 102, 116, 6, 4, 18, 8, 875, 0, 60, 250, 21, 9, 108, 64}, new int[]{240, 0, 102, 118, 7, 4, 20, 8, 979, 0, 60, 250, 22, 9, 120, 64}, new int[]{270, 0, 102, 120, 7, 5, 22, 9, 1103, 0, 60, 250, 22, 10, 132, 72}, new int[]{315, 0, 103, 122, 8, 5, 22, 9, 1290, 0, 59, 250, 23, 10, 132, 72}, new int[]{360, 0, 103, 124, 9, 5, 24, 9, 1477, 0, 59, 250, 24, 10, 144, 72}, new int[]{405, 0, 103, 126, 9, 6, 24, 10, 1665, 0, 58, 250, 24, 11, 144, 80}, new int[]{450, 0, 103, 128, 10, 6, 26, 10, 1854, 0, 58, 250, 25, 11, 156, 80}, new int[]{495, 3, 104, 130, 11, 7, 26, 10, 2043, 3, 58, 250, 26, 12, 156, 80}, new int[]{540, 3, 104, 132, 11, 7, 28, 11, 2233, 3, 57, 250, 26, 12, 168, 88}, new int[]{585, 3, 104, 134, 12, 8, 28, 11, 2424, 3, 57, 250, 27, 13, 168, 88}, new int[]{630, 3, 104, 136, 13, 8, 30, 11, 2615, 3, 56, 250, 28, 13, 180, 88}, new int[]{675, 3, 105, 138, 13, 8, 32, 11, 2808, 3, 56, 250, 28, 13, 192, 88}, new int[]{720, 3, 105, 140, 14, 9, 32, 12, 3000, 3, 56, 250, 29, 14, 192, 96}, new int[]{785, 3, 105, 142, 15, 9, 34, 12, 3278, 3, 55, 250, 30, 14, 204, 96}, new int[]{850, 3, 105, 144, 15, 10, 34, 12, 3556, 3, 55, 250, 30, 15, 204, 96}, new int[]{915, 3, 106, 146, 16, 10, 36, 12, 3835, 3, 54, 250, 31, 15, 216, 96}, new int[]{980, 3, 106, 148, 17, 11, 36, 12, 4116, 3, 54, 250, 32, 16, 216, 96}, new int[]{1045, 3, 106, 150, 17, 11, 38, 13, 4397, 3, 54, 250, 32, 16, 228, 104}, new int[]{1110, 3, 106, 152, 18, 11, 38, 13, 4679, 3, 53, 250, 33, 16, 228, 104}, new int[]{1175, 3, 107, 154, 19, 12, 40, 13, 4963, 3, 53, 250, 34, 17, 240, 104}, new int[]{1240, 3, 107, 156, 19, 12, 40, 13, 5247, 3, 52, 250, 34, 17, 240, 104}, new int[]{1305, 3, 107, 158, 20, 13, 42, 13, 5533, 3, 52, 250, 35, 18, 252, 104}, new int[]{1370, 5, 107, 160, 21, 13, 44, 14, 5819, 5, 52, 250, 36, 18, 264, 112}, new int[]{1445, 5, 108, 162, 21, 13, 46, 14, 6149, 5, 51, 250, 36, 18, 276, 112}, new int[]{1520, 5, 108, 164, 22, 14, 48, 14, 6481, 5, 51, 250, 37, 19, 288, 112}, new int[]{1595, 5, 108, 166, 23, 14, 50, 14, 6813, 5, 50, 250, 38, 19, 300, 112}, new int[]{1670, 5, 108, 168, 23, 15, 52, 14, 7147, 5, 50, 250, 38, 20, 312, 112}, new int[]{1745, 5, 109, 170, 24, 15, 54, 15, 7482, 5, 50, 250, 39, 20, 324, 120}, new int[]{1820, 5, 109, 172, 25, 16, 56, 15, 7818, 5, 49, 250, 40, 21, 336, 120}, new int[]{1895, 5, 109, 174, 25, 16, 58, 15, 8156, 5, 49, 250, 40, 21, 348, 120}, new int[]{1970, 5, 109, 176, 26, 16, 60, 15, 8494, 5, 48, 250, 41, 21, 360, 120}, new int[]{2045, 5, 110, 178, 27, 17, 62, 15, 8834, 5, 48, 250, 42, 22, 372, 120}, new int[]{2120, 5, 110, 180, 27, 17, 64, 16, 9175, 5, 48, 250, 42, 22, 384, 128}, new int[]{2210, 5, 110, 182, 28, 18, 66, 16, 9582, 5, 47, 250, 43, 23, 396, 128}, new int[]{2300, 5, 110, 184, 29, 18, 68, 16, 9991, 5, 47, 250, 44, 23, 408, 128}, new int[]{2390, 5, 111, 186, 29, 18, 70, 16, 10401, 5, 46, 250, 44, 23, 420, 128}, new int[]{2480, 5, 111, 188, 30, 19, 72, 16, 10812, 5, 46, 250, 45, 24, 432, 128}, new int[]{2570, 8, 111, 190, 31, 19, 74, 16, 11225, 8, 46, 250, 46, 24, 444, 128}, new int[]{2660, 8, 111, 192, 31, 20, 76, 16, 11640, 8, 45, 250, 46, 25, 456, 128}, new int[]{2750, 8, 112, 194, 32, 20, 78, 16, 12056, 8, 45, 250, 47, 25, 468, 128}, new int[]{2840, 8, 112, 196, 33, 21, 80, 16, 12473, 8, 44, 250, 48, 26, 480, 128}, new int[]{2930, 8, 112, 198, 34, 21, 82, 16, 12892, 8, 44, 250, 49, 26, 492, 128}, new int[]{3020, 8, 112, 200, 34, 21, 86, 17, 13312, 8, 44, 250, 49, 26, 516, 136}, new int[]{3120, 8, 113, 202, 35, 22, 90, 17, 13777, 8, 43, 250, 50, 27, 540, 136}, new int[]{3220, 8, 113, 204, 36, 22, 94, 17, 14245, 8, 43, 250, 51, 27, 564, 136}, new int[]{3320, 8, 113, 206, 36, 23, 100, 17, 14714, 8, 42, 250, 51, 28, 600, 136}, new int[]{3420, 8, 113, 208, 37, 23, 102, 17, 15184, 8, 42, 250, 52, 28, 612, 136}, new int[]{3520, 8, 114, 210, 38, 24, 104, 18, 15656, 8, 42, 250, 53, 29, 624, 144}, new int[]{3620, 8, 114, 212, 38, 24, 112, 18, 16130, 8, 41, 250, 53, 29, 672, 144}, new int[]{3720, 8, 114, 214, 39, 24, 120, 18, 16606, 8, 41, 250, 54, 29, 720, 144}, new int[]{3820, 8, 114, 216, 40, 25, 130, 18, 17083, 8, 40, 250, 55, 30, 780, 144}, new int[]{3920, 8, 115, 218, 40, 25, 140, 18, 17561, 8, 40, 250, 55, 30, 840, 144}, new int[]{600, 0, 1, 1, 50, 50, 0, 10, 1200, 0, 0, 2, 65, 35, 10, 120}};
    public static final int[] waveDataResource = {R.raw.mob0, R.raw.mob1, R.raw.mob2, R.raw.mob3, R.raw.mob4, R.raw.mob5, R.raw.mob6, R.raw.mob7, R.raw.mob8, R.raw.mob9, R.raw.mob10, R.raw.mob11, R.raw.mob12, R.raw.mob13, R.raw.mob14, R.raw.mob15, R.raw.mob16, R.raw.mob17, R.raw.mob18, R.raw.mob19, R.raw.mob20, R.raw.mob21, R.raw.mob22, R.raw.mob23, R.raw.mob24, R.raw.mob25, R.raw.mob26, R.raw.mob27, R.raw.mob28, R.raw.mob29, R.raw.mob30, R.raw.mob31, R.raw.mob32, R.raw.mob33, R.raw.mob34, R.raw.mob35, R.raw.mob36, R.raw.mob37, R.raw.mob38, R.raw.mob39, R.raw.mob40, R.raw.mob41, R.raw.mob42, R.raw.mob43, R.raw.mob44, R.raw.mob45, R.raw.mob46, R.raw.mob47, R.raw.mob48, R.raw.mob49};

    public DataStage st;
    public final DataMap map;

    public final int waveCount, wcc;
    public boolean perfectWave = true, waveMonsterOutPos = false;
    public int waveStartT = 90, current = 0, monsterOpenTime = 0;
    public int wavePattern, gatePattern;
    public final int[] waveMonsterType = new int[2], waveMonsterRemainCount = new int[2], waveMonsterShowTime = new int[2], waveMonsterShowCurrent = new int[2];
    public final int[][] waveMobData = new int[WAVE_MAX_COUNT][8];

    public static DataWave loadWave(DataMap map, int SID) {
        byte[] bArr = null;
        try {
            InputStream openRawResource = GameThread.newTower.getResources().openRawResource(waveDataResource[SID]);
            int available = openRawResource.available();
            bArr = new byte[available];
            int dats = 0;
            do {
                int read = openRawResource.read(bArr, dats, available - dats);
                if (read <= 0)
                    break;
                else
                    dats += read;
            } while (dats < available);
            openRawResource.close();
        } catch (Exception unused) {
        }
        return new DataWave(map, bArr);
    }

    /**
     * Used exclusively for Tutorial
     * @param m Tutorial map
     */
    public DataWave(DataMap m) {
       map = m;
       waveCount = wcc = 1;
        for (int i = 0; i < 8; i++)
            waveMobData[0][i] = 0;
    }
    private DataWave(DataMap m, byte[] data) {
        map = m;
        waveCount = Config.ByteArrayToInt(data, 0);
        for (int i = 0; i < waveCount; i++)
            for (int j = 0; j < 8; j++)
                waveMobData[i][j] = Config.ByteArrayToInt(data, (i * 32) + 4 + (j * 4));
        wcc = DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[m.SID];//Log.d("Check", "The " + (wcc == waveCount) + " check");
    }

    /**
     * Checks if the wave is the last. If it isn't, sets the next wave. On infinite mode it loops again
     * @return 1 if it's the last wave on Normal Mode, 3 if it's the last wave on BaseDestroyer Mode, 2 if it isn't the last wave
     */
    public int setWave() {
        int wv = current;
        if (wv >= wcc) {
            if (st.mapType != 1)
                return 1 + st.mapType;
            wv %= wcc;
        }

        for (int i = 0; i < waveMonsterType.length; i++) {
            int datP = i * 3;
            waveMonsterType[i] = waveMobData[wv][datP];
            waveMonsterRemainCount[i] = waveMobData[wv][datP + 1];
            if (waveMonsterType[i] != -1) {
                waveMonsterShowTime[i] = DataMonster.monsterData[waveMonsterType[i]][8] / 3;
                waveMonsterShowTime[i] = (waveMonsterShowTime[i] * waveMobData[wv][5]) / 100;
            }
            waveMonsterShowCurrent[i] = 0;
        }
        wavePattern = waveMobData[wv][6];
        gatePattern = waveMobData[wv][7];
        return 2;
    }

    public void monsterWaveUpdate() {
        byte iWMOP = (byte) (waveMonsterOutPos ? 1 : 0);
        if (wavePattern == 0) {
            if (waveMonsterRemainCount[iWMOP] <= 0) {
                if (iWMOP == 0)
                    waveMonsterOutPos = true;
                return;
            }
            if (++waveMonsterShowCurrent[iWMOP] >= waveMonsterShowTime[iWMOP]) {
                st.addMonsterUnit(waveMonsterType[iWMOP], false);
                waveMonsterRemainCount[iWMOP]--;
                waveMonsterShowCurrent[iWMOP] -= waveMonsterShowTime[iWMOP];
                monsterOpenTime = 12;
            }
            return;
        }
        if (wavePattern != 1) {
            if (wavePattern == 2 || wavePattern == 3) {
                if (waveMonsterRemainCount[iWMOP] <= 0) {
                    if (iWMOP == 0)
                        waveMonsterOutPos = true;
                    return;
                }
                if (++waveMonsterShowCurrent[iWMOP] >= waveMonsterShowTime[iWMOP]) {
                    st.addMonsterUnit(waveMonsterType[iWMOP], iWMOP == 0);
                    waveMonsterRemainCount[iWMOP]--;
                    waveMonsterShowCurrent[iWMOP] -= waveMonsterShowTime[iWMOP];
                    monsterOpenTime = 12;
                }
            }
            return;
        }
        if (waveMonsterRemainCount[iWMOP] <= 0) {
            waveMonsterOutPos = !waveMonsterOutPos;
            return;
        }
        if (++waveMonsterShowCurrent[iWMOP] >= waveMonsterShowTime[iWMOP]) {
            st.addMonsterUnit(waveMonsterType[iWMOP], false);
            waveMonsterRemainCount[iWMOP]--;
            waveMonsterShowCurrent[iWMOP] -= waveMonsterShowTime[iWMOP];
            monsterOpenTime = 12;
            waveMonsterOutPos = !waveMonsterOutPos;
            if (waveMonsterRemainCount[1 - iWMOP] <= 0) {
                waveMonsterOutPos = !waveMonsterOutPos;
            }
        }
    }

    public int checkWaveAndFinishCheck() {
        if (st.mapType < 2) {
            if (!st.monsterUnit.isEmpty())
                return 0;

            for (int i2 = 0; i2 < waveMonsterType.length; i2++)
                if (waveMonsterRemainCount[i2] > 0)
                    return 0;
            if (perfectWave)
                st.bScore += ((current * 0.1f) + 1) * 600;

            current++;
            waveStartT = 60;
            perfectWave = true;
            return setWave();
        }
        if (st.mapType > 2) {
            return 0;
        }
        boolean z = false;
        for (ObjectUnit obj : map.objectUnit) {
            int i5 = obj.type;
            if (i5 == 28 || i5 == 29 || i5 == 32) {
                z = true;
                break;
            }
        }
        if (!z) {
            if (perfectWave)
                st.bScore += ((current * 0.1f) + 1.0f) * 600.0f;
            return 1;
        }
        if (!st.monsterUnit.isEmpty())
            return 0;

        for (int i6 = 0; i6 < 2; i6++) {
            if (waveMonsterRemainCount[i6] > 0) {
                return 0;
            }
        }
        if (perfectWave) {
            st.bScore += ((current * 0.1f) + 1.0f) * 600.0f;
        }
        current++;
        waveStartT = 60;
        perfectWave = true;
        return setWave();
    }
}
