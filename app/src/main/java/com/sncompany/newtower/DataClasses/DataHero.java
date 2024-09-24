package com.sncompany.newtower.DataClasses;

public class DataHero {
    public static final String[] heroName = {"Champion", "Bow Master", "Archmage"};

    public static final int TARGET = 0;
    public static final int SP_MANA = 1;
    public static final int SP_ATK_COUNT = 2;
    public static final int ATK_TYPE = 3;
    public static final int ATK_EFFECT = 4;
    public static final int[][] heroData = {
            new int[]{1, 500, 1, DataCharacter.ATK_SWORD, 9},
            new int[]{1, 500, 1, DataCharacter.ATK_ARROW, 0},
            new int[]{1, 500, 1, DataCharacter.ATK_ARROW, 12}
    };//This is for stats that remain same regardless of level
    public static final int PRICE = 0;
    public static final int ATK = 1;
    public static final int ATKRATE = 2;
    public static final int RANGE = 3;
    public static final int SP_ATK = 4;
    public static final int SP_COOLDOWN = 5;
    public static final int SP_PROCTIME = 6;
    public static final int[][][] heroLvData = {
            {new int[]{250, 200, 27, 150, 550, 125, 0}, new int[]{300, 350, 24, 157, 650, 120, 0}, new int[]{500, 525, 21, 164, 760, 115, 0}, new int[]{800, 725, 18, 170, 870, 110, 0}, new int[]{1200, 950, 15, 176, 980, 105, 0}},
            {new int[]{250, 150, 25, 300, 700, 125, 80}, new int[]{300, 270, 21, 340, 800, 120, 90}, new int[]{500, 390, 17, 380, 900, 115, 100}, new int[]{800, 540, 13, 420, 1050, 110, 115}, new int[]{1200, 700, 9, 470, 1200, 105, 130}},
            {new int[]{250, 175, 30, 250, 600, 125, 50}, new int[]{300, 305, 27, 265, 690, 120, 60}, new int[]{500, 440, 24, 280, 790, 115, 70}, new int[]{800, 615, 21, 295, 890, 110, 80}, new int[]{1200, 800, 18, 310, 1000, 105, 90}}};
}
