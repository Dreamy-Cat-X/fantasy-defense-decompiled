package com.sncompany.newtower.DataClasses;

import com.sncompany.newtower.DataStage;

/* loaded from: D:\decomp\classes.dex */
public class ObjectUnit extends EnemyUnit {
    static final float OBJECT_VANISHING_ALPHA_DEGREE = 0.066f;
    public static final int OBJECT_VANISHING_COUNT = 30;
    public static final int OBJECT_VANISHING_HALF_COUNT = 15;
    public int blockSize;
    public int blockX;
    public int blockY;
    public int destroyEnableFlag;
    public int objectLastVanishTime;
    public int objectSerial;
    public int objectType;
    public int objectVanishCount;
    public int rewardType;
    public int rewardValue;

    public void updateObject() {
        if (objectType == -2) {
            if (objectLastVanishTime != gameTimeCount) {
                objectVanishCount++;
                if (objectVanishCount == 30) {
                    objectType = -1;
                }
                objectLastVanishTime = gameTimeCount;
            }
        }
    }

    @Override
    public void hit(int eff, TowerUnit ent) {
        if (objectType < 0)
            return;
        int soundHitType = getSoundHitType(ent);
        if (soundHitType != -1)
            playSound(soundHitType);

        unitHP -= ent.unitPower;
        if (unitHP <= 0) {
            getRewardFromObject();
            objectType = -2;
            DataStage.addEffectUnit(13, posX, posY);
            if (ent.effectType == 1)
                ent.hitUnitSplash(0, this);
        }
    }

    public void getRewardFromObject() {
        if (rewardType != 0) {
            if (rewardType != 1)
                return;
            DataStage.Mana += rewardValue;
            return;
        }
        int i3 = DataStage.Money + rewardValue;
        DataStage.Money = i3;
        int[] iArr = awardDataValue;
        if (i3 >= iArr[21]) {
            iArr[21] = i3;
            recheckAwardData();
        }
    }
}
