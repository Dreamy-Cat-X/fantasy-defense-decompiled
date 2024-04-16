package com.sncompany.newtower.Battle;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataAnim;
import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataCharacter;
import com.sncompany.newtower.DataClasses.DataMap;
import com.sncompany.newtower.DataClasses.DataMonster;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.DataClasses.DataUpgradeItem;
import com.sncompany.newtower.DataClasses.DataWave;
import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;
import com.sncompany.newtower.Texture2D;

/* loaded from: D:\decomp\classes.dex */
public class MonsterUnit extends EnemyUnit {
    public static final int MONSTER_DYING_STATUS_COUNT = 10;
    public static final int MONSTER_SPEED_BASE = 3;
    public static final int MONSTER_STATUS_DYING = 1;
    public static final int MONSTER_STATUS_EMPTY = -1;
    public static final int MONSTER_STATUS_NORMAL = 0;
    public static final float SLOW_DATA_MAX_VALUE = 100f;
    public static final float SLOW_MAX_MINUS_RATE = 80f;
    public static final float SLOW_RECOVER_RATE = 1f;
    public int bodySize;
    public boolean bossFlag;
    public int direction;
    public int dotFireCount;
    public int dotFireDamage;
    public int dotHolyCount;
    public int dotHolyDamage;
    public int fromBlockX;
    public int fromBlockY;
    public int lastViewDirection = 2;
    public float slowRate;
    public int stunCount;
    public int targetBlockX;
    public int targetBlockY;
    public int unitDefense;
    public int unitMinSpeed;
    public int unitSpeed = 150;
    public int unitStatus = 0; //1 means dead, -1 means removed
    public int unitStatusCount = 0;

    public static int getMonsterImageOrder(int type) {
        if (type < 100)
            return type % 25;
        return 25 + (type % 5);
    }

    public MonsterUnit(DataStage s, int type, boolean bossFlag) {
        super(s);
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

        int indf = type < 100 ? type % 25 : 25 + (type % 5);
        drawData = DataAnim.enemyDrawData[indf];
        drawTexture = st.page.enemyImages[indf];
    }

