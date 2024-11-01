package com.sncompany.newtower.Battle;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataUpgradeUnit;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Pages.stage.StagePage;
import com.sncompany.newtower.Pages.stage.StageBase;
import com.sncompany.newtower.Texture2D;

import java.util.ArrayList;

/* loaded from: D:\decomp\classes.dex */
public class TowerUnit extends StageEntity implements Comparable<TowerUnit> {
    public static final int DUST_FAN_ATTACK_ROTATE_RATE = 15;
    public static final int DUST_FAN_BODY_EFFECT_ROTATE_RATE = 20;
    public static final int DUST_FAN_STAND_ROTATE_RATE = 2;
    public static final int LAVA_CATAPULT_BODY_UP_POSITION = -29;

    public static final int TOWER_ATTACK_FIRE_FRAME = 6;
    public static final int TOWER_ATTACK_FRAME_PER_SHOT = 3;
    static final float TOWER_ATTACK_SWORD_MOVE_DEGREE = 0.5f;
    public static final int TOWER_ATTACK_TOTAL_FRAME = 15;
    public static final int TOWER_SPECIAL_SHOW_COUNT = 4;
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
    public int lastViewDirection = 6;//2 and 6 are all it ever gets written to it
    public final int originalPosX;
    public final int originalPosY;
    public int posX;
    public int posY;
    public int targetMaxNum;
    public int towerCoolTime = 0;
    public int towerCoolTimeMax;
    public int level = 0;
    public int unitPower;

    public static final byte STATUS_STAND = 0;
    public static final byte STATUS_ATTACK = 1;
    public static final byte STATUS_LOCKED = 2;
    public byte unitStatus = STATUS_LOCKED;
    public int unitStatusCount = 0;
    public static final int LOCK_MAX_COUNT = 3;
    public ArrayList<EnemyUnit> lockedEnemies = new ArrayList<>(LOCK_MAX_COUNT);
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

