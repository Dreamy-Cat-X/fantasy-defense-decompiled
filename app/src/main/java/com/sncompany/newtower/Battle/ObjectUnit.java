package com.sncompany.newtower.Battle;

import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataObject;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Pages.stage.StageBase;
import com.sncompany.newtower.Texture2D;

/* loaded from: D:\decomp\classes.dex */
public class ObjectUnit extends EnemyUnit {
    static final float OBJECT_VANISHING_ALPHA_DEGREE = 0.066f;
    public static final int OBJECT_VANISHING_COUNT = 30;
    public static final int OBJECT_VANISHING_HALF_COUNT = 15;
    public final int blockSize;
    public final int blockX;
    public final int blockY;
    public final int rewardType;
    public final int rewardValue;
    public final int oType;
    public boolean destroyEnableFlag;
    public int objectLastVanishTime;
    public int objectVanishCount;

    public ObjectUnit(int oType, int bX, int bY) {
        super(null);
        for (int ODataI = 0; ODataI < DataObject.objectData.length; ODataI++)
            if (oType == DataObject.objectData[ODataI][0]) {
                type = ODataI;
                break;
            }
        this.oType = type;
        objectVanishCount = 0;
        destroyEnableFlag = DataObject.objectData[type][1] == 0;
        unitHP = unitMaxHP = DataObject.objectData[type][2];
        rewardType = DataObject.objectData[type][3];
        rewardValue = DataObject.objectData[type][4];
        blockSize = DataObject.objectData[type][5];
        blockX = bX;
        blockY = bY;
        switch (blockSize) {
            case 0: case 3: case 4: case 5:
                posX = ((bX * 45) + 22) * 50;
                posY = ((bY * 45) + 22) * 50;
                break;
            case 1:
                posX = ((bX * 45) + 22) * 50;
                posY = (((bY + 1) * 45) + 22) * 50;
                break;
            case 2:
                posX = (bX + 1) * 45 * 50;
                posY = (((bY + 1) * 45) + 22) * 50;
                break;
            default:
                posX = 0;
                posY = 0;
        }
    }

    /**
     * Copy constructor that assigns stage when needed
     * @param sta The stage
     * @param ori The objectUnit to copy
     */
    public ObjectUnit(DataStage sta, ObjectUnit ori) {
        super(sta);

        type = oType = ori.oType;
        objectVanishCount = ori.objectVanishCount;
        destroyEnableFlag = ori.destroyEnableFlag;
        unitHP = ori.unitHP;
        unitMaxHP = ori.unitMaxHP;
        rewardType = ori.rewardType;
        rewardValue = ori.rewardValue;
        blockSize = ori.blockSize;
        blockX = ori.blockX;
        blockY = ori.blockY;
        posX = ori.posX;
        posY = ori.posY;
    }

    @Override
    public boolean update() {
        if (type == -2) {
            if (objectLastVanishTime != GameThread.gameTimeCount) {
                objectVanishCount++;
                if (objectVanishCount == OBJECT_VANISHING_COUNT)
                    type = -1;

                objectLastVanishTime = GameThread.gameTimeCount;
            }
        }
        return false;
    }

    @Override
    public void hit(int eff, TowerUnit ent) {
        if (dead())
            return;

        int soundHitType = ent.getSoundHitType();
        if (soundHitType != -1)
            GameThread.playSound(soundHitType);

        unitHP -= ent.unitPower;
        if (unitHP <= 0)
            kill(ent);
        if (ent.effectType == 1)
            ent.hitUnitSplash(0, this);
    }

    @Override
    public boolean dead() {
        return destroyEnableFlag && super.dead();
    }

    @Override
    public void kill(TowerUnit uni) {
        if (rewardType != 0) {
            if (rewardType != 1)
                return;
            st.mana += rewardValue;
            return;
        }
        st.money += rewardValue;
        DataAward.check_money(st.money);

        type = -2;
        st.addEffectUnit(EffectUnit.EFFECT_TYPE_DIE, posX, posY);
        if (st.selectedTarget == this)
            st.selectedTarget = null;
    }