    @Override
    public boolean update() {
        if (stunCount > 0)
            stunCount--;
        else
            unitStatusCount++;

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
        if (slowRate > 0)
            slowRate--;

        if (dead())
            return false;

        int espd = unitSpeed;
        if (stunCount > 0)
            espd = 0;
        else if ((slowRate > 0) && (espd = (int) ((espd * (100.0f - slowRate)) / 100.0f)) < unitMinSpeed)
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
        int dWave = Math.min(st.waveManager.current, DataWave.WAVE_MAX_COUNT);
        if (dead() || unit == null)
            return;

        int soundHitType = unit.getSoundHitType();
        if (soundHitType != -1)
            GameThread.playSound(soundHitType);

        damaged(unit.getHitDamage(this), unit);
        if (unit instanceof HeroUnit hero) {
            int itemBuff = hero.getEquipEffect(DataUpgradeItem.EQ_MISC, 0);
            if (itemBuff > 0 && NewTower.getRandom(100) < itemBuff) {
                dotHolyDamage = (unit.getHitDamage(this) * 3) / 100;
                dotHolyCount = DataCharacter.charData[17][8];
            }
            itemBuff = hero.getEquipEffect(DataUpgradeItem.EQ_MISC, 1);
            if (itemBuff > 0 && !bossFlag && NewTower.getRandom(100) < itemBuff) {
                unitHP = 0;
                kill(unit);
            }
            itemBuff = hero.getEquipEffect(DataUpgradeItem.EQ_MISC, 2);
            if (itemBuff > 0 && stunCount <= 0 && NewTower.getRandom(100) < itemBuff) {
                stunCount = DataCharacter.charData[5][8];
                if (bossFlag)
                    stunCount /= 2;
            }
            itemBuff = hero.getEquipEffect(DataUpgradeItem.EQ_MISC, 3);
            if (itemBuff > 0 && NewTower.getRandom(100) < itemBuff) {
                slowRate += DataCharacter.charData[29][8];
                if (slowRate > 80.0f)
                    slowRate = 80.0f;
            }
        } else {
            int oType = unit.oldType();
            switch (unit.effectType) {
                case 0: {
                    int upgradeRate = (DataCharacter.charData[oType][7] * (unit.getUpgradeRate(10) + 100)) / 100;
                    int prob = upgradeRate - ((DataMonster.monsterData[type][6] * (DataWave.monsterWaveData[dWave][bossFlag ? 12 : 4] + 100)) / 100);
                    if (stunCount == 0 && NewTower.getRandom(100) < prob) {
                        stunCount = (DataCharacter.charData[oType][8] * (unit.getUpgradeRate(11) + 100)) / 100;
                        if (bossFlag)
                            stunCount /= 2;
                    }
                    break;
                } case 1:
                    unit.hitUnitSplash(unit.attackType * 3, this);
                    break;
                case 2:
                    int hitDamage = unit.getHitDamage(this);
                    dotHolyDamage = ((hitDamage + ((unit.getUpgradeRate(7) * hitDamage) / 100)) * ((unit.getUpgradeRate(12) + 100) / 100)) / 20;
                    dotHolyCount = (DataCharacter.charData[oType][8] * (unit.getUpgradeRate(13) + 100)) / 100;
                    break;
                case 3:
                    int mRes = (DataMonster.monsterData[type][7] * (DataWave.monsterWaveData[dWave][bossFlag ? 13 : 5] + 100)) / 100;
                    int rawProb = ((DataCharacter.charData[oType][7] * (unit.getUpgradeRate(14) + 100)) / 100) - mRes;
                    mRes = rawProb - mRes;
                    if (NewTower.getRandom(100) < mRes)
                        slowRate += Math.min((DataCharacter.charData[oType][8] * (unit.getUpgradeRate(15) + 100)) / 100f, SLOW_MAX_MINUS_RATE);
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
                if (mon.type != -1 && mon.unitStatus == 0 && !arrow.hitMons.contains(mon)) {
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
        int overWave = 0;
        int cWav = st.waveManager.current;
        boolean overLim = st.mapType == 1 && cWav >= DataWave.WAVE_MAX_COUNT;
        if (overLim) {
            cWav = DataWave.WAVE_MAX_COUNT - 1;
            overWave = (st.waveManager.current - DataWave.WAVE_MAX_COUNT) + 1;
        }
        int slot = bossFlag ? 14 : 6;
        int money = DataWave.monsterWaveData[cWav][slot];
        if (overLim)
            money += overWave * DataWave.monsterWaveData[60][slot];
        if (unit instanceof HeroUnit)
            money += (DataWave.monsterWaveData[cWav][6] * ((HeroUnit) unit).getEquipEffect(DataUpgradeItem.EQ_CHARM, -1)) / 100;
        st.Money += money;
        DataAward.check_money(st.Money);

        int DropMana = overLim ? DataWave.monsterWaveData[60][bossFlag ? 15 : 7] : DataWave.monsterWaveData[cWav][bossFlag ? 15 : 7];
        if (unit instanceof HeroUnit)
            DropMana += (DataWave.monsterWaveData[cWav][7] * ((HeroUnit) unit).getEquipEffect(DataUpgradeItem.EQ_CHARM, -1)) / 100;

        st.Mana += DropMana;
        st.bScore += ((st.waveManager.current * 0.1f) + 1f) * 120f * (bossFlag ? 5 : 1);
        DataAward.check_kill();

        unitStatus = 1;
        unitStatusCount = 0;
        st.addEffectUnit(EffectUnit.EFFECT_TYPE_DIE, posX, posY);
        if (st.selectedTarget == this)
            st.selectedTarget = null;
    }

    public void draw() {
        float x = posX / 50f + 62, y = posY / 50f + 30;
        float size = bodySize / 100.0f;

        int i = lastViewDirection == 2 ? 1 : 0;
        if (direction == 0)
            i += 2;

        int i2 = drawData[drawData[1] + i];
        int i3 = drawData[drawData[0] + drawData[i2 + 1 + ((unitStatusCount / 3) % drawData[i2])]];
        int i4 = drawData[i3];
        int i5 = i3 + 1;
        st.page.shadowImage[0].drawAtPointOption(x, y + 10.0f, 9);
        for (int i6 = 0; i6 < i4; i6++) {
            float a = unitStatus == 1 ? (10 - unitStatusCount) * 0.1f : 1.0f;
            if (unitStatus == 0 && unitStatusCount < 16)
                a = unitStatusCount * 0.0625f;

            int txtr = (i6 * 5) + i5;
            if (drawData[txtr + 3] != 1000)
                a = (a * drawData[txtr + 3]) / 1000.0f;

            if (a != 1.0f) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.gl.glColor4f(a, a, a, a);
            }
            if (drawData[txtr + 4] == 0) {
                if (size == 1)
                    drawTexture[drawData[txtr]].drawAtPointOption(drawData[txtr + 1] + x, drawData[txtr + 2] + y + 10.0f, 18);
                else
                    drawTexture[drawData[txtr]].drawAtPointOptionSize((drawData[txtr + 1] * size) + x, (drawData[txtr + 2] * size) + y + 10.0f, 18, size);
            } else if (size == 1)
                drawTexture[drawData[txtr]].drawAtPointOptionFlip(drawData[txtr + 1] + x, drawData[txtr + 2] + y + 10.0f, 18);
            else
                drawTexture[drawData[txtr]].drawAtPointOptionFlipSize((drawData[txtr + 1] * size) + x, (drawData[txtr + 2] * size) + y + 10.0f, 18, size);
            if (a != 1.0f)
                Texture2D.gl.glColor4f(1, 1, 1, 1);
        }
        if (unitHP > 0 && unitHP < unitMaxHP)
            drawHealthBar(x, (y - DataMonster.monsterData[type][9]) + 10.0f, unitMaxHP, unitHP);
        if (st.selectedTarget == this)
            st.page.targetImage.drawAtPointOption(x, y, 9);

        if (dotHolyCount > 0)
            drawAilment(x, y, 0);
        if (slowRate > 0)
            drawAilment(x, y, 1);
        if (stunCount > 0)
            drawAilment(x, y - DataMonster.monsterData[type][9], 2);
    }

    public void drawAilment(float x, float y, int type) {
        int[] effData = DataAnim.debuffDrawData[type];
        Texture2D[] effTexture = st.page.debuffImages[type];
        int i2 = -15;
        if (type == 2)
            i2 = 20;

        int i3 = effData[effData[1]];
        int i4 = effData[effData[0] + effData[i3 + 1 + (GameThread.gameTimeCount % effData[i3])]];
        int i5 = effData[i4];
        int i6 = i4 + 1;
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = (i7 * 5) + i6;
            if (effData[i8 + 4] == 0)
                effTexture[effData[i8]].drawAtPointOption(effData[i8 + 1] + x, effData[i8 + 2] + y + i2, 18);
            else
                effTexture[effData[i8]].drawAtPointOptionFlip(effData[i8 + 1] + x, effData[i8 + 2] + y + i2, 18);
        }
    }
}
