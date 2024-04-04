package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzqk implements Runnable {
    private final /* synthetic */ String zzajb;
    private final /* synthetic */ long zzajc;
    private final /* synthetic */ long zzajd;
    private final /* synthetic */ zzqi zzbmx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqk(zzqi zzqiVar, String str, long j, long j2) {
        this.zzbmx = zzqiVar;
        this.zzajb = str;
        this.zzajc = j;
        this.zzajd = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqj zzqjVar;
        zzqjVar = this.zzbmx.zzbmw;
        zzqjVar.zzd(this.zzajb, this.zzajc, this.zzajd);
    }
}
