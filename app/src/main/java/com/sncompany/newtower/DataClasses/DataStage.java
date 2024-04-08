package com.sncompany.newtower.DataClasses;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;

import com.sncompany.newtower.Battle.ArrowUnit;
import com.sncompany.newtower.Battle.EnemyUnit;
import com.sncompany.newtower.Battle.ObjectUnit;
import com.sncompany.newtower.Battle.TowerUnit;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.Battle.EffectUnit;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Battle.MonsterUnit;
import com.sncompany.newtower.Texture2D;

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
    public static final int[][] stageData = {new int[]{700, 150, 150, 155}, new int[]{700, 150, 170, 181}, new int[]{700, 150, 180, 196}, new int[]{700, 150, 200, 222}, new int[]{1000, 200, 225, 252}, new int[]{1000, 200, 245, 278}, new int[]{1000, 200, 260, 298}, new int[]{1000, 200, GameRenderer.GAME_UPGRADE_UNIT_SKILL_START_X, 324}, new int[]{1000, 200, 300, 349}, new int[]{1000, 200, 350, 405}, new int[]{750, 150, 362, 422}, new int[]{750, 150, 383, 449}, new int[]{750, 150, 404, 475}, new int[]{1000, 200, 410, 487}, new int[]{1000, 200, 400, 482}, new int[]{1000, 200, 415, 503}, new int[]{1000, 200, 420, InputDeviceCompat.SOURCE_DPAD}, new int[]{1000, 200, 405, 504}, new int[]{1000, 200, 400, 504}, new int[]{1000, 200, 460, 570}, new int[]{Texture2D.SCRWIDTH_800, 150, 475, 590}, new int[]{1000, 200, Texture2D.SCRHEIGHT_480, 601}, new int[]{1000, 200, 490, 616}, new int[]{Texture2D.SCRWIDTH_800, 150, 500, 632}, new int[]{1000, 200, 500, 637}, new int[]{1000, 200, 510, 653}, new int[]{1000, 200, 520, 668}, new int[]{Texture2D.SCRWIDTH_800, 150, 530, 684}, new int[]{1000, 200, 570, 729}, new int[]{1200, 200, 620, 785}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 670, 840}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 665, 841}, new int[]{1050, 350, 685, 866}, new int[]{1050, 350, 690, 877}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 720, 912}, new int[]{1050, 350, 745, 943}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 770, 973}, new int[]{1250, 350, 810, PointerIconCompat.TYPE_ZOOM_OUT}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 840, 1054}, new int[]{1250, 350, 950, 1170}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 970, 1195}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 990, 1221}, new int[]{1050, 350, PointerIconCompat.TYPE_ALIAS, 1246}, new int[]{1050, 350, 1030, 1272}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 1050, 1297}, new int[]{1050, 350, 1070, 1323}, new int[]{1050, 350, 1090, 1348}, new int[]{1250, 350, 1110, 1374}, new int[]{GameThread.FREE_REWARD_MOVIE_TIME, 300, 1140, 1409}, new int[]{1250, 350, 1200, 1475}};

    public static final int maxLife = 20;

    public static DataStage instance;
    public static final boolean[] heroAvail = new boolean[3];

    public final ArrayList<ArrowUnit> arrowUnit = new ArrayList<>(100);
    public final ArrayList<EffectUnit> effectUnit = new ArrayList<>(100);

    public ArrayList<MonsterUnit> monsterUnit = new ArrayList<>(50);
    public ArrayList<ObjectUnit> objectUnit = new ArrayList<>(50); //Depreacted, objectUnit has been moved to DataMap
    public EnemyUnit selectedTarget;

    public ArrayList<TowerUnit> towerUnit = new ArrayList<>(50);
    public TowerUnit selectedUnit;

    public final int SID, mapType;
    public static int Life = maxLife;
    public static int Mana = 0, Money = 0, Wave = 0;
    public DataWave waveManager;
    public DataMap map;
    public byte turbo = 1;
    public float bScore = 0.0f, victoryH;

    public DataStage(int mapNumber, int type) {
        SID = mapNumber;
        mapType = type;
        instance = this;
        Money = (DataStage.stageData[SID][DATA_STAGE_START_MONEY] * (getUpgradeUnitRate(0, 0) + 100)) / 100;
        Mana = (DataStage.stageData[SID][DATA_STAGE_START_MANA] * (getUpgradeUnitRate(0, 1) + 100)) / 100;

        heroAvail[0] = Config.rewardValues[0];
        heroAvail[1] = Config.rewardValues[2];
        heroAvail[2] = Config.rewardValues[4];

        GameRenderer.upgradeCount = 0;
        GameRenderer.levelUpCount = 0;
        GameRenderer.specialBlinkCount = 0;
        GameRenderer.monsterGoalBlinkCount = 0;
        tempCharacterRangeViewNumber = -1;
        waveManager = new DataWave();
        setCurrentWave();
    }

    public int setCurrentWave() {
        monsterUnit.clear();
        if (selectedTarget instanceof MonsterUnit)
            selectedTarget = null;
        waveManager.setWave();
        return 2;
    }

    public boolean checkTowerPos(int i, int i2, int i3) {
        int i4 = ((i2 * 45) + 22) * 50;
        int i5 = ((i3 * 45) + 22) * 50;
        for (TowerUnit tow : towerUnit)
            if (tow.towerType == i && i4 == tow.posX && i5 == tow.posY)
                return true;
        return false;
    }

    public void addMonsterUnit(int type, boolean bossFlag) {
        MonsterUnit nm = new MonsterUnit(type, bossFlag);
        monsterUnit.add(nm);

        int i7 = map.gatePattern;
        if (i7 == 0) { //switch to bool
            map.mapStartPositionLoop = 0;
        } else if (i7 == 1) {
            map.mapStartPositionLoop = 1;
        }
        nm.posX = ((map.mapStartPosition[map.mapStartPositionLoop][0] * 45) + 22) * 50;
        nm.posY = ((map.mapStartPosition[map.mapStartPositionLoop][1] * 45) + 22) * 50;
        nm.fromBlockX = map.mapStartPosition[map.mapStartPositionLoop][0];
        nm.fromBlockY = map.mapStartPosition[map.mapStartPositionLoop][1];
        int[][] iArr = map.mapStartPosition;
        int i8 = map.mapStartPositionLoop;
        int randomMapDirection = map.getRandomMapDirection(iArr[i8][0], iArr[i8][1], -1);
        map.mapStartPositionLoop++;
        if (map.mapStartPositionLoop >= map.mapStartPositionCount) {
            map.mapStartPositionLoop = 0;
        }
        nm.direction = randomMapDirection;
        nm.targetBlockX = nm.fromBlockX + DIR_MOVE_POS[randomMapDirection][0];
        nm.targetBlockY = nm.fromBlockY + DIR_MOVE_POS[randomMapDirection][1];
    }
    public void addEffectUnit(int effType, float x, float y) {
        EffectUnit efu = new EffectUnit(effType, (int) x, (int) y);
        efu.lastGameUpdateCount = gameTimeCount;
        effectUnit.add(efu);
    }

    public void updateTowerUnit() {
        towerUnit.removeIf(u -> u.towerType == -1);
        for (TowerUnit au : towerUnit)
            au.updateTowerUnit();
    }

    public void updateArrowUnit() {
        arrowUnit.removeIf(a -> a.arrowType == -1);
        for (ArrowUnit au : arrowUnit)
            au.updateArrowUnit();
    }

    /**
     * Updates all monster positions
     * @return True if the monsters destroyed the player base
     */
    public boolean updateMonsterUnit() {
        monsterUnit.removeIf(m -> m.dead() && m.unitStatusCount >= 10);
        for (MonsterUnit m : monsterUnit)
            if (m.update())
                return true;
        return false;
    }

    public void updateObjectUnit() {
        objectUnit.removeIf(o -> o.type == -1);
        for (ObjectUnit o : objectUnit)
            o.update();
    }

    public void updateEffectUnit(boolean z) {
        effectUnit.removeIf(e -> e.effectCount >= e.effectCountMax);
        for (EffectUnit eff : effectUnit)
            if ((!z || (eff.effectType == 14 && eff.lastGameUpdateCount != gameTimeCount)) && !(eff.lastGameUpdateCount == gameTimeCount && eff.effectType == 36)) {
                eff.lastGameUpdateCount = gameTimeCount;
                eff.effectCount++;
            }
    }

    public void unlockTowerUnit() {
        for (int i = 0; i < towerUnitCount; i++)
            if (towerUnit[i].towerType != -1 && towerUnit[i].unitStatus == 2)
                towerUnit[i].unitStatus = 0;
    }

    public int getTotalScore() {
        int scr = (int)bScore;
        if (perfectClear())
            scr = (int) (scr + PERFECT_MULTIPLIER);

        scr += (maxLife * 1000);
        scr += (Money * 10);
        scr += (Mana * 30);

        if (scr > Config.highScores[SID][mapType])
            Config.highScores[SID][mapType] = scr;

        return scr;
    }

    public static boolean perfectClear() {
        return Life == maxLife;
    }

    public void sortTowerEnemyUnit() {
        monsterUnit.sort(null);
        towerUnit.sort(null);
        objectUnit.sort(null);
    }
}
