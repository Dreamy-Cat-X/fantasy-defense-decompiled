package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcqt<DelegateT, AdapterT> implements zzcqq<AdapterT> {
    private final zzcqq<DelegateT> zzgrd;
    private final zzdvo<DelegateT, AdapterT> zzgre;

    public zzcqt(zzcqq<DelegateT> zzcqqVar, zzdvo<DelegateT, AdapterT> zzdvoVar) {
        this.zzgrd = zzcqqVar;
        this.zzgre = zzdvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final boolean zza(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        return this.zzgrd.zza(zzdmtVar, zzdmiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final zzdzl<AdapterT> zzb(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        return zzdyz.zzb(this.zzgrd.zzb(zzdmtVar, zzdmiVar), this.zzgre, zzayv.zzegi);
    }
}
