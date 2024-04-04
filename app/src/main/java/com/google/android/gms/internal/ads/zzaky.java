package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzaky implements Runnable {
    private final zzakb zzdio;

    private zzaky(zzakb zzakbVar) {
        this.zzdio = zzakbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zzb(zzakb zzakbVar) {
        return new zzaky(zzakbVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdio.destroy();
    }
}
