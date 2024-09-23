package com.sncompany.newtower.Battle;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataHero;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataUpgradeHero;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.Pages.stage.StagePage;
import com.sncompany.newtower.Pages.stage.StageBase;
import com.sncompany.newtower.Texture2D;

public class HeroUnit extends TowerUnit {

    public static final int SPECIAL_ATTACK_ARROW_ANIM_START_FRAME = 135;
    public static final int SPECIAL_ATTACK_ARROW_ANIM_VIEW_COUNT = 60;
    public static final int SPECIAL_ATTACK_ARROW_DRAW_PER_FRAME = 5;
    public static final int SPECIAL_ATTACK_ARROW_DROP_START_FRAME = 60;
    public static final int SPECIAL_ATTACK_ARROW_FRAME_TOTAL_COUNT = 195;
    public static final int SPECIAL_ATTACK_ARROW_ITEM_COUNT = 75;
    public static final int SPECIAL_ATTACK_ARROW_LEG_POS_X = 403;
    public static final int SPECIAL_ATTACK_ARROW_LEG_POS_Y = 558;
    public static final int SPECIAL_ATTACK_ARROW_MOVE_VALUE = 100;
    public static final int SPECIAL_ATTACK_ARROW_STAY_POS_X = 200;
    public static final int SPECIAL_ATTACK_ARROW_STAY_POS_Y = 10;
    static final float SPECIAL_ATTACK_ARROW_UNIT_SIZE_DEGREE = 0.025f;
    static final float SPECIAL_ATTACK_ARROW_UNIT_SIZE_START = 0.5f;
    public static final int SPECIAL_ATTACK_ARROW_UNIT_START_FRAME = 165;
    public static final int SPECIAL_ATTACK_ARROW_UNIT_VIEW_START_COUNT = 30;
    static final float SPECIAL_ATTACK_BACKGROUND_ALPHA_DEGREE = 0.1f;
    public static final int SPECIAL_ATTACK_BACKGROUND_ENTER_START_POS = 0;
    public static final int SPECIAL_ATTACK_BACKGROUND_LINE_COUNT = 30;
    public static final int SPECIAL_ATTACK_BACKGROUND_OUT_START_POS = 50;
    public static final int SPECIAL_ATTACK_BLADE_DROP_START_FRAME = 65;
    public static final int SPECIAL_ATTACK_BLADE_FRAME_TOTAL_COUNT = 150;
    public static final int SPECIAL_ATTACK_BLADE_MOVE_VALUE = 100;
    public static final int SPECIAL_ATTACK_BLADE_STAY_POS = 100;
    public static final int SPECIAL_ATTACK_HERO_MOVE_ENTER_START_POS = 10;
    public static final int SPECIAL_ATTACK_HERO_MOVE_OUT_END_POS = 50;
    public static final int SPECIAL_ATTACK_HERO_MOVE_OUT_START_POS = 45;
    public static final int SPECIAL_ATTACK_HERO_MOVE_STAY_POS = 15;
    public static final int SPECIAL_ATTACK_HERO_VIEW_COUNT = 60;
    public static final int SPECIAL_ATTACK_ICE_ANIM_ICE_REVERSE_GO = 15;
    public static final int SPECIAL_ATTACK_ICE_ANIM_UNIT_VIEW_POS = 15;
    public static final int SPECIAL_ATTACK_ICE_ANIM_VIEW_COUNT = 50;
    public static final int SPECIAL_ATTACK_ICE_ANIM_WHITE_VIEW_POS = 30;
    public static final int SPECIAL_ATTACK_ICE_DROP_START_FRAME = 60;
    public static final int SPECIAL_ATTACK_ICE_FRAME_TOTAL_COUNT = 170;
    public static final int SPECIAL_ATTACK_ICE_ITEM_COUNT = 60;
    public static final int SPECIAL_ATTACK_ICE_MOVE_VALUE = 200;
    public static final int SPECIAL_ATTACK_ICE_OUT_START_NUM = 1000;
    public static final int SPECIAL_ATTACK_ICE_REVERSE_START_FRAME = 135;
    public static final int SPECIAL_ATTACK_ICE_STAY_POS_Y = 40;
    static final float SPECIAL_ATTACK_ICE_UNIT_SIZE_START = 0.3f;
    static final float SPECIAL_ATTACK_ICE_UNIT_SIZE_ZOOM_DEGREE = 0.1f;
    public static final int SPECIAL_ATTACK_ICE_UNIT_START_FRAME = 135;
    static final float SPECIAL_ATTACK_ICE_WHITE_ALPHA_DEGREE = 0.1f;
    static final float SPECIAL_ATTACK_ICE_WHITE_ALPHA_START = 2;
    public static final int SPECIAL_ATTACK_ICE_WHITE_END_FRAME = 170;
    public static final int SPECIAL_ATTACK_ICE_WHITE_START_FRAME = 150;
    private static final int[] hitPoint = {150, 195, 170};
    public int specialAttackFrameCount = -1;
    public int specialAttCount = 0;
    public int specialAttPower;
    public int specialCooltime = 0;
    public int specialMana;
    public int specialMaxCooltime;
    public int specialShowCount = 0;
    public final int[][] specialDataValue = new int[20][4];

