package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzcru implements zzbmw {
    private final zzdno zzgsa;

    private zzcru(zzdno zzdnoVar) {
        this.zzgsa = zzdnoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbmw zza(zzdno zzdnoVar) {
        return new zzcru(zzdnoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final zzyu getVideoController() {
        return this.zzgsa.getVideoController();
    }
}
