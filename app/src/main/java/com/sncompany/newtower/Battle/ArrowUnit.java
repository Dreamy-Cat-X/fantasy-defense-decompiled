package com.sncompany.newtower.Battle;

import com.sncompany.newtower.Config;
import com.sncompany.newtower.DataClasses.DataStage;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.Pages.stage.StagePage;
import com.sncompany.newtower.Texture2D;
import com.sncompany.newtower.core.CoreStatic;

import java.util.LinkedList;

/* loaded from: D:\decomp\classes.dex */
public class ArrowUnit extends StageEntity {
    public static final int ARROW_MISSILE_MOVE_SPEED = 15;
    public static final int ARROW_MOVE_FULL_TIME = 5;
    public static final int ARROW_MOVE_START_TIME = 1;
    public static final int ARROW_TARGET_DIRECTION = 2;
    public static final int ARROW_TARGET_MONSTER = 0;
    public static final int ARROW_TARGET_OBJECT = 3;
    public static final int ARROW_TARGET_POSITION = 1;
    public static final int ARROW_TYPE_NONE = -1;
    public static final int DUST_FAN_MOVE_UP_RATE = 1;
    public static final int FIERCE_RANGE_CHECK_DISTANCE = 22;
    public static final int FIERCE_RANGE_MAX_DISTANCE = 225;
    public static final int MOVE_HISTORY_MAX = 5;
    public static final int SPECIAL_ARROW_BLOCK_HALF_WIDTH = 113;
    public static final int SPECIAL_ARROW_BLOCK_SIZE = 225;
    public static final int SPECIAL_ARROW_BLOCK_START = -112;
    public static final int SPECIAL_ARROW_SPEED = 140;
    public static final int SPECIAL_BLADE_1_SPEED = 100;
    public static final int SPECIAL_BLADE_2_SPEED = 75;
    public static final int SPECIAL_BLADE_3_SPEED = 55;
    public static final int SPECIAL_BLADE_4_SPEED = 35;
    public static final int SPECIAL_ICE_SPEED = 70;
    public static final int SPLASH_RANGE_DEGREE_0_RATE = 3;
    public static final int SPLASH_RANGE_DEGREE_25_RATE = 2;
    public static final int SPLASH_RANGE_DEGREE_50_RATE = 1;
    public static final int SPLASH_RANGE_DEGREE_75_RATE = 0;
    public static final int SPLASH_RANGE_MAX_DISTANCE = 4556;
    public int endX;
    public int endY;
    public int moveCount = 1;
    public int moveMaxCount = 5;
    public float moveRotateDegree;
    public int moveSpeed;

    public int startX;
    public int startY;

    public final TowerUnit shooter;
    public final EnemyUnit target;
    private final DataStage st;

    public static final int[] SPLASH_RANGE_DEGREE_DISTANCE = {6074, 2278, 1139, 0};
    public static final int[] ARROW_MOVE_UP_HEIGHT = {0, -20, -45, -45, -20};
    public final int[][] moveHistory = new int[5][2];
    public LinkedList<MonsterUnit> hitMons = new LinkedList<>();

    /**
     * Special Arrow constructor
     * @param tType arrow type
     * @param hero user of the special skill
     */
    public ArrowUnit(int tType, HeroUnit hero, int eX, int eY, int moveNum) {
        st = hero.st;
        type = tType;
        shooter = hero;
        target = null;
        startX = endX = eX;
        startY = endY = eY;
        moveCount = moveNum;
        
        if (type >= 19) {
            if (type <= 32) {
                moveSpeed = 3500;
                moveRotateDegree = CoreStatic.getRandom(360);
            } else {
                moveSpeed = 7000;
                moveRotateDegree = 165 + ((type - 32) * 15);
            }
            float yRot = Math.abs(((float) Math.cos(Math.toRadians(moveRotateDegree))) * moveSpeed);
            float xRot = Math.abs(((float) Math.sin(Math.toRadians(moveRotateDegree))) * moveSpeed);
            if (moveRotateDegree >= 0.0f && moveRotateDegree < 180.0f) {
                startX = (int) (startX + (xRot * moveNum));
            } else
                startX = (int) (startX - (xRot * moveNum));
            if ((moveRotateDegree >= 0.0f && moveRotateDegree < 90.0f) || (moveRotateDegree >= 270.0f && moveRotateDegree < 360.0f)) {
                startY = (int) (startY - (yRot * moveNum));
            } else
                startY = (int) (startY + (yRot * moveNum));
        } else if (type >= 15) {
            moveSpeed = 1750 + ((18 - type) * 1000);
            if (type == 15)
                moveSpeed += 250;
            startX -= moveNum * moveSpeed;
        }

        StagePage stp = (StagePage)st.page;
        if (type <= 18)
            drawTexture = stp.specialSwordImage;
        else if (type <= 32)
            drawTexture = stp.specialIceImage;
        else
            drawTexture = stp.specialArrowImage;
    }

