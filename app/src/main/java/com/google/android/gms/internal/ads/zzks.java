package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzks {
    private static final long[] zzasp = {128, 64, 32, 16, 8, 4, 2, 1};
    private int length;
    private int state;
    private final byte[] zzaox = new byte[8];

    public final void reset() {
        this.state = 0;
        this.length = 0;
    }

    public final long zza(zzjy zzjyVar, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.state == 0) {
            if (!zzjyVar.zza(this.zzaox, 0, 1, z)) {
                return -1L;
            }
            int zzao = zzao(this.zzaox[0] & 255);
            this.length = zzao;
            if (zzao == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.state = 1;
        }
        int i2 = this.length;
        if (i2 > i) {
            this.state = 0;
            return -2L;
        }
        if (i2 != 1) {
            zzjyVar.readFully(this.zzaox, 1, i2 - 1);
        }
        this.state = 0;
        return zza(this.zzaox, this.length, z2);
    }

    public final int zzgw() {
        return this.length;
    }

    public static int zzao(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = zzasp;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & i) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public static long zza(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= zzasp[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }
}
