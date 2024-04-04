package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzqq implements Runnable {
    private final /* synthetic */ zzjl zzajl;
    private final /* synthetic */ zzqi zzbmx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqq(zzqi zzqiVar, zzjl zzjlVar) {
        this.zzbmx = zzqiVar;
        this.zzajl = zzjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqj zzqjVar;
        this.zzajl.zzgn();
        zzqjVar = this.zzbmx.zzbmw;
        zzqjVar.zzf(this.zzajl);
    }
}
