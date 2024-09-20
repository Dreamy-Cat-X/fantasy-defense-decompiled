package com.sncompany.newtower.Pages;

import java.util.function.Consumer;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataMap;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataWaveMob;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.Pages.stage.StagePage;
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

    public int stageSelectChapterNumber, stageSelectStageNumber, mapNumber = -1, mapAttackType, stageLoad = 0;
    public DataMap map;

    public StageSelectPage(TPage par) {
        super(par);
        stageSelectChapterNumber = Config.lastPlayed / 10;
        stageSelectStageNumber = Config.lastPlayed % 10;
    }

    @Override
    public void load(Consumer<Float> prog) {
        for (int i = 0; i < numberStagePointImage.length; i++)
            numberStagePointImage[i] = new Texture2D(numberStagePointResource[i]);
        for (int i = 0; i < uiStageImage.length; i++)
            uiStageImage[i] = new Texture2D(uiStageResource[i]);
        uiStageBossImage.initWithImageName(uiStageBossResource[0]);
        map = DataMap.loadMap(getStageIndex());
        if (prog != null)
            prog.accept(1f);
        loaded = true;
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
        if (mapNumber == 4)
            Config.awardValues[DataAward.AWARD_Crossroads_Of_Destiny] = true;
        Config.saveAll();
        DataStage nst = new DataStage(map, mapAttackType);

        NewTower.switchPage(new StagePage(this, nst), true); //End of update_GAME_STAGE_START_LOADING
    }

    private static final float[][] uiStageCoords = {{0f, 286f},{169f, 252f},{0f, 49f},{189f, 0f},{0f, 0f}};
    @Override
    public void paint(GL10 gl10, boolean init) {
        TouchManager.clearTouchMap();

        TouchManager.addTouchRectListData(BACK, CGRect.make(0f, 392f, 75f, 88f));
        TouchManager.addTouchRectListData(START, CGRect.make(519f, 286f, 161f, 53f));
        if (stageSelectStageNumber > 0)
            TouchManager.addTouchRectListData(ARROW_L, CGRect.make(429f, 180f, 54f, 82f));
        if (stageSelectStageNumber < 9)
            TouchManager.addTouchRectListData(ARROW_R, CGRect.make(717f, 180f, 54f, 82f));
        if (Config.stageProg[getStageIndex()][0] != -1)
            TouchManager.addTouchRectListData(MIN_MAPMODE, CGRect.make(409f, 368f, 130f, 44f));
        if (Config.stageProg[getStageIndex()][0] >= 1)
            TouchManager.addTouchRectListData(MIN_MAPMODE + 1, CGRect.make(535f, 368f, 130f, 44f));
        if (Config.stageProg[getStageIndex()][0] == 2)
            TouchManager.addTouchRectListData(MAX_MAPMODE, CGRect.make(661f, 368f, 130f, 44f));
        TouchManager.addTouchRectListData(7, CGRect.make(500f, 160f, 200f, 120f)); //Appears to be the minimap box
        TouchManager.addTouchRectListData(MIN_CHAPTER, CGRect.make(0f, 301f, 204f, 147f));
        TouchManager.addTouchRectListData(MIN_CHAPTER + 1, CGRect.make(184f, 274f, 214f, 133f));
        TouchManager.addTouchRectListData(MIN_CHAPTER + 2, CGRect.make(0f, 161f, 211f, 140f));
        TouchManager.addTouchRectListData(MIN_CHAPTER + 3, CGRect.make(210f, 0f, 190f, 224f));
        TouchManager.addTouchRectListData(MAX_CHAPTER, CGRect.make(0f, 0f, 211f, 161f));
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = MAX_CHAPTER + 1;

        int LTS = TouchManager.checkTouchListStatus();
        uiStageImage[0].drawAtPointOption(0f, 0f, 18);
        uiStageImage[1].drawAtPointOption(400f, 0f, 18);
        uiStageBossImage.drawAtPointOption(400f, 0f, 18);
        uiStageImage[34].drawAtPointOption(496f, 156f, 18);

        uiStageImage[LTS == 0 ? 8 : 7].drawAtPointOption(1f, 421f, 18);
        uiStageImage[stageSelectChapterNumber + 23].drawAtPointOption(600f, 38f, 17);

        uiStageImage[44].drawAtPointOption(470f, 96f, 18);
        GameRenderer.drawNumberBlock(getStageIndex() + 1, numberStagePointImage, 581f, 97f, 0, 20, 1);
        uiStageImage[28].drawAtPointOption(624f, 96f, 18);
        GameRenderer.drawNumberBlock(DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[getStageIndex()], numberStagePointImage, 705f, 97f, 0, 18, 2);
        uiStageImage[29].drawAtPointOption(469f, 124f, 18);
        GameRenderer.drawNumberBlock(Math.max(0, Config.highScores[getStageIndex()][mapAttackType]), numberStagePointImage, 732f, 125f, 0, 20, 1);

        if (stageSelectStageNumber > 0)
            uiStageImage[LTS == 3 ? 14 : 13].drawAtPointOption(429f, 180f, 18);
        if (stageSelectStageNumber < 9)
            uiStageImage[LTS == 4 ? 16 : 15].drawAtPointOption(717f, 180f, 18);
        map.checkBackBase();
        drawSmallMap(500f, 160f, 0.25f);
        if (Config.stageProg[getStageIndex()][0] == 2)
            uiStageImage[46].drawAtPointOption(503f, 163f, 18);
        else if (Config.stageProg[getStageIndex()][0] == -1) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448f);
            Texture2D.setColors(0.5f);
            fillBlackImage.fillRect(500f, 160f, 200f, 120f);
            Texture2D.setColors(1);
            uiStageImage[45].drawAtPointOption(600f, 220f, 9);
        }

        uiStageImage[mapAttackType == 0 ? 36 : 35].drawAtPointOption(409f, 368f, 18);
        if (Config.stageProg[getStageIndex()][1] == 0 && Config.highScores[getStageIndex()][0] == -1)
            uiStageImage[43].drawAtPointOption(415f, 364f, 18);

        if (Config.stageProg[getStageIndex()][0] < 1) {
            uiStageImage[41].drawAtPointOption(535f, 368f, 18);
        } else {
            uiStageImage[mapAttackType == 1 ? 38 : 37].drawAtPointOption(535f, 368f, 18);
            if (Config.highScores[getStageIndex()][1] == -1) //NEW Text
                uiStageImage[43].drawAtPointOption(541f, 364f, 18);
        }
        if (Config.stageProg[getStageIndex()][0] < 2) {
            uiStageImage[42].drawAtPointOption(661f, 368f, 18);
        } else {
            uiStageImage[mapAttackType == 2 ? 40 : 39].drawAtPointOption(661f, 368f, 18);
            if (Config.highScores[getStageIndex()][2] == -1)
                uiStageImage[43].drawAtPointOption(667f, 364f, 18);
        }

        uiStageImage[30].drawAtPointOption(549f, 349f, 18);
        int i2 = GameThread.gameTimeCount % 28;
        if (i2 > 0) {
            float f2 = 1f - ((i2 < 17 ? i2 : 34 - i2) * GAME_STAGE_SELECT_STAGE_FADE_DEGREE);
            Texture2D.gl.glTexEnvf(8960, 8704, 8448f);
            Texture2D.setColors(f2);
        }
        uiStageImage[31].drawAtPointOption((stageSelectStageNumber * 10) + 543, 343f, 18);
        if (i2 > 0) {
            float f3 = 1f - ((i2 < 17 ? i2 : 34 - i2) * GAME_STAGE_SELECT_VIEW_FADE_DEGREE);
            Texture2D.gl.glTexEnvf(8960, 8704, 8448f);
            Texture2D.setColors(f3);
        }

        float f = 286f;
        uiStageImage[stageSelectChapterNumber + 2].drawAtPointOption(uiStageCoords[stageSelectChapterNumber][0], uiStageCoords[stageSelectChapterNumber][1], 18);

        Texture2D.setColors(1);
        uiStageImage[LTS == 5 ? 33 : 32].drawAtPointOption(519f, f, 18);

        if (Config.stageProg[getStageIndex()][0] == -1) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448f);
            Texture2D.setColors(0.5f);
            fillBlackImage.fillRect(527f, 294f, 145f, 37f);
            Texture2D.setColors(1);
        }
        if (stageLoad > 0) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448f);
            GL10 gl102 = Texture2D.gl;
            gl102.glColor4f(stageLoad * 0.066f, stageLoad * 0.066f, stageLoad * 0.066f, stageLoad * 0.066f);
            fillBlackImage.fillRect(0f, 0f, GameRenderer.SCRWIDTH_SMALL, GameRenderer.SCRHEIGHT_SMALL);
            Texture2D.setColors(1);
        }
        TouchManager.swapTouchMap();
    }

    @Override
    public void touchCheck() {
        if (mapNumber != -1 || TouchManager.lastActionStatus != TouchManager.TOUCH_STATUS_START_PROCESSED)
            return;
        int touch = TouchManager.checkTouchListStatus();

        if (touch >= MIN_MAPMODE && touch <= MAX_MAPMODE) {
            GameThread.playSound(14);
            mapAttackType = touch - MIN_MAPMODE;
        } else if (touch >= MIN_CHAPTER && touch <= MAX_CHAPTER) {
            GameThread.playSound(14);
            int ol = stageSelectChapterNumber;
            stageSelectChapterNumber = touch - MIN_CHAPTER;
            map = DataMap.loadMap(getStageIndex());
            mapAttackType = 0;

            if (ol != stageSelectChapterNumber) {
                uiStageBossImage.dealloc();
                uiStageBossImage.initWithImageName(uiStageBossResource[stageSelectChapterNumber]);
            }
        } else {
            switch (TouchManager.checkTouchListStatus()) {
                case BACK:
                    GameThread.playSound(15);
                    NewTower.switchPage(parent, true);
                    break;
                case ARROW_L:
                    if (stageSelectStageNumber > 0) {
                        GameThread.playSound(14);
                        stageSelectStageNumber--;
                        map = DataMap.loadMap(getStageIndex());
                        mapAttackType = 0;
                    }
                    break;
                case ARROW_R:
                    if (stageSelectStageNumber < 9) {
                        GameThread.playSound(14);
                        stageSelectStageNumber++;
                        map = DataMap.loadMap(getStageIndex());
                        mapAttackType = 0;
                    }
                    break;
                case START:
                    GameThread.playSound(14);
                    if (Config.stageProg[getStageIndex()][mapAttackType] >= 0) {
                        mapNumber = getStageIndex();
                        stageLoad++;
                    }
                    break;
            }
        }
        if (TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch()) == 9 && TouchManager.checkTouchMoveDegree(true)) {
            GameThread.playSound(14);
            if (TouchManager.lastMoveCheckDistance.y > 0f) {
                if (stageSelectStageNumber < 9) {
                    stageSelectStageNumber++;
                    map = DataMap.loadMap(getStageIndex());
                    mapAttackType = 0;
                }
            } else if (TouchManager.lastMoveCheckDistance.y < 0f && stageSelectStageNumber > 0) {
                stageSelectStageNumber--;
                map = DataMap.loadMap(getStageIndex());
                mapAttackType = 0;
            }
        }
    }

    public void drawSmallMap(float f, float f2, float f3) {
        map.backBaseImageArray[map.lastShowBackBase].drawAtPointOptionSize(f, f2, 18, f3);
        drawMapTileSize(f, f2, f3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005a. Please report as an issue. */
    public void drawMapTileSize(float f, float f2, float f3) {
        for (int i = 0; i < 15; i++)
            for (int j = 0; j < 10; j++) {
                int tid = map.mapTileData[i][j];
                if (tid != -1 && map.backTileOldImage[tid] != null)
                    map.backTileOldImage[tid].drawAtPointOptionSize((f3 * 62f) + f + (i * 45 * f3), (f3 * 30f) + f2 + (j * 45 * f3), 18, f3);
            }
        float f4 = 0f;
        float f5 = 0f;
        for (int i4 = 0; i4 < map.objectUnit.size(); i4++) {
            int i5 = map.objectUnit.get(i4).type;
            if (i5 != -1) {
                switch (i5) {
                    case 28:
                        f4 = 3f;
                        break;
                    case 29:
                        f4 = 22f;
                        f5 = 22f;
                        break;
                    case 30:
                        f5 = -25f;
                        f4 = 3f;
                        break;
                    case 31:
                        f4 = 18f;
                        f5 = 34f;
                        break;
                    case 32:
                        f4 = -22f;
                        f5 = 22f;
                        break;
                    case 33:
                        f4 = -11f;
                        f5 = 34f;
                        break;
                }
                map.backObjectImage[i5].drawAtPointOptionSize((f3 * 62f) + f + (f4 * f3) + ((map.objectUnit.get(i4).posX / 50f) * f3), (f3 * 30f) + f2 + (f5 * f3) + (((map.objectUnit.get(i4).posY / 50f) + 22) * f3), 33, f3);
            }
        }
    }

    @Override
    public void unload() {
        for (Texture2D num : numberStagePointImage) num.dealloc();
        for (Texture2D img : uiStageImage) img.dealloc();
        if (uiStageBossImage.name != -1)
            uiStageBossImage.dealloc();
        loaded = false;
    }

    @Override
    public void onReload() {
        stageSelectChapterNumber = Config.lastPlayed / 10;
        stageSelectStageNumber = Config.lastPlayed % 10;
        mapNumber = -1;
        stageLoad = 0;

        map = DataMap.loadMap(getStageIndex());
    }

    private int getStageIndex() {
        return (stageSelectChapterNumber * 10) + stageSelectStageNumber;
    }
}
