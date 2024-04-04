package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzcbb implements Runnable {
    private final zzcbq zzgcb;

    private zzcbb(zzcbq zzcbqVar) {
        this.zzgcb = zzcbqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzcbq zzcbqVar) {
        return new zzcbb(zzcbqVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzgcb.zzanj();
    }
}
