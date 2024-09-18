package com.sncompany.newtower;

import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.DataClasses.CGRect;

import java.lang.reflect.Array;

/* loaded from: D:\decomp\classes.dex */
public class TouchManager {
    public static final int MULTI_TOUCH_MAX_BLOCK_COUNT = 2;
    public static final int NEW_TOUCH_LIST_CHECK_COUNT = 100;
    public static final int TOUCH_BUFFERING_BLOCK_SIZE = 2;
    public static final int TOUCH_DIRECTION_EAST = 3;
    public static final int TOUCH_DIRECTION_NORTH = 0;
    public static final int TOUCH_DIRECTION_POS_TOTAL_COUNT = 2;
    public static final int TOUCH_DIRECTION_SOUTH = 2;
    public static final int TOUCH_DIRECTION_TOTAL_COUNT = 4;
    public static final int TOUCH_DIRECTION_WEST = 1;
    public static final int TOUCH_DIRECTION_XPOS = 0;
    public static final int TOUCH_DIRECTION_YPOS = 1;
    public static final int TOUCH_MANAGER_CHECK_IGNORE_DISTANCE = 10;
    public static final int TOUCH_MANAGER_MOVED = 1;
    public static final int TOUCH_MANAGER_MOVE_LIMIT_LENGTH = 40;
    public static final int TOUCH_MANAGER_PRESSED = 0;
    public static final int TOUCH_MANAGER_RELEASED = 2;
    public static final int TOUCH_MANAGER_YESNO_CANCLE = 3;
    public static final int TOUCH_MANAGER_YESNO_CHECK_COUNT = 8;
    public static final int TOUCH_MANAGER_YESNO_DOWN_ARROW = 7;
    public static final int TOUCH_MANAGER_YESNO_LEFT_ARROW = 4;
    public static final int TOUCH_MANAGER_YESNO_NO = 1;
    public static final int TOUCH_MANAGER_YESNO_OK = 2;
    public static final int TOUCH_MANAGER_YESNO_RIGHT_ARROW = 5;
    public static final int TOUCH_MANAGER_YESNO_UP_ARROW = 6;
    public static final int TOUCH_MANAGER_YESNO_YES = 0;
    public static final int TOUCH_MOVE_BLOCK_SIZE = 30;
    public static final int TOUCH_STATUS_END_INPUTED = 3;
    public static final int TOUCH_STATUS_NO_INPUT = 0;
    public static final int TOUCH_STATUS_START_INPUTED = 1;
    public static final int TOUCH_STATUS_START_PROCESSED = 2;
    public static boolean curruptFlag;
    public static CGPoint emptyPosition;
    public static int lastActionStatus;
    public static int lastInputedCount;
    public static CGPoint lastMoveCheckDistance;
    public static CGPoint lastSwipeCheckDistance;
    public static boolean multiTouchFlag;
    public static int touchCheckSlot;
    public static int touchSettingSlot;
    public static final int[][] touchDirection = {new int[]{0, -1}, new int[]{-1, 0}, new int[]{0, 1}, new int[]{1, 0}};
    public static float scaleX = 1;
    public static float scaleY = 1;
    public static int[] touchInputStatus = new int[2];
    public static CGPoint[] touchStartPosition = new CGPoint[2];
    public static CGPoint[][] touchMovedPosition = (CGPoint[][]) Array.newInstance(CGPoint.class, 2, 30);
    public static CGPoint[] touchEndPosition = new CGPoint[2];
    public static int[] touchTapStartCount = new int[2];
    public static int[][] touchTapMovedCount = (int[][]) Array.newInstance(int.class, 2, 30);
    public static int[] touchTapEndCount = new int[2];
    public static int[] touchMovedUsedCount = new int[2];
    public static int[] touchListCheckCount = new int[2];
    public static CGRect[][] touchListCheckData = (CGRect[][]) Array.newInstance(CGRect.class, 2, 100);
    public static boolean[] lastActionSlot = new boolean[2];
    public static CGPoint[] lastInputedArray = new CGPoint[2];
    public static int[] lastInputedTapCount = new int[2];
    public static float[] touchDistanceCheck = new float[2];

    float fabsf(float f) {
        return f < 0 ? -f : f;
    }

    public TouchManager(boolean z) {
        curruptFlag = false;
        multiTouchFlag = z;
        for (int i = 0; i < 2; i++)
            touchStartPosition[i] = new CGPoint();
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 30; j++)
                touchMovedPosition[i][j] = new CGPoint();
        for (int i = 0; i < 2; i++)
            touchEndPosition[i] = new CGPoint();

