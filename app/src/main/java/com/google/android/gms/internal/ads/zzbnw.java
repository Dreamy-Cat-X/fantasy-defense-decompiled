package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbnw<T> {
    private final Executor executor;
    private final zzcmm zzfvd;
    private final zzdmx zzfve;
    private final zzdqy zzfvf;
    private final zzbii zzfvg;
    private final zzcug<T> zzfvh;
    private final zzbuz zzfvi;
    private final zzdmt zzfvj;
    private final zzcni zzfvk;
    private final zzbpw zzfvl;
    private final zzcnf zzfvm;
    private final zzcqx zzfvn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnw(zzcmm zzcmmVar, zzdmx zzdmxVar, zzdqy zzdqyVar, zzbii zzbiiVar, zzcug<T> zzcugVar, zzbuz zzbuzVar, zzdmt zzdmtVar, zzcni zzcniVar, zzbpw zzbpwVar, Executor executor, zzcnf zzcnfVar, zzcqx zzcqxVar) {
        this.zzfvd = zzcmmVar;
        this.zzfve = zzdmxVar;
        this.zzfvf = zzdqyVar;
        this.zzfvg = zzbiiVar;
        this.zzfvh = zzcugVar;
        this.zzfvi = zzbuzVar;
        this.zzfvj = zzdmtVar;
        this.zzfvk = zzcniVar;
        this.zzfvl = zzbpwVar;
        this.executor = executor;
        this.zzfvm = zzcnfVar;
        this.zzfvn = zzcqxVar;
    }

    private final zzdzl<zzdmt> zza(zzdzl<zzasu> zzdzlVar) {
        if (this.zzfvj != null) {
            return this.zzfvf.zzt(zzdqz.SERVER_TRANSACTION).zze(zzdyz.zzag(this.zzfvj)).zzaxm();
        }
        com.google.android.gms.ads.internal.zzp.zzkw().zzmt();
        if (this.zzfve.zzhjd.zzchk != null) {
            return this.zzfvf.zzt(zzdqz.SERVER_TRANSACTION).zze(this.zzfvd.zzarq()).zzaxm();
        }
        zzdqq<I> zza = this.zzfvf.zza((zzdqy) zzdqz.SERVER_TRANSACTION, (zzdzl) zzdzlVar);
        zzcnf zzcnfVar = this.zzfvm;
        zzcnfVar.getClass();
        return zza.zza(zzbnz.zza(zzcnfVar)).zzaxm();
    }

    public final zzdzl<zzdmt> zza(zzasu zzasuVar) {
        return zza(zzdyz.zzag(zzasuVar));
    }

    public final zzdzl<zzdmt> zzakx() {
        return zza(this.zzfvl.zzalg());
    }

    public final zzdzl<T> zzb(zzdzl<zzdmt> zzdzlVar) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcvp)).booleanValue()) {
            return this.zzfvf.zza((zzdqy) zzdqz.RENDERER, (zzdzl) zzdzlVar).zza(this.zzfvg).zza(this.zzfvh).zzaxm();
        }
        return this.zzfvf.zza((zzdqy) zzdqz.RENDERER, (zzdzl) zzdzlVar).zza(this.zzfvg).zza(this.zzfvh).zza(((Integer) zzwo.zzqq().zzd(zzabh.zzcvq)).intValue(), TimeUnit.SECONDS).zzaxm();
    }

    public final zzdzl<T> zzb(zzasu zzasuVar) {
        return zzb(zza(zzasuVar));
    }

    public final zzdzl<T> zzaky() {
        return zzb(zzakx());
    }

    public final zzbuz zzakz() {
        return this.zzfvi;
    }

    public final zzdzl<zzasu> zza(final zzdou zzdouVar) {
        zzdql zzaxm = this.zzfvf.zza((zzdqy) zzdqz.GET_CACHE_KEY, (zzdzl) this.zzfvl.zzalg()).zza(new zzdyj(this, zzdouVar) { // from class: com.google.android.gms.internal.ads.zzbny
            private final zzbnw zzfvo;
            private final zzdou zzfvp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvo = this;
                this.zzfvp = zzdouVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzfvo.zza(this.zzfvp, (zzasu) obj);
            }
        }).zzaxm();
        zzdyz.zza(zzaxm, new zzbob(this), this.executor);
        return zzaxm;
    }

    public final zzdzl<Void> zzc(zzasu zzasuVar) {
        zzdql zzaxm = this.zzfvf.zza((zzdqy) zzdqz.NOTIFY_CACHE_HIT, (zzdzl) this.zzfvk.zzm(zzasuVar)).zzaxm();
        zzdyz.zza(zzaxm, new zzboa(this), this.executor);
        return zzaxm;
    }

    public final zzvc zze(Throwable th) {
        return zzdns.zza(th, this.zzfvn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(zzdou zzdouVar, zzasu zzasuVar) throws Exception {
        zzasuVar.zzdvp = zzdouVar;
        return this.zzfvk.zzl(zzasuVar);
    }
}
