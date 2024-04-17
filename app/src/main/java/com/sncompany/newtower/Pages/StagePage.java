package com.sncompany.newtower.Pages;

import androidx.core.view.ViewCompat;

import com.sncompany.newtower.Battle.HeroUnit;
import com.sncompany.newtower.Battle.MonsterUnit;
import com.sncompany.newtower.Battle.TowerUnit;
import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataHero;
import com.sncompany.newtower.DataClasses.DataMonster;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataWave;
import com.sncompany.newtower.DataClasses.DataWaveMob;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.Pages.stage.StageBase;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class StagePage extends StageBase {
    public static final int GAME_INGAME_MENU_TOUCH_LIST_0_RESUME = 0;
    public static final int GAME_INGAME_MENU_TOUCH_LIST_1_RESTART = 1;
    public static final int GAME_INGAME_MENU_TOUCH_LIST_2_STAGE_SELECT = 2;
    public static final int GAME_INGAME_MENU_TOUCH_LIST_TOTAL_COUNT = 3;
    public static final int GAME_OVER_TOUCH_LIST_0_UPGRADE = 0;
    public static final int GAME_OVER_TOUCH_LIST_1_RETRY = 1;
    public static final int GAME_OVER_TOUCH_LIST_2_STAGESELECT = 2;
    public static final int GAME_OVER_TOUCH_LIST_3_TITLE_NEXT = 3;
    public static final int GAME_OVER_TOUCH_LIST_4_RESULT_NEXT = 4;
    public static final int GAME_OVER_TOUCH_LIST_TOTAL_COUNT = 5;
    public static final int GAME_PLAYING_TOUCH_CHAR_BOTTOM_BLOCK = 19;
    public static final int GAME_PLAYING_TOUCH_CHAR_LEVEL_UP = 16;
    public static final int GAME_PLAYING_TOUCH_CHAR_OK = 17;
    public static final int GAME_PLAYING_TOUCH_CHAR_SELL = 14;
    public static final int GAME_PLAYING_TOUCH_CHAR_SPECIAL = 18;
    public static final int GAME_PLAYING_TOUCH_CHAR_TOTAL_COUNT = 20;
    public static final int GAME_PLAYING_TOUCH_CHAR_UPGRADE = 15;
    public static final int GAME_PLAYING_TOUCH_CH_UP_NO = 21;
    public static final int GAME_PLAYING_TOUCH_CH_UP_TOTAL_COUNT = 22;
    public static final int GAME_PLAYING_TOUCH_CH_UP_YES = 20;
    public static final int GAME_PLAYING_TOUCH_LIST_0_WARRIOR = 0;
    public static final int GAME_PLAYING_TOUCH_LIST_10_PAUSE_CHECK = 12;
    public static final int GAME_PLAYING_TOUCH_LIST_11_TURBO_CHECK = 13;
    public static final int GAME_PLAYING_TOUCH_LIST_1_MAN_AT_ARMS = 1;
    public static final int GAME_PLAYING_TOUCH_LIST_2_ARCHER = 2;
    public static final int GAME_PLAYING_TOUCH_LIST_3_HOLY_EYE = 3;
    public static final int GAME_PLAYING_TOUCH_LIST_4_WIZARD = 4;
    public static final int GAME_PLAYING_TOUCH_LIST_5_COLD_DIVINER = 5;
    public static final int GAME_PLAYING_TOUCH_LIST_7_HERO_ICON = 7;
    public static final int GAME_PLAYING_TOUCH_LIST_8_HERO_SLOT_0 = 8;
    public static final int GAME_PLAYING_TOUCH_LIST_8_HERO_SLOT_1 = 9;
    public static final int GAME_PLAYING_TOUCH_LIST_8_HERO_SLOT_2 = 10;
    public static final int GAME_PLAYING_TOUCH_LIST_9_PLAY_STOP_CHECK = 11;
    public static final int GAME_PLAYING_TOUCH_LIST_TOTAL_COUNT = 14;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_0_UPGRADE = 0;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_1_NEXT_STAGE = 1;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_2_STAGESELECT = 2;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_3_TITLE_NEXT = 3;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_4_RESULT_NEXT = 4;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_5_REWARD_OK = 5;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_6_ENDING_VIEW_OK = 6;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_TOTAL_COUNT = 7;
    /**
     * Contains all the dialog for reward attaining.
     */
    static final String[] rewardDataString = {
            "You've acquired a Hero.", "Hero: Champion acquired.", "Check for more info under the Item> Equipment menu.",
            "Hero Points obtained.", "You obtained 1,500 Hero Points.", " ",
            "You've acquired a Hero.", "Hero: Bow Master acquired.", "Check for more info under the Item> Equipment menu.",
            "You acquired special skills.", "You can now use the special skill for all of your Heroes.", "Select a Hero character while playing.",
            "You've acquired a Hero.", "Hero: Archmage acquired.", "Check for more info under the Item> Equipment menu.",
            "The upgrade limit is now uncapped.", "The upgrade limit of your Hero units has increased.(+5)", " ",
            "A Hero's normal attack has been upgraded.", "All of your Heroes now cause a special effect with their Normal attacks.", " ",
            "Hero Points obtained.", "You obtained 2,000 Hero Points.", " ",
            "You obtained a Hero item.", "You obtained a Zephyrus Amulet.", " ",
            "Hero Points obtained.", "You obtained 3,500 Hero Points.", " "
    };
    
    private int startViewCount, upgradeCount;

    public StagePage(TPage par, DataStage s) {
        super(par, s);

        for (int i5 = 0; i5 < 11; i5++) {
            if (i5 < 8)
                myOscillator[i5].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
            else
                myOscillator[i5].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
            myOscillator[i5].fastForward();
        }
    }

    public void update_GAME_STAGE_START_VIEW() {
        myOscillator[11].updatePosition();
        if (startViewCount != 15) {
            startViewCount++;
            if (startViewCount >= 35)
                state = STATE.PLAYING;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x005f, code lost:

        if (st.waveManager.waveRunF != false) goto L30;
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

        st.updateEffects(false);
        st.updateArrowUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0084, code lost:

        if (com.sncompany.newtower.GameThread.specialAttackFrameCount < 170) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0086, code lost:

        clearSpecialArrowUnit();
        hitSpecialIceAttack();
        com.sncompany.newtower.GameRenderer.specialBlinkCount = 10;
        com.sncompany.newtower.characterMenuSelectFlag = 0;
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

        if (st.waveManager.waveRunF != false) goto L66;
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

        st.updateEffects(false);
        st.updateArrowUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0111, code lost:

        if (com.sncompany.newtower.GameThread.specialAttackFrameCount < 150) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0113, code lost:

        clearSpecialArrowUnit();
        hitSpecialBladeAttack();
        com.sncompany.newtower.GameRenderer.specialBlinkCount = 10;
        com.sncompany.newtower.characterMenuSelectFlag = 0;
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

        if (upgradeCount > 0)
            upgradeCount--;
        if (GameRenderer.levelUpCount > 0)
            GameRenderer.levelUpCount--;
        if (GameRenderer.specialBlinkCount > 0)
            GameRenderer.specialBlinkCount--;
        if (GameRenderer.monsterGoalBlinkCount > 0)
            GameRenderer.monsterGoalBlinkCount--;

        if (st.waveManager.monsterOpenTime > 0)
            st.waveManager.monsterOpenTime--;

        HeroUnit spe = st.selectedUnit instanceof HeroUnit hero ? hero : null;
        if (spe == null || spe.updateSpecial()) {

        } else {
            case 8:
                break;
            case 9:
                if (st.waveManager.waveRunF) {
                    while (true) {
                        specialAttackFrameCount++;
                        if (!specialAttackSkipFlag && specialAttackFrameCount == 60)
                            playSound(17);

                        st.updateEffects(false);
                        st.updateArrowUnit();
                        if (specialAttackFrameCount >= 195) {
                            clearSpecialArrowUnit();
                            hitSpecialArrowAttack();
                            GameRenderer.specialBlinkCount = 10;
                            characterMenuSelectFlag = 0;

                            TowerUnit[] towerUnitArr = towerUnit;
                            int i14 = characterSelectNumber;
                            towerUnitArr[i14].specialCooltime = towerUnitArr[i14].specialMaxCooltime;
                        }
                    }
                }
                break;
            case 10:
                break;
        }

        switch (characterMenuSelectFlag) {
            case 2:
            case 5:
            case 6:
            case 12:
            case 13:
                int spd = Math.max(st.turbo, 1);
                for (int i = 0; i < spd; i++)
                    st.updateEffects(true);
                break;
            case 3:
            case 4:
            case 7:
            case 11:
            default:
                if (st.waveManager.waveRunF) {
                    if (st.waveManager.waveStartT > 0) {
                        for (int i6 = 0; i6 < st.turbo; i6++) {
                            if (--st.waveManager.waveStartT == 0) {
                                if (waveManager.wavePattern == 3) {
                                    characterMenuMonsterViewCount = 100;
                                    characterMenuMonsterStartViewCount = 0;
                                    GameThread.playSound(20);
                                } else {
                                    characterMenuMonsterViewCount = 60;
                                    characterMenuMonsterStartViewCount = 0;
                                }
                            }
                            st.updateEffects(false);
                            st.updateArrowUnit();
                            st.updateTowerUnit();
                            st.updateObjectUnit();
                        }
                    } else {
                        int i8 = characterMenuMonsterViewCount;
                        if (i8 > 0) {
                            characterMenuMonsterViewCount = i8 - 1;
                            characterMenuMonsterStartViewCount++;
                            for (int i9 = 0; i9 < turbo; i9++) {
                                st.updateEffects(false);
                                st.updateArrowUnit();
                                st.updateTowerUnit();
                                st.updateObjectUnit();
                            }
                        } else {
                            for (int i10 = 0; i10 < st.turbo; i10++) {
                                st.waveManager.monsterWaveUpdate();
                                st.updateEffects(false);
                                st.updateArrowUnit();
                                if (st.updateMonsterUnit()) { //Gayme over
                                    st.sortEntities();
                                    gameStatus = 23;
                                    startViewCount = 0;
                                    gameSubStatus = 0;
                                    GameThread.stopLoopSound(2);
                                    GameThread.playSound(11);
                                    /*if (st.mapType == 0) {
                                        st.victoryH = (st.waveManager.current * 8) + (st.Life * 10); //This is actually just 0 every time keeeek
                                    } else if (st.mapType == 1) {
                                        getTotalScore();
                                        st.victoryH = waveManager.current * 15;
                                    } else
                                        st.victoryH = (float)(((DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[SID] - waveManager.current) * 8) * (SID + 15)) / 15;
                                    if (Config.stageProg[st.SID][0] >= 0)
                                        st.victoryH = (st.victoryH * 7) / 10;*/
                                    //I didn't add this here, but commented it for performance purposes. I think it's better than making it 50 for all instances, but eh gotta stay true to game
                                    st.victoryH = 50;
                                    Config.heroPoints += (int)st.victoryH;
                                    Config.saveAll();
                                    myOscillator[11].initWithTwoWayStartPosition(-350, 0, 15, 30, 10);
                                    return;
                                }
                                st.updateTowerUnit();
                                st.updateObjectUnit();
                            }
                        }
                    }
                    st.unlockUnit();
                    break;
                }
                break;
        }
        st.sortEntities();
        int checkWaveAndFinishCheck = st.waveManager.checkWaveAndFinishCheck();
        if (checkWaveAndFinishCheck == 3) { //This is a game over too btw
            st.sortEntities();
            gameStatus = 23;
            startViewCount = 0;
            gameSubStatus = 0;
            GameThread.stopLoopSound(2);
            GameThread.playSound(11);
            setClearPointAndHighscore();
            /*if (mapType == 0)
                victoryH = (waveManager.current * 8) + (Life * 10);
            else if (mapType == 1)
                victoryH = waveManager.current * 15;
            else if (mapType == 2)
                victoryH = waveManager.current * 5;
            if (st.perfectClear())
                st.victoryH *= 2;*/
            st.victoryH = 50;

            Config.heroPoints += st.victoryH;
            DataAward.check_heroPoint();

            Config.saveAll();
            myOscillator[11].initWithTwoWayStartPosition(-350, 0, 15, 30, 10);
            return;
        } else if (checkWaveAndFinishCheck != 1)
            return;

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
                wus |= 1 << twr.type;
                archerOnly &= twr.getRole() == 1;
                mageOnly &= twr.getRole() == 2;
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
            if (st.SID == srds[i] && !Config.rewardValues[i]) {
                Config.rewardValues[i] = true;
                rewardShowOrder = i;
                switch (i) {
                    case 9:
                        Config.heroPoints += 1500;
                    case 7:
                        Config.heroPoints += 500; //2000
                    case 1:
                        Config.heroPoints += 1500; //3500
                        break;
                    case 0:
                    case 2:
                    case 4:
                        DataStage.heroAvail[i / 2] = true;
                        break;
                    case 8:
                        Config.rewardValues[8] = getItem(15);
                        if (!Config.rewardValues[8])
                            rewardShowOrder = -2;
                        break;
                }
            }
        DataAward.clear_award(st.SID);
        Config.saveAll();

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

    public boolean getItem(int id) {
        int slot = -1;
        for (int i = 0; i < Config.inventory.length; i++)
            if (Config.inventory[i] == null) {
                slot = i;
                break;
            }
        if (slot == -1)
            return false;

        int rid = id - 1;
        Config.inventory[slot] = new byte[]{(byte) (rid / 4), (byte) (rid % 4)};
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update_GAME_STAGE_CLEAR() {
        boolean z;
        int i;
        st.updateEffects(false);
        st.sortEntities();
        int i2 = gameSubStatus;
        if (i2 == 0) {
            myOscillator[11].updatePosition();
            return;
        }
        if (i2 == 1) {
            if (startViewCount == 40 || startViewCount == 70 || startViewCount == 100 || startViewCount == 130 || startViewCount == 160 || startViewCount == 190 || startViewCount == 220 || startViewCount == 250) {
                playSound(1);
            }
            startViewCount++;
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
            boolean z3 = myOscillator[12].currentCount >= 5;
            if (z3) {
                myOscillator[13].updatePosition();
                z3 = myOscillator[13].currentCount >= 5;
            }
            if (z3) {
                myOscillator[14].updatePosition();
                z3 = myOscillator[14].currentCount >= 5;
            }
            if (z3) {
                myOscillator[15].updatePosition();
                z3 = myOscillator[15].currentCount >= 5;
            }
            if (z3) {
                myOscillator[16].updatePosition();
                z3 = myOscillator[16].currentCount >= 5;
            }
            if (z3) {
                myOscillator[17].updatePosition();
                z3 = myOscillator[17].currentCount >= 5;
            }
            if (z3) {
                myOscillator[18].updatePosition();
                z3 = myOscillator[18].currentCount >= 5;
            }
            if (z3) {
                myOscillator[19].updatePosition();
                int i3 = myOscillator[19].currentCount;
            }
            if (myOscillator[19].currentCount >= 60) {
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
                startViewCount = 0;
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
            if (st.SID < 49) {
                if (st.mapType == 0 || (st.mapType == 1 ? Config.stageProg[st.SID + 1][1] != -1 : Config.stageProg[st.SID + 1][2] == -1)) {
                    GameThread.playSound(14);
                    Config.lastPlayed++;
                    int i19 = mapNumber + 1;
                    i = i19 < 50 ? i19 : 49;
                    stageSelectChapterNumber = i / 10;
                    stageSelectStageNumber = i % 10;
                    gameStatus = 24;
                    return;
                }
                NewTower.switchPage(parent, true);
            }
        }
    }

    public void update_GAME_OVER() {
        st.updateEffects(false);
        st.sortEntities();
        int i = gameSubStatus;
        if (i == 0) {
            if (startViewCount < 70) {
                startViewCount++;
            }
            if (startViewCount >= 70) {
                myOscillator[11].updatePosition();
                return;
            }
            return;
        }
        if (i == 1) {
            if (startViewCount == 30 || startViewCount == 60 || startViewCount == 90 || startViewCount == 120 || startViewCount == 150 || startViewCount == 180 || startViewCount == 210 || startViewCount == 240) {
                playSound(1);
            }
            startViewCount++;
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
            startViewCount = 0;
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

    //Does this even belong here?
    public void update_GAME_INGAME_MENU() {
        st.sortEntities();
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
            startViewCount = 0;
            mapAttackType = 0;
            loadMap((stageSelectChapterNumber * 10) + stageSelectStageNumber, true);
            playLoopSound(1);
        }
    }

    public void paint_GAME_STAGE_START_VIEW(GL10 gl10) {
        st.map.checkBackBase();
        backBaseImageArray[lastShowBackBase].drawAtPointOption(0.0f, 0.0f, 18);
        backShadowImage.drawAtPointOption(0.0f, 0.0f, 18);
        drawMapTile(gl10);
        drawAllUnit(gl10);
        drawPlayingUi(true);
        int i = startViewCount;
        float f = i < 15 ? 1.0f - ((i * 0.5f) / 15.0f) : 0.5f - (((i - 15) * 0.5f) / 20.0f);
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f > 0.0f) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f, f, f, f);
            fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        int i2 = startViewCount;
        float f2 = i2 < 15 ? (i2 * 1.0f) / 15.0f : 1.0f - (((i2 - 15) * 1.0f) / 20.0f);
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 > 0.0f) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f2, f2, f2, f2);
            setFontDoubleColor(-1, -16702370);
            setFontSize(50);
            drawStringDoubleM(GameThread.chapterName[GameThread.mapNumber / 10], CX, 115.0f, 9);
            setFontSize(35);
            drawStringDoubleM(String.format("Stage %d", Integer.valueOf(GameThread.mapNumber + 1)), 183.0f, 220.0f, 18);
            drawStringDoubleM(String.format("Wave %-2d", Integer.valueOf(DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[GameThread.mapNumber])), 435.0f, 220.0f, 18);
            if (GameThread.mapNumber % 10 == 9) {
                uiUpperImage[upper_bossstage].drawAtPointOption(CX, 308.0f, 17);
            }
            setFontDoubleColor(-65703, -9816043);
            setFontSize(25);
            drawStringDoubleM("Touch the screen!!.", CX, 391.0f, 17);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        TouchManager.clearTouchMap();
        TouchManager.addTouchRectYesnoData(2, CGRectMake(0.0f, 0.0f, SCRWIDTH, SCRHEIGHT));
        TouchManager.swapTouchMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0522  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void paint_GAME_PLAYING(GL10 gl10, boolean z) {
        float f;
        float f2;
        int i;
        int i2;
        float f3;
        int i3;
        float f4;
        int i4;
        int i5;
        float f5;
        int i6;
        int i7 = 0;
        switch (characterMenuSelectFlag) {
            case 8:
                if (specialSwordImage[0].name == -1) {
                    loadImageResourceToTexture(specialSwordImage, specialSwordResource);
                    break;
                }
                break;
            case 9:
                if (specialArrowImage[0].name == -1) {
                    loadImageResourceToTexture(specialArrowImage, specialArrowResource);
                    break;
                }
                break;
            case 10:
                if (specialIceImage[0].name == -1) {
                    loadImageResourceToTexture(specialIceImage, specialIceResource);
                    break;
                }
                break;
            default:
                if (specialSwordImage[0].name != -1) {
                    removeImageResourceArray(specialSwordImage);
                }
                if (specialArrowImage[0].name != -1) {
                    removeImageResourceArray(specialArrowImage);
                }
                if (specialIceImage[0].name == -1) {
                    removeImageResourceArray(specialIceImage);
                    break;
                }
                break;
        }
        tmap.checkBackBase();
        tmap.backBaseImageArray[tmap.lastShowBackBase].drawAtPointOption(0.0f, 0.0f, 18);
        backShadowImage.drawAtPointOption(0.0f, 0.0f, 18);
        drawMapTile(gl10);
        if (st.selectedUnit != null && !(st.selectedUnit instanceof HeroUnit hero && hero.specialShowCount >= 0)) {
            drawAddGridBlock();
            st.selectedUnit.drawUnitRangeCircle();
        }
        if (GameThread.tempCharacterRangeViewNumber != -1)
            st.towerUnit.get(GameThread.tempCharacterRangeViewNumber).drawUnitRangeCircle();

        drawAllUnit(gl10);
        drawPlayingUi(z);
        int i9 = characterMenuSelectFlag;
        if (i9 == 1 || i9 == 4) {
            boolean addable = getAddSettingPosition();
            drawAddGridBlock();
            drawAddRangeCircle(characterAddNumber, characterAddPosX, characterAddPosY, addable);
        }
        switch (characterMenuSelectFlag) {
            case 8:
                if (GameThread.specialAttackFrameCount < 60) {
                    if (GameThread.specialAttackFrameCount < 50) {
                        f3 = (GameThread.specialAttackFrameCount - 0) * 0.1f;
                        if (f3 > 1.0f) {
                            f3 = 1.0f;
                        }
                    } else {
                        f3 = 1.0f - ((GameThread.specialAttackFrameCount - 50) * 0.1f);
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        }
                    }
                    if (f3 > 0.0f) {
                        if (f3 < 1.0f) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                            Texture2D.gl.glColor4f(f3, f3, f3, f3);
                        }
                        specialSwordImage[5].drawAtPointOption(0.0f, 0.0f, 18);
                        specialSwordImage[5].drawAtPointOptionFlipHorizon(0.0f, SCRHEIGHT_SMALL, 34);
                        while (i7 < 30) {
                            specialSwordImage[6].drawAtPointOption(GameThread.getRandom(SCRWIDTH), GameThread.getRandom(SCRHEIGHT_SMALL), 9);
                            specialSwordImage[7].drawAtPointOption(GameThread.getRandom(SCRWIDTH), GameThread.getRandom(SCRHEIGHT_SMALL), 9);
                            specialSwordImage[8].drawAtPointOption(GameThread.getRandom(SCRWIDTH), GameThread.getRandom(SCRHEIGHT_SMALL), 9);
                            i7++;
                        }
                        if (f3 < 1.0f) {
                            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                        }
                    }
                    if (GameThread.specialAttackFrameCount >= 10 && GameThread.specialAttackFrameCount < 50) {
                        if (GameThread.specialAttackFrameCount < 15) {
                            i3 = 100 - ((15 - GameThread.specialAttackFrameCount) * 100);
                        } else
                            i3 = GameThread.specialAttackFrameCount >= 45 ? ((GameThread.specialAttackFrameCount - 45) * 100) + 100 : 100;
                        specialSwordImage[4].drawAtPointOption(i3, SCRHEIGHT_SMALL, 34);
                        break;
                    }
                } else {
                    for (int i10 = 0; i10 < 20; i10++) {
                        int[] iArr = GameThread.specialDataValue[i10];
                        iArr[1] = iArr[1] + GameThread.specialDataValue[i10][3];
                        int i11 = GameThread.specialDataValue[i10][0];
                        if (i11 == 0) {
                            if (GameThread.specialDataValue[i10][1] >= SCRWIDTH_SMALL) {
                                int[] iArr2 = GameThread.specialDataValue[i10];
                                iArr2[1] = iArr2[1] - (SCRWIDTH_SMALL + Texture2D.SCRWIDTH_800);
                                i = 2;
                                GameThread.specialDataValue[i10][2] = GameThread.getRandom(SCRHEIGHT_SMALL);
                                i2 = GameThread.specialDataValue[i10][0];
                                if (i2 != 0) {
                                }
                            }
                            i = 2;
                            i2 = GameThread.specialDataValue[i10][0];
                            if (i2 != 0) {
                            }
                        } else if (i11 == 1) {
                            if (GameThread.specialDataValue[i10][1] >= SCRWIDTH_SMALL) {
                                int[] iArr3 = GameThread.specialDataValue[i10];
                                iArr3[1] = iArr3[1] - (SCRWIDTH_SMALL + Texture2D.SCRHEIGHT_480);
                                i = 2;
                                GameThread.specialDataValue[i10][2] = GameThread.getRandom(SCRHEIGHT_SMALL);
                                i2 = GameThread.specialDataValue[i10][0];
                                if (i2 != 0) {
                                }
                            }
                            i = 2;
                            i2 = GameThread.specialDataValue[i10][0];
                            if (i2 != 0) {
                            }
                        } else {
                            if (i11 == 2 && GameThread.specialDataValue[i10][1] >= SCRWIDTH_SMALL) {
                                int[] iArr4 = GameThread.specialDataValue[i10];
                                iArr4[1] = iArr4[1] - (SCRWIDTH_SMALL + GAME_STAGE_CLEAR_HIGH_SCORE_COUNT);
                                i = 2;
                                GameThread.specialDataValue[i10][2] = GameThread.getRandom(SCRHEIGHT_SMALL);
                                i2 = GameThread.specialDataValue[i10][0];
                                if (i2 != 0) {
                                    specialSwordImage[9].drawAtPointOption(GameThread.getRandom(SCRWIDTH), GameThread.getRandom(SCRHEIGHT_SMALL), 9);
                                } else if (i2 == 1) {
                                    specialSwordImage[10].drawAtPointOption(GameThread.getRandom(SCRWIDTH), GameThread.getRandom(SCRHEIGHT_SMALL), 9);
                                } else if (i2 == i) {
                                    specialSwordImage[11].drawAtPointOption(GameThread.getRandom(SCRWIDTH), GameThread.getRandom(SCRHEIGHT_SMALL), 9);
                                }
                            }
                            i = 2;
                            i2 = GameThread.specialDataValue[i10][0];
                            if (i2 != 0) {
                            }
                        }
                    }
                    break;
                }
                break;
            case 9:
                if (GameThread.specialAttackFrameCount < 60) {
                    if (GameThread.specialAttackFrameCount < 50) {
                        f4 = (GameThread.specialAttackFrameCount - 0) * 0.1f;
                        if (f4 > 1.0f) {
                            f4 = 1.0f;
                        }
                    } else {
                        f4 = 1.0f - ((GameThread.specialAttackFrameCount - 50) * 0.1f);
                        if (f4 < 0.0f) {
                            f4 = 0.0f;
                        }
                    }
                    if (f4 > 0.0f) {
                        if (f4 < 1.0f) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                            Texture2D.gl.glColor4f(f4, f4, f4, f4);
                        }
                        specialArrowImage[15].drawAtPointOption(SCRWIDTH, 0.0f, 20);
                        specialArrowImage[15].drawAtPointOptionFlipHorizon(0.0f, SCRHEIGHT, 34);
                        while (i7 < 30) {
                            specialArrowImage[16].drawAtPointOption(GameThread.getRandom(SCRWIDTH), GameThread.getRandom(SCRHEIGHT_SMALL), 9);
                            specialArrowImage[17].drawAtPointOption(GameThread.getRandom(SCRWIDTH), GameThread.getRandom(SCRHEIGHT_SMALL), 9);
                            specialArrowImage[18].drawAtPointOption(GameThread.getRandom(SCRWIDTH), GameThread.getRandom(SCRHEIGHT_SMALL), 9);
                            i7++;
                        }
                        if (f4 < 1.0f) {
                            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                        }
                    }
                    if (GameThread.specialAttackFrameCount >= 10 && GameThread.specialAttackFrameCount < 50) {
                        if (GameThread.specialAttackFrameCount < 15) {
                            i4 = 200 - ((15 - GameThread.specialAttackFrameCount) * 100);
                            i5 = 10 - ((15 - GameThread.specialAttackFrameCount) * 100);
                        } else {
                            i4 = 200;
                            if (GameThread.specialAttackFrameCount >= 45) {
                                i4 = 200 + ((GameThread.specialAttackFrameCount - 45) * 100);
                                i5 = ((GameThread.specialAttackFrameCount - 45) * 100) + 10;
                            } else {
                                i5 = 10;
                            }
                        }
                        specialArrowImage[13].drawAtPointOption(i4, i5, 18);
                        specialArrowImage[14].drawAtPointOption(i4 + GameThread.SPECIAL_ATTACK_ARROW_LEG_POS_X, i5 + GameThread.SPECIAL_ATTACK_ARROW_LEG_POS_Y, 18);
                    }
                }
                if (GameThread.specialAttackFrameCount >= 165) {
                    float f6 = (((float) (GameThread.specialAttackFrameCount - 165)) * 0.025f) + 0.5f;
                    if (f6 > 1.0f) {
                        f6 = 1.0f;
                    }
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f6, f6, f6, f6);
                    specialArrowImage[19].drawAtPointOptionSize(CX, CY, 9, f6);
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                break;
            case 10:
                if (GameThread.specialAttackFrameCount < 60) {
                    if (GameThread.specialAttackFrameCount < 50) {
                        f5 = (GameThread.specialAttackFrameCount - 0) * 0.1f;
                        if (f5 > 1.0f) {
                            f5 = 1.0f;
                        }
                    } else {
                        f5 = 1.0f - ((GameThread.specialAttackFrameCount - 50) * 0.1f);
                        if (f5 < 0.0f) {
                            f5 = 0.0f;
                        }
                    }
                    if (f5 > 0.0f) {
                        if (f5 < 1.0f) {
                            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                            Texture2D.gl.glColor4f(f5, f5, f5, f5);
                        }
                        specialIceImage[1].drawAtPointOption(SCRWIDTH_SMALL, 0.0f, 20);
                        specialIceImage[1].drawAtPointOptionFlip(0.0f, 0.0f, 18);
                        for (int i12 = 0; i12 < 30; i12++) {
                            specialIceImage[17].drawAtPointOption(GameThread.getRandom(SCRWIDTH), GameThread.getRandom(SCRHEIGHT_SMALL), 9);
                            specialIceImage[18].drawAtPointOption(GameThread.getRandom(SCRWIDTH), GameThread.getRandom(SCRHEIGHT_SMALL), 9);
                            specialIceImage[19].drawAtPointOption(GameThread.getRandom(SCRWIDTH), GameThread.getRandom(SCRHEIGHT_SMALL), 9);
                        }
                        if (f5 < 1.0f) {
                            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                        }
                    }
                    if (GameThread.specialAttackFrameCount >= 10 && GameThread.specialAttackFrameCount < 50) {
                        if (GameThread.specialAttackFrameCount < 15) {
                            i6 = 40 - ((15 - GameThread.specialAttackFrameCount) * 200);
                        } else {
                            i6 = GameThread.specialAttackFrameCount >= 45 ? ((GameThread.specialAttackFrameCount - 45) * 200) + 40 : 40;
                        }
                        specialIceImage[0].drawAtPointOption(0.0f, i6, 18);
                    }
                }
                if (GameThread.specialAttackFrameCount >= 135 && GameThread.specialAttackFrameCount < 150) {
                    float f7 = (((float) (GameThread.specialAttackFrameCount - 135)) * 0.1f) + 0.3f;
                    if (f7 > 1.0f) {
                        f7 = 1.0f;
                    }
                    specialIceImage[2].drawAtPointOptionSize(CX, CY, 9, f7);
                }
                if (GameThread.specialAttackFrameCount >= 150) {
                    float f8 = 2.0f - (((float) (GameThread.specialAttackFrameCount - 150)) * 0.1f);
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    if (f8 > 0.0f) {
                        Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                        Texture2D.gl.glColor4f(f8, f8, f8, f8);
                        fillWhiteImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
                        Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                        break;
                    }
                }
                break;
        }
        int i13 = specialBlinkCount;
        if (i13 > 0) {
            if (i13 >= 5) {
                i13 = 10 - i13;
            }
            float f9 = i13 * 0.2f;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f9, f9, f9, f9);
            fillWhiteImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        int i14 = monsterGoalBlinkCount;
        if (i14 > 0) {
            float f10 = (i14 < 3 ? i14 : 6 - i14) * MONSTER_GOAL_BLINK_ALPHA_DEGREE;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f10, f10, f10, f10);
            fillWhiteImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (GameThread.characterMenuMonsterViewCount > 0) {
            if (GameThread.characterMenuMonsterViewCount < 10) {
                float f11 = GameThread.characterMenuMonsterViewCount * 0.1f;
                gl10.glTexEnvf(8960, 8704, 8448.0f);
                gl10.glColor4f(f11, f11, f11, f11);
            }
            drawMonsterViewMenu();
            gl10.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            if (st.waveManager.wavePattern != 3) {
                return;
            }
            if (GameThread.characterMenuMonsterViewCount < 10) {
                f = GameThread.characterMenuMonsterViewCount * 0.1f;
                gl10.glTexEnvf(8960, 8704, 8448.0f);
                gl10.glColor4f(f, f, f, f);
            } else {
                f = 1.0f;
            }
            uiMonsterEtcImage[3].drawAtPointOption(CX - 102, 164.0f, 18);
            if (GameThread.characterMenuMonsterViewCount % 16 < 8) {
                f2 = (GameThread.characterMenuMonsterViewCount % 16) * 0.125f;
            } else {
                f2 = 1.0f - (((float) ((GameThread.characterMenuMonsterViewCount % 16) - 8)) * 0.125f);
            }
            if (f2 <= f) {
                f = f2;
            }
            gl10.glTexEnvf(8960, 8704, 8448.0f);
            gl10.glColor4f(f, f, f, f);
            uiMonsterEtcImage[4].drawAtPointOption((float) (CX - 119), 146.0f, 18);
            gl10.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            return;
        }
        removeImageResourceArray(uiMonsterFaceImage);
        removeImageResourceArray(uiMonsterNameImage);
    }

    public void paint_GAME_INGAME_MENU(GL10 gl10) {
        paint_GAME_PLAYING(gl10, false);
        TouchManager.clearTouchMap();
        TouchManager.addTouchRectListData(0, CGRectMake(300.0f, 136.0f, 201.0f, 61.0f));
        TouchManager.addTouchRectListData(1, CGRectMake(300.0f, 236.0f, 201.0f, 61.0f));
        TouchManager.addTouchRectListData(2, CGRectMake(300.0f, 336.0f, 201.0f, 61.0f));
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 3;
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
        Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
        fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
        Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        uiIngameImage[0].drawAtPointOption(CX, 6.0f, 17);
        if (checkTouchListStatus == 0) {
            uiIngameImage[2].drawAtPointOption(CX, 136.0f, 17);
        } else {
            uiIngameImage[1].drawAtPointOption(CX, 136.0f, 17);
        }
        if (checkTouchListStatus == 1) {
            uiIngameImage[4].drawAtPointOption(CX, 236.0f, 17);
        } else {
            uiIngameImage[3].drawAtPointOption(CX, 236.0f, 17);
        }
        if (checkTouchListStatus == 2) {
            uiIngameImage[6].drawAtPointOption(CX, 336.0f, 17);
        } else {
            uiIngameImage[5].drawAtPointOption(CX, 336.0f, 17);
        }
        if (GameThread.gameSubStatus == 1) {
            float f = darkViewCount * 0.033f;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f, f, f, f);
            fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        TouchManager.swapTouchMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x062e, code lost:

        if (r3 > r4) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x067d, code lost:

        if (r3 > r4) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x06cc, code lost:

        if (r3 > r4) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0720, code lost:

        if (r3 > r4) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x04a6, code lost:

        if (r3 > 1.0f) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x04e8, code lost:

        if (r3 > 1.0f) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0530, code lost:

        if (r3 > r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x05a0, code lost:

        if (r3 > r4) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x05e7, code lost:

        if (r3 > r4) goto L143;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void paint_GAME_STAGE_CLEAR(GL10 gl10) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f5;
        float f7;
        float f9;
        float f11;
        float f13;
        float f15;
        float f17;
        if (GameThread.gameSubStatus == 3) {
            if (uiThemeclearImage[0].name == -1) {
                loadImageResourceToTexture(uiThemeclearImage, uiThemeclearResource);
            }
        } else if (uiThemeclearImage[0].name != -1) {
            removeImageResourceArray(uiThemeclearImage);
        }
        st.map.checkBackBase();
        backBaseImageArray[lastShowBackBase].drawAtPointOption(0.0f, 0.0f, 18);
        backShadowImage.drawAtPointOption(0.0f, 0.0f, 18);
        drawMapTile(gl10);
        drawAllUnit(gl10);
        drawPlayingUi(false);
        TouchManager.clearTouchMap();
        switch (GameThread.gameSubStatus) {
            case 0, 3, 5:
                TouchManager.addTouchRectListData(3, CGRectMake(0.0f, 0.0f, SCRWIDTH, SCRHEIGHT));
                z = false;
                break;
            case 1:
                if (startViewCount < 270) {
                    TouchManager.addTouchRectListData(4, CGRectMake(0.0f, 0.0f, SCRWIDTH, SCRHEIGHT));
                } else if (st.mapType == 1) {
                    TouchManager.addTouchRectListData(2, CGRectMake(338.0f, 382.0f, 125.0f, 58.0f));
                } else if (st.SID == 49) {
                    TouchManager.addTouchRectListData(6, CGRectMake(210.0f, 382.0f, 381.0f, 43.0f));
                } else {
                    TouchManager.addTouchRectListData(2, CGRectMake(156.0f, 382.0f, 125.0f, 58.0f));
                    TouchManager.addTouchRectListData(0, CGRectMake(338.0f, 382.0f, 125.0f, 58.0f));
                    z = st.SID < 49 && (st.mapType == 0 || Config.highScores[st.SID + 1][2] == -1);
                    if (z) {
                        TouchManager.addTouchRectListData(1, CGRectMake(520.0f, 382.0f, 125.0f, 58.0f));
                        break;
                    }
                }
                z = false;
                break;
            case 2:
                if (st.mapType != 1 && st.SID < 49 && (st.mapType == 0 || !(st.mapType != 2 || Config.highScores[st.SID + 1][2] == -1))) {
                    z = true;
                    break;
                }
                z = false;
                break;
            case 4, 6, 7, 8:
                TouchManager.addTouchRectListData(5, CGRectMake(213.0f, 289.0f, 381.0f, 65.0f));
                z = false;
                break;
            default:
                z = false;
                break;
        }
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 7;
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        int i3 = startViewCount;
        float f18 = i3 < 30 ? i3 * GAME_STAGE_CLEAR_START_BLACK_ALPHA : 0.48000002f;
        Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
        Texture2D.gl.glColor4f(f18, f18, f18, f18);
        fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
        Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        switch (GameThread.gameSubStatus) {
            case 0:
                stageClearImage[1].drawAtPointOption(CX, 199.0f, 17);
                break;
            case 1:
            case 2:
                if (startViewCount < 30) {
                    f2 = (r3 - 0) * 0.033f;
                    break;
                }
                f2 = 1.0f;
                if (f2 > 0.0f) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f2, f2, f2, f2);
                    stageClearImage[0].drawAtPointOption(CX, 6.0f, 17);
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                }
                setFontSize(18);
                setFontColor(-1);
                int i4 = startViewCount;
                if (i4 < 60) {
                    f3 = ((float) (i4 - 30)) * 0.033f;
                    break;
                }
                f3 = 1.0f;
                if (f3 > 0.0f) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f3, f3, f3, f3);
                    drawStringM("Score ", 259.0f, 108.0f, 18);
                    drawStringM(String.valueOf((int) GameThread.destroyScore), 540.0f, 108.0f, 20);
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                } else {
                }
                int i5 = startViewCount;
                if (i5 < 90) {
                    f5 = ((float) (i5 - 60)) * 0.033f;
                    break;
                }
                f5 = 1.0f;
                if (f5 > 0.0f) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f5, f5, f5, f5);
                    drawStringM("Life", 259.0f, 140.0f, 18);
                    drawStringM(String.format("%d/%d", st.Life, DataStage.maxLife), 540.0f, 140.0f, 20);
                    if (st.perfectClear()) {
                        stageClearImage[13].drawAtPointOption(553.0f, 131.0f, 18);
                    }
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                } else {
                }
                int i6 = startViewCount;
                if (i6 < 120) {
                    f7 = ((float) (i6 - 90)) * 0.033f;
                    break;
                }
                f7 = 1.0f;
                if (f7 > 0.0f) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f7, f7, f7, f7);
                    drawStringM("Gold", 259.0f, 172.0f, 18);
                    drawStringM(String.valueOf(st.Money), 540.0f, 172.0f, 20);
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                } else {
                }
                int i7 = startViewCount;
                if (i7 < 150) {
                    f9 = ((float) (i7 - 120)) * 0.033f;
                    break;
                }
                f9 = 1.0f;
                if (f9 > 0.0f) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f9, f9, f9, f9);
                    drawStringM("Mana", 259.0f, 206.0f, 18);
                    drawStringM(String.valueOf(st.Mana), 540.0f, 206.0f, 20);
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                } else {
                }
                int i8 = startViewCount;
                if (i8 < 180) {
                    f11 = ((float) (i8 - 150)) * 0.033f;
                    break;
                }
                f11 = 1.0f;
                if (f11 > 0.0f) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f11, f11, f11, f11);
                    stageClearImage[3].drawAtPointOption(270.0f, 257.0f, 18);
                    drawNumberBlock(st.bScore, numberTotalImage, 530.0f, 257.0f, 0, 20, 1);
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                } else {
                }
                int i9 = startViewCount;
                if (i9 < 210) {
                    f13 = ((float) (i9 - 180)) * 0.033f;
                    break;
                }
                f13 = 1.0f;
                if (f13 > 0.0f) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f13, f13, f13, f13);
                    stageClearImage[4].drawAtPointOption(287.0f, 288.0f, 18);
                    drawNumberBlock(GameThread.stageClearViewHeroism, numberClearImage, 513.0f, 288.0f, 0, 20, 1);
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                } else {
                }
                int i10 = startViewCount;
                if (i10 < 240) {
                    f15 = ((float) (i10 - 210)) * 0.033f;
                    break;
                }
                f15 = 1.0f;
                if (f15 > 0.0f) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f15, f15, f15, f15);
                    setFontDoubleColor(-1, -15385258);
                    drawStringDoubleM("Highest Score", 290.0f, 328.0f, 18);
                    drawStringDoubleM(String.valueOf(GameThread.highScoreValue[GameThread.mapNumber][GameThread.mapAttackType]), 508.0f, 328.0f, 20);
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                } else {
                }
                int i11 = startViewCount;
                if (i11 < 270) {
                    f17 = ((float) (i11 - 240)) * 0.033f;
                    break;
                }
                f17 = 1.0f;
                if (f17 > 0.0f) {
                    if (GameThread.mapAttackType != 1) {
                        if (GameThread.mapNumber == 49) {
                            if (checkTouchListStatus == 6) {
                                uiPopupImage[13].drawAtPointOption(210.0f, 382.0f, 18);
                                break;
                            } else {
                                uiPopupImage[12].drawAtPointOption(210.0f, 382.0f, 18);
                                break;
                            }
                        } else {
                            if (checkTouchListStatus == 2) {
                                stageClearImage[10].drawAtPointOption(156.0f, 382.0f, 18);
                            } else {
                                stageClearImage[9].drawAtPointOption(156.0f, 382.0f, 18);
                            }
                            if (checkTouchListStatus == 0) {
                                stageClearImage[8].drawAtPointOption(338.0f, 382.0f, 18);
                            } else {
                                stageClearImage[7].drawAtPointOption(338.0f, 382.0f, 18);
                            }
                            if (z) {
                                if (checkTouchListStatus == 1) {
                                    stageClearImage[6].drawAtPointOption(520.0f, 382.0f, 18);
                                    break;
                                } else {
                                    stageClearImage[5].drawAtPointOption(520.0f, 382.0f, 18);
                                    break;
                                }
                            }
                        }
                    } else if (checkTouchListStatus == 2) {
                        stageClearImage[10].drawAtPointOption(338.0f, 382.0f, 18);
                        break;
                    } else {
                        stageClearImage[9].drawAtPointOption(338.0f, 382.0f, 18);
                        break;
                    }
                }
                break;
            case 4:
                uiPopupImage[7].drawAtPointOption(201.0f, 101.0f, 18);
                stageClearImage[14].drawAtPointOption(291.0f, 111.0f, 18);
                switch (GameThread.rewardShowOrder) {
                    case 0:
                        stageClearImage[19].drawAtPointOption(365.0f, 169.0f, 18);
                        break;
                    case 1:
                        stageClearImage[18].drawAtPointOption(365.0f, 169.0f, 18);
                        setFontSize(11);
                        setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                        drawStringDoubleM("1500", 400.0f, 220.0f, 17);
                        break;
                    case 2:
                        stageClearImage[20].drawAtPointOption(365.0f, 169.0f, 18);
                        break;
                    case 3:
                        stageClearImage[16].drawAtPointOption(365.0f, 169.0f, 18);
                        break;
                    case 4:
                        stageClearImage[21].drawAtPointOption(365.0f, 169.0f, 18);
                        break;
                    case 5:
                        stageClearImage[15].drawAtPointOption(365.0f, 169.0f, 18);
                        break;
                    case 6:
                        stageClearImage[22].drawAtPointOption(365.0f, 169.0f, 18);
                        break;
                    case 7:
                        stageClearImage[18].drawAtPointOption(365.0f, 169.0f, 18);
                        setFontSize(11);
                        setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                        drawStringDoubleM("1000", 400.0f, 220.0f, 17);
                        break;
                    case 8:
                        stageClearImage[17].drawAtPointOption(365.0f, 169.0f, 18);
                        break;
                    case 9:
                        stageClearImage[18].drawAtPointOption(365.0f, 169.0f, 18);
                        setFontSize(11);
                        setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                        drawStringDoubleM("2500", 400.0f, 220.0f, 17);
                        break;
                }
                if (checkTouchListStatus == 5) {
                    uiPopupImage[13].drawAtPointOption(213.0f, 289.0f, 18);
                } else {
                    uiPopupImage[12].drawAtPointOption(213.0f, 289.0f, 18);
                }
                setFontDoubleColor(ViewCompat.MEASURED_STATE_MASK, ViewCompat.MEASURED_STATE_MASK);
                setFontSize(15);
                drawStringDoubleM(rewardDataString[GameThread.rewardShowOrder * 3], CX, 153.0f, 17);
                setFontColor(ViewCompat.MEASURED_STATE_MASK);
                drawStringM(rewardDataString[(GameThread.rewardShowOrder * 3) + 1], CX, 243.0f, 17);
                drawStringM(rewardDataString[(GameThread.rewardShowOrder * 3) + 2], CX, 262.0f, 17);
                break;
            case 5:
                stageClearImage[23].drawAtPointOption(124.0f, myOscillator[12].getCurrentPosition() + 196, 18);
                stageClearImage[24].drawAtPointOption(202.0f, myOscillator[13].getCurrentPosition() + 196, 18);
                stageClearImage[25].drawAtPointOption(270.0f, myOscillator[14].getCurrentPosition() + 196, 18);
                stageClearImage[26].drawAtPointOption(347.0f, myOscillator[15].getCurrentPosition() + 196, 18);
                stageClearImage[24].drawAtPointOption(416.0f, myOscillator[16].getCurrentPosition() + 196, 18);
                stageClearImage[27].drawAtPointOption(484.0f, myOscillator[17].getCurrentPosition() + 196, 18);
                stageClearImage[28].drawAtPointOption(552.0f, myOscillator[18].getCurrentPosition() + 196, 18);
                stageClearImage[29].drawAtPointOption(623.0f, myOscillator[19].getCurrentPosition() + 196, 18);
                break;
            case 6:
                uiPopupImage[7].drawAtPointOption(201.0f, 101.0f, 18);
                stageClearImage[14].drawAtPointOption(291.0f, 111.0f, 18);
                stageClearImage[22].drawAtPointOption(365.0f, 169.0f, 18);
                if (checkTouchListStatus == 5) {
                    uiPopupImage[13].drawAtPointOption(213.0f, 289.0f, 18);
                } else {
                    uiPopupImage[12].drawAtPointOption(213.0f, 289.0f, 18);
                }
                setFontDoubleColor(ViewCompat.MEASURED_STATE_MASK, ViewCompat.MEASURED_STATE_MASK);
                setFontSize(15);
                drawStringDoubleM("A Hero's normal attack has been upgraded.", CX, 153.0f, 17);
                setFontColor(ViewCompat.MEASURED_STATE_MASK);
                drawStringM("Champion: Splashed damage", CX, 243.0f, 17);
                break;
            case 7:
                uiPopupImage[7].drawAtPointOption(201.0f, 101.0f, 18);
                stageClearImage[14].drawAtPointOption(291.0f, 111.0f, 18);
                stageClearImage[22].drawAtPointOption(365.0f, 169.0f, 18);
                if (checkTouchListStatus == 5) {
                    uiPopupImage[13].drawAtPointOption(213.0f, 289.0f, 18);
                } else {
                    uiPopupImage[12].drawAtPointOption(213.0f, 289.0f, 18);
                }
                setFontDoubleColor(ViewCompat.MEASURED_STATE_MASK, ViewCompat.MEASURED_STATE_MASK);
                setFontSize(15);
                drawStringDoubleM("A Hero's normal attack has been upgraded.", CX, 153.0f, 17);
                setFontColor(ViewCompat.MEASURED_STATE_MASK);
                drawStringM("Bow Master: Double Shot", CX, 243.0f, 17);
                break;
            case 8:
                uiPopupImage[7].drawAtPointOption(201.0f, 101.0f, 18);
                stageClearImage[14].drawAtPointOption(291.0f, 111.0f, 18);
                stageClearImage[22].drawAtPointOption(365.0f, 169.0f, 18);
                if (checkTouchListStatus == 5) {
                    uiPopupImage[13].drawAtPointOption(213.0f, 289.0f, 18);
                } else {
                    uiPopupImage[12].drawAtPointOption(213.0f, 289.0f, 18);
                }
                setFontDoubleColor(ViewCompat.MEASURED_STATE_MASK, ViewCompat.MEASURED_STATE_MASK);
                setFontSize(15);
                drawStringDoubleM("A Hero's normal attack has been upgraded.", CX, 153.0f, 17);
                setFontColor(ViewCompat.MEASURED_STATE_MASK);
                drawStringM("Archmage: Splashed damage", CX, 243.0f, 17);
                break;
        }
        if (GameThread.gameSubStatus == 2) {
            float f19 = darkViewCount * 0.033f;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f19, f19, f19, f19);
            f = 0.0f;
            fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        } else {
            f = 0.0f;
        }
        if (GameThread.gameSubStatus == 3) {
            uiThemeclearImage[0].drawAtPointOption(f, f, 18);
            int i12 = darkViewCount;
            if (i12 <= 64) {
                if (i12 <= 34) {
                    uiThemeclearImage[1].drawAtPointOption(200.0f, (i12 - 34) * 20, 18);
                } else {
                    uiThemeclearImage[1].drawAtPointOption(200.0f, 0.0f, 18);
                }
            }
            int i13 = darkViewCount;
            if (i13 > 34) {
                if (i13 < 64) {
                    float f20 = ((float) (i13 - 34)) * 0.033f;
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f20, f20, f20, f20);
                    uiThemeclearImage[2].drawAtPointOption(200.0f, 0.0f, 18);
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                } else {
                    uiThemeclearImage[2].drawAtPointOption(200.0f, 0.0f, 18);
                }
            }
            int i15 = darkViewCount < 88 ? (88 - darkViewCount) * 20 : 0;
            int chapter = st.SID / 10;
            for (int i = 0; i < 5; i++) {
                if (i < chapter) {
                    uiThemeclearImage[4].drawAtPointOption((i * 150) + 17, i15 + 222, 18);
                } else if (i > chapter) {
                    uiThemeclearImage[6].drawAtPointOption((i * 150) + 41, i15 + 248, 18);
                } else {
                    uiThemeclearImage[3].drawAtPointOption(40.0f, i15 + 247, 18);

                    if (darkViewCount < 88 || darkViewCount >= 168 || (darkViewCount - 88) % 20 != 1)
                        uiThemeclearImage[5].drawAtPointOption((chapter * 150) + 132, i15 + 258, 18);

                    int i21 = chapter * 150;
                    drawThemeTowerUnit(0, DataStage.heroAvail[0], i21 + 101, i15 + 281);
                    drawThemeTowerUnit(DataStage.heroAvail[1] ? 1 : 4, DataStage.heroAvail[1], i21 + 66, i15 + 299);
                    drawThemeTowerUnit(DataStage.heroAvail[2] ? 2 : 8, DataStage.heroAvail[2], i21 + 134, i15 + 299);

                    setFontSize(25);
                    setFontColor(-1);
                    drawStringM(String.format("Theme %d. %s Cleared", i18, GameThread.chapterName[chapter]), CX, i15 + 104, 17);
                    drawStringM(String.format("Opened Next Theme. %s", GameThread.chapterName[i18]), CX, i15 + 385, 17);
                    i++;
                }
            }
        }
        TouchManager.swapTouchMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:

        if (r11 > 1.0f) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f4, code lost:

        if (r5 > 1.0f) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0132, code lost:

        if (r5 > 1.0f) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018f, code lost:

        if (r0 > 1.0f) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c5, code lost:

        if (r0 > 1.0f) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01fb, code lost:

        if (r0 > 1.0f) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x023f, code lost:

        if (r0 > 1.0f) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0282, code lost:

        if (r0 > 1.0f) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02cb, code lost:

        if (r0 > 1.0f) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void paint_GAME_OVER(GL10 gl10) {
        float f;
        float f2;
        float f3 = 1f;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        st.map.checkBackBase();
        backBaseImageArray[lastShowBackBase].drawAtPointOption(0.0f, 0.0f, 18);
        backShadowImage.drawAtPointOption(0.0f, 0.0f, 18);
        drawMapTile(gl10);
        drawAllUnit(gl10);
        drawPlayingUi(false);
        TouchManager.clearTouchMap();
        int i = GameThread.gameSubStatus;
        if (i == 0) {
            TouchManager.addTouchRectListData(3, CGRectMake(0.0f, 0.0f, SCRWIDTH, SCRHEIGHT));
        } else if (i == 1) {
            if (startViewCount < 270) {
                TouchManager.addTouchRectListData(4, CGRectMake(0.0f, 0.0f, SCRWIDTH, SCRHEIGHT));
            } else {
                TouchManager.addTouchRectListData(2, CGRectMake(155.0f, 380.0f, 128.0f, 61.0f));
                TouchManager.addTouchRectListData(0, CGRectMake(336.0f, 380.0f, 128.0f, 61.0f));
                TouchManager.addTouchRectListData(1, CGRectMake(517.0f, 380.0f, 128.0f, 61.0f));
            }
        }
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 5;
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        int i2 = GameThread.gameSubStatus;
        if (i2 == 0) {
            if (startViewCount < 10) {
                float f11 = (10 - r0) * 0.1f;
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f11, f11, f11, f11);
                fillWhiteImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            } else {
                float f12 = (r0 - 10) * GAME_OVER_ANIM_BLACK_VIEW_ALPHA;
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f12, f12, f12, f12);
                fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
            stageClearImage[2].drawAtPointOption(CX, myOscillator[11].getCurrentPosition() + 199, 17);
        } else if (i2 == 1 || i2 == 2) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(0.7f, 0.7f, 0.7f, 0.7f);
            fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            if (startViewCount < 30) {
                f = (r11 - 0) * 0.033f;
            }
            f = 1.0f;
            if (f > 0.0f) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f, f, f, f);
                stageClearImage[0].drawAtPointOption(CX, 6.0f, 17);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
            setFontSize(18);
            setFontColor(-1);
            int i3 = startViewCount;
            if (i3 < 60) {
                f2 = ((float) (i3 - 30)) * 0.033f;
            }
            f2 = 1.0f;
            if (f2 > 0.0f) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f2, f2, f2, f2);
                drawStringM("Score", 259.0f, 108.0f, 18);
                drawStringM(String.valueOf((int) GameThread.destroyScore), 540.0f, 108.0f, 20);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
            int i4 = startViewCount;
            if (i4 < 90) {
                f3 = ((float) (i4 - 60)) * 0.033f;
            }
            if (f3 > 0.0f) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f3, f3, f3, f3);
                GameRenderer.drawStringM("Health:", 259.0f, 140.0f, 18);
                GameRenderer.drawStringM(String.format("%d/%d", st.Life, DataStage.maxLife), 540.0f, 140.0f, 20);
                if (st.perfectClear()) {
                    stageClearImage[13].drawAtPointOption(553.0f, 131.0f, 18);
                }
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
            int i5 = startViewCount;
            if (i5 < 120) {
                f4 = ((float) (i5 - 90)) * 0.033f;
            }
            f4 = 1.0f;
            if (f4 > 0.0f) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f4, f4, f4, f4);
                drawStringM("Gold", 259.0f, 172.0f, 18);
                drawStringM(String.valueOf(st.Money), 540.0f, 172.0f, 20);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
            int i6 = startViewCount;
            if (i6 < 150) {
                f5 = ((float) (i6 - 120)) * 0.033f;
            }
            f5 = 1.0f;
            if (f5 > 0.0f) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f5, f5, f5, f5);
                drawStringM("Mana", 259.0f, 206.0f, 18);
                drawStringM(String.valueOf(st.Mana), 540.0f, 206.0f, 20);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
            int i7 = startViewCount;
            if (i7 < 180) {
                f6 = ((float) (i7 - 150)) * 0.033f;
            }
            f6 = 1.0f;
            if (f6 > 0.0f) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f6, f6, f6, f6);
                stageClearImage[3].drawAtPointOption(270.0f, 257.0f, 18);
                drawNumberBlock(st.bScore, numberTotalImage, 530.0f, 257.0f, 0, 20, 1);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
            int i8 = startViewCount;
            if (i8 < 210) {
                f7 = ((float) (i8 - 180)) * 0.033f;
            }
            f7 = 1.0f;
            if (f7 > 0.0f) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f7, f7, f7, f7);
                stageClearImage[4].drawAtPointOption(287.0f, 288.0f, 18);
                drawNumberBlock(GameThread.stageClearViewHeroism, numberClearImage, 513.0f, 288.0f, 0, 20, 1);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
            int i9 = startViewCount;
            if (i9 < 240) {
                f8 = ((float) (i9 - 210)) * 0.033f;
            }
            f8 = 1.0f;
            if (f8 > 0.0f) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(f8, f8, f8, f8);
                setFontDoubleColor(-1, -15385258);
                drawStringDoubleM("Highest Score", 290.0f, 328.0f, 18);
                drawStringDoubleM(String.valueOf(GameThread.highScoreValue[GameThread.mapNumber][GameThread.mapAttackType]), 508.0f, 328.0f, 20);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
            int i10 = startViewCount;
            if (i10 < 270) {
                f9 = ((float) (i10 - 240)) * 0.033f;
            }
            f9 = 1.0f;
            if (f9 > 0.0f) {
                if (checkTouchListStatus == 2) {
                    f10 = 380.0f;
                    stageClearImage[10].drawAtPointOption(155.0f, 380.0f, 18);
                } else {
                    f10 = 380.0f;
                    stageClearImage[9].drawAtPointOption(155.0f, 380.0f, 18);
                }
                if (checkTouchListStatus == 0) {
                    stageClearImage[8].drawAtPointOption(336.0f, f10, 18);
                } else {
                    stageClearImage[7].drawAtPointOption(336.0f, f10, 18);
                }
                if (checkTouchListStatus == 1) {
                    stageClearImage[12].drawAtPointOption(517.0f, f10, 18);
                } else {
                    stageClearImage[11].drawAtPointOption(517.0f, f10, 18);
                }
            }
        }
        if (GameThread.gameSubStatus == 2) {
            float f13 = darkViewCount * 0.033f;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f13, f13, f13, f13);
            fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        TouchManager.swapTouchMap();
    }

    public void sellTowerUnit(TowerUnit u) {
        if (u instanceof HeroUnit)
            return;

        st.Money += u.getSellPrice();
        st.towerUnit.remove(u);
        st.arrowUnit.removeIf(arr -> arr.shooter == u);
    }

    public void touchCheck_GAME_STAGE_START_VIEW() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        if (TouchManager.checkTouchYesnoStatus() == 2 && startViewCount == 15) {
            GameThread.playSound(14);
            startViewCount++;
        }
        TouchManager.processTouchStatus();
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x038e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void touchCheck_GAME_PLAYING() {
        int checkTowerUnit;
        int i;
        int checkTowerUnit2;
        int i2 = TouchManager.lastActionStatus;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = 12;
            if (st.waveManager.wavePattern != 3 && GameThread.characterMenuMonsterViewCount > 0) {
                GameThread.characterMenuMonsterViewCount = 0;
            }
            int checkTouchListStatus = TouchManager.checkTouchListStatus();
            switch (checkTouchListStatus) {
                case 11:
                case 12:
                case 13:
                    return;
                default:
                    int i5 = characterMenuSelectFlag;
                    if (i5 != 0) {
                        if (i5 != 3) {
                            return;
                        }
                        switch (checkTouchListStatus) {
                            case 8:
                            case 9:
                            case 10:
                                switch (checkTouchListStatus) {
                                    case 9:
                                        i = GameThread.heroUnitType[1];
                                        break;
                                    case 10:
                                        i = GameThread.heroUnitType[2];
                                        break;
                                    default:
                                        i = GameThread.heroUnitType[0];
                                        break;
                                }
                                int i6 = checkTouchListStatus - 8;
                                if (checkEnableHeroBuyUnit(i6)) {
                                    characterMenuSelectFlag = 4;
                                    GameThread.characterAddOrder = i6;
                                    GameThread.characterAddNumber = i;
                                    GameThread.characterAddHeroFlag = true;
                                    GameThread.characterAddType = 4;
                                    return;
                                }
                                TouchManager.processTouchStatus();
                                return;
                            default:
                                characterMenuSelectFlag = 0;
                                myOscillator[8].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                myOscillator[9].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                myOscillator[10].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                TouchManager.clearTouchStatus();
                                return;
                        }
                    }
                    if (checkTouchListStatus != 0 && checkTouchListStatus != 1 && checkTouchListStatus != 2 && checkTouchListStatus != 3 && checkTouchListStatus != 4 && checkTouchListStatus != 5) {
                        if (checkTouchListStatus == 7 || (checkTowerUnit = GameThread.checkTowerUnit()) == -1) {
                            return;
                        }
                        GameThread.tempCharacterRangeViewNumber = checkTowerUnit;
                        return;
                    }
                    if (checkTouchListStatus != 0) {
                        if (checkTouchListStatus == 1) {
                            i4 = 3;
                        } else if (checkTouchListStatus != 2) {
                            if (checkTouchListStatus == 3) {
                                i4 = 15;
                            } else if (checkTouchListStatus == 4) {
                                i4 = 24;
                            } else if (checkTouchListStatus == 5) {
                                i4 = 27;
                            }
                        }
                        if (!checkEnableBuyUnit(i4)) {
                            characterMenuSelectFlag = 1;
                            GameThread.characterAddOrder = checkTouchListStatus;
                            GameThread.characterAddNumber = i4;
                            GameThread.characterAddHeroFlag = false;
                            GameThread.characterAddType = 1;
                            while (i3 < 7) {
                                if (i3 != checkTouchListStatus) {
                                    myOscillator[i3].initWithTwoWayStartPosition(0, 200, 10, 210, 5);
                                }
                                i3++;
                            }
                            return;
                        }
                        TouchManager.processTouchStatus();
                        return;
                    }
                    i4 = 0;
                    if (!checkEnableBuyUnit(i4)) {
                    }
                    break;
            }
        } else {
            if (i2 == 1) {
                if (characterMenuSelectFlag == 0 && (checkTowerUnit2 = GameThread.checkTowerUnit()) != -1) {
                    GameThread.tempCharacterRangeViewNumber = checkTowerUnit2;
                    return;
                }
                return;
            }
            if (i2 != 2) {
                return;
            }
            GameThread.tempCharacterRangeViewNumber = -1;
            int checkTouchListStatus2 = TouchManager.checkTouchListStatus();
            if (checkTouchListStatus2 == 7) {
                characterMenuSelectFlag = 3;
                myOscillator[8].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
                myOscillator[9].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
                myOscillator[10].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
                TouchManager.processTouchStatus();
                return;
            }
            switch (checkTouchListStatus2) {
                case 11:
                    GameThread.stopLoopSound(2);
                    GameThread.playSound(14);
                    GameThread.gameStatus = 21;
                    GameThread.gameSubStatus = 0;
                    TouchManager.processTouchStatus();
                    return;
                case 12:
                    GameThread.playSound(14);
                    st.waveManager.waveRunF = !st.waveManager.waveRunF;
                    TouchManager.processTouchStatus();
                    return;
                case 13:
                    GameThread.playSound(14);
                    st.turbo = (byte)(st.turbo == 1 ? 3 : 1);
                    TouchManager.processTouchStatus();
                    return;
                default:
                    switch (characterMenuSelectFlag) {
                        case 0:
                            int checkTowerUnit3 = GameThread.checkTowerUnit();
                            if (checkTowerUnit3 != -1) {
                                GameThread.playSound(14);
                                characterMenuSelectFlag = 2;
                                GameThread.characterSelectNumber = checkTowerUnit3;
                                if (GameThread.characterMenuMonsterViewCount > 0) {
                                    GameThread.characterMenuMonsterViewCount = 0;
                                    break;
                                }
                            } else {
                                int searchEnemyTouch = GameThread.searchEnemyTouch();
                                if (searchEnemyTouch != -1) {
                                    if (GameThread.commonTargetType == 0 && GameThread.commonTargetNumber == searchEnemyTouch) {
                                        GameThread.playSound(14);
                                        GameThread.commonTargetType = -1;
                                        characterMenuSelectFlag = 0;
                                        break;
                                    } else {
                                        GameThread.playSound(14);
                                        GameThread.characterSelectNumber = searchEnemyTouch;
                                        GameThread.commonTargetType = 0;
                                        GameThread.commonTargetNumber = searchEnemyTouch;
                                        break;
                                    }
                                } else {
                                    int searchObjectTouch = GameThread.searchObjectTouch();
                                    if (searchObjectTouch != -1) {
                                        if (GameThread.commonTargetType == 1 && GameThread.commonTargetNumber == searchObjectTouch) {
                                            GameThread.playSound(14);
                                            GameThread.commonTargetType = -1;
                                            characterMenuSelectFlag = 0;
                                            break;
                                        } else {
                                            GameThread.playSound(14);
                                            GameThread.commonTargetType = 1;
                                            GameThread.commonTargetNumber = searchObjectTouch;
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 1:
                            characterMenuSelectFlag = 0;
                            if (NewTower.gameThread.enableAddUnit()) {
                                GameThread.playSound(14);
                                getAddSettingPosition();
                                st.addUnit(GameThread.characterAddNumber, (int) ((characterAddPosX - 62.0f) / 45.0f), (int) ((characterAddPosY - 30.0f) / 45.0f));
                                st.Money -= TowerUnit.getBuyPrice(GameThread.characterAddNumber);
                                characterMenuSelectFlag = 0;
                            }
                            while (i3 < 7) {
                                if (i3 != GameThread.characterAddOrder)
                                    myOscillator[i3].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                                i3++;
                            }
                            break;
                        case 2:
                            switch (checkTouchListStatus2) {
                                case 14:
                                    GameThread.playSound(14);
                                    sellTowerUnit(st.selectedUnit);
                                    st.selectedUnit = null;
                                    break;
                                case 15:
                                    GameThread.playSound(14);
                                    characterMenuSelectFlag = 12;
                                    break;
                                case 16:
                                    GameThread.playSound(14);
                                    characterMenuSelectFlag = 13;
                                    break;
                                case 17:
                                default:
                                    characterMenuSelectFlag = 0;
                                    break;
                                case 18:
                                    GameThread.playSound(14);
                                    ((HeroUnit)st.selectedUnit).useSpecialAttack();
                                    break;
                                case 19:
                                    break;
                            }
                        case 4:
                            characterMenuSelectFlag = 0;
                            if (NewTower.gameThread.enableAddUnit()) {
                                GameThread.playSound(14);
                                getAddSettingPosition();
                                st.selectedUnit = st.addHero(GameThread.characterAddOrder, (int) ((characterAddPosX - 62.0f) / 45.0f), (int) ((characterAddPosY - 30.0f) / 45.0f), true);
                                myOscillator[8].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                myOscillator[9].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                myOscillator[10].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                characterMenuSelectFlag = 6;
                                if (GameThread.characterMenuMonsterViewCount > 0) {
                                    GameThread.characterMenuMonsterViewCount = 0;
                                    break;
                                }
                            } else {
                                characterMenuSelectFlag = 0;
                                myOscillator[8].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                myOscillator[9].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                myOscillator[10].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                break;
                            }
                            break;
                        case 5:
                            if (checkTouchListStatus2 == 17) {
                                GameThread.playSound(14);
                                st.Money -= TowerUnit.getBuyPrice(GameThread.characterAddNumber);
                                characterMenuSelectFlag = 0;
                                break;
                            } else if (checkTouchListStatus2 != 19) {
                                GameThread.towerUnit[GameThread.characterSelectNumber].towerType = -1;
                                characterMenuSelectFlag = 0;
                                break;
                            }
                            break;
                        case 6:
                            if (checkTouchListStatus2 == 17) {
                                GameThread.playSound(14);
                                st.Mana -= HeroUnit.getHeroBuyPrice(GameThread.characterAddOrder);
                                characterMenuSelectFlag = 0;
                                break;
                            } else if (checkTouchListStatus2 != 19) {
                                GameThread.towerUnit[GameThread.characterSelectNumber].towerType = -1;
                                characterMenuSelectFlag = 0;
                                break;
                            }
                            break;
                        case 8:
                            GameThread.specialAttackSkipFlag = true;
                            GameThread.killSound(19);
                            GameThread.killSound(16);
                            break;
                        case 9:
                            GameThread.specialAttackSkipFlag = true;
                            GameThread.killSound(19);
                            GameThread.killSound(17);
                            break;
                        case 10:
                            GameThread.specialAttackSkipFlag = true;
                            GameThread.killSound(19);
                            GameThread.killSound(18);
                            break;
                        case 12:
                            if (checkTouchListStatus2 == 20) {
                                GameThread.playSound(14);
                                st.selectedUnit.upgradeUnit();
                                characterMenuSelectFlag = 2;
                                break;
                            } else if (checkTouchListStatus2 == 21) {
                                GameThread.playSound(15);
                                characterMenuSelectFlag = 2;
                                break;
                            }
                            break;
                        case 13:
                            if (checkTouchListStatus2 == 20) {
                                GameThread.playSound(14);
                                st.selectedUnit.levelUpUnit();
                                characterMenuSelectFlag = 2;
                                break;
                            } else if (checkTouchListStatus2 == 21) {
                                GameThread.playSound(15);
                                characterMenuSelectFlag = 2;
                                break;
                            }
                            break;
                    }
                    TouchManager.processTouchStatus();
            }
        }
    }

    public void touchCheck_GAME_INGAME_MENU() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (GameThread.gameSubStatus == 0) {
            if (checkTouchListStatus == 0) {
                GameThread.playLoopSound(2);
                GameThread.playSound(15);
                GameThread.gameStatus = 25;
            } else if (checkTouchListStatus == 1) {
                GameRenderer.titlePressed = 1;
                GameThread.gameSubStatus = 1;
                GameRenderer.darkViewCount = 0;
            } else if (checkTouchListStatus == 2) {
                GameRenderer.titlePressed = 2;
                GameThread.gameSubStatus = 1;
                GameRenderer.darkViewCount = 0;
            }
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_STAGE_CLEAR() {
        if (TouchManager.lastActionStatus != 2)
            return;

        switch (GameThread.gameSubStatus) {
            case 1:
                int checkTouchListStatus = TouchManager.checkTouchListStatus();
                if (checkTouchListStatus == 0) {
                    GameRenderer.titlePressed = 0;
                    GameThread.gameSubStatus = 2;
                    GameRenderer.darkViewCount = 0;
                    break;
                } else if (checkTouchListStatus == 1) {
                    GameRenderer.titlePressed = 1;
                    GameThread.gameSubStatus = 2;
                    GameRenderer.darkViewCount = 0;
                    break;
                } else if (checkTouchListStatus == 2) {
                    GameRenderer.titlePressed = 2;
                    GameThread.gameSubStatus = 2;
                    GameRenderer.darkViewCount = 0;
                    break;
                } else if (checkTouchListStatus == 4) {
                    if (startViewCount < 270) {
                        GameThread.playSound(1);
                        startViewCount = 270;
                        break;
                    }
                } else if (checkTouchListStatus == 6) {
                    GameThread.gameSubStatus = 0;
                    GameThread.setEndingData(GameThread.gameSubStatus);
                    GameThread.gameStatus = 27;
                    GameThread.playLoopSound(2);
                    break;
                }
                break;
            case 3:
                if (GameRenderer.darkViewCount >= 168) {
                    GameThread.gameSubStatus = 1;
                    break;
                }
                break;
            case 4:
                if (TouchManager.checkTouchListStatus() == 5) {
                    if (GameThread.rewardShowOrder == 6) {
                        GameThread.gameSubStatus = 6;
                        break;
                    } else if (GameThread.mapNumber % 10 == 9 && GameThread.mapNumber != 49) {
                        GameRenderer.darkViewCount = 0;
                        GameThread.gameSubStatus = 3;
                        break;
                    } else {
                        GameThread.gameSubStatus = 1;
                        break;
                    }
                }
                break;
            case 5:
                if (myOscillator[19].currentCount >= 5) {
                    if (GameThread.rewardShowOrder != -1) {
                        GameThread.gameSubStatus = 4;
                        break;
                    } else if (GameThread.mapNumber % 10 == 9 && GameThread.mapNumber != 49) {
                        GameRenderer.darkViewCount = 0;
                        GameThread.gameSubStatus = 3;
                        break;
                    } else {
                        GameThread.gameSubStatus = 1;
                        break;
                    }
                }
                break;
            case 6:
                if (TouchManager.checkTouchListStatus() == 5) {
                    GameThread.gameSubStatus = 7;
                    break;
                }
                break;
            case 7:
                if (TouchManager.checkTouchListStatus() == 5) {
                    GameThread.gameSubStatus = 8;
                    break;
                }
                break;
            case 8:
                if (TouchManager.checkTouchListStatus() == 5) {
                    if (GameThread.mapNumber % 10 == 9 && GameThread.mapNumber != 49) {
                        GameRenderer.darkViewCount = 0;
                        GameThread.gameSubStatus = 3;
                    } else {
                        GameThread.gameSubStatus = 1;
                    }
                }
                break;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_OVER() {
        if (TouchManager.lastActionStatus != 2)
            return;


        if (GameThread.gameSubStatus == 1) {
            int checkTouchListStatus = TouchManager.checkTouchListStatus();
            if (checkTouchListStatus == 0) {
                GameRenderer.titlePressed = 0;
                GameThread.gameSubStatus = 2;
                GameRenderer.darkViewCount = 0;
            } else if (checkTouchListStatus == 1) {
                GameRenderer.titlePressed = 1;
                GameThread.gameSubStatus = 2;
                GameRenderer.darkViewCount = 0;
            } else if (checkTouchListStatus == 2) {
                GameRenderer.titlePressed = 2;
                GameThread.gameSubStatus = 2;
                GameRenderer.darkViewCount = 0;
            } else if (checkTouchListStatus == 4 && startViewCount < 270) {
                GameThread.playSound(1);
                startViewCount = 270;
            }
        }
    }

    public void drawMonsterViewMenu() {
        int y = 300;
        float size = 0.7f;
        int eWave = st.waveManager.current % st.waveManager.wcc;
        int stWave = Math.min(st.waveManager.current, DataWave.WAVE_MAX_COUNT - 1);
        int overWave = st.waveManager.current - DataWave.WAVE_MAX_COUNT;
        int uiPosY = GameThread.characterMenuMonsterStartViewCount < 10 ? (10 - GameThread.characterMenuMonsterStartViewCount) * 9 : 0;
        if (st.waveManager.waveMobData[eWave][3] == -1) {
            size = 1;
            y += 90;
        }
        uiMonsterEtcImage[2].drawAtPointOption(0, y + uiPosY, 34);
        for (int i14 = 0; i14 < 2; i14++) {
            if (st.waveManager.waveMobData[eWave][i14 * 3] == -1)
                continue;

            int type = st.waveManager.waveMobData[eWave][i14 * 3];
            int amount = st.waveManager.waveMobData[eWave][(i14 * 3) + 1];
            int monVis = MonsterUnit.getMonsterImageOrder(type);

            int spd;
            int bossType = st.waveManager.waveMobData[eWave][6];
            if (bossType == 2 || bossType == 3) {
                spd = (((DataMonster.monsterData[type][4] * 150) * (DataWave.monsterWaveData[stWave][10] + (DataWave.monsterWaveData[60][10] * overWave))) / 100) / 100;
            } else
                spd = (((DataMonster.monsterData[type][4] * 150) * (DataWave.monsterWaveData[stWave][2] + (DataWave.monsterWaveData[60][2] * overWave))) / 100) / 100;

            int i17 = DataMonster.monsterData[type][1];
            int hp;
            if (bossType == 2 || bossType == 3) {
                hp = (((i17 * DataWave.monsterWaveData[stWave][8]) / 100) * DataStage.stageData[st.SID][3]) / 100;
                if (st.waveManager.current >= DataWave.WAVE_MAX_COUNT)
                    hp += DataWave.monsterWaveData[60][8] * overWave;
            } else {
                hp = (((i17 * DataWave.monsterWaveData[stWave][0]) / 100) * DataStage.stageData[st.SID][2]) / 100;
                if (st.waveManager.current >= DataWave.WAVE_MAX_COUNT)
                    hp += DataWave.monsterWaveData[60][0] * overWave;
            }

            int aY = (y - 390) + 445;
            uiMonsterEtcImage[0].drawAtPointOption(0.0f, aY + 390 + uiPosY, 18);
            uiMonsterEtcImage[1].drawAtPointOption(556.0f, aY + 411 + uiPosY, 18);
            uiMonsterFaceImage[monVis].drawAtPointOptionSize(130.0f, aY + 470 + uiPosY, 33, size);
            uiMonsterNameImage[monVis].drawAtPointOption(370.0f, aY + 407 + uiPosY, 17);
            GameRenderer.setFontSize(25);
            GameRenderer.setFontColor(-1);
            GameRenderer.drawStringM(String.format("x %d", amount), (uiMonsterNameImage[monVis]._sizeX / 2.0f) + 380.0f, aY + 7 + 410 + uiPosY, 18);
            GameRenderer.setFontSize(20);
            GameRenderer.setFontColor(-8716355);
            float bY = aY + uiPosY;
            GameRenderer.drawStringM(String.valueOf(hp), 582.0f, bY, 17);
            GameRenderer.drawStringM(String.valueOf(spd), 679.0f, bY, 17);
            y += 90;
        }
    }

    public void drawThemeTowerUnit(int type, boolean hero, float x, float y) {
        if (type == -1)
            return;

        int[] drawData;
        Texture2D[] textures;
        if (hero) {
            drawData = DataAnim.towerDrawData[type];
            textures = st.page.towerImages[type];
        } else {
            drawData = DataAnim.heroDrawData[type];
            textures = st.page.heroImages[type];
        }

        int main = drawData[drawData[1] + 1];
        int len = drawData[drawData[0] + drawData[main + 1 + ((GameThread.gameTimeCount / 5) % drawData[main])]];
        shadowImage[0].drawAtPointOption(x, y + 10.0f, 9);
        for (int i = 0; i < drawData[len]; i++) {
            int i10 = (i * 5) + len + 1;
            int i11 = i10 + 3;
            if (drawData[i11] != 1000) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(drawData[i11] / 1000f);
            }
            if (drawData[i10 + 4] == 0)
                textures[drawData[i10]].drawAtPointOption(drawData[i10 + 1] + x, y + drawData[i10 + 2] + 10.0f, 18);
            else
                textures[drawData[i10]].drawAtPointOptionFlip(drawData[i10 + 1] + x, y + drawData[i10 + 2] + 10.0f, 18);

            if (drawData[i11] != 1000) {
                Texture2D.setColors(1);
            }
        }
    }



    /* JADX WARN: Code restructure failed: missing block: B:193:0x00aa, code lost:

        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00a8, code lost:

        if (st.Mana < r13) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:

        if (st.Money < r13) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:

        r15 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x035c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawCharMenu() {
        int specialType;
        int buyPrice;
        int levelUpPrice;
        int upType;
        int towerImg;
        int towerBox;
        int downgradeImg;
        int sellPrice;
        int upgradePrice;
        boolean affordable;
        boolean z2 = false;
        int i11;
        int i12;
        int i13;
        int i14;
        int i17 = GameThread.characterSelectNumber;
        if (st.selectedUnit == null)
            return;

        int towerImageOrder = st.selectedUnit.type;
        if (!(st.selectedUnit instanceof HeroUnit hero)) {
            upType = st.selectedUnit.getUpgradeType();
            levelUpPrice = st.selectedUnit.getLevelupPrice();
            upgradePrice = st.selectedUnit.getUpgradePrice();
            sellPrice = st.selectedUnit.getSellPrice();
            buyPrice = TowerUnit.getBuyPrice(st.selectedUnit.type);
            downgradeImg = st.selectedUnit.getDowngradeType();
            towerBox = TowerUnit.getTowerBoxImageOrder(upType);
            towerImg = upType;
            specialType = 0;
            affordable = st.Money < upgradePrice;
        } else {
            specialType = hero.specialType;
            buyPrice = HeroUnit.getHeroBuyPrice(hero.type);
            levelUpPrice = hero.getLevelupPrice();
            upType = towerImg = towerBox = downgradeImg = -1;
            sellPrice = upgradePrice = 0;
            affordable = st.Mana < upgradePrice;
        }
        TouchManager.clearTouchMap();
        Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
        Texture2D.gl.glColor4f(0.2f, 0.2f, 0.2f, 0.2f);
        fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH, 343.0f);
        Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        uiCharEtcImage[0].drawAtPointOption(0.0f, 343.0f, 18);
        int i22 = upgradeCount;
        if (i22 > 0) {
            if (i22 > 5) {
                if (downgradeImg != -1) {
                    uiCharFaceImage[downgradeImg].drawAtPointOption(0 - ((10 - i22) * 80), SCRHEIGHT_SMALL, 34);
                    uiCharNameImage[downgradeImg].drawAtPointOptionHorizonSize(287.0f, 321.0f, 10, (upgradeCount - 5) * 0.2f);
                }
            } else if (towerImageOrder != -1) {
                uiCharFaceImage[towerImageOrder].drawAtPointOption((-i22) * 80, SCRHEIGHT_SMALL, 34);
                uiCharNameImage[towerImageOrder].drawAtPointOptionHorizonSize(287.0f, 321.0f, 10, (5 - upgradeCount) * 0.2f);
            }
        } else {
            uiCharFaceImage[towerImageOrder].drawAtPointOption(0.0f, SCRHEIGHT_SMALL, 34);
            uiCharNameImage[towerImageOrder].drawAtPointOption(287.0f, 305.0f, 18);
        }
        if (st.selectedUnit instanceof HeroUnit)
            uiCharEtcImage[8].drawAtPointOption(287.0f, 288.0f, 18);

        uiCharEtcImage[12].drawAtPointOption(278.0f, 356.0f, 18);
        uiCharEtcImage[1].drawAtPointOption(288.0f, 359.0f, 18);
        uiCharEtcImage[2].drawAtPointOption(486.0f, 314.0f, 18);
        uiCharEtcImage[st.selectedUnit.level + 3].drawAtPointOption(519.0f, 314.0f, 18);
        setFontSize(14);
        setFontColor(-8128317);
        drawStringM(String.valueOf(st.selectedUnit.getHitPower()), 420.0f, 360.0f, 20);
        if (st.selectedUnit.towerCoolTimeMax == 1) {
            drawStringM("MAX", 420.0f, 388.0f, 20);
        } else
            drawStringM(String.valueOf(st.selectedUnit.getAttackSpeed()), 420.0f, 388.0f, 20);

        drawStringM(String.valueOf(st.selectedUnit.attackRange), 420.0f, 416.0f, 20);
        drawStringM(getEffectTypeString(st.selectedUnit.effectType), 420.0f, 442.0f, 20);
        int i23 = characterMenuSelectFlag;
        if (i23 != 2) {
            if (i23 == 5 || i23 == 6) {
                TouchManager.addTouchRectListData(17, CGRectMake(670.0f, 350.0f, 115.0f, 115.0f));
                TouchManager.addTouchRectListData(19, CGRectMake(0.0f, 343.0f, SCRWIDTH, 137.0f));
                TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 20;
                int checkTouchListStatus = TouchManager.checkTouchListStatus();
                if (!(st.selectedUnit instanceof HeroUnit hero)) {
                    i13 = 18;
                } else if (hero.specialType == 0) {
                    i13 = 18;
                    uiCharEtcImage[9].drawAtPointOption(440.0f, 400.0f, 18);
                } else if (hero.specialType == 1) {
                    i13 = 18;
                    uiCharEtcImage[10].drawAtPointOption(440.0f, 400.0f, 18);
                } else {
                    if (specialType != 2) {
                        i14 = 17;
                        i13 = 18;
                        if (checkTouchListStatus != i14) {
                            setFontColor(-1);
                            uiCharButtonImage[5].drawAtPointOption(670.0f, 350.0f, i13);
                            if (GameThread.towerUnit[i17].heroFlag == 1) {
                                uiUpperImage[upper_mana].drawAtPointOption(696.0f, 428.0f, i13);
                            } else {
                                uiUpperImage[upper_money].drawAtPointOption(696.0f, 427.0f, i13);
                            }
                            drawStringM(String.valueOf(buyPrice), 755.0f, 430.0f, 20);
                            return;
                        }
                        setFontColor(-1);
                        uiCharButtonImage[4].drawAtPointOption(670.0f, 350.0f, i13);
                        if (GameThread.towerUnit[i17].heroFlag == 1) {
                            uiUpperImage[upper_mana].drawAtPointOption(696.0f, 428.0f, i13);
                        } else {
                            uiUpperImage[upper_money].drawAtPointOption(696.0f, 427.0f, i13);
                        }
                        drawStringM(String.valueOf(buyPrice), 755.0f, 430.0f, 20);
                        return;
                    }
                    i13 = 18;
                    uiCharEtcImage[11].drawAtPointOption(440.0f, 400.0f, 18);
                }
                i14 = 17;
                if (checkTouchListStatus != i14) {
                }
            } else if (i23 != 12 && i23 != 13) {
                return;
            }
        }
        if (!(st.selectedUnit instanceof HeroUnit)) {
            TouchManager.addTouchRectListData(14, CGRectMake(15.0f, 390.0f, 75.0f, 75.0f));
        }
        if (upType != -1 && !affordable) {
            TouchManager.addTouchRectListData(15, CGRectMake(435.0f, 350.0f, 235.0f, 115.0f));
        }
        if (st.selectedUnit.level < getTowerMaxLevel(GameThread.towerUnit[i17].heroFlag) - 1 && !z2) {
            TouchManager.addTouchRectListData(16, CGRectMake(670.0f, 350.0f, 115.0f, 115.0f));
        }
        if (st.selectedUnit instanceof HeroUnit hero && Config.rewardValues[3] && hero.specialCooltime <= 0 && st.Mana >= hero.specialMana)
            TouchManager.addTouchRectListData(18, CGRectMake(625.0f, 272.0f, 160.0f, 69.0f));

        TouchManager.addTouchRectListData(19, CGRectMake(0.0f, 343.0f, SCRWIDTH, 137.0f));
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 20;
        int checkTouchListStatus2 = TouchManager.checkTouchListStatus();
        if (!(st.selectedUnit instanceof HeroUnit)) {
            if (checkTouchListStatus2 == 14) {
                uiCharButtonImage[7].drawAtPointOption(15.0f, 390.0f, 18);
            } else {
                uiCharButtonImage[6].drawAtPointOption(15.0f, 390.0f, 18);
            }
            i11 = -1;
            setFontColor(-1);
            drawStringM(String.valueOf(sellPrice), 80.0f, 430.0f, 20);
        } else {
            i11 = -1;
        }
        if (upType != i11) {
            i12 = 18;
            if (checkTouchListStatus2 == 15) {
                uiCharButtonImage[1].drawAtPointOption(435.0f, 350.0f, 18);
            } else {
                uiCharButtonImage[0].drawAtPointOption(435.0f, 350.0f, 18);
            }
            uiCharUpFaceImage[towerBox].drawAtPointOption(514.0f, 364.0f, i12);
            uiCharNameImage[towerImg].drawAtPointOptionSize(653.0f, 449.0f, 36, 0.4f);
            drawStringM(String.valueOf(upgradePrice), 503.0f, 421.0f, 20);
            if (affordable) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
                fillBlackImage.fillRect(435.0f, 350.0f, 235.0f, 115.0f);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
            if (upgradeCount > 0) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                GL10 gl10 = Texture2D.gl;
                int i24 = upgradeCount;
                gl10.glColor4f(i24 * 0.1f, i24 * 0.1f, i24 * 0.1f, i24 * 0.1f);
                fillWhiteImage.fillRect(435.0f, 350.0f, 235.0f, 115.0f);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
        if (st.selectedUnit.level < getTowerMaxLevel(st.selectedUnit instanceof HeroUnit) - 1) {
            if (st.selectedUnit instanceof HeroUnit) {
                uiCharButtonImage[checkTouchListStatus2 == 16 ? 15 : 14].drawAtPointOption(670.0f, 350.0f, 18);
            } else {
                uiCharButtonImage[checkTouchListStatus2 == 16 ? 3 : 2].drawAtPointOption(670.0f, 350.0f, 18);
                if (checkTouchListStatus2 != 16) {
                    int i25 = st.selectedUnit.level * 2;
                    uiCharButtonImage[i25 + 17].drawAtPointOption(708.0f, 401.0f, 17);
                    uiCharButtonImage[i25 + 19].drawAtPointOption(764.0f, 401.0f, 17);
                } else {
                    int i26 = st.selectedUnit.level * 2;
                    uiCharButtonImage[i26 + 16].drawAtPointOption(708.0f, 401.0f, 17);
                    uiCharButtonImage[i26 + 18].drawAtPointOption(764.0f, 401.0f, 17);
                }
                drawStringM(String.valueOf(levelUpPrice), 756.0f, 423.0f, 20);
                if (z2) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
                    fillBlackImage.fillRect(670.0f, 350.0f, 115.0f, 115.0f);
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                }
                if (levelUpCount > 0) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    GL10 gl102 = Texture2D.gl;
                    int i27 = levelUpCount;
                    gl102.glColor4f(i27 * 0.1f, i27 * 0.1f, i27 * 0.1f, i27 * 0.1f);
                    fillWhiteImage.fillRect(670.0f, 350.0f, 115.0f, 115.0f);
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                }
            }
        }
        if (st.selectedUnit instanceof HeroUnit hero && Config.rewardValues[3]) {
            int dInd = (hero.type * 2) + 8;
            if (checkTouchListStatus2 == 18)
                dInd++;
            uiCharButtonImage[dInd].drawAtPointOption(625.0f, 272.0f, 18);

            if (hero.specialCooltime > 0 || st.Mana < hero.specialMana) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
                fillBlackImage.fillRect(631.0f, 278.0f, (hero.specialCooltime * 148) / hero.specialMaxCooltime, 57.0f);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
            GameRenderer.drawStringM(String.valueOf(hero.specialMana), 730.0f, 318.0f, 20);
        }
    }

    public static int getTowerLevelOrder(int i, int i2) {
        if (i2 == 1) {
            return i % GameThread.TOWER_MAX_LEVEL_HERO;
        }
        return i % GameThread.TOWER_MAX_LEVEL_NORMAL;
    }

    public static int getTowerMaxLevel(boolean isHero) {
        if (isHero)
            return GameThread.TOWER_MAX_LEVEL_HERO;
        return GameThread.TOWER_MAX_LEVEL_NORMAL;
    }

    public void drawPlayingUi(boolean init) {
        TouchManager.clearTouchMap();
        TouchManager.addTouchRectListData(11, CGRectMake(0.0f, 437.0f, 43.0f, 39.0f));
        TouchManager.addTouchRectListData(12, CGRectMake(0.0f, 344.0f, 43.0f, 39.0f));
        TouchManager.addTouchRectListData(13, CGRectMake(0.0f, 393.0f, 43.0f, 39.0f));
        int i = characterMenuSelectFlag;
        if (i == 0) {
            TouchManager.addTouchRectListData(7, CGRectMake(742.0f, 12.0f, 56.0f, 56.0f));
        } else if (i == 3) {
            int heroPos = GameThread.SPECIAL_ATTACK_ARROW_LEG_POS_Y;
            for (int i3 = 0; i3 < 3; i3++)
                if (!DataStage.heroAvail[i3])
                    heroPos += 60;
            for (int i4 = 0; i4 < 3; i4++)
                if (DataStage.heroAvail[i4]) {
                    if (checkEnableHeroBuyUnit(i4))
                        TouchManager.addTouchRectListData(i4 + 8, CGRectMake(heroPos, 12.0f, 56.0f, 56.0f));
                    heroPos += 60;
                }
        }
        TouchManager.addTouchRectListData(0, CGRectMake(742.0f, 77.0f, 56.0f, 56.0f));
        TouchManager.addTouchRectListData(1, CGRectMake(742.0f, 142.0f, 56.0f, 56.0f));
        TouchManager.addTouchRectListData(2, CGRectMake(742.0f, 207.0f, 56.0f, 56.0f));
        TouchManager.addTouchRectListData(3, CGRectMake(742.0f, 272.0f, 56.0f, 56.0f));
        TouchManager.addTouchRectListData(4, CGRectMake(742.0f, 337.0f, 56.0f, 56.0f));
        TouchManager.addTouchRectListData(5, CGRectMake(742.0f, 402.0f, 56.0f, 56.0f));
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 14;

        drawUpperUI();
        boolean sele = characterMenuSelectFlag == 3 || characterMenuSelectFlag == 4 || characterMenuSelectFlag == 6;
        uiButtonImage[((sele || !checkEnableBuyUnit(0)) ? 9 : 0)].drawAtPointOption(myOscillator[0].getCurrentPosition() + 770, 77.0f, 17);
        drawNumberBlock(TowerUnit.getBuyPrice(0), numberUnitBuyImage, myOscillator[0].getCurrentPosition() + 770, 114.0f, -2, 17, 1);
        uiButtonImage[((sele || !checkEnableBuyUnit(1)) ? 9 : 0) + 1].drawAtPointOption(myOscillator[1].getCurrentPosition() + 770, 142.0f, 17);
        drawNumberBlock(TowerUnit.getBuyPrice(1), numberUnitBuyImage, myOscillator[1].getCurrentPosition() + 770, 179.0f, -2, 17, 1);
        uiButtonImage[((sele || !checkEnableBuyUnit(4)) ? 9 : 0) + 2].drawAtPointOption(myOscillator[2].getCurrentPosition() + 770, 207.0f, 17);
        drawNumberBlock(TowerUnit.getBuyPrice(4), numberUnitBuyImage, myOscillator[2].getCurrentPosition() + 770, 244.0f, -2, 17, 1);
        uiButtonImage[((sele || !checkEnableBuyUnit(5)) ? 9 : 0) + 3].drawAtPointOption(myOscillator[3].getCurrentPosition() + 770, 272.0f, 17);
        drawNumberBlock(TowerUnit.getBuyPrice(5), numberUnitBuyImage, myOscillator[3].getCurrentPosition() + 770, 309.0f, -2, 17, 1);
        uiButtonImage[((sele || !checkEnableBuyUnit(8)) ? 9 : 0) + 4].drawAtPointOption(myOscillator[4].getCurrentPosition() + 770, 337.0f, 17);
        drawNumberBlock(TowerUnit.getBuyPrice(8), numberUnitBuyImage, myOscillator[4].getCurrentPosition() + 770, 374.0f, -2, 17, 1);
        uiButtonImage[((sele || !checkEnableBuyUnit(9)) ? 9 : 0) + 5].drawAtPointOption(myOscillator[5].getCurrentPosition() + 770, 402.0f, 17);
        drawNumberBlock(TowerUnit.getBuyPrice(9), numberUnitBuyImage, myOscillator[5].getCurrentPosition() + 770, 439.0f, -2, 17, 1);
        if (characterMenuSelectFlag == 3 && myOscillator[8].currentCount < 10) {
            float f = myOscillator[8].currentCount * 0.1f;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f, f, f, f);
        }
        int i8 = 586;
        for (int i9 = 0; i9 < 3; i9++) {
            if (GameThread.heroUnitType[i9] == -1) {
                i8 += 60;
            }
        }
        for (int i10 = 0; i10 < 3; i10++) {
            if (GameThread.heroUnitType[i10] != -1) {
                int heroBuyPrice = HeroUnit.getHeroBuyPrice(i10);
                int i11 = GameThread.heroUnitType[i10];
                int i12 = i10 + 8;
                uiButtonImage[(i11 != 0 ? i11 != 5 ? i11 != 10 ? 0 : 8 : 7 : 6) + (checkEnableHeroBuyUnit(i10) ? 0 : 9)].drawAtPointOption(myOscillator[i12].getCurrentPosition() + i8, 12.0f, 17);
                drawNumberBlock(heroBuyPrice, numberHeroBuyImage, i8 + 5 + myOscillator[i12].getCurrentPosition(), 49.0f, -2, 17, 1);
                uiUpperImage[upper_hero].drawAtPointOption((i8 - 17) + myOscillator[i12].getCurrentPosition(), 49.0f, 17);
                i8 += 60;
            }
        }
        if (characterMenuSelectFlag == 3 && myOscillator[8].currentCount < 10) {
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        uiButtonImage[18].drawAtPointOption(770.0f, 12.0f, 17);
        int i13 = characterMenuSelectFlag;
        if (i13 == 2 || i13 == 5 || i13 == 6) {
            drawCharMenu();
        } else if (i13 == 12) {
            drawCharMenu();
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(20, CGRectMake(162.0f, 290.0f, 236.0f, 43.0f));
            TouchManager.addTouchRectListData(21, CGRectMake(402.0f, 290.0f, 236.0f, 43.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 22;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
            fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            uiPopupImage[0].drawAtPointOption(152.0f, 144.0f, 18);
            uiPopupImage[4].drawAtPointOption(392.0f, 160.0f, 18);
            int i14 = GameThread.towerUnit[GameThread.characterSelectNumber].towerType;
            int upgradeType = st.selectedUnit.getUpgradeType();
            if (upgradeType != -1) {
                int upgradePrice = st.selectedUnit.getUpgradePrice();
                int towerImageOrder = getTowerImageOrder(upgradeType, 0);
                int towerBoxImageOrder = getTowerBoxImageOrder(upgradeType);
                uiCharButtonImage[0].drawAtPointOption(161.0f, 154.0f, 18);
                uiCharUpFaceImage[towerBoxImageOrder].drawAtPointOption(240.0f, 168.0f, 18);
                uiCharNameImage[towerImageOrder].drawAtPointOptionSize(379.0f, 253.0f, 36, 0.4f);
                drawStringM(String.valueOf(upgradePrice), 229.0f, 225.0f, 20);
                setFontSize(16);
                setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                drawStringDoubleM("Do you want to change this unit's class?", CX, 270.0f, 17);
                drawStringDoubleM(String.valueOf(GameThread.towerUnit[GameThread.characterSelectNumber].getHitPower()), 540.0f, 162.0f, 20); //temp
                if (GameThread.towerUnit[GameThread.characterSelectNumber].towerCoolTimeMax == 1) {
                    drawStringDoubleM("MAX", 540.0f, 189.0f, 20);
                } else {
                    drawStringDoubleM(String.valueOf(GameThread.getAttackSpeed(GameThread.towerUnit[GameThread.characterSelectNumber].towerCoolTimeMax)), 540.0f, 189.0f, 20);
                }
                drawStringDoubleM(String.valueOf(GameThread.towerUnit[GameThread.characterSelectNumber].attackRange), 540.0f, 217.0f, 20);
                drawStringDoubleM(getEffectTypeString(GameThread.towerUnit[GameThread.characterSelectNumber].effectType), 540.0f, 243.0f, 20);
                GameThread.compareTowerUnit.towerType = upgradeType;
                GameThread.compareTowerUnit.heroFlag = false;
                GameThread.compareTowerUnit.restatTowerUnit(false);
                drawStringDoubleM(String.valueOf(GameThread.compareTowerUnit.getHitPower()), 625.0f, 162.0f, 20);
                if (GameThread.compareTowerUnit.towerCoolTimeMax == 1) {
                    drawStringDoubleM("MAX", 625.0f, 189.0f, 20);
                } else {
                    drawStringDoubleM(String.valueOf(GameThread.getAttackSpeed(GameThread.compareTowerUnit.towerCoolTimeMax)), 625.0f, 189.0f, 20);
                }
                drawStringDoubleM(String.valueOf(GameThread.compareTowerUnit.attackRange), 625.0f, 217.0f, 20);
                drawStringDoubleM(getEffectTypeString(GameThread.compareTowerUnit.effectType), 625.0f, 243.0f, 20);
                int checkTouchListStatus = TouchManager.checkTouchListStatus();
                if (checkTouchListStatus == 20) {
                    uiPopupImage[6].drawAtPointOption(162.0f, 290.0f, 18);
                } else {
                    uiPopupImage[5].drawAtPointOption(162.0f, 290.0f, 18);
                }
                if (checkTouchListStatus == 21) {
                    uiPopupImage[3].drawAtPointOption(402.0f, 290.0f, 18);
                } else {
                    uiPopupImage[2].drawAtPointOption(402.0f, 290.0f, 18);
                }
            }
        } else if (i13 == 13) {
            drawCharMenu();
            int i15 = GameThread.towerUnit[GameThread.characterSelectNumber].towerType;
            TouchManager.clearTouchMap();
            TouchManager.addTouchRectListData(20, CGRectMake(162.0f, 290.0f, 236.0f, 43.0f));
            TouchManager.addTouchRectListData(21, CGRectMake(402.0f, 290.0f, 236.0f, 43.0f));
            TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 22;
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
            fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            uiPopupImage[0].drawAtPointOption(152.0f, 144.0f, 18);
            uiPopupImage[1].drawAtPointOption(170.0f, 160.0f, 18);
            if (getTowerLevelOrder(i15, GameThread.towerUnit[GameThread.characterSelectNumber].heroFlag) < getTowerMaxLevel(GameThread.towerUnit[GameThread.characterSelectNumber].heroFlag) - 1) {
                setFontSize(16);
                setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
                drawStringDoubleM("Do you want to Level Up?", CX, 270.0f, 17);
                drawStringDoubleM(String.valueOf(GameThread.towerUnit[GameThread.characterSelectNumber].getHitPower()), 430.0f, 162.0f, 20);
                if (GameThread.towerUnit[GameThread.characterSelectNumber].towerCoolTimeMax == 1) {
                    drawStringDoubleM("MAX", 430.0f, 189.0f, 20);
                } else {
                    drawStringDoubleM(String.valueOf(GameThread.getAttackSpeed(GameThread.towerUnit[GameThread.characterSelectNumber].towerCoolTimeMax)), 430.0f, 189.0f, 20);
                }
                drawStringDoubleM(String.valueOf(GameThread.towerUnit[GameThread.characterSelectNumber].attackRange), 430.0f, 217.0f, 20);
                drawStringDoubleM(getEffectTypeString(GameThread.towerUnit[GameThread.characterSelectNumber].effectType), 430.0f, 243.0f, 20);
                GameThread.compareTowerUnit.towerType = i15 + 1;
                GameThread.compareTowerUnit.heroFlag = GameThread.towerUnit[GameThread.characterSelectNumber].heroFlag;
                GameThread.compareTowerUnit.restatTowerUnit(false);
                drawStringDoubleM(String.valueOf(GameThread.compareTowerUnit.getHitPower()), 526.0f, 162.0f, 20);
                if (GameThread.compareTowerUnit.towerCoolTimeMax == 1) {
                    drawStringDoubleM("MAX", 526.0f, 189.0f, 20);
                } else {
                    drawStringDoubleM(String.valueOf(GameThread.getAttackSpeed(GameThread.compareTowerUnit.towerCoolTimeMax)), 526.0f, 189.0f, 20);
                }
                drawStringDoubleM(String.valueOf(GameThread.compareTowerUnit.attackRange), 526.0f, 217.0f, 20);
                drawStringDoubleM(getEffectTypeString(GameThread.compareTowerUnit.effectType), 526.0f, 243.0f, 20);
                int checkTouchListStatus2 = TouchManager.checkTouchListStatus();
                if (checkTouchListStatus2 == 20) {
                    uiPopupImage[6].drawAtPointOption(162.0f, 290.0f, 18);
                } else {
                    uiPopupImage[5].drawAtPointOption(162.0f, 290.0f, 18);
                }
                if (checkTouchListStatus2 == 21) {
                    uiPopupImage[3].drawAtPointOption(402.0f, 290.0f, 18);
                } else {
                    uiPopupImage[2].drawAtPointOption(402.0f, 290.0f, 18);
                }
            }
        }
        if (init) {
            TouchManager.swapTouchMap();
        }
    }

    public static int getTowerImageOrder(int i, int i2) {
        if (i == -1)
            return 0;

        if (i2 == 1)
            return DataHero.heroData[i][13] + 12;
        //TODO - Bruh
        return DataCharacter.charData[i][12];
    }

    public boolean checkEnableBuyUnit(int i) {
        return st.Money >= TowerUnit.getBuyPrice(i);
    }

    public boolean checkEnableHeroBuyUnit(int i) {
        for (TowerUnit twu : st.towerUnit)
            if (twu instanceof HeroUnit && twu.type == i)
                return false;

        return st.Mana >= HeroUnit.getHeroBuyPrice(i);
    }
}