    public ArrowUnit(DataStage sta, TowerUnit shtr, EnemyUnit targ, int tType) {
        st = sta;
        type = tType;
        shooter = shtr;
        target = targ;

        startX = shtr.posX;
        startY = shtr.posY;

        if (shtr.type == 0) {
            moveSpeed = 750;
            for (int h = 0; h < 5; h++) {
                moveHistory[h][0] = startX;
                moveHistory[h][1] = startY;
            }
        }

        StagePage stp = (StagePage)st.page;
        switch (type) {
            case 0:
                drawTexture = stp.arrowImage4;
                break;
            case 2:
                drawTexture = stp.arrowImage2;
                break;
            case 3:
                drawTexture = stp.arrowImage3;
                break;
            case 5:
                drawTexture = stp.arrowImage1;
                break;
            case 12:
                drawTexture = stp.arrowImage9;
                break;
            default: //This also includes case 10
                drawTexture = stp.arrowImage0;
        }
    }

    public void updateArrowUnit() {
        if (type == -1)
            return;

        if (type == 0) {
            for (int i5 = 4; i5 > 0; i5--) {
                int i6 = i5 - 1;
                moveHistory[i5][0] = moveHistory[i6][0];
                moveHistory[i5][1] = moveHistory[i6][1];
            }
            moveHistory[0][0] = startX;
            moveHistory[0][1] = startY;

            if (Math.abs(target.posX - startX) <= moveSpeed && Math.abs(target.posY - startY) <= moveSpeed) {
                st.addEffectUnit(shooter.attackEffect, target.posX, target.posY);
                target.hit(3, shooter);
                if (target instanceof MonsterUnit)
                    hitMons.add((MonsterUnit) target);
                type = -1;
            } else {
                double rotateDegree = TowerUnit.getRotateDegree(target.posX - startX, target.posY - startY);
                float abs = Math.abs(((float) Math.cos(Math.toRadians(rotateDegree))) * moveSpeed);
                float abs2 = Math.abs(((float) Math.sin(Math.toRadians(rotateDegree))) * moveSpeed);

                if (target.posX < startX)
                    startX = (int) (startX - abs2);
                else
                    startX = (int) (startX + abs2);
                if (target.posY < startY)
                    startY = (int) (startY - abs);
                else
                    startY = (int) (startY + abs);
            }
        } else if (type >= 19 && type <= 32) {
            if (moveCount <= 0 || moveCount >= 1000) {
                moveCount++;
                float abs3 = Math.abs(((float) Math.cos(Math.toRadians(moveRotateDegree))) * moveSpeed);
                float abs4 = Math.abs(((float) Math.sin(Math.toRadians(moveRotateDegree))) * moveSpeed);
                if (moveRotateDegree >= 0.0f && moveRotateDegree < 180.0f)
                    startX = (int) (startX + abs4);
                else
                    startX = (int) (startX - abs4);
                if ((moveRotateDegree >= 0.0f && moveRotateDegree < 90.0f) || (moveRotateDegree >= 270.0f && moveRotateDegree < 360.0f))
                    startY = (int) (startY - abs3);
                else
                    startY = (int) (startY + abs3);
            }
        } else {
            switch (type) {
                case 15: case 16: case 17:
                    startX -= moveSpeed;
                    break;
                case 18:
                    startX -= moveSpeed;
                    for (MonsterUnit mon : st.monsterUnit) {
                        if (!mon.dead() && Math.abs(mon.posX - startX) <= moveSpeed && Math.abs(mon.posY - startY) <= moveSpeed && !hitMons.contains(mon)) {
                            st.addEffectUnit(EffectUnit.EFFECT_TYPE_BLADE1, mon.posX, mon.posY);
                            GameThread.playSound(30);
                            hitMons.add(mon);
                        }
                    }
                    break;
                case 33:
                case 34:
                case 35:
                    moveCount++;
                    if (moveCount <= 0) {
                        float abs5 = Math.abs(((float) Math.cos(Math.toRadians(moveRotateDegree))) * moveSpeed);
                        float abs6 = Math.abs(((float) Math.sin(Math.toRadians(moveRotateDegree))) * moveSpeed);
                        if (moveRotateDegree >= 0.0f && moveRotateDegree < 180.0f)
                            startX = (int) (startX + abs6);
                        else
                            startX = (int) (startX - abs6);
                        if ((moveRotateDegree >= 0.0f && moveRotateDegree < 90.0f) || (moveRotateDegree >= 270.0f && moveRotateDegree < 360.0f))
                            startY = (int) (startY - abs5);
                        else
                            startY = (int) (startY + abs5);
                    }
                    if (moveCount == 0)
                        st.addEffectUnit(EffectUnit.EFFECT_TYPE_ARROWRAIN_LEFT, startX, startY);
                    break;
                default:
                    moveCount++;
                    if (moveCount >= moveMaxCount) {
                        if (shooter instanceof HeroUnit && (shooter.type == 2) && Config.rewardValues[6])
                            st.addEffectUnit(EffectUnit.EFFECT_TYPE_FIREBALL2, target.posX, target.posY);
                        else
                            st.addEffectUnit(shooter.attackEffect, target.posX, target.posY);
                        target.hit(3, shooter);
                        if (target instanceof MonsterUnit) {
                            MonsterUnit mon = (MonsterUnit)target;
                            hitMons.add(mon);
                            if (shooter.effectType == 4)
                                mon.hitUnitFierce(this, shooter);
                        }
                        type = -1;
                    }
                    break;
            }
        }
    }

