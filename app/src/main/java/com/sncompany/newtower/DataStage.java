package com.sncompany.newtower;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;

import com.sncompany.newtower.DataClasses.ArrowUnit;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataMap;
import com.sncompany.newtower.DataClasses.EnemyUnit;
import com.sncompany.newtower.DataClasses.ObjectUnit;
import com.sncompany.newtower.DataClasses.HeroUnit;
import com.sncompany.newtower.DataClasses.TowerUnit;

import java.lang.reflect.Array;
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

    public static ArrayList<MonsterUnit> monsterUnit = new ArrayList<>(50);
    public static ArrayList<ObjectUnit> objectUnit = new ArrayList<>(50); //Depreacted, objectUnit has been moved to DataMap
    public static EnemyUnit selectedTarget;

    public static ArrayList<TowerUnit> towerUnit = new ArrayList<>(50);
    public static TowerUnit selectedUnit;

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

    public void reset() {
        selectedTarget = null;
        monsterUnit.clear();
        objectUnit.clear();

        selectedUnit = null;
        towerUnit.clear();

        Life = maxLife;
        Mana = Money = Wave = 0;
    }

    public void update_GAME_STAGE_START_VIEW() {
        myOscillator[11].updatePosition();
        sortTowerEnemyUnit();
        if (GameRenderer.startViewCount != 15) {
            GameRenderer.startViewCount++;
            if (GameRenderer.startViewCount >= 35) {
                gameStatus = 25;
            }
        }
        newTower.HideAdMob();
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x005f, code lost:

        if (com.sncompany.newtower.GameThread.myWaveRunFlag != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0061, code lost:

        r2 = com.sncompany.newtower.GameThread.specialAttackFrameCount + 1;
        com.sncompany.newtower.GameThread.specialAttackFrameCount = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0068, code lost:

        if (com.sncompany.newtower.GameThread.specialAttackSkipFlag != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x006a, code lost:

        if (r2 != 60) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x006c, code lost:

        playSound(18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0075, code lost:

        if (com.sncompany.newtower.GameThread.specialAttackFrameCount != 135) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0077, code lost:

        setReverseSpecialIce();
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x007a, code lost:

        updateEffectUnit(false);
        updateArrowUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0084, code lost:

        if (com.sncompany.newtower.GameThread.specialAttackFrameCount < 170) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0086, code lost:

        clearSpecialArrowUnit();
        hitSpecialIceAttack();
        com.sncompany.newtower.GameRenderer.specialBlinkCount = 10;
        com.sncompany.newtower.GameThread.characterMenuSelectFlag = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0094, code lost:

        if (com.sncompany.newtower.GameThread.cheatData[4] != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0096, code lost:

        r2 = com.sncompany.newtower.GameThread.towerUnit;
        r17 = com.sncompany.newtower.GameThread.characterSelectNumber;
        r2[r17].specialCooltime = r2[r17].specialMaxCooltime;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x00a4, code lost:

        if (com.sncompany.newtower.GameThread.specialAttackSkipFlag == false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x00a8, code lost:

        if (com.sncompany.newtower.GameThread.specialAttackFrameCount < 170) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x00f5, code lost:

        if (com.sncompany.newtower.GameThread.myWaveRunFlag != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x00f7, code lost:

        r2 = com.sncompany.newtower.GameThread.specialAttackFrameCount + 1;
        com.sncompany.newtower.GameThread.specialAttackFrameCount = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x00fe, code lost:

        if (com.sncompany.newtower.GameThread.specialAttackSkipFlag != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0102, code lost:

        if (r2 != 65) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0104, code lost:

        playSound(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0107, code lost:

        updateEffectUnit(false);
        updateArrowUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0111, code lost:

        if (com.sncompany.newtower.GameThread.specialAttackFrameCount < 150) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0113, code lost:

        clearSpecialArrowUnit();
        hitSpecialBladeAttack();
        com.sncompany.newtower.GameRenderer.specialBlinkCount = 10;
        com.sncompany.newtower.GameThread.characterMenuSelectFlag = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0121, code lost:

        if (com.sncompany.newtower.GameThread.cheatData[4] != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0123, code lost:

        r2 = com.sncompany.newtower.GameThread.towerUnit;
        r7 = com.sncompany.newtower.GameThread.characterSelectNumber;
        r2[r7].specialCooltime = r2[r7].specialMaxCooltime;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0131, code lost:

        if (com.sncompany.newtower.GameThread.specialAttackSkipFlag == false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0135, code lost:

        if (com.sncompany.newtower.GameThread.specialAttackFrameCount < 150) goto L331;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update_GAME_PLAYING() {
        for (int i = 0; i < 11; i++)
            myOscillator[i].updatePosition();

        if (GameRenderer.upgradeCount > 0)
            GameRenderer.upgradeCount--;
        if (GameRenderer.levelUpCount > 0)
            GameRenderer.levelUpCount--;
        if (GameRenderer.specialBlinkCount > 0)
            GameRenderer.specialBlinkCount--;
        if (GameRenderer.monsterGoalBlinkCount > 0)
            GameRenderer.monsterGoalBlinkCount--;

        if (waveManager.monsterOpenTime > 0)
            waveManager.monsterOpenTime--;

        switch (characterMenuSelectFlag) {
            case 2:
            case 5:
            case 6:
            case 12:
            case 13:
                int spd = Math.max(turbo, 1);
                for (int i = 0; i < spd; i++) {
                    updateEffectUnit(true);
                }
                break;
            case 3:
            case 4:
            case 7:
            case 11:
            default:
                if (waveManager.waveRunF) {
                    if (waveManager.waveStartT > 0) {
                        for (int i6 = 0; i6 < turbo; i6++) {
                            if (--waveManager.waveStartT == 0) {
                                if (waveManager.wavePattern == 3) {
                                    characterMenuMonsterViewCount = 100;
                                    characterMenuMonsterStartViewCount = 0;
                                    playSound(20);
                                } else {
                                    characterMenuMonsterViewCount = 60;
                                    characterMenuMonsterStartViewCount = 0;
                                }
                            }
                            updateEffectUnit(false);
                            updateArrowUnit();
                            updateTowerUnit();
                            updateObjectUnit();
                        }
                    } else {
                        int i8 = characterMenuMonsterViewCount;
                        if (i8 > 0) {
                            characterMenuMonsterViewCount = i8 - 1;
                            characterMenuMonsterStartViewCount++;
                            for (int i9 = 0; i9 < turbo; i9++) {
                                updateEffectUnit(false);
                                updateArrowUnit();
                                updateTowerUnit();
                                updateObjectUnit();
                            }
                        } else {
                            for (int i10 = 0; i10 < turbo; i10++) {
                                waveManager.monsterWaveUpdate();
                                updateEffectUnit(false);
                                updateArrowUnit();
                                if (updateMonsterUnit()) {
                                    sortTowerEnemyUnit();
                                    gameStatus = 23;
                                    GameRenderer.startViewCount = 0;
                                    gameSubStatus = 0;
                                    stopLoopSound(2);
                                    playSound(11);
                                    if (mapType == 0) {
                                        victoryH = (myWave * 8) + (myLife * 10);
                                    } else if (mapType == 1) {
                                        getTotalScore();
                                        victoryH = waveManager.current * 15;
                                    } else if (mapType == 2) {
                                        victoryH = (float)(((DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[SID] - waveManager.current) * 8) * (SID + 15)) / 15;
                                    }
                                    if (gameClearedFlag[mapNumber][0] >= 0) {
                                        victoryH = (victoryH * 7) / 10;
                                    }
                                    victoryH = 50;
                                    Config.heroPoints += (int)victoryH;
                                    Config.saveAll(newTower);
                                    myOscillator[11].initWithTwoWayStartPosition(-350, 0, 15, 30, 10);
                                    return;
                                }
                                updateTowerUnit();
                                updateObjectUnit();
                            }
                        }
                    }
                    unlockTowerUnit();
                    break;
                }
                break;
            case 8:
                break;
            case 9:
                if (waveManager.waveRunF) {
                    while (true) {
                        int i13 = specialAttackFrameCount + 1;
                        specialAttackFrameCount = i13;
                        if (!specialAttackSkipFlag && i13 == 60) {
                            playSound(i);
                        }
                        updateEffectUnit(false);
                        updateArrowUnit();
                        if (specialAttackFrameCount >= 195) {
                            clearSpecialArrowUnit();
                            hitSpecialArrowAttack();
                            GameRenderer.specialBlinkCount = 10;
                            characterMenuSelectFlag = 0;
                            if (!cheatData[4]) {
                                TowerUnit[] towerUnitArr = towerUnit;
                                int i14 = characterSelectNumber;
                                towerUnitArr[i14].specialCooltime = towerUnitArr[i14].specialMaxCooltime;
                            }
                        }
                        i = (specialAttackSkipFlag && specialAttackFrameCount < 195) ? 17 : 17;
                    }
                }
                break;
            case 10:
                break;
        }
        sortTowerEnemyUnit();
        int checkWaveAndFinishCheck = waveManager.checkWaveAndFinishCheck();
        if (checkWaveAndFinishCheck != 1) {
            if (checkWaveAndFinishCheck != 3) {
                return;
            }
            sortTowerEnemyUnit();
            gameStatus = 23;
            GameRenderer.startViewCount = 0;
            gameSubStatus = 0;
            stopLoopSound(2);
            playSound(11);
            setClearPointAndHighscore();
            if (mapType == 0)
                victoryH = (waveManager.current * 8) + (Life * 10);
            else if (mapType == 1)
                victoryH = waveManager.current * 15;
            else if (mapType == 2)
                victoryH = waveManager.current * 5;
            if (perfectClear())
                victoryH *= 2;

            Config.heroPoints += victoryH;
            Config.saveAll(newTower);
            myOscillator[11].initWithTwoWayStartPosition(-350, 0, 15, 30, 10);
            return;
        }
        stopLoopSound(2);
        playSound(10);

        if (SID + 1 < 50)
            Config.stageProg[SID + 1][0] = 0;
        if (perfectClear())
            Config.stageProg[SID][mapType] = 2;
        else {
            if (Life == 1)
                Config.awardValues[DataAward.AWARD_Narrowly_Victory] = true;
            Config.stageProg[SID][mapType] = 1;
        }

        int wus = 0;
        boolean archerOnly = true, mageOnly = true;
        for (TowerUnit twr : towerUnit) {
            if (twr.attackCount == 0)
                Config.awardValues[DataAward.AWARD_Surplus] = true;
            if (!(twr instanceof HeroUnit)) {
                wus |= 1 << twr.towerType / 3;
                archerOnly &= twr.towerType >= 12 && twr.towerType <= 23; //temp, replace with twr instanceof Archer
                mageOnly &= twr.towerType >= 24;
            }
        }
        if (wus == 4095)
            Config.awardValues[DataAward.AWARD_Full_Party] = true;
        else if (wus < 16)
            Config.awardValues[DataAward.AWARD_Warriors_March] = true;
        else if (archerOnly)
            Config.awardValues[DataAward.AWARD_Snipers_Toast] = true;
        else if (mageOnly)
            Config.awardValues[DataAward.AWARD_Mages_Rally] = true;

        int scr = getTotalScore();
        if (mapType == 0) {
            victoryH = (SID * 20) + 50 + (DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[SID] * 8) + (Life * 10);
        } else if (mapType == 1) {
            victoryH = 0;
        } else if (mapType == 2) {
            victoryH = (SID * 10) + (waveManager.current * 8) + (Life * 3);
        }
        victoryH = 100;
        Config.heroPoints += 100;

        rewardShowOrder = -1;
        int[] srds = new int[]{0, 14, 9, 4, 24, 19, 29, 34, 39, 44};
        for (int i = 0; i < srds.length; i++)
            if (SID == srds[i] && !Config.rewardValues[i]) {
                Config.rewardValues[i] = true;
                rewardShowOrder = i;
                switch (i) {
                    case 9:
                        Config.heroPoints += 1500;
                    case 7:
                        Config.heroPoints += 500;
                    case 1:
                        Config.heroPoints += 1500;
                        break;
                    case 0:
                    case 2:
                    case 4:
                        heroAvail[i / 2] = true;
                        break;
                    case 8:
                        getItem(15);
                        break;
                }
            }
        DataAward.clear_award(SID);

        Config.saveAll(newTower);
        gameStatus = 22;
        gameSubStatus = 0;
        myOscillator[11].initWithTwoWayStartPosition(-150, 0, 15, 30, 10);
        myOscillator[12].initWithTwoWayStartPosition(300, 0, 30, -50, 10);
        myOscillator[13].initWithTwoWayStartPosition(300, 0, 30, -50, 10);
        myOscillator[14].initWithTwoWayStartPosition(300, 0, 30, -50, 10);
        myOscillator[15].initWithTwoWayStartPosition(300, 0, 30, -50, 10);
        myOscillator[16].initWithTwoWayStartPosition(300, 0, 30, -50, 10);
        myOscillator[17].initWithTwoWayStartPosition(300, 0, 30, -50, 10);
        myOscillator[18].initWithTwoWayStartPosition(300, 0, 30, -50, 10);
        myOscillator[19].initWithTwoWayStartPosition(300, 0, 30, -50, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update_GAME_STAGE_CLEAR() {
        boolean z;
        int i;
        boolean z2 = false;
        updateEffectUnit(false);
        rewindTowerEnemyUnit();
        int i2 = gameSubStatus;
        if (i2 == 0) {
            myOscillator[11].updatePosition();
            return;
        }
        if (i2 == 1) {
            if (GameRenderer.startViewCount == 40 || GameRenderer.startViewCount == 70 || GameRenderer.startViewCount == 100 || GameRenderer.startViewCount == 130 || GameRenderer.startViewCount == 160 || GameRenderer.startViewCount == 190 || GameRenderer.startViewCount == 220 || GameRenderer.startViewCount == 250) {
                playSound(1);
            }
            GameRenderer.startViewCount++;
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                GameRenderer.darkViewCount++;
                if (GameRenderer.darkViewCount >= 198) {
                    gameSubStatus = 1;
                    return;
                }
                return;
            }
            if (i2 != 5) {
                return;
            }
            myOscillator[12].updatePosition();
            boolean z3 = myOscillator[12].OscCurrentCount >= 5;
            if (z3) {
                myOscillator[13].updatePosition();
                z3 = myOscillator[13].OscCurrentCount >= 5;
            }
            if (z3) {
                myOscillator[14].updatePosition();
                z3 = myOscillator[14].OscCurrentCount >= 5;
            }
            if (z3) {
                myOscillator[15].updatePosition();
                z3 = myOscillator[15].OscCurrentCount >= 5;
            }
            if (z3) {
                myOscillator[16].updatePosition();
                z3 = myOscillator[16].OscCurrentCount >= 5;
            }
            if (z3) {
                myOscillator[17].updatePosition();
                z3 = myOscillator[17].OscCurrentCount >= 5;
            }
            if (z3) {
                myOscillator[18].updatePosition();
                z3 = myOscillator[18].OscCurrentCount >= 5;
            }
            if (z3) {
                myOscillator[19].updatePosition();
                int i3 = myOscillator[19].OscCurrentCount;
            }
            if (myOscillator[19].OscCurrentCount >= 60) {
                if (rewardShowFlag) {
                    gameSubStatus = 4;
                    return;
                }
                int i4 = mapNumber;
                if (i4 % 10 == 9 && i4 != 49) {
                    GameRenderer.darkViewCount = 0;
                    gameSubStatus = 3;
                } else {
                    gameSubStatus = 1;
                }
                return;
            }
            return;
        }
        GameRenderer.darkViewCount++;
        if (GameRenderer.darkViewCount >= 45) {
            int i5 = GameRenderer.titlePressed;
            if (i5 == 0) {
                int i6 = mapNumber;
                if (i6 < 49) {
                    int i7 = mapAttackType;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            z = false;
                        }
                        if (!z) {
                            int i8 = mapNumber + 1;
                            i = i8 < 50 ? i8 : 49;
                            int i9 = i / 10;
                            stageSelectChapterNumber = i9;
                            int i10 = i % 10;
                            stageSelectStageNumber = i10;
                            lastPlayedMapNumber = (i9 * 10) + i10;
                        } else {
                            int i11 = mapNumber;
                            int i12 = i11 / 10;
                            stageSelectChapterNumber = i12;
                            int i13 = i11 % 10;
                            stageSelectStageNumber = i13;
                            lastPlayedMapNumber = (i12 * 10) + i13;
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
                GameRenderer.loadCount_GAME_MENU_IMAGE_LOAD = 0;
                gameStatus = 11;
                gameLoadFlag = 0;
                loadingStatus = 1006;
                loadTipNumber = getRandom(TIP_TEXT.length);
                GameRenderer.loadingViewType = getRandom(6);
                return;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    return;
                }
                gameStatus = 10;
                gameSubStatus = 0;
                GameRenderer.startViewCount = 0;
                int i14 = mapNumber + 1;
                i = i14 < 50 ? i14 : 49;
                int i15 = i / 10;
                stageSelectChapterNumber = i15;
                int i16 = i % 10;
                stageSelectStageNumber = i16;
                mapAttackType = 0;
                loadMap((i15 * 10) + i16, true);
                playLoopSound(1);
                return;
            }
            int i17 = mapNumber;
            if (i17 < 49) {
                int i18 = mapAttackType;
                if (i18 == 0 || (i18 == 1 ? gamePlayedCount[i17 + 1][1] != -1 : !(i18 != 2 || gamePlayedCount[i17 + 1][2] == -1))) {
                    z2 = true;
                }
                if (z2) {
                    playSound(14);
                    int i19 = mapNumber + 1;
                    i = i19 < 50 ? i19 : 49;
                    stageSelectChapterNumber = i / 10;
                    stageSelectStageNumber = i % 10;
                    gameStatus = 24;
                    return;
                }
                int i20 = mapNumber;
                stageSelectChapterNumber = i20 / 10;
                stageSelectStageNumber = i20 % 10;
                gameStatus = 10;
            }
        }
    }

    public void update_GAME_OVER() {
        updateEffectUnit(false);
        rewindTowerEnemyUnit();
        int i = gameSubStatus;
        if (i == 0) {
            if (GameRenderer.startViewCount < 70) {
                GameRenderer.startViewCount++;
            }
            if (GameRenderer.startViewCount >= 70) {
                myOscillator[11].updatePosition();
                return;
            }
            return;
        }
        if (i == 1) {
            if (GameRenderer.startViewCount == 30 || GameRenderer.startViewCount == 60 || GameRenderer.startViewCount == 90 || GameRenderer.startViewCount == 120 || GameRenderer.startViewCount == 150 || GameRenderer.startViewCount == 180 || GameRenderer.startViewCount == 210 || GameRenderer.startViewCount == 240) {
                playSound(1);
            }
            GameRenderer.startViewCount++;
            return;
        }
        if (i != 2) {
            return;
        }
        GameRenderer.darkViewCount++;
        if (GameRenderer.darkViewCount >= 45) {
            int i2 = GameRenderer.titlePressed;
            if (i2 == 0) {
                GameRenderer.loadCount_GAME_MENU_IMAGE_LOAD = 0;
                gameStatus = 12;
                upgradeUnitSelectPos = 0;
                gameLoadFlag = 0;
                loadingStatus = 1006;
                loadTipNumber = getRandom(TIP_TEXT.length);
                GameRenderer.loadingViewType = getRandom(6);
                return;
            }
            if (i2 == 1) {
                playSound(14);
                gameStatus = 24;
                return;
            }
            if (i2 != 2) {
                return;
            }
            gameStatus = 10;
            gameSubStatus = 0;
            GameRenderer.startViewCount = 0;
            int i3 = mapNumber;
            int i4 = i3 / 10;
            stageSelectChapterNumber = i4;
            int i5 = i3 % 10;
            stageSelectStageNumber = i5;
            mapAttackType = 0;
            loadMap((i4 * 10) + i5, true);
            playLoopSound(1);
        }
    }

    public void update_GAME_TUTORIAL() {
        int i;
        for (int i2 = 0; i2 < 11; i2++) {
            myOscillator[i2].updatePosition();
        }
        sortTowerEnemyUnit();
        for (int i3 = 0; i3 < 22; i3++) {
            int[] iArr = tutorialBoxTouchFlag;
            if (iArr[i3] > 0 && iArr[i3] < 10) {
                iArr[i3] = iArr[i3] + 1;
            }
        }
        int i4 = gameSubStatus;
        char c = 2;
        if (i4 == 1) {
            int[] iArr2 = tutorialBoxTouchFlag;
            if (iArr2[0] == 10 && iArr2[1] == 10 && iArr2[2] == 10 && iArr2[3] == 10 && iArr2[4] == 10) {
                gameSubStatus = 2;
                return;
            }
            return;
        }
        if (i4 == 2) {
            int[] iArr3 = tutorialBoxTouchFlag;
            if (iArr3[5] == 10 && iArr3[6] == 10 && iArr3[7] == 10) {
                gameSubStatus = 3;
                tutorialViewCount = 0;
                characterMenuSelectFlag = 0;
                return;
            }
            return;
        }
        if (i4 == 3 || i4 == 5 || i4 == 7 || i4 == 9 || i4 == 11 || i4 == 13 || i4 == 15) {
            int i5 = gameSubStatus;
            if (i5 == 3) {
                i = 0;
                c = 0;
            } else if (i5 == 5) {
                i = 3;
                c = 1;
            } else if (i5 == 7) {
                i = 12;
            } else if (i5 == 9) {
                i = 15;
                c = 3;
            } else if (i5 == 11) {
                i = 24;
                c = 4;
            } else if (i5 != 13) {
                i = 0;
                c = 6;
            } else {
                i = 27;
                c = 5;
            }
            if (TouchManager.getPressedCount() == 0) {
                tutorialViewCount++;
            }
            int[][] iArr4 = tutorialUnitPos;
            if (checkTowerPos(i, iArr4[c][0], iArr4[c][1])) {
                int i6 = gameSubStatus;
                if (i6 == 3) {
                    gameSubStatus = 4;
                    return;
                }
                if (i6 == 5) {
                    gameSubStatus = 6;
                    return;
                }
                if (i6 == 7) {
                    gameSubStatus = 8;
                    return;
                }
                if (i6 == 9) {
                    gameSubStatus = 10;
                    return;
                }
                if (i6 == 11) {
                    gameSubStatus = 12;
                } else if (i6 == 13) {
                    gameSubStatus = 14;
                } else {
                    if (i6 != 15) {
                        return;
                    }
                    gameSubStatus = 16;
                }
            }
        }
    }

    //Does this even belong here?
    public void update_GAME_INGAME_MENU() {
        rewindTowerEnemyUnit();
        if (gameSubStatus != 1) {
            return;
        }
        GameRenderer.darkViewCount++;
        if (GameRenderer.darkViewCount >= 45) {
            int i = GameRenderer.titlePressed;
            if (i == 1) {
                playSound(14);
                gameStatus = 24;
                return;
            }
            if (i != 2) {
                return;
            }
            int i2 = mapNumber;
            stageSelectChapterNumber = i2 / 10;
            stageSelectStageNumber = i2 % 10;
            gameStatus = 10;
            gameSubStatus = 0;
            GameRenderer.startViewCount = 0;
            mapAttackType = 0;
            loadMap((stageSelectChapterNumber * 10) + stageSelectStageNumber, true);
            playLoopSound(1);
        }
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
