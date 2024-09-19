package com.sncompany.newtower;

/* loaded from: D:\decomp\classes.dex */
public class MyOscillator {
    public static final int MYOSCILLATOR_MOVETYPE_ONE_WAY = 0;
    public static final int MYOSCILLATOR_MOVETYPE_OVER_ACTION = 1;
    static final float M_PI = 3.1415927f;
    private int[] blockPosition;
    private int blockSize;
    public int currentCount;

    public MyOscillator(int start, int end, int count) {
        initWithOneWayStartPosition(start, end, count);
    }

    public MyOscillator(int start, int end, int count, int overPos, int overCount) {
        initWithTwoWayStartPosition(start, end, count, overPos, overCount);
    }

    public void initWithOneWayStartPosition(int start, int end, int count) {
        resetPosition();

        blockSize = count;
        blockPosition = new int[count];
        for (int i = 0; i < count; i++) {
            double sin = Math.sin((((i * 90) * M_PI) / (count - 1f)) / 180);
            double d = end - start;
            blockPosition[i] = (int)((sin * d) + start);
        }
        blockPosition[count - 1] = end;
    }

    public void initWithTwoWayStartPosition(int start, int end, int count, int overPos, int overCount) {
        resetPosition();

        int totalCount = overCount + count;
        blockSize = totalCount;
        blockPosition = new int[totalCount];
        for (int i = 0; i < count; i++) {
            double sin = Math.sin((((i * 90) * M_PI) / (count - 1)) / 180);
            double d = overPos - start;
            blockPosition[i] = (int)((sin * d) + start);
        }
        blockPosition[count - 1] = overPos;
        for (int i = 0; i < overCount; i++) {
            double cos = Math.cos((((i * 90) * M_PI) / ((float) (overCount - 1))) / 180);
            double d = overPos - end;
            blockPosition[count] = (int) ((cos * d) + end);
            count++;
        }
        blockPosition[blockSize - 1] = end;
    }

    public int getCurrentPosition() {
        if (blockPosition == null)
            return 0;
        return blockPosition[currentCount];
    }

    public void updatePosition() {
        if (currentCount < blockSize - 1)
            currentCount++;
    }

    public void resetPosition() {
        this.currentCount = 0;
    }

    public void fastForward() {
        currentCount = blockSize - 1;
    }
}
