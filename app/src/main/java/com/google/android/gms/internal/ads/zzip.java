package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzip implements Runnable {
    private final /* synthetic */ zzij zzaje;
    private final /* synthetic */ int zzajk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzip(zzij zzijVar, int i) {
        this.zzaje = zzijVar;
        this.zzajk = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar;
        zzikVar = this.zzaje.zzaja;
        zzikVar.zzx(this.zzajk);
    }
}
