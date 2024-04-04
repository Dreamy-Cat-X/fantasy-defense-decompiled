package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzqn implements Runnable {
    private final /* synthetic */ zzhs zzajj;
    private final /* synthetic */ zzqi zzbmx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqn(zzqi zzqiVar, zzhs zzhsVar) {
        this.zzbmx = zzqiVar;
        this.zzajj = zzhsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqj zzqjVar;
        zzqjVar = this.zzbmx.zzbmw;
        zzqjVar.zzk(this.zzajj);
    }
}
