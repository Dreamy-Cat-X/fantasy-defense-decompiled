package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbnn implements zzdza<zzbnf> {
    private final /* synthetic */ zzdza zzfuy;
    private final /* synthetic */ zzbng zzfuz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnn(zzbng zzbngVar, zzdza zzdzaVar) {
        this.zzfuz = zzbngVar;
        this.zzfuy = zzdzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        this.zzfuy.zzb(th);
        this.zzfuz.zzakr();
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(zzbnf zzbnfVar) {
        this.zzfuz.zza(zzbnfVar.zzfus, this.zzfuy);
    }
}
