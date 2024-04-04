package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcum implements zzcqy<zzcgg, zzaoz, zzcsk> {
    private final Context context;
    private final zzcgn zzgtv;

    public zzcum(Context context, zzcgn zzcgnVar) {
        this.context = context;
        this.zzgtv = zzcgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final void zza(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzaoz, zzcsk> zzcqsVar) throws zzdnf {
        try {
            zzcqsVar.zzdmc.zzdm(zzdmiVar.zzdnh);
            if (zzdmtVar.zzhiy.zzfve.zzhjl.zzhir == zzdmp.zzhiu) {
                zzcqsVar.zzdmc.zzb(zzdmiVar.zzesu, zzdmiVar.zzhhw.toString(), zzdmtVar.zzhiy.zzfve.zzhjd, ObjectWrapper.wrap(this.context), new zzcuo(this, zzcqsVar), zzcqsVar.zzgrc);
            } else {
                zzcqsVar.zzdmc.zza(zzdmiVar.zzesu, zzdmiVar.zzhhw.toString(), zzdmtVar.zzhiy.zzfve.zzhjd, ObjectWrapper.wrap(this.context), new zzcuo(this, zzcqsVar), zzcqsVar.zzgrc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zza("Remote exception loading a rewarded RTB ad", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzcgg zzb(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzaoz, zzcsk> zzcqsVar) throws zzdnf, zzcuh {
        zzcsu zzcsuVar = new zzcsu(zzdmiVar, zzcqsVar.zzdmc, true);
        zzcgi zza = this.zzgtv.zza(new zzbnp(zzdmtVar, zzdmiVar, zzcqsVar.zzchy), new zzcgl(zzcsuVar));
        zzcsuVar.zza(zza.zzagh());
        zzcqsVar.zzgrc.zzb(zza.zzaii());
        return zza.zzaif();
    }
}
