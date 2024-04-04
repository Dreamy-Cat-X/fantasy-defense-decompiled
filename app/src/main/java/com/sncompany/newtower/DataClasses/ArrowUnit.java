package com.sncompany.newtower.DataClasses;

import com.sncompany.newtower.DataStage;
import com.sncompany.newtower.MonsterUnit;

import java.lang.reflect.Array;
import java.util.LinkedList;

/* loaded from: D:\decomp\classes.dex */
public class ArrowUnit {
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
    public int arrowType;
    public int endX;
    public int endY;
    public int moveCount;
    public int moveMaxCount;
    public int moveRate;
    public float moveRotateDegree;
    public int moveSpeed;

    public int shootNumber; //Index of the entity shooting the arrow. replace with entity itself
    public TowerUnit shooter;

    public int startX;
    public int startY;

    public EnemyUnit target;
    public MonsterUnit targetMon;
    public ObjectUnit targetObj;
    public int targetNumber; //Index of the entity to be hit by the arrow. replace with entity itself

    public int targetType;
    public static final int[] SPLASH_RANGE_DEGREE_DISTANCE = {6074, 2278, 1139, 0};
    public static final int[] ARROW_MOVE_UP_HEIGHT = {0, -20, -45, -45, -20};
    public int[][] moveHistory = (int[][]) Array.newInstance(int.class, 5, 2);
    public boolean[] hitCheckFlag = new boolean[150]; //Replace with a Monster LinkedList
    public LinkedList<MonsterUnit> hitMons = new LinkedList<>();

    public void updateArrowUnit() {
        if (arrowType == -1)
            return;

        if (arrowType == 0) {
            for (int i5 = 4; i5 > 0; i5--) {
                int i6 = i5 - 1;
                moveHistory[i5][0] = moveHistory[i6][0];
                moveHistory[i5][1] = moveHistory[i6][1];
            }
            moveHistory[0][0] = startX;
            moveHistory[0][1] = startY;

            if (Math.abs(target.posX - startX) <= moveSpeed && Math.abs(target.posY - startY) <= moveSpeed) {
                if (targetObj == null) {
                    addEffectUnit(shooter.attackEffect, targetMon.posX, targetMon.posY, true);
                    hitMons.add(targetMon);
                    targetMon.hitUnit(3, shooter);
                } else {
                    addEffectUnit(shooter.attackEffect, targetObj.posX, targetObj.posY, true);
                    targetObj.hitObject(3, shooter);
                }
                arrowType = -1;
            } else {
                double rotateDegree = getRotateDegree(target.posX - startX, target.posY - startY);
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
        } else if (arrowType >= 19 && arrowType <= 32) {
            if (moveCount <= 0 || moveCount >= 1000) {
                moveCount++;
                float abs3 = Math.abs(((float) Math.cos(Math.toRadians(moveRotateDegree))) * moveSpeed);
                float abs4 = Math.abs(((float) Math.sin(Math.toRadians(moveRotateDegree))) * moveSpeed);
                if (moveRotateDegree >= 0.0f && moveRotateDegree < 180.0f) {
                    startX = (int) (startX + abs4);
                } else {
                    startX = (int) (startX - abs4);
                }
                if ((moveRotateDegree >= 0.0f && moveRotateDegree < 90.0f) || (moveRotateDegree >= 270.0f && moveRotateDegree < 360.0f)) {
                    startY = (int) (startY - abs3);
                } else {
                    startY = (int) (startY + abs3);
                }
            }
        } else {
            switch (arrowType) {
                case 15:
                case 16:
                case 17:
                    startX -= moveSpeed;
                    break;
                case 18:
                    startX -= moveSpeed;
                    for (int ii = 0; ii < monsterUnitCount; ii++) {
                        MonsterUnit mon = DataStage.monsterUnit[ii];
                        if (mon.monsterType != -1 && Math.abs(mon.posX - startX) <= moveSpeed && Math.abs(mon.posY - startY) <= moveSpeed && !hitMons.contains(mon)) {
                            addEffectUnit(15, mon.posX, mon.posY, true);
                            playSound(30);
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
                        if (moveRotateDegree >= 0.0f && moveRotateDegree < 180.0f) {
                            startX = (int) (startX + abs6);
                        } else {
                            startX = (int) (startX - abs6);
                        }
                        if ((moveRotateDegree >= 0.0f && moveRotateDegree < 90.0f) || (moveRotateDegree >= 270.0f && moveRotateDegree < 360.0f)) {
                            startY = (int) (startY - abs5);
                        } else {
                            startY = (int) (startY + abs5);
                        }
                    }
                    if (moveCount == 0) {
                        addEffectUnit(33, startX, startY, true);
                        break;
                    }
                    break;
                default:
                    moveCount++;
                    if (moveCount >= moveMaxCount) {
                        if (targetObj == null) {
                            if ((shooter.towerType >= 10 && shooter.towerType <= 14) && shooter.heroFlag && rewardDataValue[6] == 1) {
                                addEffectUnit(38, targetMon.posX, targetMon.posY, true);
                            } else {
                                addEffectUnit(shooter.attackEffect, targetMon.posX, targetMon.posY, true);
                            }
                            hitMons.add(targetMon);
                            targetMon.hitUnit(3, shooter);
                            if (shooter.effectType == 4)
                                targetMon.hitUnitFierce(this, shooter);
                        } else {
                            if ((shooter.towerType >= 10 && shooter.towerType <= 14) && shooter.heroFlag && rewardDataValue[6] == 1) {
                                addEffectUnit(38, targetObj.posX, targetObj.posY, true);
                            } else {
                                addEffectUnit(shooter.attackEffect, targetObj.posX, targetObj.posY, true);
                            }
                            hitObject(3, shootNumber, targetNumber);
                        }
                        arrowType = -1;
                        break;
                    }
                    break;
            }
        }
    }
}
