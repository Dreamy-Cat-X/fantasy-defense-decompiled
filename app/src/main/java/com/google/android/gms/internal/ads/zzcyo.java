package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcyo implements zzdza<zzbmz> {
    private final /* synthetic */ zzcyl zzgxo;
    private final /* synthetic */ zzbzz zzgxp;
    final /* synthetic */ zzcyn zzgxq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcyo(zzcyn zzcynVar, zzcyl zzcylVar, zzbzz zzbzzVar) {
        this.zzgxq = zzcynVar;
        this.zzgxo = zzcylVar;
        this.zzgxp = zzbzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        zzbff zzbffVar;
        final zzvc zze = this.zzgxp.zzagu().zze(th);
        this.zzgxp.zzagv().zzd(zze);
        zzbffVar = this.zzgxq.zzgtg;
        zzbffVar.zzaet().execute(new Runnable(this, zze) { // from class: com.google.android.gms.internal.ads.zzcyq
            private final zzcyo zzgxr;
            private final zzvc zzgxs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgxr = this;
                this.zzgxs = zze;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcyh zzcyhVar;
                zzcyo zzcyoVar = this.zzgxr;
                zzvc zzvcVar = this.zzgxs;
                zzcyhVar = zzcyoVar.zzgxq.zzgxm;
                zzcyhVar.zzast().zzd(zzvcVar);
            }
        });
        zzdnp.zza(zze.errorCode, th, "NativeAdLoader.onFailure");
        this.zzgxo.zzask();
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(zzbmz zzbmzVar) {
        zzcyh zzcyhVar;
        zzbff zzbffVar;
        zzbmz zzbmzVar2 = zzbmzVar;
        synchronized (this.zzgxq) {
            zzbuj zzakq = zzbmzVar2.zzakq();
            zzcyhVar = this.zzgxq.zzgxm;
            zzakq.zza(zzcyhVar.zzasr());
            this.zzgxo.onSuccess(zzbmzVar2);
            zzbffVar = this.zzgxq.zzgtg;
            zzbffVar.zzaet().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcyr
                private final zzcyo zzgxr;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgxr = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzcyh zzcyhVar2;
                    zzcyhVar2 = this.zzgxr.zzgxq.zzgxm;
                    zzcyhVar2.zzass().onAdLoaded();
                }
            });
        }
    }
}
