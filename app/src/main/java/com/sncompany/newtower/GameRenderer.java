package com.sncompany.newtower;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import android.util.Log;

import androidx.core.view.ViewCompat;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;

import com.sncompany.newtower.Battle.MonsterUnit;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.CGRect;
import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataHero;
import com.sncompany.newtower.DataClasses.DataMonster;
import com.sncompany.newtower.DataClasses.DataObject;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataUpgradeHero;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.DataClasses.DataUpgradeUnit;
import com.sncompany.newtower.DataClasses.DataWave;
import com.sncompany.newtower.DataClasses.DataWaveMob;
import com.sncompany.newtower.Battle.ObjectUnit;
import com.sncompany.newtower.Battle.TowerUnit;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: D:\decomp\classes.dex */
public class GameRenderer implements GLSurfaceView.Renderer {
    public static final int ALWAYS_RESOURCE_BACKGROUND = 0;
    public static final int ALWAYS_RESOURCE_HERO0 = 1;
    public static final int ALWAYS_RESOURCE_HERO1 = 2;
    public static final int ALWAYS_RESOURCE_HERO2 = 3;
    public static final int BLOCK_DRAW_START_X = 62;
    public static final int BLOCK_DRAW_START_Y = 30;
    public static final int BLOCK_SIZE_X = 45;
    public static final int BLOCK_SIZE_X_HALF = 22;
    public static final int BLOCK_SIZE_Y = 45;
    public static final int BLOCK_SIZE_Y_HALF = 22;
    public static final int BOX_DRAW_BOTTOM = 7;
    public static final int BOX_DRAW_CENTER = 8;
    public static final int BOX_DRAW_LEFT = 5;
    public static final int BOX_DRAW_LEFTBOTTOM = 2;
    public static final int BOX_DRAW_LEFTTOP = 0;
    public static final int BOX_DRAW_LEFT_WING = 0;
    public static final int BOX_DRAW_MAIN_BODY = 2;
    public static final int BOX_DRAW_RIGHT = 6;
    public static final int BOX_DRAW_RIGHTBOTTOM = 3;
    public static final int BOX_DRAW_RIGHTTOP = 1;
    public static final int BOX_DRAW_RIGHT_WING = 1;
    public static final int BOX_DRAW_SIDE_BODY = 3;
    public static final int BOX_DRAW_TOP = 4;
    public static final int BOX_DRAW_TYPE_ONLY_MAIN = 1;
    public static final int BOX_DRAW_TYPE_WING_MAIN = 0;
    public static final float CHAR_MENU_ADD_ALPHA_DEGREE = 0.15f;
    public static final float CHAR_MENU_UPPER_ALPHA_DEGREE = 0.2f;
    public static final int CLEAR_RESOURCE_1 = 29;
    public static final int CLEAR_RESOURCE_BACKGROUND = 0;
    public static final int CLEAR_RESOURCE_BONUS = 14;
    public static final int CLEAR_RESOURCE_C = 27;
    public static final int CLEAR_RESOURCE_CLEAR = 1;
    public static final int CLEAR_RESOURCE_E = 24;
    public static final int CLEAR_RESOURCE_F = 26;
    public static final int CLEAR_RESOURCE_FAIL = 2;
    public static final int CLEAR_RESOURCE_HEROISM = 4;
    public static final int CLEAR_RESOURCE_ICONATTUP = 22;
    public static final int CLEAR_RESOURCE_ICONHERO1 = 19;
    public static final int CLEAR_RESOURCE_ICONHERO2 = 20;
    public static final int CLEAR_RESOURCE_ICONHERO3 = 21;
    public static final int CLEAR_RESOURCE_ICONHEROISM = 18;
    public static final int CLEAR_RESOURCE_ICONITEM = 17;
    public static final int CLEAR_RESOURCE_ICONSKILL = 15;
    public static final int CLEAR_RESOURCE_ICONSPE = 16;
    public static final int CLEAR_RESOURCE_NEXTSTAGE_OFF = 5;
    public static final int CLEAR_RESOURCE_NEXTSTAGE_ON = 6;
    public static final int CLEAR_RESOURCE_P = 23;
    public static final int CLEAR_RESOURCE_PERFECT = 13;
    public static final int CLEAR_RESOURCE_R = 25;
    public static final int CLEAR_RESOURCE_RETRY_OFF = 11;
    public static final int CLEAR_RESOURCE_RETRY_ON = 12;
    public static final int CLEAR_RESOURCE_STAGESELECT_OFF = 9;
    public static final int CLEAR_RESOURCE_STAGESELECT_ON = 10;
    public static final int CLEAR_RESOURCE_T = 28;
    public static final int CLEAR_RESOURCE_TOTALSCORE = 3;
    public static final int CLEAR_RESOURCE_UPGRADE_OFF = 7;
    public static final int CLEAR_RESOURCE_UPGRADE_ON = 8;
    public static final int CONTINUE_EFFECT_FRAME_PER_SHOT = 1;
    public static int CX = 0;
    public static int CY = 0;
    public static final int DATA_CHARACTER_EFFECT_TYPE_TOTAL_COUNT = 9;
    static final float DISABLE_BUTTON_ALPHA_DEGREE = 0.5f;
    public static final int DRAW_FRAME_DELAY_DEFAULT = 3;
    public static final int DRAW_INVEN_BOTTOM_LINE_MARGIIN = 34;
    public static final int DRAW_INVEN_BOTTOM_MARGIN = 28;
    public static final int DRAW_INVEN_CENTER_MARGIN = 34;
    public static final int DRAW_INVEN_DESCRIPTION_HEIGHT = -73;
    public static final int DRAW_INVEN_HEROMARK_MARGIN = 40;
    public static final int DRAW_INVEN_HERO_LINE_MARGIN = 12;
    public static final int DRAW_INVEN_LEFT_MARGIN = 14;
    public static final int DRAW_INVEN_RIGHT_LINE_MARGIN = 18;
    public static final int DRAW_INVEN_RIGHT_MARGIN = 17;
    public static final int DRAW_INVEN_TOP_LINE_MARGIN = 14;
    public static final int DRAW_INVEN_WIDTH_MARGIN = 65;
    public static float DRAW_SCALE_SIZE = 1.0f;
    public static float DRAW_SCALE_SIZE_X = 1.0f;
    public static float DRAW_SCALE_SIZE_Y = 1.0f;
    public static float DRAW_SCALE_X_MOVE = 0.0f;
    static final float DRAW_SCALE_X_SMALL_DEGREE = 13.0f;
    public static float DRAW_SCALE_Y_MOVE = 0.0f;
    static final float GAME_ENDING_BLACK_ALPHA_DEGREE = 0.5f;
    static final float GAME_OVER_ANIM_BLACK_VIEW_ALPHA = 0.0125f;
    public static final int GAME_OVER_ANIM_BLACK_VIEW_COUNT = 70;
    public static final int GAME_OVER_ANIM_TOTAL_COUNT = 30;
    static final float GAME_OVER_ANIM_WHITE_VIEW_ALPHA = 0.1f;
    public static final int GAME_OVER_ANIM_WHITE_VIEW_COUNT = 10;
    public static final int GAME_RECORD_AWARD_HEIGHT = 60;
    public static final int GAME_RECORD_AWARD_INGYO_BLOCK = 3;
    public static final int GAME_RECORD_SCORE_HEIGHT = 270;
    static final float GAME_SHOP_EQUIP_MOVING_ALPHA = 0.8f;
    public static final int GAME_SHOP_EQUIP_SKILL_GAP_PER_X = 255;
    public static final int GAME_SHOP_EQUIP_SKILL_GAP_PER_Y = 69;
    public static final int GAME_SHOP_EQUIP_SKILL_START_X = 203;
    public static final int GAME_SHOP_EQUIP_SKILL_START_Y = 224;
    public static final int GAME_SHOP_GIFT_SHOP_COUNT_PER_LINE = 3;
    public static final int GAME_SHOP_GIFT_SHOP_GAP_PER_X = 70;
    public static final int GAME_SHOP_GIFT_SHOP_GAP_PER_Y = 70;
    public static final int GAME_SHOP_GIFT_SHOP_START_X = 50;
    public static final int GAME_SHOP_GIFT_SHOP_START_Y = 140;
    public static final int GAME_SHOP_SHOP_HEIGHT = 70;
    public static final int GAME_SHOP_SHOP_INGYO_BLOCK = 3;
    public static final int GAME_SHOP_SHOP_INVENTORY_GAP_PER_X = 70;
    public static final int GAME_SHOP_SHOP_INVENTORY_START_Y = 390;
    public static final int GAME_SHOP_SHOP_SELECT_BOX_DEGREE = -5;
    public static final int GAME_SHOP_SHOP_SIDEBAR_END_Y = 330;
    public static final int GAME_SHOP_SHOP_SIDEBAR_START_Y = 90;
    public static final int GAME_SHOP_SHOP_SKILL_BASE_BOX_DEGREE = -2;
    public static final int GAME_SHOP_SHOP_SKILL_GAP_PER_Y = 70;
    public static final int GAME_SHOP_SHOP_SKILL_START_X = 30;
    public static final int GAME_SHOP_SHOP_SKILL_START_Y = 70;
    public static final int GAME_SHOP_SHOP_TOUCH_CHECK_BLOCK = 4;
    public static final int GAME_SHOP_SHOP_TOUCH_CHECK_TYPE = 2;
    public static final int GAME_STAGE_CLEAR_BOTTOM_BUTTON_COUNT = 270;
    public static final int GAME_STAGE_CLEAR_DESTROY_BONUS_END_COUNT = 60;
    public static final int GAME_STAGE_CLEAR_HEROISM_EARNED_COUNT = 210;
    public static final int GAME_STAGE_CLEAR_HIGH_SCORE_COUNT = 240;
    public static final int GAME_STAGE_CLEAR_LIVES_END_COUNT = 90;
    public static final int GAME_STAGE_CLEAR_REMAIN_GOLD_COUNT = 120;
    public static final int GAME_STAGE_CLEAR_REMAIN_MANA_COUNT = 150;
    public static final int GAME_STAGE_CLEAR_RESULT_START_END_COUNT = 30;
    public static final int GAME_STAGE_CLEAR_RESULT_START_POS = 0;
    public static final int GAME_STAGE_CLEAR_SOUND_TIME = 10;
    static final float GAME_STAGE_CLEAR_START_BLACK_ALPHA = 0.016f;
    public static final int GAME_STAGE_CLEAR_START_BLACK_COUNT = 30;
    static final float GAME_STAGE_CLEAR_THEME_ALPHA_DEGREE = 0.033f;
    public static final int GAME_STAGE_CLEAR_THEME_ARROW_BLINK_END_POS = 168;
    public static final int GAME_STAGE_CLEAR_THEME_BLACK_SHOT_END_POS = 64;
    public static final int GAME_STAGE_CLEAR_THEME_BLINK_FRAME = 20;
    public static final int GAME_STAGE_CLEAR_THEME_COLOR_SHOT_END_POS = 34;
    public static final int GAME_STAGE_CLEAR_THEME_ICON_MOVE_DEGREE = 20;
    public static final int GAME_STAGE_CLEAR_THEME_ICON_MOVE_END_POS = 88;
    public static final int GAME_STAGE_CLEAR_THEME_MOVE_DEGREE = 20;
    public static final int GAME_STAGE_CLEAR_THEME_STAGE_MOVE_DISTANCE = 150;
    public static final int GAME_STAGE_CLEAR_THEME_START_POS = 10;
    public static final int GAME_STAGE_CLEAR_THEME_VIEW_END_POS = 198;
    static final float GAME_STAGE_CLEAR_TOTAL_ALPHA = 0.033f;
    public static final int GAME_STAGE_CLEAR_TOTAL_SCORE_COUNT = 180;
    static final float GAME_STAGE_DARK_ALPHA_DEGREE = 0.033f;
    public static final int GAME_STAGE_DARK_VIEW_TOTAL_COUNT = 45;
    public static int GAME_TITLE_BOSS_VIEW_POS = 0;
    public static final int GAME_TITLE_MAIN_VIEW_BOSS_MOVE_POS = 54;
    public static final int GAME_TITLE_MAIN_VIEW_UNIT_MOVE_POS = 108;
    public static final int GAME_UPGRADE_HERO_COUNT_PER_BLOCK = 3;
    public static final int GAME_UPGRADE_HERO_SELECT_BOX_DEGREE = -5;
    public static final int GAME_UPGRADE_HERO_SKILL_BLOCK_PER_X = 255;
    public static final int GAME_UPGRADE_HERO_SKILL_GAP_PER_X = 70;
    public static final int GAME_UPGRADE_HERO_SKILL_GAP_PER_Y = 70;
    public static final int GAME_UPGRADE_HERO_SKILL_START_X = 45;
    public static final int GAME_UPGRADE_HERO_SKILL_START_Y = 220;
    public static final int GAME_UPGRADE_INVENTORY_BASE_BOX_DEGREE = -2;
    public static final int GAME_UPGRADE_INVENTORY_GAP_PER_X = 70;
    public static final int GAME_UPGRADE_INVENTORY_SELECT_BOX_DEGREE = -5;
    public static final int GAME_UPGRADE_INVENTORY_START_X = 53;
    public static final int GAME_UPGRADE_INVENTORY_START_Y = 28;
    public static final int GAME_UPGRADE_UINT_SELECT_RED_BAR_START = -49;
    public static final int GAME_UPGRADE_UNIT_SELECT_BOX_DEGREE = -5;
    public static final int GAME_UPGRADE_UNIT_SELECT_RED_BAR_END = 60;
    public static final int GAME_UPGRADE_UNIT_SELECT_RED_BAR_HEIGHT = 109;
    public static final int GAME_UPGRADE_UNIT_SELECT_RED_DEGREE = -11;
    public static final int GAME_UPGRADE_UNIT_SELECT_RED_START_X = -2;
    public static final int GAME_UPGRADE_UNIT_SKILL_BASE_BOX_DEGREE = -2;
    public static final int GAME_UPGRADE_UNIT_SKILL_GAP_PER_X = 80;
    public static final int GAME_UPGRADE_UNIT_SKILL_GAP_PER_Y = 80;
    public static final int GAME_UPGRADE_UNIT_SKILL_START_X = 280;
    public static final int GAME_UPGRADE_UNIT_SKILL_START_Y = 70;
    public static final int GATEFIRE_RESOURCE_EYEEAST1 = 6;
    public static final int GATEFIRE_RESOURCE_EYEEAST2 = 7;
    public static final int GATEFIRE_RESOURCE_EYESOUTH1 = 8;
    public static final int GATEFIRE_RESOURCE_EYESOUTH2 = 9;
    public static final int GATEFIRE_RESOURCE_EYEWEST1 = 4;
    public static final int GATEFIRE_RESOURCE_EYEWEST2 = 5;
    public static final int GATEFIRE_RESOURCE_FIRE1 = 0;
    public static final int GATEFIRE_RESOURCE_FIRE2 = 1;
    public static final int GATEFIRE_RESOURCE_FIRE3 = 2;
    public static final int GATEFIRE_RESOURCE_FIRE4 = 3;
    public static final int INGAME_RESOURCE_PAUSED = 0;
    public static final int INGAME_RESOURCE_RESTART_OFF = 3;
    public static final int INGAME_RESOURCE_RESTART_ON = 4;
    public static final int INGAME_RESOURCE_RESUME_OFF = 1;
    public static final int INGAME_RESOURCE_RESUME_ON = 2;
    public static final int INGAME_RESOURCE_STAGESELECT_OFF = 5;
    public static final int INGAME_RESOURCE_STAGESELECT_ON = 6;
    public static final int INVENTORY_ARROW_PRESSED_LEFT_ARROW = 1;
    public static final int INVENTORY_ARROW_PRESSED_NONE = 0;
    public static final int INVENTORY_ARROW_PRESSED_RIGHT_ARROW = 2;
    public static final int INVENTORY_ARROW_PRESSED_SELL = 3;
    static final int INVENTORY_CIRCLE_ITEM_TOTAL_COUNT = 3;
    public static final int LOADCOUNT_GAME_MENU_IMAGE_LOAD_MAX = 10;
    public static final int LOADCOUNT_GAME_PLAY_IMAGE_LOAD_MAX = 17;
    public static final int LOADCOUNT_GAME_PRE_IMAGE_LOAD_MAX = 4;
    public static final int LOADCOUNT_GAME_PRE_TOTAL_IMAGE_LOAD_MAX = 15;
    public static final int LOADCOUNT_GAME_RESUME_TO_MENU_MAX = 100;
    public static final int LOADCOUNT_GAME_RESUME_TO_MENU_START = 10;
    public static final int LOADCOUNT_GAME_RESUME_TO_PLAY_MAX = 100;
    public static final int LOADCOUNT_GAME_RESUME_TO_PLAY_START = 10;
    public static final int LOADING_VIEW_TYPE_ARCHER = 4;
    public static final int LOADING_VIEW_TYPE_HERO0 = 0;
    public static final int LOADING_VIEW_TYPE_HERO1 = 1;
    public static final int LOADING_VIEW_TYPE_HERO2 = 2;
    public static final int LOADING_VIEW_TYPE_TOTAL_COUNT = 6;
    public static final int LOADING_VIEW_TYPE_WARRIOR = 3;
    public static final int LOADING_VIEW_TYPE_WIZARD = 5;
    public static final int LOGO_12USESULTRY = 17;
    public static final int LOGO_PLAYBEAN = 16;
    public static final int MAINMENU_RESOURCE_BACKGROUND2 = 0;
    public static final int MAINMENU_RESOURCE_BACK_ON_L = 6;
    public static final int MAINMENU_RESOURCE_HELP_ON_L = 2;
    public static final int MAINMENU_RESOURCE_RECORD_ON_L = 3;
    public static final int MAINMENU_RESOURCE_SHOP_ON_L = 5;
    public static final int MAINMENU_RESOURCE_START_ON_L = 1;
    public static final int MAINMENU_RESOURCE_UPGRADE_ON_L = 4;
    public static final int MAP_TYPE_0_FOREST = 0;
    public static final int MAP_TYPE_1_SWAMP = 1;
    public static final int MAP_TYPE_2_WILDS = 2;
    public static final int MAP_TYPE_3_VOLCANO = 3;
    public static final int MAP_TYPE_4_DEVILDOM = 4;
    public static final int MAP_TYPE_TOTAL_COUNT = 5;
    public static final int MONSTER_DRAW_ALPHA_MAX = 1000;
    public static final int MONSTER_DRAW_BLOCK_SIZE = 5;
    public static final int MONSTER_DRAW_IMAGE_ALPHA = 3;
    public static final int MONSTER_DRAW_IMAGE_FLIP = 4;
    public static final int MONSTER_DRAW_IMAGE_NUM = 0;
    public static final int MONSTER_DRAW_IMAGE_XPOS = 1;
    public static final int MONSTER_DRAW_IMAGE_YPOS = 2;
    static final float MONSTER_GOAL_BLINK_ALPHA_DEGREE = 0.33f;
    static final int MONSTER_GOAL_BLINK_HALF_COUNT = 3;
    static final int MONSTER_GOAL_BLINK_TOTAL_COUNT = 6;
    public static final int OBJECT_SCALE_SIZE = 50;
    public static final int OBJECT_VIEW_YPOS_MOVE_SIZE = 22;
    public static final int PHONE_INPUT_0 = 11;
    public static final int PHONE_INPUT_1 = 1;
    public static final int PHONE_INPUT_2 = 2;
    public static final int PHONE_INPUT_3 = 3;
    public static final int PHONE_INPUT_4 = 4;
    public static final int PHONE_INPUT_5 = 5;
    public static final int PHONE_INPUT_6 = 6;
    public static final int PHONE_INPUT_7 = 7;
    public static final int PHONE_INPUT_8 = 8;
    public static final int PHONE_INPUT_9 = 9;
    public static final int PHONE_INPUT_BACK = 10;
    public static final int PHONE_INPUT_CLOSE = 0;
    public static final int PHONE_INPUT_HEIGHT_Y = 80;
    public static final int PHONE_INPUT_OK = 12;
    public static final int PHONE_INPUT_START_X = 26;
    public static final int PHONE_INPUT_START_Y = 137;
    public static final int PHONE_INPUT_WIDTH_X = 121;
    public static final int PLAYING_OSCILLATOR_ARCHER = 2;
    public static final int PLAYING_OSCILLATOR_COLD_DIVINER = 5;
    public static final int PLAYING_OSCILLATOR_HERO = 7;
    public static final int PLAYING_OSCILLATOR_HERO_IN_MOVE_POS = -10;
    public static final int PLAYING_OSCILLATOR_HERO_IN_POS = 0;
    public static final int PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS = 310;
    public static final int PLAYING_OSCILLATOR_HERO_OUT_POS = 300;
    public static final int PLAYING_OSCILLATOR_HERO_SELECT_1 = 8;
    public static final int PLAYING_OSCILLATOR_HERO_SELECT_2 = 9;
    public static final int PLAYING_OSCILLATOR_HERO_SELECT_3 = 10;
    public static final int PLAYING_OSCILLATOR_HOLY_EYE = 3;
    public static final int PLAYING_OSCILLATOR_MAN_AT_ARMS = 1;
    public static final int PLAYING_OSCILLATOR_NORMAL_COUNT = 7;
    public static final int PLAYING_OSCILLATOR_SPECIAL_UNIT = 6;
    public static final int PLAYING_OSCILLATOR_TOTAL_COUNT = 11;
    public static final int PLAYING_OSCILLATOR_UNIT_IN_MOVE_POS = -10;
    public static final int PLAYING_OSCILLATOR_UNIT_IN_POS = 0;
    public static final int PLAYING_OSCILLATOR_UNIT_OUT_MOVE_POS = 210;
    public static final int PLAYING_OSCILLATOR_UNIT_OUT_POS = 200;
    public static final int PLAYING_OSCILLATOR_WARRIOR = 0;
    public static final int PLAYING_OSCILLATOR_WIZARD = 4;
    public static int SCRHEIGHT = 0;
    public static int SCRHEIGHT_SMALL = 0;
    public static int SCRWIDTH = 0;
    public static int SCRWIDTH_SMALL = 0;
    public static final int SPECIAL_ARROW_BACKGROUND = 15;
    public static final int SPECIAL_ARROW_BODY = 13;
    public static final int SPECIAL_ARROW_BODY2 = 14;
    public static final int SPECIAL_ARROW_CENTER1 = 0;
    public static final int SPECIAL_ARROW_CENTER2 = 1;
    public static final int SPECIAL_ARROW_CENTER3 = 2;
    public static final int SPECIAL_ARROW_CENTER4 = 3;
    public static final int SPECIAL_ARROW_LAND = 12;
    public static final int SPECIAL_ARROW_LEFT1 = 4;
    public static final int SPECIAL_ARROW_LEFT2 = 5;
    public static final int SPECIAL_ARROW_LEFT3 = 6;
    public static final int SPECIAL_ARROW_LEFT4 = 7;
    public static final int SPECIAL_ARROW_LINEB = 16;
    public static final int SPECIAL_ARROW_LINEM = 17;
    public static final int SPECIAL_ARROW_LINES = 18;
    public static final int SPECIAL_ARROW_RIGHT1 = 8;
    public static final int SPECIAL_ARROW_RIGHT2 = 9;
    public static final int SPECIAL_ARROW_RIGHT3 = 10;
    public static final int SPECIAL_ARROW_RIGHT4 = 11;
    public static final int SPECIAL_ARROW_UNIT = 19;
    static final float SPECIAL_BLINK_ALPHA_DEGREE = 0.2f;
    static final int SPECIAL_BLINK_HALF_COUNT = 5;
    static final int SPECIAL_BLINK_TOTAL_COUNT = 10;
    public static final int SPECIAL_ICE_1 = 3;
    public static final int SPECIAL_ICE_10 = 12;
    public static final int SPECIAL_ICE_11 = 13;
    public static final int SPECIAL_ICE_12 = 14;
    public static final int SPECIAL_ICE_13 = 15;
    public static final int SPECIAL_ICE_14 = 16;
    public static final int SPECIAL_ICE_2 = 4;
    public static final int SPECIAL_ICE_3 = 5;
    public static final int SPECIAL_ICE_4 = 6;
    public static final int SPECIAL_ICE_5 = 7;
    public static final int SPECIAL_ICE_6 = 8;
    public static final int SPECIAL_ICE_7 = 9;
    public static final int SPECIAL_ICE_8 = 10;
    public static final int SPECIAL_ICE_9 = 11;
    public static final int SPECIAL_ICE_BACKGROUND = 1;
    public static final int SPECIAL_ICE_BODY = 0;
    public static final int SPECIAL_ICE_LINEB = 17;
    public static final int SPECIAL_ICE_LINEM = 18;
    public static final int SPECIAL_ICE_LINES = 19;
    public static final int SPECIAL_ICE_UNIT = 2;
    public static final int SPECIAL_SWORD_BACKGROUND = 5;
    public static final int SPECIAL_SWORD_BLADE0 = 0;
    public static final int SPECIAL_SWORD_BLADE1 = 1;
    public static final int SPECIAL_SWORD_BLADE2 = 2;
    public static final int SPECIAL_SWORD_BLADE3 = 3;
    public static final int SPECIAL_SWORD_BODY = 4;
    public static final int SPECIAL_SWORD_LINEB = 6;
    public static final int SPECIAL_SWORD_LINEM = 7;
    public static final int SPECIAL_SWORD_LINES = 8;
    public static final int SPECIAL_SWORD_WIND0 = 9;
    public static final int SPECIAL_SWORD_WIND1 = 10;
    public static final int SPECIAL_SWORD_WIND2 = 11;
    static final float START_VIEW_DARK_DEGREE = 0.066f;
    public static final int START_VIEW_MOVE_COUNT = 35;
    public static final int START_VIEW_WAIT_COUNT = 15;
    public static final int TITLE_GLOW_MOVE_COUNT = 20;
    public static final int TITLE_GLOW_MOVE_TOTAL_COUNT = 40;
    public static final int TITLE_MOB_START_VIEW_POS = 9;
    public static final int TITLE_RED_EYE_VIEW_XPOS = 64;
    public static final int TITLE_RED_EYE_VIEW_YPOS = 38;
    public static final int TITLE_RESOURCE_ABOUT = 13;
    public static final int TITLE_RESOURCE_BACKGROUND = 0;
    public static final int TITLE_RESOURCE_BACKGROUND2 = 1;
    public static final int TITLE_RESOURCE_FACEBOOK = 15;
    public static final int TITLE_RESOURCE_MOB0 = 2;
    public static final int TITLE_RESOURCE_MOB1 = 3;
    public static final int TITLE_RESOURCE_MOBEYE = 4;
    public static final int TITLE_RESOURCE_OPTION_OFF = 10;
    public static final int TITLE_RESOURCE_OPTION_ON = 11;
    public static final int TITLE_RESOURCE_SNCOMPANY = 12;
    public static final int TITLE_RESOURCE_START_OFF = 8;
    public static final int TITLE_RESOURCE_START_ON = 9;
    public static final int TITLE_RESOURCE_TITLE = 5;
    public static final int TITLE_RESOURCE_TITLEGLOW = 6;
    public static final int TITLE_RESOURCE_TITLEKOREAN = 7;
    public static final int TITLE_RESOURCE_TWITTER = 14;
    public static final int TUTORIAL_RESOURCE_ARROW1 = 0;
    public static final int TUTORIAL_RESOURCE_ARROW2 = 1;
    public static final int TUTORIAL_RESOURCE_ARROW3 = 2;
    public static final int TUTORIAL_RESOURCE_ARROW4 = 3;
    public static final int TUTORIAL_RESOURCE_ARROW5 = 4;
    public static final int TUTORIAL_RESOURCE_ARROW6 = 5;
    public static final int TUTORIAL_RESOURCE_ARROW7 = 6;
    public static final int TUTORIAL_RESOURCE_BOX0 = 7;
    public static final int TUTORIAL_RESOURCE_BOX1 = 8;
    public static final int TUTORIAL_RESOURCE_BOX2 = 9;
    public static final int TUTORIAL_RESOURCE_BOX3 = 10;
    public static final int TUTORIAL_RESOURCE_BOX4 = 11;
    public static final int TUTORIAL_RESOURCE_BOX5 = 12;
    public static final int TUTORIAL_RESOURCE_BOX6 = 13;
    public static final int TUTORIAL_RESOURCE_BOX7 = 14;
    public static final int TUTORIAL_RESOURCE_BOX8 = 15;
    public static final int TUTORIAL_RESOURCE_BUTTON = 16;
    public static final int TUTORIAL_RESOURCE_FOLLOW = 17;
    public static final int TUTORIAL_RESOURCE_HAND0 = 18;
    public static final int TUTORIAL_RESOURCE_HAND1 = 19;
    public static final int TUTORIAL_RESOURCE_MENT0 = 20;
    public static final int TUTORIAL_RESOURCE_MENT1 = 21;
    public static final int TUTORIAL_RESOURCE_MENT2 = 22;
    public static final int TUTORIAL_RESOURCE_MENT3 = 23;
    public static final int TUTORIAL_RESOURCE_MENT4 = 24;
    public static final int TUTORIAL_RESOURCE_MENT5 = 25;
    public static final int TUTORIAL_RESOURCE_MENT6 = 26;
    public static final int TUTORIAL_RESOURCE_MENT7 = 27;
    public static final int TUTORIAL_RESOURCE_TARGET = 28;
    public static final int UI_BUTTON_ADDUNIT_ARCHER = 2;
    public static final int UI_BUTTON_ADDUNIT_COLD_DIVINER = 5;
    public static final int UI_BUTTON_ADDUNIT_DISABLE_NUM = 9;
    public static final int UI_BUTTON_ADDUNIT_HERO = 18;
    public static final int UI_BUTTON_ADDUNIT_HERO0 = 6;
    public static final int UI_BUTTON_ADDUNIT_HERO1 = 7;
    public static final int UI_BUTTON_ADDUNIT_HERO2 = 8;
    public static final int UI_BUTTON_ADDUNIT_HOLY_EYE = 3;
    public static final int UI_BUTTON_ADDUNIT_MAN_AT_ARMS = 1;
    public static final int UI_BUTTON_ADDUNIT_WARRIOR = 0;
    public static final int UI_BUTTON_ADDUNIT_WIZARD = 4;
    public static final int UI_CHAR_BUTTON_1_OFF = 16;
    public static final int UI_CHAR_BUTTON_1_ON = 17;
    public static final int UI_CHAR_BUTTON_2_OFF = 18;
    public static final int UI_CHAR_BUTTON_2_ON = 19;
    public static final int UI_CHAR_BUTTON_3_OFF = 20;
    public static final int UI_CHAR_BUTTON_3_ON = 21;
    public static final int UI_CHAR_BUTTON_4_OFF = 22;
    public static final int UI_CHAR_BUTTON_4_ON = 23;
    public static final int UI_CHAR_BUTTON_5_OFF = 24;
    public static final int UI_CHAR_BUTTON_5_ON = 25;
    public static final int UI_CHAR_BUTTON_CLASS_OFF = 0;
    public static final int UI_CHAR_BUTTON_CLASS_ON = 1;
    public static final int UI_CHAR_BUTTON_LVLUPHERO_OFF = 14;
    public static final int UI_CHAR_BUTTON_LVLUPHERO_ON = 15;
    public static final int UI_CHAR_BUTTON_LVLUP_OFF = 2;
    public static final int UI_CHAR_BUTTON_LVLUP_ON = 3;
    public static final int UI_CHAR_BUTTON_OK_OFF = 4;
    public static final int UI_CHAR_BUTTON_OK_ON = 5;
    public static final int UI_CHAR_BUTTON_SELL_OFF = 6;
    public static final int UI_CHAR_BUTTON_SELL_ON = 7;
    public static final int UI_CHAR_BUTTON_SPE_DANCING_BLADE_OFF = 8;
    public static final int UI_CHAR_BUTTON_SPE_DANCING_BLADE_ON = 9;
    public static final int UI_CHAR_BUTTON_SPE_ICE_QUAKE_OFF = 12;
    public static final int UI_CHAR_BUTTON_SPE_ICE_QUAKE_ON = 13;
    public static final int UI_CHAR_BUTTON_SPE_MILLON_ARROW_OFF = 10;
    public static final int UI_CHAR_BUTTON_SPE_MILLON_ARROW_ON = 11;
    public static final int UI_CHAR_ETC_1 = 3;
    public static final int UI_CHAR_ETC_2 = 4;
    public static final int UI_CHAR_ETC_3 = 5;
    public static final int UI_CHAR_ETC_4 = 6;
    public static final int UI_CHAR_ETC_5 = 7;
    public static final int UI_CHAR_ETC_BACKGROUND = 0;
    public static final int UI_CHAR_ETC_BACKLINE = 12;
    public static final int UI_CHAR_ETC_HERO = 8;
    public static final int UI_CHAR_ETC_LV = 2;
    public static final int UI_CHAR_ETC_SPECIALDANCINGBLADE = 9;
    public static final int UI_CHAR_ETC_SPECIALICEQUAKE = 11;
    public static final int UI_CHAR_ETC_SPECIALMILLIONARROW = 10;
    public static final int UI_CHAR_ETC_STAT = 1;
    public static final int UI_CHAR_FACE_ARCHER = 4;
    public static final int UI_CHAR_FACE_COLDDIVINER = 9;
    public static final int UI_CHAR_FACE_HERO_0 = 12;
    public static final int UI_CHAR_FACE_HERO_1 = 13;
    public static final int UI_CHAR_FACE_HERO_2 = 14;
    public static final int UI_CHAR_FACE_HOLYEYE = 5;
    public static final int UI_CHAR_FACE_KNIGHT = 2;
    public static final int UI_CHAR_FACE_MAGMABLASTER = 11;
    public static final int UI_CHAR_FACE_MANATARMS = 1;
    public static final int UI_CHAR_FACE_SKYBEHOLDER = 7;
    public static final int UI_CHAR_FACE_SPLATTER = 6;
    public static final int UI_CHAR_FACE_WARLOCK = 10;
    public static final int UI_CHAR_FACE_WARLORD = 3;
    public static final int UI_CHAR_FACE_WARRIOR = 0;
    public static final int UI_CHAR_FACE_WIZARD = 8;
    public static final int UI_CHAR_NAME_ARCHER = 4;
    public static final int UI_CHAR_NAME_COLDDIVINER = 9;
    public static final int UI_CHAR_NAME_HERO0 = 12;
    public static final int UI_CHAR_NAME_HERO1 = 13;
    public static final int UI_CHAR_NAME_HERO2 = 14;
    public static final int UI_CHAR_NAME_HOLYEYE = 5;
    public static final int UI_CHAR_NAME_KNIGHT = 2;
    public static final int UI_CHAR_NAME_MAGMABLASTER = 11;
    public static final int UI_CHAR_NAME_MANATARMS = 1;
    public static final int UI_CHAR_NAME_SKYBEHOLDER = 7;
    public static final int UI_CHAR_NAME_SPLATTER = 6;
    public static final int UI_CHAR_NAME_WARLOCK = 10;
    public static final int UI_CHAR_NAME_WARLORD = 3;
    public static final int UI_CHAR_NAME_WARRIOR = 0;
    public static final int UI_CHAR_NAME_WIZARD = 8;
    public static final int UI_CHAR_UP_FACE_KNIGHT = 0;
    public static final int UI_CHAR_UP_FACE_MAGMABLASTER = 5;
    public static final int UI_CHAR_UP_FACE_SKYBEHOLDER = 3;
    public static final int UI_CHAR_UP_FACE_SPLATTER = 2;
    public static final int UI_CHAR_UP_FACE_WARLOCK = 4;
    public static final int UI_CHAR_UP_FACE_WARLORD = 1;
    public static final int UI_ETC_ABOUT = 11;
    public static final int UI_ETC_BACK_OFF = 1;
    public static final int UI_ETC_BACK_ON = 2;
    public static final int UI_ETC_DEVELOPER = 12;
    public static final int UI_ETC_GAEDUNGWI = 13;
    public static final int UI_ETC_MOVIE_BTN = 15;
    public static final int UI_ETC_OFFOFF = 8;
    public static final int UI_ETC_OFFON = 7;
    public static final int UI_ETC_ONOFF = 6;
    public static final int UI_ETC_ONON = 5;
    public static final int UI_ETC_OPTION = 3;
    public static final int UI_ETC_OPTIONBODY = 4;
    public static final int UI_ETC_SCROLLBUTTON = 14;
    public static final int UI_ETC_STAGEBOXONE = 9;
    public static final int UI_ETC_STAGESELECT = 10;
    public static final int UI_ETC_WINDOW = 0;
    public static final int UI_GIFT_BTNCHECKOFF = 0;
    public static final int UI_GIFT_BTNCHECKON = 1;
    public static final int UI_GIFT_BTNCLOSEOFF = 2;
    public static final int UI_GIFT_BTNCLOSEON = 3;
    public static final int UI_GIFT_BTNDISCARDOFF = 4;
    public static final int UI_GIFT_BTNDISCARDON = 5;
    public static final int UI_GIFT_BTNSAVEOFF = 6;
    public static final int UI_GIFT_BTNSAVEON = 7;
    public static final int UI_GIFT_BTNSENDOFF = 8;
    public static final int UI_GIFT_BTNSENDON = 9;
    public static final int UI_HELP_01 = 0;
    public static final int UI_HELP_02 = 1;
    public static final int UI_HELP_03 = 2;
    public static final int UI_HELP_04 = 3;
    public static final int UI_HELP_05 = 4;
    public static final int UI_HELP_06 = 5;
    public static final int UI_HELP_07 = 6;
    public static final int UI_HELP_08 = 7;
    public static final int UI_HELP_09 = 8;
    public static final int UI_HELP_10 = 9;
    public static final int UI_HELP_11 = 10;
    public static final int UI_HELP_12 = 11;
    public static final int UI_HELP_13 = 12;
    public static final int UI_HELP_14 = 13;
    public static final int UI_HELP_15 = 14;
    public static final int UI_HELP_CHAPTERLEFT_OFF = 3;
    public static final int UI_HELP_CHAPTERLEFT_ON = 4;
    public static final int UI_HELP_CHAPTERRIGHT_OFF = 5;
    public static final int UI_HELP_CHAPTERRIGHT_ON = 6;
    public static final int UI_HELP_SHOT_TOTAL_COUNT = 15;
    public static final int UI_HELP_TITLE = 0;
    public static final int UI_HELP_TUTORIAL_OFF = 1;
    public static final int UI_HELP_TUTORIAL_ON = 2;
    public static final int UI_LOADING_BLACKLINE = 1;
    public static final int UI_LOADING_LOADINGLINE = 2;
    public static final int UI_LOADING_OUTLINE = 0;
    public static final int UI_LOADING_WHITELINE = 3;
    public static final int UI_MONSTER_ETC_BACKGROUND = 0;
    public static final int UI_MONSTER_ETC_NEXTWAVE = 2;
    public static final int UI_MONSTER_ETC_STAT = 1;
    public static final int UI_MONSTER_ETC_WARNING = 3;
    public static final int UI_MONSTER_ETC_WARNINGGLOW = 4;
    public static final int UI_MONSTER_FACE_A1OGREZOMBIE = 15;
    public static final int UI_MONSTER_FACE_A2DEVILTIGER = 16;
    public static final int UI_MONSTER_FACE_B1MUDMAN = 17;
    public static final int UI_MONSTER_FACE_B2SWAMPWOMAN = 18;
    public static final int UI_MONSTER_FACE_BOSS1SKULLGIANT = 25;
    public static final int UI_MONSTER_FACE_BOSS2RICH = 26;
    public static final int UI_MONSTER_FACE_BOSS3FALLENANGEL = 27;
    public static final int UI_MONSTER_FACE_BOSS4LILIS = 28;
    public static final int UI_MONSTER_FACE_BOSS5WRAITHKING = 29;
    public static final int UI_MONSTER_FACE_C1SPINX = 19;
    public static final int UI_MONSTER_FACE_C2MUMMY = 20;
    public static final int UI_MONSTER_FACE_D1SALAMANDER = 21;
    public static final int UI_MONSTER_FACE_D2MAGMAROCK = 22;
    public static final int UI_MONSTER_FACE_E1DEMON = 23;
    public static final int UI_MONSTER_FACE_E2GRIMDEVIL = 24;
    public static final int UI_MONSTER_FACE_EX1ZOMBIEGIRL = 30;
    public static final int UI_MONSTER_FACE__0SKULLDOG = 0;
    public static final int UI_MONSTER_FACE__10BONEWORM = 10;
    public static final int UI_MONSTER_FACE__11ZOMBIEKNIGHT = 11;
    public static final int UI_MONSTER_FACE__12UKIONA = 12;
    public static final int UI_MONSTER_FACE__13SUCCUBUS = 13;
    public static final int UI_MONSTER_FACE__14WRAITHBISHOP = 14;
    public static final int UI_MONSTER_FACE__1ZOMBIE = 1;
    public static final int UI_MONSTER_FACE__2LAMIA = 2;
    public static final int UI_MONSTER_FACE__3IMP = 3;
    public static final int UI_MONSTER_FACE__4WRAITH = 4;
    public static final int UI_MONSTER_FACE__5HOLLOWSKULL = 5;
    public static final int UI_MONSTER_FACE__6ZOMBIETURTLE = 6;
    public static final int UI_MONSTER_FACE__7NINETAIL = 7;
    public static final int UI_MONSTER_FACE__8VAMPIRE = 8;
    public static final int UI_MONSTER_FACE__9SWORDWRAITH = 9;
    public static final int UI_POPUP_RESOURCE_BACKGROUND = 0;
    public static final int UI_POPUP_RESOURCE_BACKGROUND2 = 7;
    public static final int UI_POPUP_RESOURCE_LEVELUP = 1;
    public static final int UI_POPUP_RESOURCE_NOOFF = 2;
    public static final int UI_POPUP_RESOURCE_NOOFF2 = 8;
    public static final int UI_POPUP_RESOURCE_NOON = 3;
    public static final int UI_POPUP_RESOURCE_NOON2 = 9;
    public static final int UI_POPUP_RESOURCE_OKOFF2 = 12;
    public static final int UI_POPUP_RESOURCE_OKON2 = 13;
    public static final int UI_POPUP_RESOURCE_STAT = 4;
    public static final int UI_POPUP_RESOURCE_YESOFF = 5;
    public static final int UI_POPUP_RESOURCE_YESOFF2 = 10;
    public static final int UI_POPUP_RESOURCE_YESON = 6;
    public static final int UI_POPUP_RESOURCE_YESON2 = 11;
    public static final int UI_RECORD_AWARDBAR = 2;
    public static final int UI_RECORD_AWARDBASE = 1;
    public static final int UI_RECORD_CUP = 6;
    public static final int UI_RECORD_LOCK = 5;
    public static final int UI_RECORD_SCOREBACK = 4;
    public static final int UI_RECORD_SCOREBASE = 3;
    public static final int UI_RECORD_TITLE = 0;
    public static final int UI_SHOP_ARCHERBODY = 7;
    public static final int UI_SHOP_ARCHEROUTLINE = 8;
    public static final int UI_SHOP_ARCHERSHADOW = 9;
    public static final int UI_SHOP_BTNBACKOFF = 30;
    public static final int UI_SHOP_BTNBACKON = 31;
    public static final int UI_SHOP_BTNBUYOFF = 32;
    public static final int UI_SHOP_BTNBUYON = 33;
    public static final int UI_SHOP_BTNDROPOFF = 34;
    public static final int UI_SHOP_BTNDROPON = 35;
    public static final int UI_SHOP_BTNGIFTOFF = 36;
    public static final int UI_SHOP_BTNGIFTON = 37;
    public static final int UI_SHOP_BTNLEFTARROWOFF = 42;
    public static final int UI_SHOP_BTNLEFTARROWON = 43;
    public static final int UI_SHOP_BTNMEQUIPOFF = 26;
    public static final int UI_SHOP_BTNMEQUIPON = 27;
    public static final int UI_SHOP_BTNMPOSTBOXOFF = 28;
    public static final int UI_SHOP_BTNMPOSTBOXON = 29;
    public static final int UI_SHOP_BTNMSHOPOFF = 24;
    public static final int UI_SHOP_BTNMSHOPON = 25;
    public static final int UI_SHOP_BTNRIGHTARROWOFF = 44;
    public static final int UI_SHOP_BTNRIGHTARROWON = 45;
    public static final int UI_SHOP_BTNSAVEOFF = 38;
    public static final int UI_SHOP_BTNSAVEON = 39;
    public static final int UI_SHOP_BTNSELLOFF = 40;
    public static final int UI_SHOP_BTNSELLON = 41;
    public static final int UI_SHOP_GLOW = 48;
    public static final int UI_SHOP_HEROBASE = 13;
    public static final int UI_SHOP_HEROSLOT = 14;
    public static final int UI_SHOP_ICONEMPTY = 46;
    public static final int UI_SHOP_LOCK = 47;
    public static final int UI_SHOP_POSTBOXBASE = 15;
    public static final int UI_SHOP_SHOPBASE = 16;
    public static final int UI_SHOP_SHOPITEMBAR = 17;
    public static final int UI_SHOP_SHOPSELECTBAR = 18;
    public static final int UI_SHOP_TABEQUIPOFF = 19;
    public static final int UI_SHOP_TABEQUIPON = 20;
    public static final int UI_SHOP_TABSHOPOFF = 21;
    public static final int UI_SHOP_TABSHOPON = 22;
    public static final int UI_SHOP_TEL0 = 50;
    public static final int UI_SHOP_TEL1 = 51;
    public static final int UI_SHOP_TEL2 = 52;
    public static final int UI_SHOP_TEL3 = 53;
    public static final int UI_SHOP_TEL4 = 54;
    public static final int UI_SHOP_TEL5 = 55;
    public static final int UI_SHOP_TEL6 = 56;
    public static final int UI_SHOP_TEL7 = 57;
    public static final int UI_SHOP_TEL8 = 58;
    public static final int UI_SHOP_TEL9 = 59;
    public static final int UI_SHOP_TELBACK = 60;
    public static final int UI_SHOP_TELBODY = 49;
    public static final int UI_SHOP_TELCLSOFF = 62;
    public static final int UI_SHOP_TELCLSON = 63;
    public static final int UI_SHOP_TELOK = 61;
    public static final int UI_SHOP_TITLEEQUIP = 0;
    public static final int UI_SHOP_TITLEINVENTORY = 3;
    public static final int UI_SHOP_TITLEPOSTBOX = 1;
    public static final int UI_SHOP_TITLESHOP = 2;
    public static final int UI_SHOP_UNDERBAR = 23;
    public static final int UI_SHOP_WARRIORBODY = 4;
    public static final int UI_SHOP_WARRIOROUTLINE = 5;
    public static final int UI_SHOP_WARRIORSHADOW = 6;
    public static final int UI_SHOP_WIZARDBODY = 10;
    public static final int UI_SHOP_WIZARDOUTLINE = 11;
    public static final int UI_SHOP_WIZARDSHADOW = 12;
    public static final int UI_STAGE_1 = 18;
    public static final int UI_STAGE_2 = 19;
    public static final int UI_STAGE_3 = 20;
    public static final int UI_STAGE_4 = 21;
    public static final int UI_STAGE_5 = 22;
    public static final int UI_STAGE_BACK_OFF = 7;
    public static final int UI_STAGE_BACK_ON = 8;
    public static final int UI_STAGE_BOSS_BOSS1 = 0;
    public static final int UI_STAGE_BOSS_BOSS2 = 1;
    public static final int UI_STAGE_BOSS_BOSS3 = 2;
    public static final int UI_STAGE_BOSS_BOSS4 = 3;
    public static final int UI_STAGE_BOSS_BOSS5 = 4;
    public static final int UI_STAGE_CHAPTER = 17;
    public static final int UI_STAGE_CHAPTERLEFT_OFF = 9;
    public static final int UI_STAGE_CHAPTERLEFT_ON = 10;
    public static final int UI_STAGE_CHAPTERRIGHT_OFF = 11;
    public static final int UI_STAGE_CHAPTERRIGHT_ON = 12;
    public static final int UI_STAGE_EFFECT1 = 2;
    public static final int UI_STAGE_EFFECT2 = 3;
    public static final int UI_STAGE_EFFECT3 = 4;
    public static final int UI_STAGE_EFFECT4 = 5;
    public static final int UI_STAGE_EFFECT5 = 6;
    public static final int UI_STAGE_ENGAGE_OFF = 32;
    public static final int UI_STAGE_ENGAGE_ON = 33;
    public static final int UI_STAGE_GATEBREAKER_NOSELECT = 42;
    public static final int UI_STAGE_GATEBREAKER_OFF = 39;
    public static final int UI_STAGE_GATEBREAKER_ON = 40;
    public static final int UI_STAGE_HIGHSCORE = 29;
    public static final int UI_STAGE_INFINITY_NOSELECT = 41;
    public static final int UI_STAGE_INFINITY_OFF = 37;
    public static final int UI_STAGE_INFINITY_ON = 38;
    public static final int UI_STAGE_LEFTWINDOW = 0;
    public static final int UI_STAGE_LOCK = 45;
    public static final int UI_STAGE_MAPLINE = 34;
    public static final int UI_STAGE_NAME1 = 23;
    public static final int UI_STAGE_NAME2 = 24;
    public static final int UI_STAGE_NAME3 = 25;
    public static final int UI_STAGE_NAME4 = 26;
    public static final int UI_STAGE_NAME5 = 27;
    public static final int UI_STAGE_NEW = 43;
    public static final int UI_STAGE_NORMAL_OFF = 35;
    public static final int UI_STAGE_NORMAL_ON = 36;
    public static final int UI_STAGE_PERFECT = 46;
    public static final int UI_STAGE_RIGHTWINDOW = 1;
    public static final int UI_STAGE_STAGE = 44;
    public static final int UI_STAGE_STAGEBOX = 30;
    public static final int UI_STAGE_STAGELEFT_OFF = 13;
    public static final int UI_STAGE_STAGELEFT_ON = 14;
    public static final int UI_STAGE_STAGERIGHT_OFF = 15;
    public static final int UI_STAGE_STAGERIGHT_ON = 16;
    public static final int UI_STAGE_STAGESELECT = 31;
    public static final int UI_STAGE_WAVE = 28;
    public static final int UI_THEMECLEAR_RESOURCE_ARROW = 5;
    public static final int UI_THEMECLEAR_RESOURCE_BACKGROUND = 0;
    public static final int UI_THEMECLEAR_RESOURCE_GLOW = 4;
    public static final int UI_THEMECLEAR_RESOURCE_ICON = 3;
    public static final int UI_THEMECLEAR_RESOURCE_ICONBLACK = 6;
    public static final int UI_THEMECLEAR_RESOURCE_MAP1 = 1;
    public static final int UI_THEMECLEAR_RESOURCE_MAP2 = 2;
    public static final int UI_UPGRADE_BASEBLACK = 12;
    public static final int UI_UPGRADE_BASEHERO = 6;
    public static final int UI_UPGRADE_BASEUNIT = 7;
    public static final int UI_UPGRADE_BTNHEROOFF = 0;
    public static final int UI_UPGRADE_BTNHEROON = 1;
    public static final int UI_UPGRADE_BTNUNITOFF = 2;
    public static final int UI_UPGRADE_BTNUNITON = 3;
    public static final int UI_UPGRADE_BTNUPGRADEOFF = 13;
    public static final int UI_UPGRADE_BTNUPGRADEON = 14;
    public static final int UI_UPGRADE_ICONSELECTA = 17;
    public static final int UI_UPGRADE_ICONSELECTN = 16;
    public static final int UI_UPGRADE_MAX = 15;
    public static final int UI_UPGRADE_TABHEROOFF = 8;
    public static final int UI_UPGRADE_TABHEROON = 9;
    public static final int UI_UPGRADE_TABUNITOFF = 10;
    public static final int UI_UPGRADE_TABUNITON = 11;
    public static final int UI_UPGRADE_TITLEHERO = 4;
    public static final int UI_UPGRADE_TITLEUNIT = 5;
    public static final int UI_UPGRADE_UPRIGHTBAR = 18;
    static final int UI_UPITEM_HEROISM_POS = 0;
    public static final int UNIT_VIEW_YPOS_MOVE_SIZE = 10;
    public static final int UPGRADE_FILL_COUNT = 10;
    public static final float UPGRADE_FILL_DEGREE = 0.1f;
    public static final int UPGRADE_FILL_HALF_COUNT = 5;
    public static final float UPGRADE_FLIP_HEIGHT_HALF_DEGREE = 0.2f;
    public static final int UPPER_RESOURCE_BOSSSTAGE = 17;
    public static final int UPPER_RESOURCE_HEART = 10;
    public static final int UPPER_RESOURCE_HERO = 13;
    public static final int UPPER_RESOURCE_HP_BAR = 11;
    public static final int UPPER_RESOURCE_HP_BAR_HEIGHT = 6;
    public static final int UPPER_RESOURCE_HP_BAR_WIDTH = 30;
    public static final int UPPER_RESOURCE_HP_BAR_WIDTH_HALF = 15;
    public static final int UPPER_RESOURCE_INGAMEOFF = 2;
    public static final int UPPER_RESOURCE_INGAMEON = 3;
    public static final int UPPER_RESOURCE_MANA = 0;
    public static final int UPPER_RESOURCE_MONEY = 1;
    public static final int UPPER_RESOURCE_PAUSE_OFF = 15;
    public static final int UPPER_RESOURCE_PAUSE_ON = 16;
    public static final int UPPER_RESOURCE_SLASH = 9;
    public static final int UPPER_RESOURCE_SPEED0 = 4;
    public static final int UPPER_RESOURCE_SPEED1 = 5;
    public static final int UPPER_RESOURCE_SPEED2 = 6;
    public static final int UPPER_RESOURCE_SPEED_EMPTY = 14;
    public static final int UPPER_RESOURCE_STAR = 12;
    public static final int UPPER_RESOURCE_UPBAR = 7;
    public static final int UPPER_RESOURCE_WAVE = 8;
    public static final int VOLUMEBAR_EFFECT_POS_Y = 244;
    public static final int VOLUMEBAR_MUSIC_POS_Y = 159;
    public static final int VOLUMEBAR_START_POS_X = 331;
    public static final int VOLUMEBAR_WIDTH = 348;
    public static CGPoint _CGPoint = null;
    public static CGRect _CGRect = null;
    public static Texture2D[] alwaysImage = null;
    public static Texture2D[] arrowImage0 = null;
    public static Texture2D[] arrowImage1 = null;
    public static Texture2D[] arrowImage2 = null;
    public static Texture2D[] arrowImage3 = null;
    public static Texture2D[] arrowImage4 = null;
    public static Texture2D[] arrowImage9 = null;
    public static CircleItemDraw awardListDraw = null;
    public static Texture2D[] backBaseImageArray = null;
    public static Texture2D[] backObjectImage = null;
    public static Texture2D backShadowImage = null;
    public static Texture2D[] backTileImage0 = null;
    public static Texture2D[] backTileImage1 = null;
    public static Texture2D[] backTileImage2 = null;
    public static Texture2D[] backTileImage3 = null;
    public static Texture2D[] backTileImage4 = null;
    public static Texture2D[] backTileOldImage = null;
    public static Texture2D[] continueImage_600 = null;
    public static Texture2D[] continueImage_601 = null;
    public static Texture2D[] continueImage_604 = null;
    public static long currentCheckTime = 0;
    public static int darkViewCount = 0;
    public static Texture2D dollarImage = null;
    public static Paint drawFont = null;
    public static Texture2D drawStringBuffer = null;
    public static Texture2D[] effectImage_500 = null;
    public static Texture2D[] effectImage_502 = null;
    public static Texture2D[] effectImage_503 = null;
    public static Texture2D[] effectImage_504 = null;
    public static Texture2D[] effectImage_505 = null;
    public static Texture2D[] effectImage_509 = null;
    public static Texture2D[] effectImage_510 = null;
    public static Texture2D[] effectImage_512 = null;
    public static Texture2D[] effectImage_513 = null;
    public static Texture2D[] effectImage_514 = null;
    public static Texture2D[] effectImage_532 = null;
    public static Texture2D[] effectImage_533 = null;
    public static Texture2D[] effectImage_534 = null;
    public static Texture2D[] effectImage_535 = null;
    public static Texture2D fillBlackImage = null;
    public static Texture2D fillWhiteImage = null;
    public static int fontColor = 0;
    public static int fontSize = 0;
    public static Texture2D[] gatefireImage = null;
    public static Texture2D[] heroImage_300 = null;
    public static Texture2D[] heroImage_301 = null;
    public static Texture2D[] heroImage_302 = null;
    public static Texture2D heroismImage = null;
    public static CircleItemDraw inventoryItemListDraw = null;
    public static final boolean isFullScreen = false;
    public static boolean isPaused = false;
    public static String itemOnly = "%s only";
    public static long lastCheckTime;
    public static String lastFontName;
    public static int lastShowBackBase;
    public static int levelUpCount;
    public static int loadCount_GAME_MENU_IMAGE_LOAD;
    public static int loadCount_GAME_PLAY_IMAGE_LOAD;
    public static int loadCount_GAME_PRE_IMAGE_LOAD;
    public static int loadCount_GAME_PRE_TOTAL_IMAGE_LOAD;
    public static int loadCount_GAME_RESUME_TO_MENU;
    public static int loadCount_GAME_RESUME_TO_PLAY;
    public static int loadingViewType;
    public static Texture2D[] logoImage;
    public static boolean logoSoundPlayFlag;
    public static Texture2D[] mainmenuImage;
    public static int monsterGoalBlinkCount;
    public static Texture2D[] monsterImage_0;
    public static Texture2D[] monsterImage_1;
    public static Texture2D[] monsterImage_10;
    public static Texture2D[] monsterImage_100;
    public static Texture2D[] monsterImage_101;
    public static Texture2D[] monsterImage_102;
    public static Texture2D[] monsterImage_103;
    public static Texture2D[] monsterImage_104;
    public static Texture2D[] monsterImage_11;
    public static Texture2D[] monsterImage_12;
    public static Texture2D[] monsterImage_13;
    public static Texture2D[] monsterImage_14;
    public static Texture2D[] monsterImage_15;
    public static Texture2D[] monsterImage_16;
    public static Texture2D[] monsterImage_17;
    public static Texture2D[] monsterImage_18;
    public static Texture2D[] monsterImage_19;
    public static Texture2D[] monsterImage_2;
    public static Texture2D[] monsterImage_20;
    public static Texture2D[] monsterImage_21;
    public static Texture2D[] monsterImage_22;
    public static Texture2D[] monsterImage_23;
    public static Texture2D[] monsterImage_24;
    public static Texture2D[] monsterImage_25;
    public static Texture2D[] monsterImage_3;
    public static Texture2D[] monsterImage_4;
    public static Texture2D[] monsterImage_5;
    public static Texture2D[] monsterImage_6;
    public static Texture2D[] monsterImage_7;
    public static Texture2D[] monsterImage_8;
    public static Texture2D[] monsterImage_9;
    public static NewTower newTower;
    public static Texture2D[] numberClearImage;
    public static Texture2D[] numberHeroBuyImage;
    public static Texture2D[] numberHeroismImage;
    public static Texture2D[] numberLifeImage;
    public static Texture2D[] numberManaImage;
    public static Texture2D[] numberMoneyImage;
    public static Texture2D[] numberStagePointImage;
    public static Texture2D[] numberTotalImage;
    public static Texture2D[] numberUnitBuyImage;
    public static Texture2D[] numberUpgradeImage;
    public static Texture2D[] numberWaveImage;
    public static Texture2D[] outBorderImage;
    public static CircleItemDraw rankListDraw;
    public static Texture2D[] redCircleImage;
    public static Texture2D[] shadowImage;
    public static Texture2D[] specialArrowImage;
    public static int specialBlinkCount;
    public static Texture2D[] specialIceImage;
    public static Texture2D[] specialSwordImage;
    public static Texture2D[] stageClearImage;
    public static int startViewCount;
    public static Texture2D[] story2Image;
    public static Texture2D[] storyImage;
    public static int strokeColor;
    public static Texture2D targetImage;
    public static Texture2D testboxImage;
    public static Texture2D testboxImage2;
    public static float textSize_height;
    public static float textSize_width;
    public static Tombstone textTombstone;
    public static Texture2D[] titleBossImage;
    public static int titleCount;
    public static Texture2D[] titleImage;
    public static int titlePressed;
    public static Texture2D[] towerImage_200;
    public static Texture2D[] towerImage_201;
    public static Texture2D[] towerImage_202;
    public static Texture2D[] towerImage_203;
    public static Texture2D[] towerImage_204;
    public static Texture2D[] towerImage_205;
    public static Texture2D[] towerImage_206;
    public static Texture2D[] towerImage_207;
    public static Texture2D[] towerImage_208;
    public static Texture2D[] towerImage_209;
    public static Texture2D[] towerImage_210;
    public static Texture2D[] towerImage_211;
    public static Texture2D[] tutorialImage;
    public static Texture2D[] uiAwardImage;
    public static Texture2D[] uiButtonImage;
    public static Texture2D[] uiCharButtonImage;
    public static Texture2D[] uiCharEtcImage;
    public static Texture2D[] uiCharFaceImage;
    public static Texture2D[] uiCharNameImage;
    public static Texture2D[] uiCharUpFaceImage;
    public static Texture2D[] uiEtcImage;
    public static Texture2D[] uiGiftImage;
    public static Texture2D[] uiHelpImage;
    public static Texture2D[] uiHelpShotImage;
    public static Texture2D[] uiIngameImage;
    public static Texture2D[] uiLoadingImage;
    public static Texture2D[] uiMonsterEtcImage;
    public static Texture2D[] uiMonsterFaceImage;
    public static Texture2D[] uiMonsterNameImage;
    public static Texture2D[] uiPopupImage;
    public static Texture2D[] uiRecordImage;
    public static Texture2D[] uiShopImage;
    public static Texture2D[] uiStageBossImage;
    public static Texture2D[] uiStageImage;
    public static Texture2D[] uiThemeclearImage;
    public static Texture2D[] uiUpgradeImage;
    public static Texture2D[] uiUpheroImage;
    public static Texture2D[] uiUpitemImage;
    public static Texture2D[] uiUpperImage;
    public static Texture2D[] uiUpunitImage;
    public static int upgradeCount;
    public static CircleItemDraw upgradeItemListDraw;
    public static Texture2D[] whiteCircleImage;
    public static final int[] loadingUnitAdjustPos = {-57, -31, -54, -50, -45, -46, -36, -41, -30, -49, -43, -45};
    public static boolean loadViewFlag = false;
    public static int TITLE_MAINMENU_COUNT_SHORT_MOVE_MAX_COUNT = 20;
    public static int TITLE_MAINMENU_COUNT_MOVE_MAX_COUNT = 30;
    public static int TITLE_MAINMENU_REV_COUNT_MOVE_MAX_COUNT = 30;
    public static final int[] GAME_TITLE_BOSS_VIEW_POS_LIST = {77, 26, 41, 21, -30};
    public static final String[] effectTypeString = {"Stun", "Splash", "DoT", "Slow", "Pierce", "Slow Mud", "Dot Fire", "Multi Shot", "Double Shot", "None"};
    public static final int[][] testboxCoord = {new int[]{0, 0, 20, 85}, new int[]{138, 0, 20, 85}, new int[]{59, 0, 40, 85}, new int[]{20, 0, 40, 85}};
    public static final int GAME_SHOP_SHOP_INVENTORY_START_X = 125;
    public static final int[][] testbox2Coord = {new int[]{0, 0, 9, 9}, new int[]{GAME_SHOP_SHOP_INVENTORY_START_X, 0, 9, 9}, new int[]{0, 53, 9, 9}, new int[]{GAME_SHOP_SHOP_INVENTORY_START_X, 53, 9, 9}, new int[]{9, 0, 116, 9}, new int[]{0, 9, 9, 44}, new int[]{GAME_SHOP_SHOP_INVENTORY_START_X, 9, 9, 44}, new int[]{9, 53, 116, 9}, new int[]{9, 9, 116, 44}};
    public static final int[] logoResource = {R.drawable.logo_lg0, R.drawable.logo_lg1, R.drawable.logo_lg2, R.drawable.logo_lg3, R.drawable.logo_lg4, R.drawable.logo_lg5, R.drawable.logo_lg6, R.drawable.logo_lg7, R.drawable.logo_lg8, R.drawable.logo_lg9, R.drawable.logo_lg10, R.drawable.logo_lg11, R.drawable.logo_lg12, R.drawable.logo_lg13, R.drawable.logo_lg14, R.drawable.logo_lg15, R.drawable.logo_playbean, R.drawable.logo_12usesultry};
    public static final int[] numberMoneyResource = {R.drawable.num_money_0, R.drawable.num_money_1, R.drawable.num_money_2, R.drawable.num_money_3, R.drawable.num_money_4, R.drawable.num_money_5, R.drawable.num_money_6, R.drawable.num_money_7, R.drawable.num_money_8, R.drawable.num_money_9};
    public static final int[] numberManaResource = {R.drawable.num_mana_0, R.drawable.num_mana_1, R.drawable.num_mana_2, R.drawable.num_mana_3, R.drawable.num_mana_4, R.drawable.num_mana_5, R.drawable.num_mana_6, R.drawable.num_mana_7, R.drawable.num_mana_8, R.drawable.num_mana_9};
    public static final int[] numberWaveResource = {R.drawable.num_wave_0, R.drawable.num_wave_1, R.drawable.num_wave_2, R.drawable.num_wave_3, R.drawable.num_wave_4, R.drawable.num_wave_5, R.drawable.num_wave_6, R.drawable.num_wave_7, R.drawable.num_wave_8, R.drawable.num_wave_9, R.drawable.num_wave_10, R.drawable.num_wave_11};
    public static final int[] numberUnitBuyResource = {R.drawable.num_unit_buy_0, R.drawable.num_unit_buy_1, R.drawable.num_unit_buy_2, R.drawable.num_unit_buy_3, R.drawable.num_unit_buy_4, R.drawable.num_unit_buy_5, R.drawable.num_unit_buy_6, R.drawable.num_unit_buy_7, R.drawable.num_unit_buy_8, R.drawable.num_unit_buy_9};
    public static final int[] numberHeroBuyResource = {R.drawable.num_hero_buy_0, R.drawable.num_hero_buy_1, R.drawable.num_hero_buy_2, R.drawable.num_hero_buy_3, R.drawable.num_hero_buy_4, R.drawable.num_hero_buy_5, R.drawable.num_hero_buy_6, R.drawable.num_hero_buy_7, R.drawable.num_hero_buy_8, R.drawable.num_hero_buy_9};
    public static final int[] numberLifeResource = {R.drawable.num_life_0, R.drawable.num_life_1, R.drawable.num_life_2, R.drawable.num_life_3, R.drawable.num_life_4, R.drawable.num_life_5, R.drawable.num_life_6, R.drawable.num_life_7, R.drawable.num_life_8, R.drawable.num_life_9};
    public static final int[] numberHeroismResource = {R.drawable.num_heroism_0, R.drawable.num_heroism_1, R.drawable.num_heroism_2, R.drawable.num_heroism_3, R.drawable.num_heroism_4, R.drawable.num_heroism_5, R.drawable.num_heroism_6, R.drawable.num_heroism_7, R.drawable.num_heroism_8, R.drawable.num_heroism_9};
    public static final int[] numberStagePointResource = {R.drawable.num_stage_point_0, R.drawable.num_stage_point_1, R.drawable.num_stage_point_2, R.drawable.num_stage_point_3, R.drawable.num_stage_point_4, R.drawable.num_stage_point_5, R.drawable.num_stage_point_6, R.drawable.num_stage_point_7, R.drawable.num_stage_point_8, R.drawable.num_stage_point_9};
    public static final int[] numberUpgradeResource = {R.drawable.num_upgrade_0, R.drawable.num_upgrade_1, R.drawable.num_upgrade_2, R.drawable.num_upgrade_3, R.drawable.num_upgrade_4, R.drawable.num_upgrade_5, R.drawable.num_upgrade_6, R.drawable.num_upgrade_7, R.drawable.num_upgrade_8, R.drawable.num_upgrade_9, R.drawable.num_upgrade_slash};
    public static final int[] numberClearResource = {R.drawable.num_clear_0, R.drawable.num_clear_1, R.drawable.num_clear_2, R.drawable.num_clear_3, R.drawable.num_clear_4, R.drawable.num_clear_5, R.drawable.num_clear_6, R.drawable.num_clear_7, R.drawable.num_clear_8, R.drawable.num_clear_9};
    public static final int[] numberTotalResource = {R.drawable.num_total_0, R.drawable.num_total_1, R.drawable.num_total_2, R.drawable.num_total_3, R.drawable.num_total_4, R.drawable.num_total_5, R.drawable.num_total_6, R.drawable.num_total_7, R.drawable.num_total_8, R.drawable.num_total_9};
    public static final int[] titleResource = {R.drawable.ui_title_background, R.drawable.ui_title_background2, R.drawable.ui_title_mob0, R.drawable.ui_title_mob1, R.drawable.ui_title_mobeye, R.drawable.ui_title_title, R.drawable.ui_title_titleglow, R.drawable.ui_title_titlekorean, R.drawable.ui_title_startoff, R.drawable.ui_title_starton, R.drawable.ui_title_optionoff, R.drawable.ui_title_optionon, R.drawable.ui_title_sncompany, R.drawable.ui_title_about, R.drawable.ui_title_twitter, R.drawable.ui_title_facebook};
    public static final int[] mainmenuResource = {R.drawable.ui_mainmenu_background2, R.drawable.ui_mainmenu_startonl, R.drawable.ui_mainmenu_helponl, R.drawable.ui_mainmenu_recordonl, R.drawable.ui_mainmenu_upgradeonl, R.drawable.ui_mainmenu_shoponl, R.drawable.ui_mainmenu_backonl};
    public static final int[] stageClearResource = {R.drawable.ui_clear_background, R.drawable.ui_clear_clear, R.drawable.ui_clear_fail, R.drawable.ui_clear_totalscore, R.drawable.ui_clear_heroism, R.drawable.ui_clear_nextstageoff, R.drawable.ui_clear_nextstageon, R.drawable.ui_clear_upgradeoff, R.drawable.ui_clear_upgradeon, R.drawable.ui_clear_stageselectoff, R.drawable.ui_clear_stageselecton, R.drawable.ui_clear_retryoff, R.drawable.ui_clear_retryon, R.drawable.ui_clear_perfect, R.drawable.ui_clear_bonus, R.drawable.ui_clear_iconskill, R.drawable.ui_clear_iconspe, R.drawable.ui_clear_iconitem, R.drawable.ui_clear_iconheroism, R.drawable.ui_clear_iconhero1, R.drawable.ui_clear_iconhero2, R.drawable.ui_clear_iconhero3, R.drawable.ui_clear_iconattup, R.drawable.ui_clear_p, R.drawable.ui_clear_e, R.drawable.ui_clear_r, R.drawable.ui_clear_f, R.drawable.ui_clear_c, R.drawable.ui_clear_t, R.drawable.ui_clear_1};
    public static final int[] ingameResource = {R.drawable.ui_ingame_paused, R.drawable.ui_ingame_resumeoff, R.drawable.ui_ingame_resumeon, R.drawable.ui_ingame_restartoff, R.drawable.ui_ingame_restarton, R.drawable.ui_ingame_stageoff, R.drawable.ui_ingame_stageon};
    public static final int[] uiUpperResource = {R.drawable.ui_upper_mana, R.drawable.ui_upper_money, R.drawable.ui_upper_ingameoff, R.drawable.ui_upper_ingameon, R.drawable.ui_upper_speed0, R.drawable.ui_upper_speed1, R.drawable.ui_upper_speed2, R.drawable.ui_upper_upbar, R.drawable.ui_upper_wave, R.drawable.ui_upper_slash, R.drawable.ui_upper_heart, R.drawable.ui_upper_hpbar, R.drawable.ui_upper_star, R.drawable.ui_upper_hero, R.drawable.ui_upper_speedempty, R.drawable.ui_upper_pauseoff, R.drawable.ui_upper_pauseon, R.drawable.ui_upper_bossstage};
    public static final int[] uiCharButtonResource = {R.drawable.ui_char_button_class_off, R.drawable.ui_char_button_class_on, R.drawable.ui_char_button_lvlup_off, R.drawable.ui_char_button_lvlup_on, R.drawable.ui_char_button_ok_off, R.drawable.ui_char_button_ok_on, R.drawable.ui_char_button_sell_off, R.drawable.ui_char_button_sell_on, R.drawable.ui_char_button_spe_dancing_blade_off, R.drawable.ui_char_button_spe_dancing_blade_on, R.drawable.ui_char_button_spe_millon_arrow_off, R.drawable.ui_char_button_spe_millon_arrow_on, R.drawable.ui_char_button_spe_ice_quake_off, R.drawable.ui_char_button_spe_ice_quake_on, R.drawable.ui_char_button_lvluphero_off, R.drawable.ui_char_button_lvluphero_on, R.drawable.ui_char_button_1_off, R.drawable.ui_char_button_1_on, R.drawable.ui_char_button_2_off, R.drawable.ui_char_button_2_on, R.drawable.ui_char_button_3_off, R.drawable.ui_char_button_3_on, R.drawable.ui_char_button_4_off, R.drawable.ui_char_button_4_on, R.drawable.ui_char_button_5_off, R.drawable.ui_char_button_5_on};
    public static final int[] uiCharEtcResource = {R.drawable.ui_char_etc_background, R.drawable.ui_char_etc_stat, R.drawable.ui_char_etc_lv, R.drawable.ui_char_etc_1, R.drawable.ui_char_etc_2, R.drawable.ui_char_etc_3, R.drawable.ui_char_etc_4, R.drawable.ui_char_etc_5, R.drawable.ui_char_etc_hero, R.drawable.ui_char_etc_specialdancingblade, R.drawable.ui_char_etc_specialmillionarrow, R.drawable.ui_char_etc_specialicequake, R.drawable.ui_char_etc_backline};
    public static final int[] uiCharFaceResource = {R.drawable.ui_char_face_warrior, R.drawable.ui_char_face_manatarms, R.drawable.ui_char_face_knight, R.drawable.ui_char_face_warlord, R.drawable.ui_char_face_archer, R.drawable.ui_char_face_holyeye, R.drawable.ui_char_face_splatter, R.drawable.ui_char_face_skybeholder, R.drawable.ui_char_face_wizard, R.drawable.ui_char_face_colddiviner, R.drawable.ui_char_face_warlock, R.drawable.ui_char_face_magmablaster, R.drawable.ui_char_face_hero0, R.drawable.ui_char_face_hero1, R.drawable.ui_char_face_hero2};
    public static final int[] uiCharNameResource = {R.drawable.ui_char_name_warrior, R.drawable.ui_char_name_manatarms, R.drawable.ui_char_name_knight, R.drawable.ui_char_name_warlord, R.drawable.ui_char_name_archer, R.drawable.ui_char_name_holyeye, R.drawable.ui_char_name_splatter, R.drawable.ui_char_name_skybeholder, R.drawable.ui_char_name_wizard, R.drawable.ui_char_name_colddiviner, R.drawable.ui_char_name_warlock, R.drawable.ui_char_name_blaster, R.drawable.ui_char_name_hero0, R.drawable.ui_char_name_hero1, R.drawable.ui_char_name_hero2};
    public static final int[] uiCharUpFaceResource = {R.drawable.ui_char_up_face_knight, R.drawable.ui_char_up_face_warlord, R.drawable.ui_char_up_face_splatter, R.drawable.ui_char_up_face_skybeholder, R.drawable.ui_char_up_face_warlock, R.drawable.ui_char_up_face_magmablaster};
    public static final int[] uiMonsterEtcResource = {R.drawable.ui_monster_etc_background, R.drawable.ui_monster_etc_stat, R.drawable.ui_monster_etc_nextwave, R.drawable.ui_monster_etc_warning, R.drawable.ui_monster_etc_warningglow};
    public static final int[] uiMonsterFaceResource = {R.drawable.ui_monster_face__0skulldog, R.drawable.ui_monster_face__1zombie, R.drawable.ui_monster_face__2lamia, R.drawable.ui_monster_face__3imp, R.drawable.ui_monster_face__4wraith, R.drawable.ui_monster_face__5hollowskull, R.drawable.ui_monster_face__6zombieturtle, R.drawable.ui_monster_face__7ninetail, R.drawable.ui_monster_face__8vampire, R.drawable.ui_monster_face__9swordwraith, R.drawable.ui_monster_face__10boneworm, R.drawable.ui_monster_face__11zombieknight, R.drawable.ui_monster_face__12ukiona, R.drawable.ui_monster_face__13succubus, R.drawable.ui_monster_face__14wraithbishop, R.drawable.ui_monster_face_a1ogrezombie, R.drawable.ui_monster_face_a2deviltiger, R.drawable.ui_monster_face_b1mudman, R.drawable.ui_monster_face_b2swampwoman, R.drawable.ui_monster_face_c1spinx, R.drawable.ui_monster_face_c2mummy, R.drawable.ui_monster_face_d1salamander, R.drawable.ui_monster_face_d2magmarock, R.drawable.ui_monster_face_e1demon, R.drawable.ui_monster_face_e2grimdevil, R.drawable.ui_monster_face_boss1skullgiant, R.drawable.ui_monster_face_boss2rich, R.drawable.ui_monster_face_boss3fallenangel, R.drawable.ui_monster_face_boss4lilis, R.drawable.ui_monster_face_boss5wraithking, R.drawable.ui_monster_face_ex1zombiegirl};
    public static final int[] uiMonsterNameResource = {R.drawable.ui_monster_name__0skulldog, R.drawable.ui_monster_name__1zombie, R.drawable.ui_monster_name__2lamia, R.drawable.ui_monster_name__3imp, R.drawable.ui_monster_name__4wraith, R.drawable.ui_monster_name__5hollowskull, R.drawable.ui_monster_name__6zombieturtle, R.drawable.ui_monster_name__7ninetail, R.drawable.ui_monster_name__8vampire, R.drawable.ui_monster_name__9swordwraith, R.drawable.ui_monster_name__10boneworm, R.drawable.ui_monster_name__11zombieknight, R.drawable.ui_monster_name__12ukiona, R.drawable.ui_monster_name__13succubus, R.drawable.ui_monster_name__14wraithbishop, R.drawable.ui_monster_name_a1ogrezombie, R.drawable.ui_monster_name_a2deviltiger, R.drawable.ui_monster_name_b1mudman, R.drawable.ui_monster_name_b2swampwoman, R.drawable.ui_monster_name_c1spinx, R.drawable.ui_monster_name_c2mummy, R.drawable.ui_monster_name_d1salamander, R.drawable.ui_monster_name_d2magmarock, R.drawable.ui_monster_name_e1demon, R.drawable.ui_monster_name_e2grimdevil, R.drawable.ui_monster_name_boss1skullgiant, R.drawable.ui_monster_name_boss2rich, R.drawable.ui_monster_name_boss3fallenangel, R.drawable.ui_monster_name_boss4lilis, R.drawable.ui_monster_name_boss5wraithking, R.drawable.ui_monster_name_ex1zombiegirl};
    public static final int[] specialSwordResource = {R.drawable.special_sword_blade0, R.drawable.special_sword_blade1, R.drawable.special_sword_blade2, R.drawable.special_sword_blade3, R.drawable.special_sword_body, R.drawable.special_sword_background, R.drawable.special_sword_lineb, R.drawable.special_sword_linem, R.drawable.special_sword_lines, R.drawable.special_sword_wind0, R.drawable.special_sword_wind1, R.drawable.special_sword_wind2};
    public static final int[] specialArrowResource = {R.drawable.special_arrow_arrow_center1, R.drawable.special_arrow_arrow_center2, R.drawable.special_arrow_arrow_center3, R.drawable.special_arrow_arrow_center4, R.drawable.special_arrow_arrow_left1, R.drawable.special_arrow_arrow_left2, R.drawable.special_arrow_arrow_left3, R.drawable.special_arrow_arrow_left4, R.drawable.special_arrow_arrow_right1, R.drawable.special_arrow_arrow_right2, R.drawable.special_arrow_arrow_right3, R.drawable.special_arrow_arrow_right4, R.drawable.special_arrow_land, R.drawable.special_arrow_body, R.drawable.special_arrow_body2, R.drawable.special_arrow_background, R.drawable.special_arrow_lineb, R.drawable.special_arrow_linem, R.drawable.special_arrow_lines, R.drawable.special_arrow_unit};
    public static final int[] specialIceResource = {R.drawable.special_ice_body, R.drawable.special_ice_background, R.drawable.special_ice_unit, R.drawable.special_ice_1, R.drawable.special_ice_2, R.drawable.special_ice_3, R.drawable.special_ice_4, R.drawable.special_ice_5, R.drawable.special_ice_6, R.drawable.special_ice_7, R.drawable.special_ice_8, R.drawable.special_ice_9, R.drawable.special_ice_10, R.drawable.special_ice_11, R.drawable.special_ice_12, R.drawable.special_ice_13, R.drawable.special_ice_14, R.drawable.special_ice_lineb, R.drawable.special_ice_linem, R.drawable.special_ice_lines};
    public static final int[] uiUpgradeResource = {R.drawable.ui_upgrade_btnherooff, R.drawable.ui_upgrade_btnheroon, R.drawable.ui_upgrade_btnunitoff, R.drawable.ui_upgrade_btnuniton, R.drawable.ui_upgrade_titlehero, R.drawable.ui_upgrade_titleunit, R.drawable.ui_upgrade_basehero, R.drawable.ui_upgrade_baseunit, R.drawable.ui_upgrade_tabherooff, R.drawable.ui_upgrade_tabheroon, R.drawable.ui_upgrade_tabunitoff, R.drawable.ui_upgrade_tabuniton, R.drawable.ui_upgrade_baseblack, R.drawable.ui_upgrade_btnupgradeoff, R.drawable.ui_upgrade_btnupgradeon, R.drawable.ui_upgrade_max, R.drawable.ui_upgrade_iconselectn, R.drawable.ui_upgrade_iconselecta, R.drawable.ui_upgrade_uprightbar};
    public static final int[] uiShopResource = {R.drawable.ui_shop_titleequip, R.drawable.ui_shop_titlepostbox, R.drawable.ui_shop_titleshop, R.drawable.ui_shop_titleinventory, R.drawable.ui_shop_warriorbody, R.drawable.ui_shop_warrioroutline, R.drawable.ui_shop_warriorshadow, R.drawable.ui_shop_archerbody, R.drawable.ui_shop_archeroutline, R.drawable.ui_shop_archershadow, R.drawable.ui_shop_wizardbody, R.drawable.ui_shop_wizardoutline, R.drawable.ui_shop_wizardshadow, R.drawable.ui_shop_herobase, R.drawable.ui_shop_heroslot, R.drawable.ui_shop_postboxbase, R.drawable.ui_shop_shopbase, R.drawable.ui_shop_shopitembar, R.drawable.ui_shop_shopselectbar, R.drawable.ui_shop_tabequipoff, R.drawable.ui_shop_tabequipon, R.drawable.ui_shop_tabshopoff, R.drawable.ui_shop_tabshopon, R.drawable.ui_shop_underbar, R.drawable.ui_shop_btnmshopoff, R.drawable.ui_shop_btnmshopon, R.drawable.ui_shop_btnmequipoff, R.drawable.ui_shop_btnmequipon, R.drawable.ui_shop_btnmpostboxoff, R.drawable.ui_shop_btnmpostboxon, R.drawable.ui_shop_btnbackoff, R.drawable.ui_shop_btnbackon, R.drawable.ui_shop_btnbuyoff, R.drawable.ui_shop_btnbuyon, R.drawable.ui_shop_btndropoff, R.drawable.ui_shop_btndropon, R.drawable.ui_shop_btngiftoff, R.drawable.ui_shop_btngifton, R.drawable.ui_shop_btnsaveoff, R.drawable.ui_shop_btnsaveon, R.drawable.ui_shop_btnselloff, R.drawable.ui_shop_btnsellon, R.drawable.ui_shop_btnleftarrowoff, R.drawable.ui_shop_btnleftarrowon, R.drawable.ui_shop_btnrightarrowoff, R.drawable.ui_shop_btnrightarrowon, R.drawable.ui_shop_iconempty, R.drawable.ui_shop_lock, R.drawable.ui_shop_glow, R.drawable.ui_shop_telbody, R.drawable.ui_shop_tel0, R.drawable.ui_shop_tel1, R.drawable.ui_shop_tel2, R.drawable.ui_shop_tel3, R.drawable.ui_shop_tel4, R.drawable.ui_shop_tel5, R.drawable.ui_shop_tel6, R.drawable.ui_shop_tel7, R.drawable.ui_shop_tel8, R.drawable.ui_shop_tel9, R.drawable.ui_shop_telback, R.drawable.ui_shop_telok, R.drawable.ui_shop_telclsoff, R.drawable.ui_shop_telclson};
    public static final int[] uiUpunitResource = {R.drawable.ui_upunit_warrior0, R.drawable.ui_upunit_warrior1, R.drawable.ui_upunit_warrior2, R.drawable.ui_upunit_warrior3, R.drawable.ui_upunit_warrior4, R.drawable.ui_upunit_warrior5, R.drawable.ui_upunit_archer0, R.drawable.ui_upunit_archer1, R.drawable.ui_upunit_archer2, R.drawable.ui_upunit_archer3, R.drawable.ui_upunit_archer4, R.drawable.ui_upunit_archer5, R.drawable.ui_upunit_wizard0, R.drawable.ui_upunit_wizard1, R.drawable.ui_upunit_wizard2, R.drawable.ui_upunit_wizard3, R.drawable.ui_upunit_wizard4, R.drawable.ui_upunit_wizard5};
    public static final int[] uiUpheroResource = {R.drawable.ui_uphero_up0, R.drawable.ui_uphero_up1, R.drawable.ui_uphero_up2, R.drawable.ui_uphero_up3, R.drawable.ui_uphero_up4, R.drawable.ui_uphero_up5};
    public static final int[] uiUpitemResource = {R.drawable.ui_upitem_reset, R.drawable.ui_upitem_blue0, R.drawable.ui_upitem_blue1, R.drawable.ui_upitem_blue2, R.drawable.ui_upitem_blue3, R.drawable.ui_upitem_blue4, R.drawable.ui_upitem_blue5, R.drawable.ui_upitem_blue6, R.drawable.ui_upitem_blue7, R.drawable.ui_upitem_blue8, R.drawable.ui_upitem_blue9, R.drawable.ui_upitem_blue10, R.drawable.ui_upitem_blue11, R.drawable.ui_upitem_blue12, R.drawable.ui_upitem_blue13, R.drawable.ui_upitem_blue14, R.drawable.ui_upitem_blue15, R.drawable.ui_upitem_red0, R.drawable.ui_upitem_red1, R.drawable.ui_upitem_red2, R.drawable.ui_upitem_red3, R.drawable.ui_upitem_red12, R.drawable.ui_upitem_red13, R.drawable.ui_upitem_red14, R.drawable.ui_upitem_red15, R.drawable.ui_upitem_herospe0, R.drawable.ui_upitem_herospe1, R.drawable.ui_upitem_herospe2, R.drawable.ui_upitem_herospe3, R.drawable.ui_upitem_limit0};
    public static final int[] uiAwardResource = {R.drawable.ui_award_01, R.drawable.ui_award_02, R.drawable.ui_award_03, R.drawable.ui_award_04, R.drawable.ui_award_05, R.drawable.ui_award_06, R.drawable.ui_award_07, R.drawable.ui_award_08, R.drawable.ui_award_09, R.drawable.ui_award_10, R.drawable.ui_award_11, R.drawable.ui_award_12, R.drawable.ui_award_13, R.drawable.ui_award_14, R.drawable.ui_award_15, R.drawable.ui_award_16, R.drawable.ui_award_17, R.drawable.ui_award_18, R.drawable.ui_award_19, R.drawable.ui_award_20, R.drawable.ui_award_21, R.drawable.ui_award_22, R.drawable.ui_award_23, R.drawable.ui_award_24, R.drawable.ui_award_25, R.drawable.ui_award_26, R.drawable.ui_award_27, R.drawable.ui_award_28, R.drawable.ui_award_29, R.drawable.ui_award_30, R.drawable.ui_award_31, R.drawable.ui_award_32, R.drawable.ui_award_33, R.drawable.ui_award_34, R.drawable.ui_award_35, R.drawable.ui_award_36, R.drawable.ui_award_37, R.drawable.ui_award_38, R.drawable.ui_award_39, R.drawable.ui_award_40, R.drawable.ui_award_41, R.drawable.ui_award_42, R.drawable.ui_award_43, R.drawable.ui_award_44, R.drawable.ui_award_45, R.drawable.ui_award_46, R.drawable.ui_award_47, R.drawable.ui_award_48, R.drawable.ui_award_49, R.drawable.ui_award_50, R.drawable.ui_award_51, R.drawable.ui_award_52, R.drawable.ui_award_53, R.drawable.ui_award_54, R.drawable.ui_award_55, R.drawable.ui_award_56, R.drawable.ui_award_57, R.drawable.ui_award_58, R.drawable.ui_award_59, R.drawable.ui_award_60, R.drawable.ui_award_61, R.drawable.ui_award_62};
    public static final int[] uiStageResource = {R.drawable.ui_stage_leftwindow, R.drawable.ui_stage_rightwindow, R.drawable.ui_stage_effect1, R.drawable.ui_stage_effect2, R.drawable.ui_stage_effect3, R.drawable.ui_stage_effect4, R.drawable.ui_stage_effect5, R.drawable.ui_stage_back_off, R.drawable.ui_stage_back_on, R.drawable.ui_stage_chapterleft_off, R.drawable.ui_stage_chapterleft_on, R.drawable.ui_stage_chapterright_off, R.drawable.ui_stage_chapterright_on, R.drawable.ui_stage_stageleft_off, R.drawable.ui_stage_stageleft_on, R.drawable.ui_stage_stageright_off, R.drawable.ui_stage_stageright_on, R.drawable.ui_stage_chapter, R.drawable.ui_stage_1, R.drawable.ui_stage_2, R.drawable.ui_stage_3, R.drawable.ui_stage_4, R.drawable.ui_stage_5, R.drawable.ui_stage_name1, R.drawable.ui_stage_name2, R.drawable.ui_stage_name3, R.drawable.ui_stage_name4, R.drawable.ui_stage_name5, R.drawable.ui_stage_wave, R.drawable.ui_stage_highscore, R.drawable.ui_stage_stagebox, R.drawable.ui_stage_stageselect, R.drawable.ui_stage_engage_off, R.drawable.ui_stage_engage_on, R.drawable.ui_stage_mapline, R.drawable.ui_stage_normal_off, R.drawable.ui_stage_normal_on, R.drawable.ui_stage_infinity_off, R.drawable.ui_stage_infinity_on, R.drawable.ui_stage_gatebreaker_off, R.drawable.ui_stage_gatebreaker_on, R.drawable.ui_stage_infinity_noselect, R.drawable.ui_stage_gatebreaker_noselect, R.drawable.ui_stage_new, R.drawable.ui_stage_stage, R.drawable.ui_stage_lock, R.drawable.ui_stage_perfect};
    public static final int[] uiStageBossResource = {R.drawable.ui_stage_boss1, R.drawable.ui_stage_boss2, R.drawable.ui_stage_boss3, R.drawable.ui_stage_boss4, R.drawable.ui_stage_boss5};
    public static final int[] uiHelpResource = {R.drawable.ui_help_title, R.drawable.ui_help_tutorialoff, R.drawable.ui_help_tutorialon, R.drawable.ui_help_chapterleft_off, R.drawable.ui_help_chapterleft_on, R.drawable.ui_help_chapterright_off, R.drawable.ui_help_chapterright_on};
    public static final int[] uiHelpShotResource = {R.drawable.ui_help_01, R.drawable.ui_help_02, R.drawable.ui_help_03, R.drawable.ui_help_04, R.drawable.ui_help_05, R.drawable.ui_help_06, R.drawable.ui_help_07, R.drawable.ui_help_08, R.drawable.ui_help_09, R.drawable.ui_help_10, R.drawable.ui_help_11, R.drawable.ui_help_12, R.drawable.ui_help_13, R.drawable.ui_help_14, R.drawable.ui_help_15};
    public static final int[] uiRecordResource = {R.drawable.ui_record_title, R.drawable.ui_record_awardbase, R.drawable.ui_record_awardbar, R.drawable.ui_record_scorebase, R.drawable.ui_record_scoreback, R.drawable.ui_record_lock, R.drawable.ui_record_cup};
    public static final int[] uiEtcResource = {R.drawable.ui_etc_window, R.drawable.ui_etc_back_off, R.drawable.ui_etc_back_on, R.drawable.ui_etc_option, R.drawable.ui_etc_optionbody, R.drawable.ui_etc_onon, R.drawable.ui_etc_onoff, R.drawable.ui_etc_offon, R.drawable.ui_etc_offoff, R.drawable.ui_etc_stageboxone, R.drawable.ui_etc_stageselect, R.drawable.ui_etc_about, R.drawable.ui_etc_developer, R.drawable.ui_etc_gaedungwi, R.drawable.ui_etc_scrollbutton, R.drawable.ui_ect_movie_btn};
    public static final int[] tileBaseResource = {R.drawable.map_b0, R.drawable.map_b1, R.drawable.map_b2, R.drawable.map_b3, R.drawable.map_b4};
    public static final int[][] tileTileResource = {new int[]{R.drawable.map_t0_0, R.drawable.map_t0_1, R.drawable.map_t0_2, R.drawable.map_t0_3, R.drawable.map_t0_4, R.drawable.map_t0_5, R.drawable.map_t0_6, R.drawable.map_t0_7, R.drawable.map_t0_8, R.drawable.map_t0_9}, new int[]{R.drawable.map_t1_0, R.drawable.map_t1_1, R.drawable.map_t1_2, R.drawable.map_t1_3, R.drawable.map_t1_4, R.drawable.map_t1_5, R.drawable.map_t1_6, R.drawable.map_t1_7, R.drawable.map_t1_8, R.drawable.map_t1_9}, new int[]{R.drawable.map_t2_0, R.drawable.map_t2_1, R.drawable.map_t2_2, R.drawable.map_t2_3, R.drawable.map_t2_4, R.drawable.map_t2_5, R.drawable.map_t2_6, R.drawable.map_t2_7, R.drawable.map_t2_8, R.drawable.map_t2_9}, new int[]{R.drawable.map_t3_0, R.drawable.map_t3_1, R.drawable.map_t3_2, R.drawable.map_t3_3, R.drawable.map_t3_4, R.drawable.map_t3_5, R.drawable.map_t3_6, R.drawable.map_t3_7, R.drawable.map_t3_8, R.drawable.map_t3_9}, new int[]{R.drawable.map_t4_0, R.drawable.map_t4_1, R.drawable.map_t4_2, R.drawable.map_t4_3, R.drawable.map_t4_4, R.drawable.map_t4_5, R.drawable.map_t4_6, R.drawable.map_t4_7, R.drawable.map_t4_8, R.drawable.map_t4_9}};
    public static final int[] tutorialResource = {R.drawable.tutorial_arrow1, R.drawable.tutorial_arrow2, R.drawable.tutorial_arrow3, R.drawable.tutorial_arrow4, R.drawable.tutorial_arrow5, R.drawable.tutorial_arrow6, R.drawable.tutorial_arrow7, R.drawable.tutorial_box0, R.drawable.tutorial_box1, R.drawable.tutorial_box2, R.drawable.tutorial_box3, R.drawable.tutorial_box4, R.drawable.tutorial_box5, R.drawable.tutorial_box6, R.drawable.tutorial_box7, R.drawable.tutorial_box8, R.drawable.tutorial_button, R.drawable.tutorial_follow, R.drawable.tutorial_hand0, R.drawable.tutorial_hand1, R.drawable.tutorial_ment0, R.drawable.tutorial_ment1, R.drawable.tutorial_ment2, R.drawable.tutorial_ment3, R.drawable.tutorial_ment4, R.drawable.tutorial_ment5, R.drawable.tutorial_ment6, R.drawable.tutorial_ment7, R.drawable.tutorial_target};
    public static final int[] uiButtonResource = {R.drawable.ui_addunit_warrior, R.drawable.ui_addunit_manatarms, R.drawable.ui_addunit_archer, R.drawable.ui_addunit_holyeye, R.drawable.ui_addunit_wizard, R.drawable.ui_addunit_colddiviner, R.drawable.ui_addunit_hero0, R.drawable.ui_addunit_hero1, R.drawable.ui_addunit_hero2, R.drawable.ui_addunit_warrior_f, R.drawable.ui_addunit_manatarms_f, R.drawable.ui_addunit_archer_f, R.drawable.ui_addunit_holyeye_f, R.drawable.ui_addunit_wizard_f, R.drawable.ui_addunit_colddiviner_f, R.drawable.ui_addunit_hero0_f, R.drawable.ui_addunit_hero1_f, R.drawable.ui_addunit_hero2_f, R.drawable.ui_addunit_hero};
    public static final int[] uiLoadingResource = {R.drawable.ui_loading_outline, R.drawable.ui_loading_blackline, R.drawable.ui_loading_loadingline, R.drawable.ui_loading_whiteline};
    public static final int[] alwaysResource = {R.drawable.always_background, R.drawable.always_hero0, R.drawable.always_hero1, R.drawable.always_hero2};
    public static final int[] gatefireResource = {R.drawable.gatefire_fire1, R.drawable.gatefire_fire2, R.drawable.gatefire_fire3, R.drawable.gatefire_fire4, R.drawable.gatefire_eyewest1, R.drawable.gatefire_eyewest2, R.drawable.gatefire_eyeeast1, R.drawable.gatefire_eyeeast2, R.drawable.gatefire_eyesouth1, R.drawable.gatefire_eyesouth2};
    public static final int[] uiPopupResource = {R.drawable.ui_popup_background, R.drawable.ui_popup_levelup, R.drawable.ui_popup_nooff, R.drawable.ui_popup_noon, R.drawable.ui_popup_stat, R.drawable.ui_popup_yesoff, R.drawable.ui_popup_yeson, R.drawable.ui_popup_background2, R.drawable.ui_popup_nooff2, R.drawable.ui_popup_noon2, R.drawable.ui_popup_yesoff2, R.drawable.ui_popup_yeson2, R.drawable.ui_popup_okoff2, R.drawable.ui_popup_okon2};
    public static final int[] uiThemeclearResource = {R.drawable.ui_themeclear_background, R.drawable.ui_themeclear_map1, R.drawable.ui_themeclear_map2, R.drawable.ui_themeclear_icon, R.drawable.ui_themeclear_glow, R.drawable.ui_themeclear_arrow, R.drawable.ui_themeclear_iconblack};
    public static final int[] arrowResource0 = {R.drawable.arrow_0_0};
    public static final int[] arrowResource1 = {R.drawable.arrow_1_0, R.drawable.arrow_1_1};
    public static final int[] arrowResource2 = {R.drawable.arrow_2_0, R.drawable.arrow_2_1};
    public static final int[] arrowResource3 = {R.drawable.arrow_3_0, R.drawable.arrow_3_1};
    public static final int[] arrowResource4 = {R.drawable.arrow_4_0, R.drawable.arrow_4_1, R.drawable.arrow_4_2, R.drawable.arrow_4_3, R.drawable.arrow_4_4, R.drawable.arrow_4_5};
    public static final int[] arrowResource9 = {R.drawable.arrow_9_0, R.drawable.arrow_9_1};
    public static final int[] titleBoss0Resource = {R.drawable.ui_title0_0, R.drawable.ui_title0_1, R.drawable.ui_title0_2, R.drawable.ui_title0_3};
    public static final int[] titleBoss1Resource = {R.drawable.ui_title1_0, R.drawable.ui_title1_1, R.drawable.ui_title1_2, R.drawable.ui_title1_3};
    public static final int[] titleBoss2Resource = {R.drawable.ui_title2_0, R.drawable.ui_title2_1, R.drawable.ui_title2_2, R.drawable.ui_title2_3};
    public static final int[] titleBoss3Resource = {R.drawable.ui_title3_0, R.drawable.ui_title3_1, R.drawable.ui_title3_2, R.drawable.ui_title3_3};
    public static final int[] titleBoss4Resource = {R.drawable.ui_title4_0, R.drawable.ui_title4_1, R.drawable.ui_title4_2, R.drawable.ui_title4_3};

