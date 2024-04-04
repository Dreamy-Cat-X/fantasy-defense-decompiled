package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzctn implements zzcqy<zzcaz, zzdno, zzcsk> {
    private final Context context;
    private final Executor zzfqs;
    private final zzbzz zzgsv;

    public zzctn(Context context, zzbzz zzbzzVar, Executor executor) {
        this.context = context;
        this.zzgsv = zzbzzVar;
        this.zzfqs = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final void zza(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzdno, zzcsk> zzcqsVar) throws zzdnf {
        zzcqsVar.zzdmc.zza(this.context, zzdmtVar.zzhiy.zzfve.zzhjd, zzdmiVar.zzhhw.toString(), com.google.android.gms.ads.internal.util.zzbk.zza(zzdmiVar.zzhht), zzcqsVar.zzgrc, zzdmtVar.zzhiy.zzfve.zzdmv, zzdmtVar.zzhiy.zzfve.zzhjf);
    }

    private static boolean zza(zzdmt zzdmtVar, int i) {
        return zzdmtVar.zzhiy.zzfve.zzhjf.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzcaz zzb(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzdno, zzcsk> zzcqsVar) throws zzdnf, zzcuh {
        zzcbi zza;
        zzang zzuu = zzcqsVar.zzdmc.zzuu();
        zzanh zzuv = zzcqsVar.zzdmc.zzuv();
        zzanm zzva = zzcqsVar.zzdmc.zzva();
        if (zzva != null && zza(zzdmtVar, 6)) {
            zza = zzcbi.zzb(zzva);
        } else if (zzuu != null && zza(zzdmtVar, 6)) {
            zza = zzcbi.zzb(zzuu);
        } else if (zzuu != null && zza(zzdmtVar, 2)) {
            zza = zzcbi.zza(zzuu);
        } else if (zzuv != null && zza(zzdmtVar, 6)) {
            zza = zzcbi.zzb(zzuv);
        } else if (zzuv != null && zza(zzdmtVar, 1)) {
            zza = zzcbi.zza(zzuv);
        } else {
            throw new zzcuh(zzdnu.INTERNAL_ERROR, "No native ad mappers");
        }
        if (!zzdmtVar.zzhiy.zzfve.zzhjf.contains(Integer.toString(zza.zzans()))) {
            throw new zzcuh(zzdnu.INTERNAL_ERROR, "No corresponding native ad listener");
        }
        zzcbn zza2 = this.zzgsv.zza(new zzbnp(zzdmtVar, zzdmiVar, zzcqsVar.zzchy), new zzcbu(zza), new zzcdj(zzuv, zzuu, zzva));
        zzcqsVar.zzgrc.zzb(zza2.zzagj());
        zza2.zzage().zza((zzbrl) new zzbiq(zzcqsVar.zzdmc), this.zzfqs);
        return zza2.zzagl();
    }
}
