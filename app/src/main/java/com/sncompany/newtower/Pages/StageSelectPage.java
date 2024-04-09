package com.sncompany.newtower.Pages;

import androidx.core.util.Consumer;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataMap;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataWaveMob;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.R;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.TouchManager;

import javax.microedition.khronos.opengles.GL10;

public class StageSelectPage extends TPage {

    public static final int GAME_STAGE_SELECT_TOUCH_LIST_0_BACK = 0;
    public static final int GAME_STAGE_SELECT_TOUCH_LIST_10_CHAPTER1 = 10;
    public static final int GAME_STAGE_SELECT_TOUCH_LIST_11_CHAPTER2 = 11;
    public static final int GAME_STAGE_SELECT_TOUCH_LIST_12_CHAPTER3 = 12;
    public static final int GAME_STAGE_SELECT_TOUCH_LIST_13_CHAPTER4 = 13;
    public static final int GAME_STAGE_SELECT_TOUCH_LIST_14_CHAPTER5 = 14;
    public static final int GAME_STAGE_SELECT_TOUCH_LIST_3_STAGE_LEFT = 3;
    public static final int GAME_STAGE_SELECT_TOUCH_LIST_4_STAGE_RIGHT = 4;
    public static final int GAME_STAGE_SELECT_TOUCH_LIST_5_ENGAGE = 5;
    public static final int GAME_STAGE_SELECT_TOUCH_LIST_6_NORMAL = 6;
    public static final int GAME_STAGE_SELECT_TOUCH_LIST_7_INFINITY = 7;
    public static final int GAME_STAGE_SELECT_TOUCH_LIST_8_GATEBREAKER = 8;
    public static final int GAME_STAGE_SELECT_TOUCH_LIST_9_MAP_VIEW = 9;
    public static final int GAME_STAGE_SELECT_TOUCH_LIST_TOTAL_COUNT = 15;
    public static final int BACK = 0, START = 1, ARROW_L = 2, ARROW_R = 3, MIN_MAPMODE = 4, MAX_MAPMODE = MIN_MAPMODE + 2, MIN_CHAPTER = MAX_MAPMODE + 2, MAX_CHAPTER = MIN_CHAPTER + 4;
    public static final int[] numberStagePointResource = {R.drawable.num_stage_point_0, R.drawable.num_stage_point_1, R.drawable.num_stage_point_2, R.drawable.num_stage_point_3, R.drawable.num_stage_point_4, R.drawable.num_stage_point_5, R.drawable.num_stage_point_6, R.drawable.num_stage_point_7, R.drawable.num_stage_point_8, R.drawable.num_stage_point_9};
    public static final int[] uiStageResource = {R.drawable.ui_stage_leftwindow, R.drawable.ui_stage_rightwindow, R.drawable.ui_stage_effect1, R.drawable.ui_stage_effect2, R.drawable.ui_stage_effect3, R.drawable.ui_stage_effect4, R.drawable.ui_stage_effect5, R.drawable.ui_stage_back_off, R.drawable.ui_stage_back_on, R.drawable.ui_stage_chapterleft_off, R.drawable.ui_stage_chapterleft_on, R.drawable.ui_stage_chapterright_off, R.drawable.ui_stage_chapterright_on, R.drawable.ui_stage_stageleft_off, R.drawable.ui_stage_stageleft_on, R.drawable.ui_stage_stageright_off, R.drawable.ui_stage_stageright_on, R.drawable.ui_stage_chapter, R.drawable.ui_stage_1, R.drawable.ui_stage_2, R.drawable.ui_stage_3, R.drawable.ui_stage_4, R.drawable.ui_stage_5, R.drawable.ui_stage_name1, R.drawable.ui_stage_name2, R.drawable.ui_stage_name3, R.drawable.ui_stage_name4, R.drawable.ui_stage_name5, R.drawable.ui_stage_wave, R.drawable.ui_stage_highscore, R.drawable.ui_stage_stagebox, R.drawable.ui_stage_stageselect, R.drawable.ui_stage_engage_off, R.drawable.ui_stage_engage_on, R.drawable.ui_stage_mapline, R.drawable.ui_stage_normal_off, R.drawable.ui_stage_normal_on, R.drawable.ui_stage_infinity_off, R.drawable.ui_stage_infinity_on, R.drawable.ui_stage_gatebreaker_off, R.drawable.ui_stage_gatebreaker_on, R.drawable.ui_stage_infinity_noselect, R.drawable.ui_stage_gatebreaker_noselect, R.drawable.ui_stage_new, R.drawable.ui_stage_stage, R.drawable.ui_stage_lock, R.drawable.ui_stage_perfect};
    public static final int[] uiStageBossResource = {R.drawable.ui_stage_boss1, R.drawable.ui_stage_boss2, R.drawable.ui_stage_boss3, R.drawable.ui_stage_boss4, R.drawable.ui_stage_boss5};

