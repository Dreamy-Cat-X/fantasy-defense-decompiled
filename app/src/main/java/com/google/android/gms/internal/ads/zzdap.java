package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdap implements zzepq<zzdan> {
    private final zzeqd<zzchu> zzeuk;
    private final zzeqd<zzdzk> zzgys;
    private final zzeqd<String> zzgzg;

    private zzdap(zzeqd<String> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<zzchu> zzeqdVar3) {
        this.zzgzg = zzeqdVar;
        this.zzgys = zzeqdVar2;
        this.zzeuk = zzeqdVar3;
    }

    public static zzdap zzz(zzeqd<String> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<zzchu> zzeqdVar3) {
        return new zzdap(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdan(this.zzgzg.get(), this.zzgys.get(), this.zzeuk.get());
    }
}
