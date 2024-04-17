package com.sncompany.newtower.Battle;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataUpgradeUnit;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Pages.stage.StageBase;
import com.sncompany.newtower.Texture2D;

import java.util.ArrayList;

/* loaded from: D:\decomp\classes.dex */
public class TowerUnit extends StageEntity implements Comparable<TowerUnit> {
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
    static final float SPECIAL_ATTACK_ARROW_UNIT_SIZE_START = 0.5f;
    public int attackCount = 0;
    public int attackDistance;
    public int attackEffect;
    public int attackRange;
    public int attackType;
    public final int blockX;
    public final int blockY;
    public int effectType;
    public float headRotateDegree = 0f;
    public boolean heroFlag;//Replace with (this instanceof HeroUnit)
    public int heroOrder;
    public int lastViewDirection = 6;//2 and 6 are all it ever gets written to it
    public int originalPosX;
    public int originalPosY;
    public int posX;
    public int posY;
    public int targetMaxNum;
    public int towerCoolTime = 0;
    public int towerCoolTimeMax;
    public int towerType; //deprecated, replace with [type] and [level], use oldType() when needed for data arrays
    public int level = 0;
    public int unitPower;
    /**
     * 0 means Idle, 1 means attacking, 2 is locked apparently
     */
    public int unitStatus = 2;
    public int unitStatusCount = 0;
    public ArrayList<EnemyUnit> lockedEnemies = new ArrayList<>(3);
    protected final DataStage st;

    public static final String[] effectTypeString = {"Stun", "Splash", "DoT", "Slow", "Pierce", "Slow Mud", "Dot Fire", "Multi Shot", "Double Shot", "None"};
    public static String getEffectTypeString(int i) {
        if (i == -1 || i > 9)
            return effectTypeString[9];
        return effectTypeString[i];
    }

    public static int getTowerBoxImageOrder(int type) {
        if (type % 4 < 2)
            return -1;
        return (type % 2) + ((type / 4) * 2); //While merely dividing by 2 looks like a more reasonable choice, this takes advantage of flooring
    }

    public TowerUnit(DataStage s, int tType, int bX, int bY) {
        st = s;
        type = tType;
        blockX = bX;
        blockY = bY;
        posX = ((bX * 45) + 22) * 50;
        posY = ((bY * 45) + 22) * 50;
        originalPosX = posX;
        originalPosY = posY;

        drawData = DataAnim.towerDrawData[type];
        drawTexture = st.page.towerImages[type];
    }

    public void restatTowerUnit(boolean classChange) {
        int ot = oldType();

        int[] dat = DataCharacter.charData[ot];
        towerCoolTime = 0;
        towerCoolTimeMax = Math.max(0, dat[3] - ((dat[3] * getUpgradeRate(8)) / 100));

        attackRange = dat[4] + ((dat[4] * getUpgradeRate(9)) / 100);
        attackDistance = (((attackRange * 45) / 100) + 22) * 50;
        targetMaxNum = dat[5];
        unitPower = dat[2];
        attackType = dat[9];
        effectType = dat[6];
        attackEffect = dat[10];
        if (targetMaxNum <= 1 || effectType != -1)
            return;
        effectType = 7;

        if (classChange) {
            drawData = DataAnim.towerDrawData[type];
            drawTexture = st.page.towerImages[type];
        }
    }

    public int atkDistanceSquare() {
        return attackDistance * attackDistance;
    }

    public int oldType() {
        return (type * 3) + level;
    }

    public int getRole() {
        return type / 4; //0 = Warrior, 1 = Archer, 2 = Mage
    }

    public int getTier() {
        return type % 4;
    }

    public int getAttackSpeed() {
        int es = Math.max(0, 60 - towerCoolTimeMax);
        return (es * 5) + 70;
    }

    public int getUpgradeRate(int ind) {
        return getUpgradeRate(getRole(), ind);
    }

