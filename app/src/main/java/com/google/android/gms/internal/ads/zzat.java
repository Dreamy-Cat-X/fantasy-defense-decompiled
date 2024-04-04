package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzat {
    private static final Comparator<byte[]> zzcb = new zzaw();
    private final List<byte[]> zzbx = new ArrayList();
    private final List<byte[]> zzby = new ArrayList(64);
    private int zzbz = 0;
    private final int zzca = 4096;

    public zzat(int i) {
    }

    public final synchronized byte[] zzf(int i) {
        for (int i2 = 0; i2 < this.zzby.size(); i2++) {
            byte[] bArr = this.zzby.get(i2);
            if (bArr.length >= i) {
                this.zzbz -= bArr.length;
                this.zzby.remove(i2);
                this.zzbx.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public final synchronized void zza(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.zzca) {
                this.zzbx.add(bArr);
                int binarySearch = Collections.binarySearch(this.zzby, bArr, zzcb);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.zzby.add(binarySearch, bArr);
                this.zzbz += bArr.length;
                zzn();
            }
        }
    }

    private final synchronized void zzn() {
        while (this.zzbz > this.zzca) {
            byte[] remove = this.zzbx.remove(0);
            this.zzby.remove(remove);
            this.zzbz -= remove.length;
        }
    }
}
