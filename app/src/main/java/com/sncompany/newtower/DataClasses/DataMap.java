package com.sncompany.newtower.DataClasses;

import com.sncompany.newtower.DataObject;
import com.sncompany.newtower.DataWave;
import com.sncompany.newtower.DataWaveMob;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.R;

import java.io.InputStream;
import java.util.ArrayList;

public class DataMap {
    public static final int LOAD_MAP_START_COUNT = 450;
    public static final int MAP_DEPTH_DATA_MAX = 9999;
    public static final int MAP_END_POSITION_COUNT = 10;
    public static final int MAP_END_POSITION_POS_COUNT = 2;
    public static final int MAP_GROUP_TYPE_FOREST = 0;
    public static final int MAP_MOVE_ALLOW_EAST = 4;
    public static final int MAP_MOVE_ALLOW_NONE = 0;
    public static final int MAP_MOVE_ALLOW_NORTH = 1;
    public static final int MAP_MOVE_ALLOW_NORTH_EAST = 2;
    public static final int MAP_MOVE_ALLOW_NORTH_WEST = 128;
    public static final int MAP_MOVE_ALLOW_SOUTH = 16;
    public static final int MAP_MOVE_ALLOW_SOUTH_EAST = 8;
    public static final int MAP_MOVE_ALLOW_SOUTH_WEST = 32;
    public static final int MAP_MOVE_ALLOW_TOTAL_COUNT = 8;
    public static final int MAP_MOVE_ALLOW_WEST = 64;
    public static final int MAP_START_POSITION_COUNT = 10;
    public static final int MAP_START_POSITION_POS_COUNT = 2;
    public static final int MAP_TILE_DATA_HEIGHT = 10;
    public static final int MAP_TILE_DATA_WIDTH = 15;
    public static final int MAP_TILE_TYPE_NONE = -1;
    public static final int MAP_TILE_TYPE_ROAD_NE = 2;
    public static final int MAP_TILE_TYPE_ROAD_NS = 0;
    public static final int MAP_TILE_TYPE_ROAD_NW = 3;
    public static final int MAP_TILE_TYPE_ROAD_SE = 4;
    public static final int MAP_TILE_TYPE_ROAD_SW = 5;
    public static final int MAP_TILE_TYPE_ROAD_WE = 1;
    public static final int MAP_TUTORIAL = 50;
    public final int[][] mapStartPosition = new int[10][2];
    public final int[][] mapEndPosition = new int[10][2];
    public final int[][] mapMoveData = new int[15][10];
    public final int[][] mapTileData = new int[15][10];
    public static final int[][] DIR_MOVE_POS = {new int[]{0, -1}, new int[]{1, -1}, new int[]{1, 0}, new int[]{1, 1}, new int[]{0, 1}, new int[]{-1, 1}, new int[]{-1, 0}, new int[]{-1, -1}};
    public static final int[] mapDataResource = {R.raw.map0, R.raw.map1, R.raw.map2, R.raw.map3, R.raw.map4, R.raw.map5, R.raw.map6, R.raw.map7, R.raw.map8, R.raw.map9, R.raw.map10, R.raw.map11, R.raw.map12, R.raw.map13, R.raw.map14, R.raw.map15, R.raw.map16, R.raw.map17, R.raw.map18, R.raw.map19, R.raw.map20, R.raw.map21, R.raw.map22, R.raw.map23, R.raw.map24, R.raw.map25, R.raw.map26, R.raw.map27, R.raw.map28, R.raw.map29, R.raw.map30, R.raw.map31, R.raw.map32, R.raw.map33, R.raw.map34, R.raw.map35, R.raw.map36, R.raw.map37, R.raw.map38, R.raw.map39, R.raw.map40, R.raw.map41, R.raw.map42, R.raw.map43, R.raw.map44, R.raw.map45, R.raw.map46, R.raw.map47, R.raw.map48, R.raw.map49, R.raw.map_tutorial};

    public int mapStartPositionLoop = 0, mapStartPositionCount, mapEndPositionCount, gatePattern, mapBackgroundType;
    public final ArrayList<ObjectUnit> objectUnit = new ArrayList<>(50);
    public final int[] mapEndDirection = new int[10];
    public DataWave wav;
    //public DataStage st;

