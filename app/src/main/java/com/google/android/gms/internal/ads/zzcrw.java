package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcrw implements zzcqy<zzblb, zzaoz, zzcsk> {
    private final Context context;
    private View view;
    private final zzblx zzgrw;

    public zzcrw(Context context, zzblx zzblxVar) {
        this.context = context;
        this.zzgrw = zzblxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final void zza(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs<zzaoz, zzcsk> zzcqsVar) throws zzdnf {
        try {
            zzcqsVar.zzdmc.zzdm(zzdmiVar.zzdnh);
            zzcqsVar.zzdmc.zza(zzdmiVar.zzesu, zzdmiVar.zzhhw.toString(), zzdmtVar.zzhiy.zzfve.zzhjd, ObjectWrapper.wrap(this.context), new zzcsb(this, zzcqsVar), zzcqsVar.zzgrc, zzdmtVar.zzhiy.zzfve.zzbpe);
        } catch (RemoteException e) {
            throw new zzdnf(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzblb zzb(zzdmt zzdmtVar, zzdmi zzdmiVar, final zzcqs<zzaoz, zzcsk> zzcqsVar) throws zzdnf, zzcuh {
        zzbla zza = this.zzgrw.zza(new zzbnp(zzdmtVar, zzdmiVar, zzcqsVar.zzchy), new zzble(this.view, null, new zzbmw(zzcqsVar) { // from class: com.google.android.gms.internal.ads.zzcrz
            private final zzcqs zzgsb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsb = zzcqsVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbmw
            public final zzyu getVideoController() {
                return zzcrw.zza(this.zzgsb);
            }
        }, zzdmiVar.zzhhv.get(0)));
        zza.zzahq().zzv(this.view);
        zzcqsVar.zzgrc.zzb(zza.zzagk());
        return zza.zzahp();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ zzyu zza(zzcqs zzcqsVar) throws zzdnf {
        try {
            return ((zzaoz) zzcqsVar.zzdmc).getVideoController();
        } catch (RemoteException e) {
            throw new zzdnf(e);
        }
    }
}
