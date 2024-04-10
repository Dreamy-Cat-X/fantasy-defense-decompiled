package com.sncompany.newtower.Battle;

import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataObject;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Texture2D;

/* loaded from: D:\decomp\classes.dex */
public class ObjectUnit extends EnemyUnit {
    static final float OBJECT_VANISHING_ALPHA_DEGREE = 0.066f;
    public static final int OBJECT_VANISHING_COUNT = 30;
    public static final int OBJECT_VANISHING_HALF_COUNT = 15;
    public final int blockSize;
    public final int blockX;
    public final int blockY;
    public int destroyEnableFlag;
    public int objectLastVanishTime;
    public int objectSerial;
    public int objectType;
    public int objectVanishCount;
    public int rewardType;
    public int rewardValue;
    public DataStage st;

    public ObjectUnit(int oType, int bX, int bY) {
        for (int ODataI = 0; ODataI < 34; ODataI++) {
            if (oType == DataObject.objectData[ODataI][0]) {
                type = ODataI;
                break;
            }
        }

        objectVanishCount = 0;
        destroyEnableFlag = DataObject.objectData[objectType][1];
        unitHP = unitMaxHP = DataObject.objectData[objectType][2];
        rewardType = DataObject.objectData[objectType][3];
        rewardValue = DataObject.objectData[objectType][4];
        blockSize = DataObject.objectData[objectType][5];
        blockX = bX;
        blockY = bY;
        posX = 0;
        posY = 0;
        switch (blockSize) {
            case 0, 3, 4, 5:
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
        }
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

        int soundHitType = GameThread.getSoundHitType(ent);
        if (soundHitType != -1)
            GameThread.playSound(soundHitType);

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
            st.Mana += rewardValue;
            return;
        }
        st.Money += rewardValue;
        DataAward.check_money(st.Money);

        type = -2;
        st.addEffectUnit(EffectUnit.EFFECT_TYPE_DIE, posX, posY);
        if (st.selectedTarget == this)
            st.selectedTarget = null;
    }
}
