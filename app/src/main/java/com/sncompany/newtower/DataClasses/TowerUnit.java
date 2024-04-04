package com.sncompany.newtower.DataClasses;

import com.sncompany.newtower.DataStage;
import com.sncompany.newtower.MonsterUnit;

/* loaded from: D:\decomp\classes.dex */
public class TowerUnit {
    public static final int DUST_FAN_ATTACK_ROTATE_RATE = 15;
    public static final int DUST_FAN_BODY_EFFECT_ROTATE_RATE = 20;
    public static final int DUST_FAN_STAND_ROTATE_RATE = 2;
    public static final int LAVA_CATAPULT_BODY_UP_POSITION = -29;
    public static final int LOCK_MAX_COUNT = 3;
    public static final int LOCK_TYPE_MONSTER = 0;
    public static final int LOCK_TYPE_NONE = -1;
    public static final int LOCK_TYPE_OBJECT = 1;
    public static final int TOWER_ATTACK_FIRE_FRAME = 6;
    public static final int TOWER_ATTACK_FRAME_PER_SHOT = 3;
    static final float TOWER_ATTACK_SWORD_MOVE_DEGREE = 0.5f;
    public static final int TOWER_ATTACK_TOTAL_FRAME = 15;
    public static final int TOWER_SPECIAL_SHOW_COUNT = 4;
    public static final int TOWER_STATUS_ATTACK = 1;
    public static final int TOWER_STATUS_CREATING = 2;
    public static final int TOWER_STATUS_STAND = 0;
    public static final int TOWER_TYPE_HERO = 1;
    public static final int TOWER_TYPE_NORMAL = 0;
    public int attackCount;
    public int attackDistance;
    public int attackDistanceSquare;
    public int attackEffect;
    public int attackRange;
    public int attackType;
    public int blockX;
    public int blockY;
    public int effectType;
    public float headRotateDegree;
    public boolean heroFlag;
    public int heroOrder;
    public int lastViewDirection;
    public int originalPosX;
    public int originalPosY;
    public int posX;
    public int posY;
    public int specialAttCount;
    public int specialAttPower;
    public int specialCooltime;
    public int specialMana;
    public int specialMaxCooltime;
    public int specialShowCount;
    public int specialType;
    public int targetMaxNum;
    public int towerCoolTime;
    public int towerCoolTimeMax;
    public int towerType;
    public int unitPower;
    public int unitStatus;
    public int unitStatusCount;
    public int[] unitLockType = new int[3];
    public int[] unitLockNumber = new int[3];

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:

    if (r5 >= 30) goto L22;
    */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:

        r9 = r9 + 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:

        if (r7 >= 20) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:

        if (r7 >= 10) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getHitDamage(MonsterUnit mon) {
        int upgradeUnitRate;
        if (towerType == -1)
            return 0;

        int i4 = mon.unitDefense;
        int i5 = towerType;

        if (!heroFlag) {
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        switch (i5) {
                            case 12:
                                break;
                            case 13:
                                break;
                            case 14:
                                break;
                            default:
                                switch (i5) {
                                }
                        }
                    }
                    if (DataStage.Wave < 40) {
                    }
                    i4 += 20;
                }
                if (DataStage.Wave < 40) {
                    if (DataStage.Wave < 30) {
                    }
                    i4 += 20;
                }
                i4 += 30;
            }
            if (DataStage.Wave < 30) {
                if (DataStage.Wave < 20) {
                }
                i4 += 20;
            }
            i4 += 30;
        }
        int i9 = (unitPower * (100 - i4)) / 100;
        if (i9 <= 0) {
            i9 = 1;
        }
        if (!heroFlag) {
            int i10 = DataCharacter.charData[i5][11];
            if (i10 == 0) {
                upgradeUnitRate = (getUpgradeUnitRate(1, 7) * i9) / 100;
            } else if (i10 == 1) {
                upgradeUnitRate = (getUpgradeUnitRate(2, 7) * i9) / 100;
            } else {
                if (i10 != 2) {
                    return i9;
                }
                upgradeUnitRate = (getUpgradeUnitRate(3, 7) * i9) / 100;
            }
            return i9 + upgradeUnitRate;
        }
        return i9 + (((getUpgradeHeroRate(towerUnit[i].heroOrder, 7) + getUpgradeItemRate(towerUnit[i].heroOrder, 2)) * i9) / 100);
    }

    public static void hitUnitSplash(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i2 < 0 || i3 < 0) {
            return;
        }
        if (i4 == 3) {
            i5 = objectUnit[i3].posX;
            i6 = objectUnit[i3].posY;
        } else {
            i5 = monsterUnit[i3].posX;
            i6 = monsterUnit[i3].posY;
        }
        for (int i7 = 0; i7 < monsterUnitCount; i7++) {
            if (monsterUnit[i7].monsterType != -1 && ((i4 != 0 || i3 != i7) && monsterUnit[i7].unitStatus == 0)) {
                int abs = Math.abs(i5 - monsterUnit[i7].posX) / 50;
                int abs2 = Math.abs(i6 - monsterUnit[i7].posY) / 50;
                if ((abs * abs) + (abs2 * abs2) <= 4556) {
                    if (i == 0) {
                        addEffectUnit(37, monsterUnit[i7].posX, monsterUnit[i7].posY, true);
                    }
                    monsterUnit[i7].unitHP -= towerUnit[i2].getHitDamage(monsterUnit[i3]);
                    if (monsterUnit[i7].unitHP <= 0) {
                        getRewardFromMonster(myWave, i7, i2);
                        monsterUnit[i7].unitStatus = 1;
                        monsterUnit[i7].unitStatusCount = 0;
                        addEffectUnit(13, monsterUnit[i7].posX, monsterUnit[i7].posY, true);
                        if (monsterUnit[i7].unitStatus == 1 && commonTargetType == 0 && commonTargetNumber == i3) {
                            commonTargetType = -1;
                        }
                    }
                }
            }
        }
    }

    public int getSpecialHitDamage(MonsterUnit mon) {
        if (mon.unitStatus == -1)
            return 0;

        int i3 = (((unitPower * specialAttPower) / 100) * (100 - mon.unitDefense)) / 100;
        if (i3 <= 0)
            return 1;
        return i3;
    }
}
