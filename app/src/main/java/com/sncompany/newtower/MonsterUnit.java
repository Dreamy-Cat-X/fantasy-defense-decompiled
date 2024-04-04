package com.sncompany.newtower;

import com.sncompany.newtower.DataClasses.ArrowUnit;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.EnemyUnit;
import com.sncompany.newtower.DataClasses.TowerUnit;

/* loaded from: D:\decomp\classes.dex */
public class MonsterUnit extends EnemyUnit {
    public static final int MONSTER_DYING_STATUS_COUNT = 10;
    public static final int MONSTER_SPEED_BASE = 3;
    public static final int MONSTER_STATUS_DYING = 1;
    public static final int MONSTER_STATUS_EMPTY = -1;
    public static final int MONSTER_STATUS_NORMAL = 0;
    public static final float SLOW_DATA_MAX_VALUE = 100.0f;
    public static final float SLOW_MAX_MINUS_RATE = 80.0f;
    public static final float SLOW_RECOVER_RATE = 1.0f;
    public int bodySize;
    public boolean bossFlag;
    public int direction;
    public int dotFireCount;
    public int dotFireDamage;
    public boolean dotFireFlag;
    public int dotHolyCount;
    public int dotHolyDamage;
    public boolean dotHolyFlag;
    public int fromBlockX;
    public int fromBlockY;
    public int lastViewDirection = 2;
    public int monsterSerial;
    public int monsterType; //Used to differ monster type, -1 means monster is dead. Deprecated, use super.type instead
    public boolean slowIceFlag;
    public boolean slowMudFlag;
    public float slowRate;
    public int stunCount;
    public boolean stunFlag;
    public int targetBlockX;
    public int targetBlockY;
    public int unitDefense;
    public int unitMinSpeed;
    public int unitSpeed = 150;
    public int unitStatus = 0;
    public int unitStatusCount = 0;

    public MonsterUnit(int type, boolean bossFlag) {
        this.type = type;
        this.bossFlag = bossFlag;

        int[] data = DataMonster.monsterData[type];
        unitHP = data[1];
        bodySize = data[2];
        unitDefense = data[3];

        int i2 = 0;
        int swave = DataStage.Wave;
        boolean infWave = DataStage.mapType == 1 && swave >= DataWave.WAVE_MAX_COUNT;
        if (infWave) {
            i2 = (swave - DataWave.WAVE_MAX_COUNT) + 1;
            swave = DataWave.WAVE_MAX_COUNT - 1;
        }

        if (bossFlag) {
            unitHP = (((unitHP * (DataWave.monsterWaveData[swave][8] + (DataWave.monsterWaveData[60][8] * i2))) / 100) * DataStage.stageData[DataStage.mapType][3]) / 100;
            unitDefense += DataWave.monsterWaveData[swave][9];
            if (infWave)
                unitDefense += DataWave.monsterWaveData[60][9] * i2;
            unitSpeed = (((unitSpeed * data[4]) * (DataWave.monsterWaveData[swave][10] + (DataWave.monsterWaveData[60][10] * i2))) / 100) / 100;
            unitMinSpeed = (unitSpeed * (DataWave.monsterWaveData[swave][11] + (i2 * DataWave.monsterWaveData[60][11]))) / 1000;
        } else {
            unitHP = (((unitHP * (DataWave.monsterWaveData[swave][0] + (DataWave.monsterWaveData[60][0] * i2))) / 100) * DataStage.stageData[DataStage.mapType][2]) / 100;
            unitDefense += DataWave.monsterWaveData[swave][1];
            if (infWave)
                unitDefense += DataWave.monsterWaveData[60][1] * i2;
            unitSpeed = (((unitSpeed * data[4]) * (DataWave.monsterWaveData[swave][2] + (DataWave.monsterWaveData[60][2] * i2))) / 100) / 100;
            unitMinSpeed = (unitSpeed * (DataWave.monsterWaveData[swave][3] + (i2 * DataWave.monsterWaveData[60][3]))) / 1000;
        }
        unitMaxHP = unitHP;
        if (unitMinSpeed > unitSpeed)
            unitMinSpeed = unitSpeed;
    }
    
