package com.sncompany.newtower;

import android.content.Intent;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.util.Log;
import android.view.MotionEvent;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;

import com.sncompany.newtower.DataClasses.CGPoint;

/* loaded from: D:\decomp\classes.dex */
public class GLGameSurfaceView extends GLSurfaceView {
    public static final int GAME_ABOUT_TOUCH_LIST_0_BACK = 0;
    public static final int GAME_ABOUT_TOUCH_LIST_1_DEVELOPER = 1;
    public static final int GAME_ABOUT_TOUCH_LIST_TOTAL_COUNT = 2;
    public static final int GAME_DRAW_DRAWING = 1;
    public static final int GAME_DRAW_FINISHED = 2;
    public static final int GAME_DRAW_REQUEST = 0;
    public static final int GAME_HELP_TOUCH_LIST_0_BACK = 0;
    public static final int GAME_HELP_TOUCH_LIST_1_TUTORIAL = 1;
    public static final int GAME_HELP_TOUCH_LIST_2_LEFTARROW = 2;
    public static final int GAME_HELP_TOUCH_LIST_3_RIGHTARROW = 3;
    public static final int GAME_INGAME_MENU_TOUCH_LIST_0_RESUME = 0;
    public static final int GAME_INGAME_MENU_TOUCH_LIST_1_RESTART = 1;
    public static final int GAME_INGAME_MENU_TOUCH_LIST_2_STAGE_SELECT = 2;
    public static final int GAME_INGAME_MENU_TOUCH_LIST_TOTAL_COUNT = 3;
    public static final int GAME_MAINMENU_TOUCH_LIST_0_START = 0;
    public static final int GAME_MAINMENU_TOUCH_LIST_1_SHOP = 1;
    public static final int GAME_MAINMENU_TOUCH_LIST_2_HELP = 2;
    public static final int GAME_MAINMENU_TOUCH_LIST_3_RECORD = 3;
    public static final int GAME_MAINMENU_TOUCH_LIST_4_UPGRADE = 4;
    public static final int GAME_MAINMENU_TOUCH_LIST_5_BACK = 5;
    public static final int GAME_MAINMENU_TOUCH_LIST_6_ADVIEW = 6;
    public static final int GAME_MAINMENU_TOUCH_LIST_TOTAL_COUNT = 7;
    public static final int GAME_OPTION_TOUCH_LIST_0_BACK = 0;
    public static final int GAME_OPTION_TOUCH_LIST_1_MUSIC = 1;
    public static final int GAME_OPTION_TOUCH_LIST_2_EFFECT = 2;
    public static final int GAME_OPTION_TOUCH_LIST_3_MOVIE_ON = 3;
    public static final int GAME_OPTION_TOUCH_LIST_4_VIBRATION_OFF = 4;
    public static final int GAME_OPTION_TOUCH_LIST_TOTAL_COUNT = 5;
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
    public static final int GAME_RECORD_TOUCH_LIST_0_BACK = 0;
    public static final int GAME_RECORD_TOUCH_LIST_1_SCORE = 1;
    public static final int GAME_RECORD_TOUCH_LIST_2_AWARD = 2;
    public static final int GAME_RECORD_TOUCH_LIST_3_BODY = 3;
    public static final int GAME_RECORD_TOUCH_LIST_4_SIDEBAR = 4;
    public static final int GAME_RECORD_TOUCH_LIST_TOTAL_COUNT = 5;
    public static final int GAME_SHOP_HERO_BUY_TOUCH_LIST_0_BUY = 73;
    public static final int GAME_SHOP_HERO_BUY_TOUCH_LIST_1_WARRIOR = 74;
    public static final int GAME_SHOP_HERO_BUY_TOUCH_LIST_2_ARCHER = 75;
    public static final int GAME_SHOP_HERO_BUY_TOUCH_LIST_3_WIZARD = 76;
    public static final int GAME_SHOP_HERO_BUY_TOUCH_LIST_4_CHAR_BOTTOM_BLOCK = 77;
    public static final int GAME_SHOP_HERO_BUY_TOUCH_LIST_TOTAL_COUNT = 78;
    public static final int GAME_SHOP_HERO_SELL_TOUCH_LIST_0_OK = 73;
    public static final int GAME_SHOP_HERO_SELL_TOUCH_LIST_1_CANCEL = 74;
    public static final int GAME_SHOP_HERO_SELL_TOUCH_LIST_TOTAL_COUNT = 75;
    public static final int GAME_SHOP_LIST_TOUCH_LIST_0_BACK = 0;
    public static final int GAME_SHOP_LIST_TOUCH_LIST_1_SHOP = 1;
    public static final int GAME_SHOP_LIST_TOUCH_LIST_2_EQUIP = 2;
    public static final int GAME_SHOP_LIST_TOUCH_LIST_3_POSTBOX = 3;
    public static final int GAME_SHOP_LIST_TOUCH_LIST_4_EMPTY = 4;
    public static final int GAME_SHOP_LIST_TOUCH_LIST_TOTAL_COUNT = 5;
    public static final int GAME_SHOP_SHOP_ALERT_NO = 55;
    public static final int GAME_SHOP_SHOP_ALERT_OK = 53;
    public static final int GAME_SHOP_SHOP_ALERT_YES = 54;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_0_BACK = 30;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_11_INVEN_LEFT = 32;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_12_INVEN_RIGHT = 33;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_13_BODY = 34;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_14_SIDEBAR = 35;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_15_SELL = 36;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_16_GIFT = 37;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_17_BUY = 38;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_3_EQUIP = 31;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_ETC_START = 30;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_INVEN_START = 0;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_SHOP_START = 10;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_0 = 51;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_1 = 41;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_2 = 42;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_3 = 43;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_4 = 44;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_5 = 45;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_6 = 46;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_7 = 47;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_8 = 48;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_9 = 49;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_BACK = 50;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_CLOSE = 40;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_LIST_START = 40;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TEL_OK = 52;
    public static final int GAME_SHOP_SHOP_TOUCH_LIST_TOTAL_COUNT = 56;
    public static final int GAME_SHOP_TOUCH_LIST_LOCK_HERO_0 = 75;
    public static final int GAME_SHOP_TOUCH_LIST_LOCK_HERO_1 = 76;
    public static final int GAME_SHOP_TOUCH_LIST_LOCK_HERO_2 = 77;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_0_UPGRADE = 0;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_1_NEXT_STAGE = 1;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_2_STAGESELECT = 2;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_3_TITLE_NEXT = 3;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_4_RESULT_NEXT = 4;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_5_REWARD_OK = 5;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_6_ENDING_VIEW_OK = 6;
    public static final int GAME_STAGE_CLEAR_TOUCH_LIST_TOTAL_COUNT = 7;
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
    public static final int GAME_TITLE_TOUCH_LIST_0_START = 0;
    public static final int GAME_TITLE_TOUCH_LIST_1_OPTION = 1;
    public static final int GAME_TITLE_TOUCH_LIST_2_ABOUT = 2;
    public static final int GAME_TITLE_TOUCH_LIST_3_FACEBOOK = 3;
    public static final int GAME_TITLE_TOUCH_LIST_4_TWITTER = 4;
    public static final int GAME_TITLE_TOUCH_LIST_TOTAL_COUNT = 19;
    public static final int GAME_TUTORIAL_TOUCH_BOX_ARCHER = 20;
    public static final int GAME_TUTORIAL_TOUCH_BOX_CLEAR1 = 27;
    public static final int GAME_TUTORIAL_TOUCH_BOX_CLEAR2 = 28;
    public static final int GAME_TUTORIAL_TOUCH_BOX_COLDDIVINER = 23;
    public static final int GAME_TUTORIAL_TOUCH_BOX_ENEMYGATE = 15;
    public static final int GAME_TUTORIAL_TOUCH_BOX_FINISH1 = 29;
    public static final int GAME_TUTORIAL_TOUCH_BOX_FINISH2 = 30;
    public static final int GAME_TUTORIAL_TOUCH_BOX_GATELIFE = 17;
    public static final int GAME_TUTORIAL_TOUCH_BOX_GOLD = 10;
    public static final int GAME_TUTORIAL_TOUCH_BOX_GOLDBOX = 25;
    public static final int GAME_TUTORIAL_TOUCH_BOX_HERO = 24;
    public static final int GAME_TUTORIAL_TOUCH_BOX_HOLYEYE = 21;
    public static final int GAME_TUTORIAL_TOUCH_BOX_MANA = 11;
    public static final int GAME_TUTORIAL_TOUCH_BOX_MANASTONE = 26;
    public static final int GAME_TUTORIAL_TOUCH_BOX_MANATARMS = 19;
    public static final int GAME_TUTORIAL_TOUCH_BOX_OURGATE = 16;
    public static final int GAME_TUTORIAL_TOUCH_BOX_PAUSESWITCHMENU = 13;
    public static final int GAME_TUTORIAL_TOUCH_BOX_UNITS = 14;
    public static final int GAME_TUTORIAL_TOUCH_BOX_WARRIOR = 18;
    public static final int GAME_TUTORIAL_TOUCH_BOX_WAVE = 12;
    public static final int GAME_TUTORIAL_TOUCH_BOX_WIZARD = 22;
    public static final int GAME_TUTORIAL_TOUCH_LIST_0_WARRIOR = 0;
    public static final int GAME_TUTORIAL_TOUCH_LIST_10_HERO_SLOT_2 = 9;
    public static final int GAME_TUTORIAL_TOUCH_LIST_1_MAN_AT_ARMS = 1;
    public static final int GAME_TUTORIAL_TOUCH_LIST_2_ARCHER = 2;
    public static final int GAME_TUTORIAL_TOUCH_LIST_3_HOLY_EYE = 3;
    public static final int GAME_TUTORIAL_TOUCH_LIST_4_WIZARD = 4;
    public static final int GAME_TUTORIAL_TOUCH_LIST_5_COLD_DIVINER = 5;
    public static final int GAME_TUTORIAL_TOUCH_LIST_7_HERO_ICON = 6;
    public static final int GAME_TUTORIAL_TOUCH_LIST_8_HERO_SLOT_0 = 7;
    public static final int GAME_TUTORIAL_TOUCH_LIST_9_HERO_SLOT_1 = 8;
    public static final int GAME_TUTORIAL_TOUCH_LIST_TOTAL_COUNT = 31;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_0_BACK = 60;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_1_OK_TOTAL = 61;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_2_UNIT = 62;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_3_HERO = 63;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_BOTTOM_SELECT = 70;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_BUY_ARCHER = 66;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_BUY_WARRIOR = 65;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_BUY_WIZARD = 67;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_EQUIP_START = 30;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_ETC_START = 60;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_HERO_START = 20;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_INVEN_START = 0;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_LEFT_ARROW = 68;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_RIGHT_ARROW = 69;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_TOTAL_COUNT = 71;
    public static final int GAME_UPGRADE_HERO_TOUCH_LIST_UPGRADE_START = 40;
    public static final int GAME_UPGRADE_LIST_TOUCH_LIST_0_BACK = 0;
    public static final int GAME_UPGRADE_LIST_TOUCH_LIST_1_UNIT = 1;
    public static final int GAME_UPGRADE_LIST_TOUCH_LIST_2_HERO = 2;
    public static final int GAME_UPGRADE_LIST_TOUCH_LIST_3_EMPTY = 3;
    public static final int GAME_UPGRADE_LIST_TOUCH_LIST_TOTAL_COUNT = 4;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_0_BACK = 24;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_1_UPGRADE = 25;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_2_UNIT = 26;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_3_HERO = 27;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_4_COMMON = 28;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_5_WARRIOR = 29;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_6_ARCHER = 30;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_7_WIZARD = 31;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_ITEM_TOTAL_COUNT = 24;
    public static final int GAME_UPGRADE_UNIT_TOUCH_LIST_TOTAL_COUNT = 32;
    public static int drawStatus = 2;
    public static boolean firstResumeDone = false;
    public static NewTower newTower;
    public static TouchManager touchManager;
    public static int touchStart_GAME_SHOP_EQUIP_NUM;

