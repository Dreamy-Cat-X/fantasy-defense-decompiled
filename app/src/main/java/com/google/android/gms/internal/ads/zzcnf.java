package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcnf implements zzcng {
    private final zzdzk zzgfs;
    private final Map<String, zzeqd<zzcng>> zzgnl;
    private final zzbte zzgnm;

    public zzcnf(Map<String, zzeqd<zzcng>> map, zzdzk zzdzkVar, zzbte zzbteVar) {
        this.zzgnl = map;
        this.zzgfs = zzdzkVar;
        this.zzgnm = zzbteVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcng
    public final zzdzl<zzdmt> zzh(final zzasu zzasuVar) {
        this.zzgnm.zzd(zzasuVar);
        zzdzl<zzdmt> immediateFailedFuture = zzdyz.immediateFailedFuture(new zzcli(zzdnu.NO_FILL));
        for (String str : ((String) zzwo.zzqq().zzd(zzabh.zzcyy)).split(",")) {
            final zzeqd<zzcng> zzeqdVar = this.zzgnl.get(str.trim());
            if (zzeqdVar != null) {
                immediateFailedFuture = zzdyz.zzb(immediateFailedFuture, zzcli.class, new zzdyj(zzeqdVar, zzasuVar) { // from class: com.google.android.gms.internal.ads.zzcne
                    private final zzasu zzgly;
                    private final zzeqd zzgnk;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgnk = zzeqdVar;
                        this.zzgly = zzasuVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdyj
                    public final zzdzl zzf(Object obj) {
                        zzeqd zzeqdVar2 = this.zzgnk;
                        return ((zzcng) zzeqdVar2.get()).zzh(this.zzgly);
                    }
                }, this.zzgfs);
            }
        }
        zzdyz.zza(immediateFailedFuture, new zzcnh(this), zzayv.zzegn);
        return immediateFailedFuture;
    }
}
