package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzctk implements zzepq<zzcte> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<zzcds> zzffz;
    private final zzeqd<zzbzz> zzgro;
    private final zzeqd<zzdnr<zzcfp>> zzgta;

    public zzctk(zzeqd<zzbzz> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<zzcds> zzeqdVar3, zzeqd<zzdnr<zzcfp>> zzeqdVar4) {
        this.zzgro = zzeqdVar;
        this.zzeuj = zzeqdVar2;
        this.zzffz = zzeqdVar3;
        this.zzgta = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcte(this.zzgro.get(), this.zzeuj.get(), this.zzffz.get(), this.zzgta.get());
    }
}