    public GLGameSurfaceView(NewTower newTower2, GameRenderer gameRenderer) {
        super(newTower2);
        getHolder().setType(0);
        getHolder().setKeepScreenOn(true);
        setRenderer(gameRenderer);
        setRenderMode(0);
        setFocusableInTouchMode(true);
        touchManager = new TouchManager(true);
        newTower = newTower2;
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        super.onPause();
        GameThread.stopLoopSound(0);
        GameThread.stopLoopSound(1);
        GameThread.stopLoopSound(2);
        GameThread.pauseFlag = true;
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        GameThread.pauseFlag = false;
        if (firstResumeDone) {
            Log.d("RESUME", "STATUS " + GameThread.gameLoadFlag + "," + GameThread.loadingStatus + "," + GameThread.gameStatus);
            int i = GameThread.gameLoadFlag;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                switch (GameThread.gameStatus) {
                    case 0:
                    case 1:
                    case 2:
                        GameThread.gameLoadFlag = 0;
                        GameThread.loadingStatus = 1001;
                        GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                        GameRenderer.loadCount_GAME_PRE_IMAGE_LOAD = 0;
                        GameRenderer.loadingViewType = GameThread.getRandom(6);
                        return;
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        GameRenderer.loadCount_GAME_RESUME_TO_MENU = 0;
                        GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                        GameRenderer.loadingViewType = GameThread.getRandom(6);
                        GameThread.gameLoadFlag = 0;
                        GameThread.loadingStatus = 1007;
                        return;
                    case 4:
                    default:
                        return;
                    case 10:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        GameThread.myWaveRunFlag = false;
                        GameRenderer.loadCount_GAME_RESUME_TO_PLAY = 0;
                        GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                        GameRenderer.loadingViewType = GameThread.getRandom(6);
                        GameThread.gameLoadFlag = 0;
                        GameThread.loadingStatus = 1008;
                        return;
                }
            }
            switch (GameThread.loadingStatus) {
                case 1001:
                    GameThread.gameLoadFlag = 0;
                    GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                    GameRenderer.loadCount_GAME_PRE_IMAGE_LOAD = 0;
                    GameRenderer.loadingViewType = GameThread.getRandom(6);
                    return;
                case 1002:
                    GameThread.gameLoadFlag = 0;
                    GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                    GameRenderer.loadCount_GAME_PRE_TOTAL_IMAGE_LOAD = 0;
                    GameRenderer.loadingViewType = GameThread.getRandom(6);
                    return;
                case 1003:
                    GameThread.gameStatus = 3;
                    GameThread.gameSubStatus = 0;
                    GameThread.gameTitleViewCount = 0;
                    GameRenderer.loadCount_GAME_RESUME_TO_MENU = 0;
                    GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                    GameRenderer.loadingViewType = GameThread.getRandom(6);
                    GameThread.gameLoadFlag = 0;
                    GameThread.loadingStatus = 1007;
                    return;
                case 1004:
                    GameThread.gameStatus = 10;
                    GameThread.gameSubStatus = 0;
                    GameRenderer.startViewCount = 0;
                    GameThread.mapAttackType = 0;
                    GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                    GameThread.playLoopSound(1);
                    GameRenderer.loadCount_GAME_RESUME_TO_PLAY = 0;
                    GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                    GameRenderer.loadingViewType = GameThread.getRandom(6);
                    GameThread.gameLoadFlag = 0;
                    GameThread.loadingStatus = 1008;
                    return;
                case GameThread.GAME_PLAY2_IMAGE_LOAD /* 1005 */:
                    GameThread.characterMenuSelectFlag = 0;
                    GameThread.clearMonsterUnit();
                    GameThread.clearTowerUnit();
                    GameThread.clearEffectUnit();
                    GameThread.clearArrowUnit();
                    GameThread.myMoney = PathInterpolatorCompat.MAX_NUM_POINTS;
                    GameThread.myMana = 1000;
                    GameThread.myLife = 20;
                    GameThread.maxLife = GameThread.myLife;
                    GameThread.commonTargetType = -1;
                    GameThread.myOscillator[0].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[1].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[2].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[3].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[4].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[5].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[6].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[7].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                    GameThread.myOscillator[8].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                    GameThread.myOscillator[9].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                    GameThread.myOscillator[10].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                    for (int i2 = 0; i2 < 11; i2++) {
                        GameThread.myOscillator[i2].fastForward();
                    }
                    GameThread.gameStatus = 26;
                    GameThread.gameSubStatus = 1;
                    GameThread.characterMenuSelectFlag = 0;
                    GameThread.stopLoopSound(1);
                    GameRenderer.loadCount_GAME_RESUME_TO_PLAY = 0;
                    GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                    GameRenderer.loadingViewType = GameThread.getRandom(6);
                    GameThread.gameLoadFlag = 0;
                    GameThread.loadingStatus = 1008;
                    return;
                case 1006:
                    GameThread.gameStatus = 5;
                    GameThread.myOscillator[11].initWithTwoWayStartPosition(-150, 0, 15, 30, 10);
                    GameRenderer.loadCount_GAME_RESUME_TO_MENU = 0;
                    GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                    GameRenderer.loadingViewType = GameThread.getRandom(6);
                    GameThread.gameLoadFlag = 0;
                    GameThread.loadingStatus = 1007;
                    return;
                case 1007:
                    GameRenderer.loadCount_GAME_RESUME_TO_MENU = 0;
                    return;
                case 1008:
                    GameRenderer.loadCount_GAME_RESUME_TO_PLAY = 0;
                    return;
                default:
                    return;
            }
        }
        firstResumeDone = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            touchManager.addLastInputPoint(1, 0, GameRenderer.CGPointMake((int) ((x / GameRenderer.DRAW_SCALE_SIZE) - GameRenderer.DRAW_SCALE_X_MOVE), (int) ((y / GameRenderer.DRAW_SCALE_SIZE) - GameRenderer.DRAW_SCALE_Y_MOVE)), 1);
            touchManager.processTouchEvent(0);
            touchCheckTOTAL();
            return true;
        }
        if (action == 1) {
            touchManager.addLastInputPoint(1, 0, GameRenderer.CGPointMake((int) ((x / GameRenderer.DRAW_SCALE_SIZE) - GameRenderer.DRAW_SCALE_X_MOVE), (int) ((y / GameRenderer.DRAW_SCALE_SIZE) - GameRenderer.DRAW_SCALE_Y_MOVE)), 1);
            touchManager.processTouchEvent(2);
            touchCheckTOTAL();
            return true;
        }
        if (action == 2) {
            touchManager.addLastInputPoint(1, 0, GameRenderer.CGPointMake((int) ((x / GameRenderer.DRAW_SCALE_SIZE) - GameRenderer.DRAW_SCALE_X_MOVE), (int) ((y / GameRenderer.DRAW_SCALE_SIZE) - GameRenderer.DRAW_SCALE_Y_MOVE)), 1);
            touchManager.processTouchEvent(1);
            touchCheckTOTAL();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void touchCheckTOTAL() {
        if (TouchManager.lastActionStatus != 2)
            return;

        int i = GameThread.gameLoadFlag;
        if (i == 0) {
            switch (GameThread.loadingStatus) {
                case 1000:
                    touchCheck_GAME_PRE_LOAD();
                    return;
                case 1001:
                    touchCheck_GAME_PRE_IMAGE_LOAD();
                    return;
                case 1002:
                    touchCheck_GAME_PRE_TOTAL_IMAGE_LOAD();
                    return;
                case 1003:
                    touchCheck_GAME_NEW_MENU_IMAGE_LOAD();
                    return;
                case 1004:
                    touchCheck_GAME_PLAY_IMAGE_LOAD();
                    return;
                case GameThread.GAME_PLAY2_IMAGE_LOAD /* 1005 */:
                    touchCheck_GAME_PLAY2_IMAGE_LOAD();
                    return;
                case 1006:
                    touchCheck_GAME_MENU_IMAGE_LOAD();
                    return;
                case 1007:
                    touchCheck_GAME_RESUME_TO_MENU();
                    return;
                case 1008:
                    touchCheck_GAME_RESUME_TO_PLAY();
                    return;
                default:
                    return;
            }
        }
        if (i != 1) {
            return;
        }

        NewTower.currentPage.touchCheck();
        switch (GameThread.gameStatus) {
            case 0:
                touchCheck_GAME_LOGO();
                return;
            case 1:
                touchCheck_GAME_USE12();
                return;
            case 2:
                touchCheck_GAME_OPENING();
                return;
            case 3:
                touchCheck_GAME_TITLE();
                return;
            case 4:
            default:
                return;
            case 5:
                touchCheck_GAME_MAINMENU();
                return;
            case 6:
                touchCheck_GAME_MAINMENU_MOVING();
                return;
            case 7:
                touchCheck_GAME_MAINMENU_REV_MOVING();
                return;
            case 8:
                touchCheck_GAME_ABOUT();
                return;
            case 9:
                touchCheck_GAME_OPTION();
                return;
            case 10:
                touchCheck_GAME_STAGE_SELECT();
                return;
            case 11:
                touchCheck_GAME_UPGRADE_LIST();
                return;
            case 12:
                touchCheck_GAME_UPGRADE_UNIT();
                return;
            case 13:
                touchCheck_GAME_UPGRADE_HERO();
                return;
            case 14:
                touchCheck_GAME_SHOP_LIST();
                return;
            case 15:
                touchCheck_GAME_SHOP_SHOP();
                return;
            case 16:
                touchCheck_GAME_SHOP_EQUIP();
                return;
            case 18:
                touchCheck_GAME_HELP();
                return;
            case 19:
                touchCheck_GAME_RECORD();
                return;
            case 20:
                touchCheck_GAME_STAGE_START_VIEW();
                return;
            case 21:
                touchCheck_GAME_INGAME_MENU();
                return;
            case 22:
                touchCheck_GAME_STAGE_CLEAR();
                return;
            case 23:
                touchCheck_GAME_OVER();
                return;
            case 24:
                touchCheck_GAME_STAGE_START_LOADING();
                return;
            case 25:
                touchCheck_GAME_PLAYING();
                return;
            case 26:
                touchCheck_GAME_TUTORIAL();
                return;
            case 27:
                touchCheck_GAME_ENDING();
        }
    }

    public void touchCheck_GAME_PRE_LOAD() {
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_PRE_IMAGE_LOAD() {
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_PRE_TOTAL_IMAGE_LOAD() {
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_NEW_MENU_IMAGE_LOAD() {
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_PLAY_IMAGE_LOAD() {
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_PLAY2_IMAGE_LOAD() {
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_MENU_IMAGE_LOAD() {
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_RESUME_TO_MENU() {
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_RESUME_TO_PLAY() {
        TouchManager.processTouchStatus();
    }
}