    public boolean update() {
        if (monsterType != -1) {
            unitStatusCount++;
            if (stunCount > 0) {
                stunCount--;
            }
            if (dotHolyCount > 0) {
                dotHolyCount--;
                if (dotHolyCount > 0)
                    hit(1, null);
            }
            if (dotFireCount > 0) {
                dotFireCount--;
                if (dotFireCount > 0)
                    hit(2, null);
            }
            if (slowIceFlag || slowMudFlag) {
                slowRate -= 1.0f;
                if (slowRate <= 0.0f) {
                    slowIceFlag = false;
                    slowMudFlag = false;
                }
            }
            if (unitStatus == 0) {
                int espd = unitSpeed;
                if (stunCount > 0)
                    espd = 0;
                else if ((slowIceFlag || slowMudFlag) && (espd = (int) ((espd * (100.0f - slowRate)) / 100.0f)) < unitMinSpeed)
                    espd = unitMinSpeed;

                while (espd > 0) {
                    int i4 = ((targetBlockX * 45) + 22) * 50;
                    int i5 = ((targetBlockY * 45) + 22) * 50;
                    if (i4 != posX) {
                        if (Math.abs(i4 - posX) >= espd) {
                            if (i4 > posX) {
                                posX += espd;
                                lastViewDirection = 2;
                            } else {
                                posX -= espd;
                                lastViewDirection = 6;
                            }
                            espd = 0;
                        } else if (i4 > posX) {
                            espd -= i4 - posX;
                            posX = i4;
                            lastViewDirection = 2;
                        } else {
                            espd -= -(i4 - posX);
                            posX = i4;
                            lastViewDirection = 6;
                        }
                    } else if (i5 != posY) {
                        if (Math.abs(i5 - posY) >= espd) {
                            if (i5 > posY) {
                                posY += espd;
                                espd = 0;
                            } else {
                                posY -= espd;
                                espd = 0;
                            }
                        } else if (i5 > posY) {
                            espd -= i5 - posY;
                            posY = i5;
                        } else {
                            espd -= -(i5 - posY);
                            posY = i5;
                        }
                    } else {
                        int randomMapDirection = getRandomMapDirection(i, targetBlockX, targetBlockY, -1);
                        direction = randomMapDirection;
                        if (randomMapDirection == -1)
                            break;

                        targetBlockX = fromBlockX + DIR_MOVE_POS[randomMapDirection][0];
                        targetBlockY = fromBlockY + DIR_MOVE_POS[randomMapDirection][1];
                    }
                }
                for (int i6 = 0; i6 < mapEndPositionCount; i6++) {
                    int[][] iArr = mapEndPosition;
                    int i7 = ((iArr[i6][0] * 45) + 22) * 50;
                    int i8 = ((iArr[i6][1] * 45) + 22) * 50;
                    if (posX == i7 && posY == i8) {
                        DataStage.addEffectUnit(36, posX, posY);
                        if (vibrationFlag == 1) {
                            NewTower.vibe.vibrate(250L);
                        }
                        playSound(12);
                        monsterType = -1;
                        GameRenderer.monsterGoalBlinkCount = 6;
                        if (DataStage.Life > 0) {
                            int i10 = wavePattern;
                            if (i10 == 2)
                                DataStage.Life = Math.max(0, DataStage.Life - 3);
                            else if (i10 == 3)
                                DataStage.Life = bossFlag ? 0 : DataStage.Life - 1;
                            else
                                DataStage.Life--;
                        }
                        if (DataStage.Life <= 0) {
                            GameRenderer.monsterGoalBlinkCount = 0;
                            return true;
                        }
                    }
                }
            } else if (unitStatus == 1 && unitStatusCount >= 10)
                removeMonsterUnit();
        }
        return false;
    }

