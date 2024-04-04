package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdsu extends zzdsq {
    private String zzhqz;
    private Boolean zzhra;
    private Boolean zzhrb;

    @Override // com.google.android.gms.internal.ads.zzdsq
    public final zzdsq zzhg(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.zzhqz = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdsq
    public final zzdsq zzbn(boolean z) {
        this.zzhra = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdsq
    public final zzdsq zzbo(boolean z) {
        this.zzhrb = true;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdsq
    public final zzdsr zzaxr() {
        String concat = this.zzhqz == null ? "".concat(" clientVersion") : "";
        if (this.zzhra == null) {
            concat = String.valueOf(concat).concat(" shouldGetAdvertisingId");
        }
        if (this.zzhrb == null) {
            concat = String.valueOf(concat).concat(" isGooglePlayServicesAvailable");
        }
        if (!concat.isEmpty()) {
            String valueOf = String.valueOf(concat);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new zzdss(this.zzhqz, this.zzhra.booleanValue(), this.zzhrb.booleanValue());
    }
}
