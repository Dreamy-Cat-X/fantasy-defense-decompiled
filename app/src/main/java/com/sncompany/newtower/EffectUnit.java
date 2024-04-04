package com.sncompany.newtower;

/* loaded from: D:\decomp\classes.dex */
public class EffectUnit {
    public static final int EFFECT_COUNT_MAX_DEFAULT = 7;
    public static final int EFFECT_FRAME_PER_SHOT = 1;
    public static final int EFFECT_UPGRADE_COUNT_MAX_DEFAULT = 15;
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