    @Override
    public void hit(int dmgType, TowerUnit unit) {
        int i4 = monsterType;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = Math.min(DataStage.Wave, DataWave.WAVE_MAX_COUNT);
        int i10 = unit != null ? unit.towerType : -1;
        if ((!(dmgType == 1 && i10 == -1) && (unit == null || i10 == -1)) || i4 == -1)
            return;

        if (unitStatus == 0) {
            if (dmgType == 1) {
                unitHP -= dotHolyDamage;
                if (unitHP <= 0)
                    getRewardFromMonster(null);
            } else if (dmgType == 2) {
                unitHP -= dotFireDamage;
                if (unitHP <= 0)
                    getRewardFromMonster(null);
            } else {
                int soundHitType = getSoundHitType(unit);
                if (soundHitType != -1)
                    playSound(soundHitType);

                unitHP -= unit.getHitDamage(this);
                if (unitHP <= 0)
                    getRewardFromMonster(unit);
                int i13 = unit.effectType;
                if (i13 == 0) {
                    if (!unit.heroFlag) {
                        int upgradeUnitRate = (DataCharacter.charData[i10][7] * (getUpgradeUnitRate(1, 10) + 100)) / 100;
                        if (bossFlag) {
                            i6 = (DataMonster.monsterData[i4][6] * (DataWave.monsterWaveData[i9][12] + 100)) / 100;
                        } else {
                            i6 = (DataMonster.monsterData[i4][6] * (DataWave.monsterWaveData[i9][4] + 100)) / 100;
                        }
                        i5 = upgradeUnitRate - i6;
                    } else
                        i5 = 0;

                    if (stunCount == 0 && getRandom(100) < i5 && !unit.heroFlag) {
                        stunCount = (DataCharacter.charData[i10][8] * (getUpgradeUnitRate(1, 11) + 100)) / 100;
                        if (bossFlag)
                            stunCount /= 2;
                    }
                } else if (i13 == 1)
                    unit.hitUnitSplash(unit.attackType * 3, this);
                else if (i13 == 2) {
                    dotHolyFlag = true;
                    int hitDamage = unit.getHitDamage(this);
                    dotHolyDamage = ((hitDamage + ((getUpgradeUnitRate(2, 7) * hitDamage) / 100)) * ((getUpgradeUnitRate(2, 12) + 100) / 100)) / 20;
                    dotHolyCount = (DataCharacter.charData[i10][8] * (getUpgradeUnitRate(2, 13) + 100)) / 100;
                } else if (i13 == 3) {
                    if (!unit.heroFlag) {
                        int upgradeUnitRate2 = (DataCharacter.charData[i10][7] * (getUpgradeUnitRate(3, 14) + 100)) / 100;
                        if (bossFlag)
                            i8 = (DataMonster.monsterData[i4][7] * (DataWave.monsterWaveData[i9][13] + 100)) / 100;
                        else
                            i8 = (DataMonster.monsterData[i4][7] * (DataWave.monsterWaveData[i9][5] + 100)) / 100;
                        i7 = upgradeUnitRate2 - i8;
                    } else {
                        i7 = 0;
                    }
                    if (getRandom(100) < i7) {
                        slowIceFlag = true;
                        slowRate += (DataCharacter.charData[i10][8] * (getUpgradeUnitRate(3, 15) + 100)) / 100;
                        if (slowRate > 80.0f)
                            slowRate = 80.0f;
                    }
                }
                if (unit.heroFlag && unitStatus == 0) {
                    int upgradeItemRate = getUpgradeItemRate(unit.heroOrder, 10);
                    if (upgradeItemRate > 0 && getRandom(100) < upgradeItemRate) {
                        dotHolyFlag = true;
                        dotHolyDamage = (unit.getHitDamage(this) * 3) / 100;
                        dotHolyCount = DataCharacter.charData[17][8];
                    }
                    int upgradeItemRate2 = getUpgradeItemRate(unit.heroOrder, 11);
                    if (upgradeItemRate2 > 0 && !bossFlag && getRandom(100) < upgradeItemRate2) {
                        unitHP = 0;
                        getRewardFromMonster(unit);
                    }
                    int upgradeItemRate3 = getUpgradeItemRate(unit.heroOrder, 12);
                    if (upgradeItemRate3 > 0 && !stunFlag && getRandom(100) < upgradeItemRate3) {
                        stunFlag = true;
                        stunCount = DataCharacter.charData[5][8];
                        if (bossFlag)
                            stunCount /= 2;
                    }
                    int upgradeItemRate4 = getUpgradeItemRate(unit.heroOrder, 13);
                    if (upgradeItemRate4 > 0 && getRandom(100) < upgradeItemRate4) {
                        slowIceFlag = true;
                        slowRate += DataCharacter.charData[29][8];
                        if (slowRate > 80.0f)
                            slowRate = 80.0f;
                    }
                }
            }
        }
    }

