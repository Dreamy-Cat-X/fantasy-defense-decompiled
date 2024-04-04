package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zznq {
    public final int length;
    private int zzahu;
    private final zzhs[] zzbfo;

    public zznq(zzhs... zzhsVarArr) {
        zzpf.checkState(zzhsVarArr.length > 0);
        this.zzbfo = zzhsVarArr;
        this.length = zzhsVarArr.length;
    }

    public final zzhs zzbb(int i) {
        return this.zzbfo[i];
    }

    public final int zzh(zzhs zzhsVar) {
        int i = 0;
        while (true) {
            zzhs[] zzhsVarArr = this.zzbfo;
            if (i >= zzhsVarArr.length) {
                return -1;
            }
            if (zzhsVar == zzhsVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.zzahu == 0) {
            this.zzahu = Arrays.hashCode(this.zzbfo) + 527;
        }
        return this.zzahu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zznq zznqVar = (zznq) obj;
            if (this.length == zznqVar.length && Arrays.equals(this.zzbfo, zznqVar.zzbfo)) {
                return true;
            }
        }
        return false;
    }
}
