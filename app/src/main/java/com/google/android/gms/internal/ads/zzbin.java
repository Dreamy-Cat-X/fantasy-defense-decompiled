package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbin implements zzepq<zzbik> {
    private final zzeqd<com.google.android.gms.ads.internal.util.zzf> zzfco;

    private zzbin(zzeqd<com.google.android.gms.ads.internal.util.zzf> zzeqdVar) {
        this.zzfco = zzeqdVar;
    }

    public static zzbin zza(zzeqd<com.google.android.gms.ads.internal.util.zzf> zzeqdVar) {
        return new zzbin(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbik(this.zzfco.get());
    }
}
