package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbas implements Runnable {
    private boolean zzbsq = false;
    private zzbad zzeiy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbas(zzbad zzbadVar) {
        this.zzeiy = zzbadVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzbsq) {
            return;
        }
        this.zzeiy.zzaaq();
        zzabj();
    }

    public final void pause() {
        this.zzbsq = true;
        this.zzeiy.zzaaq();
    }

    public final void resume() {
        this.zzbsq = false;
        zzabj();
    }

    private final void zzabj() {
        com.google.android.gms.ads.internal.util.zzm.zzecu.removeCallbacks(this);
        com.google.android.gms.ads.internal.util.zzm.zzecu.postDelayed(this, 250L);
    }
}
