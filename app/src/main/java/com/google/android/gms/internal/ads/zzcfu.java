package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfu implements zzdza<zzbdh> {
    private final /* synthetic */ zzdmi zzghi;
    private final /* synthetic */ zzdmj zzghj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfu(zzcfp zzcfpVar, zzdmi zzdmiVar, zzdmj zzdmjVar) {
        this.zzghi = zzdmiVar;
        this.zzghj = zzdmjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(zzbdh zzbdhVar) {
        zzbdhVar.zza(this.zzghi, this.zzghj);
    }
}
