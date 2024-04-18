package com.sncompany.newtower.DataClasses;

import com.sncompany.newtower.Battle.ArrowUnit;
import com.sncompany.newtower.Battle.EnemyUnit;
import com.sncompany.newtower.Battle.HeroUnit;
import com.sncompany.newtower.Battle.ObjectUnit;
import com.sncompany.newtower.Battle.TowerUnit;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.Battle.EffectUnit;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Battle.MonsterUnit;
import com.sncompany.newtower.Pages.stage.StageBase;

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
    public static final int[][] stageData = {new int[]{700, 150, 150, 155}, new int[]{700, 150, 170, 181}, new int[]{700, 150, 180, 196}, new int[]{700, 150, 200, 222}, new int[]{1000, 200, 225, 252}, new int[]{1000, 200, 245, 278}, new int[]{1000, 200, 260, 298}, new int[]{1000, 200, 280, 324}, new int[]{1000, 200, 300, 349}, new int[]{1000, 200, 350, 405}, new int[]{750, 150, 362, 422}, new int[]{750, 150, 383, 449}, new int[]{750, 150, 404, 475}, new int[]{1000, 200, 410, 487}, new int[]{1000, 200, 400, 482}, new int[]{1000, 200, 415, 503}, new int[]{1000, 200, 420, 513}, new int[]{1000, 200, 405, 504}, new int[]{1000, 200, 400, 504}, new int[]{1000, 200, 460, 570}, new int[]{800, 150, 475, 590}, new int[]{1000, 200, 480, 601}, new int[]{1000, 200, 490, 616}, new int[]{800, 150, 500, 632}, new int[]{1000, 200, 500, 637}, new int[]{1000, 200, 510, 653}, new int[]{1000, 200, 520, 668}, new int[]{800, 150, 530, 684}, new int[]{1000, 200, 570, 729}, new int[]{1200, 200, 620, 785}, new int[]{900, 300, 670, 840}, new int[]{900, 300, 665, 841}, new int[]{1050, 350, 685, 866}, new int[]{1050, 350, 690, 877}, new int[]{900, 300, 720, 912}, new int[]{1050, 350, 745, 943}, new int[]{900, 300, 770, 973}, new int[]{1250, 350, 810, 1019}, new int[]{900, 300, 840, 1054}, new int[]{1250, 350, 950, 1170}, new int[]{900, 300, 970, 1195}, new int[]{900, 300, 990, 1221}, new int[]{1050, 350, 1010, 1246}, new int[]{1050, 350, 1030, 1272}, new int[]{900, 300, 1050, 1297}, new int[]{1050, 350, 1070, 1323}, new int[]{1050, 350, 1090, 1348}, new int[]{1250, 350, 1110, 1374}, new int[]{900, 300, 1140, 1409}, new int[]{1250, 350, 1200, 1475}};

    public static final int maxLife = 20;
    public static final boolean[] heroAvail = new boolean[3];

    public final ArrayList<ArrowUnit> arrowUnit = new ArrayList<>(100);
    public final ArrayList<EffectUnit> effectUnit = new ArrayList<>(100);

    public final ArrayList<MonsterUnit> monsterUnit = new ArrayList<>(50);
    public EnemyUnit selectedTarget;

    public final ArrayList<TowerUnit> towerUnit = new ArrayList<>(50);
    public TowerUnit selectedUnit;

    public final int SID, mapType;
    public int life = maxLife;
    public int mana, money;
    public final DataWave waveManager;
    public final DataMap map;
    public StageBase page;
    public byte turbo = 1;
    public float bScore = 0f, victoryH;

    public DataStage(DataMap m, int type) {
        SID = m.SID;
        mapType = type;
        money = DataStage.stageData[SID][DATA_STAGE_START_MONEY];
        mana = DataStage.stageData[SID][DATA_STAGE_START_MANA];

        GameRenderer.levelUpCount = 0;
        GameRenderer.monsterGoalBlinkCount = 0;
        map = m;
        waveManager = m.wav;

        if (mapType == 2)
            for (ObjectUnit o : map.objectUnit)
                if (o.type == 28 || o.type == 29 || o.type == 32) {
                    o.unitHP = DataWaveMob.DATA_WAVE_GATE_HP[SID] / map.mapStartPositionCount;
                    o.unitMaxHP = o.unitHP / map.mapStartPositionCount;
                    o.destroyEnableFlag = 0;
                }

        map.objectUnit.replaceAll(ori -> new ObjectUnit(this, ori)); //Albeit stupid, it's needed to update stage variable on objects
        setCurrentWave();
    }

    public int setCurrentWave() {
        monsterUnit.clear();
        if (selectedTarget instanceof MonsterUnit)
            selectedTarget = null;
        return waveManager.setWave();
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
        for (TowerUnit au : towerUnit)
            au.update();
    }

    public void updateArrowUnit() {
        arrowUnit.removeIf(a -> a.type == -1);
        for (ArrowUnit au : arrowUnit)
            au.updateArrowUnit();
    }

    public ArrowUnit addSpecialArrowUnit(int type, HeroUnit hero, int eX, int eY, int moveNum) {
        ArrowUnit arr = new ArrowUnit(type, hero, eX, eY, moveNum);
        arrowUnit.add(arr);
        return arr;
    }

    public void clearSpecialArrowUnit() {
        arrowUnit.removeIf(a -> a.type >= 15 && a.type <= 36);
    }

    public void setReverseSpecialIce() {
        for (ArrowUnit arrow : arrowUnit)
            if (arrow.type >= 19 && arrow.type <= 32) {
                arrow.moveCount = 1000;
                arrow.moveRotateDegree = (arrow.moveRotateDegree + 180) % 360;
            }
    }

    /**
     * Updates all monster positions
     * @return True if the monsters destroyed the player base
     */
    public boolean updateMonsterUnit() {
        monsterUnit.removeIf(m -> m.dead() && m.unitStatusCount >= 10);
        if (life == 0)
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

    public void updateEffects(boolean z) {
        effectUnit.removeIf(e -> e.effectCount >= e.effectCountMax);
        for (EffectUnit eff : effectUnit)
            if ((!z || (eff.effectType == 14 && eff.lastGameUpdateCount != GameThread.gameTimeCount)) && !(eff.lastGameUpdateCount == GameThread.gameTimeCount && eff.effectType == 36)) {
                eff.lastGameUpdateCount = GameThread.gameTimeCount;
                eff.effectCount++;
            }
    }

    public void updateNonMonster() {
        updateEffects(false);
        updateArrowUnit();
        updateTowerUnit();
        updateObjectUnit();
    }

    public void unlockUnit() {
        for (TowerUnit two : towerUnit)
            if (two.unitStatus == 2)
                two.unitStatus = 0;
    }

    public int getTotalScore() {
        int scr = (int)bScore;
        if (perfectClear())
            scr = (int) (scr + PERFECT_MULTIPLIER);

        scr += (maxLife * 1000);
        scr += (money * 10);
        scr += (mana * 30);

        if (scr > Config.highScores[SID][mapType])
            Config.highScores[SID][mapType] = scr;

        return scr;
    }

    public boolean perfectClear() {
        return life == maxLife;
    }

    public void sortEntities() {
        monsterUnit.sort(null);
        towerUnit.sort(null);
        map.objectUnit.sort(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TowerUnit addUnit(int type, int bX, int bY) {
        TowerUnit twu = new TowerUnit(this, type, bX, bY);
        twu.restatTowerUnit(false);
        towerUnit.add(twu);
        return twu;
    }

    public HeroUnit addHero(int type, int bX, int bY, boolean restat) {
        HeroUnit twu = new HeroUnit(this, type, bX, bY);
        if (restat)
            twu.restatTowerUnit(false);
        towerUnit.add(twu);
        return twu;
    }
}
