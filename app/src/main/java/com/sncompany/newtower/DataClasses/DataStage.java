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

    public final ArrayList<MonsterUnit> monsterUnit = new ArrayList<>(50);
    public EnemyUnit selectedTarget;

    public final ArrayList<TowerUnit> towerUnit = new ArrayList<>(50);
    public TowerUnit selectedUnit;

    public final int SID, mapType;
    public int Life = maxLife;
    public int Mana, Money;
    public final DataWave waveManager;
    public final DataMap map;
    public byte turbo = 1;
    public float bScore = 0.0f, victoryH;

    public DataStage(DataMap m, int type) {
        SID = m.SID;
        mapType = type;
        Money = (DataStage.stageData[SID][DATA_STAGE_START_MONEY] * (getUpgradeUnitRate(0, 0) + 100)) / 100;
        Mana = (DataStage.stageData[SID][DATA_STAGE_START_MANA] * (getUpgradeUnitRate(0, 1) + 100)) / 100;

        GameRenderer.upgradeCount = 0;
        GameRenderer.levelUpCount = 0;
        GameRenderer.specialBlinkCount = 0;
        GameRenderer.monsterGoalBlinkCount = 0;
        map = m;
        waveManager = m.wav;

        if (mapType == 2)
            for (ObjectUnit o : map.objectUnit)
                if (o.objectType == 28 || o.objectType == 29 || o.objectType == 32) {
                    o.unitHP = DataWaveMob.DATA_WAVE_GATE_HP[SID] / map.mapStartPositionCount;
                    o.unitMaxHP = o.unitHP / map.mapStartPositionCount;
                    o.destroyEnableFlag = 0;
                }
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
        map.mapStartPositionLoop = map.gatePattern;
        MonsterUnit nm = new MonsterUnit(this, type, bossFlag);
        monsterUnit.add(nm);

        map.mapStartPositionLoop = (map.mapStartPositionLoop + 1) % map.mapStartPositionCount;
    }
    public void addEffectUnit(int effType, float x, float y) {
        EffectUnit efu = new EffectUnit(effType, (int) x, (int) y);
        efu.lastGameUpdateCount = GameThread.gameTimeCount;
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
        if (Life == 0)
            return false;

        for (MonsterUnit m : monsterUnit)
            if (m.update())
                return true;
        return false;
    }

    public void updateObjectUnit() {
        map.objectUnit.removeIf(o -> o.type == -1);
        for (ObjectUnit o : map.objectUnit)
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
        for (TowerUnit two : towerUnit)
            if (two.unitStatus == 2)
                two.unitStatus = 0;
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

    public boolean perfectClear() {
        return Life == maxLife;
    }

    public void sortTowerEnemyUnit() {
        monsterUnit.sort(null);
        towerUnit.sort(null);
        map.objectUnit.sort(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int addTowerUnit(int i, int i2, int i3, boolean z) {
        int i4;
        if (z) {
            i4 = 0;
            while (i4 < towerUnitCount) {
                if (towerUnit[i4].towerType == -1) {
                    break;
                }
                i4++;
            }
        }
        i4 = -1;
        if (i4 == -1 && towerUnitCount == 149) {
            return -1;
        }
        if (i4 == -1) {
            i4 = towerUnitCount;
            towerUnit[i4].towerType = -1;
            towerUnitCount++;
        }
        towerUnit[i4].heroFlag = false;
        towerUnit[i4].towerType = i;
        towerUnit[i4].unitStatus = 2;
        towerUnit[i4].unitStatusCount = 0;
        towerUnit[i4].lastViewDirection = 6;
        towerUnit[i4].blockX = i2;
        towerUnit[i4].blockY = i3;
        towerUnit[i4].posX = ((i2 * 45) + 22) * 50;
        towerUnit[i4].posY = ((i3 * 45) + 22) * 50;
        towerUnit[i4].originalPosX = towerUnit[i4].posX;
        towerUnit[i4].originalPosY = towerUnit[i4].posY;
        towerUnit[i4].attackCount = 0;
        restatTowerUnit(towerUnit[i4]);
        towerUnit[i4].headRotateDegree = 0.0f;
        return i4;
    }

    public static int addHeroTowerUnit(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5;
        if (z) {
            i5 = 0;
            while (i5 < towerUnitCount) {
                if (towerUnit[i5].towerType == -1) {
                    break;
                }
                i5++;
            }
        }
        i5 = -1;
        if (i5 == -1 && towerUnitCount == 149) {
            return -1;
        }
        if (i5 == -1) {
            i5 = towerUnitCount;
            towerUnitCount = i5 + 1;
        }
        towerUnit[i5].heroFlag = true;
        towerUnit[i5].heroOrder = i2;
        towerUnit[i5].towerType = i;
        towerUnit[i5].unitStatus = 2;
        towerUnit[i5].unitStatusCount = 0;
        towerUnit[i5].lastViewDirection = 6;
        towerUnit[i5].blockX = i3;
        towerUnit[i5].blockY = i4;
        towerUnit[i5].posX = ((i3 * 45) + 22) * 50;
        towerUnit[i5].posY = ((i4 * 45) + 22) * 50;
        TowerUnit[] towerUnitArr = towerUnit;
        towerUnitArr[i5].originalPosX = towerUnitArr[i5].posX;
        TowerUnit[] towerUnitArr2 = towerUnit;
        towerUnitArr2[i5].originalPosY = towerUnitArr2[i5].posY;
        towerUnit[i5].specialCooltime = 0;
        towerUnit[i5].specialShowCount = 0;
        towerUnit[i5].attackCount = 0;
        if (z2) {
            restatTowerUnit(towerUnit[i5]);
        }
        towerUnit[i5].headRotateDegree = 0.0f;
        return i5;
    }
}
