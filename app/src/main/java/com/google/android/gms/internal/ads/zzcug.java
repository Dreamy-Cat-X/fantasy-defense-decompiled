package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcug<AdT> implements zzdyj<zzdmt, AdT> {
    private final Executor executor;
    private final zzdsf zzfpn;
    private final zzdsh zzfpv;
    private final ScheduledExecutorService zzfro;
    private final zzdqy zzfvf;
    private final zzcqx zzfvn;
    private final zzbqu zzfyz;
    private final zzbna<AdT> zzgtr;
    private final zzcud zzgts;

    public zzcug(zzdqy zzdqyVar, zzcud zzcudVar, zzbqu zzbquVar, zzdsf zzdsfVar, zzdsh zzdshVar, zzbna<AdT> zzbnaVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzcqx zzcqxVar) {
        this.zzfvf = zzdqyVar;
        this.zzgts = zzcudVar;
        this.zzfyz = zzbquVar;
        this.zzfpn = zzdsfVar;
        this.zzfpv = zzdshVar;
        this.zzgtr = zzbnaVar;
        this.executor = executor;
        this.zzfro = scheduledExecutorService;
        this.zzfvn = zzcqxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    @Override // com.google.android.gms.internal.ads.zzdyj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ zzdzl zzf(zzdmt zzdmtVar) throws Exception {
        String str;
        zzdmk zzdmkVar;
        boolean z;
        int i;
        final zzdmt zzdmtVar2 = zzdmtVar;
        int i2 = zzdmtVar2.zzhiz.zzera.responseCode;
        if (i2 != 0) {
            if (i2 < 200 || i2 >= 300) {
                if (i2 < 300 || i2 >= 400) {
                    StringBuilder sb = new StringBuilder(46);
                    sb.append("Received error HTTP response code: ");
                    sb.append(i2);
                    str = sb.toString();
                } else {
                    str = "No location header to follow redirect or too many redirects.";
                }
            } else if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcvn)).booleanValue()) {
                str = "No fill.";
            }
            zzdmkVar = zzdmtVar2.zzhiz.zzera.zzhip;
            if (zzdmkVar != null) {
                str = zzdmkVar.getDescription();
            }
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzczd)).booleanValue() && ((i = zzdmtVar2.zzhiz.zzera.responseCode) < 200 || i >= 300)) {
                return zzdyz.immediateFailedFuture(new zzcuh(zzdnu.NO_FILL, str));
            }
            zzdql zzaxm = this.zzfvf.zzt(zzdqz.RENDER_CONFIG_INIT).zze(zzdyz.immediateFailedFuture(new zzcuh(zzdnu.NO_FILL, str))).zzaxm();
            this.zzfyz.zza(new zzbit(zzdmtVar2, this.zzfpv, this.zzfpn), this.executor);
            int i3 = 0;
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcze)).booleanValue()) {
                for (zzdmi zzdmiVar : zzdmtVar2.zzhiz.zzhiw) {
                    this.zzfvn.zzd(zzdmiVar);
                    Iterator<String> it = zzdmiVar.zzhhk.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        zzcqq<AdT> zze = this.zzgtr.zze(zzdmiVar.zzhhl, it.next());
                        if (zze != null && zze.zza(zzdmtVar2, zzdmiVar)) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        this.zzfvn.zza(zzdmiVar, 0L, zzdns.zza(zzdnu.INTERNAL_ERROR, null, null));
                    }
                }
            }
            for (final zzdmi zzdmiVar2 : zzdmtVar2.zzhiz.zzhiw) {
                Iterator<String> it2 = zzdmiVar2.zzhhk.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next = it2.next();
                    final zzcqq<AdT> zze2 = this.zzgtr.zze(zzdmiVar2.zzhhl, next);
                    if (zze2 != null && zze2.zza(zzdmtVar2, zzdmiVar2)) {
                        zzdqq<I> zza = this.zzfvf.zza((zzdqy) zzdqz.RENDER_CONFIG_WATERFALL, (zzdzl) zzaxm);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(next).length() + 26);
                        sb2.append("render-config-");
                        sb2.append(i3);
                        sb2.append("-");
                        sb2.append(next);
                        zzaxm = zza.zzgw(sb2.toString()).zza(Throwable.class, new zzdyj(this, zzdmtVar2, zzdmiVar2, zze2) { // from class: com.google.android.gms.internal.ads.zzcuj
                            private final zzdmi zzfti;
                            private final zzdmt zzggd;
                            private final zzcug zzgtt;
                            private final zzcqq zzgtu;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zzgtt = this;
                                this.zzggd = zzdmtVar2;
                                this.zzfti = zzdmiVar2;
                                this.zzgtu = zze2;
                            }

                            @Override // com.google.android.gms.internal.ads.zzdyj
                            public final zzdzl zzf(Object obj) {
                                return this.zzgtt.zza(this.zzggd, this.zzfti, this.zzgtu, (Throwable) obj);
                            }
                        }).zzaxm();
                        break;
                    }
                }
                i3++;
            }
            return zzaxm;
        }
        str = "No ad config.";
        zzdmkVar = zzdmtVar2.zzhiz.zzera.zzhip;
        if (zzdmkVar != null) {
        }
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzczd)).booleanValue()) {
        }
        zzdql zzaxm2 = this.zzfvf.zzt(zzdqz.RENDER_CONFIG_INIT).zze(zzdyz.immediateFailedFuture(new zzcuh(zzdnu.NO_FILL, str))).zzaxm();
        this.zzfyz.zza(new zzbit(zzdmtVar2, this.zzfpv, this.zzfpn), this.executor);
        int i32 = 0;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcze)).booleanValue()) {
        }
        while (r1.hasNext()) {
        }
        return zzaxm2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqq zzcqqVar, Throwable th) throws Exception {
        return this.zzgts.zza(zzdmtVar.zzhiz.zzera, zzdmiVar, zzdyz.zza(zzcqqVar.zzb(zzdmtVar, zzdmiVar), zzdmiVar.zzhid, TimeUnit.MILLISECONDS, this.zzfro));
    }
}