    public void drawArrowUnit() {
        if (target != null) {
            float tX = target.posX;
            int tY = target.posY;
            switch (type) {
                case 0:
                    for (int i = 4; i >= 0; i--)
                        if (i + 1 < drawTexture.length)
                            drawTexture[i + 1].drawAtPointOption((moveHistory[i][0] / 50) + 62, (float) (((moveHistory[i][1] / 50) + 30) - 15), 9);
                    drawTexture[0].drawAtPointOption((startX / 50) + 62, (float) (((startY / 50) + 30) - 15), 9);
                    break;
                case 5:
                    drawTexture[0].drawLineWithImage((shooter.posX / 50) + 62, (float) (((shooter.posY / 50) + 30) - 15), (tX - shooter.posX) / 50f, ((float) tY - shooter.posY) / 50f, (moveCount * 1f) / moveMaxCount);
                    drawTexture[1].drawArrowWithImage((shooter.posX / 50) + 62, (float) (((shooter.posY / 50) + 30) - 15), (tX - shooter.posX) / 50f, ((float) tY - shooter.posY) / 50f, (moveCount * 1f) / moveMaxCount);
                case 2: case 3: case 12:
                    drawTexture[3].drawAtPointOption((startX / 50) + 62, (float) (((startY / 50) + 30) - 15), 9);
                    break;
                default:
                    drawTexture[0].drawLineWithImage((shooter.posX / 50) + 62, (float) (((shooter.posY / 50) + 30) - 15), (tX - shooter.posX) / 50f, ((float) tY - shooter.posY) / 50f, (moveCount * 1f) / moveMaxCount);
                    break;
            }
        } else if (type <= 18) {
            drawTexture[type - 15].drawAtPointOption((startX / 50f) + 62, (float) (((startY / 50) + 30) - 15), 9);
        } else if (type <= 32) {
            if (moveCount >= 0) {
                drawTexture[(type + 3) - 19].drawAtPointOption((startX / 50) + 62, (startY / 50) + 30, 9);
            } else if (moveCount > -10) {
                Texture2D.gl.glTexEnvf(8960, 8704, 8448.0f);
                Texture2D.setAlpha((moveCount * (-0.05f)) + 0.5f);
                drawTexture[(type + 3) - 19].drawAtPointOptionSize((startX / 50) + 62, (startY / 50) + 30, 9, 1f - (moveCount * 0.5f));
                Texture2D.setAlpha(1);
            }
        } else {
            int rInd = type - 33, sum = 4 * (rInd <= 1 ? 1 - rInd : rInd);
            HeroUnit sHero = (HeroUnit)shooter;
            if (sHero.specialAttackFrameCount >= 135 && sHero.specialAttackFrameCount < 165) {
                int cN = ((sHero.specialAttackFrameCount - 135) / 5) % 2;
                int sY = 57 + (rInd * 5) - (rInd == 2 ? 1 - cN : 0);
                drawTexture[sum + 2 + cN].drawAtPointOption((startX / 50) + sY, (startY / 50) + 54 - (24 * cN), 33);
                return;
            }
            if (moveCount >= 0) {
                drawTexture[sum + 1].drawAtPointOption((startX / 50) + 57 + (rInd * 5), (startY / 50) + 30, 33);
                drawTexture[12].drawAtPointOption((startX / 50) + 62, (startY / 50) + 30, 33);
            } else
                drawTexture[sum].drawAtPointOption((startX / 50) + 62, (startY / 50) + 30, 33);
        }
    }
}
