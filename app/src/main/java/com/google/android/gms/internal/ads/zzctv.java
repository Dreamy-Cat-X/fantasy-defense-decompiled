package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqd;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzctv implements zzepq<zzcts> {
    private final zzeqd<zzbff> zzgah;
    private final zzeqd<zzbqd.zza> zzgai;
    private final zzeqd<zzbvl> zzgaj;
    private final zzeqd<zzbzv> zzgak;

    public zzctv(zzeqd<zzbff> zzeqdVar, zzeqd<zzbzv> zzeqdVar2, zzeqd<zzbqd.zza> zzeqdVar3, zzeqd<zzbvl> zzeqdVar4) {
        this.zzgah = zzeqdVar;
        this.zzgak = zzeqdVar2;
        this.zzgai = zzeqdVar3;
        this.zzgaj = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcts(this.zzgah.get(), this.zzgak.get(), this.zzgai.get(), this.zzgaj.get());
    }
}
