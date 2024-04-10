package com.sncompany.newtower.Battle;

import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataHero;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataUpgradeUnit;

/* loaded from: D:\decomp\classes.dex */
public class TowerUnit implements Comparable<TowerUnit> {
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
    public boolean heroFlag;//Replace with (this instanceof HeroUnit)
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
    public int towerType; //deprecated, replace with [type] and [level]
    public int level = 1;
    public int type;
    public int unitPower;
    public int unitStatus;
    public int unitStatusCount;
    public int[] unitLockType = new int[3];
    public int[] unitLockNumber = new int[3];

    public int getAttackSpeed() {
        int es = 60 - towerCoolTimeMax;
        if (es < 0)
            es = 0;
        return (es * 5) + 70;
    }

    public static int getUpgradeUnitRate(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < 18; i4++) {
            if ((DataUpgradeUnit.upgradeUnitData[i4][5] == i || DataUpgradeUnit.upgradeUnitData[i4][5] == 0) && DataUpgradeUnit.upgradeUnitData[i4][4] == i2) {
                i3 += upgradeUnitValue[i4] * DataUpgradeUnit.upgradeUnitData[i4][0];
            }
        }
        return i3;
    } //Temporary until I figure out how unit upgrades work

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0180, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateTowerUnit() {
        int i;
        int soundAttackType;
        int i2;
        if (towerType != -1) {
            int i4 = towerType;
            unitStatusCount++;
            if (towerCoolTime > 0)
                towerCoolTime--;

            if (specialCooltime > 0) {
                specialCooltime--;
                if (specialCooltime == 0) {
                    specialShowCount = 4;
                }
            }
            int i5 = unitStatus;
            if (i5 != 0) {
                if (i5 == 1) {
                    int i6 = unitLockType[0];
                    if (i6 == 0) {
                        boolean z = heroFlag;
                        if (z && unitStatusCount <= 6) {
                            posX = (int) (r1[i3].originalPosX + ((((monsterUnit[unitLockNumber[0]].posX - posX) * unitStatusCount) / 6) * SPECIAL_ATTACK_ARROW_UNIT_SIZE_START));
                            posY = (int) (r1[i3].originalPosY + ((((monsterUnit[unitLockNumber[0]].posY - posY) * unitStatusCount) / 6) * SPECIAL_ATTACK_ARROW_UNIT_SIZE_START));
                        }
                        headRotateDegree = getRotateDegree(monsterUnit[r1[i3].unitLockNumber[0]].posX - posX, monsterUnit[unitLockNumber[0]].posY - posY);
                        if (posX < monsterUnit[unitLockNumber[0]].posX) {
                            lastViewDirection = 2;
                        } else if (posX > monsterUnit[unitLockNumber[0]].posX) {
                            lastViewDirection = 6;
                        }
                    } else if (i6 == 1) {
                        boolean z2 = !heroFlag;
                        if (z2 && unitStatusCount <= 6) {
                            posX = (int) (r1[i3].originalPosX + ((((objectUnit[unitLockNumber[0]].posX - posX) * unitStatusCount) / 6) * SPECIAL_ATTACK_ARROW_UNIT_SIZE_START));
                            posY = (int) (r1[i3].originalPosY + ((((objectUnit[unitLockNumber[0]].posY - posY) * unitStatusCount) / 6) * SPECIAL_ATTACK_ARROW_UNIT_SIZE_START));
                        }
                        headRotateDegree = getRotateDegree(objectUnit[r1[i3].unitLockNumber[0]].posX - posX, objectUnit[unitLockNumber[0]].posY - posY);
                        if (posX < objectUnit[unitLockNumber[0]].posX) {
                            lastViewDirection = 2;
                        } else if (posX > objectUnit[unitLockNumber[0]].posX) {
                            lastViewDirection = 6;
                        }
                    }
                    if (unitStatusCount == 6) {
                        boolean z3 = false;
                        while (i2 < targetMaxNum) {
                            int i7 = unitLockType[i2];
                            if (i7 == 0) {
                                i2 = monsterUnit[unitLockNumber[i2]].unitStatus != 0 ? i2 + 1 : 0;
                                z3 = true;
                            } else if (i7 == 1) {
                                if (objectUnit[unitLockNumber[i2]].objectType != -1) {
                                    if (objectUnit[unitLockNumber[i2]].objectType == -2) {
                                    }
                                    z3 = true;
                                }
                            }
                        }
                        if (z3) {
                            attackCount++;
                            TowerUnit[] towerUnitArr = towerUnit;
                            towerUnitArr[i3].towerCoolTime = towerUnitArr[i3].towerCoolTimeMax;
                            int i8 = attackType;
                            if (i8 == 0) {
                                int soundHitType = getSoundHitType(i3);
                                if (soundHitType != -1) {
                                    playSound(soundHitType);
                                }
                                for (int i9 = 0; i9 < 3 && i9 < targetMaxNum; i9++) {
                                    int i10 = unitLockType[i9];
                                    if (i10 == 0) {
                                        addEffectUnit(attackEffect, monsterUnit[unitLockNumber[i9]].posX, monsterUnit[unitLockNumber[i9]].posY, true);
                                        monsterUnit[unitLockNumber[i9]].hit(0, towerUnit[i3]);
                                    } else if (i10 == 1) {
                                        addEffectUnit(attackEffect, objectUnit[unitLockNumber[i9]].posX, objectUnit[unitLockNumber[i9]].posY, true);
                                        objectUnit[unitLockNumber[i9]].hit(0, towerUnit[i3]);
                                    }
                                }
                            } else if (i8 == 1) {
                                for (int i11 = 0; i11 < 3 && i11 < targetMaxNum; i11++) {
                                    if (unitLockType[i11] != -1 && unitLockNumber[i11] != -1) {
                                        addArrowUnit(attackEffect, i3, unitLockType[i11], unitLockNumber[i11], true);
                                    }
                                }
                            }
                        } else {
                            unitStatus = 0;
                            unitStatusCount = 0;
                            towerCoolTime = 0;
                            TowerUnit[] towerUnitArr2 = towerUnit;
                            towerUnitArr2[i3].posX = towerUnitArr2[i3].originalPosX;
                            TowerUnit[] towerUnitArr3 = towerUnit;
                            towerUnitArr3[i3].posY = towerUnitArr3[i3].originalPosY;
                        }
                    }
                    if (unitStatusCount == 15) {
                        unitStatus = 0;
                        unitStatusCount = 0;
                        TowerUnit[] towerUnitArr4 = towerUnit;
                        towerUnitArr4[i3].towerCoolTime = towerUnitArr4[i3].towerCoolTimeMax;
                        TowerUnit[] towerUnitArr5 = towerUnit;
                        towerUnitArr5[i3].posX = towerUnitArr5[i3].originalPosX;
                        TowerUnit[] towerUnitArr6 = towerUnit;
                        towerUnitArr6[i3].posY = towerUnitArr6[i3].originalPosY;
                    }
                }
            } else if (towerCoolTime == 0) {
                int closeEnemyUnitInRange = getCloseEnemyUnitInRange(towerUnit[i3]);
                if (closeEnemyUnitInRange > 0) {
                    if (commonTargetType == 0 && monsterMeetCheck[commonTargetNumber]) {
                        unitLockType[0] = 0;
                        unitLockNumber[0] = commonTargetNumber;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    for (int i12 = 0; i12 < monsterUnitCount && i < closeEnemyUnitInRange && i < targetMaxNum; i12++) {
                        if (monsterMeetCheck[i12]) {
                            unitLockType[i] = 0;
                            unitLockNumber[i] = i12;
                            i++;
                        }
                    }
                    unitStatus = 1;
                    unitStatusCount = 0;
                } else {
                    i = 0;
                }
                if (i < targetMaxNum && commonTargetType == 1 && getCloseObjectUnitInRange(towerUnit[i3]) > 0 && monsterMeetCheck[commonTargetNumber]) {
                    unitLockType[i] = 1;
                    unitLockNumber[i] = commonTargetNumber;
                    i++;
                    unitStatus = 1;
                    unitStatusCount = 0;
                }
                if (unitStatus == 1 && (soundAttackType = getSoundAttackType(i3)) != -1) {
                    playSound(soundAttackType);
                }
                while (i < 3) {
                    unitLockType[i] = -1;
                    unitLockNumber[i] = -1;
                    i++;
                }
            }
        }
    }

    public static int getCloseObjectUnitInRange(TowerUnit towerUnit2) {
        int i;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < objectUnitCount; i7++) {
            if (objectUnit[i7].objectType != -1 && objectUnit[i7].objectType != -2) {
                if (objectUnit[i7].destroyEnableFlag == 0) {
                    int i8 = objectUnit[i7].blockSize;
                    if (i8 == 0) {
                        i3 = objectUnit[i7].posX;
                        i5 = objectUnit[i7].posY;
                        i4 = i3;
                        i6 = i5;
                    } else if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 == 3) {
                                i3 = objectUnit[i7].posX;
                                i = objectUnit[i7].posY;
                            } else if (i8 == 4) {
                                i3 = objectUnit[i7].posX - 2250;
                                i = objectUnit[i7].posY;
                            } else if (i8 == 5) {
                                i3 = objectUnit[i7].posX - 2250;
                                i5 = objectUnit[i7].posY - 2250;
                                i4 = i3 + 4500;
                            }
                            i5 = i - 2250;
                            i4 = i3 + 2250;
                            i6 = i5 + 4500;
                        } else {
                            i3 = objectUnit[i7].posX - 1100;
                            i5 = objectUnit[i7].posY - 2250;
                            i4 = i3 + 2250;
                        }
                        i6 = i5 + 2250;
                    } else {
                        i3 = objectUnit[i7].posX;
                        i5 = objectUnit[i7].posY - 2250;
                        i6 = i5 + 2250;
                        i4 = i3;
                    }
                    if (Math.abs(towerUnit2.posX - ((towerUnit2.posX > i3 && (towerUnit2.posX >= i4 || Math.abs(towerUnit2.posX - i3) > Math.abs(towerUnit2.posX - i4))) ? i4 : i3)) + Math.abs(towerUnit2.posY - ((towerUnit2.posY > i5 && (towerUnit2.posY >= i6 || Math.abs(towerUnit2.posY - i5) > Math.abs(towerUnit2.posY - i6))) ? i6 : i5)) > towerUnit2.attackDistance * 2) {
                        monsterMeetCheck[i7] = false;
                    } else if (((towerUnit2.posX - r7) * (towerUnit2.posX - r7)) + ((towerUnit2.posY - r10) * (towerUnit2.posY - r10)) <= towerUnit2.attackDistanceSquare) {
                        monsterMeetCheck[i7] = true;
                        i2++;
                    } else {
                        monsterMeetCheck[i7] = false;
                    }
                } else {
                    monsterMeetCheck[i7] = false;
                }
            } else {
                monsterMeetCheck[i7] = false;
            }
        }
        return i2;
    }

    int addArrowUnit(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        if (z) {
            i5 = 0;
            while (i5 < arrowUnitCount) {
                if (arrowUnit[i5].arrowType == -1) {
                    break;
                }
                i5++;
            }
        }
        i5 = -1;
        if (i5 == -1 && arrowUnitCount == 199) {
            return -1;
        }
        if (i5 == -1) {
            i5 = arrowUnitCount;
            arrowUnitCount = i5 + 1;
        }
        arrowUnit[i5].arrowType = i;
        arrowUnit[i5].shootNumber = i2;
        arrowUnit[i5].startX = towerUnit[i2].posX;
        arrowUnit[i5].startY = towerUnit[i2].posY;
        if (i3 == 0) {
            arrowUnit[i5].targetType = 0;
        } else if (i3 == 1) {
            arrowUnit[i5].targetType = 3;
        }
        arrowUnit[i5].targetNumber = i4;
        arrowUnit[i5].moveCount = 1;
        arrowUnit[i5].moveMaxCount = 5;
        for (int i6 = 0; i6 < 150; i6++) {
            arrowUnit[i5].hitCheckFlag[i6] = false;
        }
        if (i == 0) {
            arrowUnit[i5].moveSpeed = 750;
            for (int i7 = 0; i7 < 5; i7++) {
                arrowUnit[i5].moveHistory[i7][0] = arrowUnit[i5].startX;
                arrowUnit[i5].moveHistory[i7][1] = arrowUnit[i5].startY;
            }
        }
        return i5;
    }

    public static int getCloseEnemyUnitInRange(TowerUnit towerUnit2) {
        int i = 0;
        for (int i2 = 0; i2 < monsterUnitCount; i2++) {
            if (monsterUnit[i2].monsterType != -1) {
                if (monsterUnit[i2].unitStatus == 0) {
                    if (Math.abs(towerUnit2.posX - monsterUnit[i2].posX) + Math.abs(towerUnit2.posY - monsterUnit[i2].posY) > towerUnit2.attackDistance * 2) {
                        monsterMeetCheck[i2] = false;
                    } else if (((towerUnit2.posX - monsterUnit[i2].posX) * (towerUnit2.posX - monsterUnit[i2].posX)) + ((towerUnit2.posY - monsterUnit[i2].posY) * (towerUnit2.posY - monsterUnit[i2].posY)) <= towerUnit2.attackDistanceSquare) {
                        monsterMeetCheck[i2] = true;
                        i++;
                    } else {
                        monsterMeetCheck[i2] = false;
                    }
                } else {
                    monsterMeetCheck[i2] = false;
                }
            } else {
                monsterMeetCheck[i2] = false;
            }
        }
        return i;
    }

    public int getHitPower() {
        int i3 = DataCharacter.charData[towerType][11];
        if (i3 > 2)
            return unitPower;
        return unitPower + (getUpgradeUnitRate(i3 + 1, 7) * unitPower) / 100;
    }

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

            /*if (i5 != 0) {
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
            i4 += 30; ??? */

        int i9 = Math.max(1, (unitPower * (100 - i4)) / 100);
        int i10 = DataCharacter.charData[i5][11];
        if (i10 > 2)
            return i9;
        upgradeUnitRate = (getUpgradeUnitRate(i10 + 1, 7) * i9) / 100;

        return i9 + upgradeUnitRate;
    }

    public void hitUnitSplash(int eff, EnemyUnit eu) {
        for (MonsterUnit mon : DataStage.monsterUnit)
            if (eu != mon && !mon.dead()) {
                int abs = Math.abs(eu.posX - mon.posX) / 50;
                int abs2 = Math.abs(eu.posY - mon.posY) / 50;
                if ((abs * abs) + (abs2 * abs2) <= ArrowUnit.SPLASH_RANGE_MAX_DISTANCE) {
                    if (eff == 0)
                        DataStage.instance.addEffectUnit(EffectUnit.EFFECT_TYPE_SWORD_SPLASH, mon.posX, mon.posY);
                    mon.damaged(getHitDamage(eu instanceof MonsterUnit ? (MonsterUnit)eu : mon), this);
                }
            }
    }

    public int getSpecialHitDamage(MonsterUnit mon) {
        if (mon.dead())
            return 0;

        int i3 = (((unitPower * specialAttPower) / 100) * (100 - mon.unitDefense)) / 100;
        if (i3 <= 0)
            return 1;
        return i3;
    }

    /**
     * Hits monster with special attack
     * @param mon Monster to hit
     * @return true if monster dies from this hit
     */
    public boolean hitSpecialAttackUnit(MonsterUnit mon) {
        if (!mon.dead()) {
            int specialHitDamage = getSpecialHitDamage(mon);
            if (specialType == 1) {
                mon.dotHolyDamage = specialHitDamage / 20;
                mon.dotHolyCount = DataHero.heroData[towerType][10];
            }
            mon.damaged(specialHitDamage, this);
            return mon.dead();
        }
        return false;
    }

    @Override
    public int compareTo(TowerUnit e) {
        return Integer.compare(posY, e.posY);
    }
}
