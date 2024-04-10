package com.sncompany.newtower.Battle;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataMap;
import com.sncompany.newtower.DataClasses.DataMonster;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataWave;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;

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
    public int unitStatus = 0; //1 means dead, -1 means removed
    public int unitStatusCount = 0;
    private final DataStage st;

    public MonsterUnit(DataStage s, int type, boolean bossFlag) {
        st = s;
        this.type = type;
        this.bossFlag = bossFlag;

        int[] data = DataMonster.monsterData[type];
        unitHP = data[1];
        bodySize = data[2];
        unitDefense = data[3];

        int i2 = 0;
        int swave = st.waveManager.current;
        boolean infWave = st.mapType == 1 && swave >= DataWave.WAVE_MAX_COUNT;
        if (infWave) {
            i2 = (swave - DataWave.WAVE_MAX_COUNT) + 1;
            swave = DataWave.WAVE_MAX_COUNT - 1;
        }

        if (bossFlag) {
            unitHP = (((unitHP * (DataWave.monsterWaveData[swave][8] + (DataWave.monsterWaveData[60][8] * i2))) / 100) * DataStage.stageData[st.mapType][3]) / 100;
            unitDefense += DataWave.monsterWaveData[swave][9];
            if (infWave)
                unitDefense += DataWave.monsterWaveData[60][9] * i2;
            unitSpeed = (((unitSpeed * data[4]) * (DataWave.monsterWaveData[swave][10] + (DataWave.monsterWaveData[60][10] * i2))) / 100) / 100;
            unitMinSpeed = (unitSpeed * (DataWave.monsterWaveData[swave][11] + (i2 * DataWave.monsterWaveData[60][11]))) / 1000;
        } else {
            unitHP = (((unitHP * (DataWave.monsterWaveData[swave][0] + (DataWave.monsterWaveData[60][0] * i2))) / 100) * DataStage.stageData[st.mapType][2]) / 100;
            unitDefense += DataWave.monsterWaveData[swave][1];
            if (infWave)
                unitDefense += DataWave.monsterWaveData[60][1] * i2;
            unitSpeed = (((unitSpeed * data[4]) * (DataWave.monsterWaveData[swave][2] + (DataWave.monsterWaveData[60][2] * i2))) / 100) / 100;
            unitMinSpeed = (unitSpeed * (DataWave.monsterWaveData[swave][3] + (i2 * DataWave.monsterWaveData[60][3]))) / 1000;
        }
        unitMaxHP = unitHP;
        if (unitMinSpeed > unitSpeed)
            unitMinSpeed = unitSpeed;

        posX = ((s.map.mapStartPosition[s.map.mapStartPositionLoop][0] * 45) + 22) * 50;
        posY = ((s.map.mapStartPosition[s.map.mapStartPositionLoop][1] * 45) + 22) * 50;
        fromBlockX = s.map.mapStartPosition[s.map.mapStartPositionLoop][0];
        fromBlockY = s.map.mapStartPosition[s.map.mapStartPositionLoop][1];
        int[][] iArr = s.map.mapStartPosition;
        int i8 = s.map.mapStartPositionLoop;
        int randomMapDirection = s.map.getRandomMapDirection(iArr[i8][0], iArr[i8][1], -1);

        direction = randomMapDirection;
        targetBlockX = fromBlockX + DataMap.DIR_MOVE_POS[randomMapDirection][0];
        targetBlockY = fromBlockY + DataMap.DIR_MOVE_POS[randomMapDirection][1];
    }

    @Override
    public boolean update() {
        unitStatusCount++;
        if (stunCount > 0)
            stunCount--;

        if (dotHolyCount > 0) {
            dotHolyCount--;
            if (dotHolyCount > 0)
                damaged(dotHolyDamage, null);
        }
        if (dotFireCount > 0) {
            dotFireCount--;
            if (dotFireCount > 0)
                damaged(dotFireDamage, null);
        }
        if (slowIceFlag || slowMudFlag) {
            slowRate -= 1.0f;
            if (slowRate <= 0.0f) {
                slowIceFlag = false;
                slowMudFlag = false;
            }
        }
        if (dead())
            return false;

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
                    } else {
                        posY -= espd;
                    }
                    espd = 0;
                } else if (i5 > posY) {
                    espd -= i5 - posY;
                    posY = i5;
                } else {
                    espd -= -(i5 - posY);
                    posY = i5;
                }
            } else {
                int randomMapDirection = st.map.getRandomMapDirection(targetBlockX, targetBlockY, -1);
                direction = randomMapDirection;
                if (randomMapDirection == -1)
                    break;

                targetBlockX = fromBlockX + DataMap.DIR_MOVE_POS[randomMapDirection][0];
                targetBlockY = fromBlockY + DataMap.DIR_MOVE_POS[randomMapDirection][1];
            }
        }
        for (int i6 = 0; i6 < st.map.mapEndPositionCount; i6++) {
            int[][] iArr = st.map.mapEndPosition;
            int i7 = ((iArr[i6][0] * 45) + 22) * 50;
            int i8 = ((iArr[i6][1] * 45) + 22) * 50;
            if (posX == i7 && posY == i8) {
                st.addEffectUnit(EffectUnit.EFFECT_TYPE_GATE_BREAK, posX, posY);
                if (Config.vibration) {
                    NewTower.vibe.vibrate(250L);
                }
                GameThread.playSound(12);
                type = -1;
                unitHP = 0;
                GameRenderer.monsterGoalBlinkCount = 6;
                if (st.Life > 0) {
                    int i10 = st.waveManager.wavePattern;
                    if (i10 == 2)
                        st.Life = Math.max(0, st.Life - 3);
                    else if (i10 == 3)
                        st.Life = bossFlag ? 0 : st.Life - 1;
                    else
                        st.Life--;
                }
                if (st.Life <= 0) {
                    GameRenderer.monsterGoalBlinkCount = 0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void hit(int dmgType, TowerUnit unit) {
        int i9 = Math.min(st.waveManager.current, DataWave.WAVE_MAX_COUNT);
        int i10 = unit != null ? unit.towerType : -1;
        if (dead() || unit == null)
            return;

        int soundHitType = GameThread.getSoundHitType(unit);
        if (soundHitType != -1)
            GameThread.playSound(soundHitType);

        damaged(unit.getHitDamage(this), unit);
        if (unit instanceof HeroUnit) {
            int upgradeItemRate = getUpgradeItemRate(unit.heroOrder, 10);
            if (upgradeItemRate > 0 && NewTower.getRandom(100) < upgradeItemRate) {
                dotHolyFlag = true;
                dotHolyDamage = (unit.getHitDamage(this) * 3) / 100;
                dotHolyCount = DataCharacter.charData[17][8];
            }
            int upgradeItemRate2 = getUpgradeItemRate(unit.heroOrder, 11);
            if (upgradeItemRate2 > 0 && !bossFlag && NewTower.getRandom(100) < upgradeItemRate2) {
                unitHP = 0;
                kill(unit);
            }
            int upgradeItemRate3 = getUpgradeItemRate(unit.heroOrder, 12);
            if (upgradeItemRate3 > 0 && !stunFlag && NewTower.getRandom(100) < upgradeItemRate3) {
                stunFlag = true;
                stunCount = DataCharacter.charData[5][8];
                if (bossFlag)
                    stunCount /= 2;
            }
            int upgradeItemRate4 = getUpgradeItemRate(unit.heroOrder, 13);
            if (upgradeItemRate4 > 0 && NewTower.getRandom(100) < upgradeItemRate4) {
                slowIceFlag = true;
                slowRate += DataCharacter.charData[29][8];
                if (slowRate > 80.0f)
                    slowRate = 80.0f;
            }
        } else {
            switch (unit.effectType) {
                case 0: {
                    int upgradeRate = (DataCharacter.charData[i10][7] * (getUpgradeUnitRate(1, 10) + 100)) / 100;
                    int prob = upgradeRate - ((DataMonster.monsterData[type][6] * (DataWave.monsterWaveData[i9][bossFlag ? 12 : 4] + 100)) / 100);
                    if (stunCount == 0 && NewTower.getRandom(100) < prob) {
                        stunCount = (DataCharacter.charData[i10][8] * (getUpgradeUnitRate(1, 11) + 100)) / 100;
                        if (bossFlag)
                            stunCount /= 2;
                    }
                    break;
                } case 1:
                    unit.hitUnitSplash(unit.attackType * 3, this);
                    break;
                case 2:
                    int hitDamage = unit.getHitDamage(this);
                    dotHolyDamage = ((hitDamage + ((getUpgradeUnitRate(2, 7) * hitDamage) / 100)) * ((getUpgradeUnitRate(2, 12) + 100) / 100)) / 20;
                    dotHolyCount = (DataCharacter.charData[i10][8] * (getUpgradeUnitRate(2, 13) + 100)) / 100;
                    break;
                case 3:
                    int base = (DataMonster.monsterData[type][7] * (DataWave.monsterWaveData[i9][bossFlag ? 13 : 5] + 100)) / 100;
                    int uur2 = ((DataCharacter.charData[i10][7] * (getUpgradeUnitRate(3, 14) + 100)) / 100) - base;
                    base = uur2 - base;
                    if (NewTower.getRandom(100) < base) {
                        slowIceFlag = true;
                        slowRate += (DataCharacter.charData[i10][8] * (getUpgradeUnitRate(3, 15) + 100)) / 100;
                        if (slowRate > 80.0f)
                            slowRate = 80.0f;
                    }
                    break;
            }
        }
    }

    public void hitUnitFierce(ArrowUnit arrow, TowerUnit shooter) {
        if (shooter == null || dead())
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
            for (MonsterUnit mon : st.monsterUnit) {
                if (mon.monsterType != -1 && mon.unitStatus == 0 && !arrow.hitMons.contains(mon)) {
                    int abs5 = Math.abs(efx - mon.posX) / 50;
                    int abs6 = Math.abs(efy - mon.posY) / 50;
                    if ((abs5 * abs5) + (abs6 * abs6) <= 225) {
                        arrow.hitMons.add(mon);
                        st.addEffectUnit(shooter.attackEffect, mon.posX, mon.posY);
                        mon.damaged(shooter.getHitDamage(this), shooter);
                    }
                }
            }
        }
    }

    public void damaged(int dmg, TowerUnit unit) {
        unitHP -= dmg;
        if (dead())
            kill(unit);
    }

    @Override
    public void kill(TowerUnit unit) {
        int i4 = 0;
        int i5 = st.waveManager.current;
        int i6;
        int i8;
        boolean z = st.mapType == 1 && i5 >= DataWave.WAVE_MAX_COUNT;
        if (z) {
            i5 = DataWave.WAVE_MAX_COUNT - 1;
            i4 = (st.waveManager.current - DataWave.WAVE_MAX_COUNT) + 1;
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
        int upgradeUnitRate = i6 + ((DataWave.monsterWaveData[i5][6] * TowerUnit.getUpgradeUnitRate(0, 2)) / 100);
        if (unit != null && unit.heroFlag)
            upgradeUnitRate += (DataWave.monsterWaveData[i5][6] * getUpgradeItemRate(unit.heroOrder, 8)) / 100;

        st.Money += upgradeUnitRate;
        DataAward.check_money(st.Money);

        i8 = z ? DataWave.monsterWaveData[60][bossFlag ? 15 : 7] : DataWave.monsterWaveData[i5][bossFlag ? 15 : 7];
        int upgradeUnitRate2 = i8 + ((DataWave.monsterWaveData[i5][7] * TowerUnit.getUpgradeUnitRate(0, 3)) / 100);
        if (unit != null && unit.heroFlag)
            upgradeUnitRate2 += (DataWave.monsterWaveData[i5][7] * getUpgradeItemRate(unit.heroOrder, 8)) / 100;

        st.Mana += upgradeUnitRate2;
        st.bScore += ((st.waveManager.current * 0.1f) + 1f) * 120f * (bossFlag ? 5 : 1);
        DataAward.check_kill();

        unitStatus = 1;
        unitStatusCount = 0;
        st.addEffectUnit(EffectUnit.EFFECT_TYPE_DIE, posX, posY);
        if (st.selectedTarget == this)
            st.selectedTarget = null;
    }
}
