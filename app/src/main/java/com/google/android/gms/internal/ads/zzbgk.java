package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbgk implements zzbkp {
    private zzbvl zzexd;
    private zzbqd zzexe;
    private zzdmt zzexh;
    private zzdkd zzexi;
    private zzdjf zzexj;
    private final /* synthetic */ zzbgb zzexk;

    private zzbgk(zzbgb zzbgbVar) {
        this.zzexk = zzbgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    @Deprecated
    public final /* synthetic */ zzbkp zzb(zzbkw zzbkwVar) {
        zzepw.checkNotNull(zzbkwVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final /* synthetic */ zzbkp zzb(zzbqd zzbqdVar) {
        this.zzexe = (zzbqd) zzepw.checkNotNull(zzbqdVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final /* synthetic */ zzbkp zzb(zzbvl zzbvlVar) {
        this.zzexd = (zzbvl) zzepw.checkNotNull(zzbvlVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final /* synthetic */ zzbkm zzagd() {
        zzepw.zza(this.zzexd, (Class<zzbvl>) zzbvl.class);
        zzepw.zza(this.zzexe, (Class<zzbqd>) zzbqd.class);
        return new zzbgj(this.zzexk, new zzboc(), new zzdnz(), new zzbpn(), new zzckl(), this.zzexd, this.zzexe, new zzdoh(), this.zzexh, this.zzexi, this.zzexj);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final /* synthetic */ zzbqa<zzbkm> zza(zzdjf zzdjfVar) {
        this.zzexj = zzdjfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final /* synthetic */ zzbqa<zzbkm> zza(zzdkd zzdkdVar) {
        this.zzexi = zzdkdVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final /* synthetic */ zzbqa<zzbkm> zza(zzdmt zzdmtVar) {
        this.zzexh = zzdmtVar;
        return this;
    }
}
