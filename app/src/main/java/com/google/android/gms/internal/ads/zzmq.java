package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzmq implements Runnable {
    private final /* synthetic */ zzmr zzbdi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmq(zzmr zzmrVar) {
        this.zzbdi = zzmrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbdi.zzht();
    }
}
