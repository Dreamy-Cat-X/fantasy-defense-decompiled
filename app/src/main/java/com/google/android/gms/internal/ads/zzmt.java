package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzmt implements Runnable {
    private final /* synthetic */ zzmr zzbdi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmt(zzmr zzmrVar) {
        this.zzbdi = zzmrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        zzna zznaVar;
        z = this.zzbdi.zzaft;
        if (z) {
            return;
        }
        zznaVar = this.zzbdi.zzbdv;
        zznaVar.zza((zzna) this.zzbdi);
    }
}
