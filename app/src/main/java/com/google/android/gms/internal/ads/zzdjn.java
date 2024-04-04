package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqb;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdjn<RequestComponentT extends zzbqb<AdT>, AdT> implements zzdjv<RequestComponentT, AdT> {
    private RequestComponentT zzhfe;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzdjv
    /* renamed from: zzauq, reason: merged with bridge method [inline-methods] */
    public final synchronized RequestComponentT zzaup() {
        return this.zzhfe;
    }

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final synchronized zzdzl<AdT> zza(zzdka zzdkaVar, zzdjx<RequestComponentT> zzdjxVar) {
        RequestComponentT zzagd;
        zzagd = zzdjxVar.zzc(zzdkaVar.zzhgb).zzagd();
        this.zzhfe = zzagd;
        return zzagd.zzagu().zzaky();
    }
}
