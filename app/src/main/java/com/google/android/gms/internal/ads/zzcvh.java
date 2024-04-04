package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcvh implements zzbxs {
    private final /* synthetic */ zzdmi zzgtm;
    private final /* synthetic */ zzdmt zzgue;
    private final /* synthetic */ zzcqs zzguf;
    final /* synthetic */ zzcvf zzgug;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvh(zzcvf zzcvfVar, zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs zzcqsVar) {
        this.zzgug = zzcvfVar;
        this.zzgue = zzdmtVar;
        this.zzgtm = zzdmiVar;
        this.zzguf = zzcqsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void onInitializationSucceeded() {
        Executor executor;
        executor = this.zzgug.zzfqs;
        final zzdmt zzdmtVar = this.zzgue;
        final zzdmi zzdmiVar = this.zzgtm;
        final zzcqs zzcqsVar = this.zzguf;
        executor.execute(new Runnable(this, zzdmtVar, zzdmiVar, zzcqsVar) { // from class: com.google.android.gms.internal.ads.zzcvg
            private final zzdmi zzfti;
            private final zzdmt zzggd;
            private final zzcvh zzguc;
            private final zzcqs zzgud;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzguc = this;
                this.zzggd = zzdmtVar;
                this.zzfti = zzdmiVar;
                this.zzgud = zzcqsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcvh zzcvhVar = this.zzguc;
                zzdmt zzdmtVar2 = this.zzggd;
                zzdmi zzdmiVar2 = this.zzfti;
                zzcqs zzcqsVar2 = this.zzgud;
                zzcvf zzcvfVar = zzcvhVar.zzgug;
                zzcvf.zzc(zzdmtVar2, zzdmiVar2, zzcqsVar2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzdz(int i) {
        String valueOf = String.valueOf(this.zzguf.zzchy);
        com.google.android.gms.ads.internal.util.zzd.zzex(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
    }
}
