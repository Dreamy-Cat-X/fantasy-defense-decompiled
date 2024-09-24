package com.sncompany.newtower.DataClasses;

/* loaded from: D:\decomp\classes.dex */
public class DataCharacter {
    public static final String[] characterName = {"Warrior", "Brandisher", "Knight", "Warlord", "Archer", "Holy Eye", "Splatter", "Sky Arrow", "Wizard", "Ice Mage", "Sorceress", "Blaster"};

    public static final int ATK_SWORD = 0;
    public static final int ATK_ARROW = 1;

    public static final int EFF_NONE = -1;
    public static final int EFF_STUN = 0;
    public static final int EFF_SPLASH = 1;
    public static final int EFF_HOLY = 2;
    public static final int EFF_SLOW = 3;
    public static final int EFF_PIERCE = 4;
    public static final int EFF_MULTISHOT = 7;
    public static final int EFF_DOUBLESHOT = 8;

    public static final int TARGET = 0;
    public static final int EFFECT = 1;
    public static final int ATK_TYPE = 2;
    public static final int ATK_EFFECT = 3;
    public static final int[][] charData = {
            new int[]{1, EFF_NONE, ATK_SWORD, 9}, new int[]{1, EFF_STUN, ATK_SWORD, 9}, new int[]{1, EFF_NONE, ATK_SWORD, 9}, new int[]{1, EFF_SPLASH, ATK_SWORD, 9},//Warriors
            new int[]{1, EFF_NONE, ATK_ARROW, 0}, new int[]{1, EFF_HOLY, ATK_ARROW, 4}, new int[]{3, EFF_MULTISHOT, ATK_ARROW, 0}, new int[]{1, EFF_NONE, ATK_ARROW, 0},//Archers
            new int[]{1, EFF_NONE, ATK_ARROW, 10}, new int[]{1, EFF_SLOW, ATK_ARROW, 5}, new int[]{1, EFF_PIERCE, ATK_ARROW, 3}, new int[]{1, EFF_SPLASH, ATK_ARROW, 2},//Mages
    };//This is for stats that remain same regardless of level
    public static final int COST = 0;
    public static final int UPGRADE_COST = 1;
    public static final int ATK = 2;
    public static final int ATKRATE = 3;
    public static final int RANGE = 4;
    public static final int SUC_RATE = 5;
    public static final int CONT_TIME = 6;
    public static final int[][][] charLvlData = {
            //Warriors
            {new int[]{300, 600, 130, 23, 100}, new int[]{200, 500, 210, 20, 104}, new int[]{250, 400, 280, 17, 108}},
            {new int[]{500, 0, 140, 26, 111, 74, 60}, new int[]{750, 0, 220, 23, 115, 82, 75}, new int[]{1000, 0, 310, 20, 119, 90, 90}},
            {new int[]{0, 1200, 230, 16, 108}, new int[]{500, 800, 300, 13, 112}, new int[]{800, 600, 380, 10, 116}},
            {new int[]{0, 0, 450, 21, 115}, new int[]{600, 0, 600, 19, 119}, new int[]{1200, 0, 750, 17, 124}},
            //Archers
            {new int[]{300, 600, 80, 24, 230}, new int[]{200, 500, 130, 21, 260}, new int[]{250, 400, 200, 18, 280}},
            {new int[]{500, 0, 100, 53, 220, 0, 150}, new int[]{750, 0, 200, 49, 240, 0, 200}, new int[]{1000, 0, 300, 45, 260, 0, 250}},
            {new int[]{0, 1200, 120, 24, 250}, new int[]{500, 800, 180, 21, 265}, new int[]{800, 600, 250, 18, 280}},
            {new int[]{0, 0, 280, 16, 360}, new int[]{600, 0, 360, 13, 400}, new int[]{1200, 0, 450, 10, 440}},
            //Mages
            {new int[]{300, 600, 120, 29, 210}, new int[]{200, 500, 180, 26, 230}, new int[]{250, 400, 260, 23, 240}},
            {new int[]{500, 0, 140, 24, 200, 90, 120}, new int[]{750, 0, 220, 20, 230, 95, 160}, new int[]{1000, 0, 300, 17, 260, 100, 200}},
            {new int[]{0, 1200, 240, 36, 240}, new int[]{500, 800, 300, 32, 255}, new int[]{800, 600, 380, 28, 270}},
            {new int[]{0, 0, 320, 24, 280}, new int[]{600, 0, 420, 21, 290}, new int[]{1200, 0, 550, 19, 300}}};
}
