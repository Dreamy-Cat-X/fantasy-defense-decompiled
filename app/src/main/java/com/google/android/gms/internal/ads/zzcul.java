package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcul implements zzcqy<zzcgg, zzdno, zzcsk> {
    private final Context context;
    private final Executor zzfqs;
    private final zzcgn zzgtv;

    public zzcul(Context context, Executor executor, zzcgn zzcgnVar) {
        this.context = context;
        this.zzfqs = executor;
        this.zzgtv = zzcgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final void zza(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzdno, zzcsk> zzcqsVar) throws zzdnf {
        try {
            zzdmx zzdmxVar = zzdmtVar.zzhiy.zzfve;
            if (zzdmxVar.zzhjl.zzhir == zzdmp.zzhiu) {
                zzcqsVar.zzdmc.zzc(this.context, zzdmxVar.zzhjd, zzdmiVar.zzhhw.toString(), zzcqsVar.zzgrc);
            } else {
                zzcqsVar.zzdmc.zzb(this.context, zzdmxVar.zzhjd, zzdmiVar.zzhhw.toString(), zzcqsVar.zzgrc);
            }
        } catch (Exception e) {
            String valueOf = String.valueOf(zzcqsVar.zzchy);
            com.google.android.gms.ads.internal.util.zzd.zzd(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzcgg zzb(zzdmt zzdmtVar, zzdmi zzdmiVar, final zzcqs<zzdno, zzcsk> zzcqsVar) throws zzdnf, zzcuh {
        zzcgi zza = this.zzgtv.zza(new zzbnp(zzdmtVar, zzdmiVar, zzcqsVar.zzchy), new zzcgl(new zzbzl(zzcqsVar) { // from class: com.google.android.gms.internal.ads.zzcuk
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
                    ((zzdno) zzcqsVar2.zzdmc).zzcj(context);
                } catch (zzdnf e) {
                    throw new zzbzk(e.getCause());
                }
            }
        }));
        zza.zzage().zza((zzbrl) new zzbiq(zzcqsVar.zzdmc), this.zzfqs);
        zzcqsVar.zzgrc.zzb(zza.zzaih());
        return zza.zzaif();
    }
}
