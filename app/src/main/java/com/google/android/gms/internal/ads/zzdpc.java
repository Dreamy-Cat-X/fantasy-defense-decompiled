package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdpc implements zzdpa {
    private final String zzck;

    public zzdpc(String str) {
        this.zzck = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdpa
    public final boolean equals(Object obj) {
        if (obj instanceof zzdpc) {
            return this.zzck.equals(((zzdpc) obj).zzck);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdpa
    public final int hashCode() {
        return this.zzck.hashCode();
    }

    public final String toString() {
        return this.zzck;
    }
}
