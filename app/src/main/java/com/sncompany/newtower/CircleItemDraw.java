package com.sncompany.newtower;

/* loaded from: D:\decomp\classes.dex */
public class CircleItemDraw {
    public int FIRST_BLOCK_SIZE;
    public int backupDrawPosition;
    public float[] blockAlphaArray;
    public int blockCorrectionPixel;
    public int[] blockCurrentArray;
    public int blockLastViewCount;
    public int[] blockLengthArray;
    public float[] blockSizeArray;
    public int currentDrawPosition;
    public boolean leftArrowDrawFlag;
    public boolean moveCloseFlag;
    public int moveSpeed;
    public int nextMoveCheckDegree;
    public boolean rightArrowDrawFlag;
    public int targetDrawPosition;
    public int totalBlockSize;
    public int totalDataBlockSize;
    public int totalHalfBlockSize;

    public CircleItemDraw(int i, int i2) {
        setBlockArray(i);
        this.totalDataBlockSize = i2;
        this.currentDrawPosition = 0;
        this.targetDrawPosition = 0;
        this.moveCloseFlag = false;
    }

    public void resetArrayPosition() {
        this.currentDrawPosition = 0;
        this.targetDrawPosition = 0;
        getArrayAndCorrection();
    }

    public void setBlockArray(int i) {
        this.totalHalfBlockSize = i;
        int i2 = (i * 2) + 1;
        this.totalBlockSize = i2;
        this.blockLastViewCount = 0;
        this.blockLengthArray = new int[i];
        this.blockSizeArray = new float[i];
        this.blockAlphaArray = new float[i];
        this.blockCurrentArray = new int[i2];
    }

    public void getArrayAndCorrection() {
        int i = Math.abs(this.currentDrawPosition);

        int i2 = this.FIRST_BLOCK_SIZE;
        if (i2 == 0) {
            for (int i3 = 0; i3 < this.totalBlockSize; i3++)
                this.blockCurrentArray[i3] = 0;

            this.blockCorrectionPixel = 0;
            return;
        }
        int i4 = i / i2;
        int i5 = i % i2;
        if (i5 > i2 / 2) {
            i4++;
            i5 -= i2;
        }

        this.blockCorrectionPixel = this.currentDrawPosition < 0 ? i5 : -i5;
        if (this.currentDrawPosition < 0)
            i4 = -i4;

        int i6 = i4 - this.totalHalfBlockSize;
        int i7 = 0;
        while (i7 < this.totalBlockSize) {
            if (!this.moveCloseFlag) {
                if (i6 < 0) {
                    int i8 = this.totalDataBlockSize;
                    i6 = i8 - ((-i6) % i8);
                }
                this.blockCurrentArray[i7] = i6 % this.totalDataBlockSize;
            } else if (i6 < 0 || i6 >= this.totalDataBlockSize) {
                this.blockCurrentArray[i7] = -1;
            } else
                this.blockCurrentArray[i7] = i6;
            i7++;
            i6++;
        }
        this.leftArrowDrawFlag = true;
        this.rightArrowDrawFlag = true;
        if (this.moveCloseFlag) {
            if (this.currentDrawPosition == 0)
                this.leftArrowDrawFlag = false;

            if (this.currentDrawPosition == (this.totalDataBlockSize - 1) * this.FIRST_BLOCK_SIZE)
                this.rightArrowDrawFlag = false;
        }
    }

    public void resetTargetPosition() {
        int i = Math.abs(this.currentDrawPosition);

        int i2 = this.FIRST_BLOCK_SIZE;
        int i3 = i / i2;
        int i4 = i % i2;
        if (this.currentDrawPosition < 0) {
            i3 = (-i3) - 1;
            i4 = i2 - i4;
        }
        int i5 = this.FIRST_BLOCK_SIZE;
        if (i4 > i5 / 2) {
            i3++;
            i4 -= i5;
        }
        if ((i4 < 0 ? -i4 : i4) >= this.nextMoveCheckDegree) {
            if (i4 < 0 && this.currentDrawPosition - this.backupDrawPosition < 0)
                i3--;

            if (i4 > 0 && this.currentDrawPosition - this.backupDrawPosition > 0)
                i3++;
        }
        this.targetDrawPosition = i3 * this.FIRST_BLOCK_SIZE;
    }

    public void backupCurrentDrawPosition() {
        this.backupDrawPosition = this.currentDrawPosition;
    }

    public void setAnchorDrawPosition(int i) {
        this.currentDrawPosition = i;
        this.targetDrawPosition = i;
    }

    public void resetWithDegree(int i) {
        int i2 = this.backupDrawPosition;
        int i3 = i2 + i;
        this.currentDrawPosition = i3;
        this.targetDrawPosition = i2 + i;
        this.leftArrowDrawFlag = true;
        this.rightArrowDrawFlag = true;
        if (this.moveCloseFlag) {
            if (i3 < 0) {
                this.currentDrawPosition = 0;
                this.targetDrawPosition = 0;
            }
            int i4 = this.currentDrawPosition;
            int i5 = this.totalDataBlockSize;
            int i6 = this.blockLastViewCount;
            int i7 = this.FIRST_BLOCK_SIZE;
            if (i4 > ((i5 - 1) - i6) * i7) {
                this.currentDrawPosition = ((i5 - 1) - i6) * i7;
                this.targetDrawPosition = ((i5 - 1) - i6) * i7;
            }

            if (this.currentDrawPosition == 0)
                this.leftArrowDrawFlag = false;
            if (this.currentDrawPosition == ((this.totalDataBlockSize - 1) - this.blockLastViewCount) * this.FIRST_BLOCK_SIZE)
                this.rightArrowDrawFlag = false;
        }
    }

    public void correctDistance() {
        int i = this.currentDrawPosition;
        int i2 = this.targetDrawPosition;
        if (i != i2) {
            if (i > i2) {
                int i3 = i - i2;
                int i4 = this.moveSpeed;
                this.currentDrawPosition = i3 < i4 ? i2 : i - i4;
            } else {
                int i5 = i2 - i;
                int i6 = this.moveSpeed;
                this.currentDrawPosition = i5 < i6 ? i2 : i + i6;
            }
        }
        this.leftArrowDrawFlag = true;
        this.rightArrowDrawFlag = true;
        if (this.moveCloseFlag) {
            if (this.currentDrawPosition == 0)
                this.leftArrowDrawFlag = false;

            if (this.currentDrawPosition == (this.totalDataBlockSize - 1) * this.FIRST_BLOCK_SIZE)
                this.rightArrowDrawFlag = false;
        }
    }
}
