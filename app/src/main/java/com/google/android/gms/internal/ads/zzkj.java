package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzkj {
    public final int zzape = 1;
    public final byte[] zzapf;

    public zzkj(int i, byte[] bArr) {
        this.zzapf = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzkj zzkjVar = (zzkj) obj;
            if (this.zzape == zzkjVar.zzape && Arrays.equals(this.zzapf, zzkjVar.zzapf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zzape * 31) + Arrays.hashCode(this.zzapf);
    }
}
