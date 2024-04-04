package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbhh implements zzcys {
    private zzbqd zzexe;
    private final /* synthetic */ zzbgb zzexk;
    private zzczi zzfnw;

    private zzbhh(zzbgb zzbgbVar) {
        this.zzexk = zzbgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcys
    public final zzcyt zzaie() {
        zzepw.zza(this.zzexe, (Class<zzbqd>) zzbqd.class);
        zzepw.zza(this.zzfnw, (Class<zzczi>) zzczi.class);
        return new zzbhk(this.zzexk, this.zzfnw, new zzboc(), new zzckl(), this.zzexe, new zzdoh());
    }

    @Override // com.google.android.gms.internal.ads.zzcys
    @Deprecated
    public final /* synthetic */ zzcys zzg(zzbvl zzbvlVar) {
        zzepw.checkNotNull(zzbvlVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcys
    public final /* synthetic */ zzcys zza(zzczi zzcziVar) {
        this.zzfnw = (zzczi) zzepw.checkNotNull(zzcziVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcys
    public final /* synthetic */ zzcys zzg(zzbqd zzbqdVar) {
        this.zzexe = (zzbqd) zzepw.checkNotNull(zzbqdVar);
        return this;
    }
}
