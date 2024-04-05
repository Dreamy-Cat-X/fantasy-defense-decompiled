package com.sncompany.newtower.DataClasses;

import com.sncompany.newtower.DataStage;
import com.sncompany.newtower.EffectUnit;

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

    @Override
    public boolean update() {
        if (type == -2) {
            if (objectLastVanishTime != gameTimeCount) {
                objectVanishCount++;
                if (objectVanishCount == 30) {
                    type = -1;
                }
                objectLastVanishTime = gameTimeCount;
            }
        }
        return false;
    }

    @Override
    public void hit(int eff, TowerUnit ent) {
        if (dead())
            return;

        int soundHitType = getSoundHitType(ent);
        if (soundHitType != -1)
            playSound(soundHitType);

        unitHP -= ent.unitPower;
        if (unitHP <= 0)
            kill(ent);
        if (ent.effectType == 1)
            ent.hitUnitSplash(0, this);
    }

    @Override
    public void kill(TowerUnit uni) {
        if (rewardType != 0) {
            if (rewardType != 1)
                return;
            DataStage.Mana += rewardValue;
            return;
        }
        DataStage.Money += rewardValue;
        DataAward.check_money(DataStage.Money);

        type = -2;
        DataStage.instance.addEffectUnit(EffectUnit.EFFECT_TYPE_DIE, posX, posY);
        if (DataStage.selectedTarget == this)
            DataStage.selectedTarget = null;
    }
}
