package com.sncompany.newtower.Battle;

import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.Pages.stage.StagePage;
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
    public int lastGameUpdateCount;
    public int posX;
    public int posY;

    public EffectUnit(DataStage st, int type, int x, int y) {
        this.type = type;
        posX = x;
        posY = y;
        effectCountMax = type == 14 ? 15 : 7;

        StagePage stp = (StagePage)st.page;
        int ind = 0;
        if (type >= 37)
            ind = type - 25;
        else if (type == 36)
            ind = 1; //effectImage_502
        else if (type == 33)
            ind = 10; //effectImage_532
        else if (type >= 13)
            ind = type - 6;
        else if (type == 12)
            ind = 11; //effectImage_533
        else if (type >= 9)
            ind = type - 4;
        else if (type > 0)
            ind = type - 1;
        drawData = DataAnim.effectDrawData[ind];
        drawTexture = stp.effectImages[ind];
    }

    public void drawEffectUnit() {
        if (type == -1)
            return;

        int ybn = type != 14 ? -15 : 10;
        int start = drawData[drawData[1]];
        int count = drawData[start];
        float opa;
        int curr;
        if (effectCount >= count) {
            curr = drawData[(start + 1 + count) - 1];
            opa = 1 - ((effectCount - count) * 0.1f);
        } else {
            curr = drawData[start + 1 + effectCount];
            opa = 1;
        }
        int sta = drawData[drawData[0] + curr];
        int end = drawData[sta];

        int i10 = sta + 1;
        if (opa <= 0)
            return;
        if (opa != 1) {
            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
            Texture2D.setColors(opa);
        }
        for (int i = 0; i < end; i++) {
            int coords = (i * 5) + i10;
            if (drawData[coords + 4] == 0) {
                drawTexture[drawData[coords]].drawAtPointOption((posX / 50) + 62 + drawData[coords + 1], (posY / 50) + 30 + drawData[coords + 2] + ybn, 18);
            } else
                drawTexture[drawData[coords]].drawAtPointOptionFlip((posX / 50) + 62 + drawData[coords + 1], (posY / 50) + 30 + drawData[coords + 2] + ybn, 18);
        }
        if (opa < 1)
            Texture2D.setColors(1);
    }
}
