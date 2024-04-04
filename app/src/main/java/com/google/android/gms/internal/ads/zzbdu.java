package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbdu implements Runnable {
    private final /* synthetic */ zzbds zzeqq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdu(zzbds zzbdsVar) {
        this.zzeqq = zzbdsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbdh zzbdhVar;
        zzbdhVar = this.zzeqq.zzeqn;
        zzbdhVar.destroy();
    }
}
