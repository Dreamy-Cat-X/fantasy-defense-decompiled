package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzcso implements Runnable {
    private final zzchn zzgrn;

    private zzcso(zzchn zzchnVar) {
        this.zzgrn = zzchnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzchn zzchnVar) {
        return new zzcso(zzchnVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzgrn.zzapu();
    }
}