    public static int getMonsterImageOrder(int i) {
        switch (i) {
            case DataMonster.DATA_MONSTER_M_2:
            case DataMonster.DATA_MONSTER_M2_2:
            case DataMonster.DATA_MONSTER_M5_2:
            case DataMonster.DATA_MONSTER_M10_2:
                return 1;
            case DataMonster.DATA_MONSTER_M_3:
            case DataMonster.DATA_MONSTER_M2_3:
            case DataMonster.DATA_MONSTER_M5_3:
            case DataMonster.DATA_MONSTER_M10_3:
                return 2;
            case DataMonster.DATA_MONSTER_M_4:
            case 28:
            case 53:
            case 78:
                return 3;
            case DataMonster.DATA_MONSTER_M_5:
            case 29:
            case 54:
            case 79:
                return 4;
            case DataMonster.DATA_MONSTER_M_6:
            case 30:
            case 55:
            case 80:
                return 5;
            case DataMonster.DATA_MONSTER_M_7:
            case 31:
            case 56:
            case 81:
                return 6;
            case DataMonster.DATA_MONSTER_M_8:
            case 32:
            case 57:
            case 82:
                return 7;
            case DataMonster.DATA_MONSTER_M_9:
            case 33:
            case 58:
            case 83:
                return 8;
            case DataMonster.DATA_MONSTER_M_10:
            case 34:
            case 59:
            case 84:
                return 9;
            case DataMonster.DATA_MONSTER_M_11:
            case 35:
            case 60:
            case 85:
                return 10;
            case DataMonster.DATA_MONSTER_M_12:
            case 36:
            case 61:
            case 86:
                return 11;
            case DataMonster.DATA_MONSTER_M_13:
            case 37:
            case 62:
            case 87:
                return 12;
            case DataMonster.DATA_MONSTER_M_14:
            case 38:
            case 63:
            case 88:
                return 13;
            case DataMonster.DATA_MONSTER_M_15:
            case 39:
            case 64:
            case 89:
                return 14;
            case 15:
            case 40:
            case 65:
            case 90:
                return 15;
            case 16:
            case 41:
            case 66:
            case 91:
                return 16;
            case 17:
            case 42:
            case 67:
            case 92:
                return 17;
            case 18:
            case 43:
            case 68:
            case 93:
                return 18;
            case 19:
            case 44:
            case 69:
            case 94:
                return 19;
            case 20:
            case 45:
            case 70:
            case 95:
                return 20;
            case 21:
            case 46:
            case 71:
            case 96:
                return 21;
            case 22:
            case 47:
            case 72:
            case 97:
                return 22;
            case 23:
            case 48:
            case 73:
            case 98:
                return 23;
            case 24:
            case 49:
            case 74:
            case 99:
                return 24;
            case 25:
            case 50:
            case 75:
            default:
                return 0;
            case 100:
            case 105:
                return 25;
            case 101:
            case 106:
                return 26;
            case 102:
            case 107:
                return 27;
            case 103:
            case 108:
                return 28;
            case 104:
            case 109:
                return 29;
        }
    }

