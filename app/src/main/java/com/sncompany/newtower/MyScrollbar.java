package com.sncompany.newtower;

/* loaded from: D:\decomp\classes.dex */
public class MyScrollbar {
    public int BarEndPos;
    public int BarEndValue;
    public int BarLastPosition;
    public int BarLastValue;
    public int BarPosWidth;
    public int BarStartPos;
    public int BarStartValue;
    public int BarValueWidth;

    public MyScrollbar(int startP, int endP, int startVal, int endVal) {
        BarStartPos = startP;
        BarEndPos = endP;
        BarPosWidth = endP - startP;
        BarStartValue = startVal;
        BarEndValue = endVal;
        BarValueWidth = endVal - startVal;
        BarLastPosition = startP;
    }

    public void setUpdatePosition(float f) {
        int i = (int) f;
        BarLastPosition = i;
        if (BarPosWidth >= 0) {
            if (i > BarEndPos) {
                BarLastPosition = BarEndPos;
                BarLastValue = BarEndValue;
                return;
            } else if (i < BarStartPos) {
                BarLastPosition = BarStartPos;
                BarLastValue = BarStartValue;
                return;
            }
        } else {
            if (i < BarEndPos) {
                BarLastPosition = BarEndPos;
                BarLastValue = BarEndValue;
                return;
            } else if (i > BarStartPos) {
                BarLastPosition = BarStartPos;
                BarLastValue = BarStartValue;
                return;
            }
        }
        float f2 = (float)(BarLastPosition - BarStartPos) / (BarEndPos - BarStartPos);
        float val = BarStartValue + ((BarEndValue - BarStartValue) * f2);
        if (val >= 0)
            val += 0.5f;
        this.BarLastValue = (int) val;
    }

    public void setReverseUpdatePosition(float f) {
        int i = (int) f;
        BarLastValue = i;
        if (BarValueWidth >= 0) {
            if (i > BarEndValue) {
                BarLastValue = BarEndValue;
                BarLastPosition = BarEndPos;
                return;
            } else if (i < BarStartValue) {
                this.BarLastValue = BarStartValue;
                this.BarLastPosition = this.BarStartPos;
                return;
            }
        } else {
            if (i < BarEndValue) {
                this.BarLastValue = BarEndValue;
                this.BarLastPosition = this.BarEndPos;
                return;
            } else if (i > BarStartValue) {
                this.BarLastValue = BarStartValue;
                this.BarLastPosition = this.BarStartPos;
                return;
            }
        }
        float f2 = (float) (BarLastValue - BarStartValue) / (BarEndValue - BarStartValue);
        float val = BarStartPos + ((BarEndPos - BarStartPos) * f2);
        if (val >= 0)
            val += 0.5f;
        this.BarLastPosition = (int) val;
    }
}