        touchCheckSlot = 0;
        touchSettingSlot = 1;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 100; j++)
                touchListCheckData[i][j] = new CGRect();
        for (int i = 0; i < 2; i++)
            lastInputedArray[i] = new CGPoint();

        lastMoveCheckDistance = new CGPoint();
        lastSwipeCheckDistance = new CGPoint();
        emptyPosition = new CGPoint(0, 0);
    }

    public void addLastInputPoint(int i, int p, CGPoint cGPoint, int t) {
        lastInputedCount = i;
        lastInputedArray[p].x = cGPoint.x * scaleX;
        lastInputedArray[p].y = cGPoint.y * scaleY;
        lastInputedTapCount[p] = t;
    }

    /**
     * Processes when the touchscreen is touched
     * @param act Touch type
     */
    public void processTouchEvent(int act) {
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        for (int i3 = 0; i3 < 2; i3++)
            lastActionSlot[i3] = false;

        if (act == 0) {
            if (multiTouchFlag) {
                for (int i = 0; i < lastInputedCount; i++) {
                    int i5 = 0;
                    while (true) {
                        if (i5 < 2) {
                            int[] iArr = touchInputStatus;
                            if (iArr[i5] == 0) {
                                iArr[i5] = 1;
                                touchStartPosition[i5].x = lastInputedArray[i].x;
                                touchStartPosition[i5].y = lastInputedArray[i].y;
                                touchTapStartCount[i5] = lastInputedTapCount[i];
                                touchMovedUsedCount[i5] = 0;
                                lastActionSlot[i5] = true;
                                break;
                            }
                            i5++;
                        }
                    }
                }
            } else {
                touchInputStatus[0] = 1;
                touchStartPosition[0].x = lastInputedArray[0].x;
                touchStartPosition[0].y = lastInputedArray[0].y;
                touchTapStartCount[0] = lastInputedTapCount[0];
                touchMovedUsedCount[0] = 0;
                lastActionSlot[0] = true;
            }
            lastActionStatus = TOUCH_STATUS_NO_INPUT;
        } else if (act == 1) {
            if (multiTouchFlag) {
                int firstValidTouch = getFirstValidTouch();
                if (firstValidTouch == -1) {
                    return;
                }
                int pressedCount = getPressedCount();
                int i6 = lastInputedCount;
                if (pressedCount < i6) {
                    int i7 = i6 - pressedCount;
                    for (int i8 = 0; i8 < i7; i8++) {
                        int firstEmptyTouch = getFirstEmptyTouch();
                        if (firstEmptyTouch != -1) {
                            int[] iArr2 = touchInputStatus;
                            iArr2[firstEmptyTouch] = iArr2[firstValidTouch];
                            CGPoint[] cGPointArr = touchStartPosition;
                            cGPointArr[firstEmptyTouch].x = cGPointArr[firstValidTouch].x;
                            CGPoint[] cGPointArr2 = touchStartPosition;
                            cGPointArr2[firstEmptyTouch].y = cGPointArr2[firstValidTouch].y;
                            int[] iArr3 = touchTapStartCount;
                            iArr3[firstEmptyTouch] = iArr3[firstValidTouch];
                            touchMovedUsedCount[firstEmptyTouch] = 0;
                        }
                    }
                }
                for (int i9 = 0; i9 < lastInputedCount; i9++) {
                    for (int i10 = 0; i10 < 2; i10++) {
                        int i11 = touchInputStatus[i10];
                        if (i11 == 1 || i11 == 2) {
                            int[] iArr4 = touchMovedUsedCount;
                            if (iArr4[i10] == 0) {
                                f = touchStartPosition[i10].x;
                                f2 = touchStartPosition[i10].y;
                            } else {
                                f = touchMovedPosition[i10][iArr4[i10] - 1].x;
                                f2 = touchMovedPosition[i10][touchMovedUsedCount[i10] - 1].y;
                            }
                            touchDistanceCheck[i10] = fabsf(f - lastInputedArray[i9].x) + fabsf(f2 - lastInputedArray[i9].y);
                        }
                    }
                    int i12 = firstValidTouch;
                    for (int i13 = 0; i13 < 2; i13++) {
                        if (i13 != firstValidTouch && ((i2 = touchInputStatus[i13]) == 1 || i2 == 2)) {
                            float[] fArr = touchDistanceCheck;
                            if (fArr[i13] < fArr[i12]) {
                                i12 = i13;
                            }
                        }
                    }
                    if (touchMovedUsedCount[i12] == 30) {
                        int i14 = 0;
                        while (i14 < 29) {
                            CGPoint[][] cGPointArr3 = touchMovedPosition;
                            int i15 = i14 + 1;
                            cGPointArr3[i12][i14].x = cGPointArr3[i12][i15].x;
                            CGPoint[][] cGPointArr4 = touchMovedPosition;
                            cGPointArr4[i12][i14].y = cGPointArr4[i12][i15].y;
                            int[][] iArr5 = touchTapMovedCount;
                            iArr5[i12][i14] = iArr5[i12][i15];
                            i14 = i15;
                        }
                        touchMovedUsedCount[i12] = 29;
                    }
                    touchMovedPosition[i12][touchMovedUsedCount[i12]].x = lastInputedArray[i9].x;
                    touchMovedPosition[i12][touchMovedUsedCount[i12]].y = lastInputedArray[i9].y;
                    int[] iArr6 = touchTapMovedCount[i12];
                    int[] iArr7 = touchMovedUsedCount;
                    iArr6[iArr7[i12]] = lastInputedTapCount[i9];
                    iArr7[i12] = iArr7[i12] + 1;
                    lastActionSlot[i12] = true;
                }
            } else {
                if (touchMovedUsedCount[0] == 30) {
                    int i16 = 0;
                    while (i16 < 29) {
                        CGPoint[][] cGPointArr5 = touchMovedPosition;
                        int i17 = i16 + 1;
                        cGPointArr5[0][i16].x = cGPointArr5[0][i17].x;
                        CGPoint[][] cGPointArr6 = touchMovedPosition;
                        cGPointArr6[0][i16].y = cGPointArr6[0][i17].y;
                        int[][] iArr8 = touchTapMovedCount;
                        iArr8[0][i16] = iArr8[0][i17];
                        i16 = i17;
                    }
                    touchMovedUsedCount[0] = 29;
                }
                touchMovedPosition[0][touchMovedUsedCount[0]].x = lastInputedArray[0].x;
                touchMovedPosition[0][touchMovedUsedCount[0]].y = lastInputedArray[0].y;
                int[] iArr9 = touchTapMovedCount[0];
                int[] iArr10 = touchMovedUsedCount;
                iArr9[iArr10[0]] = lastInputedTapCount[0];
                iArr10[0] = iArr10[0] + 1;
                lastActionSlot[0] = true;
            }
            lastActionStatus = TOUCH_STATUS_START_INPUTED;
        } else if (act == 2) {
            if (multiTouchFlag) {
                for (int i18 = 0; i18 < lastInputedCount; i18++) {
                    for (int i19 = 0; i19 < 2; i19++) {
                        int i20 = touchInputStatus[i19];
                        if (i20 == 1 || i20 == 2) {
                            int[] iArr11 = touchMovedUsedCount;
                            if (iArr11[i19] == 0) {
                                f3 = touchStartPosition[i19].x;
                                f4 = touchStartPosition[i19].y;
                            } else {
                                f3 = touchMovedPosition[i19][iArr11[i19] - 1].x;
                                f4 = touchMovedPosition[i19][touchMovedUsedCount[i19] - 1].y;
                            }
                            touchDistanceCheck[i19] = fabsf(f3 - lastInputedArray[i18].x) + fabsf(f4 - lastInputedArray[i18].y);
                        }
                    }
                    int i21 = -1;
                    for (int i22 = 0; i22 < 2; i22++) {
                        int i23 = touchInputStatus[i22];
                        if (i23 == 1 || i23 == 2) {
                            if (i21 != -1) {
                                float[] fArr2 = touchDistanceCheck;
                                if (fArr2[i22] >= fArr2[i21]) {
                                }
                            }
                            i21 = i22;
                        }
                    }
                    if (i21 != -1) {
                        touchInputStatus[i21] = 3;
                        touchEndPosition[i21].x = lastInputedArray[i18].x;
                        touchEndPosition[i21].y = lastInputedArray[i18].y;
                        touchTapEndCount[i21] = lastInputedTapCount[i18];
                        lastActionSlot[0] = true;
                    }
                }
            } else {
                touchInputStatus[0] = 3;
                touchEndPosition[0].x = lastInputedArray[0].x;
                touchEndPosition[0].y = lastInputedArray[0].y;
                touchTapEndCount[0] = lastInputedTapCount[0];
                lastActionSlot[0] = true;
            }
            lastActionStatus = TOUCH_STATUS_START_PROCESSED;
        }
        for (int i24 = 0; i24 < 2; i24++) {
            int i25 = touchInputStatus[i24];
        }
        for (int i26 = 0; i26 < 2; i26++) {
            int i27 = touchInputStatus[i26];
        }
    }

    public static void clearTouchStatus() {
        for (int i = 0; i < 2; i++)
            touchInputStatus[i] = 0;
    }

    public static void processTouchStatus() {
        for (int i = 0; i < touchInputStatus.length; i++) {

            if (touchInputStatus[i] == 1)
                touchInputStatus[i] = 2;
            else if (touchInputStatus[i] == 3)
                touchInputStatus[i] = 0;
        }
    }

    public static void swapTouchMap() {
        touchCheckSlot = 1 - touchCheckSlot;
        touchSettingSlot = 1 - touchCheckSlot;
        if (curruptFlag)
            curruptFlag = false;
    }

    public static void clearTouchMap() {
        for (int i = 0; i < 100; i++) {
            touchListCheckData[touchSettingSlot][i].originX = 0;
            touchListCheckData[touchSettingSlot][i].originY = 0;
            touchListCheckData[touchSettingSlot][i].sizeWidth = 0;
            touchListCheckData[touchSettingSlot][i].sizeHeight = 0;
        }
        touchListCheckCount[touchSettingSlot] = 0;
    }

    public static boolean InRect(CGPoint cGPoint, CGRect cGRect) {
        return cGPoint.x >= cGRect.originX && cGPoint.x < cGRect.originX + cGRect.sizeWidth && cGPoint.y >= cGRect.originY && cGPoint.y < cGRect.originY + cGRect.sizeHeight;
    }

    public static void addTouchRectListData(int i, CGRect cGRect) {
        touchListCheckData[touchSettingSlot][i].originX = cGRect.originX;
        touchListCheckData[touchSettingSlot][i].originY = cGRect.originY;
        touchListCheckData[touchSettingSlot][i].sizeWidth = cGRect.sizeWidth;
        touchListCheckData[touchSettingSlot][i].sizeHeight = cGRect.sizeHeight;
    }

    public static int checkTouchListPressed(CGPoint cGPoint) {
        for (int i = 0; i < touchListCheckCount[touchCheckSlot]; i++)
            if (InRect(cGPoint, touchListCheckData[touchCheckSlot][i]))
                return i;
        return -1;
    }

    public static int getFirstValidTouch() {
        for (int i = 0; i < touchInputStatus.length; i++)
            if (touchInputStatus[i] >= 1 && touchInputStatus[i] <= 3)
                return i;
        return -1;
    }

    int getFirstEmptyTouch() {
        for (int i = 0; i < touchInputStatus.length; i++)
            if (touchInputStatus[i] == 0)
                return i;
        return -1;
    }

    public static CGPoint getFirstFirstActionTouch() {
        for (int i = 0; i < 2; i++)
            if (lastActionSlot[i])
                return touchStartPosition[i];
        return emptyPosition;
    }

    public static CGPoint getFirstLastActionTouch() {
        for (int i = 0; i < 2; i++) {
            if (lastActionSlot[i]) {
                int i2 = lastActionStatus;
                if (i2 == 0)
                    return touchStartPosition[i];
                if (i2 == 1)
                    return touchMovedPosition[i][touchMovedUsedCount[i] - 1];
                if (i2 == 2)
                    return touchEndPosition[i];
            }
        }
        return emptyPosition;
    }

    public static int getPressedCount() {
        int i = 0;
        for (int j = 0; j < touchInputStatus.length; j++)
            if (touchInputStatus[j] >= 1 && touchInputStatus[j] <= 3)
                i++;
        return i;
    }

    public static int checkTouchListStatus() {
        int checkTouchListPressed;
        int firstValidTouch = getFirstValidTouch();
        if (firstValidTouch == -1)
            return -1;
        int i = touchInputStatus[firstValidTouch];
        if ((i != 1 && i != 3) || (checkTouchListPressed = checkTouchListPressed(touchStartPosition[firstValidTouch])) == -1)
            return -1;
        for (int i2 = 0; i2 < touchMovedUsedCount[firstValidTouch]; i2++)
            if (checkTouchListPressed != checkTouchListPressed(touchMovedPosition[firstValidTouch][i2]))
                return -1;
        if (touchInputStatus[firstValidTouch] != 3 || checkTouchListPressed == checkTouchListPressed(touchEndPosition[firstValidTouch]))
            return checkTouchListPressed;
        return -1;
    }

    public static boolean checkTouchMoveDegree(boolean z) {
        int i;
        int firstValidTouch = getFirstValidTouch();
        if (firstValidTouch == -1) {
            return false;
        }
        if (z && (i = touchInputStatus[firstValidTouch]) != 1 && i != 3) {
            return false;
        }
        int[] iArr = touchMovedUsedCount;
        if (iArr[firstValidTouch] == 0) {
            lastMoveCheckDistance.x = 0;
            lastMoveCheckDistance.y = 0;
            return false;
        }
        lastMoveCheckDistance.x = touchMovedPosition[firstValidTouch][iArr[firstValidTouch] - 1].x - touchStartPosition[firstValidTouch].x;
        lastMoveCheckDistance.y = touchMovedPosition[firstValidTouch][touchMovedUsedCount[firstValidTouch] - 1].y - touchStartPosition[firstValidTouch].y;
        float f = lastMoveCheckDistance.x;
        float f2 = lastMoveCheckDistance.y;
        if (f < 0) {
            f = -f;
        }
        if (f2 < 0) {
            f2 = -f2;
        }
        return f >= 10 || f2 >= 10;
    }
}
