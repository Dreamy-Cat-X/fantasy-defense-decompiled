package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbgx implements zzbzc {
    private zzbvl zzexd;
    private zzbqd zzexe;
    private zzdmt zzexh;
    private zzdkd zzexi;
    private zzdjf zzexj;
    private final /* synthetic */ zzbgb zzexk;
    private zzcwh zzfln;

    private zzbgx(zzbgb zzbgbVar) {
        this.zzexk = zzbgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    /* renamed from: zzahu, reason: merged with bridge method [inline-methods] */
    public final zzbzd zzagd() {
        zzepw.zza(this.zzexd, (Class<zzbvl>) zzbvl.class);
        zzepw.zza(this.zzexe, (Class<zzbqd>) zzbqd.class);
        zzepw.zza(this.zzfln, (Class<zzcwh>) zzcwh.class);
        return new zzbha(this.zzexk, new zzboc(), new zzdnz(), new zzbpn(), new zzckl(), this.zzexd, this.zzexe, new zzdoh(), this.zzfln, this.zzexh, this.zzexi, this.zzexj);
    }

    @Override // com.google.android.gms.internal.ads.zzbzc
    public final /* synthetic */ zzbzc zzb(zzcwh zzcwhVar) {
        this.zzfln = (zzcwh) zzepw.checkNotNull(zzcwhVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbzc
    public final /* synthetic */ zzbzc zze(zzbqd zzbqdVar) {
        this.zzexe = (zzbqd) zzepw.checkNotNull(zzbqdVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbzc
    public final /* synthetic */ zzbzc zze(zzbvl zzbvlVar) {
        this.zzexd = (zzbvl) zzepw.checkNotNull(zzbvlVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final /* synthetic */ zzbqa<zzbzd> zza(zzdjf zzdjfVar) {
        this.zzexj = zzdjfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final /* synthetic */ zzbqa<zzbzd> zza(zzdkd zzdkdVar) {
        this.zzexi = zzdkdVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final /* synthetic */ zzbqa<zzbzd> zza(zzdmt zzdmtVar) {
        this.zzexh = zzdmtVar;
        return this;
    }
}
