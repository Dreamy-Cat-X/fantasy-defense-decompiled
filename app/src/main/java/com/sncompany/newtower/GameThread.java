package com.sncompany.newtower;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.google.android.gms.common.ConnectionResult;
import com.sncompany.newtower.DataClasses.ArrowUnit;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataHero;
import com.sncompany.newtower.DataClasses.ObjectUnit;
import com.sncompany.newtower.DataClasses.TowerUnit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

/* loaded from: D:\decomp\classes.dex */
public class GameThread extends Thread {
    public static final int ADD_SETTING_TOUCH_MINUS_POS = -25;
    public static final int ARROW_UNIT_MAX_COUNT = 200;
    public static final int BGM_SOUND_GAMEPLAYING = 2;
    public static final int BGM_SOUND_MAINMENU = 1;
    public static final int BGM_SOUND_TITLE = 0;
    public static final int BGM_SOUND_TOTAL_COUNT = 3;
    static final int BUY_SHOP_ITEM_GOOD_PROCESS = 0;
    static final int BUY_SHOP_ITEM_NO_BUY_ITEM = 1;
    static final int BUY_SHOP_ITEM_NO_HEROISM = 2;
    static final int BUY_SHOP_ITEM_NO_SLOT = 3;
    public static final int CHAPTER_TOTAL_COUNT = 5;
    public static final int CHAPTER_TYPE_DESERT = 2;
    public static final int CHAPTER_TYPE_DEVIL = 4;
    public static final int CHAPTER_TYPE_FOREST = 0;
    public static final int CHAPTER_TYPE_MAGMA = 3;
    public static final int CHAPTER_TYPE_SWAMP = 1;
    public static final int CHARACTER_MENU_CHAR_ADD = 1;
    public static final int CHARACTER_MENU_CHAR_SELECT = 2;
    public static final int CHARACTER_MENU_CLASS_CHANGE_ASK = 12;
    public static final int CHARACTER_MENU_HERO_ADD = 4;
    public static final int CHARACTER_MENU_HERO_BUY_ASK = 6;
    public static final int CHARACTER_MENU_HERO_MENU_VIEW = 3;
    public static final int CHARACTER_MENU_LEVELUP_ASK = 13;
    public static final int CHARACTER_MENU_MONSTER_VIEW = 11;
    public static final int CHARACTER_MENU_MONSTER_VIEW_BOSS_FULL_COUNT = 100;
    static final float CHARACTER_MENU_MONSTER_VIEW_FADE_OUT_RATE = 0.1f;
    public static final int CHARACTER_MENU_MONSTER_VIEW_FADE_OUT_START_POS = 10;
    public static final int CHARACTER_MENU_MONSTER_VIEW_FULL_COUNT = 60;
    public static final int CHARACTER_MENU_MONSTER_VIEW_START_HEIGHT_COUNT = 10;
    public static final int CHARACTER_MENU_MONSTER_VIEW_START_HEIGHT_DEGREE = 9;
    public static final int CHARACTER_MENU_MON_SELECT = 7;
    public static final int CHARACTER_MENU_SELECT_NONE = 0;
    public static final int CHARACTER_MENU_SPECIAL_ARROW = 9;
    public static final int CHARACTER_MENU_SPECIAL_BLADE = 8;
    public static final int CHARACTER_MENU_SPECIAL_ICE = 10;
    public static final int CHARACTER_MENU_UNIT_BUY_ASK = 5;
    public static final int CHEAT_VIEW_GRID_LINE = 1;
    public static final int CHEAT_VIEW_MONEY_CHEAT = 2;
    public static final int CHEAT_VIEW_SPECIAL_OK = 4;
    public static final int CHEAT_VIEW_STAGE_GO = 3;
    public static final int CHEAT_VIEW_TOTAL_COUNT = 5;
    public static final int CHEAT_VIEW_TOUCH_RECT = 0;
    public static final int COMMON_TARGET_TYPE_MONSTER = 0;
    public static final int COMMON_TARGET_TYPE_NONE = -1;
    public static final int COMMON_TARGET_TYPE_OBJECT = 1;
    public static final int CONTINUE_TYPE_HOLY = 0;
    public static final int CONTINUE_TYPE_ICE = 1;
    public static final int CONTINUE_TYPE_STUN = 4;
    public static final int DIR_EAST = 2;
    public static final int DIR_MOVE_TOTAL_COUNT = 8;
    public static final int DIR_MOVE_XY_COUNT = 2;
    public static final int DIR_MOVE_X_POSITION = 0;
    public static final int DIR_MOVE_Y_POSITION = 1;
    public static final int DIR_NORTH = 0;
    public static final int DIR_NORTH_EAST = 1;
    public static final int DIR_NORTH_WEST = 7;
    public static final int DIR_SOUTH = 4;
    public static final int DIR_SOUTH_EAST = 3;
    public static final int DIR_SOUTH_WEST = 5;
    public static final int DIR_WEST = 6;
    public static final int EFFECT_TYPE_ARROW = 0;
    public static final int EFFECT_TYPE_ARROWRAIN_CENTER = 34;
    public static final int EFFECT_TYPE_ARROWRAIN_LEFT = 33;
    public static final int EFFECT_TYPE_ARROWRAIN_RIGHT = 35;
    public static final int EFFECT_TYPE_BLADE1 = 15;
    public static final int EFFECT_TYPE_BLADE2 = 16;
    public static final int EFFECT_TYPE_BLADE3 = 17;
    public static final int EFFECT_TYPE_BLADE4 = 18;
    public static final int EFFECT_TYPE_DIE = 13;
    public static final int EFFECT_TYPE_ELECTRIC = 12;
    public static final int EFFECT_TYPE_FIREBALL = 2;
    public static final int EFFECT_TYPE_FIREBALL2 = 38;
    public static final int EFFECT_TYPE_FIREBOLT = 3;
    public static final int EFFECT_TYPE_GATE_BREAK = 36;
    public static final int EFFECT_TYPE_HOLY = 4;
    public static final int EFFECT_TYPE_ICE = 5;
    public static final int EFFECT_TYPE_ICE1 = 19;
    public static final int EFFECT_TYPE_ICE10 = 28;
    public static final int EFFECT_TYPE_ICE11 = 29;
    public static final int EFFECT_TYPE_ICE12 = 30;
    public static final int EFFECT_TYPE_ICE13 = 31;
    public static final int EFFECT_TYPE_ICE14 = 32;
    public static final int EFFECT_TYPE_ICE2 = 20;
    public static final int EFFECT_TYPE_ICE3 = 21;
    public static final int EFFECT_TYPE_ICE4 = 22;
    public static final int EFFECT_TYPE_ICE5 = 23;
    public static final int EFFECT_TYPE_ICE6 = 24;
    public static final int EFFECT_TYPE_ICE7 = 25;
    public static final int EFFECT_TYPE_ICE8 = 26;
    public static final int EFFECT_TYPE_ICE9 = 27;
    public static final int EFFECT_TYPE_NONE = -1;
    public static final int EFFECT_TYPE_SWORD = 9;
    public static final int EFFECT_TYPE_SWORD_SPLASH = 37;
    public static final int EFFECT_TYPE_UPGRADE = 14;
    public static final int EFFECT_TYPE_WIND = 10;
    public static final int EFFECT_UNIT_MAX_COUNT = 200;
    public static final int ENEMY_TOUCH_CHECK_HEIGHT = 40;
    public static final int ENEMY_TOUCH_CHECK_START_POS_X = -20;
    public static final int ENEMY_TOUCH_CHECK_START_POS_Y = -30;
    public static final int ENEMY_TOUCH_CHECK_WIDTH = 40;
    public static final int FRAME_PER_SECOND = 41;
    public static final int FREE_MOVIE_TOTAL_COUNT = 3;
    public static final int FREE_REWARD_MOVIE_TIME = 900;
    public static final int GAMELOAD_STATUS_LOAD = 0;
    public static final int GAMELOAD_STATUS_PLAY = 1;
    public static final int GAME_ABOUT = 8;
    public static final int GAME_ABOUT_DEVELOPER = 1;
    public static final int GAME_ABOUT_PUBLISH = 0;
    public static final int GAME_ENDING = 27;
    public static final int GAME_ENDING_1_IMAGE_1 = 0;
    public static final int GAME_ENDING_2_IMAGE_RED = 1;
    public static final int GAME_ENDING_3_FINISH = 2;
    public static final int GAME_ENDING_4_TO_TITLE = 3;
    public static final int GAME_HELP = 18;
    public static final int GAME_HELP_VIEW_TOTAL_COUNT = 15;
    public static final int GAME_INGAME_MENU = 21;
    public static final int GAME_INGAME_MENU_MAIN = 0;
    public static final int GAME_INGAME_MENU_MOVING = 1;
    public static final int GAME_LOADING_PART_AWARD = 1;
    public static final int GAME_LOADING_PART_HELP = 0;
    public static final int GAME_LOADING_PART_STAGE_CLEAR = 4;
    public static int[] GAME_LOADING_PART_STATUS = null;
    public static final int GAME_LOADING_PART_STATUS_EMPTY = 0;
    public static final int GAME_LOADING_PART_STATUS_LOADED = 1;
    public static final int GAME_LOADING_PART_TITLE = 3;
    public static final int GAME_LOADING_PART_TOTAL_COUNT = 6;
    public static final int GAME_LOADING_PART_TUTORIAL = 5;
    public static final int GAME_LOADING_PART_UPGRADE_SHOP = 2;
    public static final int GAME_LOGO = 0;
    public static final int GAME_MAINMENU = 5;
    public static final int GAME_MAINMENU_MOVING = 6;
    public static final int GAME_MAINMENU_REV_MOVING = 7;
    public static final int GAME_MENU_IMAGE_LOAD = 1006;
    public static final int GAME_NEW_MENU_IMAGE_LOAD = 1003;
    public static final int GAME_OPENING = 2;
    public static final int GAME_OPENING_0_BLACK_WINDOW = 0;
    public static final int GAME_OPENING_10_IMAGE_3_2 = 11;
    public static final int GAME_OPENING_11_IMAGE_4 = 12;
    public static final int GAME_OPENING_12_IMAGE_B_1 = 13;
    public static final int GAME_OPENING_13_IMAGE_B_2 = 14;
    public static final int GAME_OPENING_14_IMAGE_B_3 = 15;
    public static final int GAME_OPENING_15_IMAGE_A_2 = 16;
    public static final int GAME_OPENING_16_IMAGE_4 = 17;
    public static final int GAME_OPENING_17_IMAGE_B_4 = 18;
    public static final int GAME_OPENING_18_IMAGE_B_5 = 19;
    public static final int GAME_OPENING_19_IMAGE_B_6 = 20;
    public static final int GAME_OPENING_1_IMAGE_1 = 1;
    public static final int GAME_OPENING_20_IMAGE_B_7 = 21;
    public static final int GAME_OPENING_21_IMAGE_A_3 = 22;
    public static final int GAME_OPENING_22_IMAGE_5 = 23;
    public static final int GAME_OPENING_23_REMOVE_5_B = 24;
    public static final int GAME_OPENING_24_TO_TITLE = 25;
    public static final int GAME_OPENING_2_IMAGE_2 = 2;
    public static final int GAME_OPENING_3_IMAGE_A_1 = 3;
    public static final int GAME_OPENING_3_IMAGE_TO_BLACK = 4;
    public static final int GAME_OPENING_4_BLACK_TO_WHITE = 5;
    public static final int GAME_OPENING_5_IMAGE_3_1 = 6;
    public static final int GAME_OPENING_6_BLACK_WINDOW = 7;
    public static final int GAME_OPENING_7_IMAGE_A_1 = 8;
    public static final int GAME_OPENING_8_IMAGE_3_2 = 9;
    public static final int GAME_OPENING_9_IMAGE_3_3 = 10;
    public static final int GAME_OPTION = 9;
    public static final int GAME_OVER = 23;
    public static final int GAME_OVER_MOVING = 2;
    public static final int GAME_OVER_RESULT = 1;
    public static final int GAME_OVER_TITLE = 0;
    public static final int GAME_PLAY2_IMAGE_LOAD = 1005;
    public static final int GAME_PLAYING = 25;
    public static final int GAME_PLAY_IMAGE_LOAD = 1004;
    public static final int GAME_PRE_IMAGE_LOAD = 1001;
    public static final int GAME_PRE_LOAD = 1000;
    public static final int GAME_PRE_TOTAL_IMAGE_LOAD = 1002;
    public static final int GAME_RECORD = 19;
    public static final int GAME_RECORD_AWARD = 1;
    public static final int GAME_RECORD_SCORE = 0;
    public static final int GAME_RESUME_TO_MENU = 1007;
    public static final int GAME_RESUME_TO_PLAY = 1008;
    public static final int GAME_SHOP_EQUIP = 16;
    public static final int GAME_SHOP_EQUIP_DONT_SELL_CASHITEM = 8;
    public static final int GAME_SHOP_EQUIP_INVEN_MOVING = 7;
    public static final int GAME_SHOP_EQUIP_INVEN_SELECTION = 4;
    public static final int GAME_SHOP_EQUIP_ITEM_MOVING = 6;
    public static final int GAME_SHOP_EQUIP_ITEM_SELECTION = 3;
    public static final int GAME_SHOP_EQUIP_NO_SELECTION = 2;
    public static final int GAME_SHOP_GIFT = 17;
    public static final int GAME_SHOP_GIFT_COUNT_GET = 1;
    public static final int GAME_SHOP_GIFT_DONT_SELL_CASHITEM = 5;
    public static final int GAME_SHOP_GIFT_GET_SENDING = 2;
    public static final int GAME_SHOP_GIFT_INVENTORY = 3;
    public static final int GAME_SHOP_GIFT_NOPHONE_WARNING = 4;
    public static final int GAME_SHOP_GIFT_NO_CHECK = 0;
    public static final int GAME_SHOP_LIST = 14;
    public static final int GAME_SHOP_SHOP = 15;
    public static final int GAME_SHOP_SHOP_DONT_SELL_CASHITEM = 8;
    public static final int GAME_SHOP_SHOP_GIFT_INPUT = 2;
    public static final int GAME_SHOP_SHOP_GIFT_INPUT_ASK = 3;
    public static final int GAME_SHOP_SHOP_GIFT_SENDING = 4;
    public static final int GAME_SHOP_SHOP_GIFT_SEND_FAIL = 6;
    public static final int GAME_SHOP_SHOP_GIFT_SEND_SUCCESS = 5;
    public static final int GAME_SHOP_SHOP_INVENTORY = 1;
    public static final int GAME_SHOP_SHOP_ITEM = 0;
    public static final int GAME_SHOP_SHOP_NO_HEROISM = 7;
    public static final int GAME_STAGE_CLEAR = 22;
    public static final int GAME_STAGE_CLEAR_MOVING = 2;
    public static final int GAME_STAGE_CLEAR_PERFECT = 5;
    public static final int GAME_STAGE_CLEAR_RESULT = 1;
    public static final int GAME_STAGE_CLEAR_REWARD_BONUS = 4;
    public static final int GAME_STAGE_CLEAR_SKILL_OPEN_ALERT1 = 6;
    public static final int GAME_STAGE_CLEAR_SKILL_OPEN_ALERT2 = 7;
    public static final int GAME_STAGE_CLEAR_SKILL_OPEN_ALERT3 = 8;
    public static final int GAME_STAGE_CLEAR_THEME_CLEAR = 3;
    public static final int GAME_STAGE_CLEAR_TITLE = 0;
    public static final int GAME_STAGE_SELECT = 10;
    public static final int GAME_STAGE_SELECT_MOVING = 1;
    public static final int GAME_STAGE_SELECT_NORMAL = 0;
    public static final int GAME_STAGE_START_LOADING = 24;
    public static final int GAME_STAGE_START_VIEW = 20;
    public static final int GAME_TITLE = 3;
    public static final int GAME_TITLE_DARK_VIEW_0 = 0;
    public static final int GAME_TITLE_DARK_VIEW_1 = 2;
    public static final int GAME_TITLE_DARK_VIEW_2 = 4;
    public static final int GAME_TITLE_DARK_VIEW_3 = 6;
    public static final int GAME_TITLE_DARK_VIEW_LONG_COUNT = 17;
    public static final int GAME_TITLE_DARK_VIEW_SHORT_COUNT = 7;
    public static final int GAME_TITLE_MAIN_BUTTON_VIEW = 11;
    public static final int GAME_TITLE_MAIN_BUTTON_VIEW_COUNT = 10;
    static final float GAME_TITLE_MAIN_BUTTON_VIEW_DEGREE = 0.1f;
    public static final int GAME_TITLE_MAIN_INPUT_WAIT = 12;
    public static final int GAME_TITLE_MAIN_TITLE_VIEW = 10;
    public static final int GAME_TITLE_MAIN_TITLE_VIEW_COUNT = 30;
    static final float GAME_TITLE_MAIN_TITLE_VIEW_DEGREE = 0.05f;
    public static final int GAME_TITLE_MAIN_VIEW_ALPHA = 8;
    public static final int GAME_TITLE_MAIN_VIEW_ALPHA_COUNT = 15;
    static final float GAME_TITLE_MAIN_VIEW_ALPHA_DEGREE = 0.066f;
    public static final int GAME_TITLE_MAIN_VIEW_SCROLL = 9;
    public static final int GAME_TITLE_MAIN_VIEW_SCROLL_COUNT = 30;
    public static final int GAME_TITLE_UNIT_VIEW_0 = 1;
    public static final int GAME_TITLE_UNIT_VIEW_1 = 3;
    public static final int GAME_TITLE_UNIT_VIEW_2 = 5;
    public static final int GAME_TITLE_UNIT_VIEW_3 = 7;
    public static final int GAME_TITLE_UNIT_VIEW_COUNT = 2;
    public static final int GAME_TUTORIAL = 26;
    public static final int GAME_TUTORIAL_ARCHER_EXPLAIN = 8;
    public static final int GAME_TUTORIAL_ARCHER_FOLLOW = 7;
    public static final int GAME_TUTORIAL_COLDDIVINER_EXPLAIN = 14;
    public static final int GAME_TUTORIAL_COLDDIVINER_FOLLOW = 13;
    public static final int GAME_TUTORIAL_GATELIFE_VIEW = 2;
    public static final int GAME_TUTORIAL_GOLD_EXPLAIN = 17;
    public static final int GAME_TUTORIAL_HERO_EXPLAIN = 16;
    public static final int GAME_TUTORIAL_HERO_FOLLOW = 15;
    public static final int GAME_TUTORIAL_HOLYEYE_EXPLAIN = 10;
    public static final int GAME_TUTORIAL_HOLYEYE_FOLLOW = 9;
    public static final int GAME_TUTORIAL_MANASTONE_EXPLAIN = 18;
    public static final int GAME_TUTORIAL_MANATARMS_EXPLAIN = 6;
    public static final int GAME_TUTORIAL_MANATARMS_FOLLOW = 5;
    public static final int GAME_TUTORIAL_STAGE_CLEAR1 = 21;
    public static final int GAME_TUTORIAL_STAGE_CLEAR2 = 22;
    public static final int GAME_TUTORIAL_TUTORIAL_CLEAR1 = 19;
    public static final int GAME_TUTORIAL_TUTORIAL_CLEAR2 = 20;
    public static final int GAME_TUTORIAL_WARRIOR_EXPLAIN = 4;
    public static final int GAME_TUTORIAL_WARRIOR_FOLLOW = 3;
    public static final int GAME_TUTORIAL_WAVEMANA_VIEW = 1;
    public static final int GAME_TUTORIAL_WIZARD_EXPLAIN = 12;
    public static final int GAME_TUTORIAL_WIZARD_FOLLOW = 11;
    public static final int GAME_UPGRADE_HERO = 13;
    public static final int GAME_UPGRADE_HERO_NONE = 0;
    public static final int GAME_UPGRADE_LIST = 11;
    public static final int GAME_UPGRADE_UNIT = 12;
    public static final int GAME_USE12 = 1;
    static final int GAME_USE12_VIEW_TIME = 2000;
    public static final int HERO_ITEM_TOTAL_COUNT = 2;
    public static final int HERO_UNIT_TOTAL_COUNT = 3;
    public static final int HERO_UPGRADE_MAX_HALF_VALUE = 5;
    public static final int HIT_TYPE_ARROW_ATTACK = 3;
    public static final int HIT_TYPE_DIRECT_HIT = 0;
    public static final int HIT_TYPE_DOT_FIRE = 2;
    public static final int HIT_TYPE_DOT_HOLY = 1;
    public static final int INVENTORY_SKILL_TOTAL_COUNT = 24;
    public static final int INVENTORY_SKILL_TOTAL_PAGE_COUNT = 3;
    public static final int ITEM_TYPE_MANAGER_GIFT_GOLD = -100;
    public static final int Integer_SIZE = 4;
    static final float LAST_UPDATE_ITEM_ALPHA_DEGREE = 0.066f;
    public static final int LAST_UPDATE_ITEM_VIEW_COUNT = 15;
    static final int LIMIT_CASH_BUY_MAX_COUNT = 2;
    static final int LIMIT_CASH_BUY_UP_DEGREE = 5;
    public static final int LOAD_MAP_START_COUNT = 450;
    public static final int LOAD_MOVE_START_COUNT = 150;
    public static final int LOAD_OBJECT_START_COUNT = 300;
    public static final int MAP_DEPTH_DATA_MAX = 9999;
    public static final int MAP_END_POSITION_COUNT = 10;
    public static final int MAP_END_POSITION_POS_COUNT = 2;
    public static final int MAP_GROUP_TYPE_FOREST = 0;
    public static final int MAP_MOVE_ALLOW_EAST = 4;
    public static final int MAP_MOVE_ALLOW_NONE = 0;
    public static final int MAP_MOVE_ALLOW_NORTH = 1;
    public static final int MAP_MOVE_ALLOW_NORTH_EAST = 2;
    public static final int MAP_MOVE_ALLOW_NORTH_WEST = 128;
    public static final int MAP_MOVE_ALLOW_SOUTH = 16;
    public static final int MAP_MOVE_ALLOW_SOUTH_EAST = 8;
    public static final int MAP_MOVE_ALLOW_SOUTH_WEST = 32;
    public static final int MAP_MOVE_ALLOW_TOTAL_COUNT = 8;
    public static final int MAP_MOVE_ALLOW_WEST = 64;
    public static final int MAP_START_POSITION_COUNT = 10;
    public static final int MAP_START_POSITION_POS_COUNT = 2;
    public static final int MAP_TILE_DATA_HEIGHT = 10;
    public static final int MAP_TILE_DATA_WIDTH = 15;
    public static final int MAP_TILE_TYPE_NONE = -1;
    public static final int MAP_TILE_TYPE_ROAD_NE = 2;
    public static final int MAP_TILE_TYPE_ROAD_NS = 0;
    public static final int MAP_TILE_TYPE_ROAD_NW = 3;
    public static final int MAP_TILE_TYPE_ROAD_SE = 4;
    public static final int MAP_TILE_TYPE_ROAD_SW = 5;
    public static final int MAP_TILE_TYPE_ROAD_WE = 1;
    public static final int MAP_TUTORIAL = 50;
    public static final int MAX_STREAMS = 64;
    public static final int MONSTER_OPEN_TIME = 12;
    public static final int MONSTER_TYPE_NONE = -1;
    public static final int MONSTER_UNIT_MAX_COUNT = 100;
    public static final int MYSCORE_BOSS_MULTI_REWARD = 5;
    public static final int MYSCORE_MONSTER_REWARD = 120;
    static final float MYSCORE_PERPECT_CLEAR_RATE = 1.5f;
    public static final int MYSCORE_REMAIN_GOLD = 10;
    public static final int MYSCORE_REMAIN_LIVE = 1000;
    public static final int MYSCORE_REMAIN_MANA = 30;
    static final float MYSCORE_WAVE_ADD_VALUE = 0.1f;
    static final float MYSCORE_WAVE_BASE_VALUE = 1.0f;
    public static final int MYSCORE_WAVE_PERFECT = 600;
    public static final int MY_OSCILLATOR_COMMON_MOVE = 11;
    public static final int MY_OSCILLATOR_MAX_COUNT = 20;
    public static final int MY_OSCILLATOR_PERFECT_1 = 19;
    public static final int MY_OSCILLATOR_PERFECT_C = 17;
    public static final int MY_OSCILLATOR_PERFECT_E1 = 13;
    public static final int MY_OSCILLATOR_PERFECT_E2 = 16;
    public static final int MY_OSCILLATOR_PERFECT_F = 15;
    public static final int MY_OSCILLATOR_PERFECT_P = 12;
    public static final int MY_OSCILLATOR_PERFECT_R = 14;
    public static final int MY_OSCILLATOR_PERFECT_T = 18;
    public static final int MY_SCROLLBAR_AWARD = 3;
    public static final int MY_SCROLLBAR_EFFECT = 1;
    public static final int MY_SCROLLBAR_MAX_COUNT = 5;
    public static final int MY_SCROLLBAR_MUSIC = 0;
    public static final int MY_SCROLLBAR_SCORE = 2;
    public static final int MY_SCROLLBAR_SHOP = 4;
    public static final int OBJECT_TOUCH_CHECK_BIG_HEIGHT = 90;
    public static final int OBJECT_TOUCH_CHECK_BIG_START_POS_X = -45;
    public static final int OBJECT_TOUCH_CHECK_BIG_START_POS_Y = -67;
    public static final int OBJECT_TOUCH_CHECK_BIG_WIDTH = 90;
    public static final int OBJECT_TOUCH_CHECK_HEIGHT = 45;
    public static final int OBJECT_TOUCH_CHECK_START_POS_X = -22;
    public static final int OBJECT_TOUCH_CHECK_START_POS_Y = -22;
    public static final int OBJECT_TOUCH_CHECK_WIDTH = 45;
    public static final int OBJECT_TYPE_GATE = 0;
    public static final int OBJECT_TYPE_GOAL = 1;
    public static final int OBJECT_TYPE_NONE = -1;
    public static final int OBJECT_TYPE_OBJECT_1 = 2;
    public static final int OBJECT_TYPE_OBJECT_2 = 3;
    public static final int OBJECT_TYPE_VANISHING = -2;
    public static final int OBJECT_UNIT_MAX_COUNT = 100;
    public static final int PLAY_TIME_INTEGER_POS = 8;
    public static final int READ_ARRAY_COUNT_POS = 0;
    public static final int READ_ARRAY_INT_SIZE = 4;
    public static final int READ_ARRAY_LINE_SIZE = 32;
    public static final int READ_ARRAY_START_POS = 4;
    public static final int REWARD_0_HERO_CHAMPION_OPEN = 0;
    public static final int REWARD_10_HERO_ARCHER_OPEN = 2;
    public static final int REWARD_15_HERO_SPECIAL_OPEN = 3;
    public static final int REWARD_20_HERO_WIZARD_OPEN = 4;
    public static final int REWARD_25_UPGRADE_LIMIT = 5;
    public static final int REWARD_30_HERO_ATTACK_SKILL_OPEN = 6;
    public static final int REWARD_35_HEROISM_1000_GET = 7;
    public static final int REWARD_40_ITEM_GET_11 = 8;
    public static final int REWARD_45_HEROISM_2500_GET = 9;
    public static final int REWARD_5_HEROISM_1500_GET = 1;
    public static final int REWARD_STRING_PER_DATA = 3;
    public static final int REWARD_TOTAL_COUNT = 10;
    static final String SAVEFILE_BACKNAME = "SAVEDATABACK";
    static final String SAVEFILE_NAME = "SAVEDATA";
    static final String SAVEFILE_NAME2 = "SAVEDATA2";
    public static final int SAVEFILE_SIZE = 27392;
    public static final int SAVE_ETC_DATA_SIZE = 50;
    public static final int SAVE_PREV_VERSION = 10000;
    public static final int SAVE_VERSION = 10002;
    static final int SELL_SHOP_ITEM_RETURN_CASHITEM = 2;
    static final int SELL_SHOP_ITEM_RETURN_NONE = 1;
    static final int SELL_SHOP_ITEM_RETURN_OK = 0;
    public static final int SELL_UNIT_RATE = 50;
    public static final int SET_CURRENT_WAVE_SPAWN_DEGREE = 3;
    public static final int SHOP_GIFT_PHONE_NUM_MAX = 3;
    public static final int SHOP_SEND_PHONE_NUMBER_MAX_COUNT = 11;
    public static final int SHOP_SEND_PHONE_NUMBER_MINIMUM = 10;
    public static final int SHOP_UNIT_TOTAL_COUNT = 30;
    public static final int SLEEP_FULL_TIME = 1000;
    public static final int SLEEP_SHORT_TIME = 12;
    public static final int SLEEP_TIME = 24;
    public static final int SMALL_BOSS_LIFE_MINUS = 3;
    public static final int SORT_ORDER_MONSTER = 0;
    public static final int SORT_ORDER_NONE_FINISHED = -1;
    public static final int SORT_ORDER_OBJECT = 2;
    public static final int SORT_ORDER_TOTAL_COUNT = 3;
    public static final int SORT_ORDER_TOWER = 1;
    public static final int SOUND_ATT_1 = 1;
    public static final int SOUND_ATT_2 = 2;
    public static final int SOUND_ATT_3 = 3;
    public static final int SOUND_ATT_4 = 4;
    public static final int SOUND_ATT_5 = 5;
    public static final int SOUND_ATT_6 = 6;
    public static final int SOUND_ATT_7 = 7;
    public static final int SOUND_ATT_8 = 8;
    public static final int SOUND_ATT_9 = 9;
    public static final int SOUND_COUNT_PER_FRAME = 5;
    public static final int SOUND_EFFECT_TOTAL_COUNT = 31;
    public static final int SOUND_ETC_1 = 10;
    public static final int SOUND_ETC_10 = 19;
    public static final int SOUND_ETC_11 = 20;
    public static final int SOUND_ETC_2 = 11;
    public static final int SOUND_ETC_3 = 12;
    public static final int SOUND_ETC_4 = 13;
    public static final int SOUND_ETC_5 = 14;
    public static final int SOUND_ETC_6 = 15;
    public static final int SOUND_ETC_7 = 16;
    public static final int SOUND_ETC_8 = 17;
    public static final int SOUND_ETC_9 = 18;
    public static final int SOUND_IGNORE_DELAY = 12;
    public static final int SOUND_SN_LOGO = 0;
    public static final int SOUND_SPECIAL_BLADE_HIT = 30;
    public static final int SOUND_TOTAL_COUNT = 31;
    public static final int SOUND_VOICE_1 = 21;
    public static final int SOUND_VOICE_2 = 22;
    public static final int SOUND_VOICE_3 = 23;
    public static final int SOUND_VOICE_4 = 24;
    public static final int SOUND_VOICE_5 = 25;
    public static final int SOUND_VOICE_6 = 26;
    public static final int SOUND_VOICE_7 = 27;
    public static final int SOUND_VOICE_8 = 28;
    public static final int SOUND_VOICE_9 = 29;
    public static final int SPECIAL_ATTACK_ARROW_ANIM_START_FRAME = 135;
    public static final int SPECIAL_ATTACK_ARROW_ANIM_VIEW_COUNT = 60;
    public static final int SPECIAL_ATTACK_ARROW_DRAW_PER_FRAME = 5;
    public static final int SPECIAL_ATTACK_ARROW_DROP_START_FRAME = 60;
    public static final int SPECIAL_ATTACK_ARROW_FRAME_TOTAL_COUNT = 195;
    public static final int SPECIAL_ATTACK_ARROW_ITEM_COUNT = 75;
    public static final int SPECIAL_ATTACK_ARROW_LEG_POS_X = 403;
    public static final int SPECIAL_ATTACK_ARROW_LEG_POS_Y = 558;
    public static final int SPECIAL_ATTACK_ARROW_MOVE_VALUE = 100;
    public static final int SPECIAL_ATTACK_ARROW_STAY_POS_X = 200;
    public static final int SPECIAL_ATTACK_ARROW_STAY_POS_Y = 10;
    static final float SPECIAL_ATTACK_ARROW_UNIT_SIZE_DEGREE = 0.025f;
    static final float SPECIAL_ATTACK_ARROW_UNIT_SIZE_START = 0.5f;
    public static final int SPECIAL_ATTACK_ARROW_UNIT_START_FRAME = 165;
    public static final int SPECIAL_ATTACK_ARROW_UNIT_VIEW_START_COUNT = 30;
    static final float SPECIAL_ATTACK_BACKGROUND_ALPHA_DEGREE = 0.1f;
    public static final int SPECIAL_ATTACK_BACKGROUND_ENTER_START_POS = 0;
    public static final int SPECIAL_ATTACK_BACKGROUND_LINE_COUNT = 30;
    public static final int SPECIAL_ATTACK_BACKGROUND_OUT_START_POS = 50;
    public static final int SPECIAL_ATTACK_BLADE_DROP_START_FRAME = 65;
    public static final int SPECIAL_ATTACK_BLADE_FRAME_TOTAL_COUNT = 150;
    public static final int SPECIAL_ATTACK_BLADE_MOVE_VALUE = 100;
    public static final int SPECIAL_ATTACK_BLADE_STAY_POS = 100;
    public static final int SPECIAL_ATTACK_HERO_MOVE_ENTER_START_POS = 10;
    public static final int SPECIAL_ATTACK_HERO_MOVE_OUT_END_POS = 50;
    public static final int SPECIAL_ATTACK_HERO_MOVE_OUT_START_POS = 45;
    public static final int SPECIAL_ATTACK_HERO_MOVE_STAY_POS = 15;
    public static final int SPECIAL_ATTACK_HERO_VIEW_COUNT = 60;
    public static final int SPECIAL_ATTACK_ICE_ANIM_ICE_REVERSE_GO = 15;
    public static final int SPECIAL_ATTACK_ICE_ANIM_UNIT_VIEW_POS = 15;
    public static final int SPECIAL_ATTACK_ICE_ANIM_VIEW_COUNT = 50;
    public static final int SPECIAL_ATTACK_ICE_ANIM_WHITE_VIEW_POS = 30;
    public static final int SPECIAL_ATTACK_ICE_DROP_START_FRAME = 60;
    public static final int SPECIAL_ATTACK_ICE_FRAME_TOTAL_COUNT = 170;
    public static final int SPECIAL_ATTACK_ICE_ITEM_COUNT = 60;
    public static final int SPECIAL_ATTACK_ICE_MOVE_VALUE = 200;
    public static final int SPECIAL_ATTACK_ICE_OUT_START_NUM = 1000;
    public static final int SPECIAL_ATTACK_ICE_REVERSE_START_FRAME = 135;
    public static final int SPECIAL_ATTACK_ICE_STAY_POS_Y = 40;
    static final float SPECIAL_ATTACK_ICE_UNIT_SIZE_START = 0.3f;
    static final float SPECIAL_ATTACK_ICE_UNIT_SIZE_ZOOM_DEGREE = 0.1f;
    public static final int SPECIAL_ATTACK_ICE_UNIT_START_FRAME = 135;
    static final float SPECIAL_ATTACK_ICE_WHITE_ALPHA_DEGREE = 0.1f;
    static final float SPECIAL_ATTACK_ICE_WHITE_ALPHA_START = 2.0f;
    public static final int SPECIAL_ATTACK_ICE_WHITE_END_FRAME = 170;
    public static final int SPECIAL_ATTACK_ICE_WHITE_START_FRAME = 150;
    public static final int SPECIAL_ATTACK_ITEM_COUNT = 60;
    public static final int SPECIAL_DATA_TOTAL_COUNT = 20;
    public static final int SPECIAL_DATA_TYPE_TOTAL_COUNT = 4;
    public static final int SPECIAL_DATA_TYPE_TYPE = 0;
    public static final int SPECIAL_DATA_TYPE_VALUE = 3;
    public static final int SPECIAL_DATA_TYPE_WIND_L = 0;
    public static final int SPECIAL_DATA_TYPE_WIND_M = 1;
    public static final int SPECIAL_DATA_TYPE_WIND_S = 2;
    public static final int SPECIAL_DATA_TYPE_WIND_TOTAL_COUNT = 3;
    public static final int SPECIAL_DATA_TYPE_XPOS = 1;
    public static final int SPECIAL_DATA_TYPE_YPOS = 2;
    public static final int STAGE_ATTACK_MODE_GATE_BREAKER = 2;
    public static final int STAGE_ATTACK_MODE_INFINITY = 1;
    public static final int STAGE_ATTACK_MODE_NORMAL = 0;
    public static final int STAGE_ATTACK_MODE_TOTAL_COUNT = 3;
    static final int STAGE_CLEAR_PERFECT_WORD_DELAY_FRAME = 5;
    static final int STAGE_CLEAR_PERFECT_WORD_DOWN_FRAME = 10;
    static final int STAGE_CLEAR_PERFECT_WORD_FINISH_FRAME = 60;
    static final int STAGE_CLEAR_PERFECT_WORD_TOTAL_FRAME = 40;
    static final int STAGE_CLEAR_PERFECT_WORD_UP_FRAME = 30;
    public static final int STAGE_NEXT_WAVE_DELAY_FRAME = 60;
    public static final int STAGE_PER_CHAPTER = 10;
    public static final int STAGE_STARTUP_DELAY_FRAME = 90;
    public static final int STAGE_STARTUP_LIFE = 20;
    public static final int STAGE_STARTUP_MANA = 10150;
    public static final int STAGE_STARTUP_MONEY = 10700;
    public static final int STAGE_TOTAL_COUNT = 50;
    public static final int STORY2_DATA_CHANGE_MAX_TIME = 0;
    public static final int STORY2_DATA_CHANGE_TIME = 9;
    public static final int STORY2_DATA_COPY_TOTAL_COUNT = 7;
    public static final int STORY2_DATA_FRONT_ALPHA_FINISH = 6;
    public static final int STORY2_DATA_FRONT_ALPHA_START = 5;
    public static final int STORY2_DATA_TEXT_BEGIN_NUM = 2;
    public static final int STORY2_DATA_TEXT_CENTER_DRAW_FLAG = 4;
    public static final int STORY2_DATA_TEXT_CURRENT_NUM = 8;
    public static final int STORY2_DATA_TEXT_DRAW_FAIDIN_COUNT = 60;
    public static final int STORY2_DATA_TEXT_DRAW_FAIDOUT_COUNT = 10;
    public static final int STORY2_DATA_TEXT_DRAW_MAX_COUNT = 70;
    public static final int STORY2_DATA_TEXT_DRAW_REMAIN_TIME = 7;
    public static final int STORY2_DATA_TEXT_END_NUM = 3;
    public static final int STORY2_DATA_TOTAL_COUNT = 10;
    public static final int STORY2_DATA_WAIT_TIME = 1;
    public static final int STORY2_IMAGE_1 = 0;
    public static final int STORY_ADD_BADMOON = 0;
    public static final int STORY_ADD_IMAGE = 1;
    public static final int STORY_CHANGE_TO_IMAGE = 3;
    public static final int STORY_CHANGE_TO_WHITE = 2;
    public static final int STORY_DATA_BACK_DRAW_5_B = 10;
    public static final int STORY_DATA_BACK_DRAW_5_K = 11;
    public static final int STORY_DATA_BACK_DRAW_A_1 = 8;
    public static final int STORY_DATA_BACK_DRAW_A_2 = 9;
    public static final int STORY_DATA_BACK_DRAW_B_1 = 1;
    public static final int STORY_DATA_BACK_DRAW_B_2 = 2;
    public static final int STORY_DATA_BACK_DRAW_B_3 = 3;
    public static final int STORY_DATA_BACK_DRAW_B_4 = 4;
    public static final int STORY_DATA_BACK_DRAW_B_5 = 5;
    public static final int STORY_DATA_BACK_DRAW_B_6 = 6;
    public static final int STORY_DATA_BACK_DRAW_B_7 = 7;
    public static final int STORY_DATA_BACK_DRAW_NUM = 0;
    public static final int STORY_DATA_CHANGE_MAX_TIME = 18;
    public static final int STORY_DATA_CHANGE_TIME = 27;
    public static final int STORY_DATA_COPY_TOTAL_COUNT = 25;
    public static final int STORY_DATA_FRONT_ALPHA_FINISH = 24;
    public static final int STORY_DATA_FRONT_ALPHA_START = 23;
    public static final int STORY_DATA_FRONT_DRAW_5_B = 16;
    public static final int STORY_DATA_FRONT_DRAW_5_K = 17;
    public static final int STORY_DATA_FRONT_DRAW_B_1 = 13;
    public static final int STORY_DATA_FRONT_DRAW_B_2 = 14;
    public static final int STORY_DATA_FRONT_DRAW_B_3 = 15;
    public static final int STORY_DATA_FRONT_DRAW_NUM = 12;
    public static final int STORY_DATA_TEXT_BEGIN_NUM = 20;
    public static final int STORY_DATA_TEXT_CENTER_DRAW_FLAG = 22;
    public static final int STORY_DATA_TEXT_CURRENT_NUM = 26;
    public static final int STORY_DATA_TEXT_DRAW_FAIDIN_COUNT = 60;
    public static final int STORY_DATA_TEXT_DRAW_FAIDOUT_COUNT = 10;
    public static final int STORY_DATA_TEXT_DRAW_MAX_COUNT = 70;
    public static final int STORY_DATA_TEXT_DRAW_REMAIN_TIME = 25;
    public static final int STORY_DATA_TEXT_END_NUM = 21;
    public static final int STORY_DATA_TOTAL_COUNT = 28;
    public static final int STORY_DATA_WAIT_TIME = 19;
    public static final int STORY_IMAGE_1 = 0;
    public static final int STORY_IMAGE_2 = 1;
    public static final int STORY_IMAGE_3_1 = 2;
    public static final int STORY_IMAGE_3_2 = 3;
    public static final int STORY_IMAGE_3_3 = 4;
    public static final int STORY_IMAGE_4 = 5;
    public static final int STORY_IMAGE_5 = 6;
    public static final int STORY_IMAGE_5_B = 7;
    public static final int STORY_IMAGE_5_K = 8;
    public static final int STORY_IMAGE_A_1 = 9;
    public static final int STORY_IMAGE_A_2 = 10;
    public static final int STORY_IMAGE_A_3 = 11;
    public static final int STORY_IMAGE_BLACK = 100;
    public static final int STORY_IMAGE_B_1 = 12;
    public static final int STORY_IMAGE_B_2 = 13;
    public static final int STORY_IMAGE_B_3 = 14;
    public static final int STORY_IMAGE_B_4 = 15;
    public static final int STORY_IMAGE_B_5 = 16;
    public static final int STORY_IMAGE_B_6 = 17;
    public static final int STORY_IMAGE_B_7 = 18;
    public static final int STORY_IMAGE_LOGO = 103;
    public static final int STORY_IMAGE_PROGRAM = 100;
    public static final int STORY_IMAGE_WHITE = 102;
    public static final int STORY_REMOVE_IMAGE = 4;
    public static final int STORY_SHOW_DIALOG = 5;
    public static final int STORY_TO_BLK_WIN = 6;
    public static final int TOWER_TYPE_NONE = -1;
    public static final int TOWER_UNIT_MAX_COUNT = 150;
    public static final int TURBO_FLAG_3_SIZE = 3;
    public static final int TURBO_FLAG_MAX_COUNT = 6;
    public static final int TURBO_FLAG_MAX_SIZE = 8;
    public static final int TUTORIAL_ARROW_NUM = 2;
    public static final int TUTORIAL_ARROW_POS_X = 3;
    public static final int TUTORIAL_ARROW_POS_Y = 4;
    public static final int TUTORIAL_BOXLINE_BOX_HEIGHT = 7;
    public static final int TUTORIAL_BOXLINE_BOX_START_X = 4;
    public static final int TUTORIAL_BOXLINE_BOX_START_Y = 5;
    public static final int TUTORIAL_BOXLINE_BOX_WIDTH = 6;
    public static final int TUTORIAL_BOXLINE_LINE_HEIGHT = 3;
    public static final int TUTORIAL_BOXLINE_LINE_START_X = 0;
    public static final int TUTORIAL_BOXLINE_LINE_START_Y = 1;
    public static final int TUTORIAL_BOXLINE_LINE_WIDTH = 2;
    public static final int TUTORIAL_BOX_3CHARSELECT = 20;
    static final float TUTORIAL_BOX_ALPHA_DEGREE = 0.1f;
    public static final int TUTORIAL_BOX_ARCHER = 10;
    public static final int TUTORIAL_BOX_BUYBUTTON = 21;
    public static final int TUTORIAL_BOX_BUYHERO = 19;
    public static final int TUTORIAL_BOX_COLDDIVINER = 13;
    public static final int TUTORIAL_BOX_ENEMYGATE = 5;
    public static final int TUTORIAL_BOX_EQUIP = 18;
    public static final int TUTORIAL_BOX_GATELIFE = 7;
    public static final int TUTORIAL_BOX_GOLD = 0;
    public static final int TUTORIAL_BOX_GOLDBOX = 15;
    public static final int TUTORIAL_BOX_HERO = 14;
    public static final int TUTORIAL_BOX_HOLYEYE = 11;
    public static final int TUTORIAL_BOX_MANA = 1;
    public static final int TUTORIAL_BOX_MANASTONE = 16;
    public static final int TUTORIAL_BOX_MANATARMS = 9;
    public static final int TUTORIAL_BOX_MOVE_COUNT = 10;
    public static final int TUTORIAL_BOX_OURGATE = 6;
    public static final int TUTORIAL_BOX_PAUSESWITCHMENU = 3;
    public static final int TUTORIAL_BOX_SHOP = 17;
    public static final int TUTORIAL_BOX_TOTAL_COUNT = 22;
    public static final int TUTORIAL_BOX_UNITS = 4;
    public static final int TUTORIAL_BOX_WARRIOR = 8;
    public static final int TUTORIAL_BOX_WAVE = 2;
    public static final int TUTORIAL_BOX_WIZARD = 12;
    public static final int TUTORIAL_MOVE_END_X = 7;
    public static final int TUTORIAL_MOVE_END_Y = 8;
    public static final int TUTORIAL_MOVE_START_X = 5;
    public static final int TUTORIAL_MOVE_START_Y = 6;
    public static final int TUTORIAL_POS_ARCHER = 2;
    public static final int TUTORIAL_POS_COLDDIVINER = 5;
    public static final int TUTORIAL_POS_HERO = 6;
    public static final int TUTORIAL_POS_HOLYEYE = 3;
    public static final int TUTORIAL_POS_MANATARMS = 1;
    public static final int TUTORIAL_POS_TOTAL_COUNT = 7;
    public static final int TUTORIAL_POS_WARRIOR = 0;
    public static final int TUTORIAL_POS_WIZARD = 4;
    public static final int TUTORIAL_RECT_GOLD = 2;
    public static final int TUTORIAL_RECT_MANASTONE = 3;
    public static final int TUTORIAL_RECT_MENUKEY = 1;
    public static final int TUTORIAL_RECT_UNIT = 0;
    public static final int TUTORIAL_TARGET_POS_X = 0;
    public static final int TUTORIAL_TARGET_POS_Y = 1;
    static final float TUTORIAL_VIEW_ALPHA_VIEW_DEGREE = 0.1f;
    public static final int TUTORIAL_VIEW_ARROW_SHOW = 2;
    public static final int TUTORIAL_VIEW_ARROW_SHOW_START_TIME = 60;
    public static final int TUTORIAL_VIEW_BLINK_FRAME = 5;
    public static final int TUTORIAL_VIEW_DRAG_ACTION = 5;
    public static final int TUTORIAL_VIEW_DRAG_ACTION_START_TIME = 150;
    public static final int TUTORIAL_VIEW_DRAG_ACTION_TOTAL_COUNT = 30;
    public static final int TUTORIAL_VIEW_EMPTY_START_TIME = 0;
    public static final int TUTORIAL_VIEW_EMPTY_TIME = 0;
    public static final int TUTORIAL_VIEW_HAND_VIEW = 3;
    public static final int TUTORIAL_VIEW_HAND_VIEW_START_TIME = 90;
    public static final int TUTORIAL_VIEW_TARGET_BLINK = 1;
    public static final int TUTORIAL_VIEW_TARGET_BLINK_START_TIME = 30;
    public static final int TUTORIAL_VIEW_TOTAL_TIME_COUNT = 210;
    public static final int TUTORIAL_VIEW_TOUCH_ACTION = 4;
    public static final int TUTORIAL_VIEW_TOUCH_ACTION_START_TIME = 120;
    public static final int TUTORIAL_VIEW_TOUCH_HAND_START = 3;
    public static final int TUTORIAL_VIEW_UNIT_REMAIN = 6;
    public static final int TUTORIAL_VIEW_UNIT_REMAIN_START_TIME = 180;
    public static final int UPGRADE_BASIC_SKILL_COUNT_PER_BLOCK = 6;
    public static final int UPGRADE_BASIC_SKILL_COUNT_PER_LINE = 3;
    public static final int UPGRADE_HERO_ITEM_COUNT_PER_LINE = 2;
    public static final int UPGRADE_HERO_SKILL_COUNT_PER_LINE = 6;
    public static final int UPGRADE_HERO_SKILL_TOTAL_COUNT = 18;
    public static final int UPGRADE_INVENTORY_SKILL_COUNT_PER_PAGE = 8;
    public static final int UPGRADE_SHOP_SKILL_COUNT_PER_LINE = 4;
    public static final int UPGRADE_SHOP_SKILL_COUNT_PER_PAGE = 12;
    public static final int VIEWCOUNT_GAME_SHOP_EQUIP_MAX = 30;
    public static final int WAVE_FINISH_CHECK_ALL_FINISHED = 1;
    public static final int WAVE_FINISH_CHECK_GAME_OVER = 3;
    public static final int WAVE_FINISH_CHECK_NEXT_MOVE = 2;
    public static final int WAVE_FINISH_CHECK_NOT_YET = 0;
    public static final int WAVE_MONSTER_TYPE_COUNT = 2;
    public static ArrowUnit[] arrowUnit;
    public static int arrowUnitCount;
    public static int[] awardDataFlag;
    public static int[] awardDataValue;
    public static MediaManager[] bgmMedia;
    public static boolean characterAddBoolean;
    public static boolean characterAddHeroFlag;
    public static int characterAddNumber;
    public static int characterAddOrder;
    public static float characterAddPosX;
    public static float characterAddPosY;
    public static int characterAddType;
    public static int characterMenuMonsterStartViewCount;
    public static int characterMenuMonsterViewCount;
    public static int characterMenuSelectFlag;
    public static int characterSelectNumber;
    public static boolean cheatFlag;
    public static int commonTargetNumber;
    public static int commonTargetType;
    public static TowerUnit compareTowerUnit;
    public static long currentDate;
    public static long currentDrawDate;
    public static int currentFrameCount;
    public static float destroyScore;
    public static MediaManager2 effectMedia;
    public static EffectUnit[] effectUnit;
    public static int effectUnitCount;