    public static int getUpgradeRate(int role, int ind) {
        int tot = 0;
        for (int g = role * 6; g < (role * 6) + 6; g++)
            if (DataUpgradeUnit.upgradeUnitData[g][4] == ind)
                tot += Config.unitUpgrades[role][g % 6] * DataUpgradeUnit.upgradeUnitData[g][0];
        return tot;
    }

    public int getUpgradeType() {
        int tier = getTier();
        return switch (tier) {
            case 0 -> type + 2;
            case 2 -> type + 1;
            default -> -1;
        };
    }

    public int getDowngradeType() {
        int tier = getTier();
        return switch (tier) {
            case 2 -> type - 2;
            case 3 -> type - 1;
            default -> -1;
        };
    }

    public static int getBuyPrice(int type) {
        if (type == -1)
            return 0;

        int role = type / 4;
        int i2 = DataCharacter.charData[type * 3][0];
        int reduction = (i2 * Config.unitUpgrades[role][0] * DataUpgradeUnit.upgradeUnitData[role * 6][0]) / 100;

        return i2 + reduction;
    }

    public int getSellPrice() {
        return DataCharacter.charData[oldType()][13] / 2;
    }

    public void levelUpUnit() {
        if (level == 2)
            return;

        st.Money -= getLevelupPrice();
        level++;

        if (level == 2 && (getTier() == 1 || getTier() == 3))
            Config.awardValues[(getTier() == 1 ? DataAward.AWARD_Guardian_Of_War : DataAward.AWARD_Thrill_Of_The_Hammer) + getRole()] = true;

        restatTowerUnit(false);
        st.addEffectUnit(14, posX, posY);
        GameThread.playSound(13);
        GameRenderer.levelUpCount = 10;
    }

    public int getLevelupPrice() {
        return DataCharacter.charData[oldType() + 1][0];
    }

    public void upgradeUnit() {
        if (getUpgradeType() != -1 && st.Money >= getUpgradePrice()) {
            st.Money -= getUpgradePrice();
            type = getUpgradeType();
            restatTowerUnit(true);
            st.addEffectUnit(14, posX, posY);
            GameThread.playSound(13);
            GameRenderer.upgradeCount = 10;
        }
    }

    public int getUpgradePrice() {
        return DataCharacter.charData[oldType()][1];
    }

    public int getSoundHitType() {
        return switch (type) {
            case 0, 2, 3 -> 1; //Warrior, Knight, Warlord
            case 1 -> 2; //Brandisher
            case 4, 6, 7 -> 3; //Archer, Sharpshooter, Sky Arrow
            case 5 -> 4; //Holy Eye
            case 8 -> 5; //Mage
            case 9 -> 7; //IceMage
            case 10, 11 -> 6; //Sorceress, Blaster
            default -> -1;
        };
    }

