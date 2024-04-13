package com.sncompany.newtower.Battle;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataHero;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataUpgradeHero;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;

public class HeroUnit extends TowerUnit {

    public int specialAttCount;
    public int specialAttPower;
    public int specialCooltime = 0;
    public int specialMana;
    public int specialMaxCooltime;
    public int specialShowCount = 0;
    public int specialType;

    public static String getUnlock(int h) {
        return "Clear Stage " + (h == 0 ? 1 : h == 1 ? 10 : 25);
    }

    public HeroUnit(DataStage s, int tType, int bX, int bY) {
        super(s, tType, bX, bY);
    }

    private byte[][] getEquipment() {
        return Config.heroEquips[type];
    }

    @Override
    public void restatTowerUnit() {
        int i = oldType();
        int[] dat = DataHero.heroData[i];
        towerCoolTimeMax = Math.max(0, dat[2] - (dat[2] * (getUpgradeRate(8) + getEquipEffect(DataUpgradeItem.EQ_AMLT, 0))) / 100);

        attackRange = dat[3] + ((dat[3] * getEquipEffect(DataUpgradeItem.EQ_HELM, 0)) / 100);
        attackDistance = (((attackRange * 45) / 100) + 22) * 50;

        targetMaxNum = dat[4];
        unitPower = dat[1];
        attackType = dat[11];
        effectType = -1;
        attackEffect = dat[12];
        specialType = dat[5];
        specialMana = dat[6] + ((dat[6] * getUpgradeRate(17)) / 100);
        specialAttPower = dat[7] + ((dat[7] * (getUpgradeRate(16) + getEquipEffect(DataUpgradeItem.EQ_CHARM, 0))) / 100);
        specialAttCount = dat[8];
        specialMaxCooltime = (dat[9] * 41) + ((dat[9] * getUpgradeRate(18)) / 100);
        if (Config.rewardValues[6]) {
            if (type == 0 || type == 2)
                effectType = 1;
            else if (type == 1) {
                targetMaxNum = 2;
                effectType = 8;
            }
        }
    }

    @Override
    public int getRole() {
        return type;
    }

    @Override
    public int getUpgradeRate(int ind) {
        int tot = 0;
        for (int g = 0; g < 6; g++)
            if (DataUpgradeHero.upgradeHeroData[g][4] == ind)
                tot += Config.heroUpgrades[type][g] * DataUpgradeHero.upgradeHeroData[g][0];
        return tot;
    }

    public int getEquipEffect(int type, int pos) {
        int eff = 0;
        if (type == DataUpgradeItem.EQ_MISC) {
            for (byte[] e : getEquipment())
                if (e != null && e[0] == type && e[1] == pos)
                    eff += DataUpgradeItem.equipData[type][pos];
            return eff;
        }
        for (byte[] e : getEquipment())
            if (e != null && e[0] == type)
                eff += DataUpgradeItem.equipData[type][e[1]];
        return -1;
    }

    @Override
    public void update() {
        if (specialCooltime > 0) {
            specialCooltime--;
            if (specialCooltime == 0)
                specialShowCount = 4;
        }
        super.update();
    }

    @Override
    public int getSoundAttackType() {
        int i3 = DataHero.heroData[oldType()][13];
        return 22 + (5 * i3) - ((i3*(i3+1))/2);
    }

    @Override
    public int getHitPower() {
        return unitPower + (((getUpgradeRate(7) + getEquipEffect(2, 0)) * unitPower) / 100);
    }

    @Override
    public int getHitDamage(MonsterUnit mon) {
        int pow = Math.max(1, (unitPower * (100 - mon.unitDefense)) / 100);
        return pow + (((getUpgradeRate(7) + getEquipEffect(2, 0)) * pow) / 100);
    }

    public void setReverseSpecialIce() {
        for (int i = 0; i < arrowUnitCount; i++)
            if (arrowUnit[i].arrowType != -1 && arrowUnit[i].arrowType >= 19 && arrowUnit[i].arrowType <= 32) {
                arrowUnit[i].moveCount = 1000;
                arrowUnit[i].moveRotateDegree += 180.0f;
                if (arrowUnit[i].moveRotateDegree >= 360.0f)
                    arrowUnit[i].moveRotateDegree -= 360.0f;
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
                mon.dotHolyCount = DataHero.heroData[oldType()][10];
            }
            mon.damaged(specialHitDamage, this);
            return mon.dead();
        }
        return false;
    }

    public static void hitSpecialBladeAttack() {
        if (characterSelectNumber < 0) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < monsterUnitCount; i2++) {
            if (monsterUnit[i2].monsterType != -1) {
                playSound(1);
                addEffectUnit(15, monsterUnit[i2].posX, monsterUnit[i2].posY, true);
                for (int i3 = 0; i3 < towerUnit[characterSelectNumber].specialAttCount; i3++) {
                    if (towerUnit[characterSelectNumber].hitSpecialAttackUnit(monsterUnit[i2])) {
                        i++;
                    }
                }
            }
        }
        if (i >= 5) {
            int[] iArr = awardDataValue;
            iArr[48] = iArr[48] + 1;
        }
    }

    public static void hitSpecialArrowAttack() {
        if (characterSelectNumber < 0) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < monsterUnitCount; i2++) {
            if (monsterUnit[i2].monsterType != -1) {
                playSound(4);
                addEffectUnit(33, monsterUnit[i2].posX, monsterUnit[i2].posY, true);
                for (int i3 = 0; i3 < towerUnit[characterSelectNumber].specialAttCount; i3++) {
                    if (towerUnit[characterSelectNumber].hitSpecialAttackUnit(monsterUnit[i2])) {
                        i++;
                    }
                }
                monsterUnit[i2].dotHolyFlag = true;
                monsterUnit[i2].dotHolyDamage = towerUnit[characterSelectNumber].getSpecialHitDamage(monsterUnit[i2]) / 20;
                monsterUnit[i2].dotHolyCount = DataCharacter.charData[17][8];
            }
        }
        if (i >= 5) {
            int[] iArr = awardDataValue;
            iArr[49] = iArr[49] + 1;
        }
    }

    public static void hitSpecialIceAttack() {
        int i;
        int i2 = characterSelectNumber;
        if (i2 >= 0 && (i = towerUnit[i2].towerType) != -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < monsterUnitCount; i4++) {
                if (monsterUnit[i4].monsterType != -1) {
                    addEffectUnit(5, monsterUnit[i4].posX, monsterUnit[i4].posY, true);
                    playSound(7);
                    for (int i5 = 0; i5 < towerUnit[characterSelectNumber].specialAttCount; i5++) {
                        if (towerUnit[characterSelectNumber].hitSpecialAttackUnit(monsterUnit[i4])) {
                            i3++;
                        }
                    }
                    monsterUnit[i4].slowIceFlag = true;
                    monsterUnit[i4].slowRate = DataHero.heroData[i][10];
                }
            }
            if (i3 >= 5) {
                int[] iArr = awardDataValue;
                iArr[50] = iArr[50] + 1;
            }
        }
    }
}