    public void hitUnitFierce(ArrowUnit arrow, TowerUnit shooter) {
        if (shooter == null || monsterType == -1)
            return;

        int dx = posX - shooter.posX;
        int dy = posY - shooter.posY;
        int abs = (Math.abs(dx) / 22) / 50;
        int abs2 = (Math.abs(dy) / 22) / 50;
        if (abs <= abs2)
            abs = abs2;

        int abs3 = Math.abs(dx) / abs;
        int abs4 = Math.abs(dy) / abs;
        if (shooter.posX > posX)
            abs3 = -abs3;
        if (shooter.posY > posY)
            abs4 = -abs4;

        for (int e = 0; e <= abs; e++) {
            int efx = (abs3 * e) + shooter.posX;
            int efy = (abs4 * e) + shooter.posY;
            for (MonsterUnit mon : DataStage.monsterUnit) {
                if (mon.monsterType != -1 && mon.unitStatus == 0 && !arrow.hitMons.contains(mon)) {
                    int abs5 = Math.abs(efx - mon.posX) / 50;
                    int abs6 = Math.abs(efy - mon.posY) / 50;
                    if ((abs5 * abs5) + (abs6 * abs6) <= 225) {
                        arrow.hitMons.add(mon);
                        DataStage.addEffectUnit(shooter.attackEffect, mon.posX, mon.posY);
                        mon.unitHP -= shooter.getHitDamage(this);
                        if (mon.unitHP <= 0)
                            getRewardFromMonster(shooter);
                    }
                }
            }
        }
    }

    //Rename to killMonster, mayhaps
    public void getRewardFromMonster(TowerUnit unit) {
        int i4;
        boolean z;
        int i5;
        int i6;
        int i8;
        if (DataStage.mapType == 1 && DataStage.Wave >= DataWave.WAVE_MAX_COUNT) {
            i5 = DataWave.WAVE_MAX_COUNT - 1;
            i4 = (DataStage.Wave - DataWave.WAVE_MAX_COUNT) + 1;
            z = true;
        } else {
            i4 = 0;
            z = false;
            i5 = DataStage.Wave;
        }

        if (bossFlag) {
            i6 = DataWave.monsterWaveData[i5][14];
            if (z)
                i6 += i4 * DataWave.monsterWaveData[60][14];
        } else {
            i6 = DataWave.monsterWaveData[i5][6];
            if (z)
                i6 += i4 * DataWave.monsterWaveData[60][6];
        }
        int upgradeUnitRate = i6 + ((DataWave.monsterWaveData[i5][6] * getUpgradeUnitRate(0, 2)) / 100);
        if (unit != null && unit.heroFlag) {
            upgradeUnitRate += (DataWave.monsterWaveData[i5][6] * getUpgradeItemRate(unit.heroOrder, 8)) / 100;
        }
        DataStage.Money += upgradeUnitRate;
        int[] iArr = awardDataValue;
        if (DataStage.Money >= iArr[21]) {
            iArr[21] = DataStage.Money;
            recheckAwardData();
        }
        i8 = z ? DataWave.monsterWaveData[60][bossFlag ? 15 : 7] : DataWave.monsterWaveData[i5][bossFlag ? 15 : 7];
        int upgradeUnitRate2 = i8 + ((DataWave.monsterWaveData[i5][7] * getUpgradeUnitRate(0, 3)) / 100);
        if (unit != null && unit.heroFlag) {
            upgradeUnitRate2 += (DataWave.monsterWaveData[i5][7] * getUpgradeItemRate(unit.heroOrder, 8)) / 100;
        }
        DataStage.Mana += upgradeUnitRate2;
        if (bossFlag) {
            destroyScore += ((DataStage.Wave * 0.1f) + 1.0f) * 120.0f * 5.0f;
        } else {
            destroyScore += ((DataStage.Wave * 0.1f) + 1.0f) * 120.0f;
        }
        int[] iArr2 = awardDataValue;
        iArr2[33] = iArr2[33] + 1;
        recheckAwardData();

        unitStatus = 1;
        unitStatusCount = 0;
        DataStage.addEffectUnit(13, posX, posY);
        if (DataStage.selectedTarget == this)
            DataStage.selectedTarget = null;
    }

    public void removeMonsterUnit() {
        monsterType = -1;
        unitStatus = -1;

        monsterUnitCount--;
    }
}
