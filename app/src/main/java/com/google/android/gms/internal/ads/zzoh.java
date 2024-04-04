package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzoh {
    public final int length;
    private int zzahu;
    private final zzof[] zzbht;

    public zzoh(zzof... zzofVarArr) {
        this.zzbht = zzofVarArr;
        this.length = zzofVarArr.length;
    }

    public final zzof zzbe(int i) {
        return this.zzbht[i];
    }

    public final zzof[] zzim() {
        return (zzof[]) this.zzbht.clone();
    }

    public final int hashCode() {
        if (this.zzahu == 0) {
            this.zzahu = Arrays.hashCode(this.zzbht) + 527;
        }
        return this.zzahu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzbht, ((zzoh) obj).zzbht);
    }
}
