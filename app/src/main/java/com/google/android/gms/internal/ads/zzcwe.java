package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcwe<AdT> implements zzepq<zzcwa<AdT>> {
    private final zzeqd<zzdzk> zzftf;
    private final zzeqd<zzdqy> zzftq;
    private final zzeqd<zzacd> zzgve;
    private final zzeqd<zzcwf<AdT>> zzgvj;

    public zzcwe(zzeqd<zzdqy> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<zzacd> zzeqdVar3, zzeqd<zzcwf<AdT>> zzeqdVar4) {
        this.zzftq = zzeqdVar;
        this.zzftf = zzeqdVar2;
        this.zzgve = zzeqdVar3;
        this.zzgvj = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcwa(this.zzftq.get(), this.zzftf.get(), this.zzgve.get(), this.zzgvj.get());
    }
}
