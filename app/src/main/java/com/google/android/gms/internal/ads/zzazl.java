package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzazl<T> implements zzdza<T> {
    private final /* synthetic */ zzazg zzegx;
    private final /* synthetic */ zzaze zzegy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazl(zzazj zzazjVar, zzazg zzazgVar, zzaze zzazeVar) {
        this.zzegx = zzazgVar;
        this.zzegy = zzazeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void onSuccess(T t) {
        this.zzegx.zzg(t);
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        this.zzegy.run();
    }
}
