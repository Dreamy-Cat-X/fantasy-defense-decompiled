package com.sncompany.newtower.DataClasses;

import com.sncompany.newtower.Battle.ObjectUnit;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;

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
    public static final int[][] DIR_MOVE_POS = {new int[]{0, -1}, new int[]{1, -1}, new int[]{1, 0}, new int[]{1, 1}, new int[]{0, 1}, new int[]{-1, 1}, new int[]{-1, 0}, new int[]{-1, -1}};
    private static final int[] mapDataResource = {R.raw.map0, R.raw.map1, R.raw.map2, R.raw.map3, R.raw.map4, R.raw.map5, R.raw.map6, R.raw.map7, R.raw.map8, R.raw.map9, R.raw.map10, R.raw.map11, R.raw.map12, R.raw.map13, R.raw.map14, R.raw.map15, R.raw.map16, R.raw.map17, R.raw.map18, R.raw.map19, R.raw.map20, R.raw.map21, R.raw.map22, R.raw.map23, R.raw.map24, R.raw.map25, R.raw.map26, R.raw.map27, R.raw.map28, R.raw.map29, R.raw.map30, R.raw.map31, R.raw.map32, R.raw.map33, R.raw.map34, R.raw.map35, R.raw.map36, R.raw.map37, R.raw.map38, R.raw.map39, R.raw.map40, R.raw.map41, R.raw.map42, R.raw.map43, R.raw.map44, R.raw.map45, R.raw.map46, R.raw.map47, R.raw.map48, R.raw.map49, R.raw.map_tutorial};
    private static final int[][] tileTileResource = {new int[]{R.drawable.map_t0_0, R.drawable.map_t0_1, R.drawable.map_t0_2, R.drawable.map_t0_3, R.drawable.map_t0_4, R.drawable.map_t0_5, R.drawable.map_t0_6, R.drawable.map_t0_7, R.drawable.map_t0_8, R.drawable.map_t0_9}, new int[]{R.drawable.map_t1_0, R.drawable.map_t1_1, R.drawable.map_t1_2, R.drawable.map_t1_3, R.drawable.map_t1_4, R.drawable.map_t1_5, R.drawable.map_t1_6, R.drawable.map_t1_7, R.drawable.map_t1_8, R.drawable.map_t1_9}, new int[]{R.drawable.map_t2_0, R.drawable.map_t2_1, R.drawable.map_t2_2, R.drawable.map_t2_3, R.drawable.map_t2_4, R.drawable.map_t2_5, R.drawable.map_t2_6, R.drawable.map_t2_7, R.drawable.map_t2_8, R.drawable.map_t2_9}, new int[]{R.drawable.map_t3_0, R.drawable.map_t3_1, R.drawable.map_t3_2, R.drawable.map_t3_3, R.drawable.map_t3_4, R.drawable.map_t3_5, R.drawable.map_t3_6, R.drawable.map_t3_7, R.drawable.map_t3_8, R.drawable.map_t3_9}, new int[]{R.drawable.map_t4_0, R.drawable.map_t4_1, R.drawable.map_t4_2, R.drawable.map_t4_3, R.drawable.map_t4_4, R.drawable.map_t4_5, R.drawable.map_t4_6, R.drawable.map_t4_7, R.drawable.map_t4_8, R.drawable.map_t4_9}};
    private static final int[] tileBaseResource = {R.drawable.map_b0, R.drawable.map_b1, R.drawable.map_b2, R.drawable.map_b3, R.drawable.map_b4};
    private static final Texture2D[] backTileImage0 = new Texture2D[tileTileResource[0].length];
    private static final Texture2D[] backTileImage1 = new Texture2D[tileTileResource[1].length];
    private static final Texture2D[] backTileImage2 = new Texture2D[tileTileResource[2].length];
    private static final Texture2D[] backTileImage3 = new Texture2D[tileTileResource[3].length];
    private static final Texture2D[] backTileImage4 = new Texture2D[tileTileResource[4].length];
    private static final Texture2D[][] backTileImages = {backTileImage0, backTileImage1, backTileImage2, backTileImage3, backTileImage4};
    private static DataMap current = null;

    public final int mapEndPositionCount, lastShowBackBase, SID;
    public int mapStartPositionLoop = 0, mapStartPositionCount, gatePattern;
    public final ArrayList<ObjectUnit> objectUnit = new ArrayList<>(50), defaultObjs = new ArrayList<>(50);
    public final Texture2D[] backObjectImage = new Texture2D[DataObject.objectImageResource.length];
    public final int[] mapEndDirection = new int[10];
    public final Texture2D[] backBaseImageArray = new Texture2D[tileBaseResource.length];
    public final Texture2D[] backTileOldImage;
    public final int[][] mapStartPosition = new int[10][2];
    public final int[][] mapEndPosition = new int[10][2];
    public final int[][] mapMoveData = new int[15][10];
    public final int[][] mapTileData = new int[15][10];

    /**
     * Loads a map based on its SID ((chapter * 10) + 10). Also the only way to make a DataMap.
     * @param SID Stage Index
     * @return Loaded map
     */
    public static DataMap loadMap(int SID) {
        int chap = SID / 10;
        if (current != null) {
            if (SID == current.SID)
                return current;
            if (chap != current.SID / 10)
                current.unload();
        } //Prevents unecessary overusage of resources by ridding of pointless loads

        byte[] mdata = null;
        try {
            InputStream openRawResource = GameThread.newTower.getResources().openRawResource(mapDataResource[SID]);
            int available = openRawResource.available();
            mdata = new byte[available];
            int ibit = 0;
            do {
                int read = openRawResource.read(mdata, ibit, available - ibit);
                if (read <= 0)
                    break;
                else
                    ibit += read;

            } while (ibit < available);
            openRawResource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        current = new DataMap(SID, mdata, current == null || chap != current.SID / 10);
        return current;
    }

    private DataMap(int stage, byte[] mdata, boolean relo) {
        SID = stage;
        int chap = SID / 10;
        lastShowBackBase = chap >= 5 || chap < 0 ? 0 : chap;

        if (relo) {
            backTileOldImage = backTileImages[lastShowBackBase];
            for (int i = 0; i < backTileOldImage.length; i++)
                backTileOldImage[i] = new Texture2D(tileTileResource[lastShowBackBase][i]);
            for (int i = 0; i < backObjectImage.length; i++)
                backObjectImage[i] = new Texture2D(DataObject.objectImageResource[i]);
            for (int i = 0; i < backBaseImageArray.length; i++)
                backBaseImageArray[i] = new Texture2D(tileBaseResource[lastShowBackBase]);
        } else {
            backTileOldImage = current.backTileOldImage;
            System.arraycopy(current.backObjectImage, 0, backObjectImage, 0, backObjectImage.length);
            System.arraycopy(current.backBaseImageArray, 0, backBaseImageArray, 0, backBaseImageArray.length);
        }

        for (int j = 0; j < 10; j++)
            for (int k = 0; k < 15; k++)
                mapTileData[k][j] = mdata[(j * 15) + k];
        for (int j = 0; j < 10; j++)
            for (int k = 0; k < 15; k++)
                mapMoveData[k][j] = mdata[(j * 15) + 150 + k];
        for (int j = 0; j < 10; j++)
            for (int k = 0; k < 15; k++) {
                int objp = (j * 15) + 300 + k;
                if (mdata[objp] != -1)
                    addObjectUnit(mdata[objp], k, j);
            }
        byte b = mdata[LOAD_MAP_START_COUNT];
        mapStartPositionCount = b;

        for (int sPos = 0; sPos < mapStartPositionCount; sPos++) {
            int pcor = (sPos * 2) + 451;
            mapStartPosition[sPos][0] = mdata[pcor];
            mapStartPosition[sPos][1] = mdata[pcor + 1];
        }

        for (int i = mapStartPositionCount - 1; i > 0; i--) {
            int j = i - 1;
            while (j >= 0) {
                int[][] iArr2 = mapStartPosition;
                if (iArr2[j][0] == iArr2[i][0] && iArr2[j][1] == iArr2[i][1]) {
                    mapStartPositionCount--;
                    break;
                }
                j--;
            }
        }
        for (int i15 = 0; i15 < mapStartPositionCount; i15++) {
            int[][] iArr4 = mapStartPosition;
            if ((mapMoveData[iArr4[i15][0]][iArr4[i15][1]] & 4) != 0) {
                addObjectUnit(207, iArr4[i15][0], iArr4[i15][1]);
            } else if ((mapMoveData[iArr4[i15][0]][iArr4[i15][1]] & 16) != 0) {
                addObjectUnit(200, iArr4[i15][0], iArr4[i15][1]);
            } else if ((mapMoveData[iArr4[i15][0]][iArr4[i15][1]] & 64) != 0) {
                addObjectUnit(201, iArr4[i15][0], iArr4[i15][1]);
            }
        }
        int i16 = b * 2;
        mapEndPositionCount = mdata[i16 + LOAD_MAP_START_COUNT + 1];
        for (int i17 = 0; i17 < mapEndPositionCount; i17++) {
            int[][] iArr5 = mapEndPosition;
            int i18 = i16 + 452 + (i17 * 2);
            iArr5[i17][0] = mdata[i18];
            iArr5[i17][1] = mdata[i18 + 1];
            int i19 = iArr5[i17][0] - 1;
            int i20 = iArr5[i17][1];
            if (i19 >= 0 && (mapMoveData[i19][i20] & 4) != 0) {
                addObjectUnit(203, iArr5[i17][0], iArr5[i17][1]);
                mapEndDirection[i17] = 203;
            } else {
                int[][] iArr6 = mapEndPosition;
                int i21 = iArr6[i17][0] + 1;
                int i22 = iArr6[i17][1];
                if (i21 < 15 && (mapMoveData[i21][i22] & 64) != 0) {
                    addObjectUnit(208, iArr6[i17][0], iArr6[i17][1]);
                    mapEndDirection[i17] = 208;
                } else {
                    int[][] iArr7 = mapEndPosition;
                    addObjectUnit(202, iArr7[i17][0], iArr7[i17][1] + 1);
                    mapEndDirection[i17] = 202;
                }
            }
        }
    }

    public void checkBackBase() {
        for (int i = 0; i < 5; i++)
            if (i != lastShowBackBase && backBaseImageArray[i].name != -1)
                backBaseImageArray[i].dealloc();

        if (backBaseImageArray[lastShowBackBase].name == -1)
            backBaseImageArray[lastShowBackBase].initWithImageName(tileBaseResource[lastShowBackBase]);
    }

    public void unload() {
        for (Texture2D img : backObjectImage)
            img.dealloc();
        for (Texture2D img : backBaseImageArray)
            img.dealloc();
        for (Texture2D img : backTileOldImage)
            img.dealloc();
    }

    public void addObjectUnit(int oType, int bX, int bY) {
        ObjectUnit obj = new ObjectUnit(oType, bX, bY);
        objectUnit.add(obj);
        defaultObjs.add(obj);
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
