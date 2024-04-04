package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzqp implements Runnable {
    private final /* synthetic */ zzqi zzbmx;
    private final /* synthetic */ int zzbnb;
    private final /* synthetic */ int zzbnc;
    private final /* synthetic */ int zzbnd;
    private final /* synthetic */ float zzbne;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqp(zzqi zzqiVar, int i, int i2, int i3, float f) {
        this.zzbmx = zzqiVar;
        this.zzbnb = i;
        this.zzbnc = i2;
        this.zzbnd = i3;
        this.zzbne = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqj zzqjVar;
        zzqjVar = this.zzbmx.zzbmw;
        zzqjVar.zzb(this.zzbnb, this.zzbnc, this.zzbnd, this.zzbne);
    }
}
