package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdmd implements zzepq<zzdmc> {
    private final zzeqd<zzdmw> zzfnj;
    private final zzeqd<zzdlo> zzgxa;
    private final zzeqd<zzdkp> zzhdq;

    public zzdmd(zzeqd<zzdlo> zzeqdVar, zzeqd<zzdkp> zzeqdVar2, zzeqd<zzdmw> zzeqdVar3) {
        this.zzgxa = zzeqdVar;
        this.zzhdq = zzeqdVar2;
        this.zzfnj = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdmc(this.zzgxa.get(), this.zzhdq.get(), this.zzfnj.get());
    }
}
