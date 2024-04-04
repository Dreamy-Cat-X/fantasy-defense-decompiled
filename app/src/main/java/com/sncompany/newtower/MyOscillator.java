package com.sncompany.newtower;

import android.util.Log;

/* loaded from: D:\decomp\classes.dex */
public class MyOscillator {
    public static final int MYOSCILLATOR_MOVETYPE_ONE_WAY = 0;
    public static final int MYOSCILLATOR_MOVETYPE_OVER_ACTION = 1;
    static final float M_PI = 3.1415927f;
    public int[] OscBlockPosition;
    public int OscBlockSize;
    public int OscCount;
    public int OscCurrentCount;
    public int OscEndPos;
    public int OscMoveType;
    public int OscOverCount;
    public int OscOverPos;
    public int OscStartPos;

    public MyOscillator(int i, int i2, int i3) {
        initWithOneWayStartPosition(i, i2, i3);
    }

    public void initWithOneWayStartPosition(int i, int i2, int i3) {
        this.OscStartPos = i;
        this.OscEndPos = i2;
        this.OscCount = i3;
        this.OscMoveType = 0;
        this.OscCurrentCount = 0;
        if (this.OscBlockPosition != null) {
            this.OscBlockPosition = null;
        }
        int i4 = this.OscCount;
        this.OscBlockSize = i4;
        this.OscBlockPosition = new int[i4];
        for (int i5 = 0; i5 < this.OscBlockSize; i5++) {
            int[] iArr = this.OscBlockPosition;
            double sin = Math.sin((((i5 * 90) * M_PI) / ((float) (this.OscCount - 1))) / 180.0f);
            int i6 = this.OscEndPos;
            int i7 = this.OscStartPos;
            double d = i6 - i7;
            Double.isNaN(d);
            double d2 = i7;
            Double.isNaN(d2);
            iArr[i5] = (int) ((sin * d) + d2);
        }
        this.OscBlockPosition[this.OscCount - 1] = this.OscEndPos;
    }

    public MyOscillator(int i, int i2, int i3, int i4, int i5) {
        initWithTwoWayStartPosition(i, i2, i3, i4, i5);
    }

    public void initWithTwoWayStartPosition(int i, int i2, int i3, int i4, int i5) {
        this.OscStartPos = i;
        this.OscEndPos = i2;
        this.OscCount = i3;
        this.OscMoveType = 1;
        this.OscOverPos = i4;
        this.OscOverCount = i5;
        int i6 = 0;
        this.OscCurrentCount = 0;
        if (this.OscBlockPosition != null) {
            this.OscBlockPosition = null;
        }
        int i7 = i5 + i3;
        this.OscBlockSize = i7;
        this.OscBlockPosition = new int[i7];
        for (int i8 = 0; i8 < i3; i8++) {
            int[] iArr = this.OscBlockPosition;
            double sin = Math.sin((((i8 * 90) * M_PI) / (this.OscCount - 1)) / 180.0f);
            int i9 = this.OscOverPos;
            int i10 = this.OscStartPos;
            double d = i9 - i10;
            Double.isNaN(d);
            double d2 = sin * d;
            double d3 = i10;
            Double.isNaN(d3);
            iArr[i8] = (int) (d2 + d3);
        }
        this.OscBlockPosition[i3 - 1] = this.OscOverPos;
        while (true) {
            if (i6 < this.OscOverCount) {
                int[] iArr2 = this.OscBlockPosition;
                double cos = Math.cos((((i6 * 90) * M_PI) / ((float) (r11 - 1))) / 180.0f);
                int i11 = this.OscOverPos;
                int i12 = this.OscEndPos;
                double d4 = i11 - i12;
                Double.isNaN(d4);
                double d5 = i12;
                Double.isNaN(d5);
                iArr2[i3] = (int) ((cos * d4) + d5);
                i3++;
                i6++;
            } else {
                this.OscBlockPosition[this.OscBlockSize - 1] = this.OscEndPos;
                return;
            }
        }
    }

    public int getCurrentPosition() {
        int[] iArr = this.OscBlockPosition;
        if (iArr == null) {
            Log.d("OSCILLATOR DEBUG", "CHECK POS " + this.OscCurrentCount + ">=" + this.OscBlockSize);
            return 0;
        }
        int i = this.OscCurrentCount;
        int i2 = this.OscBlockSize;
        if (i >= i2) {
            return iArr[i2 - 1];
        }
        return iArr[i];
    }

    public void updatePosition() {
        this.OscCurrentCount++;
    }

    public void resetPosition() {
        this.OscCurrentCount = 0;
    }

    public void fastForward() {
        int i = this.OscMoveType;
        if (i == 0) {
            this.OscCurrentCount = this.OscCount;
        } else {
            if (i != 1) {
                return;
            }
            this.OscCurrentCount = this.OscCount + this.OscOverCount;
        }
    }
}
