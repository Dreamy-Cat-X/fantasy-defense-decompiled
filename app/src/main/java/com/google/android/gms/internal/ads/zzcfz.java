package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzcfz implements com.google.android.gms.ads.internal.overlay.zzu {
    private final zzbrr zzgho;

    private zzcfz(zzbrr zzbrrVar) {
        this.zzgho = zzbrrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.gms.ads.internal.overlay.zzu zza(zzbrr zzbrrVar) {
        return new zzcfz(zzbrrVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzu
    public final void zzwe() {
        this.zzgho.onAdLeftApplication();
    }
}
