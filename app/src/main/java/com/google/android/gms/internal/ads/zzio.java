package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzio implements Runnable {
    private final /* synthetic */ zzij zzaje;
    private final /* synthetic */ zzhs zzajj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzio(zzij zzijVar, zzhs zzhsVar) {
        this.zzaje = zzijVar;
        this.zzajj = zzhsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar;
        zzikVar = this.zzaje.zzaja;
        zzikVar.zzc(this.zzajj);
    }
}
