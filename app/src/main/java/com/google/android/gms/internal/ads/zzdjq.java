package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqb;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdjq<RequestComponentT extends zzbqb<AdT>, AdT> implements zzdjv<RequestComponentT, AdT> {
    private RequestComponentT zzhfe;
    private final zzdjv<RequestComponentT, AdT> zzhfy;

    public zzdjq(zzdjv<RequestComponentT, AdT> zzdjvVar) {
        this.zzhfy = zzdjvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzdjv
    /* renamed from: zzauq, reason: merged with bridge method [inline-methods] */
    public final synchronized RequestComponentT zzaup() {
        return this.zzhfe;
    }

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final synchronized zzdzl<AdT> zza(zzdka zzdkaVar, zzdjx<RequestComponentT> zzdjxVar) {
        if (zzdkaVar.zzhga != null) {
            RequestComponentT zzagd = zzdjxVar.zzc(zzdkaVar.zzhgb).zzagd();
            this.zzhfe = zzagd;
            return zzagd.zzagu().zzb(zzdkaVar.zzhga);
        }
        zzdzl<AdT> zza = this.zzhfy.zza(zzdkaVar, zzdjxVar);
        this.zzhfe = this.zzhfy.zzaup();
        return zza;
    }
}
