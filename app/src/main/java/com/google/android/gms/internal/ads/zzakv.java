package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzakv implements Runnable {
    private final /* synthetic */ zzalf zzdil;
    private final /* synthetic */ zzakb zzdim;
    private final /* synthetic */ zzako zzdin;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakv(zzako zzakoVar, zzalf zzalfVar, zzakb zzakbVar) {
        this.zzdin = zzakoVar;
        this.zzdil = zzalfVar;
        this.zzdim = zzakbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.zzdin.lock;
        synchronized (obj) {
            if (this.zzdil.getStatus() != -1 && this.zzdil.getStatus() != 1) {
                this.zzdil.reject();
                zzdzk zzdzkVar = zzayv.zzegm;
                zzakb zzakbVar = this.zzdim;
                zzakbVar.getClass();
                zzdzkVar.execute(zzaky.zzb(zzakbVar));
                com.google.android.gms.ads.internal.util.zzd.zzeb("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
