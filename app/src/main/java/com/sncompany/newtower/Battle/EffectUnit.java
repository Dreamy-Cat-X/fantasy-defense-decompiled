package com.sncompany.newtower.Battle;

import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Texture2D;

/* loaded from: D:\decomp\classes.dex */
public class EffectUnit extends StageEntity {
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

    public void drawEffectUnit() {
        int[] iArr;
        Texture2D[] texture2DArr;
        int i2;
        float f;
        int i3 = GameThread.effectUnit[i].effectType;
        if (i3 == -1) {
            return;
        }
        if (i3 != 0) {
            if (i3 != 33) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                if (i3 != 9) {
                                    if (i3 == 10) {
                                        iArr = DataAnim.unitDrawData_510;
                                        texture2DArr = effectImage_510;
                                    } else {
                                        switch (i3) {
                                            case 12:
                                                iArr = DataAnim.unitDrawData_533;
                                                texture2DArr = effectImage_533;
                                                break;
                                            case 13:
                                                iArr = DataAnim.unitDrawData_512;
                                                texture2DArr = effectImage_512;
                                                break;
                                            case 14:
                                                iArr = DataAnim.unitDrawData_513;
                                                texture2DArr = effectImage_513;
                                                break;
                                            case 15:
                                                iArr = DataAnim.unitDrawData_514;
                                                texture2DArr = effectImage_514;
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 36:
                                                        iArr = DataAnim.unitDrawData_502;
                                                        texture2DArr = effectImage_502;
                                                        break;
                                                    case 37:
                                                        iArr = DataAnim.unitDrawData_534;
                                                        texture2DArr = effectImage_534;
                                                        break;
                                                    case 38:
                                                        iArr = DataAnim.unitDrawData_535;
                                                        texture2DArr = effectImage_535;
                                                        break;
                                                    default:
                                                        iArr = DataAnim.unitDrawData_500;
                                                        texture2DArr = effectImage_500;
                                                        break;
                                                }
                                        }
                                    }
                                } else {
                                    iArr = DataAnim.unitDrawData_509;
                                    texture2DArr = effectImage_509;
                                }
                            } else {
                                iArr = DataAnim.unitDrawData_505;
                                texture2DArr = effectImage_505;
                            }
                        } else {
                            iArr = DataAnim.unitDrawData_504;
                            texture2DArr = effectImage_504;
                        }
                    } else {
                        iArr = DataAnim.unitDrawData_503;
                        texture2DArr = effectImage_503;
                    }
                } else {
                    iArr = DataAnim.unitDrawData_502;
                    texture2DArr = effectImage_502;
                }
            } else {
                iArr = DataAnim.unitDrawData_532;
                texture2DArr = effectImage_532;
            }
        } else {
            iArr = DataAnim.unitDrawData_500;
            texture2DArr = effectImage_500;
        }
        int i4 = i3 != 14 ? -15 : 10;
        int i5 = iArr[iArr[1] + 0];
        int i6 = iArr[i5];
        int i7 = i5 + 1;
        if (GameThread.effectUnit[i].effectCount >= i6 * 1) {
            i2 = iArr[(i7 + i6) - 1];
            f = 1.0f - ((GameThread.effectUnit[i].effectCount - r8) * 0.1f);
        } else {
            i2 = iArr[i7 + (GameThread.effectUnit[i].effectCount / 1)];
            f = 1.0f;
        }
        int i8 = iArr[iArr[0] + i2];
        int i9 = iArr[i8];
        int i10 = i8 + 1;
        if (f != 1.0f && f > 0.0f) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f, f, f, f);
        }
        if (f > 0.0f) {
            for (int i11 = 0; i11 < i9; i11++) {
                int i12 = (i11 * 5) + i10;
                if (iArr[i12 + 4] == 0) {
                    texture2DArr[iArr[i12]].drawAtPointOption((GameThread.effectUnit[i].posX / 50) + 62 + iArr[i12 + 1], (GameThread.effectUnit[i].posY / 50) + 30 + iArr[i12 + 2] + i4, 18);
                } else {
                    texture2DArr[iArr[i12]].drawAtPointOptionFlip((GameThread.effectUnit[i].posX / 50) + 62 + iArr[i12 + 1], (GameThread.effectUnit[i].posY / 50) + 30 + iArr[i12 + 2] + i4, 18);
                }
            }
        }
        if (f == 1.0f || f <= 0.0f) {
            return;
        }
        Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
    }
}