    public static DataMap loadMap(int SID, boolean play) {
        byte[] bArr = null;
        try {
            InputStream openRawResource = newTower.getResources().openRawResource(mapDataResource[SID]);
            int available = openRawResource.available();
            bArr = new byte[available];
            int i3 = 0;
            do {
                int read = openRawResource.read(bArr, i3, available - i3);
                if (read <= 0) {
                    break;
                } else {
                    i3 += read;
                }
            } while (i3 < available);
            openRawResource.close();
        } catch (Exception ignored) {
        }
        DataMap map = new DataMap();

        for (int i4 = 0; i4 < 10; i4++) {
            for (int i5 = 0; i5 < 15; i5++) {
                map.mapTileData[i5][i4] = bArr[(i4 * 15) + i5];
            }
        }
        for (int i6 = 0; i6 < 10; i6++) {
            for (int i7 = 0; i7 < 15; i7++) {
                map.mapMoveData[i7][i6] = bArr[(i6 * 15) + 150 + i7];
            }
        }
        for (int i8 = 0; i8 < 10; i8++) {
            for (int i9 = 0; i9 < 15; i9++) {
                int i10 = (i8 * 15) + 300 + i9;
                if (bArr[i10] != -1) {
                    map.addObjectUnit(bArr[i10], i9, i8, true);
                }
            }
        }
        byte b = bArr[LOAD_MAP_START_COUNT];
        map.mapStartPositionCount = b;
        int i11 = 0;
        while (i11 < map.mapStartPositionCount) {
            int[][] iArr = map.mapStartPosition;
            int i12 = (i11 * 2) + 451;
            iArr[i11][0] = bArr[i12];
            iArr[i11][1] = bArr[i12 + 1];
            i11++;
        }
        for (int i13 = map.mapStartPositionCount - 1; i13 > 0; i13--) {
            int i14 = i13 - 1;
            while (true) {
                if (i14 >= 0) {
                    int[][] iArr2 = map.mapStartPosition;
                    if (iArr2[i14][0] == iArr2[i13][0] && iArr2[i14][1] == iArr2[i13][1]) {
                        map.mapStartPositionCount--;
                        break;
                    }
                    i14--;
                }
            }
        }
        for (int i15 = 0; i15 < map.mapStartPositionCount; i15++) {
            int[][] iArr3 = map.mapMoveData;
            int[][] iArr4 = map.mapStartPosition;
            if ((4 & iArr3[iArr4[i15][0]][iArr4[i15][1]]) != 0) {
                map.addObjectUnit(207, iArr4[i15][0], iArr4[i15][1], true);
            } else if ((iArr3[iArr4[i15][0]][iArr4[i15][1]] & 16) != 0) {
                map.addObjectUnit(200, iArr4[i15][0], iArr4[i15][1], true);
            } else if ((iArr3[iArr4[i15][0]][iArr4[i15][1]] & 64) != 0) {
                map.addObjectUnit(201, iArr4[i15][0], iArr4[i15][1], true);
            }
        }
        int i16 = b * 2;
        map.mapEndPositionCount = bArr[i16 + LOAD_MAP_START_COUNT + 1];
        for (int i17 = 0; i17 < map.mapEndPositionCount; i17++) {
            int[][] iArr5 = map.mapEndPosition;
            int i18 = i16 + 452 + (i17 * 2);
            iArr5[i17][0] = bArr[i18];
            iArr5[i17][1] = bArr[i18 + 1];
            int i19 = iArr5[i17][0] - 1;
            int i20 = iArr5[i17][1];
            if (i19 >= 0 && (map.mapMoveData[i19][i20] & 4) != 0) {
                map.addObjectUnit(GameRenderer.GAME_SHOP_EQUIP_SKILL_START_X, iArr5[i17][0], iArr5[i17][1], true);
                map.mapEndDirection[i17] = 203;
            } else {
                int[][] iArr6 = map.mapEndPosition;
                int i21 = iArr6[i17][0] + 1;
                int i22 = iArr6[i17][1];
                if (i21 < 15 && (map.mapMoveData[i21][i22] & 64) != 0) {
                    map.addObjectUnit(208, iArr6[i17][0], iArr6[i17][1], true);
                    map.mapEndDirection[i17] = 208;
                } else {
                    int[][] iArr7 = map.mapEndPosition;
                    map.addObjectUnit(202, iArr7[i17][0], iArr7[i17][1] + 1, true);
                    map.mapEndDirection[i17] = 202;
                }
            }
        }
        map.mapStartPositionLoop = 0;
        int i23 = SID / 10;
        map.mapBackgroundType = i23;
        if (i23 >= 5) {
            GameRenderer.lastShowBackBase = 0;
        } else {
            GameRenderer.lastShowBackBase = i23;
        }
        int i24 = map.mapBackgroundType;
        if (i24 == 0) {
            GameRenderer.backTileOldImage = GameRenderer.backTileImage0;
        } else if (i24 == 1) {
            GameRenderer.backTileOldImage = GameRenderer.backTileImage1;
        } else if (i24 == 2) {
            GameRenderer.backTileOldImage = GameRenderer.backTileImage2;
        } else if (i24 == 3) {
            GameRenderer.backTileOldImage = GameRenderer.backTileImage3;
        } else if (i24 == 4) {
            GameRenderer.backTileOldImage = GameRenderer.backTileImage4;
        } else {
            GameRenderer.backTileOldImage = GameRenderer.backTileImage0;
        }
        if (play) {
            map.wav = DataWave.loadWave(map, SID);
        }
    }

