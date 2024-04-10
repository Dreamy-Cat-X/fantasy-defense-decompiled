package com.sncompany.newtower.Pages;

import androidx.core.util.Consumer;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataAward;
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

    static final float GAME_STAGE_SELECT_STAGE_FADE_DEGREE = 0.0294f;
    static final float GAME_STAGE_SELECT_VIEW_FADE_DEGREE = 0.047f;
    public static final int GAME_STAGE_SELECT_VIEW_FADE_IN_END_POS = 34;
    public static final int GAME_STAGE_SELECT_VIEW_FADE_OUT_FULL_POS = 17;
    public static final int GAME_STAGE_SELECT_VIEW_FADE_OUT_START_POS = 0;
    public static final int GAME_STAGE_SELECT_VIEW_LOOP_BLOCK_SIZE = 28;
    public static final int GAME_STAGE_SELECT_VIEW_MOVE_COUNT = 15;
    static final float GAME_STAGE_SELECT_VIEW_MOVE_DEGREE = 0.066f;

    public static final int BACK = 0, START = 1, ARROW_L = 2, ARROW_R = 3, MIN_MAPMODE = 4, MAX_MAPMODE = MIN_MAPMODE + 2, MIN_CHAPTER = MAX_MAPMODE + 2, MAX_CHAPTER = MIN_CHAPTER + 4;
    public static final int[] numberStagePointResource = {R.drawable.num_stage_point_0, R.drawable.num_stage_point_1, R.drawable.num_stage_point_2, R.drawable.num_stage_point_3, R.drawable.num_stage_point_4, R.drawable.num_stage_point_5, R.drawable.num_stage_point_6, R.drawable.num_stage_point_7, R.drawable.num_stage_point_8, R.drawable.num_stage_point_9};
    public static final int[] uiStageResource = {R.drawable.ui_stage_leftwindow, R.drawable.ui_stage_rightwindow, R.drawable.ui_stage_effect1, R.drawable.ui_stage_effect2, R.drawable.ui_stage_effect3, R.drawable.ui_stage_effect4, R.drawable.ui_stage_effect5, R.drawable.ui_stage_back_off, R.drawable.ui_stage_back_on, R.drawable.ui_stage_chapterleft_off, R.drawable.ui_stage_chapterleft_on, R.drawable.ui_stage_chapterright_off, R.drawable.ui_stage_chapterright_on, R.drawable.ui_stage_stageleft_off, R.drawable.ui_stage_stageleft_on, R.drawable.ui_stage_stageright_off, R.drawable.ui_stage_stageright_on, R.drawable.ui_stage_chapter, R.drawable.ui_stage_1, R.drawable.ui_stage_2, R.drawable.ui_stage_3, R.drawable.ui_stage_4, R.drawable.ui_stage_5, R.drawable.ui_stage_name1, R.drawable.ui_stage_name2, R.drawable.ui_stage_name3, R.drawable.ui_stage_name4, R.drawable.ui_stage_name5, R.drawable.ui_stage_wave, R.drawable.ui_stage_highscore, R.drawable.ui_stage_stagebox, R.drawable.ui_stage_stageselect, R.drawable.ui_stage_engage_off, R.drawable.ui_stage_engage_on, R.drawable.ui_stage_mapline, R.drawable.ui_stage_normal_off, R.drawable.ui_stage_normal_on, R.drawable.ui_stage_infinity_off, R.drawable.ui_stage_infinity_on, R.drawable.ui_stage_gatebreaker_off, R.drawable.ui_stage_gatebreaker_on, R.drawable.ui_stage_infinity_noselect, R.drawable.ui_stage_gatebreaker_noselect, R.drawable.ui_stage_new, R.drawable.ui_stage_stage, R.drawable.ui_stage_lock, R.drawable.ui_stage_perfect};
    public static final int[] uiStageBossResource = {R.drawable.ui_stage_boss1, R.drawable.ui_stage_boss2, R.drawable.ui_stage_boss3, R.drawable.ui_stage_boss4, R.drawable.ui_stage_boss5};

    private static final int[] samePlay = new int[2];
    public final Texture2D[] numberStagePointImage = new Texture2D[numberStagePointResource.length];
    public final Texture2D[] uiStageImage = new Texture2D[uiStageResource.length];
    private final Texture2D uiStageBossImage = new Texture2D();

    public int stageSelectChapterNumber = 0, stageSelectStageNumber = 0, mapNumber = -1, mapAttackType, stageLoad = 0;
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

        Config.highScores[mapNumber][mapAttackType] = Math.max(0, Config.highScores[mapNumber][mapAttackType]);
        Config.lastPlayed = (byte)mapNumber;
        if (samePlay[0] == mapNumber) {
            samePlay[1]++;
            if (samePlay[1] == 3)
                Config.awardValues[DataAward.AWARD_Persevering] = true;
        } else {
            samePlay[0] = mapNumber;
            samePlay[1] = 0;
        }
        Config.saveAll();

        for (int i5 = 0; i5 < 11; i5++) {
            if (i5 < 8)
                myOscillator[i5].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
            else
                myOscillator[i5].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
            myOscillator[i5].fastForward();
        }
        DataStage nst = new DataStage(map, mapAttackType);

        GameThread.playLoopSound(2);
        NewTower.switchPage(new LoadingPage(new StagePage(this, nst)), true); //End of update_GAME_STAGE_START_LOADING
    }

    @Override
    public void paint(GL10 gl10, boolean init) {
        TouchManager.clearTouchMap();

        TouchManager.addTouchRectListData(BACK, GameRenderer.CGRectMake(0.0f, 392.0f, 75.0f, 88.0f));
        TouchManager.addTouchRectListData(START, GameRenderer.CGRectMake(429.0f, 180.0f, 54.0f, 82.0f));
        if (stageSelectStageNumber > 0)
            TouchManager.addTouchRectListData(ARROW_L, GameRenderer.CGRectMake(717.0f, 180.0f, 54.0f, 82.0f));
        if (stageSelectStageNumber < 9)
            TouchManager.addTouchRectListData(ARROW_R, GameRenderer.CGRectMake(519.0f, 286.0f, 161.0f, 53.0f));
        if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][0] != -1)
            TouchManager.addTouchRectListData(MIN_MAPMODE, GameRenderer.CGRectMake(409.0f, 368.0f, 130.0f, 44.0f));
        if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][0] >= 1)
            TouchManager.addTouchRectListData(MIN_MAPMODE + 1, GameRenderer.CGRectMake(535.0f, 368.0f, 130.0f, 44.0f));
        if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][0] == 2)
            TouchManager.addTouchRectListData(MAX_MAPMODE, GameRenderer.CGRectMake(661.0f, 368.0f, 130.0f, 44.0f));
        TouchManager.addTouchRectListData(7, GameRenderer.CGRectMake(500.0f, 160.0f, 200.0f, 120.0f)); //Appears to be the minimap box
        TouchManager.addTouchRectListData(MIN_CHAPTER, GameRenderer.CGRectMake(0.0f, 301.0f, 204.0f, 147.0f));
        TouchManager.addTouchRectListData(MIN_CHAPTER + 1, GameRenderer.CGRectMake(184.0f, 274.0f, 214.0f, 133.0f));
        TouchManager.addTouchRectListData(MIN_CHAPTER + 2, GameRenderer.CGRectMake(0.0f, 161.0f, 211.0f, 140.0f));
        TouchManager.addTouchRectListData(MIN_CHAPTER + 3, GameRenderer.CGRectMake(210.0f, 0.0f, 190.0f, 224.0f));
        TouchManager.addTouchRectListData(MAX_CHAPTER, GameRenderer.CGRectMake(0.0f, 0.0f, 211.0f, 161.0f));
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = MAX_CHAPTER + 1;

        int LTS = TouchManager.checkTouchListStatus();
        uiStageImage[0].drawAtPointOption(0.0f, 0.0f, 18);
        uiStageImage[1].drawAtPointOption(400.0f, 0.0f, 18);
        uiStageBossImage.drawAtPointOption(400.0f, 0.0f, 18);
        uiStageImage[34].drawAtPointOption(496.0f, 156.0f, 18);

        uiStageImage[LTS == 0 ? 8 : 7].drawAtPointOption(1.0f, 421.0f, 18);
        uiStageImage[stageSelectChapterNumber + 23].drawAtPointOption(600.0f, 38.0f, 17);

        uiStageImage[44].drawAtPointOption(470.0f, 96.0f, 18);
        GameRenderer.drawNumberBlock((stageSelectChapterNumber * 10) + stageSelectStageNumber + 1, numberStagePointImage, 581.0f, 97.0f, 0, 20, 1);
        uiStageImage[28].drawAtPointOption(624.0f, 96.0f, 18);
        GameRenderer.drawNumberBlock(DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[(stageSelectChapterNumber * 10) + stageSelectStageNumber], numberStagePointImage, 705.0f, 97.0f, 0, 18, 2);
        uiStageImage[29].drawAtPointOption(469.0f, 124.0f, 18);
        GameRenderer.drawNumberBlock(Math.max(0, Config.highScores[(stageSelectChapterNumber * 10) + stageSelectStageNumber][mapAttackType]), numberStagePointImage, 732.0f, 125.0f, 0, 20, 1);

        if (stageSelectStageNumber > 0)
            uiStageImage[LTS == 3 ? 14 : 13].drawAtPointOption(429.0f, 180.0f, 18);
        if (stageSelectStageNumber < 9)
            uiStageImage[LTS == 4 ? 16 : 15].drawAtPointOption(717.0f, 180.0f, 18);

        TouchManager.swapTouchMap();
    }

    public void paint_GAME_STAGE_SELECT(GL10 gl10) {
        float f;
        //TODO - Pass all of this to the other paint function
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

        if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][1] == 0 && Config.highScores[(stageSelectChapterNumber * 10) + stageSelectStageNumber][0] == -1)
            uiStageImage[43].drawAtPointOption(415.0f, 364.0f, 18);

        if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][1] == -1) {
            uiStageImage[41].drawAtPointOption(535.0f, 368.0f, 18);
        } else {
            uiStageImage[mapAttackType == 1 ? 38 : 37].drawAtPointOption(535.0f, 368.0f, 18);

            if (Config.highScores[(stageSelectChapterNumber * 10) + stageSelectStageNumber][1] == -1) //NEW Text
                uiStageImage[43].drawAtPointOption(541.0f, 364.0f, 18);
        }
        if (Config.stageProg[(stageSelectChapterNumber * 10) + stageSelectStageNumber][2] == -1) {
            uiStageImage[42].drawAtPointOption(661.0f, 368.0f, 18);
        } else {
            uiStageImage[mapAttackType == 2 ? 40 : 39].drawAtPointOption(661.0f, 368.0f, 18);

            if (Config.highScores[(stageSelectChapterNumber * 10) + stageSelectStageNumber][2] == -1)
                uiStageImage[43].drawAtPointOption(667.0f, 364.0f, 18);
        }
        uiStageImage[30].drawAtPointOption(549.0f, 349.0f, 18);
        int i2 = GameThread.gameTimeCount % 28;
        if (i2 > 0 && i2 < 34) {
            float f2 = 1.0f - ((i2 < 17 ? i2 + 0 : 34 - i2) * GAME_STAGE_SELECT_STAGE_FADE_DEGREE);
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f2, f2, f2, f2);
        }
        uiStageImage[31].drawAtPointOption((stageSelectStageNumber * 10) + 543, 343.0f, 18);
        if (i2 > 0 && i2 < 34) {
            float f3 = 1.0f - ((i2 < 17 ? i2 - 0 : 34 - i2) * GAME_STAGE_SELECT_VIEW_FADE_DEGREE);
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f3, f3, f3, f3);
        }
        if (stageSelectChapterNumber != 0) {
            if (stageSelectChapterNumber == 1) {
                uiStageImage[3].drawAtPointOption(169.0f, 252.0f, 18);
            } else if (stageSelectChapterNumber == 2) {
                uiStageImage[4].drawAtPointOption(0.0f, 49.0f, 18);
            } else if (stageSelectChapterNumber == 3) {
                uiStageImage[5].drawAtPointOption(189.0f, 0.0f, 18);
            } else if (stageSelectChapterNumber == 4) {
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
        if (Config.highScores[(stageSelectChapterNumber * 10) + stageSelectStageNumber][0] == -1) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
            fillBlackImage.fillRect(527.0f, 294.0f, 145.0f, 37.0f);
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (stageLoad > 0) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            GL10 gl102 = Texture2D.gl;
            gl102.glColor4f(stageLoad * 0.066f, stageLoad * 0.066f, stageLoad * 0.066f, stageLoad * 0.066f);
            fillBlackImage.fillRect(0.0f, 0.0f, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
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

    public void drawSmallMap(float f, float f2, float f3) {
        map.backBaseImageArray[map.lastShowBackBase].drawAtPointOptionSize(f, f2, 18, f3);
        drawMapTileSize(f, f2, f3);
    }

    public void drawMapTile(GL10 gl10) {
        for (int i = 0; i < 15; i++) {
            for (int i2 = 0; i2 < 10; i2++) {
                int i3 = map.mapTileData[i][i2];
                if (i3 != -1) {
                    map.backTileOldImage[i3].drawAtPointOption((i * 45) + 62, (i2 * 45) + 30, 18);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005a. Please report as an issue. */
    public void drawMapTileSize(float f, float f2, float f3) {
        if (map.backTileOldImage != null)
            for (int i = 0; i < 15; i++)
                for (int j = 0; j < 10; j++) {
                    int tid = map.mapTileData[i][j];
                    if (tid != -1 && map.backTileOldImage[tid] != null)
                        map.backTileOldImage[tid].drawAtPointOptionSize((f3 * 62.0f) + f + (i * 45 * f3), (f3 * 30.0f) + f2 + (j * 45 * f3), 18, f3);
                }
        if (map.backObjectImage != null) {
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i4 = 0; i4 < map.objectUnit.size(); i4++) {
                int i5 = map.objectUnit.get(i4).objectType;
                if (i5 != -1) {
                    switch (i5) {
                        case 28:
                            f4 = 3.0f;
                            break;
                        case 29:
                            f4 = 22.0f;
                            f5 = 22.0f;
                            break;
                        case 30:
                            f5 = -25.0f;
                            f4 = 3.0f;
                            break;
                        case 31:
                            f4 = 18.0f;
                            f5 = 34.0f;
                            break;
                        case 32:
                            f4 = -22.0f;
                            f5 = 22.0f;
                            break;
                        case 33:
                            f4 = -11.0f;
                            f5 = 34.0f;
                            break;
                    }
                    map.backObjectImage[i5].drawAtPointOptionSize((f3 * 62.0f) + f + (f4 * f3) + ((map.objectUnit.get(i4).posX / 50f) * f3), (f3 * 30.0f) + f2 + (f5 * f3) + (((map.objectUnit.get(i4).posY / 50f) + 22) * f3), 33, f3);
                }
            }
        }
    }

    @Override
    public void unload() {
        for (Texture2D num : numberStagePointImage) num.dealloc();
        for (Texture2D img : uiStageImage) img.dealloc();
        if (uiStageBossImage.name != -1)
            uiStageBossImage.dealloc();
    }
}
