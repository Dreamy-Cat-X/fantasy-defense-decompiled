package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzakx implements zzazg<zzakb> {
    private final /* synthetic */ zzako zzdin;
    private final /* synthetic */ zzalf zzdir;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakx(zzako zzakoVar, zzalf zzalfVar) {
        this.zzdin = zzakoVar;
        this.zzdir = zzalfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazg
    public final /* synthetic */ void zzg(zzakb zzakbVar) {
        Object obj;
        zzalf zzalfVar;
        zzalf zzalfVar2;
        zzalf zzalfVar3;
        obj = this.zzdin.lock;
        synchronized (obj) {
            this.zzdin.status = 0;
            zzalfVar = this.zzdin.zzdih;
            if (zzalfVar != null) {
                zzalf zzalfVar4 = this.zzdir;
                zzalfVar2 = this.zzdin.zzdih;
                if (zzalfVar4 != zzalfVar2) {
                    com.google.android.gms.ads.internal.util.zzd.zzeb("New JS engine is loaded, marking previous one as destroyable.");
                    zzalfVar3 = this.zzdin.zzdih;
                    zzalfVar3.zzun();
                }
            }
            this.zzdin.zzdih = this.zzdir;
        }
    }
}
