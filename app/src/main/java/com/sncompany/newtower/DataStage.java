package com.sncompany.newtower;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;

import com.sncompany.newtower.DataClasses.ArrowUnit;
import com.sncompany.newtower.DataClasses.EnemyUnit;
import com.sncompany.newtower.DataClasses.ObjectUnit;
import com.sncompany.newtower.DataClasses.TowerUnit;

import java.util.ArrayList;

/**
 * Contains data for all stages, and the functions to play battles out
 */
/* loaded from: D:\decomp\classes.dex */
public class DataStage {
    static final int DATA_STAGE_HP_B = 3;
    static final int DATA_STAGE_HP_N = 2;
    static final int DATA_STAGE_START_MANA = 1;
    static final int DATA_STAGE_START_MONEY = 0;
    static final int DATA_STAGE_TOTAL_COUNT = 50;
    static final int DATA_STAGE_TYPE_COUNT = 4;
    static final float PERFECT_MULTIPLIER = 1.5f;
    static final int[][] stageData = {new int[]{700, 150, 150, 155}, new int[]{700, 150, 170, 181}, new int[]{700, 150, 180, 196}, new int[]{700, 150, 200, 222}, new int[]{1000, 200, 225, 252}, new int[]{1000, 200, 245, 278}, new int[]{1000, 200, 260, 298}, new int[]{1000, 200, GameRenderer.GAME_UPGRADE_UNIT_SKILL_START_X, 324}, new int[]{1000, 200, 300, 349}, new int[]{1000, 200, 350, 405}, new int[]{750, 150, 362, 422}, new int[]{750, 150, 383, 449}, new int[]{750, 150, 404, 475}, new int[]{1000, 200, 410, 487}, new int[]{1000, 200, 400, 482}, new int[]{1000, 200, 415, 503}, new int[]{1000, 200, 420, InputDeviceCompat.SOURCE_DPAD}, new int[]{1000, 200, 405, 504}, new int[]{1000, 200, 400, 504}, new int[]{1000, 200, 460, 570}, new int[]{Texture2D.SCRWIDTH_800, 150, 475, 590}, new int[]{1000, 200, Texture2D.SCRHEIGHT_480, 601}, new int[]{1000, 200, 490, 616}, new int[]{Texture2D.SCRWIDTH_800, 150, 500, 632}, new int[]{1000, 200, 500, 637}, new int[]{1000, 200, 510, 653}, new int[]{1000, 200, 520, 668}, new int[]{Texture2D.SCRWIDTH_800, 150, 530, 684}, new int[]{1000, 200, 570, 729}, new int[]{1200, 200, 620, 785}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 670, 840}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 665, 841}, new int[]{1050, 350, 685, 866}, new int[]{1050, 350, 690, 877}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 720, 912}, new int[]{1050, 350, 745, 943}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 770, 973}, new int[]{1250, 350, 810, PointerIconCompat.TYPE_ZOOM_OUT}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 840, 1054}, new int[]{1250, 350, 950, 1170}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 970, 1195}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 990, 1221}, new int[]{1050, 350, PointerIconCompat.TYPE_ALIAS, 1246}, new int[]{1050, 350, 1030, 1272}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 1050, 1297}, new int[]{1050, 350, 1070, 1323}, new int[]{1050, 350, 1090, 1348}, new int[]{1250, 350, 1110, 1374}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 1140, 1409}, new int[]{1250, 350, 1200, 1475}};

    public static final int maxLife = 20;

    public static ArrowUnit[] arrowUnit;
    public static ArrayList<EffectUnit> effectUnit = new ArrayList<>(100);

    public static ArrayList<MonsterUnit> monsterUnit = new ArrayList<>(50);
    public static ArrayList<ObjectUnit> objectUnit = new ArrayList<>(50);
    public static EnemyUnit selectedTarget;

    public static ArrayList<TowerUnit> towerUnit = new ArrayList<>(50);
    public static TowerUnit selectedUnit;

    public static int SID = 0, mapType = 0;
    public static int Life = maxLife;
    public static int Mana = 0, Money = 0, Wave = 0;
    public float bScore = 0.0f;

    public DataStage(int mapNumber, int type) {
        SID = mapNumber;
        mapType = type;
        Money = (DataStage.stageData[SID][DATA_STAGE_START_MONEY] * (getUpgradeUnitRate(0, 0) + 100)) / 100;
        int upgradeUnitRate = (DataStage.stageData[SID][DATA_STAGE_START_MANA] * (getUpgradeUnitRate(0, 1) + 100)) / 100;
        Mana = upgradeUnitRate;

        heroUnitType[0] = Config.rewardValues[0] ? 0 : -1;
        heroUnitType[1] = Config.rewardValues[2] ? 5 : -1;
        heroUnitType[2] = Config.rewardValues[4] ? 10 : -1;

        myWaveCount = 0;
        myWaveStartCount = 90;
        GameRenderer.upgradeCount = 0;
        GameRenderer.levelUpCount = 0;
        GameRenderer.specialBlinkCount = 0;
        GameRenderer.monsterGoalBlinkCount = 0;
        myWaveRunFlag = true;
        turboFlag = 1;
        monsterOpenTime = 0;
        tempCharacterRangeViewNumber = -1;
        setCurrentWave();
    }

    public static void reset() {
        selectedTarget = null;
        monsterUnit.clear();
        objectUnit.clear();

        selectedUnit = null;
        towerUnit.clear();

        Life = maxLife;
        Mana = Money = Wave = 0;
    }

    public static void addMonsterUnit(int type, boolean bossFlag) { //z is always false
        MonsterUnit nm = new MonsterUnit(type, bossFlag);
        monsterUnit.add(nm);

        int i7 = gatePattern;
        if (i7 == 0) {
            mapStartPositionLoop = 0;
        } else if (i7 == 1) {
            mapStartPositionLoop = 1;
        }
        nm.posX = ((mapStartPosition[mapStartPositionLoop][0] * 45) + 22) * 50;
        nm.posY = ((mapStartPosition[mapStartPositionLoop][1] * 45) + 22) * 50;
        nm.fromBlockX = mapStartPosition[mapStartPositionLoop][0];
        nm.fromBlockY = mapStartPosition[mapStartPositionLoop][1];
        int[][] iArr = mapStartPosition;
        int i8 = mapStartPositionLoop;
        int randomMapDirection = getRandomMapDirection(i3, iArr[i8][0], iArr[i8][1], -1);
        int i9 = mapStartPositionLoop + 1;
        mapStartPositionLoop = i9;
        if (i9 >= mapStartPositionCount) {
            mapStartPositionLoop = 0;
        }
        nm.direction = randomMapDirection;
        nm.targetBlockX = nm.fromBlockX + DIR_MOVE_POS[randomMapDirection][0];
        nm.targetBlockY = nm.fromBlockY + DIR_MOVE_POS[randomMapDirection][1];
    }

    public static void addEffectUnit(int effType, float x, float y) {
        EffectUnit efu = new EffectUnit(effType, (int) x, (int) y);
        efu.lastGameUpdateCount = gameTimeCount;
        effectUnit.add(efu);
    }

    public int getTotalScore() {
        int scr = (int)bScore;
        if (perfectClear())
            scr = (int) (scr + PERFECT_MULTIPLIER);

        scr += (maxLife * 1000);
        scr += (Money * 10);
        scr += (Mana * 30);

        int[][] iArr = highScoreValue;
        int[] iArr2 = iArr[SID];
        if (scr > iArr2[mapType])
            iArr[SID][mapType] = scr;

        return scr;
    }

    public static boolean perfectClear() {
        return Life == maxLife;
    }
}