    public static int freeAdViewCount;
    public static long freeAdViewTime;
    public static int[][] gameClearedFlag;
    public static int gameHelpViewNum;
    public static int gameLoadFlag;
    public static int[][] gamePerfectFlag;
    public static int[][] gamePlayedCount;
    public static int gameStatus;
    public static int gameSubStatus;
    public static int gameTitleViewCount;
    public static int gatePattern;
    public static int[][] heroItemType;
    public static int[] heroUnitType;
    public static int[][] heroUpgradeValue;
    public static int[][] highScoreValue;
    public static int[] itemUnitValue;
    public static int lastDrawCount;
    public static int lastFrameCount;
    public static int lastMusicVolume;
    public static int lastPlayedMapNumber;
    public static int limitCashBuyCount;
    public static int loadTipNumber;
    public static int loadingStatus;
    public static SoundPool mSoundPool;
    public static boolean m_bStop;
    public static int mapAttackType;
    public static int mapBackgroundType;
    public static int[] mapEndDirection;
    public static int[][] mapEndPosition;
    public static int mapEndPositionCount;
    public static int[][] mapMoveData;
    public static int mapNumber;
    public static int[][] mapStartPosition;
    public static int mapStartPositionCount;
    public static int mapStartPositionLoop;
    public static int[][] mapTileData;
    public static int maxLife;
    public static AudioManager mgr;
    public static boolean[] monsterMeetCheck;
    public static int monsterOpenTime;
    public static boolean monsterSortCheckFlag;
    public static int monsterSortDrawCount;
    public static MonsterUnit[] monsterSortUnit;
    public static MonsterUnit[] monsterUnit;
    public static int monsterUnitCount;
    public static int movieViewFlag;
    public static int myHeroism;
    public static int myLife;
    public static int myMana;
    public static int myMoney;
    public static MyOscillator[] myOscillator;
    public static int myPhoneAlertFlag;
    public static int myScore;
    public static MyScrollbar[] myScrollbar;
    public static int myWave;
    public static int myWaveCount;
    public static boolean myWavePerfectFlag;
    public static boolean myWaveRunFlag;
    public static int myWaveStartCount;
    public static NewTower newTower;
    public static boolean objectSortCheckFlag;
    public static int objectSortDrawCount;
    public static ObjectUnit[] objectSortUnit;
    public static ObjectUnit[] objectUnit;
    public static int objectUnitCount;
    public static boolean pauseFlag;
    public static long playTimeCurrentValue;
    public static long playTimeStartValue;
    public static int playTimeTotalValue;
    public static int randomNumber;
    public static int realDrawCount;
    public static int returnGameStatus;
    public static int[] rewardDataValue;
    public static boolean rewardShowFlag;
    public static int rewardShowOrder;
    static byte[] saveTotalBuffer;
    public static int[] shopGiftItemCount;
    public static int shopGiftItemGetDecision;
    public static int[] shopGiftItemSerial;
    public static int shopGiftItemTotalCount;
    public static int[] shopGiftItemType;
    public static String[] shopGiftPhoneNumber;
    public static byte[][] shopGiftPhoneNumberByte;
    public static int shopSendItemNumber;
    public static int[] shopSendPhoneNumber;
    public static int shopSendPhoneNumberCount;
    public static int shopUnitCount;
    public static int[] shopUnitValue;
    public static boolean soundFlag;
    public static boolean[] soundPlayCheckFlag;
    public static int[] soundPlayDelayCount;
    public static HashMap<Integer, Integer> soundPoolMap;
    public static int specialAttackFrameCount;
    public static boolean specialAttackSkipFlag;
    public static int[][] specialDataValue;
    public static int stageClearViewHeroism;
    public static int stageSelectChapterNumber;
    public static int stageSelectStageNumber;
    public static long startDate;
    public static long startDrawDate;
    public static int story2DataReadPos;
    public static int story2DataTextDrawCount;
    public static int story2ImageViewPos;
    public static int storyDataReadPos;
    public static int storyDataTextDrawCount;
    public static int storyImageViewPos;
    public static int tempCharacterRangeViewNumber;
    public static boolean towerSortCheckFlag;
    public static int towerSortDrawCount;
    public static TowerUnit[] towerSortUnit;
    public static TowerUnit[] towerUnit;
    public static int towerUnitCount;
    public static int turboFlag;
    public static int[] tutorialBoxTouchFlag;
    public static int tutorialFlag;
    public static int tutorialViewCount;
    public static int[] upgradeUnitValue;
    public static int vibrationFlag;
    public static int viewCount_GAME_SHOP_EQUIP;
    public static int[][] waveMobData;
    public static int waveMonsterOutPos;
    public static int[] waveMonsterRemainCount;
    public static int[] waveMonsterShowCurrent;
    public static int[] waveMonsterShowTime;
    public static int[] waveMonsterType;
    public static int wavePattern;
    public static final int[][] GAME_LOADING_PART_DATA = {new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 1, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 0, 1, 0, 0}, new int[]{0, 0, 0, 1, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{1, 0, 1, 0, 0, 0}, new int[]{0, 1, 1, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 1, 0}, new int[]{0, 0, 0, 0, 1, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 1}, new int[]{0, 0, 0, 0, 0, 0}};
    public static int gameTimeCount = 0;
    public static final String[] chapterName = {"Dark Forest", "Swamp of Despair", "Eternal Wasteland", "Infernal Volcano", "Nightmarish Demon World"};
    public static final int[][] DIR_MOVE_POS = {new int[]{0, -1}, new int[]{1, -1}, new int[]{1, 0}, new int[]{1, 1}, new int[]{0, 1}, new int[]{-1, 1}, new int[]{-1, 0}, new int[]{-1, -1}};
    public static int upgradeUnitSelectPos = 0;
    public static int upgradeHeroUnitSelectPos = 0;
    public static int upgradeHeroEquipSelectPos = 0;
    public static int upgradeHeroUpgradeSelectPos = 0;
    public static int upgradeHeroBuySelectPos = 0;
    public static int shopShopChapterSelectPos = 0;
    public static int shopShopItemSelectPos = 0;
    public static int shopShopInventorySelectPos = 0;
    public static int shopGiftItemSelectPos = 0;
    public static int lastUpdateItemPos = 0;
    public static int lastUpdateItemViewDelay = 0;
    public static int[] heroBuyHeroismValue = {0, PathInterpolatorCompat.MAX_NUM_POINTS, 5000};
    public static int TOWER_MAX_LEVEL_NORMAL = 3;
    public static int TOWER_MAX_LEVEL_HERO = 5;
    public static int WAVE_MAX_COUNT = 60;
    public static final int[][] tutorialUnitPos = {new int[]{2, 7, 0, 177, 111, 770, 111, 177, 367}, new int[]{4, 7, 1, 266, 171, 770, 176, 266, 367}, new int[]{6, 7, 2, 356, 231, 770, 241, 356, 367}, new int[]{8, 7, 3, 444, 289, 770, 306, 444, 367}, new int[]{10, 7, 4, 536, 349, 770, 371, 536, 367}, new int[]{12, 7, 5, 627, 374, 770, 436, 627, 367}, new int[]{7, 7, 6, 402, 77, 580, 40, 402, 367}};
    public static final int[][] tutorialBoxLinePos = {new int[]{78, 30, 6, GameRenderer.GAME_SHOP_EQUIP_SKILL_START_X, 33, 233, InputDeviceCompat.SOURCE_KEYBOARD, 81}, new int[]{194, 30, 6, 114, 127, 145, InputDeviceCompat.SOURCE_KEYBOARD, 81}, new int[]{340, 30, 6, 27, 265, 57, InputDeviceCompat.SOURCE_KEYBOARD, 81}, new int[]{47, 408, 12, 6, 59, 338, 371, 134}, new int[]{723, 404, 14, 6, 465, 365, InputDeviceCompat.SOURCE_KEYBOARD, 81}, new int[]{GameRenderer.GAME_SHOP_SHOP_INVENTORY_START_X, 127, 6, 115, 58, 242, 271, 81}, new int[]{663, 153, 6, 89, 452, 242, 271, 81}, new int[]{568, 114, 60, 6, 297, 76, 271, 81}, new int[]{0, 0, 0, 0, 144, 70, 512, 226}, new int[]{0, 0, 0, 0, 150, 70, 226, 226}, new int[]{0, 0, 0, 0, 144, 70, 512, 226}, new int[]{0, 0, 0, 0, GameRenderer.GAME_STAGE_CLEAR_HIGH_SCORE_COUNT, 70, 226, 226}, new int[]{0, 0, 0, 0, 144, 70, 512, 226}, new int[]{0, 0, 0, 0, GameRenderer.GAME_SHOP_SHOP_SIDEBAR_END_Y, 70, 226, 226}, new int[]{0, 0, 0, 0, 179, 70, 442, 226}, new int[]{0, 0, 0, 0, 89, 174, GameRenderer.VOLUMEBAR_WIDTH, 230}, new int[]{0, 0, 0, 0, 323, 176, 350, 226}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}, new int[]{100, 40, 2, 160, 120, 200, 100, 100}};
    public static final int[][] tutorialRectPos = {new int[]{737, 4, 60, 457}, new int[]{3, 336, 46, 140}, new int[]{190, 115, 152, 57}, new int[]{416, 115, 152, 57}};

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
    static int checkNum = 0;
    public static final int[] mapDataResource = {R.raw.map0, R.raw.map1, R.raw.map2, R.raw.map3, R.raw.map4, R.raw.map5, R.raw.map6, R.raw.map7, R.raw.map8, R.raw.map9, R.raw.map10, R.raw.map11, R.raw.map12, R.raw.map13, R.raw.map14, R.raw.map15, R.raw.map16, R.raw.map17, R.raw.map18, R.raw.map19, R.raw.map20, R.raw.map21, R.raw.map22, R.raw.map23, R.raw.map24, R.raw.map25, R.raw.map26, R.raw.map27, R.raw.map28, R.raw.map29, R.raw.map30, R.raw.map31, R.raw.map32, R.raw.map33, R.raw.map34, R.raw.map35, R.raw.map36, R.raw.map37, R.raw.map38, R.raw.map39, R.raw.map40, R.raw.map41, R.raw.map42, R.raw.map43, R.raw.map44, R.raw.map45, R.raw.map46, R.raw.map47, R.raw.map48, R.raw.map49, R.raw.map_tutorial};
    public static final int[] waveDataResource = {R.raw.mob0, R.raw.mob1, R.raw.mob2, R.raw.mob3, R.raw.mob4, R.raw.mob5, R.raw.mob6, R.raw.mob7, R.raw.mob8, R.raw.mob9, R.raw.mob10, R.raw.mob11, R.raw.mob12, R.raw.mob13, R.raw.mob14, R.raw.mob15, R.raw.mob16, R.raw.mob17, R.raw.mob18, R.raw.mob19, R.raw.mob20, R.raw.mob21, R.raw.mob22, R.raw.mob23, R.raw.mob24, R.raw.mob25, R.raw.mob26, R.raw.mob27, R.raw.mob28, R.raw.mob29, R.raw.mob30, R.raw.mob31, R.raw.mob32, R.raw.mob33, R.raw.mob34, R.raw.mob35, R.raw.mob36, R.raw.mob37, R.raw.mob38, R.raw.mob39, R.raw.mob40, R.raw.mob41, R.raw.mob42, R.raw.mob43, R.raw.mob44, R.raw.mob45, R.raw.mob46, R.raw.mob47, R.raw.mob48, R.raw.mob49};
    public static final int[] storyDataResource = {R.drawable.story_1, R.drawable.story_2, R.drawable.story_3_1, R.drawable.story_3_2, R.drawable.story_3_3, R.drawable.story_4, R.drawable.story_5, R.drawable.story_5_b, R.drawable.story_5_k, R.drawable.story_a_1, R.drawable.story_a_2, R.drawable.story_a_3, R.drawable.story_b_1, R.drawable.story_b_2, R.drawable.story_b_3, R.drawable.story_b_4, R.drawable.story_b_5, R.drawable.story_b_6, R.drawable.story_b_7};
    public static final int[] story2DataResource = {R.drawable.story2_1};
    public static int[] storyDrawDataBlock = new int[28];
    public static final int[][] storyData = {new int[]{103, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 30, 0, 0, 3, 1, 0, 100}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 0, 4, 7, 0, 0, 100}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 30, 0, 8, 9, 0, 0, 100}, new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 30, 0, 10, 11, 0, 0, 100}, new int[]{9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 30, 0, -1, -1, 0, 0, 100}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 102, 0, 0, 0, 0, 0, 30, 0, 12, 15, 1, 0, 100}, new int[]{102, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 30, 0, 16, 18, 0, 0, 100}, new int[]{2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 30, 0, 19, 20, 1, 0, 100}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 15, 40, -1, -1, 0, 0, 50}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 15, 0, 21, 22, 0, 0, 100}, new int[]{3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 10, 0, 23, 27, 0, 0, 100}, new int[]{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 10, 0, 28, 29, 0, 0, 100}, new int[]{3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 30, 0, -1, -1, 0, 0, 100}, new int[]{5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 15, 0, 30, 30, 0, 0, 100}, new int[]{5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 15, 0, 31, 31, 0, 0, 100}, new int[]{5, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 15, 40, -1, -1, 0, 0, 50}, new int[]{5, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 5, 1, 1, 1, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 17, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 18, 0, 0, 0, 0, 0, 15, 0, 32, 33, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 10, 0, 34, 35, 0, 0, 100}, new int[]{11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 1, 1, 20, 0, -1, -1, 0, 0, 100}, new int[]{6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 1, 20, 0, 36, 38, 0, 0, 100}};
    public static int[] story2DrawDataBlock = new int[10];
    public static final int[][] story2Data = {new int[]{30, 0, 0, 6, 0, 0, 100}, new int[]{30, 150, 7, 14, 0, 0, 100}, new int[]{30, 90, 15, 22, 1, 0, 100}};
    static final String[] TIP_TEXT = {"Tip 1  : Equip the item on your Hero under the [Item] > [Equipment] menu.", "Tip 2  : Clear stages and acquire up to 3 Heroes.", "Tip 3  : Certain stages reward you with a Hero character.", "Tip 4  : Use Mana to increase the levels of your Heroes.", "Tip 5  : Heroes consume Mana to use their special skills.", "Tip 6  : Special skills have a downtime after each use.", "Tip 7  : Clear a stage to receive Hero Points.", "Tip 8  : Configure your game settings under the [Title Screen] > Settings.", "Tip 9  : Basic units can be upgraded up to Level 3.", "Tip 10 : Hero units can be upgraded up to Level 5.", "Tip 11 : Upgrade your units to give them stronger abilities.", "Tip 12 : Use gold to advance your units to higher classes or increase their levels.", "Tip 13 : Increase the level of your units to improve their combat capabilities.", "Tip 14 : Advance your units to higher classes for more versatile abilities. ", "Tip 15 : Reselling a unit returns to you a portion _ of the money that you spent to hire the unit.", "Tip 16 : You will fail a Boss stage if you fail to defeat the bosses.", "Tip 17 : Boss monsters have high HP, but they move slowly.", "Tip 18 : Monsters drop gold and mana upon death.", "Tip 19 : Use Hero Points to buy items under [Item] > [Shop].", "Tip 20 : Use Hero Points to upgrade your Hero and basic units under the [Skill] menu.", "Tip 21 : Knights, the 2nd advanced class of Warrior, _ have high Attack Speed.", "Tip 22 : Warlords, the 3rd advanced class of Warrior, _ inflict Splashed damage to multiple enemies.", "Tip 23 : Special Warrior Brandishers attack monsters with a chance of causing Stun.", "Tip 24 : Splatters, the 2nd advanced class of Archer, _ shoot multi arrows and attack up to 3 enemies at the same time.", "Tip 25 : Sky Arrows, the 3rd advanced class of Archer, _ strike enemies with their extremely Long Attack Range.", "Tip 26 : Special Archer Holy Eyes specialize in DoT (Damage over Time) attacks.", "Tip 27 : Sorceresses, the 2nd advanced class of Wizard, inflict Piercing damage.", "Tip 28 : Blasters, the 3rd advanced class of Wizard, _ inflict Splashed damage with their Fire magic.", "Tip 29 : Special Wizard Ice Mages attack monsters with a chance of causing Slow.", "Tip 30 : Clear all the normal stages to unlock two special modes: _ Destroy the Moon and Infinite.", "Tip 31 : A stage's Infinite Mode is only opened _ when you clear it with a perfect score.", "Tip 32 : The objective of Destroy the Moon is to destroy _ the monster gates where monsters spawn.", "Tip 33 : Destroy stage objects to obtain gold and mana.", "Tip 34 : When clearing a normal stage more than twice,_ you will receive only 70% of the Hero Point reward from the stage.", "Tip 35 : Touch a monster or object to manually attack it.", "Tip 36 : Blasters, the 3rd advanced class of Wizard, _ inflict Splashed damage with their Fire magic.", "Tip 37 : Special Wizard Ice Mages attack monsters with a chance of causing Slow.", "Tip 38 : You will receive a Hero unit or additional ability _each time you clear 5 stages.", "Tip 39 : Clear 25 stages to upgrade your units up to 10 levels.", "Tip 40 : Clear 5 stages to unlock the special skill of your Hero units.", "Tip 41 : Clear 30 stages to unlock the special attack ability _of your Hero units. (Splashed damage or Double Shot)", "Tip 42 : Never hesitate to upgrade your Heroes and basic units _ when facing a difficult stage.", "Tip 43 : Certain stages contain special items for you to discover.", "Tip 43 : Cash items endow special abilities."};
    public static boolean[] cheatData = new boolean[5];

    public static int getAttackSpeed(int i) {
        int i2 = 60 - i;
        if (i2 < 0) {
            i2 = 0;
        }
        return (i2 * 5) + 70;
    }

    public static int getLevelupHeroType(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
            case 9:
            default:
                return -1;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
        }
    }

    public static int getLevelupType(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
            case 5:
            case 8:
            case 11:
            case 14:
            case 17:
            case 20:
            case 23:
            case 26:
            case 29:
            case 32:
            default:
                return -1;
            case 3:
                return 4;
            case 4:
                return 5;
            case 6:
                return 7;
            case 7:
                return 8;
            case 9:
                return 10;
            case 10:
                return 11;
            case 12:
                return 13;
            case 13:
                return 14;
            case 15:
                return 16;
            case 16:
                return 17;
            case 18:
                return 19;
            case 19:
                return 20;
            case 21:
                return 22;
            case 22:
                return 23;
            case 24:
                return 25;
            case 25:
                return 26;
            case 27:
                return 28;
            case 28:
                return 29;
            case 30:
                return 31;
            case 31:
                return 32;
            case 33:
                return 34;
            case 34:
                return 35;
        }
    }

    public void moveGameStatusToStatus(int i, int i2) {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void update_GAME_ABOUT() {
    }

    public void update_GAME_HELP() {
    }

    public void update_GAME_NEWS_CREDITS() {
    }

    public void update_GAME_NEW_MENU_IMAGE_LOAD() {
    }

    public void update_GAME_OPTION() {
    }

    public void update_GAME_PRE_TOTAL_IMAGE_LOAD() {
    }

    public void update_GAME_RESUME_TO_PLAY() {
    }

    public GameThread(NewTower newTower2) {
        newTower = newTower2;
        m_bStop = false;
        pauseFlag = false;
        saveTotalBuffer = new byte[SAVEFILE_SIZE];
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (!m_bStop)
            try {
                if (!pauseFlag && newTower.hasWindowFocus()) {
                    NewTower.glGameSurfaceView.requestRender();
                    int i = gameLoadFlag;
                    if (i == 0 && loadingStatus >= 1000 && loadingStatus <= 1008) {
                        sleep(12L);
                        break;
                    } else if (i == 1)
                        sleep(24L);
                } else
                    sleep(1000L);
            } catch (Exception ignored) {
            }
    }

    public void updateGame() {
        if (NewTower.drmPassFlag) {
            int i = gameLoadFlag;
            if (i == 0) {
                switch (loadingStatus) {
                    case 1000:
                        update_GAME_PRE_LOAD();
                        break;
                    case 1001:
                        update_GAME_PRE_IMAGE_LOAD();
                        break;
                    case 1002:
                        update_GAME_PRE_TOTAL_IMAGE_LOAD();
                        break;
                    case 1003:
                        update_GAME_NEW_MENU_IMAGE_LOAD();
                        break;
                    case 1004:
                        update_GAME_PLAY_IMAGE_LOAD();
                        break;
                    case GAME_PLAY2_IMAGE_LOAD /* 1005 */:
                        update_GAME_PLAY2_IMAGE_LOAD();
                        break;
                    case 1006:
                        update_GAME_MENU_IMAGE_LOAD();
                        break;
                    case 1007:
                        update_GAME_RESUME_TO_MENU();
                        break;
                    case 1008:
                        update_GAME_RESUME_TO_PLAY();
                        break;
                }
            } else if (i == 1) {
                switch (gameStatus) {
                    case 0:
                        update_GAME_LOGO();
                        break;
                    case 1:
                        update_GAME_USE12();
                        break;
                    case 2:
                        update_GAME_OPENING();
                        break;
                    case 3:
                        update_GAME_TITLE();
                        break;
                    case 5:
                        update_GAME_MAINMENU();
                        break;
                    case 6:
                        update_GAME_MAINMENU_MOVING();
                        break;
                    case 7:
                        update_GAME_MAINMENU_REV_MOVING();
                        break;
                    case 8:
                        update_GAME_ABOUT();
                        break;
                    case 9:
                        update_GAME_OPTION();
                        break;
                    case 10:
                        update_GAME_STAGE_SELECT();
                        break;
                    case 11:
                        update_GAME_UPGRADE_LIST();
                        break;
                    case 12:
                        update_GAME_UPGRADE_UNIT();
                        break;
                    case 13:
                        update_GAME_UPGRADE_HERO();
                        break;
                    case 14:
                        update_GAME_SHOP_LIST();
                        break;
                    case 15:
                        update_GAME_SHOP_SHOP();
                        break;
                    case 16:
                        update_GAME_SHOP_EQUIP();
                        break;
                    case 17:
                        update_GAME_SHOP_GIFT();
                        break;
                    case 18:
                        update_GAME_HELP();
                        break;
                    case 19:
                        update_GAME_RECORD();
                        break;
                    case 20:
                        update_GAME_STAGE_START_VIEW();
                        break;
                    case 21:
                        update_GAME_INGAME_MENU();
                        break;
                    case 22:
                        update_GAME_STAGE_CLEAR();
                        break;
                    case 23:
                        update_GAME_OVER();
                        break;
                    case 24:
                        update_GAME_STAGE_START_LOADING();
                        break;
                    case 25:
                        update_GAME_PLAYING();
                        break;
                    case 26:
                        update_GAME_TUTORIAL();
                        break;
                    case 27:
                        update_GAME_ENDING();
                        break;
                }
            }
            playSound2();
        }
    }

    public void update_GAME_PRE_LOAD() {
        int i;
        if (Texture2D.gl != null) {
            AudioManager audioManager = (AudioManager) newTower.getSystemService("audio");
            mgr = audioManager;
            soundFlag = true;
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            Config.musicMaxVolume = streamMaxVolume;
            lastMusicVolume = -1;
            Config.musicVolume = streamMaxVolume / 2;
            Config.effectVolume = streamMaxVolume / 2;
            vibrationFlag = 1;
            movieViewFlag = 1;
            tutorialFlag = 0;
            GAME_LOADING_PART_STATUS = new int[6];
            myOscillator = new MyOscillator[20];
            for (int i2 = 0; i2 < 20; i2++) {
                myOscillator[i2] = new MyOscillator(0, 100, 10);
            }
            MyScrollbar[] myScrollbarArr = new MyScrollbar[5];
            myScrollbar = myScrollbarArr;
            myScrollbarArr[0] = new MyScrollbar(GameRenderer.VOLUMEBAR_START_POS_X, 679, 0, Config.musicMaxVolume);
            myScrollbar[0].setReverseUpdatePosition(Config.musicVolume);
            myScrollbar[1] = new MyScrollbar(GameRenderer.VOLUMEBAR_START_POS_X, 679, 0, Config.musicMaxVolume);
            myScrollbar[1].setReverseUpdatePosition(Config.effectVolume);
            myScrollbar[2] = new MyScrollbar(120, 370, 0, 1080);
            myScrollbar[3] = new MyScrollbar(120, 370, 0, 3480);
            myScrollbar[4] = new MyScrollbar(90, GameRenderer.GAME_SHOP_SHOP_SIDEBAR_END_Y, 0, 1820);
            mapTileData = (int[][]) Array.newInstance((Class<?>) int.class, 15, 10);
            mapMoveData = (int[][]) Array.newInstance((Class<?>) int.class, 15, 10);
            mapStartPosition = (int[][]) Array.newInstance((Class<?>) int.class, 10, 2);
            mapEndPosition = (int[][]) Array.newInstance((Class<?>) int.class, 10, 2);
            mapEndDirection = new int[10];
            monsterUnit = new MonsterUnit[100];
            monsterMeetCheck = new boolean[100];
            monsterSortUnit = new MonsterUnit[100];
            for (int i3 = 0; i3 < 100; i3++) {
                monsterUnit[i3] = new MonsterUnit();
                monsterUnit[i3].monsterSerial = i3;
                monsterSortUnit[i3] = monsterUnit[i3];
            }
            towerUnit = new TowerUnit[150];
            towerSortUnit = new TowerUnit[150];
            for (int i4 = 0; i4 < 150; i4++) {
                towerUnit[i4] = new TowerUnit();
                towerSortUnit[i4] = towerUnit[i4];
            }
            compareTowerUnit = new TowerUnit();
            objectUnit = new ObjectUnit[100];
            objectSortUnit = new ObjectUnit[100];
            for (int i5 = 0; i5 < 100; i5++) {
                objectUnit[i5] = new ObjectUnit();
                objectUnit[i5].objectSerial = i5;
                objectSortUnit[i5] = objectUnit[i5];
            }
            effectUnit = new EffectUnit[200];
            for (int i6 = 0; i6 < 200; i6++) {
                effectUnit[i6] = new EffectUnit();
            }
            arrowUnit = new ArrowUnit[200];
            for (int i7 = 0; i7 < 200; i7++) {
                arrowUnit[i7] = new ArrowUnit();
            }
            waveMonsterType = new int[2];
            waveMonsterRemainCount = new int[2];
            waveMonsterShowTime = new int[2];
            waveMonsterShowCurrent = new int[2];
            specialDataValue = (int[][]) Array.newInstance((Class<?>) int.class, 20, 4);
            shopGiftItemSerial = new int[3];
            shopGiftItemType = new int[3];
            shopGiftItemCount = new int[3];
            shopGiftPhoneNumberByte = (byte[][]) Array.newInstance((Class<?>) byte.class, 3, 25);
            shopGiftPhoneNumber = new String[3];
            for (int i8 = 0; i8 < 3; i8++) {
                shopGiftItemType[i8] = -1;
            }
            shopSendPhoneNumber = new int[11];
            upgradeUnitValue = new int[18];
            heroUnitType = new int[3];
            heroItemType = (int[][]) Array.newInstance((Class<?>) int.class, 3, 2);
            heroUpgradeValue = (int[][]) Array.newInstance((Class<?>) int.class, 3, 6);
            itemUnitValue = new int[24];
            shopUnitValue = new int[30];
            for (int i9 = 0; i9 < 3; i9++) {
                heroUnitType[i9] = -1;
                for (int i10 = 0; i10 < 2; i10++) {
                    heroItemType[i9][i10] = -1;
                }
                for (int i11 = 0; i11 < 6; i11++) {
                    heroUpgradeValue[i9][i11] = 0;
                }
            }
            for (int i12 = 0; i12 < 30; i12++) {
                shopUnitValue[i12] = -1;
            }
            stageSelectChapterNumber = 0;
            stageSelectStageNumber = 0;
            for (int i13 = 0; i13 < 24; i13++) {
                itemUnitValue[i13] = -1;
            }
            myHeroism = 0;
            freeAdViewCount = 5;
            freeAdViewTime = System.currentTimeMillis();
            waveMobData = (int[][]) Array.newInstance((Class<?>) int.class, WAVE_MAX_COUNT, 8);
            highScoreValue = (int[][]) Array.newInstance((Class<?>) int.class, 50, 3);
            gamePlayedCount = (int[][]) Array.newInstance((Class<?>) int.class, 50, 3);
            gameClearedFlag = (int[][]) Array.newInstance((Class<?>) int.class, 50, 3);
            gamePerfectFlag = (int[][]) Array.newInstance((Class<?>) int.class, 50, 3);
            for (int i14 = 0; i14 < 50; i14++) {
                int[][] iArr = gamePlayedCount;
                iArr[i14][0] = -1;
                iArr[i14][1] = -1;
                iArr[i14][2] = -1;
            }
            gamePlayedCount[0][0] = 0;
            rewardDataValue = new int[10];
            awardDataValue = new int[62];
            awardDataFlag = new int[62];
            tutorialBoxTouchFlag = new int[22];
            soundPlayCheckFlag = new boolean[31];
            soundPlayDelayCount = new int[31];
            for (int i15 = 0; i15 < 31; i15++) {
                soundPlayCheckFlag[i15] = false;
                soundPlayDelayCount[i15] = 0;
            }
            MediaManager[] mediaManagerArr = new MediaManager[3];
            bgmMedia = mediaManagerArr;
            mediaManagerArr[0] = new MediaManager(newTower, R.raw.bgm_1);
            bgmMedia[1] = new MediaManager(newTower, R.raw.bgm_2);
            bgmMedia[2] = new MediaManager(newTower, R.raw.bgm_3);
            MediaManager2 mediaManager2 = new MediaManager2(31);
            effectMedia = mediaManager2;
            mediaManager2.setMediaFile(0, newTower, R.raw.snlogo, false);
            effectMedia.setMediaFile(1, newTower, R.raw.att_1, false);
            effectMedia.setMediaFile(2, newTower, R.raw.att_2, false);
            effectMedia.setMediaFile(3, newTower, R.raw.att_3, false);
            effectMedia.setMediaFile(4, newTower, R.raw.att_4, false);
            effectMedia.setMediaFile(5, newTower, R.raw.att_5, false);
            effectMedia.setMediaFile(6, newTower, R.raw.att_6, false);
            effectMedia.setMediaFile(7, newTower, R.raw.att_7, false);
            effectMedia.setMediaFile(8, newTower, R.raw.att_8, false);
            effectMedia.setMediaFile(9, newTower, R.raw.att_9, false);
            effectMedia.setMediaFile(10, newTower, R.raw.etc_1, false);
            effectMedia.setMediaFile(11, newTower, R.raw.etc_2, false);
            effectMedia.setMediaFile(12, newTower, R.raw.etc_3, false);
            effectMedia.setMediaFile(13, newTower, R.raw.etc_4, false);
            effectMedia.setMediaFile(14, newTower, R.raw.etc_5, false);
            effectMedia.setMediaFile(15, newTower, R.raw.etc_6, false);
            effectMedia.setMediaFile(16, newTower, R.raw.etc_7, false);
            effectMedia.setMediaFile(17, newTower, R.raw.etc_8, false);
            effectMedia.setMediaFile(18, newTower, R.raw.etc_9, false);
            effectMedia.setMediaFile(19, newTower, R.raw.etc_10, false);
            effectMedia.setMediaFile(20, newTower, R.raw.etc_11, false);
            effectMedia.setMediaFile(21, newTower, R.raw.voice_1, false);
            effectMedia.setMediaFile(22, newTower, R.raw.voice_2, false);
            effectMedia.setMediaFile(23, newTower, R.raw.voice_3, false);
            effectMedia.setMediaFile(24, newTower, R.raw.voice_4, false);
            effectMedia.setMediaFile(25, newTower, R.raw.voice_5, false);
            effectMedia.setMediaFile(26, newTower, R.raw.voice_6, false);
            effectMedia.setMediaFile(27, newTower, R.raw.voice_7, false);
            effectMedia.setMediaFile(28, newTower, R.raw.voice_8, false);
            effectMedia.setMediaFile(29, newTower, R.raw.voice_9, false);
            effectMedia.setMediaFile(30, newTower, R.raw.spebladehit, false);
            gameTimeCount = 0;
            startDate = System.currentTimeMillis();
            lastFrameCount = 0;
            currentFrameCount = 0;
            startDrawDate = System.currentTimeMillis();
            realDrawCount = 0;
            lastDrawCount = 0;
            characterMenuSelectFlag = 0;
            GameRenderer.setFontColor(SupportMenu.CATEGORY_MASK);
            GameRenderer.setFontSize(50);
            GameRenderer.textTombstone.removeAllTombstones();
            GameRenderer.lastFontName = null;
            GameRenderer.makeBaseStruct();
            readSaveData(newTower);
            myScrollbar[0].setReverseUpdatePosition(Config.musicVolume);
            myScrollbar[1].setReverseUpdatePosition(Config.effectVolume);
            if (lastPlayedMapNumber >= 50) {
                lastPlayedMapNumber = 0;
            }
            int i16 = lastPlayedMapNumber;
            stageSelectChapterNumber = i16 / 10;
            stageSelectStageNumber = i16 % 10;
            if (rewardDataValue[0] == 1) {
                heroUnitType[0] = 0;
                i = -1;
            } else {
                i = -1;
                heroUnitType[0] = -1;
            }
            if (rewardDataValue[2] == 1) {
                heroUnitType[1] = 5;
            } else {
                heroUnitType[1] = i;
            }
            if (rewardDataValue[4] == 1) {
                heroUnitType[2] = 10;
            } else {
                heroUnitType[2] = i;
            }
            GameRenderer.logoSoundPlayFlag = false;
            GameRenderer.lastCheckTime = System.currentTimeMillis();
            cheatFlag = false;
            GameRenderer.loadCount_GAME_PRE_IMAGE_LOAD = 0;
            gameLoadFlag = 0;
            loadingStatus = 1001;
            GameRenderer.loadingViewType = getRandom(6);
            loadTipNumber = getRandom(TIP_TEXT.length);
            returnGameStatus = 0;
            return;
        }
        Log.d("UPDATE", "GL NO!!!");
    }

    public void update_GAME_PRE_IMAGE_LOAD() {
        GameRenderer.logoSoundPlayFlag = false;
        GameRenderer.lastCheckTime = System.currentTimeMillis();
    }

    public void update_GAME_PLAY_IMAGE_LOAD() {
        newTower.HideAdMob();
    }

    public void update_GAME_PLAY2_IMAGE_LOAD() {
        newTower.HideAdMob();
    }

    public void update_GAME_MENU_IMAGE_LOAD() {
        newTower.HideAdMob();
    }

    public void update_GAME_RESUME_TO_MENU() {
        newTower.HideAdMob();
    }

    public void update_GAME_PLAYBEAN() {
        GameRenderer.currentCheckTime = System.currentTimeMillis();
        if ((GameRenderer.currentCheckTime - GameRenderer.lastCheckTime) / 1000 > 3) {
            GameRenderer.logoSoundPlayFlag = false;
            GameRenderer.lastCheckTime = System.currentTimeMillis();
            gameStatus = 0;
        }
    }

    public void update_GAME_LOGO() {
        GameRenderer.currentCheckTime = System.currentTimeMillis();
        int i = (int) (((GameRenderer.currentCheckTime - GameRenderer.lastCheckTime) * 12) / 1000);
        if (!GameRenderer.logoSoundPlayFlag && i == 16) {
            GameRenderer.logoSoundPlayFlag = true;
            playSound(0);
        }
        if (i > 40) {
            GameRenderer.logoSoundPlayFlag = false;
            GameRenderer.lastCheckTime = System.currentTimeMillis();
            gameStatus = 1;
        }
    }

    public void update_GAME_USE12() {
        GameRenderer.currentCheckTime = System.currentTimeMillis();
        if (GameRenderer.currentCheckTime - GameRenderer.lastCheckTime > 2000) {
            if (movieViewFlag == 1) {
                gameSubStatus = 0;
                setOpeningData(0);
                gameStatus = 2;
                playLoopSound(2);
                return;
            }
            gameLoadFlag = 0;
            loadingStatus = 1002;
            loadTipNumber = getRandom(TIP_TEXT.length);
            GameRenderer.loadCount_GAME_PRE_TOTAL_IMAGE_LOAD = 0;
            GameRenderer.loadingViewType = getRandom(6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update_GAME_OPENING() {
        int[] iArr = storyDrawDataBlock;
        if (iArr[27] < iArr[18])
            iArr[27] = iArr[27] + 1;
        else if (iArr[19] > 0)
            iArr[19] = iArr[19] - 1;
        else if (iArr[25] > 0)
            iArr[25] = iArr[25] - 1;
        else {
            if (iArr[26] >= iArr[21]) {
                if (gameSubStatus < 25)
                    setOpeningData(gameSubStatus++);
                else if (gameSubStatus == 25) {
                    stopLoopSound(2);
                    gameStatus = 1002;
                    gameLoadFlag = 0;
                    loadingStatus = 1002;
                    loadTipNumber = getRandom(TIP_TEXT.length);
                    GameRenderer.loadCount_GAME_PRE_TOTAL_IMAGE_LOAD = 0;
                    GameRenderer.loadingViewType = getRandom(6);
                }
                return;
            }
            iArr[26] = iArr[26] + 1;
            iArr[25] = 70;
        }
    }

    public void update_GAME_ENDING() {
        int[] iArr = story2DrawDataBlock;
        boolean z = false;
        if (iArr[9] < iArr[0]) {
            iArr[9] = iArr[9] + 1;
        } else if (iArr[1] > 0) {
            iArr[1] = iArr[1] - 1;
        } else if (iArr[7] > 0) {
            iArr[7] = iArr[7] - 1;
        } else if (iArr[8] < iArr[3]) {
            iArr[8] = iArr[8] + 1;
            iArr[7] = 70;
        } else {
            z = true;
        }
        if (z) {
            int i = gameSubStatus;
            if (i == 0) {
                gameSubStatus = 1;
                setEndingData(1);
            } else if (i == 1) {
                gameSubStatus = 2;
                setEndingData(2);
            } else {
                if (i != 2) {
                    return;
                }
                gameSubStatus = 3;
                setEndingData(3);
            }
        }
    }

    public void update_GAME_MAINMENU() {
        myOscillator[11].updatePosition();
        newTower.ViewAdMob();
    }

    public void update_GAME_MAINMENU_MOVING() {
        GameRenderer.titleCount++;
        if (GameRenderer.titleCount >= GameRenderer.TITLE_MAINMENU_COUNT_SHORT_MOVE_MAX_COUNT) {
            int i = GameRenderer.titlePressed;
            if (i == 10) {
                newTower.HideAdMob();
                if (tutorialFlag == 0) {
                    loadMap(50, false);
                    gameLoadFlag = 0;
                    loadingStatus = GAME_PLAY2_IMAGE_LOAD;
                    loadTipNumber = getRandom(TIP_TEXT.length);
                    GameRenderer.loadCount_GAME_PLAY_IMAGE_LOAD = 0;
                    GameRenderer.loadingViewType = getRandom(6);
                    stopLoopSound(0);
                    for (int i2 = 0; i2 < 22; i2++) {
                        tutorialBoxTouchFlag[i2] = 0;
                    }
                } else {
                    gameLoadFlag = 0;
                    loadingStatus = 1004;
                    loadTipNumber = getRandom(TIP_TEXT.length);
                    GameRenderer.loadCount_GAME_PLAY_IMAGE_LOAD = 0;
                    GameRenderer.loadingViewType = getRandom(6);
                    stopLoopSound(1);
                }
            } else if (i == 18) {
                gameStatus = 18;
                gameHelpViewNum = 0;
            } else if (i == 19) {
                recheckAwardData();
                gameStatus = 19;
                gameSubStatus = 0;
            }
        }
        if (GameRenderer.titleCount >= GameRenderer.TITLE_MAINMENU_COUNT_MOVE_MAX_COUNT) {
            switch (GameRenderer.titlePressed) {
                case 11:
                    gameStatus = 11;
                    return;
                case 12:
                    gameStatus = 12;
                    upgradeUnitSelectPos = 0;
                    return;
                case 13:
                default:
                    return;
                case 14:
                    gameStatus = 14;
                    return;
                case 15:
                    gameStatus = 15;
                    gameSubStatus = 0;
                    shopShopItemSelectPos = 0;
                    getShopList();
            }
        }
    }

    public void update_GAME_MAINMENU_REV_MOVING() {
        newTower.HideAdMob();
        GameRenderer.titleCount++;
        if (GameRenderer.titleCount >= GameRenderer.TITLE_MAINMENU_REV_COUNT_MOVE_MAX_COUNT) {
            gameStatus = 5;
        }
    }

    public void update_GAME_STAGE_SELECT() {
        if (gameSubStatus == 1 && GameRenderer.startViewCount > 0) {
            GameRenderer.startViewCount++;
            if (GameRenderer.startViewCount >= 15) {
                gameStatus = 24;
                stopLoopSound(1);
            }
        }
        newTower.ViewAdMob();
    }

    public void update_GAME_STAGE_START_LOADING() {
        Log.d("ViewAdMob", "update_GAME_STAGE_START_LOADING");
        newTower.bViewAdMob = false;
        characterMenuSelectFlag = 0;
        int i = stageSelectChapterNumber;
        int i2 = stageSelectStageNumber;
        lastPlayedMapNumber = (i * 10) + i2;
        loadMap((i * 10) + i2, true);
        clearMonsterUnit();
        clearTowerUnit();
        clearEffectUnit();
        clearArrowUnit();
        gameStartStatSetting();
        int[][] iArr = gamePlayedCount;
        int i3 = mapNumber;
        int[] iArr2 = iArr[i3];
        int i4 = mapAttackType;
        iArr2[i4] = iArr2[i4] + 1;
        if (iArr[i3][i4] > 3) {
            int[] iArr3 = awardDataValue;
            iArr3[52] = iArr3[52] + 1;
            recheckAwardData();
        }
        timeSave();
        writeSaveData(newTower, 0);
        writeSaveData(newTower, 1);
        gameStatus = 20;
        GameRenderer.startViewCount = 0;
        myOscillator[0].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
        myOscillator[1].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
        myOscillator[2].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
        myOscillator[3].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
        myOscillator[4].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
        myOscillator[5].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
        myOscillator[6].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
        myOscillator[7].initWithTwoWayStartPosition(200, 0, 10, -10, 5);
        myOscillator[8].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
        myOscillator[9].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
        myOscillator[10].initWithTwoWayStartPosition(0, 300, 10, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 5);
        for (int i5 = 0; i5 < 11; i5++) {
            myOscillator[i5].fastForward();
        }
        playLoopSound(2);
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
                    return;
                } else {
                    gameSubStatus = 1;
                    return;
                }
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

    public boolean checkTowerPos(int i, int i2, int i3) {
        int i4 = ((i2 * 45) + 22) * 50;
        int i5 = ((i3 * 45) + 22) * 50;
        for (int i6 = 0; i6 < towerUnitCount; i6++) {
            if (towerUnit[i6].towerType == i && i4 == towerUnit[i6].posX && i5 == towerUnit[i6].posY) {
                return true;
            }
        }
        return false;
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
        int i;
        for (int i2 = 0; i2 < 11; i2++) {
            myOscillator[i2].updatePosition();
        }
        if (GameRenderer.upgradeCount > 0) {
            GameRenderer.upgradeCount--;
        }
        if (GameRenderer.levelUpCount > 0) {
            GameRenderer.levelUpCount--;
        }
        if (GameRenderer.specialBlinkCount > 0) {
            GameRenderer.specialBlinkCount--;
        }
        if (GameRenderer.monsterGoalBlinkCount > 0) {
            GameRenderer.monsterGoalBlinkCount--;
        }
        int i3 = monsterOpenTime;
        if (i3 > 0) {
            monsterOpenTime = i3 - 1;
        }
        switch (characterMenuSelectFlag) {
            case 2:
            case 5:
            case 6:
            case 12:
            case 13:
                int i4 = turboFlag;
                if (i4 <= 0) {
                    i4 = 1;
                }
                for (int i5 = 0; i5 < i4; i5++) {
                    updateEffectUnit(true);
                }
                break;
            case 3:
            case 4:
            case 7:
            case 11:
            default:
                if (myWaveRunFlag) {
                    if (myWaveStartCount > 0) {
                        for (int i6 = 0; i6 < turboFlag; i6++) {
                            int i7 = myWaveStartCount - 1;
                            myWaveStartCount = i7;
                            if (i7 == 0) {
                                if (wavePattern == 3) {
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
                            for (int i9 = 0; i9 < turboFlag; i9++) {
                                updateEffectUnit(false);
                                updateArrowUnit();
                                updateTowerUnit();
                                updateObjectUnit();
                            }
                        } else {
                            for (int i10 = 0; i10 < turboFlag; i10++) {
                                monsterWaveUpdate();
                                updateEffectUnit(false);
                                updateArrowUnit();
                                if (updateMonsterUnit()) {
                                    sortTowerEnemyUnit();
                                    gameStatus = 23;
                                    GameRenderer.startViewCount = 0;
                                    gameSubStatus = 0;
                                    stopLoopSound(2);
                                    playSound(11);
                                    setClearPointAndHighscore();
                                    int i11 = mapAttackType;
                                    if (i11 == 0) {
                                        stageClearViewHeroism = (myWave * 8) + (myLife * 10);
                                    } else if (i11 == 1) {
                                        stageClearViewHeroism = myWave * 15;
                                    } else if (i11 == 2) {
                                        int[] iArr = DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL;
                                        int i12 = mapNumber;
                                        stageClearViewHeroism = (((iArr[i12] - myWave) * 8) * (i12 + 15)) / 15;
                                    }
                                    if (gameClearedFlag[mapNumber][0] >= 0) {
                                        stageClearViewHeroism = (stageClearViewHeroism * 7) / 10;
                                    }
                                    stageClearViewHeroism = 50;
                                    myHeroism += 50;
                                    timeSave();
                                    writeSaveData(newTower, 0);
                                    writeSaveData(newTower, 1);
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
                if (myWaveRunFlag) {
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
        int checkWaveAndFinishCheck = checkWaveAndFinishCheck();
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
            int i15 = mapAttackType;
            if (i15 == 0) {
                stageClearViewHeroism = (myWave * 8) + (myLife * 10);
            } else if (i15 == 1) {
                stageClearViewHeroism = myWave * 15;
            } else if (i15 == 2) {
                stageClearViewHeroism = myWave * 5;
            }
            if (myLife == maxLife)
                stageClearViewHeroism *= 2;

            myHeroism += stageClearViewHeroism;
            timeSave();
            writeSaveData(newTower, 0);
            writeSaveData(newTower, 1);
            myOscillator[11].initWithTwoWayStartPosition(-350, 0, 15, 30, 10);
            return;
        }
        stopLoopSound(2);
        playSound(10);
        int i16 = mapNumber;
        if (i16 + 1 < 50) {
            gamePlayedCount[i16 + 1][0] = 0;
        }
        int[][] iArr2 = gamePlayedCount;
        int i17 = mapNumber;
        if (iArr2[i17][1] == -1) {
            iArr2[i17][1] = 0;
        }
        if (myLife == maxLife) {
            int[][] iArr3 = gamePlayedCount;
            int i18 = mapNumber;
            if (iArr3[i18][2] == -1) {
                iArr3[i18][2] = 0;
            }
        }
        int[][] iArr4 = gameClearedFlag;
        int i19 = mapNumber;
        int[] iArr5 = iArr4[i19];
        int i20 = mapAttackType;
        iArr5[i20] = iArr5[i20] + 1;
        if (myLife == maxLife) {
            gamePerfectFlag[i19][i20] = 1;
        }
        if (myLife == 1) {
            int[] iArr6 = awardDataValue;
            iArr6[23] = iArr6[23] + 1;
        }
        for (int i21 = 0; i21 < towerUnitCount; i21++) {
            if (towerUnit[i21].towerType != -1 && towerUnit[i21].attackCount == 0) {
                int[] iArr7 = awardDataValue;
                iArr7[25] = iArr7[25] + 1;
            }
        }
        int i22 = 0;
        for (int i23 = 0; i23 < towerUnitCount; i23++) {
            if (towerUnit[i23].towerType != -1 && towerUnit[i23].heroFlag == 0) {
                switch (towerUnit[i23].towerType) {
                    case 0:
                    case 1:
                    case 2:
                        i22 |= 1;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        i22 |= 2;
                        break;
                    case 6:
                    case 7:
                    case 8:
                        i22 |= 4;
                        break;
                    case 9:
                    case 10:
                    case 11:
                        i22 |= 8;
                        break;
                    case 12:
                    case 13:
                    case 14:
                        i22 |= 16;
                        break;
                    case 15:
                    case 16:
                    case 17:
                        i22 |= 32;
                        break;
                    case 18:
                    case 19:
                    case 20:
                        i22 |= 64;
                        break;
                    case 21:
                    case 22:
                    case 23:
                        i22 |= 128;
                        break;
                    case 24:
                    case 25:
                    case 26:
                        i22 |= 256;
                        break;
                    case 27:
                    case 28:
                    case 29:
                        i22 |= 512;
                        break;
                    case 30:
                    case 31:
                    case 32:
                        i22 |= 1024;
                        break;
                    case 33:
                    case 34:
                    case 35:
                        i22 |= 2048;
                        break;
                }
            }
        }
        if (i22 == 4095) {
            int[] iArr8 = awardDataValue;
            iArr8[26] = iArr8[26] + 1;
        }
        boolean z = true;
        for (int i24 = 0; i24 < towerUnitCount; i24++) {
            if (towerUnit[i24].towerType != -1 && towerUnit[i24].heroFlag == 0) {
                switch (towerUnit[i24].towerType) {
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
                        break;
                    default:
                        z = false;
                        break;
                }
            }
        }
        if (z) {
            int[] iArr9 = awardDataValue;
            iArr9[27] = iArr9[27] + 1;
        }
        boolean z2 = true;
        for (int i25 = 0; i25 < towerUnitCount; i25++) {
            if (towerUnit[i25].towerType != -1 && towerUnit[i25].heroFlag == 0) {
                switch (towerUnit[i25].towerType) {
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        z2 = false;
                        break;
                }
            }
        }
        if (z2) {
            int[] iArr10 = awardDataValue;
            iArr10[28] = iArr10[28] + 1;
        }
        boolean z3 = true;
        for (int i26 = 0; i26 < towerUnitCount; i26++) {
            if (towerUnit[i26].towerType != -1 && towerUnit[i26].heroFlag == 0) {
                switch (towerUnit[i26].towerType) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                        break;
                    default:
                        z3 = false;
                        break;
                }
            }
        }
        if (z3) {
            int[] iArr11 = awardDataValue;
            iArr11[29] = iArr11[29] + 1;
        }
        setClearPointAndHighscore();
        int i27 = mapAttackType;
        if (i27 == 0) {
            stageClearViewHeroism = (mapNumber * 20) + 50 + (DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[mapNumber] * 8) + (myLife * 10);
        } else if (i27 == 1) {
            stageClearViewHeroism = 0;
        } else if (i27 == 2) {
            stageClearViewHeroism = (mapNumber * 10) + 0 + (myWave * 8) + (myLife * 3);
        }
        stageClearViewHeroism = 100;
        int i28 = myHeroism + 100;
        myHeroism = i28;
        rewardShowFlag = false;
        if (mapNumber == 14) {
            int[] iArr12 = rewardDataValue;
            if (iArr12[1] == 0) {
                rewardShowOrder = 1;
                iArr12[1] = 1;
                rewardShowFlag = true;
                myHeroism = i28 + ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            }
        }
        if (mapNumber == 9) {
            int[] iArr13 = rewardDataValue;
            if (iArr13[2] == 0) {
                rewardShowOrder = 2;
                iArr13[2] = 1;
                heroUnitType[1] = 5;
                rewardShowFlag = true;
            }
        }
        if (mapNumber == 4) {
            int[] iArr14 = rewardDataValue;
            if (iArr14[3] == 0) {
                rewardShowOrder = 3;
                iArr14[3] = 1;
                rewardShowFlag = true;
            }
        }
        if (mapNumber == 24) {
            int[] iArr15 = rewardDataValue;
            if (iArr15[4] == 0) {
                rewardShowOrder = 4;
                iArr15[4] = 1;
                heroUnitType[2] = 10;
                rewardShowFlag = true;
            }
        }
        if (mapNumber == 19) {
            int[] iArr16 = rewardDataValue;
            if (iArr16[5] == 0) {
                rewardShowOrder = 5;
                iArr16[5] = 1;
                rewardShowFlag = true;
            }
        }
        if (mapNumber == 29) {
            int[] iArr17 = rewardDataValue;
            if (iArr17[6] == 0) {
                rewardShowOrder = 6;
                iArr17[6] = 1;
                rewardShowFlag = true;
            }
        }
        if (mapNumber == 34) {
            int[] iArr18 = rewardDataValue;
            if (iArr18[7] == 0) {
                rewardShowOrder = 7;
                iArr18[7] = 1;
                rewardShowFlag = true;
                myHeroism += 1000;
            }
        }
        if (mapNumber == 39) {
            int[] iArr19 = rewardDataValue;
            if (iArr19[8] == 0) {
                rewardShowOrder = 8;
                iArr19[8] = 1;
                rewardShowFlag = true;
                getItem(15);
            }
        }
        if (mapNumber == 44) {
            int[] iArr20 = rewardDataValue;
            if (iArr20[9] == 0) {
                rewardShowOrder = 9;
                iArr20[9] = 1;
                rewardShowFlag = true;
                myHeroism += 2500;
            }
        }
        recheckAwardData();
        timeSave();
        writeSaveData(newTower, 0);
        writeSaveData(newTower, 1);
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

    public void setClearPointAndHighscore() {
        if (myLife == maxLife) {
            destroyScore *= MYSCORE_PERPECT_CLEAR_RATE;
        }
        int i = (int) destroyScore;
        myScore = i;
        int i2 = i + (myLife * 1000);
        myScore = i2;
        int i3 = i2 + (myMoney * 10);
        myScore = i3;
        int i4 = i3 + (myMana * 30);
        myScore = i4;
        int[][] iArr = highScoreValue;
        int i5 = mapNumber;
        int[] iArr2 = iArr[i5];
        int i6 = mapAttackType;
        if (i4 > iArr2[i6]) {
            iArr[i5][i6] = i4;
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

    public void update_GAME_TITLE() {
        gameTitleViewCount++;
        newTower.HideAdMob();
        switch (gameSubStatus) {
            case 0:
                if (gameTitleViewCount >= 17) {
                    gameSubStatus = 1;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 1:
                if (gameTitleViewCount >= 2) {
                    gameSubStatus = 2;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 2:
                if (gameTitleViewCount >= 7) {
                    gameSubStatus = 3;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 3:
                if (gameTitleViewCount >= 2) {
                    gameSubStatus = 4;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 4:
                if (gameTitleViewCount >= 7) {
                    gameSubStatus = 5;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 5:
                if (gameTitleViewCount >= 2) {
                    gameSubStatus = 6;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 6:
                if (gameTitleViewCount >= 17) {
                    gameSubStatus = 7;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 7:
                if (gameTitleViewCount >= 2) {
                    gameSubStatus = 8;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 8:
                if (gameTitleViewCount >= 15) {
                    gameSubStatus = 9;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 9:
                if (gameTitleViewCount >= 30) {
                    gameSubStatus = 10;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 10:
                if (gameTitleViewCount >= 30) {
                    gameSubStatus = 11;
                    gameTitleViewCount = 0;
                    return;
                }
                return;
            case 11:
                if (gameTitleViewCount >= 10) {
                    gameSubStatus = 12;
                    gameTitleViewCount = 0;
                    playLoopSound(0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void update_GAME_UPGRADE_LIST() {
        newTower.ViewAdMob();
    }

    public void update_GAME_UPGRADE_UNIT() {
        newTower.HideAdMob();
        int i = lastUpdateItemViewDelay;
        if (i > 0) {
            lastUpdateItemViewDelay = i - 1;
        }
    }

    public void update_GAME_UPGRADE_HERO() {
        newTower.HideAdMob();
        int i = lastUpdateItemViewDelay;
        if (i > 0) {
            lastUpdateItemViewDelay = i - 1;
        }
    }

    public void update_GAME_SHOP_LIST() {
        newTower.ViewAdMob();
    }

    public void update_GAME_SHOP_SHOP() {
        newTower.HideAdMob();
        GameRenderer.upgradeItemListDraw.correctDistance();
        GameRenderer.inventoryItemListDraw.correctDistance();
    }

    public void update_GAME_SHOP_EQUIP() {
        newTower.HideAdMob();
        GameRenderer.inventoryItemListDraw.correctDistance();
        int i = viewCount_GAME_SHOP_EQUIP;
        if (i < 30) {
            viewCount_GAME_SHOP_EQUIP = i + 1;
        }
    }

    public void update_GAME_SHOP_GIFT() {
        GameRenderer.inventoryItemListDraw.correctDistance();
    }

    public void update_GAME_RECORD() {
        GameRenderer.rankListDraw.correctDistance();
        GameRenderer.awardListDraw.correctDistance();
    }

    public static void loadMap(int i, boolean z) {
        int i2;
        mapNumber = i;
        lastPlayedMapNumber = i;
        clearObjectUnit();
        byte[] bArr = null;
        try {
            InputStream openRawResource = newTower.getResources().openRawResource(mapDataResource[i]);
            int available = openRawResource.available();
            bArr = new byte[available];
            int i3 = 0;
            do {
                int read = openRawResource.read(bArr, i3, available - i3);
                if (read <= 0) {
                    break;
                } else {
                    i3 += read;
                }
            } while (i3 < available);
            openRawResource.close();
        } catch (Exception unused) {
        }
        for (int i4 = 0; i4 < 10; i4++) {
            for (int i5 = 0; i5 < 15; i5++) {
                mapTileData[i5][i4] = bArr[(i4 * 15) + i5];
            }
        }
        for (int i6 = 0; i6 < 10; i6++) {
            for (int i7 = 0; i7 < 15; i7++) {
                mapMoveData[i7][i6] = bArr[(i6 * 15) + 150 + i7];
            }
        }
        for (int i8 = 0; i8 < 10; i8++) {
            for (int i9 = 0; i9 < 15; i9++) {
                int i10 = (i8 * 15) + 300 + i9;
                if (bArr[i10] != -1) {
                    addObjectUnit(bArr[i10], i9, i8, true);
                }
            }
        }
        byte b = bArr[450];
        mapStartPositionCount = b;
        int i11 = 0;
        while (true) {
            i2 = mapStartPositionCount;
            if (i11 >= i2) {
                break;
            }
            int[][] iArr = mapStartPosition;
            int i12 = (i11 * 2) + 451;
            iArr[i11][0] = bArr[i12];
            iArr[i11][1] = bArr[i12 + 1];
            i11++;
        }
        for (int i13 = i2 - 1; i13 > 0; i13--) {
            int i14 = i13 - 1;
            while (true) {
                if (i14 >= 0) {
                    int[][] iArr2 = mapStartPosition;
                    if (iArr2[i14][0] == iArr2[i13][0] && iArr2[i14][1] == iArr2[i13][1]) {
                        mapStartPositionCount--;
                        break;
                    }
                    i14--;
                }
            }
        }
        for (int i15 = 0; i15 < mapStartPositionCount; i15++) {
            int[][] iArr3 = mapMoveData;
            int[][] iArr4 = mapStartPosition;
            if ((4 & iArr3[iArr4[i15][0]][iArr4[i15][1]]) != 0) {
                addObjectUnit(207, iArr4[i15][0], iArr4[i15][1], true);
            } else if ((iArr3[iArr4[i15][0]][iArr4[i15][1]] & 16) != 0) {
                addObjectUnit(200, iArr4[i15][0], iArr4[i15][1], true);
            } else if ((iArr3[iArr4[i15][0]][iArr4[i15][1]] & 64) != 0) {
                addObjectUnit(201, iArr4[i15][0], iArr4[i15][1], true);
            }
        }
        int i16 = b * 2;
        mapEndPositionCount = bArr[i16 + LOAD_MAP_START_COUNT + 1];
        for (int i17 = 0; i17 < mapEndPositionCount; i17++) {
            int[][] iArr5 = mapEndPosition;
            int i18 = i16 + 452 + (i17 * 2);
            iArr5[i17][0] = bArr[i18];
            iArr5[i17][1] = bArr[i18 + 1];
            int i19 = iArr5[i17][0] - 1;
            int i20 = iArr5[i17][1];
            if (i19 >= 0 && (mapMoveData[i19][i20] & 4) != 0) {
                addObjectUnit(GameRenderer.GAME_SHOP_EQUIP_SKILL_START_X, iArr5[i17][0], iArr5[i17][1], true);
                mapEndDirection[i17] = 203;
            } else {
                int[][] iArr6 = mapEndPosition;
                int i21 = iArr6[i17][0] + 1;
                int i22 = iArr6[i17][1];
                if (i21 < 15 && (mapMoveData[i21][i22] & 64) != 0) {
                    addObjectUnit(208, iArr6[i17][0], iArr6[i17][1], true);
                    mapEndDirection[i17] = 208;
                } else {
                    int[][] iArr7 = mapEndPosition;
                    addObjectUnit(202, iArr7[i17][0], iArr7[i17][1] + 1, true);
                    mapEndDirection[i17] = 202;
                }
            }
        }
        mapStartPositionLoop = 0;
        int i23 = i / 10;
        mapBackgroundType = i23;
        if (i23 >= 5) {
            GameRenderer.lastShowBackBase = 0;
        } else {
            GameRenderer.lastShowBackBase = i23;
        }
        int i24 = mapBackgroundType;
        if (i24 == 0) {
            GameRenderer.backTileOldImage = GameRenderer.backTileImage0;
        } else if (i24 == 1) {
            GameRenderer.backTileOldImage = GameRenderer.backTileImage1;
        } else if (i24 == 2) {
            GameRenderer.backTileOldImage = GameRenderer.backTileImage2;
        } else if (i24 == 3) {
            GameRenderer.backTileOldImage = GameRenderer.backTileImage3;
        } else if (i24 == 4) {
            GameRenderer.backTileOldImage = GameRenderer.backTileImage4;
        } else {
            GameRenderer.backTileOldImage = GameRenderer.backTileImage0;
        }
        if (z) {
            loadWave(i);
        }
    }

    public static void loadWave(int i) {
        byte[] bArr = null;
        try {
            InputStream openRawResource = newTower.getResources().openRawResource(waveDataResource[i]);
            int available = openRawResource.available();
            bArr = new byte[available];
            int i2 = 0;
            do {
                int read = openRawResource.read(bArr, i2, available - i2);
                if (read <= 0) {
                    break;
                } else {
                    i2 += read;
                }
            } while (i2 < available);
            openRawResource.close();
        } catch (Exception unused) {
        }
        int ByteArrayToInt = ByteArrayToInt(bArr, 0);
        for (int i3 = 0; i3 < ByteArrayToInt; i3++) {
            for (int i4 = 0; i4 < 8; i4++) {
                waveMobData[i3][i4] = ByteArrayToInt(bArr, (i3 * 32) + 4 + (i4 * 4));
            }
        }
    }

    public static int ByteArrayToInt(byte[] bArr, int i) {
        ByteBuffer.allocate(4);
        byte[] bArr2 = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr2[i2] = bArr[(i + 3) - i2];
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        wrap.order(ByteOrder.BIG_ENDIAN);
        return wrap.getInt();
    }

    public static long ByteArrayToLong(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            j = (j << 8) | (bArr[i + i2] & 255);
        }
        return j;
    }

    public static void IntToByteArray(byte[] bArr, int sect, int num) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[sect + i3] = (byte) ((num >> (i3 * 8)) & 255);
        }
    }

    public static void LongToByteArray(byte[] bArr, int i, long j) {
        for (int i2 = 7; i2 >= 0; i2--) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }

    //TODO - Replace with stage constructor
    public static void gameStartStatSetting() {
        myMoney = (DataStage.stageData[mapNumber][0] * (getUpgradeUnitRate(0, 0) + 100)) / 100;
        int upgradeUnitRate = (DataStage.stageData[mapNumber][1] * (getUpgradeUnitRate(0, 1) + 100)) / 100;
        myMana = upgradeUnitRate;
        destroyScore = 0.0f;
        myScore = 0;
        myLife = 20;
        maxLife = 20;
        if (cheatData[2]) {
            myMoney += 99999;
            myMana = upgradeUnitRate + 99999;
            myLife = MAP_DEPTH_DATA_MAX;
            maxLife = MAP_DEPTH_DATA_MAX;
        }
        if (rewardDataValue[0] == 1) {
            heroUnitType[0] = 0;
        } else {
            heroUnitType[0] = -1;
        }
        if (rewardDataValue[2] == 1) {
            heroUnitType[1] = 5;
        } else {
            heroUnitType[1] = -1;
        }
        if (rewardDataValue[4] == 1) {
            heroUnitType[2] = 10;
        } else {
            heroUnitType[2] = -1;
        }
        myWave = 0;
        myWaveCount = 0;
        myWaveStartCount = 90;
        myWavePerfectFlag = true;
        GameRenderer.upgradeCount = 0;
        GameRenderer.levelUpCount = 0;
        GameRenderer.specialBlinkCount = 0;
        GameRenderer.monsterGoalBlinkCount = 0;
        myWaveRunFlag = true;
        turboFlag = 1;
        monsterOpenTime = 0;
        tempCharacterRangeViewNumber = -1;
        commonTargetType = -1;
        setCurrentWave();
    }

    public static void setEquipHeroSetting() {
        towerUnitCount = 0;
        if (rewardDataValue[0] == 1) {
            heroUnitType[0] = 0;
        } else {
            heroUnitType[0] = -1;
        }
        if (rewardDataValue[2] == 1) {
            heroUnitType[1] = 5;
        } else {
            heroUnitType[1] = -1;
        }
        if (rewardDataValue[4] == 1) {
            heroUnitType[2] = 10;
        } else {
            heroUnitType[2] = -1;
        }
        int[] iArr = heroUnitType;
        if (iArr[0] != -1) {
            addHeroTowerUnit(iArr[0], 0, 0, 0, true, true);
        }
        int[] iArr2 = heroUnitType;
        if (iArr2[1] != -1) {
            addHeroTowerUnit(iArr2[1], 1, 0, 0, true, true);
        }
        int[] iArr3 = heroUnitType;
        if (iArr3[2] != -1) {
            addHeroTowerUnit(iArr3[2], 2, 0, 0, true, true);
        }
    }

    public static void clearMonsterUnit() {
        for (int i = 0; i < 100; i++) {
            monsterUnit[i].monsterType = -1;
        }
        monsterUnitCount = 0;
    }

    public static int getMonsterCount() {
        int i = 0;
        for (int i2 = 0; i2 < monsterUnitCount; i2++) {
            if (monsterUnit[i2].monsterType != -1) {
                i++;
            }
        }
        return i;
    }

    public void removeMonsterUnit(int i) {
        if (i < 0) {
            return;
        }
        monsterUnit[i].monsterType = -1;
        monsterUnit[i].unitStatus = -1;
        int i2 = monsterUnitCount;
        if (i == i2 - 1) {
            monsterUnitCount = i2 - 1;
        }
    }

    public static void clearTowerUnit() {
        for (int i = 0; i < 150; i++) {
            towerUnit[i].towerType = -1;
        }
        towerUnitCount = 0;
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

    public static void clearObjectUnit() {
        for (int i = 0; i < 100; i++) {
            objectUnit[i].objectType = -1;
        }
        objectUnitCount = 0;
    }

    public static int addObjectUnit(int i, int i2, int i3, boolean z) {
        int i4;
        if (z) {
            i4 = 0;
            while (i4 < objectUnitCount) {
                if (objectUnit[i4].objectType == -1) {
                    break;
                }
                i4++;
            }
        }
        i4 = -1;
        if (i4 == -1 && objectUnitCount == 99) {
            return -1;
        }
        if (i4 == -1) {
            i4 = objectUnitCount;
            objectUnitCount = i4 + 1;
        }
        objectUnit[i4].objectType = -1;
        int i5 = 0;
        while (true) {
            if (i5 >= 34) {
                break;
            }
            if (i == DataObject.objectData[i5][0]) {
                objectUnit[i4].objectType = i5;
                break;
            }
            i5++;
        }
        objectUnit[i4].objectVanishCount = 0;
        objectUnit[i4].destroyEnableFlag = DataObject.objectData[objectUnit[i4].objectType][1];
        objectUnit[i4].unitHP = DataObject.objectData[objectUnit[i4].objectType][2];
        ObjectUnit[] objectUnitArr = objectUnit;
        objectUnitArr[i4].unitMaxHP = objectUnitArr[i4].unitHP;
        objectUnit[i4].rewardType = DataObject.objectData[objectUnit[i4].objectType][3];
        objectUnit[i4].rewardValue = DataObject.objectData[objectUnit[i4].objectType][4];
        objectUnit[i4].blockSize = DataObject.objectData[objectUnit[i4].objectType][5];
        objectUnit[i4].blockX = i2;
        objectUnit[i4].blockY = i3;
        objectUnit[i4].posX = 0;
        objectUnit[i4].posY = 0;
        int i6 = objectUnit[i4].blockSize;
        if (i6 == 0) {
            objectUnit[i4].posX = ((i2 * 45) + 22) * 50;
            objectUnit[i4].posY = ((i3 * 45) + 22) * 50;
        } else if (i6 == 1) {
            objectUnit[i4].posX = ((i2 * 45) + 22) * 50;
            objectUnit[i4].posY = (((i3 + 1) * 45) + 22) * 50;
        } else if (i6 == 2) {
            objectUnit[i4].posX = (i2 + 1) * 45 * 50;
            objectUnit[i4].posY = (((i3 + 1) * 45) + 22) * 50;
        } else if (i6 == 3) {
            objectUnit[i4].posX = ((i2 * 45) + 22) * 50;
            objectUnit[i4].posY = ((i3 * 45) + 22) * 50;
        } else if (i6 == 4) {
            objectUnit[i4].posX = ((i2 * 45) + 22) * 50;
            objectUnit[i4].posY = ((i3 * 45) + 22) * 50;
        } else if (i6 == 5) {
            objectUnit[i4].posX = ((i2 * 45) + 22) * 50;
            objectUnit[i4].posY = ((i3 * 45) + 22) * 50;
        }
        int i7 = objectUnit[i4].objectType;
        if ((i7 == 28 || i7 == 29 || i7 == 32) && mapNumber < 50) {
            objectUnit[i4].unitHP = DataWaveMob.DATA_WAVE_GATE_HP[mapNumber];
            ObjectUnit[] objectUnitArr2 = objectUnit;
            objectUnitArr2[i4].unitMaxHP = objectUnitArr2[i4].unitHP;
            if (mapStartPositionCount == 2) {
                objectUnit[i4].unitHP /= 2;
                objectUnit[i4].unitMaxHP /= 2;
            }
            if (mapAttackType == 2) {
                objectUnit[i4].destroyEnableFlag = 0;
            }
        }
        return i4;
    }

    public static int getUpgradeType(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = DataCharacter.charData[i][12];
        if (i2 == 0) {
            return 6;
        }
        if (i2 == 2) {
            return 9;
        }
        if (i2 == 4) {
            return 18;
        }
        if (i2 == 6) {
            return 21;
        }
        if (i2 != 8) {
            return i2 != 10 ? -1 : 33;
        }
        return 30;
    }

    public static int getDowngradeType(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = DataCharacter.charData[i][12];
        if (i2 == 2) {
            return 0;
        }
        if (i2 == 3) {
            return 6;
        }
        if (i2 == 6) {
            return 12;
        }
        if (i2 == 7) {
            return 18;
        }
        if (i2 != 10) {
            return i2 != 11 ? -1 : 30;
        }
        return 24;
    }

    public static void levelUpUnit(int i) {
        int levelupType;
        if (i < 0) {
            return;
        }
        int i2 = towerUnit[i].towerType;
        if (towerUnit[i].heroFlag == 1) {
            levelupType = getLevelupHeroType(i2);
        } else {
            levelupType = getLevelupType(i2);
        }
        if (levelupType == -1) {
            return;
        }
        int i3 = towerUnit[i].heroFlag;
        if (i3 == 0) {
            myMoney -= getLevelupPrice(i2);
        } else if (i3 == 1) {
            myMana -= getLevelupHeroPrice(i2, towerUnit[i].heroOrder);
        }
        towerUnit[i].towerType = levelupType;
        int i4 = towerUnit[i].heroFlag;
        if (i4 != 0) {
            if (i4 == 1) {
                if (levelupType == 4) {
                    int[] iArr = awardDataValue;
                    iArr[45] = iArr[45] + 1;
                    iArr[24] = iArr[24] + 1;
                    recheckAwardData();
                } else if (levelupType == 9) {
                    int[] iArr2 = awardDataValue;
                    iArr2[46] = iArr2[46] + 1;
                    iArr2[24] = iArr2[24] + 1;
                    recheckAwardData();
                } else if (levelupType == 14) {
                    int[] iArr3 = awardDataValue;
                    iArr3[47] = iArr3[47] + 1;
                    iArr3[24] = iArr3[24] + 1;
                    recheckAwardData();
                }
            }
        } else if (levelupType == 5) {
            int[] iArr4 = awardDataValue;
            iArr4[42] = iArr4[42] + 1;
            recheckAwardData();
        } else if (levelupType == 11) {
            int[] iArr5 = awardDataValue;
            iArr5[39] = iArr5[39] + 1;
            recheckAwardData();
        } else if (levelupType == 17) {
            int[] iArr6 = awardDataValue;
            iArr6[43] = iArr6[43] + 1;
            recheckAwardData();
        } else if (levelupType == 23) {
            int[] iArr7 = awardDataValue;
            iArr7[40] = iArr7[40] + 1;
            recheckAwardData();
        } else if (levelupType == 29) {
            int[] iArr8 = awardDataValue;
            iArr8[44] = iArr8[44] + 1;
            recheckAwardData();
        } else if (levelupType == 35) {
            int[] iArr9 = awardDataValue;
            iArr9[41] = iArr9[41] + 1;
            recheckAwardData();
        }
        restatTowerUnit(towerUnit[i]);
        addEffectUnit(14, towerUnit[i].posX, towerUnit[i].posY, true);
        playSound(13);
        GameRenderer.levelUpCount = 10;
    }

    public static void upgradeUnit(int i) {
        int upgradeType;
        int upgradePrice;
        int i2;
        if (i >= 0 && (upgradeType = getUpgradeType(towerUnit[i].towerType)) != -1 && (i2 = myMoney) >= (upgradePrice = getUpgradePrice(towerUnit[i].towerType, towerUnit[i].heroFlag))) {
            myMoney = i2 - upgradePrice;
            towerUnit[i].towerType = upgradeType;
            restatTowerUnit(towerUnit[i]);
            addEffectUnit(14, towerUnit[i].posX, towerUnit[i].posY, true);
            playSound(13);
            GameRenderer.upgradeCount = 10;
        }
    }

    public static int getBuyPrice(int i) {
        int upgradeUnitRate;
        if (i == -1) {
            return 0;
        }
        int i2 = DataCharacter.charData[i][0];
        int i3 = DataCharacter.charData[i][11];
        if (i3 == 0) {
            upgradeUnitRate = (DataCharacter.charData[i][0] * getUpgradeUnitRate(1, 6)) / 100;
        } else if (i3 == 1) {
            upgradeUnitRate = (DataCharacter.charData[i][0] * getUpgradeUnitRate(2, 6)) / 100;
        } else {
            if (i3 != 2) {
                return i2;
            }
            upgradeUnitRate = (DataCharacter.charData[i][0] * getUpgradeUnitRate(3, 6)) / 100;
        }
        return i2 + upgradeUnitRate;
    }

    public static int getHeroBuyPrice(int i) {
        int i2;
        if (i == -1 || (i2 = heroUnitType[i]) == -1) {
            return 0;
        }
        int i3 = DataHero.heroData[i2][0];
        return i3 + ((getUpgradeHeroRate(i, 6) * i3) / 100);
    }

    public static int getSellPrice(int i) {
        if (i == -1) {
            return 0;
        }
        return (DataCharacter.charData[i][13] * 50) / 100;
    }

    public static int getUpgradePrice(int i, int i2) {
        if (i == -1 || i2 == 1) {
            return 0;
        }
        return DataCharacter.charData[i][1] + ((DataCharacter.charData[i][1] * getUpgradeUnitRate(0, 5)) / 100);
    }

    public static int getLevelupPrice(int i) {
        int levelupType = getLevelupType(i);
        if (levelupType == -1) {
            return 0;
        }
        return DataCharacter.charData[levelupType][0];
    }

    public static int getLevelupHeroPrice(int i, int i2) {
        int levelupHeroType = getLevelupHeroType(i);
        if (levelupHeroType == -1) {
            return 0;
        }
        int i3 = DataHero.heroData[levelupHeroType][0];
        return i3 + ((getUpgradeItemRate(i2, 1) * i3) / 100);
    }

    public static int getUpgradeHeroHeroism(int i, int i2) {
        if (heroUnitType[i] == -1) {
            return -1;
        }
        if (heroUpgradeValue[i][i2] >= getUpgradeHeroMax(i, i2)) {
            return -1;
        }
        return (DataUpgradeHero.upgradeHeroData[i2][1] * ((DataUpgradeHero.upgradeHeroData[i2][2] * heroUpgradeValue[i][i2]) + 100)) / 100;
    }

    public static int getUpgradeUnitHeroism(int i) {
        if (upgradeUnitValue[i] >= getUpgradeUnitMax(i)) {
            return -1;
        }
        return (DataUpgradeUnit.upgradeUnitData[i][1] * ((DataUpgradeUnit.upgradeUnitData[i][2] * upgradeUnitValue[i]) + 100)) / 100;
    }

    public static int getUpgradeUnitMax(int i) {
        if (rewardDataValue[5] == 1) {
            return DataUpgradeUnit.upgradeUnitData[i][3] + (limitCashBuyCount * 5);
        }
        return (limitCashBuyCount * 5) + 5;
    }

    public static int getUpgradeHeroMax(int i, int i2) {
        if (rewardDataValue[5] == 1) {
            return DataUpgradeHero.upgradeHeroData[i2][3];
        }
        return 5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0043. Please report as an issue. */
    public static void useSpecialAttack(int i) {
        if (i < 0) {
            return;
        }
        playSound(19);
        int i2 = towerUnit[i].specialType;
        if (i2 == 0) {
            characterMenuSelectFlag = 8;
        } else if (i2 == 1) {
            characterMenuSelectFlag = 9;
        } else if (i2 == 2) {
            characterMenuSelectFlag = 10;
        }
        int i3 = 0;
        specialAttackFrameCount = 0;
        specialAttackSkipFlag = false;
        if (!cheatData[4]) {
            myMana -= towerUnit[i].specialMana;
        }
        switch (characterMenuSelectFlag) {
            case 8:
                for (int i4 = 0; i4 < 60; i4++) {
                    addSpecialArrowUnit(getRandom(4) + 15, 33750, getRandom(LOAD_MAP_START_COUNT) * 50, -(i4 + 65), true);
                }
                for (int i5 = 0; i5 < 20; i5++) {
                    int[][] iArr = specialDataValue;
                    int i6 = i5 % 3;
                    iArr[i5][0] = i6;
                    iArr[i5][1] = getRandom(GameRenderer.SCRWIDTH_SMALL);
                    specialDataValue[i5][2] = getRandom(GameRenderer.SCRHEIGHT_SMALL);
                    if (i6 == 0) {
                        specialDataValue[i5][3] = 100;
                    } else if (i6 == 1) {
                        specialDataValue[i5][3] = 160;
                    } else if (i6 == 2) {
                        specialDataValue[i5][3] = 200;
                    }
                }
                return;
            case 9:
                while (i3 < 75) {
                    addSpecialArrowUnit(getRandom(3) + 33, getRandom(675) * 50, getRandom(LOAD_MAP_START_COUNT) * 50, -(i3 + 60), true);
                    i3++;
                }
                return;
            case 10:
                while (i3 < 60) {
                    addSpecialArrowUnit(getRandom(14) + 19, (getRandom(337) + GameRenderer.GAME_STAGE_CLEAR_THEME_ARROW_BLINK_END_POS) * 50, (getRandom(225) + 112) * 50, -(i3 + 65), true);
                    i3++;
                }
                return;
            default:
                return;
        }
    }

    public static void hitSpecialBladeAttack() {
        if (characterSelectNumber < 0) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < monsterUnitCount; i2++) {
            if (monsterUnit[i2].monsterType != -1) {
                playSound(1);
                addEffectUnit(15, monsterUnit[i2].posX, monsterUnit[i2].posY, true);
                for (int i3 = 0; i3 < towerUnit[characterSelectNumber].specialAttCount; i3++) {
                    if (hitSpecialAttackUnit(characterSelectNumber, i2)) {
                        i++;
                    }
                }
            }
        }
        if (i >= 5) {
            int[] iArr = awardDataValue;
            iArr[48] = iArr[48] + 1;
        }
    }

    public static void hitSpecialArrowAttack() {
        if (characterSelectNumber < 0) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < monsterUnitCount; i2++) {
            if (monsterUnit[i2].monsterType != -1) {
                playSound(4);
                addEffectUnit(33, monsterUnit[i2].posX, monsterUnit[i2].posY, true);
                for (int i3 = 0; i3 < towerUnit[characterSelectNumber].specialAttCount; i3++) {
                    if (hitSpecialAttackUnit(characterSelectNumber, i2)) {
                        i++;
                    }
                }
                monsterUnit[i2].dotHolyFlag = true;
                monsterUnit[i2].dotHolyDamage = towerUnit[characterSelectNumber].getSpecialHitDamage(monsterUnit[i2]) / 20;
                monsterUnit[i2].dotHolyCount = DataCharacter.charData[17][8];
            }
        }
        if (i >= 5) {
            int[] iArr = awardDataValue;
            iArr[49] = iArr[49] + 1;
        }
    }

    public static void hitSpecialIceAttack() {
        int i;
        int i2 = characterSelectNumber;
        if (i2 >= 0 && (i = towerUnit[i2].towerType) != -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < monsterUnitCount; i4++) {
                if (monsterUnit[i4].monsterType != -1) {
                    addEffectUnit(5, monsterUnit[i4].posX, monsterUnit[i4].posY, true);
                    playSound(7);
                    for (int i5 = 0; i5 < towerUnit[characterSelectNumber].specialAttCount; i5++) {
                        if (hitSpecialAttackUnit(characterSelectNumber, i4)) {
                            i3++;
                        }
                    }
                    monsterUnit[i4].slowIceFlag = true;
                    monsterUnit[i4].slowRate = DataHero.heroData[i][10];
                }
            }
            if (i3 >= 5) {
                int[] iArr = awardDataValue;
                iArr[50] = iArr[50] + 1;
            }
        }
    }

    public static void restatTowerUnit(TowerUnit towerUnit2) {
        int i = towerUnit2.towerType;
        if (!towerUnit2.heroFlag) {
            towerUnit2.towerCoolTime = 0;
            towerUnit2.towerCoolTimeMax = DataCharacter.charData[i][3];
            int i3 = DataCharacter.charData[i][11];
            if (i3 == 0) {
                towerUnit2.towerCoolTimeMax -= (towerUnit2.towerCoolTimeMax * getUpgradeUnitRate(1, 8)) / 100;
            } else if (i3 == 1) {
                towerUnit2.towerCoolTimeMax -= (towerUnit2.towerCoolTimeMax * getUpgradeUnitRate(2, 8)) / 100;
            } else if (i3 == 2) {
                towerUnit2.towerCoolTimeMax -= (towerUnit2.towerCoolTimeMax * getUpgradeUnitRate(3, 8)) / 100;
            }
            if (towerUnit2.towerCoolTimeMax <= 0) {
                towerUnit2.towerCoolTimeMax = 1;
            }
            towerUnit2.attackRange = DataCharacter.charData[i][4];
            int i4 = DataCharacter.charData[i][11];
            if (i4 == 0) {
                towerUnit2.attackRange += (towerUnit2.attackRange * getUpgradeUnitRate(1, 9)) / 100;
            } else if (i4 == 1) {
                towerUnit2.attackRange += (towerUnit2.attackRange * getUpgradeUnitRate(2, 9)) / 100;
            } else if (i4 == 2) {
                towerUnit2.attackRange += (towerUnit2.attackRange * getUpgradeUnitRate(3, 9)) / 100;
            }
            towerUnit2.attackDistance = (((towerUnit2.attackRange * 45) / 100) + 22) * 50;
            towerUnit2.targetMaxNum = DataCharacter.charData[i][5];
            towerUnit2.attackDistanceSquare = towerUnit2.attackDistance * towerUnit2.attackDistance;
            towerUnit2.unitPower = DataCharacter.charData[i][2];
            towerUnit2.attackType = DataCharacter.charData[i][9];
            towerUnit2.effectType = DataCharacter.charData[i][6];
            towerUnit2.attackEffect = DataCharacter.charData[i][10];
            towerUnit2.specialCooltime = 0;
            if (towerUnit2.targetMaxNum <= 1 || towerUnit2.effectType != -1) {
                return;
            }
            towerUnit2.effectType = 7;
            return;
        }
        towerUnit2.towerCoolTime = 0;
        towerUnit2.towerCoolTimeMax = DataHero.heroData[i][2];
        towerUnit2.towerCoolTimeMax -= (towerUnit2.towerCoolTimeMax * (getUpgradeHeroRate(towerUnit2.heroOrder, 8) + getUpgradeItemRate(towerUnit2.heroOrder, 3))) / 100;
        if (towerUnit2.towerCoolTimeMax <= 0) {
            towerUnit2.towerCoolTimeMax = 1;
        }
        towerUnit2.attackRange = DataHero.heroData[i][3];
        towerUnit2.attackRange += (towerUnit2.attackRange * getUpgradeItemRate(towerUnit2.heroOrder, 4)) / 100;
        towerUnit2.attackDistance = (((towerUnit2.attackRange * 45) / 100) + 22) * 50;
        towerUnit2.targetMaxNum = DataHero.heroData[i][4];
        towerUnit2.attackDistanceSquare = towerUnit2.attackDistance * towerUnit2.attackDistance;
        towerUnit2.unitPower = DataHero.heroData[i][1];
        towerUnit2.attackType = DataHero.heroData[i][11];
        towerUnit2.effectType = -1;
        towerUnit2.attackEffect = DataHero.heroData[i][12];
        towerUnit2.specialType = DataHero.heroData[i][5];
        towerUnit2.specialMana = DataHero.heroData[i][6];
        towerUnit2.specialMana += (towerUnit2.specialMana * (getUpgradeHeroRate(towerUnit2.heroOrder, 17) - getUpgradeItemRate(towerUnit2.heroOrder, 7))) / 100;
        towerUnit2.specialAttPower = DataHero.heroData[i][7];
        towerUnit2.specialAttPower += (towerUnit2.specialAttPower * (getUpgradeHeroRate(towerUnit2.heroOrder, 16) + getUpgradeItemRate(towerUnit2.heroOrder, 5))) / 100;
        towerUnit2.specialAttCount = DataHero.heroData[i][8];
        towerUnit2.specialMaxCooltime = DataHero.heroData[i][9] * 41;
        towerUnit2.specialMaxCooltime += (towerUnit2.specialMaxCooltime * (getUpgradeHeroRate(towerUnit2.heroOrder, 18) - getUpgradeItemRate(towerUnit2.heroOrder, 6))) / 100;
        if (rewardDataValue[6] == 1) {
            int i5 = DataHero.heroData[i][13];
            if (i5 == 0) {
                towerUnit2.effectType = 1;
                return;
            }
            if (i5 == 1) {
                towerUnit2.targetMaxNum = 2;
                towerUnit2.effectType = 8;
            } else {
                if (i5 != 2) {
                    return;
                }
                towerUnit2.effectType = 1;
            }
        }
    }

    public static void sellTowerUnit(int i) {
        if (towerUnit[i].towerType == -1 || towerUnit[i].heroFlag == 1) {
            return;
        }
        int sellPrice = myMoney + getSellPrice(towerUnit[i].towerType);
        myMoney = sellPrice;
        int[] iArr = awardDataValue;
        if (sellPrice >= iArr[21]) {
            iArr[21] = sellPrice;
            recheckAwardData();
        }
        towerUnit[i].towerType = -1;
        towerUnit[i].unitStatus = 2;
        for (int i2 = 0; i2 < arrowUnitCount; i2++) {
            if (arrowUnit[i2].arrowType != -1 && arrowUnit[i2].shootNumber == i) {
                arrowUnit[i2].arrowType = -1;
            }
        }
    }

    public static void clearEffectUnit() {
        for (int i = 0; i < 200; i++) {
            effectUnit[i].effectType = -1;
        }
        effectUnitCount = 0;
    }

    public static int addEffectUnit(int i, float f, float f2, boolean z) {
        int i2;
        if (z) {
            i2 = 0;
            while (i2 < effectUnitCount) {
                if (effectUnit[i2].effectType == -1) {
                    break;
                }
                i2++;
            }
        }
        i2 = -1;
        if (i2 == -1 && effectUnitCount == 199) {
            return -1;
        }
        if (i2 == -1) {
            i2 = effectUnitCount;
            effectUnitCount = i2 + 1;
        }
        effectUnit[i2].effectType = i;
        effectUnit[i2].posX = (int) f;
        effectUnit[i2].posY = (int) f2;
        effectUnit[i2].lastGameUpdateCount = gameTimeCount;
        effectUnit[i2].effectCount = 0;
        if (i == 14) {
            effectUnit[i2].effectCountMax = 15;
        } else {
            effectUnit[i2].effectCountMax = 7;
        }
        return i2;
    }

    public static void clearArrowUnit() {
        for (int i = 0; i < 200; i++)
            arrowUnit[i].arrowType = -1;
        arrowUnitCount = 0;
    }

    public static void clearSpecialArrowUnit() {
        for (int i = 0; i < arrowUnitCount; i++) {
            if (arrowUnit[i].arrowType >= 15 && arrowUnit[i].arrowType <= 35)
                arrowUnit[i].arrowType = -1;
        }
    }

    int addArrowUnit(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        if (z) {
            i5 = 0;
            while (i5 < arrowUnitCount) {
                if (arrowUnit[i5].arrowType == -1) {
                    break;
                }
                i5++;
            }
        }
        i5 = -1;
        if (i5 == -1 && arrowUnitCount == 199) {
            return -1;
        }
        if (i5 == -1) {
            i5 = arrowUnitCount;
            arrowUnitCount = i5 + 1;
        }
        arrowUnit[i5].arrowType = i;
        arrowUnit[i5].shootNumber = i2;
        arrowUnit[i5].startX = towerUnit[i2].posX;
        arrowUnit[i5].startY = towerUnit[i2].posY;
        if (i3 == 0) {
            arrowUnit[i5].targetType = 0;
        } else if (i3 == 1) {
            arrowUnit[i5].targetType = 3;
        }
        arrowUnit[i5].targetNumber = i4;
        arrowUnit[i5].moveCount = 1;
        arrowUnit[i5].moveMaxCount = 5;
        for (int i6 = 0; i6 < 150; i6++) {
            arrowUnit[i5].hitCheckFlag[i6] = false;
        }
        if (i == 0) {
            arrowUnit[i5].moveSpeed = 750;
            for (int i7 = 0; i7 < 5; i7++) {
                arrowUnit[i5].moveHistory[i7][0] = arrowUnit[i5].startX;
                arrowUnit[i5].moveHistory[i7][1] = arrowUnit[i5].startY;
            }
        }
        return i5;
    }

    public static int addSpecialArrowUnit(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        if (z) {
            i5 = 0;
            while (i5 < arrowUnitCount) {
                if (arrowUnit[i5].arrowType == -1) {
                    break;
                }
                i5++;
            }
        }
        i5 = -1;
        if (i5 == -1 && arrowUnitCount == 199) {
            return -1;
        }
        if (i5 == -1) {
            i5 = arrowUnitCount;
            arrowUnitCount = i5 + 1;
        }
        arrowUnit[i5].arrowType = i;
        arrowUnit[i5].targetType = 1;
        arrowUnit[i5].endX = i2;
        arrowUnit[i5].endY = i3;
        ArrowUnit[] arrowUnitArr = arrowUnit;
        arrowUnitArr[i5].startX = arrowUnitArr[i5].endX;
        ArrowUnit[] arrowUnitArr2 = arrowUnit;
        arrowUnitArr2[i5].startY = arrowUnitArr2[i5].endY;
        arrowUnit[i5].moveCount = i4;
        switch (i) {
            case 15:
                arrowUnit[i5].moveSpeed = 5000;
                arrowUnit[i5].startX -= i4 * arrowUnit[i5].moveSpeed;
                break;
            case 16:
                arrowUnit[i5].moveSpeed = 3750;
                arrowUnit[i5].startX -= i4 * arrowUnit[i5].moveSpeed;
                break;
            case 17:
                arrowUnit[i5].moveSpeed = 2750;
                arrowUnit[i5].startX -= i4 * arrowUnit[i5].moveSpeed;
                break;
            case 18:
                arrowUnit[i5].moveSpeed = 1750;
                arrowUnit[i5].startX -= i4 * arrowUnit[i5].moveSpeed;
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                arrowUnit[i5].moveSpeed = 3500;
                arrowUnit[i5].moveRotateDegree = getRandom(360);
                float abs = Math.abs(((float) Math.cos(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                float abs2 = Math.abs(((float) Math.sin(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                if (arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 180.0f) {
                    arrowUnit[i5].startX = (int) (r2.startX + (abs2 * i4));
                } else {
                    arrowUnit[i5].startX = (int) (r2.startX - (abs2 * i4));
                }
                if ((arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 90.0f) || (arrowUnit[i5].moveRotateDegree >= 270.0f && arrowUnit[i5].moveRotateDegree < 360.0f)) {
                    arrowUnit[i5].startY = (int) (r7.startY - (abs * i4));
                    break;
                } else {
                    arrowUnit[i5].startY = (int) (r7.startY + (abs * i4));
                    break;
                }
                break;
            case 33:
                arrowUnit[i5].moveSpeed = 7000;
                arrowUnit[i5].moveRotateDegree = 165.0f;
                float abs3 = Math.abs(((float) Math.cos(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                float abs4 = Math.abs(((float) Math.sin(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                if (arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 180.0f) {
                    arrowUnit[i5].startX = (int) (r2.startX + (abs4 * i4));
                } else {
                    arrowUnit[i5].startX = (int) (r2.startX - (abs4 * i4));
                }
                if ((arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 90.0f) || (arrowUnit[i5].moveRotateDegree >= 270.0f && arrowUnit[i5].moveRotateDegree < 360.0f)) {
                    arrowUnit[i5].startY = (int) (r7.startY - (abs3 * i4));
                    break;
                } else {
                    arrowUnit[i5].startY = (int) (r7.startY + (abs3 * i4));
                    break;
                }
                break;
            case 34:
                arrowUnit[i5].moveSpeed = 7000;
                arrowUnit[i5].moveRotateDegree = 180.0f;
                float abs5 = Math.abs(((float) Math.cos(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                float abs6 = Math.abs(((float) Math.sin(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                if (arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 180.0f) {
                    arrowUnit[i5].startX = (int) (r2.startX + (abs6 * i4));
                } else {
                    arrowUnit[i5].startX = (int) (r2.startX - (abs6 * i4));
                }
                if ((arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 90.0f) || (arrowUnit[i5].moveRotateDegree >= 270.0f && arrowUnit[i5].moveRotateDegree < 360.0f)) {
                    arrowUnit[i5].startY = (int) (r7.startY - (abs5 * i4));
                    break;
                } else {
                    arrowUnit[i5].startY = (int) (r7.startY + (abs5 * i4));
                    break;
                }
                break;
            case 35:
                arrowUnit[i5].moveSpeed = 7000;
                arrowUnit[i5].moveRotateDegree = 195.0f;
                float abs7 = Math.abs(((float) Math.cos(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                float abs8 = Math.abs(((float) Math.sin(Math.toRadians(arrowUnit[i5].moveRotateDegree))) * arrowUnit[i5].moveSpeed);
                if (arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 180.0f) {
                    arrowUnit[i5].startX = (int) (r2.startX + (abs8 * i4));
                } else {
                    arrowUnit[i5].startX = (int) (r2.startX - (abs8 * i4));
                }
                if ((arrowUnit[i5].moveRotateDegree >= 0.0f && arrowUnit[i5].moveRotateDegree < 90.0f) || (arrowUnit[i5].moveRotateDegree >= 270.0f && arrowUnit[i5].moveRotateDegree < 360.0f)) {
                    arrowUnit[i5].startY = (int) (r7.startY - (abs7 * i4));
                    break;
                } else {
                    arrowUnit[i5].startY = (int) (r7.startY + (abs7 * i4));
                    break;
                }
                break;
        }
        return i5;
    }

    public static int getRandomMapDirection(int i, int i2, int i3, int i4) {
        int i5 = mapMoveData[i2][i3];
        int i6 = 64;
        if (i4 == 1) {
            i6 = 16;
        } else if (i4 != 4) {
            i6 = i4 != 16 ? i4 != 64 ? -1 : 4 : 1;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < 8; i8++) {
            if (i8 != i6 && ((1 << i8) & i5) != 0) {
                i7++;
            }
        }
        if (i7 == 0) {
            return -1;
        }
        int random = getRandom(i7);
        int i9 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            if (i10 != i6 && ((1 << i10) & i5) != 0) {
                if (i9 == random) {
                    return i10;
                }
                i9++;
            }
        }
        return -1;
    }

    public static int getRandom(int i) {
        int currentTimeMillis = (int) ((((randomNumber & SupportMenu.USER_MASK) * 93217) + 1 + (System.currentTimeMillis() & 65535)) & 65535);
        randomNumber = currentTimeMillis;
        int i2 = currentTimeMillis >> 1;
        randomNumber = i2;
        if (i == 0) {
            return 0;
        }
        return i2 % i;
    }

    public boolean updateMonsterUnit() {
        for (int i = 0; i < monsterUnitCount; i++) {
            if (monsterUnit[i].update())
                return true;
        }
        return false;
    }

    public void updateObjectUnit() {
        for (int i = 0; i < objectUnitCount; i++)
            objectUnit[i].updateObject();
    }

    public void unlockTowerUnit() {
        for (int i = 0; i < towerUnitCount; i++)
            if (towerUnit[i].towerType != -1 && towerUnit[i].unitStatus == 2)
                towerUnit[i].unitStatus = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0180, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateTowerUnit() {
        int i;
        int soundAttackType;
        int i2;
        for (int i3 = 0; i3 < towerUnitCount; i3++) {
            if (towerUnit[i3].towerType != -1) {
                int i4 = towerUnit[i3].towerType;
                towerUnit[i3].unitStatusCount++;
                if (towerUnit[i3].towerCoolTime > 0) {
                    towerUnit[i3].towerCoolTime--;
                }
                if (towerUnit[i3].specialCooltime > 0) {
                    towerUnit[i3].specialCooltime--;
                    if (towerUnit[i3].specialCooltime == 0) {
                        towerUnit[i3].specialShowCount = 4;
                    }
                }
                int i5 = towerUnit[i3].unitStatus;
                if (i5 != 0) {
                    if (i5 == 1) {
                        int i6 = towerUnit[i3].unitLockType[0];
                        if (i6 == 0) {
                            boolean z = towerUnit[i3].heroFlag;
                            if (z && towerUnit[i3].unitStatusCount <= 6) {
                                towerUnit[i3].posX = (int) (r1[i3].originalPosX + ((((monsterUnit[towerUnit[i3].unitLockNumber[0]].posX - towerUnit[i3].posX) * towerUnit[i3].unitStatusCount) / 6) * SPECIAL_ATTACK_ARROW_UNIT_SIZE_START));
                                towerUnit[i3].posY = (int) (r1[i3].originalPosY + ((((monsterUnit[towerUnit[i3].unitLockNumber[0]].posY - towerUnit[i3].posY) * towerUnit[i3].unitStatusCount) / 6) * SPECIAL_ATTACK_ARROW_UNIT_SIZE_START));
                            }
                            towerUnit[i3].headRotateDegree = getRotateDegree(monsterUnit[r1[i3].unitLockNumber[0]].posX - towerUnit[i3].posX, monsterUnit[towerUnit[i3].unitLockNumber[0]].posY - towerUnit[i3].posY);
                            if (towerUnit[i3].posX < monsterUnit[towerUnit[i3].unitLockNumber[0]].posX) {
                                towerUnit[i3].lastViewDirection = 2;
                            } else if (towerUnit[i3].posX > monsterUnit[towerUnit[i3].unitLockNumber[0]].posX) {
                                towerUnit[i3].lastViewDirection = 6;
                            }
                        } else if (i6 == 1) {
                            boolean z2 = !towerUnit[i3].heroFlag;
                            if (z2 && towerUnit[i3].unitStatusCount <= 6) {
                                towerUnit[i3].posX = (int) (r1[i3].originalPosX + ((((objectUnit[towerUnit[i3].unitLockNumber[0]].posX - towerUnit[i3].posX) * towerUnit[i3].unitStatusCount) / 6) * SPECIAL_ATTACK_ARROW_UNIT_SIZE_START));
                                towerUnit[i3].posY = (int) (r1[i3].originalPosY + ((((objectUnit[towerUnit[i3].unitLockNumber[0]].posY - towerUnit[i3].posY) * towerUnit[i3].unitStatusCount) / 6) * SPECIAL_ATTACK_ARROW_UNIT_SIZE_START));
                            }
                            towerUnit[i3].headRotateDegree = getRotateDegree(objectUnit[r1[i3].unitLockNumber[0]].posX - towerUnit[i3].posX, objectUnit[towerUnit[i3].unitLockNumber[0]].posY - towerUnit[i3].posY);
                            if (towerUnit[i3].posX < objectUnit[towerUnit[i3].unitLockNumber[0]].posX) {
                                towerUnit[i3].lastViewDirection = 2;
                            } else if (towerUnit[i3].posX > objectUnit[towerUnit[i3].unitLockNumber[0]].posX) {
                                towerUnit[i3].lastViewDirection = 6;
                            }
                        }
                        if (towerUnit[i3].unitStatusCount == 6) {
                            boolean z3 = false;
                            while (i2 < towerUnit[i3].targetMaxNum) {
                                int i7 = towerUnit[i3].unitLockType[i2];
                                if (i7 == 0) {
                                    i2 = monsterUnit[towerUnit[i3].unitLockNumber[i2]].unitStatus != 0 ? i2 + 1 : 0;
                                    z3 = true;
                                } else if (i7 == 1) {
                                    if (objectUnit[towerUnit[i3].unitLockNumber[i2]].objectType != -1) {
                                        if (objectUnit[towerUnit[i3].unitLockNumber[i2]].objectType == -2) {
                                        }
                                        z3 = true;
                                    }
                                }
                            }
                            if (z3) {
                                towerUnit[i3].attackCount++;
                                TowerUnit[] towerUnitArr = towerUnit;
                                towerUnitArr[i3].towerCoolTime = towerUnitArr[i3].towerCoolTimeMax;
                                int i8 = towerUnit[i3].attackType;
                                if (i8 == 0) {
                                    int soundHitType = getSoundHitType(i3);
                                    if (soundHitType != -1) {
                                        playSound(soundHitType);
                                    }
                                    for (int i9 = 0; i9 < 3 && i9 < towerUnit[i3].targetMaxNum; i9++) {
                                        int i10 = towerUnit[i3].unitLockType[i9];
                                        if (i10 == 0) {
                                            addEffectUnit(towerUnit[i3].attackEffect, monsterUnit[towerUnit[i3].unitLockNumber[i9]].posX, monsterUnit[towerUnit[i3].unitLockNumber[i9]].posY, true);
                                            monsterUnit[towerUnit[i3].unitLockNumber[i9]].hit(0, towerUnit[i3]);
                                        } else if (i10 == 1) {
                                            addEffectUnit(towerUnit[i3].attackEffect, objectUnit[towerUnit[i3].unitLockNumber[i9]].posX, objectUnit[towerUnit[i3].unitLockNumber[i9]].posY, true);
                                            objectUnit[towerUnit[i3].unitLockNumber[i9]].hit(0, towerUnit[i3]);
                                        }
                                    }
                                } else if (i8 == 1) {
                                    for (int i11 = 0; i11 < 3 && i11 < towerUnit[i3].targetMaxNum; i11++) {
                                        if (towerUnit[i3].unitLockType[i11] != -1 && towerUnit[i3].unitLockNumber[i11] != -1) {
                                            addArrowUnit(towerUnit[i3].attackEffect, i3, towerUnit[i3].unitLockType[i11], towerUnit[i3].unitLockNumber[i11], true);
                                        }
                                    }
                                }
                            } else {
                                towerUnit[i3].unitStatus = 0;
                                towerUnit[i3].unitStatusCount = 0;
                                towerUnit[i3].towerCoolTime = 0;
                                TowerUnit[] towerUnitArr2 = towerUnit;
                                towerUnitArr2[i3].posX = towerUnitArr2[i3].originalPosX;
                                TowerUnit[] towerUnitArr3 = towerUnit;
                                towerUnitArr3[i3].posY = towerUnitArr3[i3].originalPosY;
                            }
                        }
                        if (towerUnit[i3].unitStatusCount == 15) {
                            towerUnit[i3].unitStatus = 0;
                            towerUnit[i3].unitStatusCount = 0;
                            TowerUnit[] towerUnitArr4 = towerUnit;
                            towerUnitArr4[i3].towerCoolTime = towerUnitArr4[i3].towerCoolTimeMax;
                            TowerUnit[] towerUnitArr5 = towerUnit;
                            towerUnitArr5[i3].posX = towerUnitArr5[i3].originalPosX;
                            TowerUnit[] towerUnitArr6 = towerUnit;
                            towerUnitArr6[i3].posY = towerUnitArr6[i3].originalPosY;
                        }
                    }
                } else if (towerUnit[i3].towerCoolTime == 0) {
                    int closeEnemyUnitInRange = getCloseEnemyUnitInRange(towerUnit[i3]);
                    if (closeEnemyUnitInRange > 0) {
                        if (commonTargetType == 0 && monsterMeetCheck[commonTargetNumber]) {
                            towerUnit[i3].unitLockType[0] = 0;
                            towerUnit[i3].unitLockNumber[0] = commonTargetNumber;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        for (int i12 = 0; i12 < monsterUnitCount && i < closeEnemyUnitInRange && i < towerUnit[i3].targetMaxNum; i12++) {
                            if (monsterMeetCheck[i12]) {
                                towerUnit[i3].unitLockType[i] = 0;
                                towerUnit[i3].unitLockNumber[i] = i12;
                                i++;
                            }
                        }
                        towerUnit[i3].unitStatus = 1;
                        towerUnit[i3].unitStatusCount = 0;
                    } else {
                        i = 0;
                    }
                    if (i < towerUnit[i3].targetMaxNum && commonTargetType == 1 && getCloseObjectUnitInRange(towerUnit[i3]) > 0 && monsterMeetCheck[commonTargetNumber]) {
                        towerUnit[i3].unitLockType[i] = 1;
                        towerUnit[i3].unitLockNumber[i] = commonTargetNumber;
                        i++;
                        towerUnit[i3].unitStatus = 1;
                        towerUnit[i3].unitStatusCount = 0;
                    }
                    if (towerUnit[i3].unitStatus == 1 && (soundAttackType = getSoundAttackType(i3)) != -1) {
                        playSound(soundAttackType);
                    }
                    while (i < 3) {
                        towerUnit[i3].unitLockType[i] = -1;
                        towerUnit[i3].unitLockNumber[i] = -1;
                        i++;
                    }
                }
            }
        }
    }

    public void updateEffectUnit(boolean z) {
        for (int i = 0; i < effectUnitCount; i++) {
            if (effectUnit[i].effectType != -1) {
                boolean z2 = !z || (effectUnit[i].effectType == 14 && effectUnit[i].lastGameUpdateCount != gameTimeCount);
                if (effectUnit[i].lastGameUpdateCount == gameTimeCount && effectUnit[i].effectType == 36) {
                    z2 = false;
                }
                if (z2) {
                    effectUnit[i].lastGameUpdateCount = gameTimeCount;
                    effectUnit[i].effectCount++;
                    if (effectUnit[i].effectCount >= effectUnit[i].effectCountMax)
                        effectUnit[i].effectType = -1;
                }
            }
        }
    }

    public void setReverseSpecialIce() {
        for (int i = 0; i < arrowUnitCount; i++) {
            if (arrowUnit[i].arrowType != -1 && arrowUnit[i].arrowType >= 19 && arrowUnit[i].arrowType <= 32) {
                arrowUnit[i].moveCount = 1000;
                arrowUnit[i].moveRotateDegree += 180.0f;
                if (arrowUnit[i].moveRotateDegree >= 360.0f)
                    arrowUnit[i].moveRotateDegree -= 360.0f;
            }
        }
    }

    public void updateArrowUnit() {
        for (int i3 = 0; i3 < arrowUnitCount; i3++)
            arrowUnit[i3].updateArrowUnit();
    }

    public static boolean hitSpecialAttackUnit(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i2 >= 0) {
            int i3 = towerUnit[i].towerType;
            if (i3 == -1 || monsterUnit[i2].monsterType == -1) {
                return false;
            }
            int specialHitDamage = towerUnit[i].getSpecialHitDamage(monsterUnit[i2]);
            monsterUnit[i2].unitHP -= specialHitDamage;
            if (characterMenuSelectFlag == 9) {
                monsterUnit[i2].dotHolyFlag = true;
                monsterUnit[i2].dotHolyDamage = specialHitDamage / 20;
                monsterUnit[i2].dotHolyCount = DataHero.heroData[i3][10];
            }
            if (monsterUnit[i2].unitHP <= 0) {
                getRewardFromMonster(myWave, i2, i);
                monsterUnit[i2].unitStatus = 1;
                monsterUnit[i2].unitStatusCount = 0;
                addEffectUnit(13, monsterUnit[i2].posX, monsterUnit[i2].posY, true);
                z = true;
            }
            if (monsterUnit[i2].unitStatus == 1 && commonTargetType == 0 && commonTargetNumber == i2) {
                commonTargetType = -1;
            }
        }
        return z;
    }

    public static int getCloseEnemyUnitInRange(TowerUnit towerUnit2) {
        int i = 0;
        for (int i2 = 0; i2 < monsterUnitCount; i2++) {
            if (monsterUnit[i2].monsterType != -1) {
                if (monsterUnit[i2].unitStatus == 0) {
                    if (Math.abs(towerUnit2.posX - monsterUnit[i2].posX) + Math.abs(towerUnit2.posY - monsterUnit[i2].posY) > towerUnit2.attackDistance * 2) {
                        monsterMeetCheck[i2] = false;
                    } else if (((towerUnit2.posX - monsterUnit[i2].posX) * (towerUnit2.posX - monsterUnit[i2].posX)) + ((towerUnit2.posY - monsterUnit[i2].posY) * (towerUnit2.posY - monsterUnit[i2].posY)) <= towerUnit2.attackDistanceSquare) {
                        monsterMeetCheck[i2] = true;
                        i++;
                    } else {
                        monsterMeetCheck[i2] = false;
                    }
                } else {
                    monsterMeetCheck[i2] = false;
                }
            } else {
                monsterMeetCheck[i2] = false;
            }
        }
        return i;
    }

    public static int getCloseObjectUnitInRange(TowerUnit towerUnit2) {
        int i;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < objectUnitCount; i7++) {
            if (objectUnit[i7].objectType != -1 && objectUnit[i7].objectType != -2) {
                if (objectUnit[i7].destroyEnableFlag == 0) {
                    int i8 = objectUnit[i7].blockSize;
                    if (i8 == 0) {
                        i3 = objectUnit[i7].posX;
                        i5 = objectUnit[i7].posY;
                        i4 = i3;
                        i6 = i5;
                    } else if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 == 3) {
                                i3 = objectUnit[i7].posX;
                                i = objectUnit[i7].posY;
                            } else if (i8 == 4) {
                                i3 = objectUnit[i7].posX - 2250;
                                i = objectUnit[i7].posY;
                            } else if (i8 == 5) {
                                i3 = objectUnit[i7].posX - 2250;
                                i5 = objectUnit[i7].posY - 2250;
                                i4 = i3 + 4500;
                            }
                            i5 = i - 2250;
                            i4 = i3 + 2250;
                            i6 = i5 + 4500;
                        } else {
                            i3 = objectUnit[i7].posX - 1100;
                            i5 = objectUnit[i7].posY - 2250;
                            i4 = i3 + 2250;
                        }
                        i6 = i5 + 2250;
                    } else {
                        i3 = objectUnit[i7].posX;
                        i5 = objectUnit[i7].posY - 2250;
                        i6 = i5 + 2250;
                        i4 = i3;
                    }
                    if (Math.abs(towerUnit2.posX - ((towerUnit2.posX > i3 && (towerUnit2.posX >= i4 || Math.abs(towerUnit2.posX - i3) > Math.abs(towerUnit2.posX - i4))) ? i4 : i3)) + Math.abs(towerUnit2.posY - ((towerUnit2.posY > i5 && (towerUnit2.posY >= i6 || Math.abs(towerUnit2.posY - i5) > Math.abs(towerUnit2.posY - i6))) ? i6 : i5)) > towerUnit2.attackDistance * 2) {
                        monsterMeetCheck[i7] = false;
                    } else if (((towerUnit2.posX - r7) * (towerUnit2.posX - r7)) + ((towerUnit2.posY - r10) * (towerUnit2.posY - r10)) <= towerUnit2.attackDistanceSquare) {
                        monsterMeetCheck[i7] = true;
                        i2++;
                    } else {
                        monsterMeetCheck[i7] = false;
                    }
                } else {
                    monsterMeetCheck[i7] = false;
                }
            } else {
                monsterMeetCheck[i7] = false;
            }
        }
        return i2;
    }

    public boolean enableAddUnit() {
        CGPoint firstLastActionTouch = TouchManager.getFirstLastActionTouch();
        if (firstLastActionTouch.x < 62.0f || firstLastActionTouch.y - 25.0f < 30.0f || firstLastActionTouch.x >= 737.0f || firstLastActionTouch.y - 25.0f >= 480.0f) {
            return false;
        }
        int i = (int) ((firstLastActionTouch.x - 62.0f) / 45.0f);
        int i2 = (int) (((firstLastActionTouch.y - 25.0f) - 30.0f) / 45.0f);
        if (mapTileData[i][i2] != -1) {
            return false;
        }
        for (int i3 = 0; i3 < towerUnitCount; i3++) {
            if (towerUnit[i3].towerType != -1 && towerUnit[i3].blockX == i && towerUnit[i3].blockY == i2) {
                return false;
            }
        }
        for (int i4 = 0; i4 < objectUnitCount; i4++) {
            if (objectUnit[i4].objectType != -1 && objectUnit[i4].objectType != -2) {
                int i5 = objectUnit[i4].blockSize;
                if (i5 == 0) {
                    int i6 = (objectUnit[i4].posX / 50) / 45;
                    int i7 = (objectUnit[i4].posY / 50) / 45;
                    if (i == i6 && i2 == i7) {
                        return false;
                    }
                } else if (i5 == 1) {
                    int i8 = (objectUnit[i4].posX / 50) / 45;
                    int i9 = (objectUnit[i4].posY / 50) / 45;
                    int i10 = i9 - 1;
                    if (i == i8 && i2 >= i10 && i2 <= i9) {
                        return false;
                    }
                } else if (i5 == 2) {
                    int i11 = (objectUnit[i4].posX / 50) / 45;
                    int i12 = (objectUnit[i4].posY / 50) / 45;
                    int i13 = i12 - 1;
                    if (i >= i11 - 1 && i <= i11 && i2 >= i13 && i2 <= i12) {
                        return false;
                    }
                } else if (i5 == 3) {
                    int i14 = (objectUnit[i4].posX / 50) / 45;
                    int i15 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i16 = i14 + 1;
                    int i17 = i15 + 2;
                    if (i >= i14 && i <= i16 && i2 >= i15 && i2 <= i17) {
                        return false;
                    }
                } else if (i5 == 4) {
                    int i18 = ((objectUnit[i4].posX / 50) / 45) - 1;
                    int i19 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i20 = i18 + 1;
                    int i21 = i19 + 2;
                    if (i >= i18 && i <= i20 && i2 >= i19 && i2 <= i21) {
                        return false;
                    }
                } else if (i5 != 5) {
                    continue;
                } else {
                    int i22 = ((objectUnit[i4].posX / 50) / 45) - 1;
                    int i23 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i24 = i22 + 2;
                    int i25 = i23 + 1;
                    if (i >= i22 && i <= i24 && i2 >= i23 && i2 <= i25) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static int checkTowerUnit() {
        CGPoint firstLastActionTouch = TouchManager.getFirstLastActionTouch();
        if (firstLastActionTouch.x >= 62.0f && firstLastActionTouch.y >= 30.0f && firstLastActionTouch.x < 737.0f && firstLastActionTouch.y < 480.0f) {
            int i = (int) ((firstLastActionTouch.x - 62.0f) / 45.0f);
            int i2 = (int) ((firstLastActionTouch.y - 30.0f) / 45.0f);
            for (int i3 = 0; i3 < towerUnitCount; i3++) {
                if (towerUnit[i3].towerType != -1 && towerUnit[i3].blockX == i && towerUnit[i3].blockY == i2) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static int searchEnemyTouch() {
        CGPoint firstLastActionTouch = TouchManager.getFirstLastActionTouch();
        for (int i = 0; i < monsterUnitCount; i++) {
            if (monsterUnit[i].monsterType != -1 && firstLastActionTouch.x >= ((float) (((monsterUnit[i].posX / 50) + 62) - 20)) && firstLastActionTouch.y >= ((float) (((monsterUnit[i].posY / 50) + 30) - 30)) && firstLastActionTouch.x < (monsterUnit[i].posX / 50) + 62 + 40 && firstLastActionTouch.y < (monsterUnit[i].posY / 50) + 30 + 40) {
                return i;
            }
        }
        return -1;
    }

    public static int searchObjectTouch() {
        CGPoint firstLastActionTouch = TouchManager.getFirstLastActionTouch();
        int i = (int) ((firstLastActionTouch.x - 62.0f) / 45.0f);
        int i2 = (int) ((firstLastActionTouch.y - 30.0f) / 45.0f);
        for (int i3 = 0; i3 < objectUnitCount; i3++) {
            if (objectUnit[i3].objectType != -1 && objectUnit[i3].objectType != -2 && objectUnit[i3].destroyEnableFlag == 0) {
                int i4 = objectUnit[i3].blockSize;
                if (i4 == 0) {
                    int i5 = (objectUnit[i3].posX / 50) / 45;
                    int i6 = (objectUnit[i3].posY / 50) / 45;
                    if (i == i5 && i2 == i6) {
                        return i3;
                    }
                } else if (i4 == 1) {
                    int i7 = (objectUnit[i3].posX / 50) / 45;
                    int i8 = (objectUnit[i3].posY / 50) / 45;
                    int i9 = i8 - 1;
                    if (i == i7 && i2 >= i9 && i2 <= i8) {
                        return i3;
                    }
                } else if (i4 == 2) {
                    int i10 = (objectUnit[i3].posX / 50) / 45;
                    int i11 = (objectUnit[i3].posY / 50) / 45;
                    int i12 = i11 - 1;
                    if (i >= i10 - 1 && i <= i10 && i2 >= i12 && i2 <= i11) {
                        return i3;
                    }
                } else if (i4 == 3) {
                    int i13 = (objectUnit[i3].posX / 50) / 45;
                    int i14 = ((objectUnit[i3].posY / 50) / 45) - 1;
                    int i15 = i13 + 1;
                    int i16 = i14 + 2;
                    if (i >= i13 && i <= i15 && i2 >= i14 && i2 <= i16) {
                        return i3;
                    }
                } else if (i4 == 4) {
                    int i17 = ((objectUnit[i3].posX / 50) / 45) - 1;
                    int i18 = ((objectUnit[i3].posY / 50) / 45) - 1;
                    int i19 = i17 + 1;
                    int i20 = i18 + 2;
                    if (i >= i17 && i <= i19 && i2 >= i18 && i2 <= i20) {
                        return i3;
                    }
                } else if (i4 != 5) {
                    continue;
                } else {
                    int i21 = ((objectUnit[i3].posX / 50) / 45) - 1;
                    int i22 = ((objectUnit[i3].posY / 50) / 45) - 1;
                    int i23 = i21 + 2;
                    int i24 = i22 + 1;
                    if (i >= i21 && i <= i23 && i2 >= i22 && i2 <= i24) {
                        return i3;
                    }
                }
            }
        }
        return -1;
    }

    public void sortTowerEnemyUnit() {
        for (int i = 0; i < monsterUnitCount; i++) {
            monsterSortUnit[i] = monsterUnit[i];
        }
        int i2 = 0;
        while (i2 < monsterUnitCount - 1) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < monsterUnitCount; i4++) {
                if (monsterSortUnit[i2].monsterType == -1) {
                    MonsterUnit[] monsterUnitArr = monsterSortUnit;
                    MonsterUnit monsterUnit2 = monsterUnitArr[i2];
                    monsterUnitArr[i2] = monsterUnitArr[i4];
                    monsterUnitArr[i4] = monsterUnit2;
                } else if (monsterSortUnit[i4].monsterType != -1 && monsterSortUnit[i2].posY > monsterSortUnit[i4].posY) {
                    MonsterUnit[] monsterUnitArr2 = monsterSortUnit;
                    MonsterUnit monsterUnit3 = monsterUnitArr2[i2];
                    monsterUnitArr2[i2] = monsterUnitArr2[i4];
                    monsterUnitArr2[i4] = monsterUnit3;
                }
            }
            i2 = i3;
        }
        for (int i5 = 0; i5 < towerUnitCount; i5++) {
            towerSortUnit[i5] = towerUnit[i5];
        }
        int i6 = 0;
        while (i6 < towerUnitCount - 1) {
            int i7 = i6 + 1;
            for (int i8 = i7; i8 < towerUnitCount; i8++) {
                if (towerSortUnit[i6].towerType == -1) {
                    TowerUnit[] towerUnitArr = towerSortUnit;
                    TowerUnit towerUnit2 = towerUnitArr[i6];
                    towerUnitArr[i6] = towerUnitArr[i8];
                    towerUnitArr[i8] = towerUnit2;
                } else if (towerSortUnit[i8].towerType != -1 && towerSortUnit[i6].posY > towerSortUnit[i8].posY) {
                    TowerUnit[] towerUnitArr2 = towerSortUnit;
                    TowerUnit towerUnit3 = towerUnitArr2[i6];
                    towerUnitArr2[i6] = towerUnitArr2[i8];
                    towerUnitArr2[i8] = towerUnit3;
                }
            }
            i6 = i7;
        }
        for (int i9 = 0; i9 < objectUnitCount; i9++) {
            objectSortUnit[i9] = objectUnit[i9];
        }
        int i10 = 0;
        while (i10 < objectUnitCount - 1) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < objectUnitCount; i12++) {
                if (objectSortUnit[i10].objectType == -1) {
                    ObjectUnit[] objectUnitArr = objectSortUnit;
                    ObjectUnit objectUnit2 = objectUnitArr[i10];
                    objectUnitArr[i10] = objectUnitArr[i12];
                    objectUnitArr[i12] = objectUnit2;
                } else if (objectSortUnit[i12].objectType != -1 && objectSortUnit[i10].posY > objectSortUnit[i12].posY) {
                    ObjectUnit[] objectUnitArr2 = objectSortUnit;
                    ObjectUnit objectUnit3 = objectUnitArr2[i10];
                    objectUnitArr2[i10] = objectUnitArr2[i12];
                    objectUnitArr2[i12] = objectUnit3;
                }
            }
            i10 = i11;
        }
        monsterSortDrawCount = 0;
        towerSortDrawCount = 0;
        objectSortDrawCount = 0;
        if (0 >= monsterUnitCount) {
            monsterSortCheckFlag = false;
        } else {
            monsterSortCheckFlag = true;
        }
        if (towerSortDrawCount >= towerUnitCount) {
            towerSortCheckFlag = false;
        } else {
            towerSortCheckFlag = true;
        }
        if (objectSortDrawCount >= objectUnitCount) {
            objectSortCheckFlag = false;
        } else {
            objectSortCheckFlag = true;
        }
    }

    public static void rewindTowerEnemyUnit() {
        monsterSortDrawCount = 0;
        towerSortDrawCount = 0;
        objectSortDrawCount = 0;
        monsterSortCheckFlag = true;
        towerSortCheckFlag = true;
        objectSortCheckFlag = true;
    }

    public static int getNextDrawObject() {
        int i;
        int i2 = objectSortDrawCount;
        int i3 = -1;
        if (i2 >= objectUnitCount || objectSortUnit[i2].objectType == -1) {
            objectSortCheckFlag = false;
        }
        int i4 = monsterSortDrawCount;
        if (i4 >= monsterUnitCount || monsterSortUnit[i4].monsterType == -1) {
            monsterSortCheckFlag = false;
        }
        int i5 = towerSortDrawCount;
        if (i5 >= towerUnitCount || towerSortUnit[i5].towerType == -1) {
            towerSortCheckFlag = false;
        }
        if (objectSortCheckFlag) {
            i = objectSortUnit[objectSortDrawCount].posY;
            i3 = 2;
        } else if (monsterSortCheckFlag) {
            i = monsterSortUnit[monsterSortDrawCount].posY;
            i3 = 0;
        } else {
            if (towerSortCheckFlag) {
                i = towerSortUnit[towerSortDrawCount].posY;
                i3 = 1;
            }
            return i3;
        }
        for (int i6 = i3 + 1; i6 < 3; i6++) {
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2 && objectSortCheckFlag && i > objectSortUnit[objectSortDrawCount].posY) {
                        i = objectSortUnit[objectSortDrawCount].posY;
                        i3 = 2;
                    }
                } else if (towerSortCheckFlag && i > towerSortUnit[towerSortDrawCount].posY) {
                    i = towerSortUnit[towerSortDrawCount].posY;
                    i3 = 1;
                }
            } else if (monsterSortCheckFlag && i > monsterSortUnit[monsterSortDrawCount].posY) {
                i = monsterSortUnit[monsterSortDrawCount].posY;
                i3 = 0;
            }
        }
        return i3;
    }

    public static int setCurrentWave() {
        int i = myWave;
        clearMonsterUnit();
        int i2 = mapAttackType;
        if (i2 != 0) {
            if (i2 == 1) {
                if (i >= DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[mapNumber]) {
                    i %= DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[mapNumber];
                }
            } else if (i2 == 2 && i >= DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[mapNumber]) {
                return 3;
            }
        } else if (i >= DataWaveMob.DATA_WAVE_COUNT_FOR_LEVEL[mapNumber]) {
            return 1;
        }
        waveMonsterOutPos = 0;
        int[] iArr = waveMonsterType;
        int[][] iArr2 = waveMobData;
        iArr[0] = iArr2[i][0];
        waveMonsterRemainCount[0] = iArr2[i][1];
        if (iArr[0] != -1) {
            waveMonsterShowTime[0] = DataMonster.monsterData[waveMonsterType[0]][8] / 3;
            int[] iArr3 = waveMonsterShowTime;
            iArr3[0] = (iArr3[0] * waveMobData[i][2]) / 100;
        }
        waveMonsterShowCurrent[0] = 0;
        int[] iArr4 = waveMonsterType;
        int[][] iArr5 = waveMobData;
        iArr4[1] = iArr5[i][3];
        waveMonsterRemainCount[1] = iArr5[i][4];
        if (iArr4[1] != -1) {
            waveMonsterShowTime[1] = DataMonster.monsterData[waveMonsterType[1]][8] / 3;
            int[] iArr6 = waveMonsterShowTime;
            iArr6[1] = (iArr6[1] * waveMobData[i][5]) / 100;
        }
        waveMonsterShowCurrent[1] = 0;
        int[][] iArr7 = waveMobData;
        wavePattern = iArr7[i][6];
        gatePattern = iArr7[i][7];
        return 2;
    }

    public static void monsterWaveUpdate() {
        myWaveCount++;
        int i = wavePattern;
        if (i == 0) {
            int[] iArr = waveMonsterRemainCount;
            int i2 = waveMonsterOutPos;
            if (iArr[i2] <= 0) {
                if (i2 == 0) {
                    waveMonsterOutPos = 1;
                    return;
                }
                return;
            }
            int[] iArr2 = waveMonsterShowCurrent;
            iArr2[i2] = iArr2[i2] + 1;
            if (iArr2[i2] >= waveMonsterShowTime[i2]) {
                DataStage.addMonsterUnit(waveMonsterType[i2], false);
                int[] iArr3 = waveMonsterRemainCount;
                int i3 = waveMonsterOutPos;
                iArr3[i3] = iArr3[i3] - 1;
                int[] iArr4 = waveMonsterShowCurrent;
                iArr4[i3] = iArr4[i3] - waveMonsterShowTime[i3];
                monsterOpenTime = 12;
                return;
            }
            return;
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                int[] iArr5 = waveMonsterRemainCount;
                int i4 = waveMonsterOutPos;
                if (iArr5[i4] <= 0) {
                    if (i4 == 0) {
                        waveMonsterOutPos = 1;
                        return;
                    }
                    return;
                }
                int[] iArr6 = waveMonsterShowCurrent;
                iArr6[i4] = iArr6[i4] + 1;
                if (iArr6[i4] >= waveMonsterShowTime[i4]) {
                    DataStage.addMonsterUnit(waveMonsterType[i4], i4 == 0);
                    int[] iArr7 = waveMonsterRemainCount;
                    int i5 = waveMonsterOutPos;
                    iArr7[i5] = iArr7[i5] - 1;
                    int[] iArr8 = waveMonsterShowCurrent;
                    iArr8[i5] = iArr8[i5] - waveMonsterShowTime[i5];
                    monsterOpenTime = 12;
                    return;
                }
                return;
            }
            return;
        }
        int[] iArr9 = waveMonsterRemainCount;
        int i6 = waveMonsterOutPos;
        if (iArr9[i6] <= 0) {
            if (i6 == 0) {
                waveMonsterOutPos = 1;
                return;
            } else {
                waveMonsterOutPos = 0;
                return;
            }
        }
        int[] iArr10 = waveMonsterShowCurrent;
        iArr10[i6] = iArr10[i6] + 1;
        if (iArr10[i6] >= waveMonsterShowTime[i6]) {
            DataStage.addMonsterUnit(waveMonsterType[i6], false);
            int[] iArr11 = waveMonsterRemainCount;
            int i7 = waveMonsterOutPos;
            iArr11[i7] = iArr11[i7] - 1;
            int[] iArr12 = waveMonsterShowCurrent;
            iArr12[i7] = iArr12[i7] - waveMonsterShowTime[i7];
            monsterOpenTime = 12;
            if (i7 == 0) {
                waveMonsterOutPos = 1;
            } else {
                waveMonsterOutPos = 0;
            }
            int[] iArr13 = waveMonsterRemainCount;
            int i8 = waveMonsterOutPos;
            if (iArr13[i8] == 0) {
                if (i8 == 0) {
                    waveMonsterOutPos = 1;
                } else {
                    waveMonsterOutPos = 0;
                }
            }
        }
    }

    public int checkWaveAndFinishCheck() {
        int i = mapAttackType;
        if (i == 0) {
            if (getMonsterCount() > 0) {
                return 0;
            }
            for (int i2 = 0; i2 < 2; i2++) {
                if (waveMonsterRemainCount[i2] > 0) {
                    return 0;
                }
            }
            if (myWavePerfectFlag) {
                destroyScore += ((myWave * 0.1f) + 1.0f) * 600.0f;
            }
            myWave++;
            myWaveCount = 0;
            myWaveStartCount = 60;
            myWavePerfectFlag = true;
            return setCurrentWave();
        }
        if (i == 1) {
            if (getMonsterCount() > 0) {
                return 0;
            }
            for (int i3 = 0; i3 < 2; i3++) {
                if (waveMonsterRemainCount[i3] > 0) {
                    return 0;
                }
            }
            if (myWavePerfectFlag) {
                destroyScore += ((myWave * 0.1f) + 1.0f) * 600.0f;
            }
            myWave++;
            myWaveCount = 0;
            myWaveStartCount = 60;
            myWavePerfectFlag = true;
            return setCurrentWave();
        }
        if (i != 2) {
            return 0;
        }
        boolean z = false;
        for (int i4 = 0; i4 < objectUnitCount; i4++) {
            int i5 = objectUnit[i4].objectType;
            if (i5 == 28 || i5 == 29 || i5 == 32) {
                z = true;
            }
        }
        if (!z) {
            if (myWavePerfectFlag) {
                destroyScore += ((myWave * 0.1f) + 1.0f) * 600.0f;
            }
            return 1;
        }
        if (getMonsterCount() > 0) {
            return 0;
        }
        for (int i6 = 0; i6 < 2; i6++) {
            if (waveMonsterRemainCount[i6] > 0) {
                return 0;
            }
        }
        if (myWavePerfectFlag) {
            destroyScore += ((myWave * 0.1f) + 1.0f) * 600.0f;
        }
        myWave++;
        myWaveCount = 0;
        myWaveStartCount = 60;
        myWavePerfectFlag = true;
        return setCurrentWave();
    }

    public static void getRewardFromMonster(int i, int i2, int i3) {
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (mapAttackType == 1 && i >= (i9 = WAVE_MAX_COUNT)) {
            i5 = i9 - 1;
            i4 = (i - i9) + 1;
            z = true;
        } else {
            i4 = 0;
            z = false;
            i5 = i;
        }
        if (monsterUnit[i2].bossFlag) {
            i6 = DataWave.monsterWaveData[i5][14] + 0;
            if (z) {
                i7 = DataWave.monsterWaveData[60][14];
                i6 += i4 * i7;
            }
        } else {
            i6 = DataWave.monsterWaveData[i5][6] + 0;
            if (z) {
                i7 = DataWave.monsterWaveData[60][6];
                i6 += i4 * i7;
            }
        }
        int upgradeUnitRate = i6 + ((DataWave.monsterWaveData[i5][6] * getUpgradeUnitRate(0, 2)) / 100);
        if (i3 != -1 && towerUnit[i3].heroFlag == 1) {
            upgradeUnitRate += (DataWave.monsterWaveData[i5][6] * getUpgradeItemRate(towerUnit[i3].heroOrder, 8)) / 100;
        }
        int i10 = myMoney + upgradeUnitRate;
        myMoney = i10;
        int[] iArr = awardDataValue;
        if (i10 >= iArr[21]) {
            iArr[21] = i10;
            recheckAwardData();
        }
        if (monsterUnit[i2].bossFlag) {
            i8 = DataWave.monsterWaveData[i5][15] + 0;
            if (z) {
                i8 = DataWave.monsterWaveData[60][15];
            }
        } else {
            i8 = DataWave.monsterWaveData[i5][7] + 0;
            if (z) {
                i8 = DataWave.monsterWaveData[60][7];
            }
        }
        int upgradeUnitRate2 = i8 + ((DataWave.monsterWaveData[i5][7] * getUpgradeUnitRate(0, 3)) / 100);
        if (i3 != -1 && towerUnit[i3].heroFlag == 1) {
            upgradeUnitRate2 += (DataWave.monsterWaveData[i5][7] * getUpgradeItemRate(towerUnit[i3].heroOrder, 8)) / 100;
        }
        myMana += upgradeUnitRate2;
        if (monsterUnit[i2].bossFlag) {
            destroyScore += ((i * 0.1f) + 1.0f) * 120.0f * 5.0f;
        } else {
            destroyScore += ((i * 0.1f) + 1.0f) * 120.0f;
        }
        int[] iArr2 = awardDataValue;
        iArr2[33] = iArr2[33] + 1;
        recheckAwardData();
    }

    public float getRotateDegree(float f, float f2) {
        double d;
        double degrees;
        double degrees2;
        if (f == 0.0f) {
            return f2 < 0.0f ? 0.0f : 180.0f;
        }
        if (f2 == 0.0f) {
            return f < 0.0f ? 270.0f : 90.0f;
        }
        float abs = Math.abs(f2) / Math.abs(f);
        if (f < 0.0f) {
            d = 270.0d;
            if (f2 < 0.0f) {
                degrees = Math.toDegrees(Math.atan(abs));
            } else {
                degrees2 = Math.toDegrees(Math.atan(abs));
                degrees = -degrees2;
            }
        } else {
            d = 90.0d;
            if (f2 < 0.0f) {
                degrees2 = Math.toDegrees(Math.atan(abs));
                degrees = -degrees2;
            } else {
                degrees = Math.toDegrees(Math.atan(abs));
            }
        }
        return (float) (degrees + d);
    }

    public static boolean checkEnableBuyUnit(int i) {
        return myMoney >= getBuyPrice(i);
    }

    public static boolean checkEnableHeroBuyUnit(int i) {
        for (int i2 = 0; i2 < towerUnitCount; i2++) {
            if (towerUnit[i2].towerType != -1 && towerUnit[i2].heroFlag == 1 && towerUnit[i2].heroOrder == i) {
                return false;
            }
        }
        return myMana >= getHeroBuyPrice(i);
    }

    public static void getAddSettingPosition() {
        CGPoint firstLastActionTouch = TouchManager.getFirstLastActionTouch();
        if (firstLastActionTouch.x < 62.0f || firstLastActionTouch.y - 25.0f < 30.0f || firstLastActionTouch.x >= 737.0f || firstLastActionTouch.y - 25.0f >= 480.0f) {
            characterAddBoolean = false;
            characterAddPosX = firstLastActionTouch.x;
            characterAddPosY = firstLastActionTouch.y - 25.0f;
            return;
        }
        int i = (int) ((firstLastActionTouch.x - 62.0f) / 45.0f);
        int i2 = (int) (((firstLastActionTouch.y - 25.0f) - 30.0f) / 45.0f);
        characterAddPosX = (i * 45) + 62 + 22;
        characterAddPosY = (i2 * 45) + 30 + 22;
        if (mapTileData[i][i2] != -1) {
            characterAddBoolean = false;
            return;
        }
        for (int i3 = 0; i3 < towerUnitCount; i3++) {
            if (towerUnit[i3].towerType != -1 && towerUnit[i3].blockX == i && towerUnit[i3].blockY == i2) {
                characterAddBoolean = false;
                return;
            }
        }
        for (int i4 = 0; i4 < objectUnitCount; i4++) {
            if (objectUnit[i4].objectType != -1 && objectUnit[i4].objectType != -2) {
                int i5 = objectUnit[i4].blockSize;
                if (i5 == 0) {
                    int i6 = (objectUnit[i4].posX / 50) / 45;
                    int i7 = (objectUnit[i4].posY / 50) / 45;
                    if (i == i6 && i2 == i7) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 == 1) {
                    int i8 = (objectUnit[i4].posX / 50) / 45;
                    int i9 = (objectUnit[i4].posY / 50) / 45;
                    int i10 = i9 - 1;
                    if (i == i8 && i2 >= i10 && i2 <= i9) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 == 2) {
                    int i11 = (objectUnit[i4].posX / 50) / 45;
                    int i12 = (objectUnit[i4].posY / 50) / 45;
                    int i13 = i12 - 1;
                    if (i >= i11 - 1 && i <= i11 && i2 >= i13 && i2 <= i12) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 == 3) {
                    int i14 = (objectUnit[i4].posX / 50) / 45;
                    int i15 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i16 = i14 + 1;
                    int i17 = i15 + 2;
                    if (i >= i14 && i <= i16 && i2 >= i15 && i2 <= i17) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 == 4) {
                    int i18 = ((objectUnit[i4].posX / 50) / 45) - 1;
                    int i19 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i20 = i18 + 1;
                    int i21 = i19 + 2;
                    if (i >= i18 && i <= i20 && i2 >= i19 && i2 <= i21) {
                        characterAddBoolean = false;
                        return;
                    }
                } else if (i5 != 5) {
                    continue;
                } else {
                    int i22 = ((objectUnit[i4].posX / 50) / 45) - 1;
                    int i23 = ((objectUnit[i4].posY / 50) / 45) - 1;
                    int i24 = i22 + 2;
                    int i25 = i23 + 1;
                    if (i >= i22 && i <= i24 && i2 >= i23 && i2 <= i25) {
                        characterAddBoolean = false;
                        return;
                    }
                }
            }
        }
        characterAddBoolean = true;
    }

    public static int getHeroCount() {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            if (heroUnitType[i2] != -1) {
                i++;
            }
        }
        return i;
    }

    public static void buyHero() {
        int i;
        int i2;
        int heroCount = getHeroCount();
        if (heroCount < 3 && (i2 = myHeroism) >= (i = heroBuyHeroismValue[heroCount])) {
            myHeroism = i2 - i;
            for (int i3 = 0; i3 < 2; i3++) {
                heroItemType[upgradeHeroUnitSelectPos][i3] = -1;
            }
            for (int i4 = 0; i4 < 6; i4++) {
                heroUpgradeValue[upgradeHeroUnitSelectPos][i4] = 0;
            }
            int i5 = upgradeHeroBuySelectPos;
            if (i5 == 0) {
                heroUnitType[upgradeHeroUnitSelectPos] = 0;
            } else if (i5 == 1) {
                heroUnitType[upgradeHeroUnitSelectPos] = 5;
            } else if (i5 == 2) {
                heroUnitType[upgradeHeroUnitSelectPos] = 10;
            }
            timeSave();
            writeSaveData(newTower, 0);
            writeSaveData(newTower, 1);
        }
    }

    public static void sellHero() {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            if (heroUnitType[i2] != -1) {
                i++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            if (heroItemType[upgradeHeroUnitSelectPos][i4] != -1) {
                i3++;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 24; i6++) {
            if (itemUnitValue[i6] == -1) {
                i5++;
            }
        }
        if (i3 > i5) {
            return;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < 24 && i7 < i3; i8++) {
            int[] iArr = itemUnitValue;
            if (iArr[i8] == -1) {
                iArr[i8] = heroItemType[upgradeHeroUnitSelectPos][i7];
                i7++;
            }
        }
        for (int i9 = 0; i9 < 2; i9++) {
            heroItemType[upgradeHeroUnitSelectPos][i9] = -1;
        }
        for (int i10 = 0; i10 < 6; i10++) {
            heroUpgradeValue[upgradeHeroUnitSelectPos][i10] = 0;
        }
        myHeroism += (heroBuyHeroismValue[i - 1] * 50) / 100;
        heroUnitType[upgradeHeroUnitSelectPos] = -1;
        timeSave();
        writeSaveData(newTower, 0);
        writeSaveData(newTower, 1);
    }

    public static void unequipItem() {
        boolean z;
        if (heroItemType[upgradeHeroUnitSelectPos][upgradeHeroEquipSelectPos] == -1) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= 24) {
                z = false;
                break;
            } else {
                if (itemUnitValue[i2] == -1) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        if (z) {
            int i3 = 0;
            while (true) {
                if (i3 >= 24) {
                    break;
                }
                int[] iArr = itemUnitValue;
                if (iArr[i3] == -1) {
                    int[][] iArr2 = heroItemType;
                    int i4 = upgradeHeroUnitSelectPos;
                    int[] iArr3 = iArr2[i4];
                    int i5 = upgradeHeroEquipSelectPos;
                    iArr[i3] = iArr3[i5];
                    iArr2[i4][i5] = -1;
                    break;
                }
                i3++;
            }
            while (i < 23) {
                int i6 = i + 1;
                for (int i7 = i6; i7 < 24; i7++) {
                    int[] iArr4 = itemUnitValue;
                    if (iArr4[i] == -1 || (iArr4[i7] != -1 && iArr4[i] > iArr4[i7])) {
                        int[] iArr5 = itemUnitValue;
                        int i8 = iArr5[i7];
                        iArr5[i7] = iArr5[i];
                        iArr5[i] = i8;
                    }
                }
                i = i6;
            }
        }
    }

    public static boolean equipItem() {
        int[] iArr = itemUnitValue;
        int i = shopShopInventorySelectPos;
        if (iArr[i] == -1) {
            return false;
        }
        int[][] iArr2 = heroItemType;
        int i2 = upgradeHeroUnitSelectPos;
        int[] iArr3 = iArr2[i2];
        int i3 = upgradeHeroEquipSelectPos;
        int i4 = iArr3[i3];
        iArr2[i2][i3] = iArr[i];
        iArr[i] = i4;
        while (i < 23) {
            int i5 = i + 1;
            for (int i6 = i5; i6 < 24; i6++) {
                int[] iArr4 = itemUnitValue;
                if (iArr4[i] == -1 || (iArr4[i6] != -1 && iArr4[i] > iArr4[i6])) {
                    int[] iArr5 = itemUnitValue;
                    int i7 = iArr5[i6];
                    iArr5[i6] = iArr5[i];
                    iArr5[i] = i7;
                }
            }
            i = i5;
        }
        return true;
    }

    public static void getShopList() {
        shopUnitCount = 0;
        for (int i = 0; i < 30; i++) {
            int[] iArr = shopUnitValue;
            int i2 = shopUnitCount;
            iArr[i2] = i;
            shopUnitCount = i2 + 1;
        }
        for (int i3 = shopUnitCount; i3 < 30; i3++) {
            shopUnitValue[i3] = -1;
        }
    }

    public static void getGiftShopList() {
        shopUnitCount = 0;
        for (int i = 0; i < 30; i++) {
            int[] iArr = shopUnitValue;
            int i2 = shopUnitCount;
            iArr[i2] = i;
            shopUnitCount = i2 + 1;
        }
    }

    public static boolean checkInvenEmpty() {
        for (int i = 0; i < 24; i++) {
            if (itemUnitValue[i] == -1) {
                return true;
            }
        }
        return false;
    }

    public static void getItem(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= 24) {
                i3 = -1;
                break;
            } else if (itemUnitValue[i3] == -1) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        itemUnitValue[i3] = i;
        while (i2 < 23) {
            int i4 = i2 + 1;
            for (int i5 = i4; i5 < 24; i5++) {
                int[] iArr = itemUnitValue;
                if (iArr[i2] == -1 || (iArr[i5] != -1 && iArr[i2] > iArr[i5])) {
                    int[] iArr2 = itemUnitValue;
                    int i6 = iArr2[i5];
                    iArr2[i5] = iArr2[i2];
                    iArr2[i2] = i6;
                }
            }
            i2 = i4;
        }
    }

    public static int buyShopItem(int i) {
        int i2;
        int[] iArr = shopUnitValue;
        if (iArr[i] == -1) {
            return 1;
        }
        int i3 = iArr[i];
        if (DataUpgradeItem.upgradeItemData[i3][1] != 0) {
            i2 = 0;
            while (true) {
                if (i2 >= 24) {
                    i2 = -1;
                    break;
                }
                if (itemUnitValue[i2] == -1) {
                    break;
                }
                i2++;
            }
        } else {
            i2 = 0;
        }
        if (i2 == -1) {
            return 3;
        }
        if (DataUpgradeItem.upgradeItemData[i3][3] == 1) {
            if (myHeroism < DataUpgradeItem.upgradeItemData[i3][4]) {
                return 2;
            }
            myHeroism -= DataUpgradeItem.upgradeItemData[i3][4];
            itemUnitValue[i2] = i3;
            int i4 = 0;
            while (i4 < 23) {
                int i5 = i4 + 1;
                for (int i6 = i5; i6 < 24; i6++) {
                    int[] iArr2 = itemUnitValue;
                    if (iArr2[i4] == -1 || (iArr2[i6] != -1 && iArr2[i4] > iArr2[i6])) {
                        int[] iArr3 = itemUnitValue;
                        int i7 = iArr3[i6];
                        iArr3[i6] = iArr3[i4];
                        iArr3[i4] = i7;
                    }
                }
                i4 = i5;
            }
            timeSave();
            writeSaveData(newTower, 0);
            writeSaveData(newTower, 1);
        } else {
            if (i3 == 29 && limitCashBuyCount >= 2) {
                return 1;
            }
            if (i3 != 0) {
                if (i3 != 4) {
                    if (i3 != 8) {
                        if (i3 != 12) {
                            if (i3 != 16) {
                                if (i3 == 20) {
                                    newTower.shopPopPurchaseDlg(11);
                                } else {
                                    switch (i3) {
                                        case 24:
                                            newTower.shopPopPurchaseDlg(12);
                                            break;
                                        case 25:
                                            newTower.shopPopPurchaseDlg(13);
                                            break;
                                        case 26:
                                            newTower.shopPopPurchaseDlg(14);
                                            break;
                                        case 27:
                                            newTower.shopPopPurchaseDlg(15);
                                            break;
                                        case 28:
                                            newTower.shopPopPurchaseDlg(16);
                                            break;
                                        case 29:
                                            newTower.shopPopPurchaseDlg(5);
                                            break;
                                    }
                                }
                            } else {
                                newTower.shopPopPurchaseDlg(10);
                            }
                        } else {
                            newTower.shopPopPurchaseDlg(9);
                        }
                    } else {
                        newTower.shopPopPurchaseDlg(8);
                    }
                } else {
                    newTower.shopPopPurchaseDlg(7);
                }
            } else {
                newTower.shopPopPurchaseDlg(6);
            }
        }
        return 0;
    }

    public static void buyPurchaseItem(int i) {
        int i2;
        switch (i) {
            case 5:
                i2 = 29;
                break;
            case 6:
            default:
                i2 = 0;
                break;
            case 7:
                i2 = 4;
                break;
            case 8:
                i2 = 8;
                break;
            case 9:
                i2 = 12;
                break;
            case 10:
                i2 = 16;
                break;
            case 11:
                i2 = 20;
                break;
            case 12:
                i2 = 24;
                break;
            case 13:
                i2 = 25;
                break;
            case 14:
                i2 = 26;
                break;
            case 15:
                i2 = 27;
                break;
            case 16:
                i2 = 28;
                break;
        }
        int i3 = DataUpgradeItem.upgradeItemData[i2][5];
        if (i3 == 0) {
            myHeroism += DataUpgradeItem.upgradeItemData[i2][2];
        } else if (i3 == 9) {
            resetUpgrade();
        } else if (i3 == 14) {
            limitCashBuyCount++;
        } else {
            getItem(i2);
        }
        timeSave();
        writeSaveData(newTower, 0);
        writeSaveData(newTower, 1);
    }

    public static int sellShopItem() {
        int[] iArr;
        int i;
        int i2 = shopShopInventorySelectPos;
        if (i2 == -1 || (i = (iArr = itemUnitValue)[i2]) == -1) {
            return 1;
        }
        if (i >= 30) {
            iArr[i2] = -1;
        } else {
            if (DataUpgradeItem.upgradeItemData[i][3] == 0) {
                return 2;
            }
            myHeroism += (DataUpgradeItem.upgradeItemData[i][4] * 50) / 100;
            itemUnitValue[shopShopInventorySelectPos] = -1;
        }
        int i3 = shopShopInventorySelectPos;
        while (i3 < 23) {
            int i4 = i3 + 1;
            for (int i5 = i4; i5 < 24; i5++) {
                int[] iArr2 = itemUnitValue;
                if (iArr2[i3] == -1 || (iArr2[i5] != -1 && iArr2[i3] > iArr2[i5])) {
                    int[] iArr3 = itemUnitValue;
                    int i6 = iArr3[i5];
                    iArr3[i5] = iArr3[i3];
                    iArr3[i3] = i6;
                }
            }
            i3 = i4;
        }
        return 0;
    }

    public static int getHitPower(TowerUnit towerUnit2) {
        int upgradeUnitRate;
        int i = towerUnit2.unitPower;
        int i2 = towerUnit2.towerType;
        if (i2 == -1) {
            return 0;
        }
        if (!towerUnit2.heroFlag) {
            int i3 = DataCharacter.charData[i2][11];
            if (i3 == 0) {
                upgradeUnitRate = (getUpgradeUnitRate(1, 7) * i) / 100;
            } else if (i3 == 1) {
                upgradeUnitRate = (getUpgradeUnitRate(2, 7) * i) / 100;
            } else {
                if (i3 != 2) {
                    return i;
                }
                upgradeUnitRate = (getUpgradeUnitRate(3, 7) * i) / 100;
            }
            return i + upgradeUnitRate;
        }
        return i + (((getUpgradeHeroRate(towerUnit2.heroOrder, 7) + getUpgradeItemRate(towerUnit2.heroOrder, 2)) * i) / 100);
    }

    public static int getSoundAttackType(int i) {
        int i2 = towerUnit[i].towerType;
        if (i2 == -1) {
            return -1;
        }
        if (towerUnit[i].heroFlag != 0) {
            int i3 = DataHero.heroData[i2][13];
            if (i3 == 0) {
                return 22;
            }
            if (i3 != 1) {
                return i3 != 2 ? -1 : 29;
            }
            return 26;
        }
        switch (DataCharacter.charData[i2][12]) {
            case 0:
            case 2:
                return 21;
            case 1:
                return 23;
            case 3:
                return 22;
            case 4:
            case 6:
                return 24;
            case 5:
                return 26;
            case 7:
                return 25;
            case 8:
                return 27;
            case 9:
                return 29;
            case 10:
            case 11:
                return 28;
            default:
                return -1;
        }
    }

    public static int getSoundHitType(int i) {
        int i2 = towerUnit[i].towerType;
        if (i2 == -1) {
            return -1;
        }
        if (towerUnit[i].heroFlag != 0) {
            int i3 = DataHero.heroData[i2][13];
            if (i3 == 0) {
                return 1;
            }
            if (i3 != 1) {
                return i3 != 2 ? -1 : 7;
            }
            return 4;
        }
        switch (DataCharacter.charData[i2][12]) {
            case 0:
            case 2:
            case 3:
                return 1;
            case 1:
                return 2;
            case 4:
            case 6:
            case 7:
                return 3;
            case 5:
                return 4;
            case 8:
                return 5;
            case 9:
                return 7;
            case 10:
            case 11:
                return 6;
            default:
                return -1;
        }
    }

    public static int getUpgradeUnitRate(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < 18; i4++) {
            if ((DataUpgradeUnit.upgradeUnitData[i4][5] == i || DataUpgradeUnit.upgradeUnitData[i4][5] == 0) && DataUpgradeUnit.upgradeUnitData[i4][4] == i2) {
                i3 += upgradeUnitValue[i4] * DataUpgradeUnit.upgradeUnitData[i4][0];
            }
        }
        return i3;
    }

    public static int getUpgradeHeroRate(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < 6; i4++) {
            if (DataUpgradeHero.upgradeHeroData[i4][4] == i2) {
                i3 += heroUpgradeValue[i][i4] * DataUpgradeHero.upgradeHeroData[i4][0];
            }
        }
        return i3;
    }

    public static int getUpgradeItemRate(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            int[][] iArr = heroItemType;
            if (iArr[i][i4] != -1) {
                int i5 = iArr[i][i4];
                if (DataUpgradeItem.upgradeItemData[i5][5] == i2) {
                    i3 += DataUpgradeItem.upgradeItemData[i5][2];
                }
            }
        }
        return i3;
    }

    public static void playSound(int i) {
        soundPlayCheckFlag[i] = true;
    }

    public static void playSound2() {
        if (soundPlayCheckFlag == null) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < 31; i2++) {
            int[] iArr = soundPlayDelayCount;
            iArr[i2] = iArr[i2] + 1;
            boolean[] zArr = soundPlayCheckFlag;
            if (zArr[i2]) {
                if (iArr[i2] >= 12) {
                    if (soundFlag) {
                        try {
                            effectMedia.setVolume(i2, Config.effectVolume, Config.musicMaxVolume);
                            effectMedia.play(i2);
                            i++;
                        } catch (Exception unused) {
                        }
                    }
                    soundPlayCheckFlag[i2] = false;
                    soundPlayDelayCount[i2] = 0;
                } else {
                    zArr[i2] = false;
                }
            }
            if (i >= 5) {
                return;
            }
        }
    }

    public static void killSound(int i) {
        try {
            effectMedia.stop(i);
        } catch (Exception ignored) {
        }
    }

    public static void playLoopSound(int i) {
        if (soundFlag) {
            try {
                bgmMedia[i].setVolume(Config.musicVolume, Config.musicMaxVolume);
                bgmMedia[i].play();
            } catch (Exception ignored) {
            }
        }
    }

    public static void stopLoopSound(int i) {
        try {
            bgmMedia[i].stop();
        } catch (Exception ignored) {
        }
    }

    public static void recheckAwardData() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= 10) {
                z = true;
                break;
            } else if (gameClearedFlag[i2][0] <= 0) {
                z = false;
                break;
            } else {
                i2++;
                i++;
            }
        }
        if (z) {
            awardDataFlag[0] = 1;
        }
        int i3 = 0;
        int i4 = 10;
        while (true) {
            if (i3 >= 10) {
                z2 = true;
                break;
            } else if (gameClearedFlag[i4][0] <= 0) {
                z2 = false;
                break;
            } else {
                i4++;
                i3++;
            }
        }
        if (z2) {
            awardDataFlag[1] = 1;
        }
        int i5 = 0;
        int i6 = 20;
        while (true) {
            if (i5 >= 10) {
                z3 = true;
                break;
            } else if (gameClearedFlag[i6][0] <= 0) {
                z3 = false;
                break;
            } else {
                i6++;
                i5++;
            }
        }
        if (z3) {
            awardDataFlag[2] = 1;
        }
        int i7 = 0;
        int i8 = 30;
        while (true) {
            if (i7 >= 10) {
                z4 = true;
                break;
            } else if (gameClearedFlag[i8][0] <= 0) {
                z4 = false;
                break;
            } else {
                i8++;
                i7++;
            }
        }
        if (z4) {
            awardDataFlag[3] = 1;
        }
        int i9 = 0;
        int i10 = 40;
        while (true) {
            if (i9 >= 10) {
                z5 = true;
                break;
            } else if (gameClearedFlag[i10][0] <= 0) {
                z5 = false;
                break;
            } else {
                i10++;
                i9++;
            }
        }
        if (z5) {
            awardDataFlag[4] = 1;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= 50) {
                z6 = true;
                break;
            } else {
                if (gameClearedFlag[i11][0] <= 0) {
                    z6 = false;
                    break;
                }
                i11++;
            }
        }
        if (z6) {
            awardDataFlag[5] = 1;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= 50) {
                z7 = true;
                break;
            } else {
                if (gamePerfectFlag[i12][0] <= 0) {
                    z7 = false;
                    break;
                }
                i12++;
            }
        }
        int i13 = 6;
        if (z7) {
            awardDataFlag[6] = 1;
        }
        int i14 = 0;
        while (true) {
            if (i14 >= 50) {
                z8 = true;
                break;
            } else {
                if (gameClearedFlag[i14][2] <= 0) {
                    z8 = false;
                    break;
                }
                i14++;
            }
        }
        if (z8) {
            awardDataFlag[7] = 1;
        }
        if (rewardDataValue[0] == 1) {
            awardDataFlag[8] = 1;
        }
        if (rewardDataValue[2] == 1) {
            awardDataFlag[9] = 1;
        }
        if (rewardDataValue[4] == 1) {
            awardDataFlag[10] = 1;
        }
        if (awardDataValue[11] >= 3) {
            awardDataFlag[11] = 1;
        }
        int i15 = 12;
        if (awardDataValue[12] >= 1) {
            awardDataFlag[12] = 1;
        }
        int i16 = 0;
        while (true) {
            if (i16 >= 6) {
                z9 = true;
                break;
            } else {
                if (upgradeUnitValue[i16] < getUpgradeUnitMax(i16)) {
                    z9 = false;
                    break;
                }
                i16++;
            }
        }
        if (z9) {
            awardDataFlag[13] = 1;
        }
        int i17 = 6;
        while (true) {
            if (i17 >= 12) {
                z10 = true;
                break;
            } else {
                if (upgradeUnitValue[i17] < getUpgradeUnitMax(i17)) {
                    z10 = false;
                    break;
                }
                i17++;
            }
        }
        if (z10) {
            awardDataFlag[14] = 1;
        }
        while (true) {
            if (i15 >= 18) {
                z11 = true;
                break;
            } else {
                if (upgradeUnitValue[i15] < getUpgradeUnitMax(i15)) {
                    z11 = false;
                    break;
                }
                i15++;
            }
        }
        if (z11) {
            awardDataFlag[15] = 1;
        }
        for (int i18 = 0; i18 < 3; i18++) {
            int i19 = 0;
            while (true) {
                if (i19 >= 6) {
                    z11 = true;
                    break;
                } else {
                    if (heroUpgradeValue[i18][i19] < getUpgradeHeroMax(i18, i19)) {
                        z11 = false;
                        break;
                    }
                    i19++;
                }
            }
            if (z11) {
                break;
            }
        }
        if (z11) {
            awardDataFlag[16] = 1;
        }
        int i20 = 0;
        boolean z13 = true;
        while (i20 < 3) {
            int i21 = 0;
            while (true) {
                if (i21 >= i13) {
                    break;
                }
                if (heroUpgradeValue[i20][i21] < getUpgradeHeroMax(i20, i21)) {
                    z13 = false;
                    break;
                } else {
                    i21++;
                    i13 = 6;
                }
            }
            i20++;
            i13 = 6;
        }
        int i22 = 0;
        while (true) {
            if (i22 >= 18) {
                break;
            }
            if (upgradeUnitValue[i22] < getUpgradeUnitMax(i22)) {
                z13 = false;
                break;
            }
            i22++;
        }
        if (z13) {
            awardDataFlag[17] = 1;
        }
        if (myHeroism >= 1000) {
            awardDataFlag[18] = 1;
        }
        if (myHeroism >= 10000) {
            awardDataFlag[19] = 1;
        }
        int i23 = 0;
        boolean z14 = true;
        for (int i24 = 3; i23 < i24; i24 = 3) {
            int i25 = 0;
            while (true) {
                if (i25 >= 2) {
                    break;
                }
                if (heroItemType[i23][i25] == -1) {
                    z14 = false;
                    break;
                }
                i25++;
            }
            if (!z14) {
                break;
            }
            i23++;
        }
        if (z14) {
            awardDataFlag[20] = 1;
        }
        if (awardDataValue[21] >= 5000) {
            awardDataFlag[21] = 1;
        }
        if (awardDataValue[21] >= 10000) {
            awardDataFlag[22] = 1;
        }
        if (awardDataValue[23] >= 1) {
            awardDataFlag[23] = 1;
        }
        if (awardDataValue[24] >= 1) {
            awardDataFlag[24] = 1;
        }
        if (awardDataValue[25] >= 1) {
            awardDataFlag[25] = 1;
        }
        if (awardDataValue[26] >= 1) {
            awardDataFlag[26] = 1;
        }
        if (awardDataValue[27] >= 1) {
            awardDataFlag[27] = 1;
        }
        if (awardDataValue[28] >= 1) {
            awardDataFlag[28] = 1;
        }
        if (awardDataValue[29] >= 1) {
            awardDataFlag[29] = 1;
        }
        if (awardDataValue[33] >= 100) {
            awardDataFlag[33] = 1;
        }
        if (awardDataValue[33] >= 500) {
            awardDataFlag[34] = 1;
        }
        if (awardDataValue[33] >= 1000) {
            awardDataFlag[35] = 1;
        }
        if (awardDataValue[33] >= GAME_USE12_VIEW_TIME) {
            awardDataFlag[36] = 1;
        }
        if (awardDataValue[33] >= 5000) {
            awardDataFlag[37] = 1;
        }
        if (awardDataValue[33] >= 10000) {
            awardDataFlag[38] = 1;
        }
        if (awardDataValue[39] >= 1) {
            awardDataFlag[39] = 1;
        }
        if (awardDataValue[40] >= 1) {
            awardDataFlag[40] = 1;
        }
        if (awardDataValue[41] >= 1) {
            awardDataFlag[41] = 1;
        }
        if (awardDataValue[42] >= 1) {
            awardDataFlag[42] = 1;
        }
        if (awardDataValue[43] >= 1) {
            awardDataFlag[43] = 1;
        }
        if (awardDataValue[44] >= 1) {
            awardDataFlag[44] = 1;
        }
        if (awardDataValue[45] >= 1) {
            awardDataFlag[45] = 1;
        }
        if (awardDataValue[46] >= 1) {
            awardDataFlag[46] = 1;
        }
        if (awardDataValue[47] >= 1) {
            awardDataFlag[47] = 1;
        }
        if (awardDataValue[48] >= 1) {
            awardDataFlag[48] = 1;
        }
        if (awardDataValue[49] >= 1) {
            awardDataFlag[49] = 1;
        }
        if (awardDataValue[50] >= 1) {
            awardDataFlag[50] = 1;
        }
        if (gamePlayedCount[4][0] > 0) {
            awardDataFlag[51] = 1;
        }
        if (awardDataValue[52] >= 1) {
            awardDataFlag[52] = 1;
        }
        int i26 = 0;
        while (true) {
            if (i26 >= 15) {
                z12 = true;
                break;
            } else {
                if (gamePerfectFlag[i26][0] <= 0) {
                    z12 = false;
                    break;
                }
                i26++;
            }
        }
        if (z12) {
            awardDataFlag[53] = 1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        playTimeCurrentValue = currentTimeMillis;
        int i27 = playTimeTotalValue + ((int) ((currentTimeMillis - playTimeStartValue) / 1000));
        playTimeTotalValue = i27;
        playTimeStartValue = currentTimeMillis;
        int i28 = i27 / 60;
        if (i28 >= 30) {
            awardDataFlag[54] = 1;
        }
        int i29 = i28 / 60;
        if (i29 >= 2) {
            awardDataFlag[55] = 1;
        }
        if (i29 >= 5) {
            awardDataFlag[56] = 1;
        }
        if (i29 >= 10) {
            awardDataFlag[57] = 1;
        }
        if (i29 >= 20) {
            awardDataFlag[58] = 1;
        }
        if (i29 >= 50) {
            awardDataFlag[59] = 1;
        }
        if (i29 >= 100) {
            awardDataFlag[60] = 1;
        }
        if (i29 >= 200) {
            awardDataFlag[61] = 1;
        }
        int i30 = 0;
        for (int i31 = 0; i31 < 62; i31++) {
            if (i31 != 30 && awardDataFlag[i31] == 1) {
                i30++;
            }
        }
        if (i30 >= 10) {
            awardDataFlag[30] = 1;
        }
        int i32 = 0;
        for (int i33 = 0; i33 < 62; i33++) {
            if (i33 != 31 && awardDataFlag[i33] == 1) {
                i32++;
            }
        }
        if (i32 >= 20) {
            awardDataFlag[31] = 1;
        }
        int i34 = 0;
        for (int i35 = 0; i35 < 62; i35++) {
            if (i35 != 32 && awardDataFlag[i35] == 1) {
                i34++;
            }
        }
        if (i34 >= 30) {
            awardDataFlag[32] = 1;
        }
    }

    public static int getAwardDataCount() {
        int i = 0;
        for (int i2 = 0; i2 < 62; i2++) {
            if (awardDataFlag[i2] == 1) {
                i++;
            }
        }
        return i;
    }

    public static int getAwardScoreCount() {
        int i = 0;
        for (int i2 = 0; i2 < 62; i2++) {
            if (awardDataFlag[i2] == 1) {
                i += DataAward.awardScoreValue[i2];
            }
        }
        return i;
    }

    public void setOpeningData(int i) {
        if (gameSubStatus != 25) {
            for (int i2 = 0; i2 < 25; i2++) {
                storyDrawDataBlock[i2] = storyData[gameSubStatus][i2];
            }
            int[] iArr = storyDrawDataBlock;
            iArr[27] = 0;
            iArr[26] = iArr[20];
            iArr[25] = 70;
        }
    }

    public static void setEndingData(int i) {
        if (gameSubStatus != 3) {
            for (int i2 = 0; i2 < 7; i2++) {
                Log.d("STORY COPY", "STORY COPY " + i2);
                story2DrawDataBlock[i2] = story2Data[gameSubStatus][i2];
            }
            int[] iArr = story2DrawDataBlock;
            iArr[9] = 0;
            iArr[8] = iArr[2];
            iArr[7] = 70;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x00da, code lost:
    
        if (r9 >= r5) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void readSaveData(Context context) {
        int i;
        int i2;
        char c;
        FileInputStream openFileInput;
        int i3;
        for (int i4 = 0; i4 < 27392; i4++) {
            saveTotalBuffer[i4] = 0;
        }
        try {
            checkNum = 1;
            checkNum = 2;
            FileInputStream openFileInput2 = context.openFileInput(SAVEFILE_NAME);
            checkNum = 3;
            int read = openFileInput2.read(saveTotalBuffer);
            checkNum = 4;
            Log.d("FILE1 READ", "READ DATA " + read);
            checkNum = 5;
            openFileInput2.close();
            checkNum = 6;
            checkNum = 7;
            i = ByteArrayToInt(saveTotalBuffer, 32);
            checkNum = 8;
        } catch (Exception unused) {
            i = 0;
        }
        for (int i5 = 0; i5 < 27392; i5++) {
            saveTotalBuffer[i5] = 0;
        }
        checkNum = 9;
        try {
            FileInputStream openFileInput3 = context.openFileInput(SAVEFILE_NAME2);
            checkNum = 10;
            int read2 = openFileInput3.read(saveTotalBuffer);
            checkNum = 11;
            Log.d("FILE2 READ", "READ DATA " + read2);
            checkNum = 12;
            openFileInput3.close();
            checkNum = 13;
            checkNum = 14;
            i2 = ByteArrayToInt(saveTotalBuffer, 32);
            checkNum = 15;
            Log.d("TIME COMPARE", "TIME  " + i + "," + i2);
            checkNum = 16;
        } catch (Exception unused2) {
            i2 = 0;
        }
        if (i == 0 || i2 != 0) {
            if (i != 0 || i2 == 0) {
                if (i == 0 || i2 == 0) {
                    return;
                }
            }
            c = 2;
            checkNum = 17;
            if (c != 65535) {
                return;
            }
            checkNum = 18;
            for (int i6 = 0; i6 < 27392; i6++) {
                saveTotalBuffer[i6] = 0;
            }
            checkNum = 19;
            try {
                if (c == 1) {
                    Log.d("FILE1 OPEN", "GOGO!!!");
                    openFileInput = context.openFileInput(SAVEFILE_NAME);
                } else {
                    Log.d("FILE2 OPEN", "GOGO!!!");
                    openFileInput = context.openFileInput(SAVEFILE_NAME2);
                }
                checkNum = 20;
                int read3 = openFileInput.read(saveTotalBuffer);
                checkNum = 21;
                Log.d("FILE REAL READ", "READ DATA " + read3);
                openFileInput.close();
                checkNum = 22;
                if (read3 <= 0) {
                    return;
                }
                checkNum = 23;
                int ByteArrayToInt = ByteArrayToInt(saveTotalBuffer, 32);
                playTimeTotalValue = ByteArrayToInt;
                checkNum = 24;
                if (ByteArrayToInt == 0) {
                    return;
                }
                checkNum = 25;
                checkNum = 26;
                ByteArrayToInt(saveTotalBuffer, 0);
                myHeroism = ByteArrayToInt(saveTotalBuffer, 4);
                Config.musicVolume = ByteArrayToInt(saveTotalBuffer, 8);
                Config.effectVolume = ByteArrayToInt(saveTotalBuffer, 12);
                movieViewFlag = ByteArrayToInt(saveTotalBuffer, 16);
                tutorialFlag = ByteArrayToInt(saveTotalBuffer, 20);
                vibrationFlag = ByteArrayToInt(saveTotalBuffer, 24);
                lastPlayedMapNumber = ByteArrayToInt(saveTotalBuffer, 28);
                playTimeTotalValue = ByteArrayToInt(saveTotalBuffer, 32);
                myPhoneAlertFlag = ByteArrayToInt(saveTotalBuffer, 36);
                limitCashBuyCount = ByteArrayToInt(saveTotalBuffer, 40);
                int i7 = 1600;
                for (int i8 = 0; i8 < 50; i8++) {
                    for (int i9 = 0; i9 < 3; i9++) {
                        highScoreValue[i8][i9] = ByteArrayToInt(saveTotalBuffer, i7);
                        i7 += 4;
                    }
                }
                for (int i10 = 0; i10 < 50; i10++) {
                    for (int i11 = 0; i11 < 3; i11++) {
                        gamePlayedCount[i10][i11] = ByteArrayToInt(saveTotalBuffer, i7);
                        i7 += 4;
                    }
                }
                for (int i12 = 0; i12 < 50; i12++) {
                    for (int i13 = 0; i13 < 3; i13++) {
                        gameClearedFlag[i12][i13] = ByteArrayToInt(saveTotalBuffer, i7);
                        i7 += 4;
                    }
                }
                for (int i14 = 0; i14 < 50; i14++) {
                    for (int i15 = 0; i15 < 3; i15++) {
                        gamePerfectFlag[i14][i15] = ByteArrayToInt(saveTotalBuffer, i7);
                        i7 += 4;
                    }
                }
                for (int i16 = 0; i16 < 18; i16++) {
                    upgradeUnitValue[i16] = ByteArrayToInt(saveTotalBuffer, i7);
                    i7 += 4;
                }
                int i17 = 0;
                while (true) {
                    i3 = 3;
                    if (i17 >= 3) {
                        break;
                    }
                    heroUnitType[i17] = ByteArrayToInt(saveTotalBuffer, i7);
                    i7 += 4;
                    i17++;
                }
                int i18 = 0;
                while (i18 < i3) {
                    for (int i19 = 0; i19 < 2; i19++) {
                        heroItemType[i18][i19] = ByteArrayToInt(saveTotalBuffer, i7);
                        i7 += 4;
                    }
                    i18++;
                    i3 = 3;
                }
                for (int i20 = 0; i20 < i3; i20++) {
                    for (int i21 = 0; i21 < 6; i21++) {
                        heroUpgradeValue[i20][i21] = ByteArrayToInt(saveTotalBuffer, i7);
                        i7 += 4;
                    }
                }
                for (int i22 = 0; i22 < 24; i22++) {
                    itemUnitValue[i22] = ByteArrayToInt(saveTotalBuffer, i7);
                    i7 += 4;
                }
                for (int i23 = 0; i23 < 10; i23++) {
                    rewardDataValue[i23] = ByteArrayToInt(saveTotalBuffer, i7);
                    i7 += 4;
                }
                for (int i24 = 0; i24 < 62; i24++) {
                    awardDataValue[i24] = ByteArrayToInt(saveTotalBuffer, i7);
                    i7 += 4;
                }
                for (int i25 = 0; i25 < 62; i25++) {
                    awardDataFlag[i25] = ByteArrayToInt(saveTotalBuffer, i7);
                    i7 += 4;
                }
                freeAdViewCount = ByteArrayToInt(saveTotalBuffer, i7);
                freeAdViewTime = ByteArrayToLong(saveTotalBuffer, i7 + 4);
                Log.d("FILE READ", "READ count:" + freeAdViewCount + "time" + freeAdViewTime);
                checkNum = 27;
                return;
            } catch (Exception unused3) {
                checkNum += 1000;
                Log.d("FILE READ", "READ ERROR");
                return;
            }
        }
        c = 1;
        checkNum = 17;
        if (c != 65535) {
        }
    }

    public static void readSaveData2(Context context) {
        byte[] bArr = new byte[SAVEFILE_SIZE];
        try {
            FileInputStream openFileInput = context.openFileInput(SAVEFILE_BACKNAME);
            int read = openFileInput.read(bArr);
            openFileInput.close();
            if (read <= 0) {
                return;
            }
            ByteArrayToInt(bArr, 0);
            myHeroism = ByteArrayToInt(bArr, 4);
            Config.musicVolume = ByteArrayToInt(bArr, 8);
            Config.effectVolume = ByteArrayToInt(bArr, 12);
            movieViewFlag = ByteArrayToInt(bArr, 16);
            tutorialFlag = ByteArrayToInt(bArr, 20);
            vibrationFlag = ByteArrayToInt(bArr, 24);
            lastPlayedMapNumber = ByteArrayToInt(bArr, 28);
            playTimeTotalValue = ByteArrayToInt(bArr, 32);
            myPhoneAlertFlag = ByteArrayToInt(bArr, 36);
            limitCashBuyCount = ByteArrayToInt(bArr, 40);
            int i = 1600;
            for (int i2 = 0; i2 < 50; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    highScoreValue[i2][i3] = ByteArrayToInt(bArr, i);
                    i += 4;
                }
            }
            for (int i4 = 0; i4 < 50; i4++) {
                for (int i5 = 0; i5 < 3; i5++) {
                    gamePlayedCount[i4][i5] = ByteArrayToInt(bArr, i);
                    i += 4;
                }
            }
            for (int i6 = 0; i6 < 50; i6++) {
                for (int i7 = 0; i7 < 3; i7++) {
                    gameClearedFlag[i6][i7] = ByteArrayToInt(bArr, i);
                    i += 4;
                }
            }
            for (int i8 = 0; i8 < 50; i8++) {
                for (int i9 = 0; i9 < 3; i9++) {
                    gamePerfectFlag[i8][i9] = ByteArrayToInt(bArr, i);
                    i += 4;
                }
            }
            for (int i10 = 0; i10 < 18; i10++) {
                upgradeUnitValue[i10] = ByteArrayToInt(bArr, i);
                i += 4;
            }
            for (int i11 = 0; i11 < 3; i11++) {
                heroUnitType[i11] = ByteArrayToInt(bArr, i);
                i += 4;
            }
            for (int i12 = 0; i12 < 3; i12++) {
                for (int i13 = 0; i13 < 2; i13++) {
                    heroItemType[i12][i13] = ByteArrayToInt(bArr, i);
                    i += 4;
                }
            }
            for (int i14 = 0; i14 < 3; i14++) {
                for (int i15 = 0; i15 < 6; i15++) {
                    heroUpgradeValue[i14][i15] = ByteArrayToInt(bArr, i);
                    i += 4;
                }
            }
            for (int i16 = 0; i16 < 24; i16++) {
                itemUnitValue[i16] = ByteArrayToInt(bArr, i);
                i += 4;
            }
            for (int i17 = 0; i17 < 10; i17++) {
                rewardDataValue[i17] = ByteArrayToInt(bArr, i);
                i += 4;
            }
            for (int i18 = 0; i18 < 62; i18++) {
                awardDataValue[i18] = ByteArrayToInt(bArr, i);
                i += 4;
            }
            for (int i19 = 0; i19 < 62; i19++) {
                awardDataFlag[i19] = ByteArrayToInt(bArr, i);
                i += 4;
            }
        } catch (Exception unused) {
        }
    }

    public static void timeSave() {
        long currentTimeMillis = System.currentTimeMillis();
        playTimeCurrentValue = currentTimeMillis;
        playTimeTotalValue += (int) ((currentTimeMillis - playTimeStartValue) / 1000);
        playTimeStartValue = currentTimeMillis;
    }

    public static void writeSaveData(Context context, int i) {
        FileOutputStream openFileOutput;
        for (int i2 = 0; i2 < 27392; i2++)
            saveTotalBuffer[i2] = 0;

        IntToByteArray(saveTotalBuffer, 0, 10002);
        IntToByteArray(saveTotalBuffer, 4, myHeroism);
        IntToByteArray(saveTotalBuffer, 16, movieViewFlag);
        IntToByteArray(saveTotalBuffer, 20, tutorialFlag);
        IntToByteArray(saveTotalBuffer, 24, vibrationFlag);
        IntToByteArray(saveTotalBuffer, 28, lastPlayedMapNumber);
        IntToByteArray(saveTotalBuffer, 32, playTimeTotalValue);
        IntToByteArray(saveTotalBuffer, 36, myPhoneAlertFlag);
        IntToByteArray(saveTotalBuffer, 40, limitCashBuyCount);

        int i7 = 1600;
        for (int i8 = 0; i8 < 50; i8++) {
            for (int i9 = 0; i9 < 3; i9++) {
                IntToByteArray(saveTotalBuffer, i7, highScoreValue[i8][i9]);
                i7 += 4;
            }
        }
        for (int i10 = 0; i10 < 50; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                IntToByteArray(saveTotalBuffer, i7, gamePlayedCount[i10][i11]);
                i7 += 4;
            }
        }
        for (int i12 = 0; i12 < 50; i12++) {
            for (int i13 = 0; i13 < 3; i13++) {
                IntToByteArray(saveTotalBuffer, i7, gameClearedFlag[i12][i13]);
                i7 += 4;
            }
        }
        for (int i14 = 0; i14 < 50; i14++) {
            for (int i15 = 0; i15 < 3; i15++) {
                IntToByteArray(saveTotalBuffer, i7, gamePerfectFlag[i14][i15]);
                i7 += 4;
            }
        }
        for (int i16 = 0; i16 < 18; i16++) {
            IntToByteArray(saveTotalBuffer, i7, upgradeUnitValue[i16]);
            i7 += 4;
        }
        for (int i17 = 0; i17 < 3; i17++) {
            IntToByteArray(saveTotalBuffer, i7, heroUnitType[i17]);
            i7 += 4;
        }
        for (int i18 = 0; i18 < 3; i18++) {
            for (int i19 = 0; i19 < 2; i19++) {
                IntToByteArray(saveTotalBuffer, i7, heroItemType[i18][i19]);
                i7 += 4;
            }
        }
        for (int i20 = 0; i20 < 3; i20++) {
            for (int i21 = 0; i21 < 6; i21++) {
                IntToByteArray(saveTotalBuffer, i7, heroUpgradeValue[i20][i21]);
                i7 += 4;
            }
        }
        for (int i22 = 0; i22 < 24; i22++) {
            IntToByteArray(saveTotalBuffer, i7, itemUnitValue[i22]);
            i7 += 4;
        }
        for (int i23 = 0; i23 < 10; i23++) {
            IntToByteArray(saveTotalBuffer, i7, rewardDataValue[i23]);
            i7 += 4;
        }
        for (int i24 = 0; i24 < 62; i24++) {
            IntToByteArray(saveTotalBuffer, i7, awardDataValue[i24]);
            i7 += 4;
        }
        for (int i25 = 0; i25 < 62; i25++) {
            IntToByteArray(saveTotalBuffer, i7, awardDataFlag[i25]);
            i7 += 4;
        }
        IntToByteArray(saveTotalBuffer, i7, freeAdViewCount);
        LongToByteArray(saveTotalBuffer, i7 + 4, freeAdViewTime);
        try {
            if (i == 0) {
                openFileOutput = context.openFileOutput(SAVEFILE_NAME, 0);
            } else {
                openFileOutput = context.openFileOutput(SAVEFILE_NAME2, 0);
            }
            openFileOutput.write(saveTotalBuffer);
            openFileOutput.close();
        } catch (Exception unused) {
        }
    }

    public static void writeSaveData2(Context context) {
        byte[] bArr = new byte[SAVEFILE_SIZE];
        long currentTimeMillis = System.currentTimeMillis();
        playTimeCurrentValue = currentTimeMillis;
        playTimeTotalValue += (int) ((currentTimeMillis - playTimeStartValue) / 1000);
        playTimeStartValue = currentTimeMillis;
        if (Config.musicVolume > Config.musicMaxVolume)
            Config.musicVolume = Config.musicMaxVolume;
        if (Config.effectVolume > Config.musicMaxVolume)
            Config.effectVolume = Config.musicMaxVolume;

        IntToByteArray(bArr, 0, 10002);
        IntToByteArray(bArr, 4, myHeroism);
        IntToByteArray(bArr, 8, Config.musicVolume);
        IntToByteArray(bArr, 12, Config.effectVolume);
        IntToByteArray(bArr, 16, movieViewFlag);
        IntToByteArray(bArr, 20, tutorialFlag);
        IntToByteArray(bArr, 24, vibrationFlag);
        IntToByteArray(bArr, 28, lastPlayedMapNumber);
        IntToByteArray(bArr, 32, playTimeTotalValue);
        IntToByteArray(bArr, 36, myPhoneAlertFlag);
        IntToByteArray(bArr, 40, limitCashBuyCount);

        int i5 = 1600;
        for (int i6 = 0; i6 < 50; i6++) {
            for (int i7 = 0; i7 < 3; i7++) {
                IntToByteArray(bArr, i5, highScoreValue[i6][i7]);
                i5 += 4;
            }
        }
        for (int i8 = 0; i8 < 50; i8++) {
            for (int i9 = 0; i9 < 3; i9++) {
                IntToByteArray(bArr, i5, gamePlayedCount[i8][i9]);
                i5 += 4;
            }
        }
        for (int i10 = 0; i10 < 50; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                IntToByteArray(bArr, i5, gameClearedFlag[i10][i11]);
                i5 += 4;
            }
        }
        for (int i12 = 0; i12 < 50; i12++) {
            for (int i13 = 0; i13 < 3; i13++) {
                IntToByteArray(bArr, i5, gamePerfectFlag[i12][i13]);
                i5 += 4;
            }
        }
        for (int i14 = 0; i14 < 18; i14++) {
            IntToByteArray(bArr, i5, upgradeUnitValue[i14]);
            i5 += 4;
        }
        for (int i15 = 0; i15 < 3; i15++) {
            IntToByteArray(bArr, i5, heroUnitType[i15]);
            i5 += 4;
        }
        for (int i16 = 0; i16 < 3; i16++) {
            for (int i17 = 0; i17 < 2; i17++) {
                IntToByteArray(bArr, i5, heroItemType[i16][i17]);
                i5 += 4;
            }
        }
        for (int i18 = 0; i18 < 3; i18++) {
            for (int i19 = 0; i19 < 6; i19++) {
                IntToByteArray(bArr, i5, heroUpgradeValue[i18][i19]);
                i5 += 4;
            }
        }
        for (int i20 = 0; i20 < 24; i20++) {
            IntToByteArray(bArr, i5, itemUnitValue[i20]);
            i5 += 4;
        }
        for (int i21 = 0; i21 < 10; i21++) {
            IntToByteArray(bArr, i5, rewardDataValue[i21]);
            i5 += 4;
        }
        for (int i22 = 0; i22 < 62; i22++) {
            IntToByteArray(bArr, i5, awardDataValue[i22]);
            i5 += 4;
        }
        for (int i23 = 0; i23 < 62; i23++) {
            IntToByteArray(bArr, i5, awardDataFlag[i23]);
            i5 += 4;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput(SAVEFILE_BACKNAME, 0);
            openFileOutput.write(bArr);
            openFileOutput.close();
        } catch (Exception unused) {
        }
    }

    public static void resetUpgrade() {
        for (int i = 0; i < 18; i++) {
            while (upgradeUnitValue[i] > 0) {
                int i2 = myHeroism;
                int i3 = DataUpgradeUnit.upgradeUnitData[i][1];
                int i4 = DataUpgradeUnit.upgradeUnitData[i][2];
                int[] iArr = upgradeUnitValue;
                myHeroism = i2 + ((i3 * ((i4 * (iArr[i] - 1)) + 100)) / 100);
                iArr[i] = iArr[i] - 1;
            }
        }
        for (int i5 = 0; i5 < 3; i5++) {
            for (int i6 = 0; i6 < 6; i6++) {
                while (heroUpgradeValue[i5][i6] > 0) {
                    int i7 = myHeroism;
                    int i8 = DataUpgradeHero.upgradeHeroData[i6][1];
                    int i9 = DataUpgradeHero.upgradeHeroData[i6][2];
                    int[][] iArr2 = heroUpgradeValue;
                    myHeroism = i7 + ((i8 * ((i9 * (iArr2[i5][i6] - 1)) + 100)) / 100);
                    int[] iArr3 = iArr2[i5];
                    iArr3[i6] = iArr3[i6] - 1;
                }
            }
        }
    }

    public static void sendGiftStartNetwork() {
        for (int i = 0; i < 4; i++) {
            NetworkThread.networkRequestList[i] = 0;
        }
        NetworkThread.networkRequestList[1] = 1;
        NetworkThread.networkFinishFlag = false;
        NetworkThread.networkState = 0;
    }

    public static void getCountStartNetwork() {
        for (int i = 0; i < 4; i++) {
            NetworkThread.networkRequestList[i] = 0;
        }
        NetworkThread.networkRequestList[2] = 1;
        NetworkThread.networkRequestList[3] = 1;
        NetworkThread.networkFinishFlag = false;
        NetworkThread.networkState = 0;
    }

    public static void getItemStartNetwork() {
        for (int i = 0; i < 4; i++) {
            NetworkThread.networkRequestList[i] = 0;
        }
        NetworkThread.networkRequestList[0] = 1;
        NetworkThread.networkRequestList[2] = 1;
        NetworkThread.networkRequestList[3] = 1;
        NetworkThread.networkFinishFlag = false;
        NetworkThread.networkState = 0;
    }

    public static void tempStartNetwork() {
        for (int i = 0; i < 4; i++) {
            NetworkThread.networkRequestList[i] = 0;
        }
        NetworkThread.networkRequestList[1] = 1;
        NetworkThread.networkRequestList[2] = 1;
        NetworkThread.networkRequestList[3] = 1;
        NetworkThread.networkRequestList[0] = 1;
        NetworkThread.networkFinishFlag = false;
        NetworkThread.networkState = 0;
    }
}
