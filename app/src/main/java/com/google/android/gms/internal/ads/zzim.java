package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzim implements Runnable {
    private final /* synthetic */ zzij zzaje;
    private final /* synthetic */ zzjl zzajf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzim(zzij zzijVar, zzjl zzjlVar) {
        this.zzaje = zzijVar;
        this.zzajf = zzjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar;
        zzikVar = this.zzaje.zzaja;
        zzikVar.zzc(this.zzajf);
    }
}
