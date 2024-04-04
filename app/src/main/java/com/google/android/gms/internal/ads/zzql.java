package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzql implements Runnable {
    private final /* synthetic */ zzjl zzajf;
    private final /* synthetic */ zzqi zzbmx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzql(zzqi zzqiVar, zzjl zzjlVar) {
        this.zzbmx = zzqiVar;
        this.zzajf = zzjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqj zzqjVar;
        zzqjVar = this.zzbmx.zzbmw;
        zzqjVar.zze(this.zzajf);
    }
}
