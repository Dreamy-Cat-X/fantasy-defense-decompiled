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

    public MyScrollbar(int i, int i2, int i3, int i4) {
        this.BarStartPos = i;
        this.BarEndPos = i2;
        this.BarPosWidth = i2 - i;
        this.BarStartValue = i3;
        this.BarEndValue = i4;
        this.BarValueWidth = i4 - i3;
        this.BarLastPosition = i;
    }

    public void setUpdatePosition(float f) {
        int i = (int) f;
        this.BarLastPosition = i;
        if (this.BarPosWidth >= 0) {
            int i2 = this.BarEndPos;
            if (i > i2) {
                this.BarLastPosition = i2;
                this.BarLastValue = this.BarEndValue;
                return;
            } else {
                int i3 = this.BarStartPos;
                if (i < i3) {
                    this.BarLastPosition = i3;
                    this.BarLastValue = this.BarStartValue;
                    return;
                }
            }
        } else {
            int i4 = this.BarEndPos;
            if (i < i4) {
                this.BarLastPosition = i4;
                this.BarLastValue = this.BarEndValue;
                return;
            } else {
                int i5 = this.BarStartPos;
                if (i > i5) {
                    this.BarLastPosition = i5;
                    this.BarLastValue = this.BarStartValue;
                    return;
                }
            }
        }
        int i6 = this.BarLastPosition;
        int i7 = this.BarStartPos;
        float f2 = (i6 - i7) / (this.BarEndPos - i7);
        float f3 = this.BarStartValue + ((this.BarEndValue - r0) * f2);
        if (f3 >= 0.0f) {
            f3 += 0.5f;
        }
        this.BarLastValue = (int) f3;
    }

    public void setReverseUpdatePosition(float f) {
        int i = (int) f;
        this.BarLastValue = i;
        if (this.BarValueWidth >= 0) {
            int i2 = this.BarEndValue;
            if (i > i2) {
                this.BarLastValue = i2;
                this.BarLastPosition = this.BarEndPos;
                return;
            } else {
                int i3 = this.BarStartValue;
                if (i < i3) {
                    this.BarLastValue = i3;
                    this.BarLastPosition = this.BarStartPos;
                    return;
                }
            }
        } else {
            int i4 = this.BarEndValue;
            if (i < i4) {
                this.BarLastValue = i4;
                this.BarLastPosition = this.BarEndPos;
                return;
            } else {
                int i5 = this.BarStartValue;
                if (i > i5) {
                    this.BarLastValue = i5;
                    this.BarLastPosition = this.BarStartPos;
                    return;
                }
            }
        }
        int i6 = this.BarLastValue;
        int i7 = this.BarStartValue;
        float f2 = (i6 - i7) / (this.BarEndValue - i7);
        float f3 = this.BarStartPos + ((this.BarEndPos - r0) * f2);
        if (f3 >= 0.0f) {
            f3 += 0.5f;
        }
        this.BarLastPosition = (int) f3;
    }
}
