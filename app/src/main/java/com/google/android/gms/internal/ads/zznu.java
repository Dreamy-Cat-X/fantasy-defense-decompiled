package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zznu implements zzof {
    private final int length;
    private int zzahu;
    private final zzhs[] zzbfo;
    private final zznq zzbgu;
    private final int[] zzbgv;
    private final long[] zzbgw;

    public zznu(zznq zznqVar, int... iArr) {
        int i = 0;
        zzpf.checkState(iArr.length > 0);
        this.zzbgu = (zznq) zzpf.checkNotNull(zznqVar);
        int length = iArr.length;
        this.length = length;
        this.zzbfo = new zzhs[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzbfo[i2] = zznqVar.zzbb(iArr[i2]);
        }
        Arrays.sort(this.zzbfo, new zznw());
        this.zzbgv = new int[this.length];
        while (true) {
            int i3 = this.length;
            if (i < i3) {
                this.zzbgv[i] = zznqVar.zzh(this.zzbfo[i]);
                i++;
            } else {
                this.zzbgw = new long[i3];
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final zznq zzil() {
        return this.zzbgu;
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final int length() {
        return this.zzbgv.length;
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final zzhs zzbb(int i) {
        return this.zzbfo[i];
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final int zzbd(int i) {
        return this.zzbgv[0];
    }

    public int hashCode() {
        if (this.zzahu == 0) {
            this.zzahu = (System.identityHashCode(this.zzbgu) * 31) + Arrays.hashCode(this.zzbgv);
        }
        return this.zzahu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zznu zznuVar = (zznu) obj;
            if (this.zzbgu == zznuVar.zzbgu && Arrays.equals(this.zzbgv, zznuVar.zzbgv)) {
                return true;
            }
        }
        return false;
    }
}
