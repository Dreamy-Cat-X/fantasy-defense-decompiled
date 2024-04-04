package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdkh implements zzdza<zzbyd> {
    private final /* synthetic */ zzcyl zzgxo;
    private final /* synthetic */ zzbzd zzhgd;
    final /* synthetic */ zzdkf zzhge;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdkh(zzdkf zzdkfVar, zzcyl zzcylVar, zzbzd zzbzdVar) {
        this.zzhge = zzdkfVar;
        this.zzgxo = zzcylVar;
        this.zzhgd = zzbzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        Executor executor;
        Executor executor2;
        final zzvc zze = this.zzhgd.zzagu().zze(th);
        synchronized (this.zzhge) {
            zzdkf.zza(this.zzhge, null);
            this.zzhgd.zzagv().zzd(zze);
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyx)).booleanValue()) {
                executor = this.zzhge.zzfqs;
                executor.execute(new Runnable(this, zze) { // from class: com.google.android.gms.internal.ads.zzdkm
                    private final zzvc zzgxs;
                    private final zzdkh zzhgg;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzhgg = this;
                        this.zzgxs = zze;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcxf zzcxfVar;
                        zzdkh zzdkhVar = this.zzhgg;
                        zzvc zzvcVar = this.zzgxs;
                        zzcxfVar = zzdkhVar.zzhge.zzgwg;
                        zzcxfVar.zzd(zzvcVar);
                    }
                });
                executor2 = this.zzhge.zzfqs;
                executor2.execute(new Runnable(this, zze) { // from class: com.google.android.gms.internal.ads.zzdkl
                    private final zzvc zzgxs;
                    private final zzdkh zzhgg;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzhgg = this;
                        this.zzgxs = zze;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdkp zzdkpVar;
                        zzdkh zzdkhVar = this.zzhgg;
                        zzvc zzvcVar = this.zzgxs;
                        zzdkpVar = zzdkhVar.zzhge.zzhgc;
                        zzdkpVar.zzd(zzvcVar);
                    }
                });
            }
            zzdnp.zza(zze.errorCode, th, "InterstitialAdLoader.onFailure");
            this.zzgxo.zzask();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(zzbyd zzbydVar) {
        Executor executor;
        Executor executor2;
        zzcxf zzcxfVar;
        zzdkp zzdkpVar;
        zzbyd zzbydVar2 = zzbydVar;
        synchronized (this.zzhge) {
            zzdkf.zza(this.zzhge, null);
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyx)).booleanValue()) {
                zzbuj zzakq = zzbydVar2.zzakq();
                zzcxfVar = this.zzhge.zzgwg;
                zzbuj zza = zzakq.zza(zzcxfVar);
                zzdkpVar = this.zzhge.zzhgc;
                zza.zza(zzdkpVar);
            }
            this.zzgxo.onSuccess(zzbydVar2);
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyx)).booleanValue()) {
                executor = this.zzhge.zzfqs;
                executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdkk
                    private final zzdkh zzhgg;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzhgg = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcxf zzcxfVar2;
                        zzcxfVar2 = this.zzhgg.zzhge.zzgwg;
                        zzcxfVar2.onAdLoaded();
                    }
                });
                executor2 = this.zzhge.zzfqs;
                executor2.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdkj
                    private final zzdkh zzhgg;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzhgg = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdkp zzdkpVar2;
                        zzdkpVar2 = this.zzhgg.zzhge.zzhgc;
                        zzdkpVar2.onAdLoaded();
                    }
                });
            }
        }
    }
}
