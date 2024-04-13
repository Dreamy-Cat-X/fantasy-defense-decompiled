package com.sncompany.newtower;

import javax.microedition.khronos.opengles.GL10;

/* loaded from: D:\decomp\classes.dex */
public class Tombstone {
    public static final int TOMBSTONE_BLOCK_MAX_SIZE = 200;
    public static GL10 gl;
    public String[] tombstoneString = new String[200];
    public Texture2D[] tombstoneImage = new Texture2D[200];
    public boolean[] tombstoneSetFlag = new boolean[200];
    public long[] tombstoneEngraveTime = new long[200];
    public int[] tombstoneFontColor = new int[200];
    public int[] tombstoneStrokeColor = new int[200];
    public int[] tombstoneFontSize = new int[200];

    public Tombstone(NewTower newTower) {
        for (int i = 0; i < 200; i++) {
            this.tombstoneSetFlag[i] = false;
            this.tombstoneString[i] = new String("");
            this.tombstoneImage[i] = new Texture2D();
        }
    }

    public void connectGL(GL10 gl10) {
        gl = gl10;
    }

    public int searchTombstone(String str, int fontColor, int strokeColor, int fontSize) {
        for (int i4 = 0; i4 < 200; i4++)
            if (this.tombstoneSetFlag[i4] && this.tombstoneString[i4].equals(str) && this.tombstoneFontColor[i4] == fontColor && this.tombstoneStrokeColor[i4] == strokeColor && this.tombstoneFontSize[i4] == fontSize)
                return i4;
        return -1;
    }

    public Texture2D getTombstone(int i) {
        return this.tombstoneImage[i];
    }

    public void setTombstone(String str) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= 200) {
                i2 = -1;
                break;
            } else if (!this.tombstoneSetFlag[i2]) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            long j = this.tombstoneEngraveTime[0];
            for (int i3 = 1; i3 < 200; i3++) {
                if (this.tombstoneEngraveTime[i3] < j) {
                    i = i3;
                }
            }
            removeTombstone(i);
            i2 = i;
        }
        this.tombstoneString[i2] = new String(str);
        if (GameRenderer.fontColor == GameRenderer.strokeColor) {
            this.tombstoneImage[i2].initWithStringColor(str);
        } else {
            this.tombstoneImage[i2].initWithStringDoubleColor(str);
        }
        this.tombstoneSetFlag[i2] = true;
        this.tombstoneEngraveTime[i2] = System.currentTimeMillis();
        this.tombstoneFontColor[i2] = GameRenderer.fontColor;
        this.tombstoneStrokeColor[i2] = GameRenderer.strokeColor;
        this.tombstoneFontSize[i2] = GameRenderer.fontSize;
    }

    public void removeTombstone(int i) {
        this.tombstoneImage[i].dealloc();
        this.tombstoneSetFlag[i] = false;
    }

    public void removeAllTombstones() {
        for (int i = 0; i < 200; i++) {
            if (this.tombstoneSetFlag[i]) {
                this.tombstoneImage[i].dealloc();
                this.tombstoneSetFlag[i] = false;
            }
        }
    }

    public void dealloc() {
        removeAllTombstones();
    }
}
