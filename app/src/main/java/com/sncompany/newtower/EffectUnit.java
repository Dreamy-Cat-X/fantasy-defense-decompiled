package com.sncompany.newtower;

/* loaded from: D:\decomp\classes.dex */
public class EffectUnit {
    public static final int EFFECT_COUNT_MAX_DEFAULT = 7;
    public static final int EFFECT_FRAME_PER_SHOT = 1;
    public static final int EFFECT_UPGRADE_COUNT_MAX_DEFAULT = 15;
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

    public int effectCount = 0;
    public int effectCountMax;
    public int effectType;
    public int lastGameUpdateCount;
    public int posX;
    public int posY;

    public EffectUnit(int type, int x, int y) {
        effectType = type;
        posX = x;
        posY = y;
        effectCountMax = type == 14 ? 15 : 7;
    }
}
