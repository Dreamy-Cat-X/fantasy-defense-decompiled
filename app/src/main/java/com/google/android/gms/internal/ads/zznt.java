package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zznt {
    public static final zznt zzbgs = new zznt(new zznq[0]);
    public final int length;
    private int zzahu;
    private final zznq[] zzbgt;

    public zznt(zznq... zznqVarArr) {
        this.zzbgt = zznqVarArr;
        this.length = zznqVarArr.length;
    }

    public final zznq zzbc(int i) {
        return this.zzbgt[i];
    }

    public final int zza(zznq zznqVar) {
        for (int i = 0; i < this.length; i++) {
            if (this.zzbgt[i] == zznqVar) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.zzahu == 0) {
            this.zzahu = Arrays.hashCode(this.zzbgt);
        }
        return this.zzahu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zznt zzntVar = (zznt) obj;
            if (this.length == zzntVar.length && Arrays.equals(this.zzbgt, zzntVar.zzbgt)) {
                return true;
            }
        }
        return false;
    }
}
