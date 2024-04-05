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
    public static final int GAME_HELP_TOUCH_LIST_TOTAL_COUNT = 4;
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
    public static final int GAME_SHOP_EQUIP_ALERT_OK = 74;
    public static final int GAME_SHOP_EQUIP_MOVE_DISTANCE_LENGTH = 60;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_0_BACK = 60;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_10_INVEN_LEFT = 70;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_11_INVEN_RIGHT = 71;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_12_HERO_BUY_TAP = 72;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_15_SELL = 73;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_1_OK_TOTAL = 61;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_2_SHOP = 62;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_3_EQUIP = 63;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_4_GIFT = 64;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_5_HERO1 = 65;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_6_HERO2 = 66;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_7_HERO3 = 67;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_ETC_START = 60;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_HERO_0_0 = 10;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_HERO_0_1 = 11;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_HERO_1_0 = 12;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_HERO_1_1 = 13;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_HERO_2_0 = 14;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_HERO_2_1 = 15;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_HERO_START = 10;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_INVEN_START = 0;
    public static final int GAME_SHOP_EQUIP_TOUCH_LIST_TOTAL_COUNT = 78;
    public static final int GAME_SHOP_GIFT_TOUCH_LIST_0_BACK = 60;
    public static final int GAME_SHOP_GIFT_TOUCH_LIST_10_SAVE0 = 70;
    public static final int GAME_SHOP_GIFT_TOUCH_LIST_11_DISCARD0 = 71;
    public static final int GAME_SHOP_GIFT_TOUCH_LIST_11_INVEN_LEFT = 76;
    public static final int GAME_SHOP_GIFT_TOUCH_LIST_12_INVEN_RIGHT = 77;
    public static final int GAME_SHOP_GIFT_TOUCH_LIST_12_SAVE1 = 72;
    public static final int GAME_SHOP_GIFT_TOUCH_LIST_13_DISCARD1 = 73;
    public static final int GAME_SHOP_GIFT_TOUCH_LIST_14_SAVE2 = 74;
    public static final int GAME_SHOP_GIFT_TOUCH_LIST_15_DISCARD2 = 75;
    public static final int GAME_SHOP_GIFT_TOUCH_LIST_15_SELL = 78;
    public static final int GAME_SHOP_GIFT_TOUCH_LIST_1_OK_TOTAL = 61;
    public static final int GAME_SHOP_GIFT_TOUCH_LIST_ETC_START = 60;
    public static final int GAME_SHOP_GIFT_TOUCH_LIST_INVEN_START = 0;
    public static final int GAME_SHOP_GIFT_TOUCH_LIST_TOTAL_COUNT = 79;
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
            case 17:
                touchCheck_GAME_SHOP_GIFT();
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
                return;
        }
    }

    public void touchCheck_GAME_PRE_LOAD() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_PRE_IMAGE_LOAD() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_PRE_TOTAL_IMAGE_LOAD() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_NEW_MENU_IMAGE_LOAD() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_PLAY_IMAGE_LOAD() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_PLAY2_IMAGE_LOAD() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_MENU_IMAGE_LOAD() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_RESUME_TO_MENU() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_RESUME_TO_PLAY() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_LOGO() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_USE12() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_OPENING() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        GameThread.playSound(14);
        GameThread.stopLoopSound(2);
        GameThread.gameLoadFlag = 0;
        GameThread.loadingStatus = 1002;
        GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
        GameRenderer.loadCount_GAME_PRE_TOTAL_IMAGE_LOAD = 0;
        GameRenderer.loadingViewType = GameThread.getRandom(6);
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_ENDING() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        GameThread.playSound(14);
        GameThread.stopLoopSound(2);
        GameThread.gameStatus = 10;
        GameThread.gameSubStatus = 0;
        GameRenderer.startViewCount = 0;
        GameThread.stageSelectChapterNumber = 4;
        GameThread.stageSelectStageNumber = 9;
        GameThread.mapAttackType = 0;
        GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
        GameThread.playLoopSound(1);
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_MAINMENU() {
        int i = TouchManager.lastActionStatus;
        if (i != 0) {
            if (i != 2) {
                return;
            }
            TouchManager.processTouchStatus();
            return;
        }
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus != -1) {
            if (TouchManager.curruptFlag) {
                TouchManager.clearTouchStatus();
                return;
            }
            switch (checkTouchListStatus) {
                case 0:
                    GameRenderer.titlePressed = 10;
                    GameThread.playSound(14);
                    GameThread.gameStatus = 6;
                    GameRenderer.titleCount = 0;
                    break;
                case 1:
                    GameRenderer.titlePressed = 14;
                    GameThread.playSound(14);
                    GameThread.gameStatus = 6;
                    GameRenderer.titleCount = 0;
                    break;
                case 2:
                    GameRenderer.titlePressed = 18;
                    GameThread.gameHelpViewNum = 0;
                    GameThread.playSound(14);
                    GameThread.gameStatus = 6;
                    GameRenderer.titleCount = 0;
                    break;
                case 3:
                    GameRenderer.titlePressed = 19;
                    GameThread.playSound(14);
                    GameThread.gameStatus = 6;
                    GameRenderer.titleCount = 0;
                    break;
                case 4:
                    GameRenderer.titlePressed = 11;
                    GameThread.upgradeUnitSelectPos = 0;
                    GameThread.playSound(14);
                    GameThread.gameStatus = 6;
                    GameRenderer.titleCount = 0;
                    break;
                case 5:
                    GameThread.gameStatus = 3;
                    GameThread.gameSubStatus = 0;
                    GameThread.gameTitleViewCount = 0;
                    GameThread.stopLoopSound(1);
                    GameThread.stopLoopSound(0);
                    newTower.HideAdMob();
                    break;
                case 6:
                    newTower.HideAdMob();
                    if (GameThread.freeAdViewCount > 0) {
                        newTower.showMainMenuRewardDialog();
                    } else {
                        newTower.showNotRewardDialog();
                    }
                    break;
            }
        }
        TouchManager.clearTouchStatus();
    }

    public void touchCheck_GAME_MAINMENU_MOVING() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_MAINMENU_REV_MOVING() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_STAGE_SELECT() {
        int i = GameThread.gameSubStatus;
        if (i == 0) {
            if (TouchManager.lastActionStatus != 2) {
                return;
            }
            switch (TouchManager.checkTouchListStatus()) {
                case 0:
                    GameThread.playSound(15);
                    GameRenderer.loadCount_GAME_MENU_IMAGE_LOAD = 0;
                    GameThread.gameStatus = 5;
                    GameThread.gameLoadFlag = 0;
                    GameThread.loadingStatus = 1006;
                    GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
                    GameRenderer.loadingViewType = GameThread.getRandom(6);
                    GameThread.stopLoopSound(1);
                    break;
                case 3:
                    if (GameThread.stageSelectStageNumber > 0) {
                        GameThread.playSound(14);
                        GameThread.stageSelectStageNumber--;
                        if (GameThread.stageSelectStageNumber < 0) {
                            GameThread.stageSelectStageNumber = 9;
                        }
                        GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                        GameThread.mapAttackType = 0;
                        break;
                    }
                    break;
                case 4:
                    if (GameThread.stageSelectStageNumber < 9) {
                        GameThread.playSound(14);
                        GameThread.stageSelectStageNumber++;
                        if (GameThread.stageSelectStageNumber >= 10) {
                            GameThread.stageSelectStageNumber = 0;
                        }
                        GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                        GameThread.mapAttackType = 0;
                        break;
                    }
                    break;
                case 5:
                    GameThread.playSound(14);
                    if (GameThread.gamePlayedCount[(GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber][GameThread.mapAttackType] >= 0 || GameThread.cheatData[3]) {
                        GameThread.gameSubStatus = 1;
                        GameRenderer.startViewCount++;
                        break;
                    }
                    break;
                case 6:
                    GameThread.playSound(14);
                    GameThread.mapAttackType = 0;
                    break;
                case 7:
                    GameThread.playSound(14);
                    GameThread.mapAttackType = 1;
                    break;
                case 8:
                    GameThread.playSound(14);
                    GameThread.mapAttackType = 2;
                    break;
                case 10:
                    GameThread.playSound(14);
                    GameThread.stageSelectChapterNumber = 0;
                    GameThread.stageSelectStageNumber = 0;
                    GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                    GameThread.mapAttackType = 0;
                    break;
                case 11:
                    GameThread.playSound(14);
                    GameThread.stageSelectChapterNumber = 1;
                    GameThread.stageSelectStageNumber = 0;
                    GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                    GameThread.mapAttackType = 0;
                    break;
                case 12:
                    GameThread.playSound(14);
                    GameThread.stageSelectChapterNumber = 2;
                    GameThread.stageSelectStageNumber = 0;
                    GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                    GameThread.mapAttackType = 0;
                    break;
                case 13:
                    GameThread.playSound(14);
                    GameThread.stageSelectChapterNumber = 3;
                    GameThread.stageSelectStageNumber = 0;
                    GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                    GameThread.mapAttackType = 0;
                    break;
                case 14:
                    GameThread.playSound(14);
                    GameThread.stageSelectChapterNumber = 4;
                    GameThread.stageSelectStageNumber = 0;
                    GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                    GameThread.mapAttackType = 0;
                    break;
            }
            if (TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch()) == 9 && TouchManager.checkTouchMoveDegree(true)) {
                GameThread.playSound(14);
                if (TouchManager.lastMoveCheckDistance.y > 0.0f) {
                    if (GameThread.stageSelectStageNumber < 9) {
                        GameThread.stageSelectStageNumber++;
                        if (GameThread.stageSelectStageNumber >= 10) {
                            GameThread.stageSelectStageNumber = 0;
                        }
                        GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                        GameThread.mapAttackType = 0;
                    }
                } else if (TouchManager.lastMoveCheckDistance.y < 0.0f && GameThread.stageSelectStageNumber > 0) {
                    GameThread.stageSelectStageNumber--;
                    if (GameThread.stageSelectStageNumber < 0) {
                        GameThread.stageSelectStageNumber = 9;
                    }
                    GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                    GameThread.mapAttackType = 0;
                }
            }
            TouchManager.processTouchStatus();
            return;
        }
        if (i == 1 && TouchManager.lastActionStatus == 2) {
            TouchManager.processTouchStatus();
        }
    }

    public void touchCheck_GAME_STAGE_START_LOADING() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_STAGE_START_VIEW() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        if (TouchManager.checkTouchYesnoStatus() == 2 && GameRenderer.startViewCount == 15) {
            GameThread.playSound(14);
            GameRenderer.startViewCount++;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_STAGE_CLEAR() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        switch (GameThread.gameSubStatus) {
            case 0:
                newTower.showRewardDialog();
                break;
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
                    if (GameRenderer.startViewCount < 270) {
                        GameThread.playSound(1);
                        GameRenderer.startViewCount = 270;
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
                if (GameThread.myOscillator[19].OscCurrentCount >= 5) {
                    if (GameThread.rewardShowFlag) {
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

    public void touchCheck_GAME_TUTORIAL() {
        int checkTowerUnit;
        int i;
        int checkTowerUnit2;
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        char c = 2;
        int i2 = 0;
        switch (GameThread.gameSubStatus) {
            case 1:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                switch (checkTouchListStatus) {
                    case 10:
                        GameThread.tutorialBoxTouchFlag[0] = 1;
                        break;
                    case 11:
                        GameThread.tutorialBoxTouchFlag[1] = 1;
                        break;
                    case 12:
                        GameThread.tutorialBoxTouchFlag[2] = 1;
                        break;
                    case 13:
                        GameThread.tutorialBoxTouchFlag[3] = 1;
                        break;
                    case 14:
                        GameThread.tutorialBoxTouchFlag[4] = 1;
                        break;
                }
                TouchManager.processTouchStatus();
                return;
            case 2:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                switch (TouchManager.checkTouchListStatus()) {
                    case 15:
                        GameThread.tutorialBoxTouchFlag[5] = 1;
                        break;
                    case 16:
                        GameThread.tutorialBoxTouchFlag[6] = 1;
                        break;
                    case 17:
                        GameThread.tutorialBoxTouchFlag[7] = 1;
                        break;
                }
                TouchManager.processTouchStatus();
                return;
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
                int i3 = TouchManager.lastActionStatus;
                if (i3 == 0) {
                    if (GameThread.characterMenuSelectFlag != 0) {
                        return;
                    }
                    if (checkTouchListStatus == 0 || checkTouchListStatus == 1 || checkTouchListStatus == 2 || checkTouchListStatus == 3 || checkTouchListStatus == 4 || checkTouchListStatus == 5) {
                        GameThread.tutorialViewCount = 0;
                        int i4 = checkTouchListStatus != 0 ? checkTouchListStatus != 1 ? checkTouchListStatus != 2 ? checkTouchListStatus != 3 ? checkTouchListStatus != 4 ? 27 : 24 : 15 : 12 : 3 : 0;
                        GameThread.characterMenuSelectFlag = 1;
                        GameThread.characterAddOrder = checkTouchListStatus;
                        GameThread.characterAddNumber = i4;
                        GameThread.characterAddHeroFlag = false;
                        GameThread.characterAddType = 1;
                        while (i2 < 7) {
                            if (i2 != checkTouchListStatus) {
                                GameThread.myOscillator[i2].initWithTwoWayStartPosition(0, 200, 10, 210, 5);
                            }
                            i2++;
                        }
                        return;
                    }
                    return;
                }
                if (i3 == 1) {
                    if (GameThread.characterMenuSelectFlag == 0 && (checkTowerUnit = GameThread.checkTowerUnit()) != -1) {
                        GameThread.tempCharacterRangeViewNumber = checkTowerUnit;
                        return;
                    }
                    return;
                }
                if (i3 != 2) {
                    return;
                }
                GameThread.tempCharacterRangeViewNumber = -1;
                if (TouchManager.checkTouchListStatus() == 11) {
                    TouchManager.processTouchStatus();
                    return;
                }
                if (GameThread.characterMenuSelectFlag == 1) {
                    GameThread.characterMenuSelectFlag = 0;
                    int i5 = GameThread.gameSubStatus;
                    if (i5 == 3) {
                        c = 0;
                    } else if (i5 == 5) {
                        c = 1;
                    } else if (i5 != 7) {
                        c = i5 != 9 ? i5 != 11 ? (char) 5 : (char) 4 : (char) 3;
                    }
                    int i6 = (int) ((GameThread.characterAddPosX - 62.0f) / 45.0f);
                    int i7 = (int) ((GameThread.characterAddPosY - 30.0f) / 45.0f);
                    if (i6 == GameThread.tutorialUnitPos[c][0] && i7 == GameThread.tutorialUnitPos[c][1]) {
                        GameThread.playSound(14);
                        GameThread.getAddSettingPosition();
                        NewTower.gameThread.addTowerUnit(GameThread.characterAddNumber, i6, i7, true);
                        GameThread.myMoney -= GameThread.getBuyPrice(GameThread.characterAddNumber);
                        GameThread.characterMenuSelectFlag = 0;
                    }
                    while (i2 < 7) {
                        if (i2 != GameThread.characterAddOrder) {
                            GameThread.myOscillator[i2].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                        }
                        i2++;
                    }
                }
                TouchManager.processTouchStatus();
                return;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                switch (TouchManager.checkTouchListStatus()) {
                    case 18:
                        GameThread.gameSubStatus = 5;
                        break;
                    case 19:
                        GameThread.gameSubStatus = 7;
                        break;
                    case 20:
                        GameThread.gameSubStatus = 9;
                        break;
                    case 21:
                        GameThread.gameSubStatus = 11;
                        break;
                    case 22:
                        GameThread.gameSubStatus = 13;
                        break;
                    case 23:
                        GameThread.gameSubStatus = 15;
                        GameThread.characterMenuSelectFlag = 3;
                        GameThread.myOscillator[8].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
                        GameThread.myOscillator[9].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
                        GameThread.myOscillator[10].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
                        break;
                }
                TouchManager.processTouchStatus();
                return;
            case 15:
                int i8 = TouchManager.lastActionStatus;
                if (i8 == 0) {
                    if (GameThread.characterMenuSelectFlag != 3) {
                        return;
                    }
                    i = 8;
                    if (checkTouchListStatus != 7)
                        if (checkTouchListStatus != 8 && checkTouchListStatus != 9)
                            return;
                    GameThread.characterMenuSelectFlag = 4;
                    GameThread.characterAddOrder = checkTouchListStatus - i;
                    GameThread.characterAddNumber = 0;
                    GameThread.characterAddHeroFlag = true;
                    GameThread.characterAddType = 4;
                    return;
                }
                if (i8 == 1) {
                    if (GameThread.characterMenuSelectFlag == 0 && (checkTowerUnit2 = GameThread.checkTowerUnit()) != -1) {
                        GameThread.tempCharacterRangeViewNumber = checkTowerUnit2;
                        return;
                    }
                    return;
                }
                if (i8 != 2) {
                    return;
                }
                GameThread.tempCharacterRangeViewNumber = -1;
                if (TouchManager.checkTouchListStatus() == 11) {
                    TouchManager.processTouchStatus();
                    return;
                }
                if (GameThread.characterMenuSelectFlag == 4) {
                    int i9 = (int) ((GameThread.characterAddPosX - 62.0f) / 45.0f);
                    int i10 = (int) ((GameThread.characterAddPosY - 30.0f) / 45.0f);
                    if (i9 == GameThread.tutorialUnitPos[6][0] && i10 == GameThread.tutorialUnitPos[6][1]) {
                        GameThread.playSound(14);
                        GameThread.getAddSettingPosition();
                        GameThread.characterSelectNumber = GameThread.addHeroTowerUnit(GameThread.characterAddNumber, GameThread.characterAddOrder, i9, i10, true, false);
                        GameThread.characterMenuSelectFlag = 0;
                        GameThread.myOscillator[8].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                        GameThread.myOscillator[9].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                        GameThread.myOscillator[10].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                        GameThread.characterMenuSelectFlag = 0;
                    } else {
                        GameThread.characterMenuSelectFlag = 3;
                    }
                }
                TouchManager.processTouchStatus();
                return;
            case 16:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                if (TouchManager.checkTouchListStatus() == 24) {
                    GameThread.gameSubStatus = 17;
                }
                TouchManager.processTouchStatus();
                return;
            case 17:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                if (TouchManager.checkTouchListStatus() == 25) {
                    GameThread.gameSubStatus = 18;
                }
                TouchManager.processTouchStatus();
                return;
            case 18:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                if (TouchManager.checkTouchListStatus() == 26) {
                    if (GameThread.tutorialFlag == 0) {
                        GameThread.gameSubStatus = 19;
                        GameThread.tutorialFlag = 1;
                        GameThread.myHeroism += 300;
                        GameThread.rewardDataValue[0] = 1;
                        GameThread.heroUnitType[0] = 0;
                        Config.saveAll(newTower);
                    } else {
                        GameThread.gameSubStatus = 22;
                    }
                }
                TouchManager.processTouchStatus();
                return;
            case 19:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                if (TouchManager.checkTouchListStatus() == 27) {
                    GameThread.gameSubStatus = 20;
                }
                TouchManager.processTouchStatus();
                return;
            case 20:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                if (TouchManager.checkTouchListStatus() == 28) {
                    GameThread.gameSubStatus = 21;
                }
                TouchManager.processTouchStatus();
                return;
            case 21:
            case 22:
                if (TouchManager.lastActionStatus != 2) {
                    return;
                }
                if (TouchManager.checkTouchListStatus() == 30) {
                    GameThread.playSound(14);
                    GameThread.gameStatus = 10;
                    GameThread.gameSubStatus = 0;
                    GameRenderer.startViewCount = 0;
                    GameThread.mapNumber = 0;
                    GameThread.stageSelectChapterNumber = 0;
                    GameThread.stageSelectStageNumber = 0;
                    GameThread.mapAttackType = 0;
                    GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                    GameThread.playLoopSound(1);
                }
                TouchManager.processTouchStatus();
                return;
            default:
                return;
        }
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
            if (GameThread.wavePattern != 3 && GameThread.characterMenuMonsterViewCount > 0) {
                GameThread.characterMenuMonsterViewCount = 0;
            }
            int checkTouchListStatus = TouchManager.checkTouchListStatus();
            switch (checkTouchListStatus) {
                case 11:
                case 12:
                case 13:
                    return;
                default:
                    int i5 = GameThread.characterMenuSelectFlag;
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
                                if (GameThread.checkEnableHeroBuyUnit(i6)) {
                                    GameThread.characterMenuSelectFlag = 4;
                                    GameThread.characterAddOrder = i6;
                                    GameThread.characterAddNumber = i;
                                    GameThread.characterAddHeroFlag = true;
                                    GameThread.characterAddType = 4;
                                    return;
                                }
                                TouchManager.processTouchStatus();
                                return;
                            default:
                                GameThread.characterMenuSelectFlag = 0;
                                GameThread.myOscillator[8].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                GameThread.myOscillator[9].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                GameThread.myOscillator[10].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
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
                        if (!GameThread.checkEnableBuyUnit(i4)) {
                            GameThread.characterMenuSelectFlag = 1;
                            GameThread.characterAddOrder = checkTouchListStatus;
                            GameThread.characterAddNumber = i4;
                            GameThread.characterAddHeroFlag = false;
                            GameThread.characterAddType = 1;
                            while (i3 < 7) {
                                if (i3 != checkTouchListStatus) {
                                    GameThread.myOscillator[i3].initWithTwoWayStartPosition(0, 200, 10, 210, 5);
                                }
                                i3++;
                            }
                            return;
                        }
                        TouchManager.processTouchStatus();
                        return;
                    }
                    i4 = 0;
                    if (!GameThread.checkEnableBuyUnit(i4)) {
                    }
                    break;
            }
        } else {
            if (i2 == 1) {
                if (GameThread.characterMenuSelectFlag == 0 && (checkTowerUnit2 = GameThread.checkTowerUnit()) != -1) {
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
                GameThread.characterMenuSelectFlag = 3;
                GameThread.myOscillator[8].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
                GameThread.myOscillator[9].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
                GameThread.myOscillator[10].initWithTwoWayStartPosition(GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 0, 10, -10, 5);
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
                    GameThread.myWaveRunFlag = !GameThread.myWaveRunFlag;
                    TouchManager.processTouchStatus();
                    return;
                case 13:
                    GameThread.playSound(14);
                    int i7 = GameThread.turboFlag;
                    if (i7 == 1) {
                        GameThread.turboFlag = 3;
                    } else if (i7 == 3) {
                        GameThread.turboFlag = 1;
                    }
                    TouchManager.processTouchStatus();
                    return;
                default:
                    switch (GameThread.characterMenuSelectFlag) {
                        case 0:
                            int checkTowerUnit3 = GameThread.checkTowerUnit();
                            if (checkTowerUnit3 != -1) {
                                GameThread.playSound(14);
                                GameThread.characterMenuSelectFlag = 2;
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
                                        GameThread.characterMenuSelectFlag = 0;
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
                                            GameThread.characterMenuSelectFlag = 0;
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
                            GameThread.characterMenuSelectFlag = 0;
                            if (NewTower.gameThread.enableAddUnit()) {
                                GameThread.playSound(14);
                                GameThread.getAddSettingPosition();
                                NewTower.gameThread.addTowerUnit(GameThread.characterAddNumber, (int) ((GameThread.characterAddPosX - 62.0f) / 45.0f), (int) ((GameThread.characterAddPosY - 30.0f) / 45.0f), true);
                                GameThread.myMoney -= GameThread.getBuyPrice(GameThread.characterAddNumber);
                                GameThread.characterMenuSelectFlag = 0;
                            }
                            while (i3 < 7) {
                                if (i3 != GameThread.characterAddOrder) {
                                    GameThread.myOscillator[i3].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
                                }
                                i3++;
                            }
                            break;
                        case 2:
                            switch (checkTouchListStatus2) {
                                case 14:
                                    GameThread.playSound(14);
                                    GameThread.sellTowerUnit(GameThread.characterSelectNumber);
                                    GameThread.characterMenuSelectFlag = 0;
                                    break;
                                case 15:
                                    GameThread.playSound(14);
                                    GameThread.characterMenuSelectFlag = 12;
                                    break;
                                case 16:
                                    GameThread.playSound(14);
                                    GameThread.characterMenuSelectFlag = 13;
                                    break;
                                case 17:
                                default:
                                    GameThread.characterMenuSelectFlag = 0;
                                    break;
                                case 18:
                                    GameThread.playSound(14);
                                    GameThread.useSpecialAttack(GameThread.characterSelectNumber);
                                    break;
                                case 19:
                                    break;
                            }
                        case 4:
                            GameThread.characterMenuSelectFlag = 0;
                            if (NewTower.gameThread.enableAddUnit()) {
                                GameThread.playSound(14);
                                GameThread.getAddSettingPosition();
                                int addHeroTowerUnit = GameThread.addHeroTowerUnit(GameThread.characterAddNumber, GameThread.characterAddOrder, (int) ((GameThread.characterAddPosX - 62.0f) / 45.0f), (int) ((GameThread.characterAddPosY - 30.0f) / 45.0f), true, true);
                                GameThread.myOscillator[8].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                GameThread.myOscillator[9].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                GameThread.myOscillator[10].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                GameThread.characterMenuSelectFlag = 6;
                                GameThread.characterSelectNumber = addHeroTowerUnit;
                                if (GameThread.characterMenuMonsterViewCount > 0) {
                                    GameThread.characterMenuMonsterViewCount = 0;
                                    break;
                                }
                            } else {
                                GameThread.characterMenuSelectFlag = 0;
                                GameThread.myOscillator[8].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                GameThread.myOscillator[9].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                GameThread.myOscillator[10].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                                break;
                            }
                            break;
                        case 5:
                            if (checkTouchListStatus2 == 17) {
                                GameThread.playSound(14);
                                GameThread.myMoney -= GameThread.getBuyPrice(GameThread.characterAddNumber);
                                GameThread.characterMenuSelectFlag = 0;
                                break;
                            } else if (checkTouchListStatus2 != 19) {
                                GameThread.towerUnit[GameThread.characterSelectNumber].towerType = -1;
                                GameThread.characterMenuSelectFlag = 0;
                                break;
                            }
                            break;
                        case 6:
                            if (checkTouchListStatus2 == 17) {
                                GameThread.playSound(14);
                                GameThread.myMana -= GameThread.getHeroBuyPrice(GameThread.characterAddOrder);
                                GameThread.characterMenuSelectFlag = 0;
                                break;
                            } else if (checkTouchListStatus2 != 19) {
                                GameThread.towerUnit[GameThread.characterSelectNumber].towerType = -1;
                                GameThread.characterMenuSelectFlag = 0;
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
                                GameThread.upgradeUnit(GameThread.characterSelectNumber);
                                GameThread.characterMenuSelectFlag = 2;
                                break;
                            } else if (checkTouchListStatus2 == 21) {
                                GameThread.playSound(15);
                                GameThread.characterMenuSelectFlag = 2;
                                break;
                            }
                            break;
                        case 13:
                            if (checkTouchListStatus2 == 20) {
                                GameThread.playSound(14);
                                GameThread.levelUpUnit(GameThread.characterSelectNumber);
                                GameThread.characterMenuSelectFlag = 2;
                                break;
                            } else if (checkTouchListStatus2 == 21) {
                                GameThread.playSound(15);
                                GameThread.characterMenuSelectFlag = 2;
                                break;
                            }
                            break;
                    }
                    TouchManager.processTouchStatus();
            }
        }
    }

    public void touchCheck_GAME_OVER() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        int i = GameThread.gameSubStatus;
        if (i == 0) {
            newTower.showRewardDialog();
        } else if (i == 1) {
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
            } else if (checkTouchListStatus == 4 && GameRenderer.startViewCount < 270) {
                GameThread.playSound(1);
                GameRenderer.startViewCount = 270;
            }
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_ABOUT() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        int i = GameThread.gameSubStatus;
        if (i != 0) {
            if (i == 1 && checkTouchListStatus == 0) {
                GameThread.gameSubStatus = 0;
                GameThread.playSound(15);
            }
        } else if (checkTouchListStatus == 0) {
            GameThread.gameStatus = 3;
            GameThread.gameSubStatus = 12;
            GameThread.gameTitleViewCount = 0;
            GameThread.playSound(15);
        } else if (checkTouchListStatus == 1) {
            GameThread.gameSubStatus = 1;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_OPTION() {
        int i = TouchManager.lastActionStatus;
        if (i == 0) {
            CGPoint firstFirstActionTouch = TouchManager.getFirstFirstActionTouch();
            int checkTouchListStatus = TouchManager.checkTouchListStatus();
            if (checkTouchListStatus == 1) {
                GameThread.myScrollbar[0].setUpdatePosition(firstFirstActionTouch.x);
                Config.updateVolume(GameThread.myScrollbar[0].BarLastValue);
            } else {
                if (checkTouchListStatus != 2) {
                    return;
                }
                GameThread.myScrollbar[1].setUpdatePosition(firstFirstActionTouch.x);
                Config.effectVolume = GameThread.myScrollbar[1].BarLastValue;
            }
            return;
        }
        if (i == 1) {
            int checkTouchListPressed = TouchManager.checkTouchListPressed(TouchManager.getFirstFirstActionTouch());
            if (checkTouchListPressed == 1) {
                GameThread.myScrollbar[0].setUpdatePosition(TouchManager.getFirstLastActionTouch().x);
                Config.updateVolume(GameThread.myScrollbar[0].BarLastValue);
                return;
            }
            if (checkTouchListPressed != 2) {
                return;
            }
            GameThread.myScrollbar[1].setUpdatePosition(TouchManager.getFirstLastActionTouch().x);
            Config.effectVolume = GameThread.myScrollbar[1].BarLastValue;
            return;
        }
        if (i != 2) {
            return;
        }
        int checkTouchListStatus2 = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus2 == 0) {
            GameThread.gameStatus = 3;
            GameThread.gameSubStatus = 12;
            GameThread.gameTitleViewCount = 0;
            GameThread.playSound(15);
        } else if (checkTouchListStatus2 == 3) {
            GameThread.playSound(14);
            if (GameThread.movieViewFlag == 1) {
                GameThread.movieViewFlag = 0;
            } else {
                GameThread.movieViewFlag = 1;
            }
            Config.saveAll(newTower);
        } else if (checkTouchListStatus2 == 4) {
            GameThread.playSound(14);
            Config.vibration = !Config.vibration;

            Config.saveAll(newTower);
        }
        int checkTouchListPressed2 = TouchManager.checkTouchListPressed(TouchManager.getFirstFirstActionTouch());
        if (checkTouchListPressed2 == 1) {
            GameThread.myScrollbar[0].setUpdatePosition(TouchManager.getFirstLastActionTouch().x);
            Config.updateVolume(GameThread.myScrollbar[0].BarLastValue);
            Config.saveAll(newTower);
        } else if (checkTouchListPressed2 == 2) {
            GameThread.myScrollbar[1].setUpdatePosition(TouchManager.getFirstLastActionTouch().x);
            Config.effectVolume = GameThread.myScrollbar[1].BarLastValue;
            Config.saveAll(newTower);
        }
        TouchManager.processTouchStatus();
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

    public void touchCheck_GAME_TITLE() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        switch (GameThread.gameSubStatus) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                if (TouchManager.checkTouchListStatus() == 0) {
                    GameThread.gameSubStatus = 12;
                    GameThread.playLoopSound(0);
                    break;
                }
                break;
            case 12:
                int checkTouchListStatus = TouchManager.checkTouchListStatus();
                if (checkTouchListStatus == 0) {
                    GameThread.gameStatus = 5;
                    GameThread.playSound(14);
                    GameThread.stopLoopSound(0);
                    GameThread.playLoopSound(1);
                    TouchManager.curruptFlag = true;
                    break;
                } else if (checkTouchListStatus == 1) {
                    GameThread.playSound(14);
                    GameThread.gameStatus = 9;
                    break;
                } else if (checkTouchListStatus == 2) {
                    GameThread.playSound(14);
                    GameThread.gameStatus = 8;
                    GameThread.gameSubStatus = 0;
                    break;
                } else if (checkTouchListStatus == 3) {
                    newTower.startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("http://www.facebook.com/fandikor")), 1);
                    break;
                } else if (checkTouchListStatus == 4) {
                    newTower.startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("http://www.twitter.com/fandi_kor")), 1);
                    break;
                }
                break;
        }
        TouchManager.processTouchStatus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0 != 3) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void touchCheck_GAME_UPGRADE_LIST() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus != -1) {
            if (checkTouchListStatus != 0) {
                if (checkTouchListStatus == 1) {
                    GameThread.gameStatus = 12;
                    GameThread.upgradeUnitSelectPos = 0;
                    GameThread.playSound(14);
                    GameThread.lastUpdateItemViewDelay = 0;
                } else if (checkTouchListStatus == 2) {
                    GameThread.gameStatus = 13;
                    GameThread.gameSubStatus = 0;
                    GameThread.upgradeHeroUpgradeSelectPos = 0;
                    GameThread.upgradeHeroUnitSelectPos = 0;
                    GameThread.playSound(14);
                    GameThread.lastUpdateItemViewDelay = 0;
                }
            }
            GameRenderer.titlePressed = 11;
            GameThread.upgradeUnitSelectPos = 0;
            GameThread.gameStatus = 7;
            GameRenderer.titleCount = 0;
            GameThread.playSound(15);
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_UPGRADE_UNIT() {
        int i;
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus != -1) {
            switch (checkTouchListStatus) {
                case 24:
                    GameThread.gameStatus = 11;
                    GameThread.playSound(15);
                    break;
                case 25:
                    if (GameThread.upgradeUnitValue[GameThread.upgradeUnitSelectPos] < GameThread.getUpgradeUnitMax(GameThread.upgradeUnitSelectPos) && GameThread.myHeroism >= (i = (DataUpgradeUnit.upgradeUnitData[GameThread.upgradeUnitSelectPos][1] * ((GameThread.upgradeUnitValue[GameThread.upgradeUnitSelectPos] * DataUpgradeUnit.upgradeUnitData[GameThread.upgradeUnitSelectPos][2]) + 100)) / 100)) {
                        GameThread.myHeroism -= i;
                        int[] iArr = GameThread.upgradeUnitValue;
                        int i2 = GameThread.upgradeUnitSelectPos;
                        iArr[i2] = iArr[i2] + 1;
                        GameThread.playSound(13);
                        int[] iArr2 = GameThread.awardDataValue;
                        iArr2[11] = iArr2[11] + 1;
                        if (GameThread.upgradeUnitValue[GameThread.upgradeUnitSelectPos] >= DataUpgradeUnit.upgradeUnitData[GameThread.upgradeUnitSelectPos][3]) {
                            int[] iArr3 = GameThread.awardDataValue;
                            iArr3[12] = iArr3[12] + 1;
                        }
                        GameThread.recheckAwardData();
                        Config.saveAll(newTower);
                        GameThread.lastUpdateItemPos = GameThread.upgradeUnitSelectPos;
                        GameThread.lastUpdateItemViewDelay = 15;
                        break;
                    }
                    break;
                case 26:
                default:
                    GameThread.upgradeUnitSelectPos = checkTouchListStatus;
                    break;
                case 27:
                    GameThread.gameStatus = 13;
                    GameThread.gameSubStatus = 0;
                    GameThread.upgradeHeroUpgradeSelectPos = 0;
                    GameThread.upgradeHeroUnitSelectPos = 0;
                    GameThread.playSound(14);
                    GameThread.lastUpdateItemViewDelay = 0;
                    break;
                case 28:
                    GameThread.upgradeUnitSelectPos %= 6;
                    break;
                case 29:
                    GameThread.upgradeUnitSelectPos = (GameThread.upgradeUnitSelectPos % 6) + 6;
                    break;
                case 30:
                    GameThread.upgradeUnitSelectPos = (GameThread.upgradeUnitSelectPos % 6) + 12;
                    break;
                case 31:
                    GameThread.upgradeUnitSelectPos = (GameThread.upgradeUnitSelectPos % 6) + 18;
                    break;
            }
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_UPGRADE_HERO() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus != -1) {
            switch (checkTouchListStatus) {
                case 60:
                    GameThread.gameStatus = 11;
                    GameThread.playSound(15);
                    break;
                case 61:
                    if (GameThread.heroUnitType[GameThread.upgradeHeroUnitSelectPos] != -1 && GameThread.heroUpgradeValue[GameThread.upgradeHeroUnitSelectPos][GameThread.upgradeHeroUpgradeSelectPos] < GameThread.getUpgradeHeroMax(GameThread.upgradeHeroUnitSelectPos, GameThread.upgradeHeroUpgradeSelectPos) && GameThread.myHeroism >= GameThread.getUpgradeHeroHeroism(GameThread.upgradeHeroUnitSelectPos, GameThread.upgradeHeroUpgradeSelectPos)) {
                        GameThread.myHeroism -= GameThread.getUpgradeHeroHeroism(GameThread.upgradeHeroUnitSelectPos, GameThread.upgradeHeroUpgradeSelectPos);
                        int[] iArr = GameThread.heroUpgradeValue[GameThread.upgradeHeroUnitSelectPos];
                        int i = GameThread.upgradeHeroUpgradeSelectPos;
                        iArr[i] = iArr[i] + 1;
                        int[] iArr2 = GameThread.awardDataValue;
                        iArr2[11] = iArr2[11] + 1;
                        if (GameThread.heroUpgradeValue[GameThread.upgradeHeroUnitSelectPos][GameThread.upgradeHeroUpgradeSelectPos] >= DataUpgradeHero.upgradeHeroData[GameThread.upgradeHeroUpgradeSelectPos][3]) {
                            int[] iArr3 = GameThread.awardDataValue;
                            iArr3[12] = iArr3[12] + 1;
                        }
                        GameThread.recheckAwardData();
                        Config.saveAll(newTower);
                        GameThread.playSound(13);
                        GameThread.lastUpdateItemPos = (GameThread.upgradeHeroUnitSelectPos * 6) + GameThread.upgradeHeroUpgradeSelectPos;
                        GameThread.lastUpdateItemViewDelay = 15;
                        break;
                    }
                    break;
                case 62:
                    GameThread.gameStatus = 12;
                    GameThread.upgradeUnitSelectPos = 0;
                    GameThread.playSound(14);
                    GameThread.lastUpdateItemViewDelay = 0;
                    break;
                case 63:
                case 64:
                default:
                    GameThread.playSound(14);
                    int i2 = checkTouchListStatus - 40;
                    GameThread.upgradeHeroUnitSelectPos = i2 / 6;
                    GameThread.upgradeHeroUpgradeSelectPos = i2 % 6;
                    break;
                case 65:
                    GameThread.upgradeHeroUnitSelectPos = 0;
                    break;
                case 66:
                    GameThread.upgradeHeroUnitSelectPos = 1;
                    break;
                case 67:
                    GameThread.upgradeHeroUnitSelectPos = 2;
                    break;
            }
        }
        TouchManager.processTouchStatus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r0 != 4) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void touchCheck_GAME_SHOP_LIST() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus != 0) {
            if (checkTouchListStatus == 1) {
                GameThread.gameStatus = 15;
                GameThread.gameSubStatus = 0;
                GameThread.shopShopChapterSelectPos = 0;
                GameThread.shopShopItemSelectPos = 0;
                GameThread.shopShopInventorySelectPos = 0;
                GameThread.getShopList();
                GameThread.playSound(14);
                TouchManager.processTouchStatus();
            } else if (checkTouchListStatus == 2) {
                GameThread.gameStatus = 16;
                GameThread.gameSubStatus = 2;
                GameThread.upgradeHeroUnitSelectPos = 0;
                GameThread.shopShopInventorySelectPos = 0;
                GameThread.upgradeHeroEquipSelectPos = 0;
                GameThread.setEquipHeroSetting();
            } else if (checkTouchListStatus == 3) {
                GameThread.gameStatus = 17;
                if (GameThread.myPhoneAlertFlag == 0) {
                    GameThread.gameSubStatus = 4;
                } else {
                    GameThread.gameSubStatus = 1;
                    GameThread.getCountStartNetwork();
                }
                GameThread.playSound(14);
            }
            TouchManager.processTouchStatus();
        }
        GameThread.myOscillator[11].initWithTwoWayStartPosition(-150, 0, 15, 30, 10);
        GameRenderer.titlePressed = 14;
        GameThread.shopShopChapterSelectPos = 0;
        GameThread.shopShopItemSelectPos = 0;
        GameThread.shopShopInventorySelectPos = 0;
        GameThread.gameStatus = 7;
        GameRenderer.titleCount = 0;
        GameThread.playSound(15);
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_SHOP_SHOP() {
        int i;
        int i2 = TouchManager.lastActionStatus;
        if (i2 == 0) {
            int checkTouchListStatus = TouchManager.checkTouchListStatus();
            int i3 = GameThread.gameSubStatus;
            if (i3 == 0 || i3 == 1) {
                if (checkTouchListStatus == 34) {
                    GameThread.gameSubStatus = 0;
                    GameRenderer.upgradeItemListDraw.backupCurrentDrawPosition();
                } else {
                    if (checkTouchListStatus != 35) {
                        return;
                    }
                    GameThread.gameSubStatus = 0;
                    GameThread.myScrollbar[4].setUpdatePosition(TouchManager.getFirstFirstActionTouch().y);
                    GameRenderer.upgradeItemListDraw.setAnchorDrawPosition(GameThread.myScrollbar[4].BarLastValue);
                }
            }
            return;
        }
        if (i2 == 1) {
            int checkTouchListPressed = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
            int i4 = GameThread.gameSubStatus;
            if (i4 == 0 || i4 == 1) {
                if (checkTouchListPressed != 34) {
                    if (checkTouchListPressed != 35) {
                        return;
                    }
                    GameThread.myScrollbar[4].setUpdatePosition(TouchManager.getFirstLastActionTouch().y);
                    GameRenderer.upgradeItemListDraw.setAnchorDrawPosition(GameThread.myScrollbar[4].BarLastValue);
                    return;
                }
                if (TouchManager.checkTouchMoveDegree(true)) {
                    GameRenderer.upgradeItemListDraw.resetWithDegree((int) (-TouchManager.lastMoveCheckDistance.y));
                    GameThread.myScrollbar[4].setReverseUpdatePosition(GameRenderer.upgradeItemListDraw.currentDrawPosition);
                    return;
                }
                return;
            }
            return;
        }
        if (i2 != 2) {
            return;
        }
        GameRenderer.upgradeItemListDraw.resetTargetPosition();
        int checkTouchListStatus2 = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus2 != -1) {
            switch (GameThread.gameSubStatus) {
                case 0:
                case 1:
                    if (checkTouchListStatus2 != 36) {
                        switch (checkTouchListStatus2) {
                            case 30:
                                GameThread.gameStatus = 14;
                                GameThread.playSound(15);
                                break;
                            case 31:
                                GameThread.gameStatus = 16;
                                GameThread.gameSubStatus = 2;
                                GameThread.upgradeHeroUnitSelectPos = 0;
                                GameThread.shopShopInventorySelectPos = 0;
                                GameThread.upgradeHeroEquipSelectPos = 0;
                                GameThread.setEquipHeroSetting();
                                GameThread.playSound(14);
                                break;
                            case 32:
                                GameThread.playSound(14);
                                GameThread.shopShopInventorySelectPos -= 8;
                                if (GameThread.shopShopInventorySelectPos < 0) {
                                    GameThread.shopShopInventorySelectPos += 24;
                                    break;
                                }
                                break;
                            case 33:
                                GameThread.playSound(14);
                                GameThread.shopShopInventorySelectPos += 8;
                                if (GameThread.shopShopInventorySelectPos >= 24) {
                                    GameThread.shopShopInventorySelectPos -= 24;
                                    break;
                                }
                                break;
                            default:
                                if (checkTouchListStatus2 >= 10) {
                                    if (checkTouchListStatus2 < 30) {
                                        int i5 = checkTouchListStatus2 - 10;
                                        int i6 = GameRenderer.upgradeItemListDraw.blockCurrentArray[GameRenderer.upgradeItemListDraw.totalHalfBlockSize + (i5 / 2)];
                                        if (i6 != -1 && (i = GameThread.shopUnitValue[i6]) != -1) {
                                            int i7 = i5 % 2;
                                            if (i7 == 0) {
                                                if (DataUpgradeItem.upgradeItemData[i][3] != 0 && GameThread.myHeroism >= DataUpgradeItem.upgradeItemData[i][4]) {
                                                    GameThread.shopSendItemNumber = i;
                                                    GameThread.shopSendPhoneNumberCount = 0;
                                                    GameThread.gameSubStatus = 2;
                                                    break;
                                                }
                                            } else {
                                                if (GameThread.buyShopItem(GameThread.shopUnitValue[i6]) == 2) {
                                                    GameThread.gameSubStatus = 7;
                                                }
                                                GameThread.playSound(14);
                                                Config.saveAll(newTower);
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    GameThread.playSound(14);
                                    GameThread.gameSubStatus = 1;
                                    GameThread.shopShopInventorySelectPos = (GameThread.shopShopInventorySelectPos - (GameThread.shopShopInventorySelectPos % 8)) + (checkTouchListStatus2);
                                    break;
                                }
                                break;
                        }
                    } else if (GameThread.gameSubStatus == 1) {
                        int sellShopItem = GameThread.sellShopItem();
                        GameThread.playSound(14);
                        if (sellShopItem == 0) {
                            Config.saveAll(newTower);
                            break;
                        } else if (sellShopItem == 2) {
                            GameThread.gameSubStatus = 8;
                            break;
                        }
                    }
                    break;
                case 2:
                    switch (checkTouchListStatus2) {
                        case 40:
                            GameThread.gameSubStatus = 0;
                            break;
                        case 41:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 1;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 42:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 2;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 43:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 3;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 44:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 4;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 45:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 5;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 46:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 6;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 47:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 7;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 48:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 8;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 49:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 9;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 50:
                            if (GameThread.shopSendPhoneNumberCount > 0) {
                                GameThread.shopSendPhoneNumberCount--;
                                break;
                            }
                            break;
                        case 51:
                            if (GameThread.shopSendPhoneNumberCount < 11) {
                                GameThread.shopSendPhoneNumber[GameThread.shopSendPhoneNumberCount] = 0;
                                GameThread.shopSendPhoneNumberCount++;
                                break;
                            }
                            break;
                        case 52:
                            if (GameThread.shopSendPhoneNumberCount >= 10) {
                                GameThread.gameSubStatus = 3;
                                break;
                            }
                            break;
                    }
                case 3:
                    if (checkTouchListStatus2 == 54) {
                        GameThread.sendGiftStartNetwork();
                        GameThread.gameSubStatus = 4;
                        break;
                    } else if (checkTouchListStatus2 == 55) {
                        GameThread.gameSubStatus = 0;
                        break;
                    }
                    break;
                case 5, 6, 7, 8:
                    if (checkTouchListStatus2 == 53) {
                        GameThread.gameSubStatus = 0;
                        break;
                    }
                    break;
            }
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_SHOP_EQUIP() {
        int i = TouchManager.lastActionStatus;
        if (i == 0) {
            int i2 = GameThread.gameSubStatus;
            if (i2 == 2 || i2 == 3 || i2 == 4) {
                int checkTouchListStatus = TouchManager.checkTouchListStatus();
                if (checkTouchListStatus == -1) {
                    touchStart_GAME_SHOP_EQUIP_NUM = -1;
                    return;
                }
                if (checkTouchListStatus < 10) {
                    if (GameThread.itemUnitValue[(GameThread.shopShopInventorySelectPos - (GameThread.shopShopInventorySelectPos % 8)) + checkTouchListStatus] != -1) {
                        touchStart_GAME_SHOP_EQUIP_NUM = checkTouchListStatus;
                    } else {
                        touchStart_GAME_SHOP_EQUIP_NUM = -1;
                    }
                    return;
                }
                if (checkTouchListStatus < 60) {
                    int i3 = checkTouchListStatus - 10;
                    if (GameThread.heroItemType[i3 / 2][i3 % 2] != -1) {
                        touchStart_GAME_SHOP_EQUIP_NUM = checkTouchListStatus;
                    } else {
                        touchStart_GAME_SHOP_EQUIP_NUM = -1;
                    }
                    return;
                }
                touchStart_GAME_SHOP_EQUIP_NUM = -1;
                return;
            }
            touchStart_GAME_SHOP_EQUIP_NUM = -1;
            return;
        }
        if (i == 1) {
            int i4 = GameThread.gameSubStatus;
            if (i4 == 2 || i4 == 3 || i4 == 4) {
                CGPoint firstFirstActionTouch = TouchManager.getFirstFirstActionTouch();
                CGPoint firstLastActionTouch = TouchManager.getFirstLastActionTouch();
                int checkTouchListPressed = TouchManager.checkTouchListPressed(firstFirstActionTouch);
                if (checkTouchListPressed != -1 && Math.abs(firstFirstActionTouch.x - firstLastActionTouch.x) + Math.abs(firstFirstActionTouch.y - firstLastActionTouch.y) >= 60.0f) {
                    if (checkTouchListPressed < 10) {
                        int i5 = GameThread.shopShopInventorySelectPos - (GameThread.shopShopInventorySelectPos % 8);
                        int i6 = touchStart_GAME_SHOP_EQUIP_NUM;
                        int i7 = i5 + i6;
                        if (i6 != -1 && GameThread.itemUnitValue[i7] != -1) {
                            GameThread.gameSubStatus = 7;
                            GameThread.shopShopInventorySelectPos = i7;
                        } else {
                            TouchManager.clearTouchMap();
                        }
                        return;
                    }
                    if (checkTouchListPressed < 60) {
                        int i8 = checkTouchListPressed - 10;
                        int i9 = i8 / 2;
                        int i10 = i8 % 2;
                        if (GameThread.heroItemType[i9][i10] != -1) {
                            GameThread.gameSubStatus = 6;
                            GameThread.upgradeHeroUnitSelectPos = i9;
                            GameThread.upgradeHeroEquipSelectPos = i10;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        int checkTouchListStatus2 = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus2 == 60) {
            GameThread.gameStatus = 14;
            GameThread.playSound(15);
        } else {
            if (checkTouchListStatus2 == 62) {
                GameThread.gameStatus = 15;
                GameThread.gameSubStatus = 0;
                GameThread.shopShopChapterSelectPos = 0;
                GameThread.shopShopItemSelectPos = 0;
                GameThread.shopShopInventorySelectPos = 0;
                GameThread.getShopList();
                GameThread.playSound(14);
                TouchManager.processTouchStatus();
                return;
            }
            if (checkTouchListStatus2 == 70) {
                GameThread.playSound(14);
                GameThread.shopShopInventorySelectPos -= 8;
                if (GameThread.shopShopInventorySelectPos < 0) {
                    GameThread.shopShopInventorySelectPos += 24;
                }
                TouchManager.processTouchStatus();
                return;
            }
            if (checkTouchListStatus2 == 71) {
                GameThread.playSound(14);
                GameThread.shopShopInventorySelectPos += 8;
                if (GameThread.shopShopInventorySelectPos >= 24) {
                    GameThread.shopShopInventorySelectPos -= 24;
                }
                TouchManager.processTouchStatus();
                return;
            }
            switch (checkTouchListStatus2) {
                case 10:
                    if (GameThread.gameSubStatus == 4 && GameThread.shopShopInventorySelectPos >= 0 && GameThread.itemUnitValue[GameThread.shopShopInventorySelectPos] != -1) {
                        GameThread.playSound(14);
                        GameThread.upgradeHeroUnitSelectPos = 0;
                        GameThread.upgradeHeroEquipSelectPos = 0;
                        GameThread.equipItem();
                        GameThread.setEquipHeroSetting();
                        GameThread.gameSubStatus = 3;
                        Config.saveAll(newTower);
                        TouchManager.processTouchStatus();
                        return;
                    }
                    break;
                case 11:
                    if (GameThread.gameSubStatus == 4 && GameThread.shopShopInventorySelectPos >= 0 && GameThread.itemUnitValue[GameThread.shopShopInventorySelectPos] != -1) {
                        GameThread.playSound(14);
                        GameThread.upgradeHeroUnitSelectPos = 0;
                        GameThread.upgradeHeroEquipSelectPos = 1;
                        GameThread.equipItem();
                        GameThread.setEquipHeroSetting();
                        GameThread.gameSubStatus = 3;
                        Config.saveAll(newTower);
                        TouchManager.processTouchStatus();
                        return;
                    }
                    break;
                case 12:
                    if (GameThread.gameSubStatus == 4 && GameThread.shopShopInventorySelectPos >= 0 && GameThread.itemUnitValue[GameThread.shopShopInventorySelectPos] != -1) {
                        GameThread.playSound(14);
                        GameThread.upgradeHeroUnitSelectPos = 1;
                        GameThread.upgradeHeroEquipSelectPos = 0;
                        GameThread.equipItem();
                        GameThread.setEquipHeroSetting();
                        GameThread.gameSubStatus = 3;
                        Config.saveAll(newTower);
                        TouchManager.processTouchStatus();
                        return;
                    }
                    break;
                case 13:
                    if (GameThread.gameSubStatus == 4 && GameThread.shopShopInventorySelectPos >= 0 && GameThread.itemUnitValue[GameThread.shopShopInventorySelectPos] != -1) {
                        GameThread.playSound(14);
                        GameThread.upgradeHeroUnitSelectPos = 1;
                        GameThread.upgradeHeroEquipSelectPos = 1;
                        GameThread.equipItem();
                        GameThread.setEquipHeroSetting();
                        GameThread.gameSubStatus = 3;
                        Config.saveAll(newTower);
                        TouchManager.processTouchStatus();
                        return;
                    }
                    break;
                case 14:
                    if (GameThread.gameSubStatus == 4 && GameThread.shopShopInventorySelectPos >= 0 && GameThread.itemUnitValue[GameThread.shopShopInventorySelectPos] != -1) {
                        GameThread.playSound(14);
                        GameThread.upgradeHeroUnitSelectPos = 2;
                        GameThread.upgradeHeroEquipSelectPos = 0;
                        GameThread.equipItem();
                        GameThread.setEquipHeroSetting();
                        GameThread.gameSubStatus = 3;
                        Config.saveAll(newTower);
                        TouchManager.processTouchStatus();
                        return;
                    }
                    break;
                case 15:
                    if (GameThread.gameSubStatus == 4 && GameThread.shopShopInventorySelectPos >= 0 && GameThread.itemUnitValue[GameThread.shopShopInventorySelectPos] != -1) {
                        GameThread.playSound(14);
                        GameThread.upgradeHeroUnitSelectPos = 2;
                        GameThread.upgradeHeroEquipSelectPos = 1;
                        GameThread.equipItem();
                        GameThread.setEquipHeroSetting();
                        GameThread.gameSubStatus = 3;
                        Config.saveAll(newTower);
                        TouchManager.processTouchStatus();
                        return;
                    }
                    break;
                default:
                    switch (checkTouchListStatus2) {
                        case 73:
                            if (GameThread.gameSubStatus == 4) {
                                GameThread.playSound(14);
                                int sellShopItem = GameThread.sellShopItem();
                                if (sellShopItem == 0) {
                                    Config.saveAll(newTower);
                                } else if (sellShopItem == 2) {
                                    GameThread.gameSubStatus = 8;
                                }
                            }
                            TouchManager.processTouchStatus();
                            return;
                        case 74:
                            GameThread.gameSubStatus = 2;
                            TouchManager.processTouchStatus();
                            break;
                        case 75:
                            Log.d("GAME_SHOP_TOUCH_LIST_LOCK_HERO_0", "CHECK MOVE  " + checkTouchListStatus2);
                            break;
                        case 76:
                            Log.d("GAME_SHOP_TOUCH_LIST_LOCK_HERO_1", "CHECK MOVE  " + checkTouchListStatus2);
                            break;
                        case 77:
                            Log.d("GAME_SHOP_TOUCH_LIST_LOCK_HERO_2", "CHECK MOVE  " + checkTouchListStatus2);
                            break;
                    }
            }
        }
        if (checkTouchListStatus2 != -1 && checkTouchListStatus2 < 10) {
            GameThread.playSound(14);
            GameThread.shopShopInventorySelectPos = (GameThread.shopShopInventorySelectPos - (GameThread.shopShopInventorySelectPos % 8)) + (checkTouchListStatus2);
            GameThread.gameSubStatus = 4;
            TouchManager.processTouchStatus();
            return;
        }
        if (checkTouchListStatus2 != -1 && checkTouchListStatus2 < 60) {
            GameThread.gameSubStatus = 3;
            int i11 = checkTouchListStatus2 - 10;
            GameThread.upgradeHeroUnitSelectPos = i11 / 2;
            GameThread.upgradeHeroEquipSelectPos = i11 % 2;
            TouchManager.processTouchStatus();
            return;
        }
        int i12 = GameThread.gameSubStatus;
        if (i12 != 3) {
            if (i12 != 4) {
                if (i12 == 6) {
                    if (checkTouchListStatus2 == 60) {
                        GameThread.gameStatus = 14;
                        GameThread.playSound(15);
                    }
                    TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
                    GameThread.unequipItem();
                    GameThread.setEquipHeroSetting();
                    Config.saveAll(newTower);
                    GameThread.gameSubStatus = 2;
                } else if (i12 == 7) {
                    if (checkTouchListStatus2 == 60) {
                        GameThread.gameStatus = 14;
                        GameThread.playSound(15);
                    }
                    int checkTouchListPressed2 = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
                    if (checkTouchListPressed2 >= 10 && checkTouchListPressed2 < 60) {
                        GameThread.playSound(14);
                        int i13 = checkTouchListPressed2 - 10;
                        GameThread.upgradeHeroUnitSelectPos = i13 / 2;
                        GameThread.upgradeHeroEquipSelectPos = i13 % 2;
                        GameThread.equipItem();
                        GameThread.setEquipHeroSetting();
                        Config.saveAll(newTower);
                    }
                    GameThread.gameSubStatus = 3;
                }
            } else if (checkTouchListStatus2 == 60) {
                GameThread.gameStatus = 14;
                GameThread.playSound(15);
            } else if (checkTouchListStatus2 == -1) {
                GameThread.gameSubStatus = 2;
            }
        } else if (checkTouchListStatus2 == -1) {
            GameThread.gameSubStatus = 2;
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_SHOP_GIFT() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus != -1) {
            int i = GameThread.gameSubStatus;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5 && checkTouchListStatus == 61) {
                                    GameThread.myPhoneAlertFlag = 1;
                                    GameThread.gameSubStatus = 3;
                                }
                            } else if (checkTouchListStatus == 61) {
                                GameThread.myPhoneAlertFlag = 1;
                                GameThread.gameSubStatus = 3;
                            }
                        }
                    } else if (checkTouchListStatus == 61) {
                        GameThread.myPhoneAlertFlag = 1;
                        GameThread.gameSubStatus = 3;
                    }
                } else if (checkTouchListStatus == 61) {
                    GameThread.myPhoneAlertFlag = 1;
                    GameThread.gameSubStatus = 3;
                }
            }
            if (checkTouchListStatus == 60) {
                GameThread.myOscillator[11].initWithTwoWayStartPosition(-150, 0, 15, 30, 10);
                GameRenderer.titlePressed = 17;
                GameThread.gameStatus = 7;
                GameRenderer.titleCount = 0;
                GameThread.playSound(15);
            } else {
                switch (checkTouchListStatus) {
                    case 70:
                        if (GameThread.shopGiftItemType[0] != -1 && GameThread.checkInvenEmpty()) {
                            GameThread.shopGiftItemGetDecision = 1;
                            GameThread.shopGiftItemSelectPos = 0;
                            GameThread.getItemStartNetwork();
                            GameThread.gameSubStatus = 1;
                            break;
                        }
                        break;
                    case 71:
                        if (GameThread.shopGiftItemType[0] != -1) {
                            GameThread.shopGiftItemGetDecision = 0;
                            GameThread.shopGiftItemSelectPos = 0;
                            GameThread.getItemStartNetwork();
                            GameThread.gameSubStatus = 1;
                            break;
                        }
                        break;
                    case 72:
                        if (GameThread.shopGiftItemType[1] != -1 && GameThread.checkInvenEmpty()) {
                            GameThread.shopGiftItemGetDecision = 1;
                            GameThread.shopGiftItemSelectPos = 1;
                            GameThread.getItemStartNetwork();
                            GameThread.gameSubStatus = 1;
                            break;
                        }
                        break;
                    case 73:
                        if (GameThread.shopGiftItemType[1] != -1) {
                            GameThread.shopGiftItemGetDecision = 0;
                            GameThread.shopGiftItemSelectPos = 1;
                            GameThread.getItemStartNetwork();
                            GameThread.gameSubStatus = 1;
                            break;
                        }
                        break;
                    case 74:
                        if (GameThread.shopGiftItemType[2] != -1 && GameThread.checkInvenEmpty()) {
                            GameThread.shopGiftItemGetDecision = 1;
                            GameThread.shopGiftItemSelectPos = 2;
                            GameThread.getItemStartNetwork();
                            GameThread.gameSubStatus = 1;
                            break;
                        }
                        break;
                    case 75:
                        if (GameThread.shopGiftItemType[2] != -1) {
                            GameThread.shopGiftItemGetDecision = 0;
                            GameThread.shopGiftItemSelectPos = 2;
                            GameThread.getItemStartNetwork();
                            GameThread.gameSubStatus = 1;
                            break;
                        }
                        break;
                    case 76:
                        GameThread.playSound(14);
                        GameThread.shopShopInventorySelectPos -= 8;
                        if (GameThread.shopShopInventorySelectPos < 0) {
                            GameThread.shopShopInventorySelectPos += 24;
                            break;
                        }
                        break;
                    case 77:
                        GameThread.playSound(14);
                        GameThread.shopShopInventorySelectPos += 8;
                        if (GameThread.shopShopInventorySelectPos >= 24) {
                            GameThread.shopShopInventorySelectPos -= 24;
                            break;
                        }
                        break;
                    case 78:
                        if (GameThread.gameSubStatus == 3) {
                            GameThread.playSound(14);
                            int sellShopItem = GameThread.sellShopItem();
                            if (sellShopItem == 0) {
                                Config.saveAll(newTower);
                                break;
                            } else if (sellShopItem == 2) {
                                GameThread.gameSubStatus = 5;
                                break;
                            }
                        }
                        break;
                    default:
                        if (checkTouchListStatus < 60) {
                            GameThread.playSound(14);
                            GameThread.shopShopInventorySelectPos = (GameThread.shopShopInventorySelectPos - (GameThread.shopShopInventorySelectPos % 8)) + (checkTouchListStatus);
                            GameThread.gameSubStatus = 3;
                            TouchManager.processTouchStatus();
                            return;
                        }
                        break;
                }
            }
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_HELP() {
        if (TouchManager.lastActionStatus != 2) {
            return;
        }
        int checkTouchListStatus = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus == 0) {
            GameRenderer.titlePressed = 18;
            GameThread.gameStatus = 7;
            GameRenderer.titleCount = 0;
            GameThread.playSound(15);
        } else if (checkTouchListStatus == 1) {
            GameThread.loadMap(50, false);
            GameThread.gameLoadFlag = 0;
            GameThread.loadingStatus = GameThread.GAME_PLAY2_IMAGE_LOAD;
            GameThread.loadTipNumber = GameThread.getRandom(GameThread.TIP_TEXT.length);
            GameRenderer.loadCount_GAME_PLAY_IMAGE_LOAD = 0;
            GameRenderer.loadingViewType = GameThread.getRandom(6);
            GameThread.stopLoopSound(0);
            for (int i = 0; i < 22; i++) {
                GameThread.tutorialBoxTouchFlag[i] = 0;
            }
        } else if (checkTouchListStatus == 2) {
            GameThread.gameHelpViewNum--;
            if (GameThread.gameHelpViewNum < 0) {
                GameThread.gameHelpViewNum += 15;
            }
        } else if (checkTouchListStatus == 3) {
            GameThread.gameHelpViewNum++;
            if (GameThread.gameHelpViewNum >= 15) {
                GameThread.gameHelpViewNum -= 15;
            }
        }
        TouchManager.processTouchStatus();
    }

    public void touchCheck_GAME_RECORD() {
        int i = GameThread.gameSubStatus;
        if (i == 0) {
            int i2 = TouchManager.lastActionStatus;
            if (i2 == 0) {
                int checkTouchListStatus = TouchManager.checkTouchListStatus();
                if (checkTouchListStatus == 3) {
                    GameRenderer.rankListDraw.backupCurrentDrawPosition();
                } else {
                    if (checkTouchListStatus != 4) {
                        return;
                    }
                    GameThread.myScrollbar[2].setUpdatePosition(TouchManager.getFirstFirstActionTouch().y);
                    GameRenderer.rankListDraw.setAnchorDrawPosition(GameThread.myScrollbar[2].BarLastValue);
                }
                return;
            }
            if (i2 == 1) {
                int checkTouchListPressed = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
                if (checkTouchListPressed == 3) {
                    if (TouchManager.checkTouchMoveDegree(true))
                        GameRenderer.rankListDraw.resetWithDegree((int) (-TouchManager.lastMoveCheckDistance.y));
                } else {
                    if (checkTouchListPressed != 4) {
                        return;
                    }
                    GameThread.myScrollbar[2].setUpdatePosition(TouchManager.getFirstLastActionTouch().y);
                    GameRenderer.rankListDraw.setAnchorDrawPosition(GameThread.myScrollbar[2].BarLastValue);
                }
                return;
            }
            if (i2 != 2) {
                return;
            }
            GameRenderer.rankListDraw.resetTargetPosition();
            int checkTouchListStatus2 = TouchManager.checkTouchListStatus();
            if (checkTouchListStatus2 == 0) {
                GameRenderer.titlePressed = 19;
                GameThread.gameStatus = 7;
                GameRenderer.titleCount = 0;
                GameThread.playSound(15);
            } else if (checkTouchListStatus2 == 1) {
                GameThread.playSound(14);
                GameThread.gameSubStatus = 0;
            } else if (checkTouchListStatus2 == 2) {
                GameThread.playSound(14);
                GameThread.gameSubStatus = 1;
            }
            TouchManager.processTouchStatus();
            return;
        }
        if (i != 1) {
            return;
        }
        int i3 = TouchManager.lastActionStatus;
        if (i3 == 0) {
            int checkTouchListStatus3 = TouchManager.checkTouchListStatus();
            if (checkTouchListStatus3 == 3) {
                GameRenderer.awardListDraw.backupCurrentDrawPosition();
            } else {
                if (checkTouchListStatus3 != 4) {
                    return;
                }
                GameThread.myScrollbar[3].setUpdatePosition(TouchManager.getFirstFirstActionTouch().y);
                GameRenderer.awardListDraw.setAnchorDrawPosition(GameThread.myScrollbar[3].BarLastValue);
            }
            return;
        }
        if (i3 == 1) {
            int checkTouchListPressed2 = TouchManager.checkTouchListPressed(TouchManager.getFirstLastActionTouch());
            if (checkTouchListPressed2 == 3) {
                if (TouchManager.checkTouchMoveDegree(true))
                    GameRenderer.awardListDraw.resetWithDegree((int) (-TouchManager.lastMoveCheckDistance.y));
            } else {
                if (checkTouchListPressed2 != 4) {
                    return;
                }
                GameThread.myScrollbar[3].setUpdatePosition(TouchManager.getFirstLastActionTouch().y);
                GameRenderer.awardListDraw.setAnchorDrawPosition(GameThread.myScrollbar[3].BarLastValue);
            }
            return;
        }
        if (i3 != 2) {
            return;
        }
        GameRenderer.awardListDraw.resetTargetPosition();
        int checkTouchListStatus4 = TouchManager.checkTouchListStatus();
        if (checkTouchListStatus4 == 0) {
            GameRenderer.titlePressed = 19;
            GameThread.gameStatus = 7;
            GameRenderer.titleCount = 0;
            GameThread.playSound(15);
        } else if (checkTouchListStatus4 == 1) {
            GameThread.playSound(14);
            GameThread.gameSubStatus = 0;
        } else if (checkTouchListStatus4 == 2) {
            GameThread.playSound(14);
            GameThread.gameSubStatus = 1;
        }
        TouchManager.processTouchStatus();
    }
}
