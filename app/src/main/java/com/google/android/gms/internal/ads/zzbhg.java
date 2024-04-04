package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbhg implements zzcgm {
    private zzbvl zzexd;
    private zzbqd zzexe;
    private zzdmt zzexh;
    private zzdkd zzexi;
    private zzdjf zzexj;
    private final /* synthetic */ zzbgb zzexk;

    private zzbhg(zzbgb zzbgbVar) {
        this.zzexk = zzbgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    /* renamed from: zzaid, reason: merged with bridge method [inline-methods] */
    public final zzcgn zzagd() {
        zzepw.zza(this.zzexd, (Class<zzbvl>) zzbvl.class);
        zzepw.zza(this.zzexe, (Class<zzbqd>) zzbqd.class);
        return new zzbhf(this.zzexk, new zzboc(), new zzdnz(), new zzbpn(), new zzckl(), this.zzexd, this.zzexe, new zzdoh(), this.zzexh, this.zzexi, this.zzexj);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final /* synthetic */ zzcgm zzf(zzbqd zzbqdVar) {
        this.zzexe = (zzbqd) zzepw.checkNotNull(zzbqdVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final /* synthetic */ zzcgm zzf(zzbvl zzbvlVar) {
        this.zzexd = (zzbvl) zzepw.checkNotNull(zzbvlVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final /* synthetic */ zzbqa<zzcgn> zza(zzdjf zzdjfVar) {
        this.zzexj = zzdjfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final /* synthetic */ zzbqa<zzcgn> zza(zzdkd zzdkdVar) {
        this.zzexi = zzdkdVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final /* synthetic */ zzbqa<zzcgn> zza(zzdmt zzdmtVar) {
        this.zzexh = zzdmtVar;
        return this;
    }
}