        restatTowerUnit(true);
    }

    public TowerUnit(TowerUnit twr, int tType, int lvl) { //Used exclusively for comparison upgrades
        st = twr.st;
        type = tType;
        level = lvl;
        blockX = twr.blockX;
        blockY = twr.blockY;
        originalPosX = twr.originalPosX;
        originalPosY = twr.originalPosY;

        restatTowerUnit(true);
    }

    public void restatTowerUnit(boolean classChange) {
        int[] lev = DataCharacter.charLvlData[type][level];
        towerCoolTimeMax = Math.max(0, lev[DataCharacter.ATKRATE] - ((lev[DataCharacter.ATKRATE] * getUpgradeRate(8)) / 100));
        unitPower = lev[DataCharacter.ATK];
        attackRange = lev[DataCharacter.RANGE] + ((lev[DataCharacter.RANGE] * getUpgradeRate(9)) / 100);
        attackDistance = (((attackRange * 45) / 100) + 22) * 50;
        if (classChange) {
            towerCoolTime = 0;
            drawData = DataAnim.towerDrawData[type];
            drawTexture = st.page.towerImages[type];

            int[] dat = DataCharacter.charData[type];
            targetMaxNum = dat[DataCharacter.TARGET];
            attackType = dat[DataCharacter.ATK_TYPE];
            effectType = dat[DataCharacter.EFFECT];
            attackEffect = dat[DataCharacter.ATK_EFFECT];
            if (targetMaxNum >= 2 && effectType == DataCharacter.EFF_NONE)
                effectType = DataCharacter.EFF_MULTISHOT;
        }
    }

    public int atkDistanceSquare() {
        return attackDistance * attackDistance;
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
                tot += Config.s.unitUpgrades[role][g % 6] * DataUpgradeUnit.upgradeUnitData[g][0];
        return tot;
    }

    public int getUpgradeType() {
        int tier = getTier();
        if (tier == 0)
            return type + 2;
        else if (tier == 2)
            return type + 1;
        return -1;
    }

    public int getDowngradeType() {
        int tier = getTier();
        if (tier == 2)
            return type - 2;
        else if (tier == 3)
            return type - 1;
        return -1;
    }

    public static int getBuyPrice(int type) {
        if (type == -1)
            return 0;
        int role = type / 4;
        int c = DataCharacter.charLvlData[type][0][DataCharacter.COST];
        return c + ((c * Config.s.unitUpgrades[role][0] * DataUpgradeUnit.upgradeUnitData[role * 6][0]) / 100);
    }

    public int getSellPrice() {
        int pri = 0;
        for (int i = level; i >= 0; i--)
            pri += DataCharacter.charLvlData[type][i][DataCharacter.COST];
        if (getTier() >= 2) {
            if (getTier() == 3)
                pri += DataCharacter.charLvlData[type][2][DataCharacter.UPGRADE_COST];
            pri += DataCharacter.charLvlData[type][0][DataCharacter.UPGRADE_COST];
            pri += DataCharacter.charLvlData[type][0][DataCharacter.COST];
        }
        return pri / 2;
    }

    public void levelUpUnit() {
        if (level == 2)
            return;
        st.money -= getLevelupPrice();
        level++;

        if (level == 2 && (getTier() == 1 || getTier() == 3))
            Config.s.awardValues[(getTier() == 1 ? DataAward.AWARD_Thrill_Of_The_Hammer : DataAward.AWARD_Guardian_Of_War) + getRole()] = true;
        restatTowerUnit(false);
        st.addEffectUnit(14, posX, posY);
        GameThread.playSound(13);
        ((StagePage)st.page).levelUpCount = 10;
    }

    public int getLevelupPrice() {
        return DataCharacter.charLvlData[type][level + 1][DataCharacter.COST];
    }

    public void upgradeUnit() {
        st.money -= getUpgradePrice();
        level = 0;
        type = getUpgradeType();
        restatTowerUnit(true);
        st.addEffectUnit(14, posX, posY);
        GameThread.playSound(13);
        ((StagePage)st.page).upgradeCount = 10;
    }

    public int getUpgradePrice() {
        return DataCharacter.charLvlData[type][level][DataCharacter.UPGRADE_COST];
    }

    public void update() {
        unitStatusCount++;
        if (towerCoolTime > 0)
            towerCoolTime--;

        int oStatus = unitStatus;
        if (unitStatus == STATUS_ATTACK) {
            EnemyUnit e = lockedEnemies.get(0);
            if (unitStatusCount <= TOWER_ATTACK_FIRE_FRAME && attackType == DataCharacter.ATK_SWORD) {
                posX = (int) (originalPosX + ((((e.posX - posX) * unitStatusCount) / 6) * TOWER_ATTACK_SWORD_MOVE_DEGREE));
                posY = (int) (originalPosY + ((((e.posY - posY) * unitStatusCount) / 6) * TOWER_ATTACK_SWORD_MOVE_DEGREE));
            }
            headRotateDegree = getRotateDegree(e.posX - posX, e.posY - posY);
            if (posX < e.posX) {
                lastViewDirection = 2;
            } else if (posX > e.posX)
                lastViewDirection = 6;

            if (unitStatusCount == TOWER_ATTACK_FIRE_FRAME) {
                boolean attack = false;
                for (int j = 0; j < lockedEnemies.size(); j++)
                    if (!lockedEnemies.get(j).dead()) {
                        attack = true;
                        break;
                    }
                if (attack) {
                    attackCount++;
                    towerCoolTime = towerCoolTimeMax;
                    if (attackType == DataCharacter.ATK_SWORD) {
                        int soundHitType = getSoundHitType();
                        if (soundHitType != -1)
                            GameThread.playSound(soundHitType);

                        for (int i9 = 0; i9 < Math.min(targetMaxNum, lockedEnemies.size()); i9++) {
                            EnemyUnit locked = lockedEnemies.get(i9);
                            st.addEffectUnit(attackEffect, locked.posX, locked.posY);
                            locked.hit(0, this);
                        }
                    } else if (attackType == DataCharacter.ATK_ARROW)
                        for (int j = 0; j < Math.min(targetMaxNum, lockedEnemies.size()); j++)
                            addArrowUnit(attackEffect, j);
                } else {
                    unitStatus = STATUS_STAND;
                    unitStatusCount = 0;
                    towerCoolTime = 0;
                    posX = originalPosX;
                    posY = originalPosY;
                }
            }
            if (unitStatusCount == TOWER_ATTACK_TOTAL_FRAME) {
                unitStatus = STATUS_STAND;
                unitStatusCount = 0;
                towerCoolTime = towerCoolTimeMax;
                posX = originalPosX;
                posY = originalPosY;
            }
        }
        if (oStatus == STATUS_STAND && towerCoolTime == 0) {
            getCloseEnemyUnitInRange();
            if (!lockedEnemies.isEmpty()) {
                unitStatus = STATUS_ATTACK;
                unitStatusCount = 0;
            }
            int voice;
            if (unitStatus == STATUS_ATTACK && (voice = getVoice()) != -1)
                GameThread.playSound(voice);
        }
    }

    public int getSoundHitType() {
        switch (type) {
            case 0: case 2: case 3: return 1; //Warrior, Knight, Warlord
            case 1: return 2; //Brandisher
            case 4: case 6: case 7: return 3; //Archer, Sharpshooter, Sky Arrow
            case 5: return 4; //Holy Eye
            case 8: return 5; //Mage
            case 9: return 7; //IceMage
            case 10: case 11: return 6; //Sorceress, Blaster
            default: return -1;
        }
    }

    protected int getVoice() {
        switch (type) {
            case 0: case 2: return 21;//Warrior,Knight
            case 1: return 23;//Brandisher
            case 3: return 22;//Warlord
            case 4: case 6: return 24;//Archer, Sharpshooter
            case 5: return 26;//Holy Eye
            case 7: return 25;//Sky Arrow
            case 8: return 27;//Mage
            case 9: return 29;//IceMage
            case 10: case 11: return 28;//Sorceress, Blaster
            default: return -1;
        }
    }

    void addArrowUnit(int type, int tInd) {
        ArrowUnit arrow = new ArrowUnit(st, this, lockedEnemies.get(tInd), type);
        st.arrowUnit.add(arrow);
    }

    public static float getRotateDegree(float x, float y) {
        double d;
        double degrees;
        double degrees2;
        if (x == 0)
            return y < 0 ? 0 : 180;
        if (y == 0)
            return x < 0 ? 270 : 90;
        float abs = Math.abs(y) / Math.abs(x);
        if (x < 0) {
            d = 270;
            if (y < 0) {
                degrees = Math.toDegrees(Math.atan(abs));
            } else {
                degrees2 = Math.toDegrees(Math.atan(abs));
                degrees = -degrees2;
            }
        } else {
            d = 90.0d;
            if (y < 0) {
                degrees2 = Math.toDegrees(Math.atan(abs));
                degrees = -degrees2;
            } else
                degrees = Math.toDegrees(Math.atan(abs));
        }
        return (float) (degrees + d);
    }

    public void getCloseEnemyUnitInRange() {
        lockedEnemies.clear();

        EnemyUnit targ = st.selectedTarget;
        if (targ != null && !(Math.abs(posX - targ.posX) + Math.abs(posY - targ.posY) > attackDistance * 2) &&
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
        if (unitStatus == STATUS_ATTACK) {
            dire = lastViewDirection == 6 ? 2 : 3;
            sprSpd = 3;
        } else if (unitStatus != STATUS_LOCKED)
            dire = 0;

        if (st.turbo > 0)
            sprSpd /= st.turbo;

        int sCount = drawData[drawData[1] + dire];
        int sCur = drawData[drawData[0] + drawData[sCount + 1 + ((unitStatusCount / sprSpd) % drawData[sCount])]];
        st.page.shadowImage[0].drawAtPointOption(x, y + 10, 9);
        for (int i = 0; i < drawData[sCur]; i++) {
            int coords = (i * 5) + (sCur + 1);
            int nexc = coords + 3;
            if (drawData[nexc] != 1000) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448);
                Texture2D.setColors(drawData[nexc] / 1000f);
            }
            if (drawData[coords + 4] == 0)
                drawTexture[drawData[coords]].drawAtPointOption(drawData[coords + 1] + x, y + drawData[coords + 2] + 10f, 18);
            else
                drawTexture[drawData[coords]].drawAtPointOptionFlip(drawData[coords + 1] + x, y + drawData[coords + 2] + 10f, 18);

            if (drawData[nexc] != 1000)
                Texture2D.setColors(1);
        }
        float starX = x - (7.5f * (level));
        for (int i5 = 0; i5 < level + 1; i5++)
            st.page.uiUpperImage[StageBase.upper_star].drawAtPointOption((i5 * 15) + starX, y + 10, 9);
    }

    public void drawUnitRangeCircle() {
        int circle = Math.min((attackRange - 1) / 100, 3);
        st.page.whiteCircleImage[circle].drawAtPointOptionSize((originalPosX / 50f) + 62, (originalPosY / 50f) + 30, 9, (attackRange * 0.9f) / ((circle + 1) * 100));
    }

    @Override
    public int compareTo(TowerUnit e) {
        return Integer.compare(posY, e.posY);
    }
}