    public void update() {
        int soundAttackType;

        unitStatusCount++;
        if (towerCoolTime > 0)
            towerCoolTime--;

        int oStatus = unitStatus;
        if (unitStatus == 1) {
            EnemyUnit e = lockedEnemies.get(0);
            if (this instanceof HeroUnit && unitStatusCount <= 6) {
                posX = (int) (originalPosX + ((((e.posX - posX) * unitStatusCount) / 6) * SPECIAL_ATTACK_ARROW_UNIT_SIZE_START));
                posY = (int) (originalPosY + ((((e.posY - posY) * unitStatusCount) / 6) * SPECIAL_ATTACK_ARROW_UNIT_SIZE_START));
            }
            headRotateDegree = getRotateDegree(e.posX - posX, e.posY - posY);
            if (posX < e.posX) {
                lastViewDirection = 2;
            } else if (posX > e.posX) {
                lastViewDirection = 6;
            }

            if (unitStatusCount == 6) {
                boolean attack = false;
                for (int j = 0; j < lockedEnemies.size(); j++)
                    if (!lockedEnemies.get(j).dead()) {
                        attack = true;
                        break;
                    }
                if (attack) {
                    attackCount++;
                    towerCoolTime = towerCoolTimeMax;
                    if (attackType == 0) {
                        int soundHitType = getSoundHitType();
                        if (soundHitType != -1)
                            GameThread.playSound(soundHitType);

                        for (int i9 = 0; i9 < Math.min(targetMaxNum, lockedEnemies.size()); i9++) {
                            EnemyUnit locked = lockedEnemies.get(i9);
                            st.addEffectUnit(attackEffect, locked.posX, locked.posY);
                            locked.hit(0, this);
                        }
                    } else if (attackType == 1)
                        for (int j = 0; j < Math.min(targetMaxNum, lockedEnemies.size()); j++)
                            addArrowUnit(attackEffect, j);
                } else {
                    unitStatus = 0;
                    unitStatusCount = 0;
                    towerCoolTime = 0;
                    posX = originalPosX;
                    posY = originalPosY;
                }
            }
            if (unitStatusCount == 15) {
                unitStatus = 0;
                unitStatusCount = 0;
                towerCoolTime = towerCoolTimeMax;
                posX = originalPosX;
                posY = originalPosY;
            }
        }
        if (oStatus == 0 && towerCoolTime == 0) {
            getCloseEnemyUnitInRange();
            if (!lockedEnemies.isEmpty()) {
                unitStatus = 1;
                unitStatusCount = 0;
            }

            if (unitStatus == 1 && (soundAttackType = getSoundAttackType()) != -1)
                GameThread.playSound(soundAttackType);
        }
    }

    public int getSoundAttackType() {
        return switch (type) {
            case 0, 2 -> 21;
            case 1 -> 23;
            case 3 -> 22;
            case 4, 6 -> 24;
            case 5 -> 26;
            case 7 -> 25;
            case 8 -> 27;
            case 9 -> 29;
            case 10, 11 -> 28;
            default -> -1;
        };
    }

    void addArrowUnit(int type, int tInd) {
        ArrowUnit arrow = new ArrowUnit(st, this, lockedEnemies.get(tInd), type);
        st.arrowUnit.add(arrow);
    }

    public static float getRotateDegree(float f, float f2) {
        double d;
        double degrees;
        double degrees2;
        if (f == 0.0f) {
            return f2 < 0.0f ? 0.0f : 180.0f;
        }
        if (f2 == 0.0f) {
            return f < 0.0f ? 270.0f : 90.0f;
        }
        float abs = Math.abs(f2) / Math.abs(f);
        if (f < 0.0f) {
            d = 270.0d;
            if (f2 < 0.0f) {
                degrees = Math.toDegrees(Math.atan(abs));
            } else {
                degrees2 = Math.toDegrees(Math.atan(abs));
                degrees = -degrees2;
            }
        } else {
            d = 90.0d;
            if (f2 < 0.0f) {
                degrees2 = Math.toDegrees(Math.atan(abs));
                degrees = -degrees2;
            } else {
                degrees = Math.toDegrees(Math.atan(abs));
            }
        }
        return (float) (degrees + d);
    }

    public void getCloseEnemyUnitInRange() {
        lockedEnemies.removeIf(mon -> mon.dead() || Math.abs(posX - mon.posX) + Math.abs(posY - mon.posY) > attackDistance * 2 ||
                !(((posX - mon.posX) * (posX - mon.posX)) + ((posY - mon.posY) * (posY - mon.posY)) <= atkDistanceSquare()));

        EnemyUnit targ = st.selectedTarget;
        if (targ != null && !lockedEnemies.contains(targ) && !(Math.abs(posX - targ.posX) + Math.abs(posY - targ.posY) > attackDistance * 2) &&
                ((posX - targ.posX) * (posX - targ.posX)) + ((posY - targ.posY) * (posY - targ.posY)) <= atkDistanceSquare()) {
            lockedEnemies.add(0, targ);
            if (lockedEnemies.size() >= targetMaxNum) {
                while (lockedEnemies.size() > targetMaxNum)
                    lockedEnemies.remove(lockedEnemies.size() - 1);
                return;
            }
        }

        for (MonsterUnit mon : st.monsterUnit) {
            if (mon == targ || mon.dead() || Math.abs(posX - mon.posX) + Math.abs(posY - mon.posY) > attackDistance * 2)
                continue;
            if (((posX - mon.posX) * (posX - mon.posX)) + ((posY - mon.posY) * (posY - mon.posY)) <= atkDistanceSquare()) {
                lockedEnemies.add(mon);
                if (lockedEnemies.size() >= targetMaxNum)
                    break;
            }
        }
    }

