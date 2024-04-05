package com.sncompany.newtower;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;

import com.sncompany.newtower.DataClasses.ArrowUnit;
import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataHero;
import com.sncompany.newtower.DataClasses.ObjectUnit;
import com.sncompany.newtower.DataClasses.TowerUnit;

import java.lang.reflect.Array;
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
    public static final int[] GAME_LOADING_PART_STATUS = new int[6];
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
    public static final int MAX_STREAMS = 64;
    public static final int MONSTER_OPEN_TIME = 12;
    public static final int MONSTER_TYPE_NONE = -1;
    public static final int MONSTER_UNIT_MAX_COUNT = 100;
    public static final int MYSCORE_BOSS_MULTI_REWARD = 5;
    public static final int MYSCORE_MONSTER_REWARD = 120;
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
    public static final MyOscillator[] myOscillator = new MyOscillator[20];
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
    public static int[] shopUnitValue;
    public static final boolean soundFlag = true;
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
    public static final int[] upgradeUnitValue = new int[18];
    public static int vibrationFlag;
    public static int viewCount_GAME_SHOP_EQUIP;
    public static int[][] waveMobData;
    public static int[] waveMonsterRemainCount;
    public static int[] waveMonsterShowCurrent;
    public static int[] waveMonsterShowTime;
    public static int[] waveMonsterType;
    public static int wavePattern;
    public static final int[][] GAME_LOADING_PART_DATA = {new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 1, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 0, 1, 0, 0}, new int[]{0, 0, 0, 1, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 0, 0, 0}, new int[]{1, 0, 1, 0, 0, 0}, new int[]{0, 1, 1, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 1, 0}, new int[]{0, 0, 0, 0, 1, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 1}, new int[]{0, 0, 0, 0, 0, 0}};
    public static int gameTimeCount = 0;
    public static final String[] chapterName = {"Dark Forest", "Swamp of Despair", "Eternal Wasteland", "Infernal Volcano", "Nightmarish Demon World"};
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
    public static final int[] storyDataResource = {R.drawable.story_1, R.drawable.story_2, R.drawable.story_3_1, R.drawable.story_3_2, R.drawable.story_3_3, R.drawable.story_4, R.drawable.story_5, R.drawable.story_5_b, R.drawable.story_5_k, R.drawable.story_a_1, R.drawable.story_a_2, R.drawable.story_a_3, R.drawable.story_b_1, R.drawable.story_b_2, R.drawable.story_b_3, R.drawable.story_b_4, R.drawable.story_b_5, R.drawable.story_b_6, R.drawable.story_b_7};
    public static final int[] story2DataResource = {R.drawable.story2_1};
    public static int[] storyDrawDataBlock = new int[28];
    public static final int[][] storyData = {new int[]{103, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 30, 0, 0, 3, 1, 0, 100}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 0, 4, 7, 0, 0, 100}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 30, 0, 8, 9, 0, 0, 100}, new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 30, 0, 10, 11, 0, 0, 100}, new int[]{9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 30, 0, -1, -1, 0, 0, 100}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 102, 0, 0, 0, 0, 0, 30, 0, 12, 15, 1, 0, 100}, new int[]{102, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 30, 0, 16, 18, 0, 0, 100}, new int[]{2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 30, 0, 19, 20, 1, 0, 100}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 15, 40, -1, -1, 0, 0, 50}, new int[]{100, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 15, 0, 21, 22, 0, 0, 100}, new int[]{3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 10, 0, 23, 27, 0, 0, 100}, new int[]{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 10, 0, 28, 29, 0, 0, 100}, new int[]{3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 30, 0, -1, -1, 0, 0, 100}, new int[]{5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 15, 0, 30, 30, 0, 0, 100}, new int[]{5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 15, 0, 31, 31, 0, 0, 100}, new int[]{5, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 15, 40, -1, -1, 0, 0, 50}, new int[]{5, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 5, 1, 1, 1, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 17, 0, 0, 0, 0, 0, 15, 0, -1, -1, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 18, 0, 0, 0, 0, 0, 15, 0, 32, 33, 0, 0, 100}, new int[]{5, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 10, 0, 34, 35, 0, 0, 100}, new int[]{11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 1, 1, 20, 0, -1, -1, 0, 0, 100}, new int[]{6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 1, 20, 0, 36, 38, 0, 0, 100}};
    public static int[] story2DrawDataBlock = new int[10];
    public static final int[][] story2Data = {new int[]{30, 0, 0, 6, 0, 0, 100}, new int[]{30, 150, 7, 14, 0, 0, 100}, new int[]{30, 90, 15, 22, 1, 0, 100}};
    static final String[] TIP_TEXT = {"Tip 1  : Equip the item on your Hero under the [Item] > [Equipment] menu.", "Tip 2  : Clear stages and acquire up to 3 Heroes.", "Tip 3  : Certain stages reward you with a Hero character.", "Tip 4  : Use Mana to increase the levels of your Heroes.", "Tip 5  : Heroes consume Mana to use their special skills.", "Tip 6  : Special skills have a downtime after each use.", "Tip 7  : Clear a stage to receive Hero Points.", "Tip 8  : Configure your game settings under the [Title Screen] > Settings.", "Tip 9  : Basic units can be upgraded up to Level 3.", "Tip 10 : Hero units can be upgraded up to Level 5.", "Tip 11 : Upgrade your units to give them stronger abilities.", "Tip 12 : Use gold to advance your units to higher classes or increase their levels.", "Tip 13 : Increase the level of your units to improve their combat capabilities.", "Tip 14 : Advance your units to higher classes for more versatile abilities. ", "Tip 15 : Reselling a unit returns to you a portion _ of the money that you spent to hire the unit.", "Tip 16 : You will fail a Boss stage if you fail to defeat the bosses.", "Tip 17 : Boss monsters have high HP, but they move slowly.", "Tip 18 : Monsters drop gold and mana upon death.", "Tip 19 : Use Hero Points to buy items under [Item] > [Shop].", "Tip 20 : Use Hero Points to upgrade your Hero and basic units under the [Skill] menu.", "Tip 21 : Knights, the 2nd advanced class of Warrior, _ have high Attack Speed.", "Tip 22 : Warlords, the 3rd advanced class of Warrior, _ inflict Splashed damage to multiple enemies.", "Tip 23 : Special Warrior Brandishers attack monsters with a chance of causing Stun.", "Tip 24 : Splatters, the 2nd advanced class of Archer, _ shoot multi arrows and attack up to 3 enemies at the same time.", "Tip 25 : Sky Arrows, the 3rd advanced class of Archer, _ strike enemies with their extremely Long Attack Range.", "Tip 26 : Special Archer Holy Eyes specialize in DoT (Damage over Time) attacks.", "Tip 27 : Sorceresses, the 2nd advanced class of Wizard, inflict Piercing damage.", "Tip 28 : Blasters, the 3rd advanced class of Wizard, _ inflict Splashed damage with their Fire magic.", "Tip 29 : Special Wizard Ice Mages attack monsters with a chance of causing Slow.", "Tip 30 : Clear all the normal stages to unlock two special modes: _ Destroy the Moon and Infinite.", "Tip 31 : A stage's Infinite Mode is only opened _ when you clear it with a perfect score.", "Tip 32 : The objective of Destroy the Moon is to destroy _ the monster gates where monsters spawn.", "Tip 33 : Destroy stage objects to obtain gold and mana.", "Tip 34 : When clearing a normal stage more than twice,_ you will receive only 70% of the Hero Point reward from the stage.", "Tip 35 : Touch a monster or object to manually attack it.", "Tip 36 : Blasters, the 3rd advanced class of Wizard, _ inflict Splashed damage with their Fire magic.", "Tip 37 : Special Wizard Ice Mages attack monsters with a chance of causing Slow.", "Tip 38 : You will receive a Hero unit or additional ability _each time you clear 5 stages.", "Tip 39 : Clear 25 stages to upgrade your units up to 10 levels.", "Tip 40 : Clear 5 stages to unlock the special skill of your Hero units.", "Tip 41 : Clear 30 stages to unlock the special attack ability _of your Hero units. (Splashed damage or Double Shot)", "Tip 42 : Never hesitate to upgrade your Heroes and basic units _ when facing a difficult stage.", "Tip 43 : Certain stages contain special items for you to discover.", "Tip 43 : Cash items endow special abilities."};
    public static boolean[] cheatData = new boolean[5];

    public static int getAttackSpeed(int i) {
        int i2 = Math.max(0,60 - i);
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

    public GameThread(NewTower nt) {
        newTower = nt;
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
                    DataStage.instance.update_GAME_PLAYING();
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

    public void update_GAME_PRE_LOAD() {
        int i;
        if (Texture2D.gl != null) {
            AudioManager audioManager = (AudioManager) newTower.getSystemService("audio");
            mgr = audioManager;
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            Config.musicMaxVolume = streamMaxVolume;
            Config.musicVolume = streamMaxVolume / 2;
            Config.effectVolume = streamMaxVolume / 2;
            vibrationFlag = 1;
            movieViewFlag = 1;
            tutorialFlag = 0;
            for (int i2 = 0; i2 < myOscillator.length; i2++) {
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
        if (storyDrawDataBlock[27] < storyDrawDataBlock[18])
            storyDrawDataBlock[27]++;
        else if (storyDrawDataBlock[19] > 0)
            storyDrawDataBlock[19]--;
        else if (storyDrawDataBlock[25] > 0)
            storyDrawDataBlock[25]--;
        else {
            if (storyDrawDataBlock[26] >= storyDrawDataBlock[21]) {
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
            storyDrawDataBlock[26]++;
            storyDrawDataBlock[25] = 70;
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
        Config.saveAll(newTower);
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

    //TODO - Replace with stage constructor
    public static void gameStartStatSetting() {
        DataStage.instance = new DataStage(mapNumber, mapAttackType);
        tempCharacterRangeViewNumber = -1;
        commonTargetType = -1;
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
        if (heroUnitType[0] != -1) {
            addHeroTowerUnit(heroUnitType[0], 0, 0, 0, true, true);
        }
        if (heroUnitType[1] != -1) {
            addHeroTowerUnit(heroUnitType[1], 1, 0, 0, true, true);
        }
        if (heroUnitType[2] != -1) {
            addHeroTowerUnit(heroUnitType[2], 2, 0, 0, true, true);
        }
    }

    public static void clearMonsterUnit() {
        for (int i = 0; i < 100; i++) {
            monsterUnit[i].monsterType = -1;
        }
        monsterUnitCount = 0;
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
                } else {
                    arrowUnit[i5].startY = (int) (r7.startY + (abs * i4));
                }
                break;
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
                } else {
                    arrowUnit[i5].startY = (int) (r7.startY + (abs3 * i4));
                }
                break;
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
                } else {
                    arrowUnit[i5].startY = (int) (r7.startY + (abs5 * i4));
                }
                break;
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
                } else {
                    arrowUnit[i5].startY = (int) (r7.startY + (abs7 * i4));
                }
                break;
            break;
        }
        return i5;
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
                } else if (i5 == 5) {
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
                        } catch (Exception ignored) {
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
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
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
        if (awardDataValue[24] >= 1) {
            awardDataFlag[24] = 1;
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
            System.arraycopy(story2Data[gameSubStatus], 0, story2DrawDataBlock, 0, 7);
            int[] iArr = story2DrawDataBlock;
            iArr[9] = 0;
            iArr[8] = iArr[2];
            iArr[7] = 70;
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

}
