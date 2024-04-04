package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzcux implements Runnable {
    private final zzchn zzgrn;

    private zzcux(zzchn zzchnVar) {
        this.zzgrn = zzchnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzchn zzchnVar) {
        return new zzcux(zzchnVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzgrn.zzapu();
    }
}
