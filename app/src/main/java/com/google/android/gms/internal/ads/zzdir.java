package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzdir implements Runnable {
    private final zzcxf zzgxg;

    private zzdir(zzcxf zzcxfVar) {
        this.zzgxg = zzcxfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zzb(zzcxf zzcxfVar) {
        return new zzdir(zzcxfVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzgxg.onAdLoaded();
    }
}
