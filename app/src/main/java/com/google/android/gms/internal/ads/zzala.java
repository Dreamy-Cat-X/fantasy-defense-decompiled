package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzala implements zzaze {
    private final /* synthetic */ zzako zzdin;
    private final /* synthetic */ zzalf zzdir;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzala(zzako zzakoVar, zzalf zzalfVar) {
        this.zzdin = zzakoVar;
        this.zzdir = zzalfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaze
    public final void run() {
        Object obj;
        obj = this.zzdin.lock;
        synchronized (obj) {
            this.zzdin.status = 1;
            com.google.android.gms.ads.internal.util.zzd.zzeb("Failed loading new engine. Marking new engine destroyable.");
            this.zzdir.zzun();
        }
    }
}
