package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzpg {
    private int size;
    private long[] zzbjt;

    public zzpg() {
        this(32);
    }

    private zzpg(int i) {
        this.zzbjt = new long[32];
    }

    public final void add(long j) {
        int i = this.size;
        long[] jArr = this.zzbjt;
        if (i == jArr.length) {
            this.zzbjt = Arrays.copyOf(jArr, i << 1);
        }
        long[] jArr2 = this.zzbjt;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr2[i2] = j;
    }

    public final long get(int i) {
        if (i < 0 || i >= this.size) {
            int i2 = this.size;
            StringBuilder sb = new StringBuilder(46);
            sb.append("Invalid index ");
            sb.append(i);
            sb.append(", size is ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return this.zzbjt[i];
    }

    public final int size() {
        return this.size;
    }
}
