package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzaku implements Runnable {
    private final zzakb zzdio;

    private zzaku(zzakb zzakbVar) {
        this.zzdio = zzakbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zzb(zzakb zzakbVar) {
        return new zzaku(zzakbVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdio.destroy();
    }
}
