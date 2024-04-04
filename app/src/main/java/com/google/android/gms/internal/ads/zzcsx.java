package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcsx implements zzcqy<zzbyd, zzdno, zzcsk> {
    private final Context context;
    private final zzayt zzbos;
    private final Executor zzfqs;
    private final zzbzd zzgsh;

    public zzcsx(Context context, zzayt zzaytVar, zzbzd zzbzdVar, Executor executor) {
        this.context = context;
        this.zzbos = zzaytVar;
        this.zzgsh = zzbzdVar;
        this.zzfqs = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final void zza(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzdno, zzcsk> zzcqsVar) throws zzdnf {
        if (this.zzbos.zzegf < 4100000) {
            zzcqsVar.zzdmc.zza(this.context, zzdmtVar.zzhiy.zzfve.zzhjd, zzdmiVar.zzhhw.toString(), zzcqsVar.zzgrc);
        } else {
            zzcqsVar.zzdmc.zza(this.context, zzdmtVar.zzhiy.zzfve.zzhjd, zzdmiVar.zzhhw.toString(), com.google.android.gms.ads.internal.util.zzbk.zza(zzdmiVar.zzhht), zzcqsVar.zzgrc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzbyd zzb(zzdmt zzdmtVar, zzdmi zzdmiVar, final zzcqs<zzdno, zzcsk> zzcqsVar) throws zzdnf, zzcuh {
        zzbyf zza = this.zzgsh.zza(new zzbnp(zzdmtVar, zzdmiVar, zzcqsVar.zzchy), new zzbye(new zzbzl(zzcqsVar) { // from class: com.google.android.gms.internal.ads.zzcsw
            private final zzcqs zzgsb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsb = zzcqsVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.zzbzl
            public final void zza(boolean z, Context context) {
                zzcqs zzcqsVar2 = this.zzgsb;
                try {
                    ((zzdno) zzcqsVar2.zzdmc).setImmersiveMode(z);
                    ((zzdno) zzcqsVar2.zzdmc).showInterstitial();
                } catch (zzdnf e) {
                    com.google.android.gms.ads.internal.util.zzd.zzew("Cannot show interstitial.");
                    throw new zzbzk(e.getCause());
                }
            }
        }));
        zza.zzage().zza((zzbrl) new zzbiq(zzcqsVar.zzdmc), this.zzfqs);
        zzcqsVar.zzgrc.zzb(zza.zzagj());
        return zza.zzahw();
    }
}