    public final Texture2D[] numberStagePointImage = new Texture2D[numberStagePointResource.length];
    public final Texture2D[] uiStageImage = new Texture2D[uiStageResource.length];
    private final Texture2D uiStageBossImage = new Texture2D();

    public int stageSelectChapterNumber, stageSelectStageNumber, mapNumber = -1, mapAttackType, stageLoad = 0;
    public DataMap map;

    public StageSelectPage(TPage par) {
        super(par);
    }

    @Override
    public void load(Consumer<Float> prog) {
        for (int i = 0; i < numberStagePointImage.length; i++)
            numberStagePointImage[i] = new Texture2D(numberStagePointResource[i]);
        for (int i = 0; i < uiStageImage.length; i++)
            uiStageImage[i] = new Texture2D(uiStageResource[i]);
        uiStageBossImage.initWithImageName(uiStageBossResource[0]);
        map = DataMap.loadMap(0, true);
    }

    @Override
    public void update() {
        if (mapNumber >= 0 && stageLoad > 0) {
            stageLoad++;
            if (stageLoad >= 15) {
                stageLoad = -1;
                GameThread.stopLoopSound(1);
            }
        } //End of update_GAME_STAGE_SELECT
        if (stageLoad != -1)
            return;

        Config.lastPlayed = (byte)((stageSelectChapterNumber * 10) + stageSelectStageNumber);
        int[][] iArr = gamePlayedCount;
        int i3 = mapNumber;
        int[] iArr2 = iArr[mapNumber];
        int i4 = mapAttackType;
        iArr2[i4] = iArr2[i4] + 1;
        if (iArr[i3][i4] > 3) {
            int[] iArr3 = awardDataValue;
            iArr3[52] = iArr3[52] + 1;
            recheckAwardData();
        }
        Config.saveAll();
        gameStatus = 20; //Stage start view
        GameRenderer.startViewCount = 0;

        for (int i5 = 0; i5 < 11; i5++) {
            if (i5 < 8)
                myOscillator[i5].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
            else
                myOscillator[i5].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
            myOscillator[i5].fastForward();
        }
        DataStage nst = new DataStage(mapNumber, mapAttackType);

        GameThread.playLoopSound(2);
        NewTower.switchPage(new LoadingPage(new StagePage(this, nst, map)), true); //End of update_GAME_STAGE_START_LOADING
    }

