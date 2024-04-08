package com.sncompany.newtower.Battle;

import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Texture2D;

/* loaded from: D:\decomp\classes.dex */
public class ObjectUnit extends EnemyUnit {
    static final float OBJECT_VANISHING_ALPHA_DEGREE = 0.066f;
    public static final int OBJECT_VANISHING_COUNT = 30;
    public static final int OBJECT_VANISHING_HALF_COUNT = 15;
    public int blockSize;
    public int blockX;
    public int blockY;
    public int destroyEnableFlag;
    public int objectLastVanishTime;
    public int objectSerial;
    public int objectType;
    public int objectVanishCount;
    public int rewardType;
    public int rewardValue;

    @Override
    public boolean update() {
        if (type == -2) {
            if (objectLastVanishTime != gameTimeCount) {
                objectVanishCount++;
                if (objectVanishCount == 30) {
                    type = -1;
                }
                objectLastVanishTime = gameTimeCount;
            }
        }
        return false;
    }

    @Override
    public void hit(int eff, TowerUnit ent) {
        if (dead())
            return;

        int soundHitType = getSoundHitType(ent);
        if (soundHitType != -1)
            playSound(soundHitType);

        unitHP -= ent.unitPower;
        if (unitHP <= 0)
            kill(ent);
        if (ent.effectType == 1)
            ent.hitUnitSplash(0, this);
    }

    @Override
    public void kill(TowerUnit uni) {
        if (rewardType != 0) {
            if (rewardType != 1)
                return;
            DataStage.Mana += rewardValue;
            return;
        }
        DataStage.Money += rewardValue;
        DataAward.check_money(DataStage.Money);

        type = -2;
        DataStage.instance.addEffectUnit(EffectUnit.EFFECT_TYPE_DIE, posX, posY);
        if (DataStage.selectedTarget == this)
            DataStage.selectedTarget = null;
    }

