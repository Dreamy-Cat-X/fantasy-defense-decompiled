package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzctp implements zzcqy<zzcaz, zzaoz, zzcsk> {
    private final Context context;
    private final zzbzz zzgsv;
    private zzanm zzgte;

    public zzctp(Context context, zzbzz zzbzzVar) {
        this.context = context;
        this.zzgsv = zzbzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final void zza(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzaoz, zzcsk> zzcqsVar) throws zzdnf {
        try {
            zzcqsVar.zzdmc.zzdm(zzdmiVar.zzdnh);
            zzcqsVar.zzdmc.zza(zzdmiVar.zzesu, zzdmiVar.zzhhw.toString(), zzdmtVar.zzhiy.zzfve.zzhjd, ObjectWrapper.wrap(this.context), new zzctr(this, zzcqsVar), zzcqsVar.zzgrc);
        } catch (RemoteException e) {
            throw new zzdnf(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzcaz zzb(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzaoz, zzcsk> zzcqsVar) throws zzdnf, zzcuh {
        if (!zzdmtVar.zzhiy.zzfve.zzhjf.contains(Integer.toString(6))) {
            throw new zzcuh(zzdnu.INVALID_REQUEST, "Unified must be used for RTB.");
        }
        zzcbi zzb = zzcbi.zzb(this.zzgte);
        if (!zzdmtVar.zzhiy.zzfve.zzhjf.contains(Integer.toString(zzb.zzans()))) {
            throw new zzcuh(zzdnu.INTERNAL_ERROR, "No corresponding native ad listener");
        }
        zzcbn zza = this.zzgsv.zza(new zzbnp(zzdmtVar, zzdmiVar, zzcqsVar.zzchy), new zzcbu(zzb), new zzcdj(null, null, this.zzgte));
        zzcqsVar.zzgrc.zzb(zza.zzagk());
        return zza.zzagl();
    }
}
