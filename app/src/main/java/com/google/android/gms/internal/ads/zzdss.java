package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdss extends zzdsr {
    private final String zzhqz;
    private final boolean zzwj;
    private final boolean zzzc;

    private zzdss(String str, boolean z, boolean z2) {
        this.zzhqz = str;
        this.zzwj = z;
        this.zzzc = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzdsr
    public final String zzaxs() {
        return this.zzhqz;
    }

    @Override // com.google.android.gms.internal.ads.zzdsr
    public final boolean zzaxt() {
        return this.zzwj;
    }

    @Override // com.google.android.gms.internal.ads.zzdsr
    public final boolean zzcm() {
        return this.zzzc;
    }

    public final String toString() {
        String str = this.zzhqz;
        boolean z = this.zzwj;
        boolean z2 = this.zzzc;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdsr) {
            zzdsr zzdsrVar = (zzdsr) obj;
            if (this.zzhqz.equals(zzdsrVar.zzaxs()) && this.zzwj == zzdsrVar.zzaxt() && this.zzzc == zzdsrVar.zzcm()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zzhqz.hashCode() ^ 1000003) * 1000003) ^ (this.zzwj ? 1231 : 1237)) * 1000003) ^ (this.zzzc ? 1231 : 1237);
    }
}
