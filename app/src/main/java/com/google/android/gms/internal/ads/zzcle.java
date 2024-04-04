package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcle implements zzdza<String> {
    final /* synthetic */ zzckx zzglo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcle(zzckx zzckxVar) {
        this.zzglo = zzckxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        long j;
        zzazc zzazcVar;
        synchronized (this) {
            zzckx.zza(this.zzglo, true);
            zzckx zzckxVar = this.zzglo;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime();
            j = this.zzglo.zzglb;
            zzckxVar.zza("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzazcVar = this.zzglo.zzglc;
            zzazcVar.setException(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(@Nullable String str) {
        long j;
        Executor executor;
        final String str2 = str;
        synchronized (this) {
            zzckx.zza(this.zzglo, true);
            zzckx zzckxVar = this.zzglo;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime();
            j = this.zzglo.zzglb;
            zzckxVar.zza("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.zzglo.executor;
            executor.execute(new Runnable(this, str2) { // from class: com.google.android.gms.internal.ads.zzclh
                private final String zzdhw;
                private final zzcle zzglt;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzglt = this;
                    this.zzdhw = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzcle zzcleVar = this.zzglt;
                    zzcleVar.zzglo.zzgh(this.zzdhw);
                }
            });
        }
    }
}
