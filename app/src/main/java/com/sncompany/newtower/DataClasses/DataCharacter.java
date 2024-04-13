package com.sncompany.newtower.DataClasses;

/* loaded from: D:\decomp\classes.dex */
public class DataCharacter {
    static final int CHARACTER_NAME_TOTAL_COUNT = 12;
    static final int DATA_CHARACTER_ATTACK_TYPE_MISSILE = 1;
    static final int DATA_CHARACTER_ATTACK_TYPE_SWORD = 0;
    static final int DATA_CHARACTER_EFFECT_TYPE_DOT_HOLY = 2;
    static final int DATA_CHARACTER_EFFECT_TYPE_DOUBLESHOT = 8;
    static final int DATA_CHARACTER_EFFECT_TYPE_MULTISHOT = 7;
    static final int DATA_CHARACTER_EFFECT_TYPE_PIERCE = 4;
    static final int DATA_CHARACTER_EFFECT_TYPE_SLOW_ICE = 3;
    static final int DATA_CHARACTER_EFFECT_TYPE_SPLASH = 1;
    static final int DATA_CHARACTER_EFFECT_TYPE_STUN = 0;
    static final int DATA_CHARACTER_PRICE = 0;
    static final int DATA_CHARACTER_UPGRADE_PRICE = 1;
    static final int DATA_CHARACTER_ATT_PWR = 2;
    static final int DATA_CHARACTER_ATT_RATE = 3;
    static final int DATA_CHARACTER_ATT_RANGE = 4;
    static final int DATA_CHARACTER_TARGET = 5;
    static final int DATA_CHARACTER_EFFECT = 6;
    static final int DATA_CHARACTER_SUC_RATE = 7;
    static final int DATA_CHARACTER_CONT_TIME = 8;
    static final int DATA_CHARACTER_ATT_TYPE = 9;
    static final int DATA_CHARACTER_ATT_EFFECT = 10;
    static final int DATA_CHARACTER_CHAR_TYPE = 11;
    static final int DATA_CHARACTER_CHAR_DETAIL_TYPE = 12;
    static final int DATA_CHARACTER_CHAR_TOTAL_PRICE = 13;
    static final int DATA_CHARACTER_TYPE_Wa = 0;
    static final int DATA_CHARACTER_TYPE_Ar = 1;
    static final int DATA_CHARACTER_TYPE_Wi = 2;
    static final int DATA_CHARACTER_TYPE_DETAIL_Wa_1 = 0;
    static final int DATA_CHARACTER_TYPE_DETAIL_Wa_2 = 1;
    static final int DATA_CHARACTER_TYPE_DETAIL_Wa_3 = 2;
    static final int DATA_CHARACTER_TYPE_DETAIL_Wa_4 = 3;
    static final int DATA_CHARACTER_TYPE_DETAIL_Ar_1 = 4;
    static final int DATA_CHARACTER_TYPE_DETAIL_Ar_2 = 5;
    static final int DATA_CHARACTER_TYPE_DETAIL_Ar_3 = 6;
    static final int DATA_CHARACTER_TYPE_DETAIL_Ar_4 = 7;
    static final int DATA_CHARACTER_TYPE_DETAIL_Wi_1 = 8;
    static final int DATA_CHARACTER_TYPE_DETAIL_Wi_2 = 9;
    static final int DATA_CHARACTER_TYPE_DETAIL_Wi_3 = 10;
    static final int DATA_CHARACTER_TYPE_DETAIL_Wi_4 = 11;
    static final int DATA_CHARACTER_TYPE_COUNT = 14;
    static final int DATA_CHARACTER_Wa_101 = 0;
    static final int DATA_CHARACTER_Wa_102 = 1;
    static final int DATA_CHARACTER_Wa_103 = 2;
    static final int DATA_CHARACTER_Wa_201 = 3;
    static final int DATA_CHARACTER_Wa_202 = 4;
    static final int DATA_CHARACTER_Wa_203 = 5;
    static final int DATA_CHARACTER_Wa_301 = 6;
    static final int DATA_CHARACTER_Wa_302 = 7;
    static final int DATA_CHARACTER_Wa_303 = 8;
    static final int DATA_CHARACTER_Wa_401 = 9;
    static final int DATA_CHARACTER_Wa_402 = 10;
    static final int DATA_CHARACTER_Wa_403 = 11;
    static final int DATA_CHARACTER_Ar_101 = 12;
    static final int DATA_CHARACTER_Ar_102 = 13;
    static final int DATA_CHARACTER_Ar_103 = 14;
    static final int DATA_CHARACTER_Ar_201 = 15;
    static final int DATA_CHARACTER_Ar_202 = 16;
    static final int DATA_CHARACTER_Ar_203 = 17;
    static final int DATA_CHARACTER_Ar_301 = 18;
    static final int DATA_CHARACTER_Ar_302 = 19;
    static final int DATA_CHARACTER_Ar_303 = 20;
    static final int DATA_CHARACTER_Ar_401 = 21;
    static final int DATA_CHARACTER_Ar_402 = 22;
    static final int DATA_CHARACTER_Ar_403 = 23;
    static final int DATA_CHARACTER_Wi_101 = 24;
    static final int DATA_CHARACTER_Wi_102 = 25;
    static final int DATA_CHARACTER_Wi_103 = 26;
    static final int DATA_CHARACTER_Wi_201 = 27;
    static final int DATA_CHARACTER_Wi_202 = 28;
    static final int DATA_CHARACTER_Wi_203 = 29;
    static final int DATA_CHARACTER_Wi_301 = 30;
    static final int DATA_CHARACTER_Wi_302 = 31;
    static final int DATA_CHARACTER_Wi_303 = 32;
    static final int DATA_CHARACTER_Wi_401 = 33;
    static final int DATA_CHARACTER_Wi_402 = 34;
    static final int DATA_CHARACTER_Wi_403 = 35;
    static final int DATA_CHARACTER_TOTAL_COUNT = 36;
    public static final String[] characterName = {"Warrior", "Brandisher", "Knight", "Warlord", "Archer", "Holy Eye", "Splatter", "Sky Arrow", "Wizard", "Ice Mage", "Sorceress", "Blaster"};
    public static final int[][] charData = {
            new int[]{300, 600, 130, 23, 100, 1, -1, 0, 0, 0, 9, 0, 0, 300}, new int[]{200, 500, 210, 20, 104, 1, -1, 0, 0, 0, 9, 0, 0, 500}, new int[]{250, 400, 280, 17, 108, 1, -1, 0, 0, 0, 9, 0, 0, 750},
            new int[]{500, 0, 140, 26, 111, 1, 0, 74, 60, 0, 9, 0, 1, 500},new int[]{750, 0, 220, 23, 115, 1, 0, 82, 75, 0, 9, 0, 1, 1250}, new int[]{1000, 0, 310, 20, 119, 1, 0, 90, 90, 0, 9, 0, 1, 2250},
            new int[]{0, 1200, 230, 16, 108, 1, -1, 0, 0, 0, 9, 0, 2, 900}, new int[]{500, 800, 300, 13, 112, 1, -1, 0, 0, 0, 9, 0, 2, 1400}, new int[]{800, 600, 380, 10, 116, 1, -1, 0, 0, 0, 9, 0, 2, 2200},
            new int[]{0, 0, 450, 21, 115, 1, 1, 0, 0, 0, 9, 0, 3, 2100}, new int[]{600, 0, 600, 19, 119, 1, 1, 0, 0, 0, 9, 0, 3, 2700}, new int[]{1200, 0, 750, 17, 124, 1, 1, 0, 0, 0, 9, 0, 3, 3900},

            new int[]{300, 600, 80, 24, 230, 1, -1, 0, 0, 1, 0, 1, 4, 300}, new int[]{200, 500, 130, 21, 260, 1, -1, 0, 0, 1, 0, 1, 4, 500}, new int[]{250, 400, 200, 18, 280, 1, -1, 0, 0, 1, 0, 1, 4, 750},
            new int[]{500, 0, 100, 53, 220, 1, 2, 0, 150, 1, 4, 1, 5, 500}, new int[]{750, 0, 200, 49, 240, 1, 2, 0, 200, 1, 4, 1, 5, 1250}, new int[]{1000, 0, 300, 45, 260, 1, 2, 0, 250, 1, 4, 1, 5, 2250},
            new int[]{0, 1200, 120, 24, 250, 3, 7, 0, 0, 1, 0, 1, 6, 900}, new int[]{500, 800, 180, 21, 265, 3, 7, 0, 0, 1, 0, 1, 6, 1400}, new int[]{800, 600, 250, 18, 280, 3, 7, 0, 0, 1, 0, 1, 6, 2200},
            new int[]{0, 0, 280, 16, 360, 1, -1, 0, 0, 1, 0, 1, 7, 2100}, new int[]{600, 0, 360, 13, 400, 1, -1, 0, 0, 1, 0, 1, 7, 2700}, new int[]{1200, 0, 450, 10, 440, 1, -1, 0, 0, 1, 0, 1, 7, 3900},

            new int[]{300, 600, 120, 29, 210, 1, -1, 0, 0, 1, 10, 2, 8, 300}, new int[]{200, 500, 180, 26, 230, 1, -1, 0, 0, 1, 10, 2, 8, 500}, new int[]{250, 400, 260, 23, 240, 1, -1, 0, 0, 1, 10, 2, 8, 750},
            new int[]{500, 0, 140, 24, 200, 1, 3, 90, 120, 1, 5, 2, 9, 500}, new int[]{750, 0, 220, 20, 230, 1, 3, 95, 160, 1, 5, 2, 9, 1250}, new int[]{1000, 0, 300, 17, 260, 1, 3, 100, 200, 1, 5, 2, 9, 2250},
            new int[]{0, 1200, 240, 36, 240, 1, 4, 0, 0, 1, 3, 2, 10, 900}, new int[]{500, 800, 300, 32, 255, 1, 4, 0, 0, 1, 3, 2, 10, 1400}, new int[]{800, 600, 380, 28, 270, 1, 4, 0, 0, 1, 3, 2, 10, 2200},
            new int[]{0, 0, 320, 24, 280, 1, 1, 0, 0, 1, 2, 2, 11, 2100}, new int[]{600, 0, 420, 21, 290, 1, 1, 0, 0, 1, 2, 2, 11, 2700}, new int[]{1200, 0, 550, 19, 300, 1, 1, 0, 0, 1, 2, 2, 11, 3900}};
}
