package com.sncompany.newtower.Battle;

import com.sncompany.newtower.DataClasses.DataAward;
import com.sncompany.newtower.DataClasses.DataObject;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Texture2D;

/* loaded from: D:\decomp\classes.dex */
public class ObjectUnit extends EnemyUnit {
    static final float OBJECT_VANISHING_ALPHA_DEGREE = 0.066f;
    public static final int OBJECT_VANISHING_COUNT = 30;
    public static final int OBJECT_VANISHING_HALF_COUNT = 15;
    public final int blockSize;
    public final int blockX;
    public final int blockY;
    public int destroyEnableFlag;
    public int objectLastVanishTime;
    public int objectSerial;
    public int objectType;
    public int objectVanishCount;
    public int rewardType;
    public int rewardValue;
    public DataStage st;

    public ObjectUnit(int oType, int bX, int bY) {
        for (int ODataI = 0; ODataI < 34; ODataI++)
            if (oType == DataObject.objectData[ODataI][0]) {
                type = ODataI;
                break;
            }
        objectVanishCount = 0;
        destroyEnableFlag = DataObject.objectData[type][1];
        unitHP = unitMaxHP = DataObject.objectData[type][2];
        rewardType = DataObject.objectData[type][3];
        rewardValue = DataObject.objectData[type][4];
        blockSize = DataObject.objectData[type][5];
        blockX = bX;
        blockY = bY;
        posX = 0;
        posY = 0;
        switch (blockSize) {
            case 0, 3, 4, 5:
                posX = ((bX * 45) + 22) * 50;
                posY = ((bY * 45) + 22) * 50;
                break;
            case 1:
                posX = ((bX * 45) + 22) * 50;
                posY = (((bY + 1) * 45) + 22) * 50;
                break;
            case 2:
                posX = (bX + 1) * 45 * 50;
                posY = (((bY + 1) * 45) + 22) * 50;
                break;
        }
    }

    @Override
    public boolean update() {
        if (type == -2) {
            if (objectLastVanishTime != GameThread.gameTimeCount) {
                objectVanishCount++;
                if (objectVanishCount == OBJECT_VANISHING_COUNT)
                    type = -1;

                objectLastVanishTime = GameThread.gameTimeCount;
            }
        }
        return false;
    }

    @Override
    public void hit(int eff, TowerUnit ent) {
        if (dead())
            return;

        int soundHitType = ent.getSoundHitType();
        if (soundHitType != -1)
            GameThread.playSound(soundHitType);

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
            st.Mana += rewardValue;
            return;
        }
        st.Money += rewardValue;
        DataAward.check_money(st.Money);

        type = -2;
        st.addEffectUnit(EffectUnit.EFFECT_TYPE_DIE, posX, posY);
        if (st.selectedTarget == this)
            st.selectedTarget = null;
    }

    public void draw() {
        float x = posX / 50f + 62, y = posY / 50f + 30;

        if (type == -2) {
            float f3 = objectVanishCount < 15 ? 1.0f : 1.0f - (objectVanishCount * 0.066f);
            Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
            Texture2D.gl.glColor4f(f3, f3, f3, f3);
            int i2 = rewardType;
            if (i2 == 0) {
                uiUpperImage[1].drawAtPointOption(x - 1.0f, y - (objectVanishCount * 2), 20);
                drawNumberBlock(rewardValue, numberMoneyImage, x + 1.0f, (y - (objectVanishCount * 2)) + 2.0f, 1, 18, 1);
            } else if (i2 == 1) {
                uiUpperImage[0].drawAtPointOption(x - 1.0f, (y - (objectVanishCount * 2)) + 1.0f, 20);
                drawNumberBlock(rewardValue, numberManaImage, x + 1.0f, (y - (objectVanishCount * 2)) + 2.0f, 1, 18, 1);
            }
            Texture2D.gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            return;
        }
        int i3 = 34;
        int i4 = 22;
        switch (type) {
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
        if (type != 28 && type != 29 && type != 32 && destroyEnableFlag == 0) {
            int i5 = blockSize;
            if (i5 == 0 || i5 == 1) {
                shadowImage[0].drawAtPointOption(x, 27.0f + y, 33);
            } else if (i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) {
                shadowImage[1].drawAtPointOption(x, y + 27.0f, 33);
            }
        }
        float f4 = i4 + x;
        float f5 = y + 22.0f + i3;
        backObjectImage[type].drawAtPointOption(f4, f5, 33);
        if (GameThread.commonTargetType == 1 && GameThread.commonTargetNumber == objectSerial) {
            st.page.targetImage.drawAtPointOption(x, y, 9);
            int i6 = blockSize;
            int i7 = i6 != 0 ? (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5) ? -67 : -45 : -22;
            if (unitMaxHP > 0) {
                drawHealthBar(x, y + i7, unitMaxHP, unitHP);
            }
        }
        if (st.waveManager.monsterOpenTime > 0) {
            if (type == 28) {
                int i8 = (st.waveManager.monsterOpenTime / 2) % 2;
                if (i8 == 0) {
                    gatefireImage[8].drawAtPointOption(f4 - 43.0f, f5 - 83.0f, 18);
                } else if (i8 == 1) {
                    gatefireImage[9].drawAtPointOption(f4 - 47.0f, f5 - 87.0f, 18);
                }
            } else if (type == 29) {
                int i9 = (st.waveManager.monsterOpenTime / 2) % 2;
                if (i9 == 0) {
                    gatefireImage[4].drawAtPointOption(f4 - 35.0f, f5 - 98.0f, 18);
                } else if (i9 == 1) {
                    gatefireImage[5].drawAtPointOption(f4 - 40.0f, f5 - 103.0f, 18);
                }
            } else if (type == 32) {
                int i10 = (st.waveManager.monsterOpenTime / 2) % 2;
                if (i10 == 0) {
                    gatefireImage[6].drawAtPointOption(7.0f + f4, f5 - 98.0f, 18);
                } else if (i10 == 1) {
                    gatefireImage[7].drawAtPointOption(f4 + 2.0f, f5 - 103.0f, 18);
                }
            }
        }
        if (type == 30) {
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
        if (type == 31) {
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
        if (type != 33) {
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
