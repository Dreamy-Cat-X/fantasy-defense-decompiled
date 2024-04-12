package com.sncompany.newtower.DataClasses;

import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Texture2D;

/* loaded from: D:\decomp\classes.dex */
public class DataHero {
    static final int CHARACTER_NAME_TOTAL_COUNT = 3;
    static final int DATA_HERO_ATTACK_TYPE_MISSILE = 1;
    static final int DATA_HERO_ATTACK_TYPE_SWORD = 0;
    static final int DATA_HERO_ATT_EFFECT = 12;
    static final int DATA_HERO_ATT_PWR = 1;
    static final int DATA_HERO_ATT_RANGE = 3;
    static final int DATA_HERO_ATT_RATE = 2;
    static final int DATA_HERO_ATT_TYPE = 11;
    static final int DATA_HERO_GROUP_TYPE = 13;
    static final int DATA_HERO_Har_101 = 5;
    static final int DATA_HERO_Har_102 = 6;
    static final int DATA_HERO_Har_103 = 7;
    static final int DATA_HERO_Har_104 = 8;
    static final int DATA_HERO_Har_105 = 9;
    static final int DATA_HERO_Hwa_101 = 0;
    static final int DATA_HERO_Hwa_102 = 1;
    static final int DATA_HERO_Hwa_103 = 2;
    static final int DATA_HERO_Hwa_104 = 3;
    static final int DATA_HERO_Hwa_105 = 4;
    static final int DATA_HERO_Hwi_101 = 10;
    static final int DATA_HERO_Hwi_102 = 11;
    static final int DATA_HERO_Hwi_103 = 12;
    static final int DATA_HERO_Hwi_104 = 13;
    static final int DATA_HERO_Hwi_105 = 14;
    static final int DATA_HERO_PRICE = 0;
    static final int DATA_HERO_SPECIAL_ATT_COUNT = 8;
    static final int DATA_HERO_SPECIAL_ATT_PWR = 7;
    static final int DATA_HERO_SPECIAL_COOLTIME = 9;
    static final int DATA_HERO_SPECIAL_MANA = 6;
    static final int DATA_HERO_SPECIAL_TYPE = 5;
    static final int DATA_HERO_SPECIAL_TYPE_DANCING_BLADE = 0;
    static final int DATA_HERO_SPECIAL_TYPE_ICE_QUAKE = 2;
    static final int DATA_HERO_SPECIAL_TYPE_MILLION_ARROW = 1;
    static final int DATA_HERO_SPECIAL_USETIME = 10;
    static final int DATA_HERO_TARGET = 4;
    static final int DATA_HERO_TOTAL_COUNT = 15;
    static final int DATA_HERO_TYPE_COUNT = 14;
    static final int DATA_HERO_TYPE_Har = 1;
    static final int DATA_HERO_TYPE_Hwa = 0;
    static final int DATA_HERO_TYPE_Hwi = 2;
    public static final String[] heroName = {"Champion", "Bow Master", "Archmage"};
    public static final int[][] heroData = {new int[]{250, 200, 27, 150, 1, 0, 500, 550, 1, 125, 0, 0, 9, 0}, new int[]{300, 350, 24, 157, 1, 0, 500, 650, 1, 120, 0, 0, 9, 0}, new int[]{500, 525, 21, 164, 1, 0, 500, 760, 1, 115, 0, 0, 9, 0}, new int[]{800, 725, 18, 170, 1, 0, 500, 870, 1, 110, 0, 0, 9, 0}, new int[]{1200, 950, 15, 176, 1, 0, 500, 980, 1, 105, 0, 0, 9, 0}, new int[]{250, 150, 25, 300, 1, 1, 500, 700, 1, GameRenderer.GAME_SHOP_SHOP_INVENTORY_START_X, 80, 1, 0, 1}, new int[]{300, 270, 21, 340, 1, 1, 500, Texture2D.SCRWIDTH_800, 1, 120, 90, 1, 0, 1}, new int[]{500, GameRenderer.GAME_SHOP_SHOP_INVENTORY_START_Y, 17, 380, 1, 1, 500, GameThread.FREE_REWARD_MOVIE_TIME, 1, 115, 100, 1, 0, 1}, new int[]{Texture2D.SCRWIDTH_800, 540, 13, 420, 1, 1, 500, 1050, 1, 110, 115, 1, 0, 1}, new int[]{1200, 700, 9, 470, 1, 1, 500, 1200, 1, 105, 130, 1, 0, 1}, new int[]{250, 175, 30, 250, 1, 2, 500, GameThread.MYSCORE_WAVE_PERFECT, 1, GameRenderer.GAME_SHOP_SHOP_INVENTORY_START_X, 50, 1, 12, 2}, new int[]{300, 305, 27, 265, 1, 2, 500, 690, 1, 120, 60, 1, 12, 2}, new int[]{500, 440, 24, 280, 1, 2, 500, 790, 1, 115, 70, 1, 12, 2}, new int[]{Texture2D.SCRWIDTH_800, 615, 21, 295, 1, 2, 500, 890, 1, 110, 80, 1, 12, 2}, new int[]{1200, Texture2D.SCRWIDTH_800, 18, GameRenderer.PLAYING_OSCILLATOR_HERO_OUT_MOVE_POS, 1, 2, 500, 1000, 1, 105, 90, 1, 12, 2}};
}
