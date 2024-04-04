package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbqb;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdjd<R extends zzbqb<AdT>, AdT extends zzbmz> implements zzdpm<AdT> {
    private final zzdjv<R, zzdpb<AdT>> zzhfl;

    public zzdjd(zzdjv<R, zzdpb<AdT>> zzdjvVar) {
        this.zzhfl = zzdjvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    public final zzdzl<zzdpb<AdT>> zza(zzdpp zzdppVar) {
        zzdjg zzdjgVar = (zzdjg) zzdppVar;
        return this.zzhfl.zza(zzdjgVar.zzhfp, zzdjgVar.zzhfo);
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    public final void zza(zzdpb<AdT> zzdpbVar) {
        zzdpbVar.zzhms = this.zzhfl.zzaup().zzagu();
    }
}
