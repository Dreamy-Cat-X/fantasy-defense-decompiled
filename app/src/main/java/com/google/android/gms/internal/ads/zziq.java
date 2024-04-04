package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zziq implements Runnable {
    private final /* synthetic */ zzij zzaje;
    private final /* synthetic */ zzjl zzajl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziq(zzij zzijVar, zzjl zzjlVar) {
        this.zzaje = zzijVar;
        this.zzajl = zzjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar;
        this.zzajl.zzgn();
        zzikVar = this.zzaje.zzaja;
        zzikVar.zzd(this.zzajl);
    }
}
