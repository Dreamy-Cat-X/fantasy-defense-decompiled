package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzil implements Runnable {
    private final /* synthetic */ String zzajb;
    private final /* synthetic */ long zzajc;
    private final /* synthetic */ long zzajd;
    private final /* synthetic */ zzij zzaje;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzil(zzij zzijVar, String str, long j, long j2) {
        this.zzaje = zzijVar;
        this.zzajb = str;
        this.zzajc = j;
        this.zzajd = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar;
        zzikVar = this.zzaje.zzaja;
        zzikVar.zzb(this.zzajb, this.zzajc, this.zzajd);
    }
}
