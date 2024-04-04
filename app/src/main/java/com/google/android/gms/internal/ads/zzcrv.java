package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcrv implements zzcqy<zzblb, zzdno, zzcsk> {
    private final Context context;
    private final zzayt zzbos;
    private final Executor zzfqs;
    private final zzblx zzgrw;

    public zzcrv(Context context, zzayt zzaytVar, zzblx zzblxVar, Executor executor) {
        this.context = context;
        this.zzbos = zzaytVar;
        this.zzgrw = zzblxVar;
        this.zzfqs = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final void zza(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzdno, zzcsk> zzcqsVar) throws zzdnf {
        zzvp zzb;
        zzvp zzvpVar = zzdmtVar.zzhiy.zzfve.zzbpe;
        if (zzvpVar.zzchx) {
            zzb = new zzvp(this.context, com.google.android.gms.ads.zza.zza(zzvpVar.width, zzvpVar.height));
        } else {
            zzb = zzdnd.zzb(this.context, zzdmiVar.zzhhv);
        }
        zzvp zzvpVar2 = zzb;
        if (this.zzbos.zzegf < 4100000) {
            zzcqsVar.zzdmc.zza(this.context, zzvpVar2, zzdmtVar.zzhiy.zzfve.zzhjd, zzdmiVar.zzhhw.toString(), zzcqsVar.zzgrc);
        } else {
            zzcqsVar.zzdmc.zza(this.context, zzvpVar2, zzdmtVar.zzhiy.zzfve.zzhjd, zzdmiVar.zzhhw.toString(), com.google.android.gms.ads.internal.util.zzbk.zza(zzdmiVar.zzhht), zzcqsVar.zzgrc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzblb zzb(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzdno, zzcsk> zzcqsVar) throws zzdnf, zzcuh {
        zzblx zzblxVar = this.zzgrw;
        zzbnp zzbnpVar = new zzbnp(zzdmtVar, zzdmiVar, zzcqsVar.zzchy);
        View view = zzcqsVar.zzdmc.getView();
        zzdno zzdnoVar = zzcqsVar.zzdmc;
        zzdnoVar.getClass();
        zzbla zza = zzblxVar.zza(zzbnpVar, new zzble(view, null, zzcru.zza(zzdnoVar), zzdmiVar.zzhhv.get(0)));
        zza.zzahq().zzv(zzcqsVar.zzdmc.getView());
        zza.zzage().zza((zzbrl) new zzbiq(zzcqsVar.zzdmc), this.zzfqs);
        zzcqsVar.zzgrc.zzb(zza.zzagj());
        return zza.zzahp();
    }
}