    public void drawObjectUnit(ObjectUnit objectUnit, float f, float f2) {
        int i = objectUnit.objectType;
        if (i == -2) {
            float f3 = objectUnit.objectVanishCount < 15 ? 1.0f : 1.0f - (objectUnit.objectVanishCount * 0.066f);
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f3, f3, f3, f3);
            int i2 = objectUnit.rewardType;
            if (i2 == 0) {
                uiUpperImage[1].drawAtPointOption(f - 1.0f, f2 - (objectUnit.objectVanishCount * 2), 20);
                drawNumberBlock(objectUnit.rewardValue, numberMoneyImage, f + 1.0f, (f2 - (objectUnit.objectVanishCount * 2)) + 2.0f, 1, 18, 1);
            } else if (i2 == 1) {
                uiUpperImage[0].drawAtPointOption(f - 1.0f, (f2 - (objectUnit.objectVanishCount * 2)) + 1.0f, 20);
                drawNumberBlock(objectUnit.rewardValue, numberManaImage, f + 1.0f, (f2 - (objectUnit.objectVanishCount * 2)) + 2.0f, 1, 18, 1);
            }
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            return;
        }
        int i3 = 34;
        int i4 = 22;
        switch (i) {
            case 28:
                i3 = 0;
                i4 = 3;
                break;
            case 29:
                i3 = 22;
                break;
            case 30:
                i3 = -25;
                i4 = 3;
                break;
            case 31:
                i4 = 18;
                break;
            case 32:
                i3 = 22;
                i4 = -22;
                break;
            case 33:
                i4 = -11;
                break;
            default:
                i3 = 0;
                i4 = 0;
                break;
        }
        if (i != 28 && i != 29 && i != 32 && objectUnit.destroyEnableFlag == 0) {
            int i5 = objectUnit.blockSize;
            if (i5 == 0 || i5 == 1) {
                shadowImage[0].drawAtPointOption(f, 27.0f + f2, 33);
            } else if (i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) {
                shadowImage[1].drawAtPointOption(f, f2 + 27.0f, 33);
            }
        }
        float f4 = i4 + f;
        float f5 = f2 + 22.0f + i3;
        backObjectImage[i].drawAtPointOption(f4, f5, 33);
        if (GameThread.commonTargetType == 1 && GameThread.commonTargetNumber == objectUnit.objectSerial) {
            targetImage.drawAtPointOption(f, f2, 9);
            int i6 = objectUnit.blockSize;
            int i7 = i6 != 0 ? (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5) ? -67 : -45 : -22;
            if (objectUnit.unitMaxHP > 0) {
                drawLifeBar(f, f2 + i7, objectUnit.unitMaxHP, objectUnit.unitHP);
            }
        }
        if (GameThread.monsterOpenTime > 0) {
            if (i == 28) {
                int i8 = (GameThread.monsterOpenTime / 2) % 2;
                if (i8 == 0) {
                    gatefireImage[8].drawAtPointOption(f4 - 43.0f, f5 - 83.0f, 18);
                } else if (i8 == 1) {
                    gatefireImage[9].drawAtPointOption(f4 - 47.0f, f5 - 87.0f, 18);
                }
            } else if (i == 29) {
                int i9 = (GameThread.monsterOpenTime / 2) % 2;
                if (i9 == 0) {
                    gatefireImage[4].drawAtPointOption(f4 - 35.0f, f5 - 98.0f, 18);
                } else if (i9 == 1) {
                    gatefireImage[5].drawAtPointOption(f4 - 40.0f, f5 - 103.0f, 18);
                }
            } else if (i == 32) {
                int i10 = (GameThread.monsterOpenTime / 2) % 2;
                if (i10 == 0) {
                    gatefireImage[6].drawAtPointOption(7.0f + f4, f5 - 98.0f, 18);
                } else if (i10 == 1) {
                    gatefireImage[7].drawAtPointOption(f4 + 2.0f, f5 - 103.0f, 18);
                }
            }
        }
        if (i == 30) {
            int i11 = GameThread.gameTimeCount % 4;
            if (i11 == 0) {
                float f6 = f5 - 40.0f;
                gatefireImage[0].drawAtPointOption(f4 - 51.0f, f6, 18);
                gatefireImage[0].drawAtPointOption(f4 + 30.0f, f6, 18);
                return;
            }
            if (i11 == 1) {
                float f7 = f5 - 42.0f;
                gatefireImage[1].drawAtPointOption(f4 - 52.0f, f7, 18);
                gatefireImage[1].drawAtPointOption(f4 + 29.0f, f7, 18);
                return;
            } else if (i11 == 2) {
                float f8 = f5 - 40.0f;
                gatefireImage[2].drawAtPointOption(f4 - 53.0f, f8, 18);
                gatefireImage[2].drawAtPointOption(f4 + 28.0f, f8, 18);
                return;
            } else {
                if (i11 != 3) {
                    return;
                }
                float f9 = f5 - 39.0f;
                gatefireImage[3].drawAtPointOption(f4 - 52.0f, f9, 18);
                gatefireImage[3].drawAtPointOption(f4 + 29.0f, f9, 18);
                return;
            }
        }
        if (i == 31) {
            int i12 = GameThread.gameTimeCount % 4;
            if (i12 == 0) {
                gatefireImage[0].drawAtPointOption(f4 - 20.0f, f5 - 45.0f, 18);
                gatefireImage[0].drawAtPointOption(f4 - 33.0f, f5 - 128.0f, 18);
                return;
            }
            if (i12 == 1) {
                gatefireImage[1].drawAtPointOption(f4 - 21.0f, f5 - 47.0f, 18);
                gatefireImage[1].drawAtPointOption(f4 - 34.0f, f5 - 130.0f, 18);
                return;
            } else if (i12 == 2) {
                gatefireImage[2].drawAtPointOption(f4 - 22.0f, f5 - 45.0f, 18);
                gatefireImage[2].drawAtPointOption(f4 - 35.0f, f5 - 128.0f, 18);
                return;
            } else {
                if (i12 != 3) {
                    return;
                }
                gatefireImage[3].drawAtPointOption(f4 - 21.0f, f5 - 44.0f, 18);
                gatefireImage[3].drawAtPointOption(f4 - 34.0f, f5 - 127.0f, 18);
                return;
            }
        }
        if (i != 33) {
            return;
        }
        int i13 = GameThread.gameTimeCount % 4;
        if (i13 == 0) {
            gatefireImage[0].drawAtPointOption(f4 + 2.0f, f5 - 45.0f, 18);
            gatefireImage[0].drawAtPointOption(f4 + 15.0f, f5 - 128.0f, 18);
            return;
        }
        if (i13 == 1) {
            gatefireImage[1].drawAtPointOption(f4 + 1.0f, f5 - 47.0f, 18);
            gatefireImage[1].drawAtPointOption(f4 + 14.0f, f5 - 130.0f, 18);
        } else if (i13 == 2) {
            gatefireImage[2].drawAtPointOption(f4, f5 - 45.0f, 18);
            gatefireImage[2].drawAtPointOption(f4 + DRAW_SCALE_X_SMALL_DEGREE, f5 - 128.0f, 18);
        } else {
            if (i13 != 3) {
                return;
            }
            gatefireImage[3].drawAtPointOption(f4 + 1.0f, f5 - 44.0f, 18);
            gatefireImage[3].drawAtPointOption(f4 + 14.0f, f5 - 127.0f, 18);
        }
    }
}