    public void paint_GAME_STAGE_SELECT(GL10 gl10) {
        float f;
        TouchManager.clearTouchMap();

        TouchManager.addTouchRectListData(BACK, CGRectMake(0.0f, 392.0f, 75.0f, 88.0f));
        TouchManager.addTouchRectListData(START, CGRectMake(429.0f, 180.0f, 54.0f, 82.0f));

        if (stageSelectStageNumber > 0)
            TouchManager.addTouchRectListData(ARROW_L, CGRectMake(717.0f, 180.0f, 54.0f, 82.0f));
        if (stageSelectStageNumber < 9)
            TouchManager.addTouchRectListData(ARROW_R, CGRectMake(519.0f, 286.0f, 161.0f, 53.0f));

        if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][0] != -1)
            TouchManager.addTouchRectListData(MIN_MAPMODE, CGRectMake(409.0f, 368.0f, 130.0f, 44.0f));
        if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][0] >= 1)
            TouchManager.addTouchRectListData(MIN_MAPMODE + 1, CGRectMake(535.0f, 368.0f, 130.0f, 44.0f));
        if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][0] == 2)
            TouchManager.addTouchRectListData(MAX_MAPMODE, CGRectMake(661.0f, 368.0f, 130.0f, 44.0f));

        TouchManager.addTouchRectListData(7, CGRectMake(500.0f, 160.0f, 200.0f, 120.0f)); //Appears to be the minimap box
        TouchManager.addTouchRectListData(MIN_CHAPTER, CGRectMake(0.0f, 301.0f, 204.0f, 147.0f));
        TouchManager.addTouchRectListData(MIN_CHAPTER + 1, CGRectMake(184.0f, 274.0f, 214.0f, 133.0f));
        TouchManager.addTouchRectListData(MIN_CHAPTER + 2, CGRectMake(0.0f, 161.0f, 211.0f, 140.0f));
        TouchManager.addTouchRectListData(MIN_CHAPTER + 3, CGRectMake(210.0f, 0.0f, 190.0f, 224.0f));
        TouchManager.addTouchRectListData(MAX_CHAPTER, CGRectMake(0.0f, 0.0f, 211.0f, 161.0f));
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = MAX_CHAPTER + 1;

        int LTS = TouchManager.checkTouchListStatus();
        uiStageImage[0].drawAtPointOption(0.0f, 0.0f, 18);
        uiStageImage[1].drawAtPointOption(400.0f, 0.0f, 18);
        uiStageBossImage.drawAtPointOption(400.0f, 0.0f, 18);
        uiStageImage[34].drawAtPointOption(496.0f, 156.0f, 18);

        uiStageImage[LTS == 0 ? 8 : 7].drawAtPointOption(1.0f, 421.0f, 18);
        uiStageImage[stageSelectChapterNumber + 23].drawAtPointOption(600.0f, 38.0f, 17);

        uiStageImage[44].drawAtPointOption(470.0f, 96.0f, 18);
        drawNumberBlock((stageSelectChapterNumber * 10) + stageSelectStageNumber + 1, numberStagePointImage, 581.0f, 97.0f, 0, 20, 1);
        uiStageImage[28].drawAtPointOption(624.0f, 96.0f, 18);
        drawNumberBlock(DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[(stageSelectChapterNumber * 10) + stageSelectStageNumber], numberStagePointImage, 705.0f, 97.0f, 0, 18, 2);
        uiStageImage[29].drawAtPointOption(469.0f, 124.0f, 18);
        drawNumberBlock(Config.highScores[(stageSelectChapterNumber * 10) + stageSelectStageNumber][mapAttackType], numberStagePointImage, 732.0f, 125.0f, 0, 20, 1);

        if (stageSelectStageNumber > 0)
            uiStageImage[LTS == 3 ? 14 : 13].drawAtPointOption(429.0f, 180.0f, 18);
        if (stageSelectStageNumber < 9)
            uiStageImage[LTS == 4 ? 16 : 15].drawAtPointOption(717.0f, 180.0f, 18);

        map.checkBackBase();
        drawSmallMap(500.0f, 160.0f, 0.25f);
        if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][0] == 2)
            uiStageImage[46].drawAtPointOption(503.0f, 163.0f, 18);

        if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][0] == -1) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
            fillBlackImage.fillRect(500.0f, 160.0f, 200.0f, 120.0f);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            uiStageImage[45].drawAtPointOption(600.0f, 220.0f, 9);
        }

        uiStageImage[mapAttackType == 0 ? 36 : 35].drawAtPointOption(409.0f, 368.0f, 18);

        if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][0] == 0)
            uiStageImage[43].drawAtPointOption(415.0f, 364.0f, 18);

        if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][1] == -1) {
            uiStageImage[41].drawAtPointOption(535.0f, 368.0f, 18);
        } else {
            uiStageImage[mapAttackType == 1 ? 38 : 37].drawAtPointOption(535.0f, 368.0f, 18);

            if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][1] == 0) //NEW Text
                uiStageImage[43].drawAtPointOption(541.0f, 364.0f, 18);
        }
        if (GameThread.gamePlayedCount[(GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber][2] == -1) {
            uiStageImage[42].drawAtPointOption(661.0f, 368.0f, 18);
        } else {
            if (GameThread.mapAttackType == 2) {
                uiStageImage[40].drawAtPointOption(661.0f, 368.0f, 18);
            } else {
                uiStageImage[39].drawAtPointOption(661.0f, 368.0f, 18);
            }
            if (GameThread.gamePlayedCount[(GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber][2] == 0) {
                uiStageImage[43].drawAtPointOption(667.0f, 364.0f, 18);
            }
        }
        uiStageImage[30].drawAtPointOption(549.0f, 349.0f, 18);
        int i2 = GameThread.gameTimeCount % 28;
        if (i2 > 0 && i2 < 34) {
            float f2 = 1.0f - ((i2 < 17 ? i2 + 0 : 34 - i2) * GAME_STAGE_SELECT_STAGE_FADE_DEGREE);
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f2, f2, f2, f2);
        }
        uiStageImage[31].drawAtPointOption((GameThread.stageSelectStageNumber * 10) + 543, 343.0f, 18);
        if (i2 > 0 && i2 < 34) {
            float f3 = 1.0f - ((i2 < 17 ? i2 - 0 : 34 - i2) * GAME_STAGE_SELECT_VIEW_FADE_DEGREE);
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f3, f3, f3, f3);
        }
        int i3 = GameThread.stageSelectChapterNumber;
        if (i3 != 0) {
            if (i3 == 1) {
                uiStageImage[3].drawAtPointOption(169.0f, 252.0f, 18);
            } else if (i3 == 2) {
                uiStageImage[4].drawAtPointOption(0.0f, 49.0f, 18);
            } else if (i3 == 3) {
                uiStageImage[5].drawAtPointOption(189.0f, 0.0f, 18);
            } else if (i3 == 4) {
                uiStageImage[6].drawAtPointOption(0.0f, 0.0f, 18);
            }
            f = 286.0f;
        } else {
            f = 286.0f;
            uiStageImage[2].drawAtPointOption(0.0f, 286.0f, 18);
        }
        Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        if (LTS == 5) {
            uiStageImage[33].drawAtPointOption(519.0f, f, 18);
        } else {
            uiStageImage[32].drawAtPointOption(519.0f, f, 18);
        }
        if (GameThread.gamePlayedCount[(GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber][0] == -1 && !GameThread.cheatData[3]) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
            fillBlackImage.fillRect(527.0f, 294.0f, 145.0f, 37.0f);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (stageLoad > 0) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            GL10 gl102 = Texture2D.gl;
            gl102.glColor4f(stageLoad * 0.066f, stageLoad * 0.066f, stageLoad * 0.066f, stageLoad * 0.066f);
            fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH_SMALL, SCRHEIGHT_SMALL);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        TouchManager.swapTouchMap();
    }

    public void paint_GAME_STAGE_START_LOADING(GL10 gl10) {
    }

    @Override
    public void touchCheck() {
        if (mapNumber != -1)
            return;
        int touch = TouchManager.checkTouchListStatus();

        if (touch >= MIN_MAPMODE && touch <= MAX_MAPMODE) {
            GameThread.playSound(14);
            mapAttackType = touch - MIN_MAPMODE;
        } else if (touch >= MIN_CHAPTER && touch <= MAX_CHAPTER) {
            GameThread.playSound(14);
            int ol = stageSelectStageNumber;
            stageSelectStageNumber = touch - MIN_CHAPTER;
            map = DataMap.loadMap((stageSelectChapterNumber * 10) + stageSelectStageNumber, true);
            mapAttackType = 0;

            if (ol != stageSelectStageNumber) {
                uiStageBossImage.dealloc();
                uiStageBossImage.initWithImageName(uiStageBossResource[stageSelectStageNumber]);
            }
        } else {
            switch (TouchManager.checkTouchListStatus()) {
                case 0:
                    GameThread.playSound(15);
                    GameThread.stopLoopSound(1);
                    NewTower.switchPage(new LoadingPage(parent), true);
                    break;
                case 1:
                    if (stageSelectStageNumber > 0) {
                        GameThread.playSound(14);
                        stageSelectStageNumber--;

                        map = DataMap.loadMap((stageSelectChapterNumber * 10) + stageSelectStageNumber, true);
                        mapAttackType = 0;
                        break;
                    }
                    break;
                case 2:
                    if (stageSelectStageNumber < 9) {
                        GameThread.playSound(14);
                        stageSelectStageNumber++;

                        DataMap.loadMap((stageSelectChapterNumber * 10) + stageSelectStageNumber, true);
                        mapAttackType = 0;
                        break;
                    }
                    break;
                case 3:
                    GameThread.playSound(14);
                    if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][mapAttackType] >= 0) {
                        mapNumber = (stageSelectChapterNumber * 10) + stageSelectStageNumber;
                        stageLoad++;
                        break;
                    }
                    break;
            }
        }
        if (TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch()) == 9 && TouchManager.checkTouchMoveDegree(true)) {
            GameThread.playSound(14);
            if (TouchManager.lastMoveCheckDistance.y > 0.0f) {
                if (stageSelectStageNumber < 9) {
                    stageSelectStageNumber++;

                    map = DataMap.loadMap((stageSelectChapterNumber * 10) + stageSelectStageNumber, true);
                    mapAttackType = 0;
                }
            } else if (TouchManager.lastMoveCheckDistance.y < 0.0f && stageSelectStageNumber > 0) {
                stageSelectStageNumber--;

                map = DataMap.loadMap((stageSelectChapterNumber * 10) + stageSelectStageNumber, true);
                mapAttackType = 0;
            }
        }
        TouchManager.processTouchStatus();
    }

    public static void drawSmallMap(float f, float f2, float f3) {
        backBaseImageArray[lastShowBackBase].drawAtPointOptionSize(f, f2, 18, f3);
        drawMapTileSize(f, f2, f3);
    }

    @Override
    public void unload() {
        for (Texture2D num : numberStagePointImage) num.dealloc();
        for (Texture2D img : uiStageImage) img.dealloc();
        if (uiStageBossImage.name != -1)
            uiStageBossImage.dealloc();
    }
}
