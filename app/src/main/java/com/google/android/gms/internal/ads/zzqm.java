package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzqm implements Runnable {
    private final /* synthetic */ zzqi zzbmx;
    private final /* synthetic */ int zzbmy;
    private final /* synthetic */ long zzbmz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqm(zzqi zzqiVar, int i, long j) {
        this.zzbmx = zzqiVar;
        this.zzbmy = i;
        this.zzbmz = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqj zzqjVar;
        zzqjVar = this.zzbmx.zzbmw;
        zzqjVar.zzg(this.zzbmy, this.zzbmz);
    }
}
