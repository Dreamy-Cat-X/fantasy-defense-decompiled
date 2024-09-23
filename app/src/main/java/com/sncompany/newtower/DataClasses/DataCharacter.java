package com.sncompany.newtower.DataClasses;

/* loaded from: D:\decomp\classes.dex */
public class DataCharacter {
    static final int CHARACTER_NAME_TOTAL_COUNT = 12;
    static final int DATA_CHARACTER_ATTACK_TYPE_MISSILE = 1;
    static final int DATA_CHARACTER_ATTACK_TYPE_SWORD = 0;
    public static final int EFF_NONE = -1;
    public static final int EFF_STUN = 0;
    public static final int EFF_SPLASH = 1;
    public static final int EFF_HOLY = 2;
    public static final int EFF_SLOW = 3;
    public static final int EFF_PIERCE = 4;
    public static final int EFF_MULTISHOT = 7;
    public static final int EFF_DOUBLESHOT = 8;
    public static final int COST = 0;
    public static final int UPGRADE_COST = 1;
    public static final int ATK = 2;
    public static final int ATKRATE = 3;
    public static final int RANGE = 4;
    public static final int TARGET = 5;
    public static final int EFFECT = 6;
    public static final int SUC_RATE = 7;
    public static final int CONT_TIME = 8;
    public static final int ATK_TYPE = 9;
    public static final int ATK_EFFECT = 10;
    public static final String[] characterName = {"Warrior", "Brandisher", "Knight", "Warlord", "Archer", "Holy Eye", "Splatter", "Sky Arrow", "Wizard", "Ice Mage", "Sorceress", "Blaster"};
    public static final int[][] charData = {
            new int[]{300, 600, 130, 23, 100, 1, EFF_NONE, 0, 0, 0, 9}, new int[]{200, 500, 210, 20, 104, 1, EFF_NONE, 0, 0, 0, 9}, new int[]{250, 400, 280, 17, 108, 1, EFF_NONE, 0, 0, 0, 9},
            new int[]{500, 0, 140, 26, 111, 1, EFF_STUN, 74, 60, 0, 9},new int[]{750, 0, 220, 23, 115, 1, EFF_STUN, 82, 75, 0, 9}, new int[]{1000, 0, 310, 20, 119, 1, EFF_STUN, 90, 90, 0, 9},
            new int[]{0, 1200, 230, 16, 108, 1, EFF_NONE, 0, 0, 0, 9}, new int[]{500, 800, 300, 13, 112, 1, EFF_NONE, 0, 0, 0, 9}, new int[]{800, 600, 380, 10, 116, 1, EFF_NONE, 0, 0, 0, 9},
            new int[]{0, 0, 450, 21, 115, 1, EFF_SPLASH, 0, 0, 0, 9}, new int[]{600, 0, 600, 19, 119, 1, EFF_SPLASH, 0, 0, 0, 9}, new int[]{1200, 0, 750, 17, 124, 1, EFF_SPLASH, 0, 0, 0, 9},

            new int[]{300, 600, 80, 24, 230, 1, EFF_NONE, 0, 0, 1, 0}, new int[]{200, 500, 130, 21, 260, 1, EFF_NONE, 0, 0, 1, 0}, new int[]{250, 400, 200, 18, 280, 1, EFF_NONE, 0, 0, 1, 0},
            new int[]{500, 0, 100, 53, 220, 1, EFF_HOLY, 0, 150, 1, 4}, new int[]{750, 0, 200, 49, 240, 1, EFF_HOLY, 0, 200, 1, 4}, new int[]{1000, 0, 300, 45, 260, 1, EFF_HOLY, 0, 250, 1, 4},
            new int[]{0, 1200, 120, 24, 250, 3, EFF_MULTISHOT, 0, 0, 1, 0}, new int[]{500, 800, 180, 21, 265, 3, EFF_MULTISHOT, 0, 0, 1, 0}, new int[]{800, 600, 250, 18, 280, 3, EFF_MULTISHOT, 0, 0, 1, 0},
            new int[]{0, 0, 280, 16, 360, 1, EFF_NONE, 0, 0, 1, 0}, new int[]{600, 0, 360, 13, 400, 1, EFF_NONE, 0, 0, 1, 0}, new int[]{1200, 0, 450, 10, 440, 1, EFF_NONE, 0, 0, 1, 0},

            new int[]{300, 600, 120, 29, 210, 1, EFF_NONE, 0, 0, 1, 10}, new int[]{200, 500, 180, 26, 230, 1, EFF_NONE, 0, 0, 1, 10}, new int[]{250, 400, 260, 23, 240, 1, EFF_NONE, 0, 0, 1, 10},
            new int[]{500, 0, 140, 24, 200, 1, EFF_SLOW, 90, 120, 1, 5}, new int[]{750, 0, 220, 20, 230, 1, EFF_SLOW, 95, 160, 1, 5}, new int[]{1000, 0, 300, 17, 260, 1, EFF_SLOW, 100, 200, 1, 5},
            new int[]{0, 1200, 240, 36, 240, 1, EFF_PIERCE, 0, 0, 1, 3}, new int[]{500, 800, 300, 32, 255, 1, EFF_PIERCE, 0, 0, 1, 3}, new int[]{800, 600, 380, 28, 270, 1, EFF_PIERCE, 0, 0, 1, 3},
            new int[]{0, 0, 320, 24, 280, 1, EFF_SPLASH, 0, 0, 1, 2}, new int[]{600, 0, 420, 21, 290, 1, EFF_SPLASH, 0, 0, 1, 2}, new int[]{1200, 0, 550, 19, 300, 1, EFF_SPLASH, 0, 0, 1, 2}};
}
