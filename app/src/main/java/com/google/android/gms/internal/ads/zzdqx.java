package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [O] */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdqx<O> implements zzdza<O> {
    private final /* synthetic */ zzdql zzhoq;
    private final /* synthetic */ zzdqq zzhor;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqx(zzdqq zzdqqVar, zzdql zzdqlVar) {
        this.zzhor = zzdqqVar;
        this.zzhoq = zzdqlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void onSuccess(O o) {
        zzdqk.zzc(this.zzhor.zzhoj).zzc(this.zzhoq);
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        zzdqk.zzc(this.zzhor.zzhoj).zza(this.zzhoq, th);
    }
}
