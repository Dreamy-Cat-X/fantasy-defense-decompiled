package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzkt {
    private final zzpm zzapq = new zzpm(8);
    private int zzasq;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzjy zzjyVar) throws IOException, InterruptedException {
        long length = zzjyVar.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        zzjyVar.zza(this.zzapq.data, 0, 4);
        long zzix = this.zzapq.zzix();
        this.zzasq = 4;
        while (zzix != 440786851) {
            int i2 = this.zzasq + 1;
            this.zzasq = i2;
            if (i2 == i) {
                return false;
            }
            zzjyVar.zza(this.zzapq.data, 0, 1);
            zzix = ((zzix << 8) & (-256)) | (this.zzapq.data[0] & 255);
        }
        long zzc = zzc(zzjyVar);
        long j2 = this.zzasq;
        if (zzc != Long.MIN_VALUE && (length == -1 || j2 + zzc < length)) {
            while (true) {
                int i3 = this.zzasq;
                long j3 = j2 + zzc;
                if (i3 < j3) {
                    if (zzc(zzjyVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long zzc2 = zzc(zzjyVar);
                    if (zzc2 < 0 || zzc2 > 2147483647L) {
                        break;
                    }
                    if (zzc2 != 0) {
                        zzjyVar.zzah((int) zzc2);
                        this.zzasq = (int) (this.zzasq + zzc2);
                    }
                } else if (i3 == j3) {
                    return true;
                }
            }
        }
        return false;
    }

    private final long zzc(zzjy zzjyVar) throws IOException, InterruptedException {
        int i = 0;
        zzjyVar.zza(this.zzapq.data, 0, 1);
        int i2 = this.zzapq.data[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (i3 ^ (-1));
        zzjyVar.zza(this.zzapq.data, 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.zzapq.data[i] & 255) + (i5 << 8);
        }
        this.zzasq += i4 + 1;
        return i5;
    }
}
