package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbnm implements zzdza<zzbmz> {
    private final /* synthetic */ zzdza zzfuy;
    private final /* synthetic */ zzbng zzfuz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnm(zzbng zzbngVar, zzdza zzdzaVar) {
        this.zzfuz = zzbngVar;
        this.zzfuy = zzdzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        this.zzfuz.zzakr();
        this.zzfuy.zzb(th);
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(zzbmz zzbmzVar) {
        this.zzfuz.zzakr();
        this.zzfuy.onSuccess(zzbmzVar);
    }
}
