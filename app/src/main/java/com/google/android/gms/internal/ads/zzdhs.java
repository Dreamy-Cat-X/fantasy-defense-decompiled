package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [AppOpenAd] */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdhs<AppOpenAd> implements zzdza<AppOpenAd> {
    private final /* synthetic */ zzcyl zzgxo;
    private final /* synthetic */ zzdhu zzhdx;
    final /* synthetic */ zzdhn zzhdy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdhs(zzdhn zzdhnVar, zzcyl zzcylVar, zzdhu zzdhuVar) {
        this.zzhdy = zzdhnVar;
        this.zzgxo = zzcylVar;
        this.zzhdx = zzdhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        zzdjv zzdjvVar;
        final zzvc zze;
        zzdht zzdhtVar;
        zzbqa zzb;
        Executor executor;
        zzdjvVar = this.zzhdy.zzhdt;
        zzbkj zzbkjVar = (zzbkj) zzdjvVar.zzaup();
        if (zzbkjVar == null) {
            zze = zzdns.zza(th, (zzcqx) null);
        } else {
            zze = zzbkjVar.zzagu().zze(th);
        }
        synchronized (this.zzhdy) {
            zzdhn.zza(this.zzhdy, (zzdzl) null);
            if (zzbkjVar != null) {
                zzbkjVar.zzagv().zzd(zze);
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyw)).booleanValue()) {
                    executor = this.zzhdy.zzfqs;
                    executor.execute(new Runnable(this, zze) { // from class: com.google.android.gms.internal.ads.zzdhr
                        private final zzvc zzgxs;
                        private final zzdhs zzhdw;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzhdw = this;
                            this.zzgxs = zze;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdht zzdhtVar2;
                            zzdhs zzdhsVar = this.zzhdw;
                            zzvc zzvcVar = this.zzgxs;
                            zzdhtVar2 = zzdhsVar.zzhdy.zzhds;
                            zzdhtVar2.zzd(zzvcVar);
                        }
                    });
                }
            } else {
                zzdhtVar = this.zzhdy.zzhds;
                zzdhtVar.zzd(zze);
                zzb = this.zzhdy.zzb(this.zzhdx);
                ((zzbkj) zzb.zzagd()).zzagu().zzakz().zzalv();
            }
            zzdnp.zza(zze.errorCode, th, "AppOpenAdLoader.onFailure");
            this.zzgxo.zzask();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(Object obj) {
        zzdht zzdhtVar;
        zzbmz zzbmzVar = (zzbmz) obj;
        synchronized (this.zzhdy) {
            zzdhn.zza(this.zzhdy, (zzdzl) null);
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyw)).booleanValue()) {
                zzbuj zzakq = zzbmzVar.zzakq();
                zzdhtVar = this.zzhdy.zzhds;
                zzakq.zza(zzdhtVar);
            }
            this.zzgxo.onSuccess(zzbmzVar);
        }
    }
}