    public void draw() {
        float x = posX / 50f + 62, y = posY / 50f + 30;

        if (type == -2) {
            float f3 = objectVanishCount < OBJECT_VANISHING_HALF_COUNT ? 1 : 1 - (objectVanishCount * OBJECT_VANISHING_ALPHA_DEGREE);
            Texture2D.gl.glTexEnvf(8960, 8704, 8448);
            Texture2D.setAlpha(f3);
            int i2 = rewardType;
            if (i2 == 0) {
                st.page.uiUpperImage[StageBase.upper_money].drawAtPointOption(x - 1, y - (objectVanishCount * 2), 20);
                GameRenderer.drawNumberBlock(rewardValue,st.page.numberMoneyImage, x + 1, (y - (objectVanishCount * 2)) + 2, 1, 18, 1);
            } else if (i2 == 1) {
                st.page.uiUpperImage[StageBase.upper_mana].drawAtPointOption(x - 1, (y - (objectVanishCount * 2)) + 1, 20);
                GameRenderer.drawNumberBlock(rewardValue, st.page.numberManaImage, x + 1, (y - (objectVanishCount * 2)) + 2, 1, 18, 1);
            }
            Texture2D.setAlpha(1);
            return;
        }
        int i3 = 34;
        int i4 = 22;
        switch (type) {
            case 28:
                i3 = 0;
                i4 = 3;
                break;
            case 29:
                i3 = 22;
                break;
            case 30:
                i3 = -25;
                i4 = 3;
                break;
            case 31:
                i4 = 18;
                break;
            case 32:
                i3 = 22;
                i4 = -22;
                break;
            case 33:
                i4 = -11;
                break;
            default:
                i3 = 0;
                i4 = 0;
                break;
        }
        if (type != 28 && type != 29 && type != 32 && destroyEnableFlag)
            if (blockSize <= 1) {
                st.page.shadowImage[0].drawAtPointOption(x, 27 + y, 33);
            } else
                st.page.shadowImage[1].drawAtPointOption(x, y + 27, 33);
        float bx = i4 + x;
        float by = y + 22 + i3;
        st.map.backObjectImage[type].drawAtPointOption(bx, by, 33);
        if (st.selectedTarget == this) {
            st.page.targetImage.drawAtPointOption(x, y, 9);
            int i7 = blockSize != 0 ? blockSize <= 5 ? -67 : -45 : -22;
            if (unitMaxHP > 0)
                drawHealthBar(x, y + i7, unitMaxHP, unitHP);
        }
        if (st.waveManager.monsterOpenTime > 0) {
            int ind = (st.waveManager.monsterOpenTime / 2) % 2;
            if (type == 28) {
                int py = 43 + (ind * 4);
                st.page.gatefireImage[8 + ind].drawAtPointOption(bx - py, by - 40 - py, 18);
            } else if (type == 29) {
                int py = 35 + (ind * 5);
                st.page.gatefireImage[4 + ind].drawAtPointOption(bx - py, by - 63 - py, 18);
            } else if (type == 32)
                st.page.gatefireImage[6 + ind].drawAtPointOption((ind * 5) + 2 + bx, by - 98 - (ind * 5), 18);
        }
        if (type == 30) {
            int time = GameThread.gameTimeCount % 4;
            if (time == 0) {
                float fy = by - 40;
                st.page.gatefireImage[0].drawAtPointOption(bx - 51, fy, 18);
                st.page.gatefireImage[0].drawAtPointOption(bx + 30, fy, 18);
            } else if (time == 1) {
                float fy = by - 42;
                st.page.gatefireImage[1].drawAtPointOption(bx - 52, fy, 18);
                st.page.gatefireImage[1].drawAtPointOption(bx + 29, fy, 18);
            } else if (time == 2) {
                float fy = by - 40;
                st.page.gatefireImage[2].drawAtPointOption(bx - 53, fy, 18);
                st.page.gatefireImage[2].drawAtPointOption(bx + 28, fy, 18);
            } else {
                float fy = by - 39;
                st.page.gatefireImage[3].drawAtPointOption(bx - 52, fy, 18);
                st.page.gatefireImage[3].drawAtPointOption(bx + 29, fy, 18);
            }
        } else if (type == 31) {
            int time = GameThread.gameTimeCount % 4;
            if (time == 0) {
                st.page.gatefireImage[0].drawAtPointOption(bx - 20, by - 45, 18);
                st.page.gatefireImage[0].drawAtPointOption(bx - 33, by - 128, 18);
            } else if (time == 1) {
                st.page.gatefireImage[1].drawAtPointOption(bx - 21, by - 47, 18);
                st.page.gatefireImage[1].drawAtPointOption(bx - 34, by - 130, 18);
            } else if (time == 2) {
                st.page.gatefireImage[2].drawAtPointOption(bx - 22, by - 45, 18);
                st.page.gatefireImage[2].drawAtPointOption(bx - 35, by - 128, 18);
            } else {
                st.page.gatefireImage[3].drawAtPointOption(bx - 21, by - 44, 18);
                st.page.gatefireImage[3].drawAtPointOption(bx - 34, by - 127, 18);
            }
        }
        if (type != 33)
            return;
        int time = GameThread.gameTimeCount % 4;
        if (time == 0) {
            st.page.gatefireImage[0].drawAtPointOption(bx + 2, by - 45, 18);
            st.page.gatefireImage[0].drawAtPointOption(bx + 15, by - 128, 18);
        } else if (time == 1) {
            st.page.gatefireImage[1].drawAtPointOption(bx + 1, by - 47, 18);
            st.page.gatefireImage[1].drawAtPointOption(bx + 14, by - 130, 18);
        } else if (time == 2) {
            st.page.gatefireImage[2].drawAtPointOption(bx, by - 45, 18);
            st.page.gatefireImage[2].drawAtPointOption(bx + 13, by - 128, 18);
        } else {
            st.page.gatefireImage[3].drawAtPointOption(bx + 1, by - 44, 18);
            st.page.gatefireImage[3].drawAtPointOption(bx + 14, by - 127, 18);
        }
    }
}
