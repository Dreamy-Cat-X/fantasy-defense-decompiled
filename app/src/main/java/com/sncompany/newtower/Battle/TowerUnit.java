package com.sncompany.newtower.Battle;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataHero;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataUpgradeUnit;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
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
    public int lastViewDirection = 6;
    public int originalPosX;
    public int originalPosY;
    public int posX;
    public int posY;
    public int targetMaxNum;
    public int towerCoolTime = 0;
    public int towerCoolTimeMax;
    public int towerType; //deprecated, replace with [type] and [level], use oldType() when needed for data arrays
    public int level = 0;
    public int type;
    public int unitPower;
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
        int role = getRole();
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
            towerType = getUpgradeType();
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d4 A[LOOP:1: B:63:0x01d2->B:64:0x01d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw() {
        float x = posX / 50f + 62, y = posY / 50f + 30;
        int i;
        int[] iArr;
        int i2;
        int i3;
        float f3;
        int i4;
        int i5;
        int i6;
        float f4;
        float f5;
        float f6 = x;
        int i7 = towerType;
        if (i7 == -1) {
            return;
        }
        int i8 = 1;
        int towerLevelOrder = getTowerLevelOrder(i7, heroFlag) + 1;
        int i9 = unitStatus;
        int i10 = 5;
        if (i9 != 0) {
            if (i9 == 1) {
                i = lastViewDirection == 6 ? 2 : 3;
                i10 = 3;
            } else if (i9 != 2) {
                i10 = 25;
                i = 0;
            }

            int i12 = drawData[drawData[1] + i];
            int i13 = drawData[drawData[0] + drawData[i12 + 1 + ((unitStatusCount / i10) % drawData[i12])]];
            i2 = drawData[i13];
            int i14 = i13 + 1;
            float f7 = y + 10.0f;
            st.page.shadowImage[0].drawAtPointOption(f6, f7, 9);
            i3 = 0;
            while (i3 < i2) {
                boolean z = heroFlag == 1 && i3 == 0 && unitStatus == 0;
                if (z) {
                    if (specialMaxCooltime > 0) {
                        f5 = (specialMaxCooltime - specialCooltime) / specialMaxCooltime;
                        if (f5 < 0.3f) {
                            f5 = 0.3f;
                        }
                    } else {
                        f5 = 1.0f;
                    }
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    Texture2D.gl.glColor4f(f5, f5, f5, f5);
                }
                int i15 = (i3 * 5) + i14;
                int i16 = i15 + 3;
                if (drawData[i16] != 1000) {
                    Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                    i6 = i14;
                    Texture2D.gl.glColor4f(drawData[i16] / 1000.0f, drawData[i16] / 1000.0f, drawData[i16] / 1000.0f, drawData[i16] / 1000.0f);
                } else {
                    i6 = i14;
                }
                if (drawData[i15 + 4] == 0) {
                    drawTexture[drawData[i15]].drawAtPointOption(drawData[i15 + 1] + f6, y + drawData[i15 + 2] + 10.0f, 18);
                } else {
                    drawTexture[drawData[i15]].drawAtPointOptionFlip(drawData[i15 + 1] + f6, y + drawData[i15 + 2] + 10.0f, 18);
                }
                if (drawData[i16] != 1000) {
                    f4 = 1.0f;
                    Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                } else {
                    f4 = 1.0f;
                }
                if (z) {
                    Texture2D.gl.glColor4f(f4, f4, f4, f4);
                }
                i3++;
                i14 = i6;
            }
            if (towerLevelOrder == 1) {
                f3 = f6 - DRAW_SCALE_X_SMALL_DEGREE;
                i4 = 7;
                f3 = f6;
                i4 = 15;
            } else {
                f3 = f6 + 15.0f;
                i4 = 0;
            }
            for (i5 = 0; i5 < towerLevelOrder; i5++) {
                uiUpperImage[12].drawAtPointOption((i5 * i4) + f3, f7, 9);
            }
        }
        i = lastViewDirection == 6 ? 0 : 1;
        if (specialShowCount > 0) {
            specialShowCount--;
            if (heroFlag == 1) {
                i = lastViewDirection == 6 ? 4 : 5;
            }
        }
        int i17 = GameThread.turboFlag * 5;
        if (i17 > 0) {
            i10 = i17;
        }
        if (heroFlag != 1) {
        }
        int i122 = iArr[iArr[1] + i];
        int i132 = iArr[iArr[0] + iArr[i122 + 1 + ((unitStatusCount / i10) % iArr[i122])]];
        i2 = iArr[i132];
        int i142 = i132 + 1;
        float f72 = y + 10.0f;
        st.page.shadowImage[0].drawAtPointOption(f6, f72, 9);
        i3 = 0;
        while (i3 < i2) {
        }
        if (towerLevelOrder == 1) {
        }
        while (i5 < towerLevelOrder) {
        }
    }

    @Override
    public int compareTo(TowerUnit e) {
        return Integer.compare(posY, e.posY);
    }
}
