package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbah implements Runnable {
    private final /* synthetic */ zzbad zzeit;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbah(zzbad zzbadVar) {
        this.zzeit = zzbadVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzeit.zzd("surfaceDestroyed", new String[0]);
    }
}