    public int getHitPower() {
        return unitPower + (getUpgradeRate(7) * unitPower) / 100;
    }

    public int getHitDamage(MonsterUnit mon) {
        int dmg = Math.max(1, (unitPower * (100 - mon.unitDefense)) / 100);
        int atkBuff = (getUpgradeRate(7) * dmg) / 100;
        return dmg + atkBuff;
    }

    public void hitUnitSplash(int eff, EnemyUnit eu) {
        for (MonsterUnit mon : st.monsterUnit)
            if (eu != mon && !mon.dead()) {
                int abs = Math.abs(eu.posX - mon.posX) / 50;
                int abs2 = Math.abs(eu.posY - mon.posY) / 50;
                if ((abs * abs) + (abs2 * abs2) <= ArrowUnit.SPLASH_RANGE_MAX_DISTANCE) {
                    if (eff == 0)
                        st.addEffectUnit(EffectUnit.EFFECT_TYPE_SWORD_SPLASH, mon.posX, mon.posY);
                    mon.damaged(getHitDamage(eu instanceof MonsterUnit ? (MonsterUnit)eu : mon), this);
                }
            }
    }

    public void draw() {
        float x = posX / 50f + 62, y = posY / 50f + 30;

        int sprSpd = 5;
        int dire = lastViewDirection == 6 ? 0 : 1;
        if (unitStatus == 1) {
            dire = lastViewDirection == 6 ? 2 : 3;
            sprSpd = 3;
        } else if (unitStatus != 2) {
            sprSpd = 25;
            dire = 0;
        }
        if (st.turbo > 0)
            sprSpd /= st.turbo;

        int sCount = drawData[drawData[1] + dire];
        int sCur = drawData[drawData[0] + drawData[sCount + 1 + ((unitStatusCount / sprSpd) % drawData[sCount])]];
        st.page.shadowImage[0].drawAtPointOption(x, y + 10, 9);
        for (int i = 0; i < drawData[sCur]; i++) {
            int i15 = (i * 5) + (sCur + 1);
            int i16 = i15 + 3;
            if (drawData[i16] != 1000) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(drawData[i16] / 1000f);
            }
            if (drawData[i15 + 4] == 0)
                drawTexture[drawData[i15]].drawAtPointOption(drawData[i15 + 1] + x, y + drawData[i15 + 2] + 10.0f, 18);
            else
                drawTexture[drawData[i15]].drawAtPointOptionFlip(drawData[i15 + 1] + x, y + drawData[i15 + 2] + 10.0f, 18);

            if (drawData[i16] != 1000)
                Texture2D.setColors(1);
        }
        float starX = x - (7.5f * (level));
        for (int i5 = 0; i5 < level + 1; i5++)
            st.page.uiUpperImage[StageBase.upper_star].drawAtPointOption((i5 * 15) + starX, y + 10, 9);
    }

    public void drawUnitRangeCircle() {
        int circle = Math.min((attackRange - 1) / 100, 3);
        whiteCircleImage[circle].drawAtPointOptionSize((originalPosX / 50.0f) + 62.0f, (originalPosY / 50.0f) + 30.0f, 9, (attackRange * 0.9f) / ((circle + 1) * 100));
    }

    @Override
    public int compareTo(TowerUnit e) {
        return Integer.compare(posY, e.posY);
    }
}
