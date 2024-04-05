package com.sncompany.newtower.DataClasses;

import com.sncompany.newtower.MonsterUnit;

public class HeroUnit extends TowerUnit {

    @Override
    public int getHitPower() {
        return unitPower + (((getUpgradeHeroRate(heroOrder, 7) + getUpgradeItemRate(heroOrder, 2)) * unitPower) / 100);
    }

    @Override
    public int getHitDamage(MonsterUnit mon) {
        int pow = Math.max(1, (unitPower * (100 - mon.unitDefense)) / 100);
        return pow + (((getUpgradeHeroRate(heroOrder, 7) + getUpgradeItemRate(heroOrder, 2)) * pow) / 100);
    }

    public void setReverseSpecialIce() {
        for (int i = 0; i < arrowUnitCount; i++) {
            if (arrowUnit[i].arrowType != -1 && arrowUnit[i].arrowType >= 19 && arrowUnit[i].arrowType <= 32) {
                arrowUnit[i].moveCount = 1000;
                arrowUnit[i].moveRotateDegree += 180.0f;
                if (arrowUnit[i].moveRotateDegree >= 360.0f)
                    arrowUnit[i].moveRotateDegree -= 360.0f;
            }
        }
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