    public static String getUnlock(int h) {
        return "Clear Stage " + (h == 0 ? 1 : h == 1 ? 10 : 25);
    }

    public HeroUnit(DataStage s, int tType, int bX, int bY) {
        super(s, tType, bX, bY);
    }

    public HeroUnit(TowerUnit twu, int tType, int lvl) {
        super(twu, tType, lvl);
    }

    private byte[][] getEquipment() {
        return Config.s.heroEquips[type];
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
        effectType = DataCharacter.EFF_NONE;
        attackEffect = dat[12];
        specialMana = dat[6] + ((dat[6] * getUpgradeRate(17)) / 100);
        specialAttPower = dat[7] + ((dat[7] * (getUpgradeRate(16) + getEquipEffect(DataUpgradeItem.EQ_CHARM, 0))) / 100);
        specialAttCount = dat[8];
        specialMaxCooltime = (dat[9] * 41) + ((dat[9] * getUpgradeRate(18)) / 100);
        if (Config.s.rewardValues[6]) {
            if (type == 0 || type == 2)
                effectType = DataCharacter.EFF_SPLASH;
            else if (type == 1) {
                targetMaxNum = 2;
                effectType = DataCharacter.EFF_DOUBLESHOT;
            }
        }
        if (st != null) {//Check because this is used on equipPage
            drawData = DataAnim.heroDrawData[type];
            drawTexture = st.page.heroImages[type];
        }
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
                tot += Config.s.heroUpgrades[type][g] * DataUpgradeHero.upgradeHeroData[g][0];
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
        if (type == -1 || !DataStage.heroAvail[type])
            return 0;
        int i3 = DataHero.heroData[type * 5][0];
        return i3 + ((Config.s.heroUpgrades[type][0] * DataUpgradeHero.upgradeHeroData[type][0] * i3) / 100);
    }

    @Override
    public int getSellPrice() {
        return 0;
    }

    @Override
    public void levelUpUnit() {
        if (level == 4)
            return;

        st.mana -= getLevelupPrice();
        level++;

        if (level == 4) {
            Config.s.awardValues[DataAward.AWARD_Awakening_Heros_Soul] = true;
            Config.s.awardValues[DataAward.AWARD_War_GOD + type] = true;
        }

        st.addEffectUnit(14, posX, posY);
        GameThread.playSound(13);
        restatTowerUnit(false);
        ((StagePage)st.page).levelUpCount = 10;
    }

    @Override
    public int getLevelupPrice() {
        int i3 = DataHero.heroData[oldType() + 1][0];
        return i3 + ((getEquipEffect(DataUpgradeItem.EQ_ARMOR, 0) * i3) / 100);
    }

    public int getEquipEffect(int type, int pos) {
        return getEquipEffect(getEquipment(), type, pos);
    }

    public static int getEquipEffect(byte[][] equipment, int type, int pos) {
        int eff = 0;
        if (type == DataUpgradeItem.EQ_MISC) {
            for (byte[] e : equipment)
                if (e != null && e[0] == type && e[1] == pos)
                    eff += DataUpgradeItem.equipData[type][pos];
            return eff;
        }
        for (byte[] e : equipment)
            if (e != null && e[0] == type)
                eff += DataUpgradeItem.equipData[type][e[1]];
        return eff;
    }