    public int addObjectUnit(int i, int i2, int i3, boolean z) {
        int i4;
        if (z) {
            i4 = 0;
            while (i4 < objectUnitCount) {
                if (o.objectType == -1) {
                    break;
                }
                i4++;
            }
        }
        i4 = -1;
        if (i4 == -1 && objectUnitCount == 99) {
            return -1;
        }
        if (i4 == -1) {
            i4 = objectUnitCount;
            objectUnitCount = i4 + 1;
        }
        ObjectUnit o = new ObjectUnit();
        o.type = -1;
        int i5 = 0;
        while (true) {
            if (i5 >= 34) {
                break;
            }
            if (i == DataObject.objectData[i5][0]) {
                o.objectType = i5;
                break;
            }
            i5++;
        }
        o.objectVanishCount = 0;
        o.destroyEnableFlag = DataObject.objectData[o.objectType][1];
        o.unitHP = DataObject.objectData[o.objectType][2];
        ObjectUnit[] objectUnitArr = objectUnit;
        objectUnitArr[i4].unitMaxHP = objectUnitArr[i4].unitHP;
        o.rewardType = DataObject.objectData[o.objectType][3];
        o.rewardValue = DataObject.objectData[o.objectType][4];
        o.blockSize = DataObject.objectData[o.objectType][5];
        o.blockX = i2;
        o.blockY = i3;
        o.posX = 0;
        o.posY = 0;
        int i6 = o.blockSize;
        if (i6 == 0) {
            o.posX = ((i2 * 45) + 22) * 50;
            o.posY = ((i3 * 45) + 22) * 50;
        } else if (i6 == 1) {
            o.posX = ((i2 * 45) + 22) * 50;
            o.posY = (((i3 + 1) * 45) + 22) * 50;
        } else if (i6 == 2) {
            o.posX = (i2 + 1) * 45 * 50;
            o.posY = (((i3 + 1) * 45) + 22) * 50;
        } else if (i6 == 3) {
            o.posX = ((i2 * 45) + 22) * 50;
            o.posY = ((i3 * 45) + 22) * 50;
        } else if (i6 == 4) {
            o.posX = ((i2 * 45) + 22) * 50;
            o.posY = ((i3 * 45) + 22) * 50;
        } else if (i6 == 5) {
            o.posX = ((i2 * 45) + 22) * 50;
            o.posY = ((i3 * 45) + 22) * 50;
        }
        int i7 = o.objectType;
        if ((i7 == 28 || i7 == 29 || i7 == 32) && mapNumber < 50) {
            o.unitHP = DataWaveMob.DATA_WAVE_GATE_HP[mapNumber];
            o.unitMaxHP = o.unitHP;
            if (mapStartPositionCount == 2) {
                o.unitHP /= 2;
                o.unitMaxHP /= 2;
            }
            if (mapAttackType == 2) {
                o.destroyEnableFlag = 0;
            }
        }
        return i4;
    }

    public int getRandomMapDirection(int i2, int i3, int i4) {
        int i5 = mapMoveData[i2][i3];
        int i6 = 64;
        if (i4 == 1) {
            i6 = 16;
        } else if (i4 != 4) {
            i6 = i4 != 16 ? i4 != 64 ? -1 : 4 : 1;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < 8; i8++) {
            if (i8 != i6 && ((1 << i8) & i5) != 0) {
                i7++;
            }
        }
        if (i7 == 0) {
            return -1;
        }
        int random = NewTower.getRandom(i7);
        int i9 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            if (i10 != i6 && ((1 << i10) & i5) != 0) {
                if (i9 == random) {
                    return i10;
                }
                i9++;
            }
        }
        return -1;
    }
}
