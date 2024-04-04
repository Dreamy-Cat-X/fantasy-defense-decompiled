package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzalk implements zzazg<zzakb> {
    final /* synthetic */ zzalf zzdjc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalk(zzalf zzalfVar) {
        this.zzdjc = zzalfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazg
    public final /* synthetic */ void zzg(zzakb zzakbVar) {
        final zzakb zzakbVar2 = zzakbVar;
        zzayv.zzegm.execute(new Runnable(this, zzakbVar2) { // from class: com.google.android.gms.internal.ads.zzalj
            private final zzalk zzdja;
            private final zzakb zzdjb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdja = this;
                this.zzdjb = zzakbVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.ads.internal.util.zzau zzauVar;
                zzalk zzalkVar = this.zzdja;
                zzakb zzakbVar3 = this.zzdjb;
                zzauVar = zzalkVar.zzdjc.zzdig;
                zzauVar.zzg(zzakbVar3);
                zzakbVar3.destroy();
            }
        });
    }
}
