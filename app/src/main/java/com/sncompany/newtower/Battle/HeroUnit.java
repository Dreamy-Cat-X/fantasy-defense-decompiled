package com.sncompany.newtower.Battle;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataHero;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataUpgradeHero;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.DataClasses.DataUpgradeUnit;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;

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
    public void restatTowerUnit(boolean classChange) {
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

        drawData = DataAnim.heroDrawData[type];
        drawTexture = st.page.heroImages[type];
    }

    @Override
    public int oldType() {
        return (type * 5) + level;
    }

    @Override
    public int getRole() {
        return type;
    }

    public int getTier() {
        return 0;
    }

    @Override
    public int getUpgradeRate(int ind) {
        int tot = 0;
        for (int g = 0; g < 6; g++)
            if (DataUpgradeHero.upgradeHeroData[g][4] == ind)
                tot += Config.heroUpgrades[type][g] * DataUpgradeHero.upgradeHeroData[g][0];
        return tot;
    }

    @Override
    public int getUpgradeType() {
        return -1;
    }

    @Override
    public int getDowngradeType() {
        return -1;
    }

    public static int getHeroBuyPrice(int type) {
        if (type == -1 || !DataStage.heroAvail[type * 2])
            return 0;
        int i3 = DataHero.heroData[type * 5][0];
        return i3 + ((Config.heroUpgrades[type][0] * DataUpgradeHero.upgradeHeroData[type][0] * i3) / 100);
    }

    @Override
    public void levelUpUnit() {
        if (level == 4)
            return;

        st.Mana -= getLevelupPrice();
        level++;

        if (level == 4) {
            Config.awardValues[DataAward.AWARD_Awakening_Heros_Soul] = true;
            Config.awardValues[DataAward.AWARD_War_GOD + type] = true;
        }

        st.addEffectUnit(14, posX, posY);
        GameThread.playSound(13);
        restatTowerUnit(false);
        GameRenderer.levelUpCount = 10;
    }

    @Override
    public int getLevelupPrice() {
        int i3 = DataHero.heroData[oldType() + 1][0];
        return i3 + ((getEquipEffect(DataUpgradeItem.EQ_ARMOR, 0) * i3) / 100);
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
    public int getSoundHitType() {
        return 1 + (type * 3);
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
        for (ArrowUnit arrow : st.arrowUnit)
            if (arrow.type >= 19 && arrow.type <= 32) {
                arrow.moveCount = 1000;
                arrow.moveRotateDegree = (arrow.moveRotateDegree + 180) % 360;
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

    public void hitSpecialAttack() {
        int i = 0;
        for (MonsterUnit mon : st.monsterUnit)
            if (!mon.dead()) {
                GameThread.playSound(1 + (type * 3));
                st.addEffectUnit(15, mon.posX, mon.posY);
                for (int i3 = 0; i3 < specialAttCount; i3++)
                    if (hitSpecialAttackUnit(mon))
                        i++;
                if (type == 1) {
                    mon.dotHolyDamage = getSpecialHitDamage(mon) / 20;
                    mon.dotHolyCount = DataCharacter.charData[17][8];
                } else if (type == 2)
                    mon.slowRate = DataHero.heroData[i][10];

            }
        if (i >= 5)
            Config.awardValues[DataAward.AWARD_Swords_Banquet + type] = true;
    }

    //HitSpecialAttack replaces all 3 functions below. Kept for hidden usages
    public void hitSpecialBladeAttack() {
        if (st.selectedUnit != this)
            return;

        int i = 0;
        for (MonsterUnit mon : st.monsterUnit)
            if (!mon.dead()) {
                GameThread.playSound(1);
                st.addEffectUnit(15, mon.posX, mon.posY);
                for (int i3 = 0; i3 < specialAttCount; i3++)
                    if (hitSpecialAttackUnit(mon))
                        i++;
            }
        if (i >= 5)
            Config.awardValues[DataAward.AWARD_Swords_Banquet] = true;
    }

    public void hitSpecialArrowAttack() {
        if (st.selectedUnit != this)
            return;

        int i = 0;
        for (MonsterUnit mon : st.monsterUnit)
            if (!mon.dead()) {
                GameThread.playSound(4);
                st.addEffectUnit(15, mon.posX, mon.posY);
                for (int i3 = 0; i3 < specialAttCount; i3++)
                    if (hitSpecialAttackUnit(mon))
                        i++;
                mon.dotHolyDamage = getSpecialHitDamage(mon) / 20;
                mon.dotHolyCount = DataCharacter.charData[17][8];
            }
        if (i >= 5)
            Config.awardValues[DataAward.AWARD_Rain_Of_Death] = true;
    }

    public void hitSpecialIceAttack() {
        if (st.selectedUnit != this)
            return;

        int i = 0;
        for (MonsterUnit mon : st.monsterUnit)
            if (!mon.dead()) {
                GameThread.playSound(7);
                st.addEffectUnit(15, mon.posX, mon.posY);
                for (int i3 = 0; i3 < specialAttCount; i3++)
                    if (hitSpecialAttackUnit(mon))
                        i++;
                mon.slowRate = DataHero.heroData[i][10];
            }
        if (i >= 5)
            Config.awardValues[DataAward.AWARD_Frozen_Heart] = true;
    }
}
