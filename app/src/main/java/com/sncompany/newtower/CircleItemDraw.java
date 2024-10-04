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

    public CircleItemDraw(int maxVis, int length) {
        setBlockArray(maxVis);
        totalDataBlockSize = length;
        currentDrawPosition = 0;
        targetDrawPosition = 0;
        moveCloseFlag = false;
    }

    public void resetArrayPosition() {
        currentDrawPosition = 0;
        targetDrawPosition = 0;
        getArrayAndCorrection();
    }

    public void setBlockArray(int i) {
        totalHalfBlockSize = i;
        int siz = (i * 2) + 1;
        totalBlockSize = siz;
        blockLastViewCount = 0;
        blockLengthArray = new int[i];
        blockSizeArray = new float[i];
        blockAlphaArray = new float[i];
        blockCurrentArray = new int[siz];
    }

    public void getArrayAndCorrection() {
        int curP = Math.abs(currentDrawPosition);

        if (FIRST_BLOCK_SIZE == 0) {
            for (int i3 = 0; i3 < totalBlockSize; i3++)
                blockCurrentArray[i3] = 0;
            blockCorrectionPixel = 0;
            return;
        }
        int divP = curP / FIRST_BLOCK_SIZE;
        int perP = curP % FIRST_BLOCK_SIZE;
        if (perP > FIRST_BLOCK_SIZE / 2) {
            divP++;
            perP -= FIRST_BLOCK_SIZE;
        }

        blockCorrectionPixel = currentDrawPosition < 0 ? perP : -perP;
        if (currentDrawPosition < 0)
            divP = -divP;

        int helf = divP - totalHalfBlockSize;
        for (int i = 0; i < totalBlockSize; i++) {
            if (!moveCloseFlag) {
                if (helf < 0)
                    helf = totalDataBlockSize - ((-helf) % totalDataBlockSize);
                blockCurrentArray[i] = helf % totalDataBlockSize;
            } else if (helf < 0 || helf >= totalDataBlockSize) {
                blockCurrentArray[i] = -1;
            } else
                blockCurrentArray[i] = helf;
            helf++;
        }
        leftArrowDrawFlag = true;
        rightArrowDrawFlag = true;
        if (moveCloseFlag) {
            if (currentDrawPosition == 0)
                leftArrowDrawFlag = false;

            if (currentDrawPosition == (totalDataBlockSize - 1) * FIRST_BLOCK_SIZE)
                rightArrowDrawFlag = false;
        }
    }

    public void resetTargetPosition() {
        int pos = Math.abs(currentDrawPosition);

        int dP = pos / FIRST_BLOCK_SIZE;
        int pP = pos % FIRST_BLOCK_SIZE;
        if (currentDrawPosition < 0) {
            dP = (-dP) - 1;
            pP = FIRST_BLOCK_SIZE - pP;
        }
        if (pP > FIRST_BLOCK_SIZE / 2) {
            dP++;
            pP -= FIRST_BLOCK_SIZE;
        }
        if ((pP < 0 ? -pP : pP) >= nextMoveCheckDegree) {
            if (pP < 0 && currentDrawPosition - backupDrawPosition < 0)
                dP--;
            if (pP > 0 && currentDrawPosition - backupDrawPosition > 0)
                dP++;
        }
        targetDrawPosition = dP * FIRST_BLOCK_SIZE;
    }

    public void backupCurrentDrawPosition() {
        backupDrawPosition = currentDrawPosition;
    }

    public void setAnchorDrawPosition(int i) {
        currentDrawPosition = i;
        targetDrawPosition = i;
    }

    public void resetWithDegree(int i) {
        int bI = backupDrawPosition + i;
        currentDrawPosition = bI;
        targetDrawPosition = backupDrawPosition + i;
        leftArrowDrawFlag = true;
        rightArrowDrawFlag = true;
        if (moveCloseFlag) {
            if (bI < 0) {
                currentDrawPosition = 0;
                targetDrawPosition = 0;
            }
            int v = ((totalDataBlockSize - 1) - blockLastViewCount) * FIRST_BLOCK_SIZE;
            if (currentDrawPosition > v) {
                currentDrawPosition = v;
                targetDrawPosition = v;
            }

            if (currentDrawPosition == 0)
                leftArrowDrawFlag = false;
            if (currentDrawPosition == v)
                rightArrowDrawFlag = false;
        }
    }

    public void correctDistance() {
        int cb = currentDrawPosition;
        int tb = targetDrawPosition;
        if (cb != tb) {
            if (cb > tb) {
                currentDrawPosition = cb - tb < moveSpeed ? tb : cb - moveSpeed;
            } else
                currentDrawPosition = cb - tb < moveSpeed ? tb : cb + moveSpeed;
        }
        leftArrowDrawFlag = true;
        rightArrowDrawFlag = true;
        if (moveCloseFlag) {
            if (currentDrawPosition == 0)
                leftArrowDrawFlag = false;

            if (currentDrawPosition == (totalDataBlockSize - 1) * FIRST_BLOCK_SIZE)
                rightArrowDrawFlag = false;
        }
    }
}