    public static int getTowerBoxImageOrder(int i) {
        switch (i) {
            case 6:
            case 7:
            case 8:
                return 0;
            case 9:
            case 10:
            case 11:
                return 1;
            case 18://j
            case 19:
            case 20:
                return 2;
            case 21:
            case 22:
            case 23:
                return 3;
            case 30://jj
            case 31:
            case 32:
                return 4;
            case 33:
            case 34:
            case 35:
                return 5;
            default:
                return -1;
        }
    }

    public GameRenderer(NewTower newTower2) {
        newTower = newTower2;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Texture2D.connectGL(newTower, gl10);
        textTombstone.connectGL(gl10);
        gl10.glClearDepthf(1.0f);
        gl10.glDisable(2929);
    }

    public void onPause() {
        isPaused = true;
    }

    public void onResume() {
        isPaused = false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Texture2D.connectGL(newTower, gl10);
        textTombstone.connectGL(gl10);
        if (i > i2) {
            SCRWIDTH = i;
            SCRHEIGHT = i2;
        } else {
            SCRWIDTH = i2;
            SCRHEIGHT = i;
        }
        SCRWIDTH_SMALL = Texture2D.SCRWIDTH_800;
        SCRHEIGHT_SMALL = Texture2D.SCRHEIGHT_480;
        CX = Texture2D.SCRWIDTH_800 / 2;
        CY = Texture2D.SCRHEIGHT_480 / 2;
        DRAW_SCALE_SIZE = 1.0f;
        DRAW_SCALE_SIZE_X = 1.0f;
        DRAW_SCALE_SIZE_Y = 1.0f;
        DRAW_SCALE_X_MOVE = 0.0f;
        DRAW_SCALE_Y_MOVE = 0.0f;
        Texture2D.DRAW_ADJUST_X_MOVE = 0.0f;
        Texture2D.DRAW_ADJUST_Y_MOVE = 0.0f;
        int i3 = SCRWIDTH;
        int i4 = SCRWIDTH_SMALL;
        float f = i3 != i4 ? i3 / i4 : 1.0f;
        int i5 = SCRHEIGHT;
        int i6 = SCRHEIGHT_SMALL;
        float f2 = i5 != i6 ? i5 / i6 : 1.0f;
        Log.d("WINDOW SIZE", "WINDOW SIZE " + SCRWIDTH + "," + SCRHEIGHT + "," + SCRWIDTH_SMALL + "," + SCRHEIGHT_SMALL + "," + f + "," + f2);
        if (f != 1.0f || f2 != 1.0f) {
            if (f < f2) {
                DRAW_SCALE_SIZE = f;
                float f3 = (int) (((SCRHEIGHT / f) - SCRHEIGHT_SMALL) / 2.0f);
                DRAW_SCALE_Y_MOVE = f3;
                Texture2D.DRAW_ADJUST_Y_MOVE = f3;
            } else {
                DRAW_SCALE_SIZE = f2;
                float f4 = (int) (((SCRWIDTH / f2) - SCRWIDTH_SMALL) / 2.0f);
                DRAW_SCALE_X_MOVE = f4;
                Texture2D.DRAW_ADJUST_X_MOVE = f4;
            }
        }
        gl10.glViewport(0, 0, SCRWIDTH, SCRHEIGHT);
        gl10.glMatrixMode(5889);
        gl10.glLoadIdentity();
        GLU.gluOrtho2D(gl10, 0.0f, SCRWIDTH, 0.0f, SCRHEIGHT);
        float f5 = DRAW_SCALE_SIZE;
        if (f5 != 1.0f) {
            gl10.glScalef(f5, f5, 1.0f);
        }
        gl10.glMatrixMode(5888);
        gl10.glLoadIdentity();
        gl10.glEnableClientState(32888);
        gl10.glEnableClientState(32884);
        gl10.glEnable(3553);
        gl10.glEnable(3042);
        gl10.glBlendFunc(1, 771);
        gl10.glTexEnvf(8960, 8704, 8448.0f);
        gl10.glTexEnvf(8960, 8705, 6408.0f);
        gl10.glTexParameterf(3553, 10241, 9728.0f);
        gl10.glTexParameterf(3553, 10240, 9728.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (isPaused) {
            return;
        }
        drawFrame(gl10);
    }

    public static void setDefaultFont() {
        lastFontName = null;
        drawFont.setTypeface(Typeface.create(Typeface.SERIF, 1));
    }

    public static void setFontName(String str) {
        String str2 = lastFontName;
        if (str2 == null || !str2.equals(str)) {
            lastFontName = new String(str);
            drawFont.setTypeface(Typeface.create(Typeface.SERIF, 1));
        }
    }

    public static void setFontColor(int i) {
        fontColor = i;
        strokeColor = i;
    }

    public static void setFontDoubleColor(int i, int i2) {
        fontColor = i;
        strokeColor = i2;
    }

    public static void setFontSize(int i) {
        fontSize = i;
        drawFont.setTextSize(i);
    }

    public static CGRect CGRectMake(float x, float y, float w, float h) {
        if (_CGRect == null)
            _CGRect = new CGRect();

        _CGRect.originX = x;
        _CGRect.originY = y;
        _CGRect.sizeWidth = w;
        _CGRect.sizeHeight = h;
        return _CGRect;
    }

    public static CGPoint CGPointMake(float f, float f2) {
        if (_CGPoint == null) {
            _CGPoint = new CGPoint();
        }
        _CGPoint.x = f;
        _CGPoint.y = f2;
        return _CGPoint;
    }

    private synchronized void drawFrame(GL10 gl10) {
        gl10.glClear(16384);
        gl10.glEnable(3042);
        gl10.glBlendFunc(1, 771);
        gl10.glTexEnvf(8960, 8704, 7681.0f);
        GameThread.gameTimeCount++;
        if (NewTower.gameThread != null) {
            NewTower.gameThread.updateGame();
        }
        GameThread.currentFrameCount++;
        GameThread.currentDate = System.currentTimeMillis();
        if (GameThread.currentDate - GameThread.startDate > 1000) {
            GameThread.lastFrameCount = GameThread.currentFrameCount;
            GameThread.currentFrameCount = 0;
            GameThread.startDate = GameThread.currentDate;
        }
        GameThread.realDrawCount++;
        GameThread.currentDrawDate = System.currentTimeMillis();
        if (GameThread.currentDrawDate - GameThread.startDrawDate > 1000) {
            GameThread.lastDrawCount = GameThread.realDrawCount;
            GameThread.realDrawCount = 0;
            GameThread.startDrawDate = GameThread.currentDrawDate;
        }
        if (NewTower.currentPage != null)
            NewTower.currentPage.paint(gl10, true);

        if (outBorderImage != null) {
            if (DRAW_SCALE_X_MOVE != 0.0f) {
                if (DRAW_SCALE_X_MOVE >= DRAW_SCALE_X_SMALL_DEGREE) {
                    outBorderImage[1].drawAtPointOptionNoOut(0.0f, 0.0f, 20);
                    outBorderImage[2].drawAtPointOptionNoOut(SCRWIDTH_SMALL, 0.0f, 18);
                } else {
                    outBorderImage[0].drawAtPointOptionNoOut(0.0f, 0.0f, 20);
                    outBorderImage[0].drawAtPointOptionNoOut(SCRWIDTH_SMALL, 0.0f, 18);
                }
            }
            if (DRAW_SCALE_Y_MOVE != 0.0f) {
                outBorderImage[3].drawAtPointOptionNoOut(0.0f, 0.0f, 34);
                outBorderImage[3].drawAtPointOptionNoOut(0.0f, SCRHEIGHT_SMALL, 18);
            }
        }
        if (GameThread.cheatData[0]) {
            drawAllTouchRect(gl10);
        }
        if (GameThread.cheatData[1]) {
            drawGridRect(gl10);
        }
    }

    //TODO - Delete
    public void drawLoadingViewShot(GL10 gl10, int i, int i2) {
        int i3;
        if (!loadViewFlag || alwaysImage[0].name == -1 || uiLoadingImage[0].name == -1 || uiLoadingImage[1].name == -1 || uiLoadingImage[2].name == -1) {
            return;
        }
        int i4 = loadingViewType;
        if (i4 == 0) {
            i3 = 12;
        } else if (i4 == 1) {
            i3 = 13;
        } else if (i4 != 2) {
            if (i4 != 3) {
                if (i4 == 4) {
                    i3 = 4;
                } else if (i4 == 5) {
                    i3 = 8;
                }
            }
            i3 = 0;
        } else {
            i3 = 14;
        }
        int i5 = loadingViewType;
        if (i5 == 0 || i5 == 1 || i5 == 2) {
            int i6 = loadingViewType;
            if (i6 != 0) {
                if (i6 == 1) {
                    if (alwaysImage[2].name == -1) {
                        alwaysImage[2].initWithImageName(alwaysResource[2]);
                    }
                } else if (i6 == 2 && alwaysImage[3].name == -1) {
                    alwaysImage[3].initWithImageName(alwaysResource[3]);
                }
            } else if (alwaysImage[1].name == -1) {
                alwaysImage[1].initWithImageName(alwaysResource[1]);
            }
            if (uiCharNameImage[i3].name == -1) {
                uiCharNameImage[i3].initWithImageName(uiCharNameResource[i3]);
            }
        } else if (i5 == 3 || i5 == 4 || i5 == 5) {
            for (int i7 = 0; i7 < 4; i7++) {
                int i8 = i3 + i7;
                if (uiCharFaceImage[i8].name == -1) {
                    uiCharFaceImage[i8].initWithImageName(uiCharFaceResource[i8]);
                }
                if (uiCharNameImage[i8].name == -1) {
                    uiCharNameImage[i8].initWithImageName(uiCharNameResource[i8]);
                }
            }
        }
        alwaysImage[0].drawAtPointOption(0.0f, 0.0f, 18);
        int i9 = loadingViewType;
        if (i9 == 0 || i9 == 1 || i9 == 2) {
            int i10 = loadingViewType;
            if (i10 == 0) {
                alwaysImage[1].drawAtPointOption(CX, SCRHEIGHT_SMALL, 33);
            } else if (i10 == 1) {
                alwaysImage[2].drawAtPointOption(CX, SCRHEIGHT_SMALL, 33);
            } else if (i10 == 2) {
                alwaysImage[3].drawAtPointOption(CX, SCRHEIGHT_SMALL, 33);
            }
            uiCharNameImage[i3].drawAtPointOption(9.0f, 10.0f, 18);
        } else if (i9 == 3 || i9 == 4 || i9 == 5) {
            uiLoadingImage[3].drawAtPointOption(0.0f, 329.0f, 18);
            int i11 = 0;
            for (int i12 = 4; i11 < i12; i12 = 4) {
                int i13 = i3 + i11;
                uiCharFaceImage[i13].drawAtPointOptionGuide(loadingUnitAdjustPos[i13] + r14, 328.0f, 34, CGRectMake(i11 * 200, 0.0f, 200.0f, 328.0f));
                uiCharNameImage[i13].drawAtPointOption(r14 + 100, 335.0f, 17);
                i11++;
            }
        }
        uiLoadingImage[0].drawAtPointOption(7.0f, 428.0f, 18);
        uiLoadingImage[1].drawAtPointOption(10.0f, 460.0f, 18);
        uiLoadingImage[2].drawAtPointOptionGuide(10.0f, 460.0f, 18, CGRectMake(10.0f, 460.0f, (i * 780) / i2, 10.0f));
        setFontColor(-1);
        setFontSize(17);
        String[] split = GameThread.TIP_TEXT[GameThread.loadTipNumber].split("_");
        drawFont.getTextBounds(GameThread.TIP_TEXT[GameThread.loadTipNumber], 0, GameThread.TIP_TEXT[GameThread.loadTipNumber].length(), Texture2D.bounds_);
        int i14 = Texture2D.bounds_.right - Texture2D.bounds_.left;
        Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
        Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
        fillBlackImage.fillRect((CX - (i14 / 2)) - 5, 380.0f, i14 + 10, split.length * 27);
        Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        for (int i15 = 0; i15 < split.length; i15++) {
            drawStringDoubleM(split[i15], 385.0f, (i15 * 21) + 387, 17);
        }
    }

    public void paint_GAME_PRE_LOAD(GL10 gl10) {
        TouchManager.clearTouchMap();
    }

    public void paint_GAME_PRE_IMAGE_LOAD(GL10 gl10) {
        TouchManager.clearTouchMap();
        int i = loadCount_GAME_PRE_IMAGE_LOAD + 1;
        loadCount_GAME_PRE_IMAGE_LOAD = i;
        if (i != 0) {
            load_GAME_PRE_IMAGE_LOAD(i);
            if (loadCount_GAME_PRE_IMAGE_LOAD >= 4) {
                GameThread.gameLoadFlag = 1;
                GameThread.gameStatus = 0;
            }
        }
        drawLoadingViewShot(gl10, loadCount_GAME_PRE_IMAGE_LOAD, 4);
        if (GameThread.gameStatus != 1001) {
            removeLoadingImage();
        }
        TouchManager.swapTouchMap();
    }

    public void paint_GAME_PRE_TOTAL_IMAGE_LOAD(GL10 gl10) {
        TouchManager.clearTouchMap();
        int i = loadCount_GAME_PRE_TOTAL_IMAGE_LOAD + 1;
        loadCount_GAME_PRE_TOTAL_IMAGE_LOAD = i;
        if (i != 0) {
            load_GAME_PRE_TOTAL_IMAGE_LOAD(i, true);
            if (loadCount_GAME_PRE_TOTAL_IMAGE_LOAD >= 15) {
                GameThread.gameLoadFlag = 0;
                GameThread.loadingStatus = 1003;
                loadCount_GAME_MENU_IMAGE_LOAD = 0;
            }
        }
        drawLoadingViewShot(gl10, loadCount_GAME_PRE_TOTAL_IMAGE_LOAD, 25);
        TouchManager.swapTouchMap();
    }

    public void paint_GAME_NEW_MENU_IMAGE_LOAD(GL10 gl10) {
        TouchManager.clearTouchMap();
        int i = loadCount_GAME_MENU_IMAGE_LOAD + 1;
        loadCount_GAME_MENU_IMAGE_LOAD = i;
        if (i != 0) {
            load_GAME_MENU_IMAGE_LOAD(i);
            if (loadCount_GAME_MENU_IMAGE_LOAD >= 10) {
                GameThread.gameLoadFlag = 1;
                GameThread.gameStatus = 3;
                GameThread.gameSubStatus = 0;
                GameThread.gameTitleViewCount = 0;
            }
        }
        drawLoadingViewShot(gl10, loadCount_GAME_MENU_IMAGE_LOAD + 15, 25);
        if (GameThread.gameStatus != 1003) {
            removeLoadingImage();
        }
        TouchManager.swapTouchMap();
    }

    public void paint_GAME_PLAY_IMAGE_LOAD(GL10 gl10) {
        TouchManager.clearTouchMap();
        int i = loadCount_GAME_PLAY_IMAGE_LOAD + 1;
        loadCount_GAME_PLAY_IMAGE_LOAD = i;
        if (i != 0) {
            load_GAME_PLAY_IMAGE_LOAD(i);
            if (loadCount_GAME_PLAY_IMAGE_LOAD >= 17) {
                GameThread.gameLoadFlag = 1;
                GameThread.gameStatus = 10;
                GameThread.gameSubStatus = 0;
                startViewCount = 0;
                GameThread.mapAttackType = 0;
                GameThread.loadMap((GameThread.stageSelectChapterNumber * 10) + GameThread.stageSelectStageNumber, true);
                GameThread.playLoopSound(1);
            }
        }
        drawLoadingViewShot(gl10, loadCount_GAME_PLAY_IMAGE_LOAD, 17);
        if (GameThread.gameStatus != 1004) {
            removeLoadingImage();
        }
        TouchManager.swapTouchMap();
    }

    public void paint_GAME_PLAY2_IMAGE_LOAD(GL10 gl10) {
        TouchManager.clearTouchMap();
        int i = loadCount_GAME_PLAY_IMAGE_LOAD + 1;
        loadCount_GAME_PLAY_IMAGE_LOAD = i;
        if (i != 0) {
            load_GAME_PLAY_IMAGE_LOAD(i);
            if (loadCount_GAME_PLAY_IMAGE_LOAD >= 17) {
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
                GameThread.myOscillator[8].initWithTwoWayStartPosition(0, 300, 10, PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                GameThread.myOscillator[9].initWithTwoWayStartPosition(0, 300, 10, PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                GameThread.myOscillator[10].initWithTwoWayStartPosition(0, 300, 10, PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
                for (int i2 = 0; i2 < 11; i2++) {
                    GameThread.myOscillator[i2].fastForward();
                }
                GameThread.gameLoadFlag = 1;
                GameThread.gameStatus = 26;
                GameThread.gameSubStatus = 1;
                GameThread.characterMenuSelectFlag = 0;
                GameThread.stopLoopSound(1);
            }
        }
        drawLoadingViewShot(gl10, loadCount_GAME_PLAY_IMAGE_LOAD, 17);
        if (GameThread.gameStatus != 1005) {
            removeLoadingImage();
        }
        TouchManager.swapTouchMap();
    }

    public void paint_GAME_MENU_IMAGE_LOAD(GL10 gl10) {
        TouchManager.clearTouchMap();
        int i = loadCount_GAME_MENU_IMAGE_LOAD + 1;
        loadCount_GAME_MENU_IMAGE_LOAD = i;
        if (i != 0) {
            load_GAME_MENU_IMAGE_LOAD(i);
            if (loadCount_GAME_MENU_IMAGE_LOAD >= 10) {
                GameThread.gameLoadFlag = 1;
                GameThread.playLoopSound(1);
                GameThread.myOscillator[11].initWithTwoWayStartPosition(-150, 0, 15, 30, 10);
            }
        }
        drawLoadingViewShot(gl10, loadCount_GAME_MENU_IMAGE_LOAD, 10);
        if (GameThread.gameStatus != 1006) {
            removeLoadingImage();
        }
        TouchManager.swapTouchMap();
    }

    public void paint_GAME_RESUME_TO_MENU(GL10 gl10) {
        TouchManager.clearTouchMap();
        int i = loadCount_GAME_RESUME_TO_MENU + 1;
        loadCount_GAME_RESUME_TO_MENU = i;
        if (i >= 10) {
            if (i < 25) {
                load_GAME_PRE_TOTAL_IMAGE_LOAD(i - 10, false);
            } else if (i < 35) {
                load_GAME_MENU_IMAGE_LOAD((i - 10) - 15);
            } else {
                GameThread.gameLoadFlag = 1;
                int i2 = GameThread.gameStatus;
                if (i2 == 3) {
                    GameThread.playLoopSound(0);
                    GameThread.gameSubStatus = 12;
                } else if (i2 == 5) {
                    GameThread.playLoopSound(1);
                } else if (i2 == 8 || i2 == 9) {
                    GameThread.playLoopSound(0);
                }
            }
        }
        drawLoadingViewShot(gl10, loadCount_GAME_RESUME_TO_MENU, 35);
        if (GameThread.gameStatus != 1007) {
            removeLoadingImage();
        }
        TouchManager.swapTouchMap();
    }

    public void paint_GAME_RESUME_TO_PLAY(GL10 gl10) {
        TouchManager.clearTouchMap();
        int i = loadCount_GAME_RESUME_TO_PLAY + 1;
        loadCount_GAME_RESUME_TO_PLAY = i;
        if (i >= 10) {
            if (i < 25) {
                load_GAME_PRE_TOTAL_IMAGE_LOAD(i - 10, false);
            } else if (i < 42) {
                load_GAME_PLAY_IMAGE_LOAD((i - 10) - 15);
            } else {
                GameThread.gameLoadFlag = 1;
                int i2 = GameThread.gameStatus;
                if (i2 == 20 || i2 == 25) {
                    GameThread.playLoopSound(2);
                }
            }
        }
        drawLoadingViewShot(gl10, loadCount_GAME_RESUME_TO_PLAY, 42);
        if (GameThread.gameStatus != 1008) {
            removeLoadingImage();
        }
        TouchManager.swapTouchMap();
    }

    public static void removeLoadingImage() {
        alwaysImage[1].dealloc();
        alwaysImage[2].dealloc();
        alwaysImage[3].dealloc();
        removeImageResourceArray(uiCharFaceImage);
        removeImageResourceArray(uiCharNameImage);
    }

    public void drawInventoryWindow(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7;
        int i8;
        if (i3 == -1) {
            i6 = 0;
            i7 = -1;
            i8 = 0;
        } else {
            i6 = i3 / 8;
            i7 = i3 % 8;
            i8 = i3 - i7;
        }
        uiShopImage[23].drawAtPointOption(i, i2, 18);
        for (int i9 = 0; i9 < 8; i9++) {
            int i10 = i8 + i9;
            if (GameThread.itemUnitValue[i10] != -1) {
                drawUpItemImage(GameThread.itemUnitValue[i10], i + 53 + ((i9 % 8) * 70), i2 + 28, 18);
            } else {
                uiShopImage[46].drawAtPointOption(i + 53 + ((i9 % 8) * 70), i2 + 28, 18);
            }
        }
        for (int i11 = 0; i11 < 3; i11++) {
            uiEtcImage[9].drawAtPointOption(i + 312 + (i11 * 10), i2 + 92, 18);
        }
        uiEtcImage[10].drawAtPointOption(i + 306 + (i6 * 10), i2 + 86, 18);
        if (z && GameThread.itemUnitValue[i3] != -1) {
            if (i4 != 3) {
                uiShopImage[40].drawAtPointOption(i + 639, i2 + 19, 18);
            } else {
                uiShopImage[41].drawAtPointOption(i + 639, i2 + 19, 18);
            }
        }
        if (i4 != 1) {
            uiShopImage[42].drawAtPointOption(i + 9, i2 + 35, 18);
        } else {
            uiShopImage[43].drawAtPointOption(i + 9, i2 + 35, 18);
        }
        if (i4 != 2) {
            uiShopImage[44].drawAtPointOption(i + GameThread.MYSCORE_WAVE_PERFECT, i2 + 35, 18);
        } else {
            uiShopImage[45].drawAtPointOption(i + GameThread.MYSCORE_WAVE_PERFECT, i2 + 35, 18);
        }
        if (!z || i7 < 0 || i3 == -1 || GameThread.itemUnitValue[i3] == -1) {
            return;
        }
        float f = i2 + 28;
        drawSelectRedBox(i + 53 + ((i7 % 8) * 70), f);
        drawInvenItemDescription(r10 + 30, f, GameThread.itemUnitValue[i3]);
    }

    public static boolean makeBaseStruct() {
        rankListDraw = new CircleItemDraw(2, 5);
        for (int i = 0; i < rankListDraw.totalHalfBlockSize; i++) {
            rankListDraw.blockLengthArray[i] = i * 270;
            rankListDraw.blockSizeArray[i] = 1.0f;
            rankListDraw.blockAlphaArray[i] = 1.0f;
        }
        rankListDraw.blockLengthArray[0] = 0;
        rankListDraw.FIRST_BLOCK_SIZE = 270;
        rankListDraw.moveSpeed = 30;
        rankListDraw.nextMoveCheckDegree = 30;
        rankListDraw.moveCloseFlag = true;
        awardListDraw = new CircleItemDraw(5, 62);
        for (int i2 = 0; i2 < awardListDraw.totalHalfBlockSize; i2++) {
            awardListDraw.blockLengthArray[i2] = i2 * 60;
            awardListDraw.blockSizeArray[i2] = 1.0f;
            awardListDraw.blockAlphaArray[i2] = 1.0f;
        }
        awardListDraw.blockLengthArray[0] = 0;
        awardListDraw.FIRST_BLOCK_SIZE = 60;
        awardListDraw.moveSpeed = 20;
        awardListDraw.nextMoveCheckDegree = 10;
        awardListDraw.moveCloseFlag = true;
        awardListDraw.blockLastViewCount = 3;
        upgradeItemListDraw = new CircleItemDraw(5, 30);
        for (int i3 = 0; i3 < upgradeItemListDraw.totalHalfBlockSize; i3++) {
            upgradeItemListDraw.blockLengthArray[i3] = i3 * 70;
            upgradeItemListDraw.blockSizeArray[i3] = 1.0f;
            upgradeItemListDraw.blockAlphaArray[i3] = 1.0f;
        }
        upgradeItemListDraw.blockLengthArray[0] = 0;
        upgradeItemListDraw.FIRST_BLOCK_SIZE = 70;
        upgradeItemListDraw.moveSpeed = 20;
        upgradeItemListDraw.nextMoveCheckDegree = 10;
        upgradeItemListDraw.moveCloseFlag = true;
        upgradeItemListDraw.blockLastViewCount = 3;
        inventoryItemListDraw = new CircleItemDraw(3, 3);
        for (int i4 = 0; i4 < inventoryItemListDraw.totalHalfBlockSize; i4++) {
            inventoryItemListDraw.blockLengthArray[i4] = i4 * 500;
            inventoryItemListDraw.blockSizeArray[i4] = 1.0f;
            inventoryItemListDraw.blockAlphaArray[i4] = 1.0f;
        }
        inventoryItemListDraw.blockLengthArray[0] = 0;
        inventoryItemListDraw.FIRST_BLOCK_SIZE = 500;
        inventoryItemListDraw.moveSpeed = 50;
        inventoryItemListDraw.nextMoveCheckDegree = 40;
        inventoryItemListDraw.moveCloseFlag = true;
        inventoryItemListDraw.blockLastViewCount = 1;
        backBaseImageArray = makeTextureArray(tileBaseResource.length);
        backTileImage0 = makeTextureArray(tileTileResource[0].length);
        backTileImage1 = makeTextureArray(tileTileResource[1].length);
        backTileImage2 = makeTextureArray(tileTileResource[2].length);
        backTileImage3 = makeTextureArray(tileTileResource[3].length);
        backTileImage4 = makeTextureArray(tileTileResource[4].length);
        backObjectImage = makeTextureArray(DataObject.objectImageResource.length);
        fillBlackImage = new Texture2D();
        fillWhiteImage = new Texture2D();
        backShadowImage = new Texture2D();
        whiteCircleImage = makeTextureArray(4);
        redCircleImage = makeTextureArray(4);
        outBorderImage = makeTextureArray(4);
        targetImage = new Texture2D();
        dollarImage = new Texture2D();
        heroismImage = new Texture2D();
        numberMoneyImage = makeTextureArray(numberMoneyResource.length);
        numberManaImage = makeTextureArray(numberManaResource.length);
        numberWaveImage = makeTextureArray(numberWaveResource.length);
        numberUnitBuyImage = makeTextureArray(numberUnitBuyResource.length);
        numberHeroBuyImage = makeTextureArray(numberHeroBuyResource.length);
        numberLifeImage = makeTextureArray(numberLifeResource.length);
        numberHeroismImage = makeTextureArray(numberHeroismResource.length);
        numberStagePointImage = makeTextureArray(numberStagePointResource.length);
        numberUpgradeImage = makeTextureArray(numberUpgradeResource.length);
        numberClearImage = makeTextureArray(numberClearResource.length);
        numberTotalImage = makeTextureArray(numberTotalResource.length);
        tutorialImage = makeTextureArray(tutorialResource.length);
        uiButtonImage = makeTextureArray(uiButtonResource.length);
        gatefireImage = makeTextureArray(gatefireResource.length);
        uiPopupImage = makeTextureArray(uiPopupResource.length);
        uiLoadingImage = makeTextureArray(uiLoadingResource.length);
        alwaysImage = makeTextureArray(alwaysResource.length);
        titleImage = makeTextureArray(titleResource.length);
        titleBossImage = makeTextureArray(titleBoss0Resource.length);
        mainmenuImage = makeTextureArray(mainmenuResource.length);
        stageClearImage = makeTextureArray(stageClearResource.length);
        uiUpperImage = makeTextureArray(uiUpperResource.length);
        uiIngameImage = makeTextureArray(ingameResource.length);
        uiCharButtonImage = makeTextureArray(uiCharButtonResource.length);
        uiCharEtcImage = makeTextureArray(uiCharEtcResource.length);
        uiCharFaceImage = makeTextureArray(uiCharFaceResource.length);
        uiCharNameImage = makeTextureArray(uiCharNameResource.length);
        uiCharUpFaceImage = makeTextureArray(uiCharUpFaceResource.length);
        uiMonsterEtcImage = makeTextureArray(uiMonsterEtcResource.length);
        uiMonsterFaceImage = makeTextureArray(uiMonsterFaceResource.length);
        uiMonsterNameImage = makeTextureArray(uiMonsterNameResource.length);
        uiThemeclearImage = makeTextureArray(uiThemeclearResource.length);
        specialSwordImage = makeTextureArray(specialSwordResource.length);
        specialArrowImage = makeTextureArray(specialArrowResource.length);
        specialIceImage = makeTextureArray(specialIceResource.length);
        uiUpgradeImage = makeTextureArray(uiUpgradeResource.length);
        uiShopImage = makeTextureArray(uiShopResource.length);
        uiUpunitImage = makeTextureArray(uiUpunitResource.length);
        uiUpheroImage = makeTextureArray(uiUpheroResource.length);
        uiUpitemImage = makeTextureArray(uiUpitemResource.length);
        uiAwardImage = makeTextureArray(uiAwardResource.length);
        uiStageImage = makeTextureArray(uiStageResource.length);
        uiStageBossImage = makeTextureArray(uiStageBossResource.length);
        uiHelpImage = makeTextureArray(uiHelpResource.length);
        uiHelpShotImage = makeTextureArray(uiHelpShotResource.length);
        uiRecordImage = makeTextureArray(uiRecordResource.length);
        uiEtcImage = makeTextureArray(uiEtcResource.length);
        monsterImage_0 = makeTextureArray(DataAnim.unitImageResource_0.length);
        monsterImage_1 = makeTextureArray(DataAnim.unitImageResource_1.length);
        monsterImage_2 = makeTextureArray(DataAnim.unitImageResource_2.length);
        monsterImage_3 = makeTextureArray(DataAnim.unitImageResource_3.length);
        monsterImage_4 = makeTextureArray(DataAnim.unitImageResource_4.length);
        monsterImage_5 = makeTextureArray(DataAnim.unitImageResource_5.length);
        monsterImage_6 = makeTextureArray(DataAnim.unitImageResource_6.length);
        monsterImage_7 = makeTextureArray(DataAnim.unitImageResource_7.length);
        monsterImage_8 = makeTextureArray(DataAnim.unitImageResource_8.length);
        monsterImage_9 = makeTextureArray(DataAnim.unitImageResource_9.length);
        monsterImage_10 = makeTextureArray(DataAnim.unitImageResource_10.length);
        monsterImage_11 = makeTextureArray(DataAnim.unitImageResource_11.length);
        monsterImage_12 = makeTextureArray(DataAnim.unitImageResource_12.length);
        monsterImage_13 = makeTextureArray(DataAnim.unitImageResource_13.length);
        monsterImage_14 = makeTextureArray(DataAnim.unitImageResource_14.length);
        monsterImage_15 = makeTextureArray(DataAnim.unitImageResource_15.length);
        monsterImage_16 = makeTextureArray(DataAnim.unitImageResource_16.length);
        monsterImage_17 = makeTextureArray(DataAnim.unitImageResource_17.length);
        monsterImage_18 = makeTextureArray(DataAnim.unitImageResource_18.length);
        monsterImage_19 = makeTextureArray(DataAnim.unitImageResource_19.length);
        monsterImage_20 = makeTextureArray(DataAnim.unitImageResource_20.length);
        monsterImage_21 = makeTextureArray(DataAnim.unitImageResource_21.length);
        monsterImage_22 = makeTextureArray(DataAnim.unitImageResource_22.length);
        monsterImage_23 = makeTextureArray(DataAnim.unitImageResource_23.length);
        monsterImage_24 = makeTextureArray(DataAnim.unitImageResource_24.length);
        monsterImage_25 = makeTextureArray(DataAnim.unitImageResource_25.length);
        monsterImage_100 = makeTextureArray(DataAnim.unitImageResource_100.length);
        monsterImage_101 = makeTextureArray(DataAnim.unitImageResource_101.length);
        monsterImage_102 = makeTextureArray(DataAnim.unitImageResource_102.length);
        monsterImage_103 = makeTextureArray(DataAnim.unitImageResource_103.length);
        monsterImage_104 = makeTextureArray(DataAnim.unitImageResource_104.length);
        towerImage_200 = makeTextureArray(DataAnim.unitImageResource_200.length);
        towerImage_201 = makeTextureArray(DataAnim.unitImageResource_201.length);
        towerImage_202 = makeTextureArray(DataAnim.unitImageResource_202.length);
        towerImage_203 = makeTextureArray(DataAnim.unitImageResource_203.length);
        towerImage_204 = makeTextureArray(DataAnim.unitImageResource_204.length);
        towerImage_205 = makeTextureArray(DataAnim.unitImageResource_205.length);
        towerImage_206 = makeTextureArray(DataAnim.unitImageResource_206.length);
        towerImage_207 = makeTextureArray(DataAnim.unitImageResource_207.length);
        towerImage_208 = makeTextureArray(DataAnim.unitImageResource_208.length);
        towerImage_209 = makeTextureArray(DataAnim.unitImageResource_209.length);
        towerImage_210 = makeTextureArray(DataAnim.unitImageResource_210.length);
        towerImage_211 = makeTextureArray(DataAnim.unitImageResource_211.length);
        heroImage_300 = makeTextureArray(DataAnim.unitImageResource_300.length);
        heroImage_301 = makeTextureArray(DataAnim.unitImageResource_301.length);
        heroImage_302 = makeTextureArray(DataAnim.unitImageResource_302.length);
        effectImage_500 = makeTextureArray(DataAnim.unitImageResource_500.length);
        effectImage_502 = makeTextureArray(DataAnim.unitImageResource_502.length);
        effectImage_503 = makeTextureArray(DataAnim.unitImageResource_503.length);
        effectImage_504 = makeTextureArray(DataAnim.unitImageResource_504.length);
        effectImage_505 = makeTextureArray(DataAnim.unitImageResource_505.length);
        effectImage_509 = makeTextureArray(DataAnim.unitImageResource_509.length);
        effectImage_510 = makeTextureArray(DataAnim.unitImageResource_510.length);
        effectImage_533 = makeTextureArray(DataAnim.unitImageResource_533.length);
        effectImage_534 = makeTextureArray(DataAnim.unitImageResource_534.length);
        effectImage_512 = makeTextureArray(DataAnim.unitImageResource_512.length);
        effectImage_513 = makeTextureArray(DataAnim.unitImageResource_513.length);
        effectImage_514 = makeTextureArray(DataAnim.unitImageResource_514.length);
        effectImage_532 = makeTextureArray(DataAnim.unitImageResource_532.length);
        effectImage_535 = makeTextureArray(DataAnim.unitImageResource_535.length);
        continueImage_600 = makeTextureArray(DataAnim.unitImageResource_600.length);
        continueImage_601 = makeTextureArray(DataAnim.unitImageResource_601.length);
        continueImage_604 = makeTextureArray(DataAnim.unitImageResource_604.length);
        arrowImage0 = makeTextureArray(arrowResource0.length);
        arrowImage1 = makeTextureArray(arrowResource1.length);
        arrowImage2 = makeTextureArray(arrowResource2.length);
        arrowImage3 = makeTextureArray(arrowResource3.length);
        arrowImage4 = makeTextureArray(arrowResource4.length);
        arrowImage9 = makeTextureArray(arrowResource9.length);
        shadowImage = makeTextureArray(2);
        logoImage = makeTextureArray(logoResource.length);
        storyImage = makeTextureArray(GameThread.storyDataResource.length);
        story2Image = makeTextureArray(GameThread.story2DataResource.length);
        testboxImage = new Texture2D();
        testboxImage2 = new Texture2D();
        return true;
    }

    public static boolean load_GAME_PRE_IMAGE_LOAD(int i) {
        if (i == 1) {
            textTombstone.dealloc();
            removeImageResourceArray(logoImage);
            removeImageResourceArray(storyImage);
            fillBlackImage.dealloc();
            fillWhiteImage.dealloc();
            removeImageResourceArray(uiLoadingImage);
            removeImageResourceArray(alwaysImage);
            removeImageResourceArray(backBaseImageArray);
            removeImageResourceArray(backTileImage0);
            removeImageResourceArray(backTileImage1);
            removeImageResourceArray(backTileImage2);
            removeImageResourceArray(backTileImage3);
            removeImageResourceArray(backTileImage4);
            removeImageResourceArray(uiCharButtonImage);
            removeImageResourceArray(uiCharEtcImage);
            removeImageResourceArray(uiCharFaceImage);
            removeImageResourceArray(uiCharNameImage);
            removeImageResourceArray(backObjectImage);
            removeImageResourceArray(uiPopupImage);
            removeImageResourceArray(arrowImage0);
            removeImageResourceArray(arrowImage1);
            removeImageResourceArray(arrowImage2);
            removeImageResourceArray(arrowImage3);
            removeImageResourceArray(arrowImage4);
            removeImageResourceArray(arrowImage9);
            removeImageResourceArray(story2Image);
            backShadowImage.dealloc();
            removeImageResourceArray(whiteCircleImage);
            removeImageResourceArray(redCircleImage);
            removeImageResourceArray(outBorderImage);
            removeImageResourceArray(shadowImage);
            targetImage.dealloc();
            removeImageResourceArray(monsterImage_0);
            removeImageResourceArray(monsterImage_1);
            removeImageResourceArray(monsterImage_2);
            removeImageResourceArray(monsterImage_3);
            removeImageResourceArray(monsterImage_4);
            removeImageResourceArray(monsterImage_5);
            removeImageResourceArray(monsterImage_6);
            removeImageResourceArray(monsterImage_7);
            removeImageResourceArray(monsterImage_8);
            removeImageResourceArray(monsterImage_9);
            removeImageResourceArray(monsterImage_10);
            removeImageResourceArray(monsterImage_11);
            removeImageResourceArray(monsterImage_12);
            removeImageResourceArray(monsterImage_13);
            removeImageResourceArray(monsterImage_14);
            removeImageResourceArray(monsterImage_15);
            removeImageResourceArray(monsterImage_16);
            removeImageResourceArray(monsterImage_17);
            removeImageResourceArray(monsterImage_18);
            removeImageResourceArray(monsterImage_19);
            removeImageResourceArray(monsterImage_20);
            removeImageResourceArray(monsterImage_21);
            removeImageResourceArray(monsterImage_22);
            removeImageResourceArray(monsterImage_23);
            removeImageResourceArray(monsterImage_24);
            removeImageResourceArray(monsterImage_25);
            removeImageResourceArray(monsterImage_100);
            removeImageResourceArray(monsterImage_101);
            removeImageResourceArray(monsterImage_102);
            removeImageResourceArray(monsterImage_103);
            removeImageResourceArray(monsterImage_104);
            removeImageResourceArray(towerImage_200);
            removeImageResourceArray(towerImage_201);
            removeImageResourceArray(towerImage_202);
            removeImageResourceArray(towerImage_203);
            removeImageResourceArray(towerImage_204);
            removeImageResourceArray(towerImage_205);
            removeImageResourceArray(towerImage_206);
            removeImageResourceArray(towerImage_207);
            removeImageResourceArray(towerImage_208);
            removeImageResourceArray(towerImage_209);
            removeImageResourceArray(towerImage_210);
            removeImageResourceArray(towerImage_211);
            removeImageResourceArray(heroImage_300);
            removeImageResourceArray(heroImage_301);
            removeImageResourceArray(heroImage_302);
            removeImageResourceArray(effectImage_500);
            removeImageResourceArray(effectImage_502);
            removeImageResourceArray(effectImage_503);
            removeImageResourceArray(effectImage_504);
            removeImageResourceArray(effectImage_505);
            removeImageResourceArray(effectImage_509);
            removeImageResourceArray(effectImage_510);
            removeImageResourceArray(effectImage_533);
            removeImageResourceArray(effectImage_534);
            removeImageResourceArray(effectImage_512);
            removeImageResourceArray(effectImage_513);
            removeImageResourceArray(effectImage_514);
            removeImageResourceArray(effectImage_532);
            removeImageResourceArray(effectImage_535);
            removeImageResourceArray(continueImage_600);
            removeImageResourceArray(continueImage_601);
            removeImageResourceArray(continueImage_604);
            removeImageResourceArray(numberClearImage);
            removeImageResourceArray(numberHeroBuyImage);
            removeImageResourceArray(numberLifeImage);
            removeImageResourceArray(numberManaImage);
            removeImageResourceArray(numberMoneyImage);
            removeImageResourceArray(numberUnitBuyImage);
            removeImageResourceArray(numberUpgradeImage);
            removeImageResourceArray(numberWaveImage);
            removeImageResourceArray(numberTotalImage);
            removeImageResourceArray(specialSwordImage);
            removeImageResourceArray(specialArrowImage);
            removeImageResourceArray(specialIceImage);
            removeImageResourceArray(tutorialImage);
            removeImageResourceArray(uiButtonImage);
            removeImageResourceArray(gatefireImage);
            removeImageResourceArray(stageClearImage);
            removeImageResourceArray(uiIngameImage);
            removeImageResourceArray(uiUpperImage);
            removeImageResourceArray(uiCharUpFaceImage);
            removeImageResourceArray(uiMonsterEtcImage);
            removeImageResourceArray(uiMonsterFaceImage);
            removeImageResourceArray(uiMonsterNameImage);
            removeImageResourceArray(uiThemeclearImage);
            dollarImage.dealloc();
            heroismImage.dealloc();
            removeImageResourceArray(titleImage);
            removeImageResourceArray(titleBossImage);
            removeImageResourceArray(mainmenuImage);
            removeImageResourceArray(uiEtcImage);
            removeImageResourceArray(uiHelpImage);
            removeImageResourceArray(uiHelpShotImage);
            removeImageResourceArray(uiRecordImage);
            removeImageResourceArray(uiShopImage);
            removeImageResourceArray(uiGiftImage);
            removeImageResourceArray(uiStageImage);
            removeImageResourceArray(uiStageBossImage);
            removeImageResourceArray(uiUpgradeImage);
            removeImageResourceArray(uiUpheroImage);
            removeImageResourceArray(uiUpitemImage);
            removeImageResourceArray(uiUpunitImage);
            removeImageResourceArray(uiAwardImage);
            removeImageResourceArray(numberHeroismImage);
            removeImageResourceArray(numberStagePointImage);
            testboxImage.dealloc();
            testboxImage2.dealloc();
        } else if (i == 2) {
            fillBlackImage.initWithImageColor(ViewCompat.MEASURED_STATE_MASK);
            fillWhiteImage.initWithImageColor(-1);
            loadImageResourceToTexture(logoImage, logoResource);
        } else if (i == 3) {
            loadImageResourceToTexture(storyImage, GameThread.storyDataResource);
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean load_GAME_PRE_TOTAL_IMAGE_LOAD(int i, boolean z) {
        Log.d("LOADING", String.format("load_GAME_PRE_TOTAL_IMAGE_LOAD!!! %d", Integer.valueOf(i)));
        Log.d("LOADING", String.format("load_GAME_PRE_TOTAL_IMAGE_LOAD!!! %d", Integer.valueOf(i)));
        Log.d("LOADING", String.format("load_GAME_PRE_TOTAL_IMAGE_LOAD!!! %d", Integer.valueOf(i)));
        Log.d("LOADING", String.format("load_GAME_PRE_TOTAL_IMAGE_LOAD!!! %d", Integer.valueOf(i)));
        Log.d("LOADING", String.format("load_GAME_PRE_TOTAL_IMAGE_LOAD!!! %d", Integer.valueOf(i)));
        Log.d("LOADING", String.format("load_GAME_PRE_TOTAL_IMAGE_LOAD!!! %d", Integer.valueOf(i)));
        if (i != 1) {
            if (i == 2) {
                fillBlackImage.initWithImageColor(ViewCompat.MEASURED_STATE_MASK);
                fillWhiteImage.initWithImageColor(-1);
                loadImageResourceToTexture(uiLoadingImage, uiLoadingResource);
                alwaysImage[0].initWithImageName(alwaysResource[0]);
                if (z) {
                    loadViewFlag = true;
                }
            } else {
                switch (i) {
                    case 5:
                        loadImageResourceToTexture(backTileImage0, tileTileResource[0]);
                        loadImageResourceToTexture(backTileImage1, tileTileResource[1]);
                        loadImageResourceToTexture(backTileImage2, tileTileResource[2]);
                        loadImageResourceToTexture(backTileImage3, tileTileResource[3]);
                        loadImageResourceToTexture(backTileImage4, tileTileResource[4]);
                        break;
                    case 6:
                        loadImageResourceToTexture(uiCharButtonImage, uiCharButtonResource);
                        loadImageResourceToTexture(uiCharEtcImage, uiCharEtcResource);
                        loadImageResourceToTexture(backObjectImage, DataObject.objectImageResource);
                        loadImageResourceToTexture(uiPopupImage, uiPopupResource);
                        break;
                    case 7:
                        loadImageResourceToTexture(monsterImage_0, DataAnim.unitImageResource_0);
                        loadImageResourceToTexture(monsterImage_1, DataAnim.unitImageResource_1);
                        loadImageResourceToTexture(monsterImage_2, DataAnim.unitImageResource_2);
                        loadImageResourceToTexture(monsterImage_3, DataAnim.unitImageResource_3);
                        loadImageResourceToTexture(monsterImage_4, DataAnim.unitImageResource_4);
                        loadImageResourceToTexture(monsterImage_5, DataAnim.unitImageResource_5);
                        loadImageResourceToTexture(monsterImage_6, DataAnim.unitImageResource_6);
                        loadImageResourceToTexture(monsterImage_7, DataAnim.unitImageResource_7);
                        loadImageResourceToTexture(monsterImage_8, DataAnim.unitImageResource_8);
                        loadImageResourceToTexture(monsterImage_9, DataAnim.unitImageResource_9);
                        break;
                    case 8:
                        loadImageResourceToTexture(monsterImage_10, DataAnim.unitImageResource_10);
                        loadImageResourceToTexture(monsterImage_11, DataAnim.unitImageResource_11);
                        loadImageResourceToTexture(monsterImage_12, DataAnim.unitImageResource_12);
                        loadImageResourceToTexture(monsterImage_13, DataAnim.unitImageResource_13);
                        loadImageResourceToTexture(monsterImage_14, DataAnim.unitImageResource_14);
                        loadImageResourceToTexture(monsterImage_15, DataAnim.unitImageResource_15);
                        loadImageResourceToTexture(monsterImage_16, DataAnim.unitImageResource_16);
                        loadImageResourceToTexture(monsterImage_17, DataAnim.unitImageResource_17);
                        loadImageResourceToTexture(monsterImage_18, DataAnim.unitImageResource_18);
                        loadImageResourceToTexture(monsterImage_19, DataAnim.unitImageResource_19);
                        break;
                    case 9:
                        loadImageResourceToTexture(monsterImage_20, DataAnim.unitImageResource_20);
                        loadImageResourceToTexture(monsterImage_21, DataAnim.unitImageResource_21);
                        loadImageResourceToTexture(monsterImage_22, DataAnim.unitImageResource_22);
                        loadImageResourceToTexture(monsterImage_23, DataAnim.unitImageResource_23);
                        loadImageResourceToTexture(monsterImage_24, DataAnim.unitImageResource_24);
                        loadImageResourceToTexture(monsterImage_25, DataAnim.unitImageResource_25);
                        loadImageResourceToTexture(monsterImage_100, DataAnim.unitImageResource_100);
                        loadImageResourceToTexture(monsterImage_101, DataAnim.unitImageResource_101);
                        loadImageResourceToTexture(monsterImage_102, DataAnim.unitImageResource_102);
                        loadImageResourceToTexture(monsterImage_103, DataAnim.unitImageResource_103);
                        loadImageResourceToTexture(monsterImage_104, DataAnim.unitImageResource_104);
                        break;
                    case 10:
                        loadImageResourceToTexture(towerImage_200, DataAnim.unitImageResource_200);
                        loadImageResourceToTexture(towerImage_201, DataAnim.unitImageResource_201);
                        loadImageResourceToTexture(towerImage_202, DataAnim.unitImageResource_202);
                        loadImageResourceToTexture(towerImage_203, DataAnim.unitImageResource_203);
                        loadImageResourceToTexture(towerImage_204, DataAnim.unitImageResource_204);
                        loadImageResourceToTexture(towerImage_205, DataAnim.unitImageResource_205);
                        loadImageResourceToTexture(towerImage_206, DataAnim.unitImageResource_206);
                        loadImageResourceToTexture(towerImage_207, DataAnim.unitImageResource_207);
                        loadImageResourceToTexture(towerImage_208, DataAnim.unitImageResource_208);
                        loadImageResourceToTexture(towerImage_209, DataAnim.unitImageResource_209);
                        loadImageResourceToTexture(towerImage_210, DataAnim.unitImageResource_210);
                        loadImageResourceToTexture(towerImage_211, DataAnim.unitImageResource_211);
                        break;
                    case 11:
                        loadImageResourceToTexture(heroImage_300, DataAnim.unitImageResource_300);
                        loadImageResourceToTexture(heroImage_301, DataAnim.unitImageResource_301);
                        loadImageResourceToTexture(heroImage_302, DataAnim.unitImageResource_302);
                        loadImageResourceToTexture(effectImage_500, DataAnim.unitImageResource_500);
                        loadImageResourceToTexture(effectImage_502, DataAnim.unitImageResource_502);
                        loadImageResourceToTexture(effectImage_503, DataAnim.unitImageResource_503);
                        loadImageResourceToTexture(effectImage_504, DataAnim.unitImageResource_504);
                        loadImageResourceToTexture(effectImage_505, DataAnim.unitImageResource_505);
                        loadImageResourceToTexture(effectImage_509, DataAnim.unitImageResource_509);
                        loadImageResourceToTexture(effectImage_510, DataAnim.unitImageResource_510);
                        loadImageResourceToTexture(effectImage_533, DataAnim.unitImageResource_533);
                        loadImageResourceToTexture(effectImage_534, DataAnim.unitImageResource_534);
                        loadImageResourceToTexture(effectImage_512, DataAnim.unitImageResource_512);
                        loadImageResourceToTexture(effectImage_513, DataAnim.unitImageResource_513);
                        loadImageResourceToTexture(effectImage_514, DataAnim.unitImageResource_514);
                        loadImageResourceToTexture(effectImage_532, DataAnim.unitImageResource_532);
                        loadImageResourceToTexture(effectImage_535, DataAnim.unitImageResource_535);
                        break;
                    case 12:
                        loadImageResourceToTexture(continueImage_600, DataAnim.unitImageResource_600);
                        loadImageResourceToTexture(continueImage_601, DataAnim.unitImageResource_601);
                        loadImageResourceToTexture(continueImage_604, DataAnim.unitImageResource_604);
                        loadImageResourceToTexture(numberClearImage, numberClearResource);
                        loadImageResourceToTexture(numberHeroBuyImage, numberHeroBuyResource);
                        loadImageResourceToTexture(numberLifeImage, numberLifeResource);
                        loadImageResourceToTexture(numberManaImage, numberManaResource);
                        loadImageResourceToTexture(numberMoneyImage, numberMoneyResource);
                        loadImageResourceToTexture(numberUnitBuyImage, numberUnitBuyResource);
                        loadImageResourceToTexture(numberWaveImage, numberWaveResource);
                        loadImageResourceToTexture(numberTotalImage, numberTotalResource);
                        break;
                    case 13:
                        loadImageResourceToTexture(uiIngameImage, ingameResource);
                        loadImageResourceToTexture(uiUpperImage, uiUpperResource);
                        loadImageResourceToTexture(numberStagePointImage, numberStagePointResource);
                        loadImageResourceToTexture(uiMonsterEtcImage, uiMonsterEtcResource);
                        break;
                    case 14:
                        loadImageResourceToTexture(arrowImage0, arrowResource0);
                        loadImageResourceToTexture(arrowImage1, arrowResource1);
                        loadImageResourceToTexture(arrowImage2, arrowResource2);
                        loadImageResourceToTexture(arrowImage3, arrowResource3);
                        loadImageResourceToTexture(arrowImage4, arrowResource4);
                        loadImageResourceToTexture(arrowImage9, arrowResource9);
                        loadImageResourceToTexture(story2Image, GameThread.story2DataResource);
                        backShadowImage.initWithImageName(R.drawable.etc_shadow);
                        whiteCircleImage[0].initWithImageName(R.drawable.etc_whitecircle1);
                        whiteCircleImage[1].initWithImageName(R.drawable.etc_whitecircle2);
                        whiteCircleImage[2].initWithImageName(R.drawable.etc_whitecircle3);
                        whiteCircleImage[3].initWithImageName(R.drawable.etc_whitecircle4);
                        redCircleImage[0].initWithImageName(R.drawable.etc_redcircle1);
                        redCircleImage[1].initWithImageName(R.drawable.etc_redcircle2);
                        redCircleImage[2].initWithImageName(R.drawable.etc_redcircle3);
                        redCircleImage[3].initWithImageName(R.drawable.etc_redcircle4);
                        shadowImage[0].initWithImageName(R.drawable.etc_sha34);
                        shadowImage[1].initWithImageName(R.drawable.etc_sha63);
                        outBorderImage[0].initWithImageName(R.drawable.etc_out);
                        outBorderImage[1].initWithImageName(R.drawable.etc_outl);
                        outBorderImage[2].initWithImageName(R.drawable.etc_outr);
                        outBorderImage[3].initWithImageName(R.drawable.etc_outu);
                        targetImage.initWithImageName(R.drawable.etc_target);
                        testboxImage.initWithImageName(R.drawable.etc_testbox);
                        testboxImage2.initWithImageName(R.drawable.etc_testbox2);
                        if (!z) {
                            loadViewFlag = true;
                            break;
                        }
                        break;
                }
            }
        } else {
            textTombstone.dealloc();
            removeImageResourceArray(logoImage);
            removeImageResourceArray(storyImage);
            fillBlackImage.dealloc();
            fillWhiteImage.dealloc();
            removeImageResourceArray(uiLoadingImage);
            removeImageResourceArray(alwaysImage);
            removeImageResourceArray(backBaseImageArray);
            removeImageResourceArray(backTileImage0);
            removeImageResourceArray(backTileImage1);
            removeImageResourceArray(backTileImage2);
            removeImageResourceArray(backTileImage3);
            removeImageResourceArray(backTileImage4);
            removeImageResourceArray(uiCharButtonImage);
            removeImageResourceArray(uiCharEtcImage);
            removeImageResourceArray(uiCharFaceImage);
            removeImageResourceArray(uiCharNameImage);
            removeImageResourceArray(backObjectImage);
            removeImageResourceArray(uiPopupImage);
            removeImageResourceArray(arrowImage0);
            removeImageResourceArray(arrowImage1);
            removeImageResourceArray(arrowImage2);
            removeImageResourceArray(arrowImage3);
            removeImageResourceArray(arrowImage4);
            removeImageResourceArray(arrowImage9);
            removeImageResourceArray(story2Image);
            backShadowImage.dealloc();
            removeImageResourceArray(whiteCircleImage);
            removeImageResourceArray(redCircleImage);
            removeImageResourceArray(outBorderImage);
            removeImageResourceArray(shadowImage);
            targetImage.dealloc();
            removeImageResourceArray(monsterImage_0);
            removeImageResourceArray(monsterImage_1);
            removeImageResourceArray(monsterImage_2);
            removeImageResourceArray(monsterImage_3);
            removeImageResourceArray(monsterImage_4);
            removeImageResourceArray(monsterImage_5);
            removeImageResourceArray(monsterImage_6);
            removeImageResourceArray(monsterImage_7);
            removeImageResourceArray(monsterImage_8);
            removeImageResourceArray(monsterImage_9);
            removeImageResourceArray(monsterImage_10);
            removeImageResourceArray(monsterImage_11);
            removeImageResourceArray(monsterImage_12);
            removeImageResourceArray(monsterImage_13);
            removeImageResourceArray(monsterImage_14);
            removeImageResourceArray(monsterImage_15);
            removeImageResourceArray(monsterImage_16);
            removeImageResourceArray(monsterImage_17);
            removeImageResourceArray(monsterImage_18);
            removeImageResourceArray(monsterImage_19);
            removeImageResourceArray(monsterImage_20);
            removeImageResourceArray(monsterImage_21);
            removeImageResourceArray(monsterImage_22);
            removeImageResourceArray(monsterImage_23);
            removeImageResourceArray(monsterImage_24);
            removeImageResourceArray(monsterImage_25);
            removeImageResourceArray(monsterImage_100);
            removeImageResourceArray(monsterImage_101);
            removeImageResourceArray(monsterImage_102);
            removeImageResourceArray(monsterImage_103);
            removeImageResourceArray(monsterImage_104);
            removeImageResourceArray(towerImage_200);
            removeImageResourceArray(towerImage_201);
            removeImageResourceArray(towerImage_202);
            removeImageResourceArray(towerImage_203);
            removeImageResourceArray(towerImage_204);
            removeImageResourceArray(towerImage_205);
            removeImageResourceArray(towerImage_206);
            removeImageResourceArray(towerImage_207);
            removeImageResourceArray(towerImage_208);
            removeImageResourceArray(towerImage_209);
            removeImageResourceArray(towerImage_210);
            removeImageResourceArray(towerImage_211);
            removeImageResourceArray(heroImage_300);
            removeImageResourceArray(heroImage_301);
            removeImageResourceArray(heroImage_302);
            removeImageResourceArray(effectImage_500);
            removeImageResourceArray(effectImage_502);
            removeImageResourceArray(effectImage_503);
            removeImageResourceArray(effectImage_504);
            removeImageResourceArray(effectImage_505);
            removeImageResourceArray(effectImage_509);
            removeImageResourceArray(effectImage_510);
            removeImageResourceArray(effectImage_533);
            removeImageResourceArray(effectImage_534);
            removeImageResourceArray(effectImage_512);
            removeImageResourceArray(effectImage_513);
            removeImageResourceArray(effectImage_514);
            removeImageResourceArray(effectImage_532);
            removeImageResourceArray(effectImage_535);
            removeImageResourceArray(continueImage_600);
            removeImageResourceArray(continueImage_601);
            removeImageResourceArray(continueImage_604);
            removeImageResourceArray(numberClearImage);
            removeImageResourceArray(numberHeroBuyImage);
            removeImageResourceArray(numberLifeImage);
            removeImageResourceArray(numberManaImage);
            removeImageResourceArray(numberMoneyImage);
            removeImageResourceArray(numberUnitBuyImage);
            removeImageResourceArray(numberUpgradeImage);
            removeImageResourceArray(numberWaveImage);
            removeImageResourceArray(numberTotalImage);
            removeImageResourceArray(specialSwordImage);
            removeImageResourceArray(specialArrowImage);
            removeImageResourceArray(specialIceImage);
            removeImageResourceArray(tutorialImage);
            removeImageResourceArray(uiButtonImage);
            removeImageResourceArray(gatefireImage);
            removeImageResourceArray(stageClearImage);
            removeImageResourceArray(uiIngameImage);
            removeImageResourceArray(uiUpperImage);
            removeImageResourceArray(uiCharUpFaceImage);
            removeImageResourceArray(uiMonsterEtcImage);
            removeImageResourceArray(uiMonsterFaceImage);
            removeImageResourceArray(uiMonsterNameImage);
            removeImageResourceArray(uiThemeclearImage);
            dollarImage.dealloc();
            heroismImage.dealloc();
            removeImageResourceArray(titleImage);
            removeImageResourceArray(titleBossImage);
            removeImageResourceArray(mainmenuImage);
            removeImageResourceArray(uiEtcImage);
            removeImageResourceArray(uiHelpImage);
            removeImageResourceArray(uiHelpShotImage);
            removeImageResourceArray(uiRecordImage);
            removeImageResourceArray(uiShopImage);
            removeImageResourceArray(uiStageImage);
            removeImageResourceArray(uiStageBossImage);
            removeImageResourceArray(uiUpgradeImage);
            removeImageResourceArray(uiUpheroImage);
            removeImageResourceArray(uiUpitemImage);
            removeImageResourceArray(uiUpunitImage);
            removeImageResourceArray(uiAwardImage);
            removeImageResourceArray(numberHeroismImage);
            removeImageResourceArray(numberStagePointImage);
            testboxImage.dealloc();
            testboxImage2.dealloc();
            for (int i2 = 0; i2 < 6; i2++) {
                GameThread.GAME_LOADING_PART_STATUS[i2] = 0;
            }
        }
        return true;
    }

    public static boolean load_GAME_MENU_IMAGE_LOAD(int i) {
        if (i == 1) {
            removeImageResourceArray(specialSwordImage);
            removeImageResourceArray(specialArrowImage);
            removeImageResourceArray(specialIceImage);
            removeImageResourceArray(tutorialImage);
            removeImageResourceArray(uiButtonImage);
            removeImageResourceArray(gatefireImage);
            removeImageResourceArray(stageClearImage);
            removeImageResourceArray(uiStageImage);
            removeImageResourceArray(uiStageBossImage);
            removeImageResourceArray(uiThemeclearImage);
        } else if (i == 2) {
            dollarImage.initWithImageName(R.drawable.etc_dollar);
            heroismImage.initWithImageName(R.drawable.etc_heroism);
            loadImageResourceToTexture(titleImage, titleResource);
        } else if (i == 3) {
            int random = GameThread.getRandom(5);
            if (random == 0) {
                GAME_TITLE_BOSS_VIEW_POS = GAME_TITLE_BOSS_VIEW_POS_LIST[0];
                loadImageResourceToTexture(titleBossImage, titleBoss0Resource);
            } else if (random == 1) {
                GAME_TITLE_BOSS_VIEW_POS = GAME_TITLE_BOSS_VIEW_POS_LIST[1];
                loadImageResourceToTexture(titleBossImage, titleBoss1Resource);
            } else if (random == 2) {
                GAME_TITLE_BOSS_VIEW_POS = GAME_TITLE_BOSS_VIEW_POS_LIST[2];
                loadImageResourceToTexture(titleBossImage, titleBoss2Resource);
            } else if (random == 3) {
                GAME_TITLE_BOSS_VIEW_POS = GAME_TITLE_BOSS_VIEW_POS_LIST[3];
                loadImageResourceToTexture(titleBossImage, titleBoss3Resource);
            } else if (random == 4) {
                GAME_TITLE_BOSS_VIEW_POS = GAME_TITLE_BOSS_VIEW_POS_LIST[4];
                loadImageResourceToTexture(titleBossImage, titleBoss4Resource);
            }
            GameThread.GAME_LOADING_PART_STATUS[3] = 1;
        } else if (i == 4) {
            loadImageResourceToTexture(mainmenuImage, mainmenuResource);
        } else if (i == 6) {
            loadImageResourceToTexture(uiEtcImage, uiEtcResource);
            loadImageResourceToTexture(uiHelpImage, uiHelpResource);
        } else if (i == 9) {
            loadImageResourceToTexture(numberHeroismImage, numberHeroismResource);
            loadImageResourceToTexture(numberUpgradeImage, numberUpgradeResource);
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean load_GAME_PLAY_IMAGE_LOAD(int i) {
        Log.d("LOAD IMAGE", "CHECK COUNT " + i);
        if (i == 1) {
            dollarImage.dealloc();
            heroismImage.dealloc();
            removeImageResourceArray(titleImage);
            removeImageResourceArray(titleBossImage);
            removeImageResourceArray(mainmenuImage);
            removeImageResourceArray(uiEtcImage);
            removeImageResourceArray(uiHelpImage);
            removeImageResourceArray(uiHelpShotImage);
            removeImageResourceArray(uiRecordImage);
            removeImageResourceArray(uiShopImage);
            removeImageResourceArray(uiStageBossImage);
            removeImageResourceArray(uiUpgradeImage);
            removeImageResourceArray(uiUpheroImage);
            removeImageResourceArray(uiUpitemImage);
            removeImageResourceArray(uiUpunitImage);
            removeImageResourceArray(uiAwardImage);
            removeImageResourceArray(numberHeroismImage);
            removeImageResourceArray(numberUpgradeImage);
            GameThread.GAME_LOADING_PART_STATUS[0] = 0;
            GameThread.GAME_LOADING_PART_STATUS[1] = 0;
            GameThread.GAME_LOADING_PART_STATUS[2] = 0;
            GameThread.GAME_LOADING_PART_STATUS[3] = 0;
            GameThread.GAME_LOADING_PART_STATUS[4] = 0;
            GameThread.GAME_LOADING_PART_STATUS[5] = 0;
        } else {
            switch (i) {
                case 13:
                    loadImageResourceToTexture(tutorialImage, tutorialResource);
                    loadImageResourceToTexture(uiButtonImage, uiButtonResource);
                    loadImageResourceToTexture(gatefireImage, gatefireResource);
                    break;
                case 14:
                    loadImageResourceToTexture(stageClearImage, stageClearResource);
                    break;
                case 15:
                    loadImageResourceToTexture(uiStageImage, uiStageResource);
                    break;
                case 16:
                    loadImageResourceToTexture(uiThemeclearImage, uiThemeclearResource);
                    break;
            }
        }
        return true;
    }

    public void drawPlayingUi(boolean z, boolean z2) {
        TouchManager.clearTouchMap();
        TouchManager.addTouchRectListData(11, CGRectMake(0.0f, 437.0f, 43.0f, 39.0f));
        TouchManager.addTouchRectListData(12, CGRectMake(0.0f, 344.0f, 43.0f, 39.0f));
        TouchManager.addTouchRectListData(13, CGRectMake(0.0f, 393.0f, 43.0f, 39.0f));
        int i = GameThread.characterMenuSelectFlag;
        if (i == 0) {
            TouchManager.addTouchRectListData(7, CGRectMake(742.0f, 12.0f, 56.0f, 56.0f));
        } else if (i == 3) {
            int i2 = GameThread.SPECIAL_ATTACK_ARROW_LEG_POS_Y;
            for (int i3 = 0; i3 < 3; i3++) {
                if (GameThread.heroUnitType[i3] == -1) {
                    i2 += 60;
                }
            }
            for (int i4 = 0; i4 < 3; i4++) {
                if (GameThread.heroUnitType[i4] != -1) {
                    if (GameThread.checkEnableHeroBuyUnit(i4)) {
                        TouchManager.addTouchRectListData(i4 + 8, CGRectMake(i2, 12.0f, 56.0f, 56.0f));
                    }
                    i2 += 60;
                }
            }
        }
        TouchManager.addTouchRectListData(0, CGRectMake(742.0f, 77.0f, 56.0f, 56.0f));
        TouchManager.addTouchRectListData(1, CGRectMake(742.0f, 142.0f, 56.0f, 56.0f));
        TouchManager.addTouchRectListData(2, CGRectMake(742.0f, 207.0f, 56.0f, 56.0f));
        TouchManager.addTouchRectListData(3, CGRectMake(742.0f, 272.0f, 56.0f, 56.0f));
        TouchManager.addTouchRectListData(4, CGRectMake(742.0f, 337.0f, 56.0f, 56.0f));
        TouchManager.addTouchRectListData(5, CGRectMake(742.0f, 402.0f, 56.0f, 56.0f));
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 14;
        uiUpperImage[7].drawAtPointOption(0.0f, 0.0f, 18);
        uiUpperImage[1].drawAtPointOption(9.0f, 4.0f, 18);
        uiUpperImage[0].drawAtPointOption(126.0f, 5.0f, 18);
        uiUpperImage[8].drawAtPointOption(298.0f, 6.0f, 18);
        int i5 = GameThread.turboFlag;
        if (i5 == 1) {
            uiUpperImage[14].drawAtPointOption(22.0f, 398.0f, 18);
            uiUpperImage[14].drawAtPointOption(16.0f, 398.0f, 18);
            uiUpperImage[4].drawAtPointOption(1.0f, 391.0f, 18);
        } else if (i5 == 3) {
            uiUpperImage[6].drawAtPointOption(DRAW_SCALE_X_SMALL_DEGREE, 391.0f, 18);
            uiUpperImage[5].drawAtPointOption(7.0f, 391.0f, 18);
            uiUpperImage[4].drawAtPointOption(1.0f, 391.0f, 18);
        }
        if (GameThread.gameStatus == 21) {
            uiUpperImage[3].drawAtPointOption(5.0f, 437.0f, 18);
        } else {
            uiUpperImage[2].drawAtPointOption(5.0f, 437.0f, 18);
        }
        if (GameThread.myWaveRunFlag) {
            uiUpperImage[15].drawAtPointOption(6.0f, 344.0f, 18);
        } else {
            uiUpperImage[16].drawAtPointOption(6.0f, 344.0f, 18);
        }
        drawNumberBlock(GameThread.myMoney, numberMoneyImage, 96.0f, 6.0f, 1, 20, 1);
        drawNumberBlock(GameThread.myMana, numberManaImage, 213.0f, 6.0f, 1, 20, 1);
        int i6 = GameThread.myWave;
        int i7 = GameThread.mapAttackType;
        if ((i7 == 0 || i7 == 2) && i6 >= DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[GameThread.mapNumber]) {
            i6 = DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[GameThread.mapNumber] - 1;
        }
        float drawNumberBlock = drawNumberBlock(i6 + 1, numberWaveImage, 366.0f, 8.0f, 1, 18, 2);
        numberWaveImage[10].drawAtPointOption(2.0f + drawNumberBlock, 6.0f, 18);
        if (GameThread.mapAttackType == 1) {
            numberWaveImage[11].drawAtPointOption(drawNumberBlock + 10.0f, 6.0f, 18);
        } else {
            drawNumberBlock(DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[GameThread.mapNumber], numberWaveImage, drawNumberBlock + 10.0f, 8.0f, 1, 18, 2);
        }
        drawMyLife();
        uiButtonImage[((GameThread.characterMenuSelectFlag == 3 || GameThread.characterMenuSelectFlag == 4 || GameThread.characterMenuSelectFlag == 6 || !GameThread.checkEnableBuyUnit(0)) ? 9 : 0) + 0].drawAtPointOption(GameThread.myOscillator[0].getCurrentPosition() + 770, 77.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(0), numberUnitBuyImage, GameThread.myOscillator[0].getCurrentPosition() + 770, 114.0f, -2, 17, 1);
        uiButtonImage[((GameThread.characterMenuSelectFlag == 3 || GameThread.characterMenuSelectFlag == 4 || GameThread.characterMenuSelectFlag == 6 || !GameThread.checkEnableBuyUnit(3)) ? 9 : 0) + 1].drawAtPointOption(GameThread.myOscillator[1].getCurrentPosition() + 770, 142.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(3), numberUnitBuyImage, GameThread.myOscillator[1].getCurrentPosition() + 770, 179.0f, -2, 17, 1);
        uiButtonImage[((GameThread.characterMenuSelectFlag == 3 || GameThread.characterMenuSelectFlag == 4 || GameThread.characterMenuSelectFlag == 6 || !GameThread.checkEnableBuyUnit(12)) ? 9 : 0) + 2].drawAtPointOption(GameThread.myOscillator[2].getCurrentPosition() + 770, 207.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(12), numberUnitBuyImage, GameThread.myOscillator[2].getCurrentPosition() + 770, 244.0f, -2, 17, 1);
        uiButtonImage[((GameThread.characterMenuSelectFlag == 3 || GameThread.characterMenuSelectFlag == 4 || GameThread.characterMenuSelectFlag == 6 || !GameThread.checkEnableBuyUnit(15)) ? 9 : 0) + 3].drawAtPointOption(GameThread.myOscillator[3].getCurrentPosition() + 770, 272.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(15), numberUnitBuyImage, GameThread.myOscillator[3].getCurrentPosition() + 770, 309.0f, -2, 17, 1);
        uiButtonImage[((GameThread.characterMenuSelectFlag == 3 || GameThread.characterMenuSelectFlag == 4 || GameThread.characterMenuSelectFlag == 6 || !GameThread.checkEnableBuyUnit(24)) ? 9 : 0) + 4].drawAtPointOption(GameThread.myOscillator[4].getCurrentPosition() + 770, 337.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(24), numberUnitBuyImage, GameThread.myOscillator[4].getCurrentPosition() + 770, 374.0f, -2, 17, 1);
        uiButtonImage[((GameThread.characterMenuSelectFlag == 3 || GameThread.characterMenuSelectFlag == 4 || GameThread.characterMenuSelectFlag == 6 || !GameThread.checkEnableBuyUnit(27)) ? 9 : 0) + 5].drawAtPointOption(GameThread.myOscillator[5].getCurrentPosition() + 770, 402.0f, 17);
        drawNumberBlock(GameThread.getBuyPrice(27), numberUnitBuyImage, GameThread.myOscillator[5].getCurrentPosition() + 770, 439.0f, -2, 17, 1);
        if (GameThread.characterMenuSelectFlag == 3 && GameThread.myOscillator[8].OscCurrentCount < 10) {
            float f = GameThread.myOscillator[8].OscCurrentCount * 0.1f;
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
                int heroBuyPrice = GameThread.getHeroBuyPrice(i10);
                int i11 = GameThread.heroUnitType[i10];
                int i12 = i10 + 8;
                uiButtonImage[(i11 != 0 ? i11 != 5 ? i11 != 10 ? 0 : 8 : 7 : 6) + (GameThread.checkEnableHeroBuyUnit(i10) ? 0 : 9)].drawAtPointOption(GameThread.myOscillator[i12].getCurrentPosition() + i8, 12.0f, 17);
                drawNumberBlock(heroBuyPrice, numberHeroBuyImage, i8 + 5 + GameThread.myOscillator[i12].getCurrentPosition(), 49.0f, -2, 17, 1);
                uiUpperImage[13].drawAtPointOption((i8 - 17) + GameThread.myOscillator[i12].getCurrentPosition(), 49.0f, 17);
                i8 += 60;
            }
        }
        if (GameThread.characterMenuSelectFlag == 3 && GameThread.myOscillator[8].OscCurrentCount < 10) {
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        uiButtonImage[18].drawAtPointOption(770.0f, 12.0f, 17);
        int i13 = GameThread.characterMenuSelectFlag;
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
            int upgradeType = GameThread.getUpgradeType(i14);
            if (upgradeType != -1) {
                int upgradePrice = GameThread.getUpgradePrice(i14, GameThread.towerUnit[GameThread.characterSelectNumber].heroFlag);
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
                GameThread.restatTowerUnit(GameThread.compareTowerUnit);
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
                GameThread.restatTowerUnit(GameThread.compareTowerUnit);
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
        if (z2) {
            TouchManager.swapTouchMap();
        }
    }

    public static int getTowerImageOrder(int i, int i2) {
        if (i == -1) {
            return 0;
        }
        if (i2 == 1) {
            int i3 = DataHero.heroData[i][13];
            if (i3 != 1) {
                return i3 != 2 ? 12 : 14;
            }
            return 13;
        }
        switch (DataCharacter.charData[i][12]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            default:
                return 0;
        }
    }

    public static int getTowerLevelOrder(int i, int i2) {
        if (i2 == 1) {
            return i % GameThread.TOWER_MAX_LEVEL_HERO;
        }
        return i % GameThread.TOWER_MAX_LEVEL_NORMAL;
    }

    public static int getTowerMaxLevel(int i) {
        if (i == 1) {
            return GameThread.TOWER_MAX_LEVEL_HERO;
        }
        return GameThread.TOWER_MAX_LEVEL_NORMAL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x00aa, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00a8, code lost:
    
        if (com.sncompany.newtower.GameThread.myMana < r13) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        if (com.sncompany.newtower.GameThread.myMoney < r13) goto L33;
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
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = GameThread.characterSelectNumber;
        int i18 = GameThread.towerUnit[i17].towerType;
        if (i17 < 0 || i18 < 0) {
            return;
        }
        int towerImageOrder = getTowerImageOrder(i18, GameThread.towerUnit[i17].heroFlag);
        if (GameThread.towerUnit[i17].heroFlag == 0) {
            i4 = GameThread.getUpgradeType(i18);
            if (i4 != -1) {
                i15 = getTowerImageOrder(i4, 0);
                i16 = getTowerBoxImageOrder(i4);
            } else {
                i15 = -1;
                i16 = -1;
            }
            int downgradeType = GameThread.getDowngradeType(i18);
            int towerImageOrder2 = downgradeType != -1 ? getTowerImageOrder(downgradeType, 0) : -1;
            int buyPrice = GameThread.getBuyPrice(i18);
            int sellPrice = GameThread.getSellPrice(i18);
            int upgradePrice = GameThread.getUpgradePrice(i18, GameThread.towerUnit[i17].heroFlag);
            i3 = GameThread.getLevelupPrice(i18);
            i9 = upgradePrice;
            i8 = sellPrice;
            i2 = buyPrice;
            i7 = towerImageOrder2;
            i6 = i16;
            i5 = i15;
            i = 0;
        } else {
            int heroBuyPrice = GameThread.getHeroBuyPrice(GameThread.towerUnit[i17].heroOrder);
            int levelupHeroPrice = GameThread.getLevelupHeroPrice(i18, GameThread.towerUnit[i17].heroOrder);
            i = GameThread.towerUnit[i17].specialType;
            i2 = heroBuyPrice;
            i3 = levelupHeroPrice;
            i4 = -1;
            i5 = -1;
            i6 = -1;
            i7 = -1;
            i8 = 0;
            i9 = 0;
        }
        int towerLevelOrder = getTowerLevelOrder(i18, GameThread.towerUnit[i17].heroFlag);
        if (GameThread.towerUnit[i17].heroFlag == 0) {
            z = GameThread.myMoney < i9;
        } else {
            z = GameThread.myMana < i9;
        }
        if (towerImageOrder != -1) {
            if (uiCharFaceImage[towerImageOrder].name == -1) {
                uiCharFaceImage[towerImageOrder].initWithImageName(uiCharFaceResource[towerImageOrder]);
            }
            if (uiCharNameImage[towerImageOrder].name == -1) {
                uiCharNameImage[towerImageOrder].initWithImageName(uiCharNameResource[towerImageOrder]);
            }
        }
        int i19 = -1;
        if (i7 != -1) {
            if (uiCharFaceImage[i7].name == -1) {
                uiCharFaceImage[i7].initWithImageName(uiCharFaceResource[i7]);
            }
            if (uiCharNameImage[i7].name == -1) {
                uiCharNameImage[i7].initWithImageName(uiCharNameResource[i7]);
            }
            i19 = -1;
        }
        if (i6 != i19 && uiCharUpFaceImage[i6].name == i19) {
            uiCharUpFaceImage[i6].initWithImageName(uiCharUpFaceResource[i6]);
            i19 = -1;
        }
        if (i5 != i19 && uiCharNameImage[i5].name == i19) {
            uiCharNameImage[i5].initWithImageName(uiCharNameResource[i5]);
        }
        TouchManager.clearTouchMap();
        int i20 = i3;
        int i21 = i9;
        Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
        Texture2D.gl.glColor4f(0.2f, 0.2f, 0.2f, 0.2f);
        fillBlackImage.fillRect(0.0f, 0.0f, SCRWIDTH, 343.0f);
        Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        uiCharEtcImage[0].drawAtPointOption(0.0f, 343.0f, 18);
        int i22 = upgradeCount;
        if (i22 > 0) {
            if (i22 > 5) {
                if (i7 != -1) {
                    uiCharFaceImage[i7].drawAtPointOption(0 - ((10 - i22) * 80), SCRHEIGHT_SMALL, 34);
                    uiCharNameImage[i7].drawAtPointOptionHorizonSize(287.0f, 321.0f, 10, (upgradeCount - 5) * 0.2f);
                }
            } else if (towerImageOrder != -1) {
                uiCharFaceImage[towerImageOrder].drawAtPointOption((-i22) * 80, SCRHEIGHT_SMALL, 34);
                uiCharNameImage[towerImageOrder].drawAtPointOptionHorizonSize(287.0f, 321.0f, 10, (5 - upgradeCount) * 0.2f);
            }
            i10 = 18;
        } else {
            uiCharFaceImage[towerImageOrder].drawAtPointOption(0.0f, SCRHEIGHT_SMALL, 34);
            i10 = 18;
            uiCharNameImage[towerImageOrder].drawAtPointOption(287.0f, 305.0f, 18);
        }
        if (GameThread.towerUnit[i17].heroFlag == 1) {
            uiCharEtcImage[8].drawAtPointOption(287.0f, 288.0f, i10);
        }
        uiCharEtcImage[12].drawAtPointOption(278.0f, 356.0f, i10);
        uiCharEtcImage[1].drawAtPointOption(288.0f, 359.0f, i10);
        uiCharEtcImage[2].drawAtPointOption(486.0f, 314.0f, i10);
        uiCharEtcImage[towerLevelOrder + 3].drawAtPointOption(519.0f, 314.0f, i10);
        setFontSize(14);
        setFontColor(-8128317);
        drawStringM(String.valueOf(GameThread.towerUnit[i17].getHitPower()), 420.0f, 360.0f, 20);
        if (GameThread.towerUnit[i17].towerCoolTimeMax == 1) {
            drawStringM("MAX", 420.0f, 388.0f, 20);
        } else {
            drawStringM(String.valueOf(GameThread.getAttackSpeed(GameThread.towerUnit[i17].towerCoolTimeMax)), 420.0f, 388.0f, 20);
        }
        drawStringM(String.valueOf(GameThread.towerUnit[i17].attackRange), 420.0f, 416.0f, 20);
        drawStringM(getEffectTypeString(GameThread.towerUnit[i17].effectType), 420.0f, 442.0f, 20);
        int i23 = GameThread.characterMenuSelectFlag;
        if (i23 != 2) {
            if (i23 == 5 || i23 == 6) {
                TouchManager.addTouchRectListData(17, CGRectMake(670.0f, 350.0f, 115.0f, 115.0f));
                TouchManager.addTouchRectListData(19, CGRectMake(0.0f, 343.0f, SCRWIDTH, 137.0f));
                TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 20;
                int checkTouchListStatus = TouchManager.checkTouchListStatus();
                if (GameThread.towerUnit[i17].heroFlag != 1) {
                    i13 = 18;
                } else if (i == 0) {
                    i13 = 18;
                    uiCharEtcImage[9].drawAtPointOption(440.0f, 400.0f, 18);
                } else if (i == 1) {
                    i13 = 18;
                    uiCharEtcImage[10].drawAtPointOption(440.0f, 400.0f, 18);
                } else {
                    if (i != 2) {
                        i14 = 17;
                        i13 = 18;
                        if (checkTouchListStatus != i14) {
                            setFontColor(-1);
                            uiCharButtonImage[5].drawAtPointOption(670.0f, 350.0f, i13);
                            if (GameThread.towerUnit[i17].heroFlag == 1) {
                                uiUpperImage[0].drawAtPointOption(696.0f, 428.0f, i13);
                            } else {
                                uiUpperImage[1].drawAtPointOption(696.0f, 427.0f, i13);
                            }
                            drawStringM(String.valueOf(i2), 755.0f, 430.0f, 20);
                            return;
                        }
                        setFontColor(-1);
                        uiCharButtonImage[4].drawAtPointOption(670.0f, 350.0f, i13);
                        if (GameThread.towerUnit[i17].heroFlag == 1) {
                            uiUpperImage[0].drawAtPointOption(696.0f, 428.0f, i13);
                        } else {
                            uiUpperImage[1].drawAtPointOption(696.0f, 427.0f, i13);
                        }
                        drawStringM(String.valueOf(i2), 755.0f, 430.0f, 20);
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
        if (GameThread.towerUnit[i17].heroFlag == 0) {
            TouchManager.addTouchRectListData(14, CGRectMake(15.0f, 390.0f, 75.0f, 75.0f));
        }
        if (i4 != -1 && !z) {
            TouchManager.addTouchRectListData(15, CGRectMake(435.0f, 350.0f, 235.0f, 115.0f));
        }
        if (towerLevelOrder < getTowerMaxLevel(GameThread.towerUnit[i17].heroFlag) - 1 && !z2) {
            TouchManager.addTouchRectListData(16, CGRectMake(670.0f, 350.0f, 115.0f, 115.0f));
        }
        if (GameThread.towerUnit[i17].heroFlag == 1 && GameThread.rewardDataValue[3] == 1 && GameThread.towerUnit[i17].specialCooltime <= 0 && GameThread.myMana >= GameThread.towerUnit[i17].specialMana) {
            TouchManager.addTouchRectListData(18, CGRectMake(625.0f, 272.0f, 160.0f, 69.0f));
        }
        if (GameThread.cheatData[4]) {
            TouchManager.addTouchRectListData(18, CGRectMake(625.0f, 272.0f, 160.0f, 69.0f));
        }
        TouchManager.addTouchRectListData(19, CGRectMake(0.0f, 343.0f, SCRWIDTH, 137.0f));
        TouchManager.touchListCheckCount[TouchManager.touchSettingSlot] = 20;
        int checkTouchListStatus2 = TouchManager.checkTouchListStatus();
        if (GameThread.towerUnit[i17].heroFlag == 0) {
            if (checkTouchListStatus2 == 14) {
                uiCharButtonImage[7].drawAtPointOption(15.0f, 390.0f, 18);
            } else {
                uiCharButtonImage[6].drawAtPointOption(15.0f, 390.0f, 18);
            }
            i11 = -1;
            setFontColor(-1);
            drawStringM(String.valueOf(i8), 80.0f, 430.0f, 20);
        } else {
            i11 = -1;
        }
        if (i4 != i11) {
            if (checkTouchListStatus2 == 15) {
                i12 = 18;
                uiCharButtonImage[1].drawAtPointOption(435.0f, 350.0f, 18);
            } else {
                i12 = 18;
                uiCharButtonImage[0].drawAtPointOption(435.0f, 350.0f, 18);
            }
            uiCharUpFaceImage[i6].drawAtPointOption(514.0f, 364.0f, i12);
            uiCharNameImage[i5].drawAtPointOptionSize(653.0f, 449.0f, 36, 0.4f);
            drawStringM(String.valueOf(i21), 503.0f, 421.0f, 20);
            if (z) {
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
        if (towerLevelOrder < getTowerMaxLevel(GameThread.towerUnit[i17].heroFlag) - 1) {
            if (GameThread.towerUnit[i17].heroFlag == 1) {
                if (checkTouchListStatus2 == 16) {
                    uiCharButtonImage[15].drawAtPointOption(670.0f, 350.0f, 18);
                } else {
                    uiCharButtonImage[14].drawAtPointOption(670.0f, 350.0f, 18);
                }
            } else if (checkTouchListStatus2 == 16) {
                uiCharButtonImage[3].drawAtPointOption(670.0f, 350.0f, 18);
            } else {
                uiCharButtonImage[2].drawAtPointOption(670.0f, 350.0f, 18);
                if (checkTouchListStatus2 != 16) {
                    int i25 = towerLevelOrder * 2;
                    uiCharButtonImage[i25 + 17].drawAtPointOption(708.0f, 401.0f, 17);
                    uiCharButtonImage[i25 + 19].drawAtPointOption(764.0f, 401.0f, 17);
                } else {
                    int i26 = towerLevelOrder * 2;
                    uiCharButtonImage[i26 + 16].drawAtPointOption(708.0f, 401.0f, 17);
                    uiCharButtonImage[i26 + 18].drawAtPointOption(764.0f, 401.0f, 17);
                }
                drawStringM(String.valueOf(i20), 756.0f, 423.0f, 20);
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
            if (checkTouchListStatus2 != 16) {
            }
            drawStringM(String.valueOf(i20), 756.0f, 423.0f, 20);
            if (z2) {
            }
            if (levelUpCount > 0) {
            }
        }
        if (GameThread.towerUnit[i17].heroFlag == 1 && GameThread.rewardDataValue[3] == 1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        if (checkTouchListStatus2 == 18) {
                            uiCharButtonImage[13].drawAtPointOption(625.0f, 272.0f, 18);
                        } else {
                            uiCharButtonImage[12].drawAtPointOption(625.0f, 272.0f, 18);
                        }
                    }
                } else if (checkTouchListStatus2 == 18) {
                    uiCharButtonImage[11].drawAtPointOption(625.0f, 272.0f, 18);
                } else {
                    uiCharButtonImage[10].drawAtPointOption(625.0f, 272.0f, 18);
                }
            } else if (checkTouchListStatus2 == 18) {
                uiCharButtonImage[9].drawAtPointOption(625.0f, 272.0f, 18);
            } else {
                uiCharButtonImage[8].drawAtPointOption(625.0f, 272.0f, 18);
            }
            if (GameThread.towerUnit[i17].specialCooltime > 0 || GameThread.myMana < GameThread.towerUnit[i17].specialMana) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
                fillBlackImage.fillRect(631.0f, 278.0f, (GameThread.towerUnit[i17].specialCooltime * 148) / GameThread.towerUnit[i17].specialMaxCooltime, 57.0f);
                Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
            drawStringM(String.valueOf(GameThread.towerUnit[i17].specialMana), 730.0f, 318.0f, 20);
        }
    }

    public static String getEffectTypeString(int i) {
        if (i == -1 || i > 9) {
            return effectTypeString[9];
        }
        return effectTypeString[i];
    }

    public static void drawInvenItemDescription(float f, float f2, int i) {
        setFontSize(17);
        drawFont.getTextBounds(DataUpgradeItem.upgradeItemName[i], 0, DataUpgradeItem.upgradeItemName[i].length(), Texture2D.bounds_);
        int i2 = Texture2D.bounds_.right - Texture2D.bounds_.left;
        setFontSize(12);
        String format = String.format("%d", Integer.valueOf((DataUpgradeItem.upgradeItemData[i][4] * 50) / 100));
        drawFont.getTextBounds(format, 0, format.length(), Texture2D.bounds_);
        int i3 = Texture2D.bounds_.right - Texture2D.bounds_.left;
        setFontSize(14);
        int i4 = DataUpgradeItem.upgradeItemData[i][2];
        String format2 = String.format(DataUpgradeItem.upgradeItemDescription[i], Integer.valueOf(i4));
        drawFont.getTextBounds(format2, 0, format2.length(), Texture2D.bounds_);
        int i5 = i2 + i3 + 65;
        int i6 = (Texture2D.bounds_.right - Texture2D.bounds_.left) + 28;
        if (i5 < i6) {
            i5 = i6;
        }
        float f3 = i5 / 2;
        float f4 = f - f3;
        float f5 = f2 - 73.0f;
        drawLeftRightBox(testboxImage, testboxCoord, f4, f5, i5, 0);
        setFontColor(-68096);
        setFontSize(17);
        drawStringM(DataUpgradeItem.upgradeItemName[i], f4 + 14.0f, f5 + 14.0f, 18);
        setFontSize(14);
        drawStringM(String.format(DataUpgradeItem.upgradeItemDescription[i], Integer.valueOf(i4)), f4 + f3, f5 + 34.0f, 17);
        setFontColor(-1);
        setFontSize(12);
        int i7 = DataUpgradeItem.upgradeItemData[i][3];
        if (i7 == 0) {
            float f6 = f4 + i5;
            dollarImage.drawAtPointOption(((f6 - i3) - 40.0f) + 1.0f, f5 + 12.0f + 1.0f, 18);
            drawStringM(String.format("%d", Integer.valueOf(DataUpgradeItem.upgradeItemData[i][4])), f6 - 17.0f, f5 + 18.0f, 20);
        } else {
            if (i7 != 1) {
                return;
            }
            float f7 = f4 + i5;
            heroismImage.drawAtPointOption((f7 - i3) - 40.0f, f5 + 12.0f, 18);
            drawStringM(String.format("%d", Integer.valueOf((DataUpgradeItem.upgradeItemData[i][4] * 50) / 100)), f7 - 17.0f, f5 + 18.0f, 20);
        }
    }

    public static void drawSelectRedBox(float f, float f2) {
        uiUpgradeImage[16].drawAtPointOption(f - 11.0f, (-11.0f) + f2, 18);
        float f3 = (-2.0f) + f;
        float f4 = (-49.0f) + f2;
        float f5 = f - 2.0f;
        uiUpgradeImage[17].drawAtPointOptionGuide(f3, (GameThread.gameTimeCount % 109) + f4, 18, CGRectMake(f5, f2 - 2.0f, 64.0f, 2.0f));
        uiUpgradeImage[17].drawAtPointOptionGuide(f3, (GameThread.gameTimeCount % 109) + f4, 18, CGRectMake(f5, f2 + 60.0f, 64.0f, 2.0f));
        uiUpgradeImage[17].drawAtPointOptionGuide(f3, (GameThread.gameTimeCount % 109) + f4, 18, CGRectMake(f5, f2, 2.0f, 60.0f));
        uiUpgradeImage[17].drawAtPointOptionGuide(f3, f4 + (GameThread.gameTimeCount % 109), 18, CGRectMake(f + 60.0f, f2, 2.0f, 60.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        if (r14 != 34) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static float drawNumberBlock(int i, Texture2D[] texture2DArr, float f, float f2, int i2, int i3, int i4) {
        int i5;
        int i6;
        float f3 = 1.0f;
        for (int i7 = 0; i7 < 10; i7++) {
            float f4 = texture2DArr[i7]._sizeY;
            if (f4 > f3) {
                f3 = f4;
            }
        }
        int i8 = i < 0 ? -i : i;
        if (i8 == 0) {
            i6 = (int) (0 + texture2DArr[0]._sizeX + i2);
            i5 = 1;
        } else {
            i5 = 0;
            int i9 = 0;
            while (i > 0) {
                i9 = (int) (i9 + texture2DArr[i % 10]._sizeX);
                i /= 10;
                i5++;
            }
            i6 = ((i5 - 1) * i2) + i9;
        }
        if (i5 < i4) {
            for (int i10 = i5; i10 < i4; i10++) {
                i6 = (int) (i6 + texture2DArr[0]._sizeX);
            }
            i6 += (i4 - i5) * i2;
        } else {
            i4 = i5;
        }
        if (i3 == 9 || i3 == 10 || i3 == 12) {
            f2 -= f3 / 2.0f;
        } else if (i3 == 36 || i3 == 33 || i3 == 34) {
            f2 -= f3;
        }
        if (i3 != 9) {
            if (i3 != 10) {
                if (i3 != 17) {
                    if (i3 != 18) {
                        if (i3 != 33) {
                        }
                    }
                }
            }
            f += i6;
            float f5 = f;
            for (int i11 = 0; i11 < i4; i11++) {
                int i12 = i8 % 10;
                texture2DArr[i12].drawAtPointOption(f5, f2 + f3, 36);
                f5 -= texture2DArr[i12]._sizeX + i2;
                if (i8 > 0) {
                    i8 /= 10;
                }
            }
            return f;
        }
        i6 /= 2;
        f += i6;
        float f52 = f;
        while (i11 < i4) {
        }
        return f;
    }

    public static void drawStringM(String str, float f, float f2, int i) {
        Tombstone tombstone = textTombstone;
        int i2 = fontColor;
        int searchTombstone = tombstone.searchTombstone(str, i2, i2, fontSize);
        if (searchTombstone != -1) {
            drawStringBuffer = textTombstone.getTombstone(searchTombstone);
        } else {
            textTombstone.setTombstone(str);
            Tombstone tombstone2 = textTombstone;
            int i3 = fontColor;
            int searchTombstone2 = tombstone2.searchTombstone(str, i3, i3, fontSize);
            if (searchTombstone2 == -1) {
                return;
            } else {
                drawStringBuffer = textTombstone.getTombstone(searchTombstone2);
            }
        }
        drawStringBuffer.drawAtPointOption(f, f2, i);
    }

    static void drawStringGuideM(String str, float f, float f2, int i, CGRect cGRect) {
        Tombstone tombstone = textTombstone;
        int i2 = fontColor;
        int searchTombstone = tombstone.searchTombstone(str, i2, i2, fontSize);
        if (searchTombstone != -1) {
            drawStringBuffer = textTombstone.getTombstone(searchTombstone);
        } else {
            textTombstone.setTombstone(str);
            Tombstone tombstone2 = textTombstone;
            int i3 = fontColor;
            int searchTombstone2 = tombstone2.searchTombstone(str, i3, i3, fontSize);
            if (searchTombstone2 == -1) {
                return;
            } else {
                drawStringBuffer = textTombstone.getTombstone(searchTombstone2);
            }
        }
        drawStringBuffer.drawAtPointOptionGuide(f, f2, i, cGRect);
    }

    public static void drawStringDoubleM(String str, float f, float f2, int i) {
        int searchTombstone = textTombstone.searchTombstone(str, fontColor, strokeColor, fontSize);
        if (searchTombstone != -1) {
            drawStringBuffer = textTombstone.getTombstone(searchTombstone);
        } else {
            textTombstone.setTombstone(str);
            int searchTombstone2 = textTombstone.searchTombstone(str, fontColor, strokeColor, fontSize);
            if (searchTombstone2 == -1) {
                return;
            } else {
                drawStringBuffer = textTombstone.getTombstone(searchTombstone2);
            }
        }
        drawStringBuffer.drawAtPointOption(f, f2, i);
    }

    public static void drawStringDoubleGuideM(String str, float f, float f2, int i, CGRect cGRect) {
        int searchTombstone = textTombstone.searchTombstone(str, fontColor, strokeColor, fontSize);
        if (searchTombstone != -1) {
            drawStringBuffer = textTombstone.getTombstone(searchTombstone);
        } else {
            textTombstone.setTombstone(str);
            int searchTombstone2 = textTombstone.searchTombstone(str, fontColor, strokeColor, fontSize);
            if (searchTombstone2 == -1) {
                return;
            } else {
                drawStringBuffer = textTombstone.getTombstone(searchTombstone2);
            }
        }
        drawStringBuffer.drawAtPointOptionGuide(f, f2, i, cGRect);
    }

    public static Texture2D[] makeTextureArray(int i) {
        Texture2D[] texture2DArr = new Texture2D[i];
        for (int i2 = 0; i2 < i; i2++) {
            texture2DArr[i2] = new Texture2D();
        }
        return texture2DArr;
    }

    public static void loadImageResourceToTexture(Texture2D[] texture2DArr, int[] iArr) {
        if (texture2DArr == null || iArr == null) {
            return;
        }
        for (int i = 0; i < texture2DArr.length && i < iArr.length; i++) {
            texture2DArr[i].initWithImageName(iArr[i]);
        }
    }

    public static Texture2D[] loadImageResourceArray(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        Texture2D[] texture2DArr = new Texture2D[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            texture2DArr[i] = new Texture2D(iArr[i]);
        }
        return texture2DArr;
    }

    public static void removeImageResourceArray(Texture2D[] texture2DArr) {
        if (texture2DArr == null) {
            return;
        }
        for (Texture2D texture2D : texture2DArr) {
            texture2D.dealloc();
        }
    }

    public static void drawLeftRightBox(Texture2D texture2D, int[][] iArr, float f, float f2, int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            }
            int i3 = i - iArr[1][2];
            int i4 = iArr[0][2];
            int i5 = i3 - iArr[0][2];
            texture2D.drawAtPointOptionClip(f + 0, f2, 18, CGRectMake(iArr[0][0], iArr[0][1], iArr[0][2], iArr[0][3]));
            texture2D.drawAtPointOptionClip(f + i3, f2, 18, CGRectMake(iArr[1][0], iArr[1][1], iArr[1][2], iArr[1][3]));
            texture2D.drawAtPointOptionClipPixel(f + i4, f2, 18, CGRectMake(iArr[2][0], iArr[2][1], iArr[2][2], iArr[2][3]), i5, iArr[2][3]);
            return;
        }
        int i6 = i - iArr[1][2];
        int i7 = (i - iArr[2][2]) / 2;
        int i8 = iArr[0][2];
        int i9 = i7 - iArr[0][2];
        int i10 = i7 + iArr[2][2];
        texture2D.drawAtPointOptionClip(f + 0, f2, 18, CGRectMake(iArr[0][0], iArr[0][1], iArr[0][2], iArr[0][3]));
        texture2D.drawAtPointOptionClip(f + i6, f2, 18, CGRectMake(iArr[1][0], iArr[1][1], iArr[1][2], iArr[1][3]));
        texture2D.drawAtPointOptionClip(f + i7, f2, 18, CGRectMake(iArr[2][0], iArr[2][1], iArr[2][2], iArr[2][3]));
        texture2D.drawAtPointOptionClipPixel(f + i8, f2, 18, CGRectMake(iArr[3][0], iArr[3][1], iArr[3][2], iArr[3][3]), i9, iArr[3][3]);
        texture2D.drawAtPointOptionClipPixel(f + i10, f2, 18, CGRectMake(iArr[3][0], iArr[3][1], iArr[3][2], iArr[3][3]), i6 - i10, iArr[3][3]);
    }

    public static void drawImageBox(Texture2D texture2D, int[][] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[0][2];
        int i6 = iArr[0][3];
        int i7 = i3 - iArr[1][2];
        int i8 = iArr[1][3];
        int i9 = iArr[2][2];
        int i10 = i4 - iArr[2][3];
        int i11 = i3 - iArr[3][2];
        int i12 = i4 - iArr[3][2];
        float f = i;
        float f2 = i2;
        texture2D.drawAtPointOptionClip(f, f2, 18, CGRectMake(iArr[0][0], iArr[0][1], iArr[0][2], iArr[0][3]));
        float f3 = i7 + i;
        texture2D.drawAtPointOptionClip(f3, f2, 18, CGRectMake(iArr[1][0], iArr[1][1], iArr[1][2], iArr[1][3]));
        float f4 = i2 + i10;
        texture2D.drawAtPointOptionClip(f, f4, 18, CGRectMake(iArr[2][0], iArr[2][1], iArr[2][2], iArr[2][3]));
        texture2D.drawAtPointOptionClip(i + i11, i2 + i12, 18, CGRectMake(iArr[3][0], iArr[3][1], iArr[3][2], iArr[3][3]));
        float f5 = i5 + i;
        texture2D.drawAtPointOptionClipPixel(f5, f2, 18, CGRectMake(iArr[4][0], iArr[4][1], iArr[4][2], iArr[4][3]), (i3 - iArr[0][2]) - iArr[1][2], iArr[4][3]);
        float f6 = i2 + i6;
        texture2D.drawAtPointOptionClipPixel(f, f6, 18, CGRectMake(iArr[5][0], iArr[5][1], iArr[5][2], iArr[5][3]), iArr[5][2], (i4 - iArr[0][3]) - iArr[2][3]);
        texture2D.drawAtPointOptionClipPixel(f3, i2 + i8, 18, CGRectMake(iArr[6][0], iArr[6][1], iArr[6][2], iArr[6][3]), iArr[6][2], (i4 - iArr[1][3]) - iArr[3][3]);
        texture2D.drawAtPointOptionClipPixel(i + i9, f4, 18, CGRectMake(iArr[7][0], iArr[7][1], iArr[7][2], iArr[7][3]), (i3 - iArr[2][2]) - iArr[3][2], iArr[7][3]);
        texture2D.drawAtPointOptionClipPixel(f5, f6, 18, CGRectMake(iArr[8][0], iArr[8][1], iArr[8][2], iArr[8][3]), (i3 - iArr[0][2]) - iArr[1][2], (i4 - iArr[0][3]) - iArr[2][3]);
    }

    public static void drawUpItemImage(int i, float f, float f2, int i2) {
        if (i2 == 9) {
            f -= 30.0f;
            f2 -= 30.0f;
        }
        uiUpitemImage[i].drawAtPointOption(f, f2, 18);
        if (DataUpgradeItem.upgradeItemData[i][0] != 0) {
            return;
        }
        setFontSize(11);
        setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
        drawStringDoubleM(String.format("%dP", Integer.valueOf(DataUpgradeItem.upgradeItemData[i][2])), f + 30.0f, f2 + 43.0f, 17);
    }

    public static void drawUpItemImageGuide(int i, float f, float f2, int i2, CGRect cGRect) {
        if (i < 0) {
            return;
        }
        if (i2 == 9) {
            f -= 30.0f;
            f2 -= 30.0f;
        }
        uiUpitemImage[i].drawAtPointOptionGuide(f, f2, 18, cGRect);
        if (DataUpgradeItem.upgradeItemData[i][0] != 0) {
            return;
        }
        setFontSize(11);
        setFontDoubleColor(-1, ViewCompat.MEASURED_STATE_MASK);
        drawStringDoubleGuideM(String.format("%dP", Integer.valueOf(DataUpgradeItem.upgradeItemData[i][2])), f + 30.0f, f2 + 43.0f, 17, cGRect);
    }

    public void drawAllTouchRect(GL10 gl10) {
        Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
        Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
        for (int i = 0; i < TouchManager.touchListCheckCount[TouchManager.touchCheckSlot]; i++) {
            if (TouchManager.touchListCheckData[TouchManager.touchCheckSlot][i].sizeWidth != 0.0f) {
                fillWhiteImage.fillRect(TouchManager.touchListCheckData[TouchManager.touchCheckSlot][i].originX, TouchManager.touchListCheckData[TouchManager.touchCheckSlot][i].originY, TouchManager.touchListCheckData[TouchManager.touchCheckSlot][i].sizeWidth, TouchManager.touchListCheckData[TouchManager.touchCheckSlot][i].sizeHeight);
            }
        }
        for (int i2 = 0; i2 < 8; i2++) {
            if (TouchManager.touchYesnookCheckData[TouchManager.touchCheckSlot][i2].sizeWidth != 0.0f) {
                fillWhiteImage.fillRect(TouchManager.touchYesnookCheckData[TouchManager.touchCheckSlot][i2].originX, TouchManager.touchYesnookCheckData[TouchManager.touchCheckSlot][i2].originY, TouchManager.touchYesnookCheckData[TouchManager.touchCheckSlot][i2].sizeWidth, TouchManager.touchYesnookCheckData[TouchManager.touchCheckSlot][i2].sizeHeight);
            }
        }
        Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public void drawGridRect(GL10 gl10) {
        Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
        Texture2D.gl.glColor4f(0.5f, 0.5f, 0.5f, 0.5f);
        for (int i = 0; i < 800; i += 10) {
            fillWhiteImage.fillRect(i, 0.0f, 1.0f, 480.0f);
        }
        for (int i2 = 0; i2 < 480; i2 += 10) {
            fillWhiteImage.fillRect(0.0f, i2, 800.0f, 1.0f);
        }
        Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public static void releaseResourcePartData(int i) {
        if (i == 0) {
            removeImageResourceArray(uiHelpImage);
            removeImageResourceArray(uiHelpShotImage);
            return;
        }
        if (i == 1) {
            removeImageResourceArray(uiAwardImage);
            removeImageResourceArray(uiRecordImage);
            return;
        }
        if (i == 2) {
            removeImageResourceArray(uiShopImage);
            removeImageResourceArray(uiUpgradeImage);
            removeImageResourceArray(uiUpheroImage);
            removeImageResourceArray(uiUpitemImage);
            removeImageResourceArray(uiUpunitImage);
            return;
        }
        if (i == 3) {
            removeImageResourceArray(titleImage);
            removeImageResourceArray(titleBossImage);
        } else if (i == 4) {
            removeImageResourceArray(stageClearImage);
        } else {
            if (i != 5) {
                return;
            }
            removeImageResourceArray(tutorialImage);
        }
    }

    public static void loadResourcePartData(int i) {
        if (i == 0) {
            loadImageResourceToTexture(uiHelpImage, uiHelpResource);
            return;
        }
        if (i == 1) {
            loadImageResourceToTexture(uiAwardImage, uiAwardResource);
            loadImageResourceToTexture(uiRecordImage, uiRecordResource);
            return;
        }
        if (i == 2) {
            loadImageResourceToTexture(uiShopImage, uiShopResource);
            loadImageResourceToTexture(uiUpgradeImage, uiUpgradeResource);
            loadImageResourceToTexture(uiUpheroImage, uiUpheroResource);
            loadImageResourceToTexture(uiUpitemImage, uiUpitemResource);
            loadImageResourceToTexture(uiUpunitImage, uiUpunitResource);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                loadImageResourceToTexture(stageClearImage, stageClearResource);
                return;
            } else {
                if (i != 5) {
                    return;
                }
                loadImageResourceToTexture(tutorialImage, tutorialResource);
                return;
            }
        }
        loadImageResourceToTexture(titleImage, titleResource);
        int random = GameThread.getRandom(5);
        if (random == 0) {
            GAME_TITLE_BOSS_VIEW_POS = GAME_TITLE_BOSS_VIEW_POS_LIST[0];
            loadImageResourceToTexture(titleBossImage, titleBoss0Resource);
            return;
        }
        if (random == 1) {
            GAME_TITLE_BOSS_VIEW_POS = GAME_TITLE_BOSS_VIEW_POS_LIST[1];
            loadImageResourceToTexture(titleBossImage, titleBoss1Resource);
            return;
        }
        if (random == 2) {
            GAME_TITLE_BOSS_VIEW_POS = GAME_TITLE_BOSS_VIEW_POS_LIST[2];
            loadImageResourceToTexture(titleBossImage, titleBoss2Resource);
        } else if (random == 3) {
            GAME_TITLE_BOSS_VIEW_POS = GAME_TITLE_BOSS_VIEW_POS_LIST[3];
            loadImageResourceToTexture(titleBossImage, titleBoss3Resource);
        } else {
            if (random != 4) {
                return;
            }
            GAME_TITLE_BOSS_VIEW_POS = GAME_TITLE_BOSS_VIEW_POS_LIST[4];
            loadImageResourceToTexture(titleBossImage, titleBoss4Resource);
        }
    }
}
