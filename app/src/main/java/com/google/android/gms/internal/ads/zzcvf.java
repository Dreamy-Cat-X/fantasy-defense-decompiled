package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcvf implements zzcqy<zzcgg, zzdno, zzcsn> {
    private final Context context;
    private final Executor zzfqs;
    private final zzcgn zzgtv;

    public zzcvf(Context context, Executor executor, zzcgn zzcgnVar) {
        this.context = context;
        this.zzfqs = executor;
        this.zzgtv = zzcgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final void zza(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzdno, zzcsn> zzcqsVar) throws zzdnf {
        if (!zzcqsVar.zzdmc.isInitialized()) {
            zzcqsVar.zzgrc.zza(new zzcvh(this, zzdmtVar, zzdmiVar, zzcqsVar));
            zzcqsVar.zzdmc.zza(this.context, zzdmtVar.zzhiy.zzfve.zzhjd, (String) null, zzcqsVar.zzgrc, zzdmiVar.zzhhw.toString());
            return;
        }
        zzc(zzdmtVar, zzdmiVar, zzcqsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzdno, zzcsn> zzcqsVar) {
        try {
            zzcqsVar.zzdmc.zza(zzdmtVar.zzhiy.zzfve.zzhjd, zzdmiVar.zzhhw.toString());
        } catch (Exception e) {
            String valueOf = String.valueOf(zzcqsVar.zzchy);
            com.google.android.gms.ads.internal.util.zzd.zzd(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzcgg zzb(zzdmt zzdmtVar, zzdmi zzdmiVar, final zzcqs<zzdno, zzcsn> zzcqsVar) throws zzdnf, zzcuh {
        zzcgi zza = this.zzgtv.zza(new zzbnp(zzdmtVar, zzdmiVar, zzcqsVar.zzchy), new zzcgl(new zzbzl(zzcqsVar) { // from class: com.google.android.gms.internal.ads.zzcve
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
                    ((zzdno) zzcqsVar2.zzdmc).showVideo();
                } catch (zzdnf e) {
                    com.google.android.gms.ads.internal.util.zzd.zzd("Cannot show rewarded video.", e);
                    throw new zzbzk(e.getCause());
                }
            }
        }));
        zza.zzage().zza((zzbrl) new zzbiq(zzcqsVar.zzdmc), this.zzfqs);
        zzbrr zzagf = zza.zzagf();
        zzbqq zzagg = zza.zzagg();
        zzcqsVar.zzgrc.zza(new zzcvj(this, zza.zzahx(), zzagg, zzagf, zza.zzaig()));
        return zza.zzaif();
    }
}
