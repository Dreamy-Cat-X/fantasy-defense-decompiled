package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcsy implements zzcqy<zzbyd, zzaoz, zzcsk> {
    private final Context context;
    private final zzbzd zzgsh;

    public zzcsy(Context context, zzbzd zzbzdVar) {
        this.context = context;
        this.zzgsh = zzbzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final void zza(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzaoz, zzcsk> zzcqsVar) throws zzdnf {
        try {
            zzcqsVar.zzdmc.zzdm(zzdmiVar.zzdnh);
            zzcqsVar.zzdmc.zza(zzdmiVar.zzesu, zzdmiVar.zzhhw.toString(), zzdmtVar.zzhiy.zzfve.zzhjd, ObjectWrapper.wrap(this.context), new zzcta(this, zzcqsVar), zzcqsVar.zzgrc);
        } catch (RemoteException e) {
            throw new zzdnf(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzbyd zzb(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzaoz, zzcsk> zzcqsVar) throws zzdnf, zzcuh {
        zzcsu zzcsuVar = new zzcsu(zzdmiVar, zzcqsVar.zzdmc, false);
        zzbyf zza = this.zzgsh.zza(new zzbnp(zzdmtVar, zzdmiVar, zzcqsVar.zzchy), new zzbye(zzcsuVar));
        zzcsuVar.zza(zza.zzagh());
        zzcqsVar.zzgrc.zzb(zza.zzagk());
        return zza.zzahw();
    }
}
