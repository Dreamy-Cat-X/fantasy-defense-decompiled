package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdlp implements zzdza<zzcgg> {
    private final /* synthetic */ zzcyl zzgxo;
    private final /* synthetic */ zzdlu zzhgt;
    final /* synthetic */ zzdlo zzhgu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdlp(zzdlo zzdloVar, zzcyl zzcylVar, zzdlu zzdluVar) {
        this.zzhgu = zzdloVar;
        this.zzgxo = zzcylVar;
        this.zzhgt = zzdluVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        zzdjv zzdjvVar;
        final zzvc zze;
        zzdkp zzdkpVar;
        zzcgm zze2;
        Executor executor;
        zzdjvVar = this.zzhgu.zzhdt;
        zzcgn zzcgnVar = (zzcgn) zzdjvVar.zzaup();
        if (zzcgnVar == null) {
            zze = zzdns.zza(th, (zzcqx) null);
        } else {
            zze = zzcgnVar.zzagu().zze(th);
        }
        synchronized (this.zzhgu) {
            if (zzcgnVar != null) {
                zzcgnVar.zzagv().zzd(zze);
                executor = this.zzhgu.zzfqs;
                executor.execute(new Runnable(this, zze) { // from class: com.google.android.gms.internal.ads.zzdlr
                    private final zzvc zzgxs;
                    private final zzdlp zzhgv;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzhgv = this;
                        this.zzgxs = zze;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdkp zzdkpVar2;
                        zzdlp zzdlpVar = this.zzhgv;
                        zzvc zzvcVar = this.zzgxs;
                        zzdkpVar2 = zzdlpVar.zzhgu.zzhgs;
                        zzdkpVar2.zzd(zzvcVar);
                    }
                });
            } else {
                zzdkpVar = this.zzhgu.zzhgs;
                zzdkpVar.zzd(zze);
                zze2 = this.zzhgu.zze(this.zzhgt);
                zze2.zzaid().zzagu().zzakz().zzalv();
            }
            zzdnp.zza(zze.errorCode, th, "RewardedAdLoader.onFailure");
            this.zzgxo.zzask();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(zzcgg zzcggVar) {
        zzdkp zzdkpVar;
        Executor executor;
        zzdkp zzdkpVar2;
        zzdkp zzdkpVar3;
        zzcgg zzcggVar2 = zzcggVar;
        synchronized (this.zzhgu) {
            zzbuj zzakq = zzcggVar2.zzakq();
            zzdkpVar = this.zzhgu.zzhgs;
            zzakq.zza(zzdkpVar);
            this.zzgxo.onSuccess(zzcggVar2);
            executor = this.zzhgu.zzfqs;
            zzdkpVar2 = this.zzhgu.zzhgs;
            zzdkpVar2.getClass();
            executor.execute(zzdls.zzb(zzdkpVar2));
            zzdkpVar3 = this.zzhgu.zzhgs;
            zzdkpVar3.onAdMetadataChanged();
        }
    }
}