    public int getUpgradePrice() {
        return 0;
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

    //skip will be handled by setting specialAttackFrameCount to the maximum

    /**
     * Updates the time of a special attack
     * @return true if the special ended or it's not in use
     */
    public boolean updateSpecial() {
        if (specialAttackFrameCount != -1) {
            specialAttackFrameCount++;

            if (specialAttackFrameCount >= hitPoint[type]) {
                specialAttackFrameCount = -1;
                st.clearSpecialArrowUnit();
                hitSpecialAttack();
                specialCooltime = specialMaxCooltime;
                st.selectedUnit = null;
                ((StagePage)st.page).specialBlinkCount = 10;
            }
        }
        return specialAttackFrameCount != -1;
    }

    @Override
    protected int getVoice() {
        return 22 + (5 * type) - ((type*(type+1))/2);
    }

    @Override
    public int getHitPower() {
        return unitPower + (((getUpgradeRate(7) + getEquipEffect(DataUpgradeItem.EQ_RING, 0)) * unitPower) / 100);
    }

    @Override
    public int getHitDamage(MonsterUnit mon) {
        int pow = Math.max(1, (unitPower * (100 - mon.unitDefense)) / 100);
        return pow + (((getUpgradeRate(7) + getEquipEffect(DataUpgradeItem.EQ_RING, 0)) * pow) / 100);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0043. Please report as an issue. */
    public void useSpecialAttack() {
        GameThread.playSound(16);

        st.selectedUnit = this; //type + 8
        int arrowC = 0;
        specialAttackFrameCount = 0;
        st.mana -= specialMana;

        switch (type) {
            case 0:
                for (int i4 = 0; i4 < 60; i4++)
                    st.addSpecialArrowUnit(NewTower.getRandom(4) + 15, this, 33750, NewTower.getRandom(450) * 50, -(i4 + 65));

                for (int i5 = 0; i5 < 20; i5++) {
                    int i6 = i5 % 3;
                    specialDataValue[i5][0] = i6;
                    specialDataValue[i5][1] = NewTower.getRandom(GameRenderer.SCRWIDTH_SMALL);
                    specialDataValue[i5][2] = NewTower.getRandom(GameRenderer.SCRHEIGHT_SMALL);
                    if (i6 == 0) {
                        specialDataValue[i5][3] = 100;
                    } else if (i6 == 1) {
                        specialDataValue[i5][3] = 160;
                    } else
                        specialDataValue[i5][3] = 200;
                }
                break;
            case 1:
                while (arrowC < 75) {
                    st.addSpecialArrowUnit(NewTower.getRandom(3) + 33, this, NewTower.getRandom(675) * 50, NewTower.getRandom(450) * 50, -(arrowC + 60));
                    arrowC++;
                }
                break;
            case 2:
                while (arrowC < 60) {
                    st.addSpecialArrowUnit(NewTower.getRandom(14) + 19, this, (NewTower.getRandom(337) + GameRenderer.GAME_STAGE_CLEAR_THEME_ARROW_BLINK_END_POS) * 50, (NewTower.getRandom(225) + 112) * 50, -(arrowC + 65));
                    arrowC++;
                }
                break;
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
            if (type == 1) {
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
                    mon.dotHolyCount = DataCharacter.charData[17][DataCharacter.CONT_TIME];
                } else if (type == 2)
                    mon.slowRate = DataHero.heroData[i][10];

            }
        if (i >= 5)
            Config.s.awardValues[DataAward.AWARD_Swords_Banquet + type] = true;
    }

    public void draw() {
        float x = posX / 50f + 62, y = posY / 50f + 30;

        int sprSpd = 5;
        int dire = lastViewDirection == 6 ? 0 : 1;
        if (specialShowCount > 0) {
            specialShowCount--;
            dire = lastViewDirection == 6 ? 4 : 5;
        } else if (unitStatus == 1) {
            dire = lastViewDirection == 6 ? 2 : 3;
            sprSpd = 3;
        }
        if (st.turbo > 0)
            sprSpd /= st.turbo;

        int sCount = drawData[drawData[1] + dire];
        int sCur = drawData[drawData[0] + drawData[sCount + 1 + ((unitStatusCount / sprSpd) % drawData[sCount])]];
        st.page.shadowImage[0].drawAtPointOption(x, y + 10, 9);
        for (int i = 0; i < drawData[sCur]; i++) {
            boolean glow = i == 0 && unitStatus == 0;
            if (glow) {
                float f5 = 1;
                if (specialMaxCooltime > 0)
                    f5 = Math.max(0.3f, (float)(specialMaxCooltime - specialCooltime) / specialMaxCooltime);

                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(f5);
            }
            int i15 = (i * 5) + (sCur + 1);
            int i16 = i15 + 3;
            if (drawData[i16] != 1000) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(drawData[i16] / 1000f);
            }
            if (drawData[i15 + 4] == 0)
                drawTexture[drawData[i15]].drawAtPointOption(drawData[i15 + 1] + x, y + drawData[i15 + 2] + 10, 18);
            else
                drawTexture[drawData[i15]].drawAtPointOptionFlip(drawData[i15 + 1] + x, y + drawData[i15 + 2] + 10, 18);

            if (drawData[i16] != 1000 || glow)
                Texture2D.setColors(1);
        }
        float starX = x - (level < 3 ? 7.5f * level : 15);
        float dis = level < 3 ? 15 : 15 - (4.5f * (level - 2));
        for (int I = 0; I < level + 1; I++)
            st.page.uiUpperImage[StageBase.upper_star].drawAtPointOption((I * dis) + starX, y + 10, 9);
    }
}
