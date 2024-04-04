package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcdx implements zzepq<zzcds> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<zzcdw> zzggi;
    private final zzeqd<zzceg> zzggj;

    public zzcdx(zzeqd<zzdzk> zzeqdVar, zzeqd<zzcdw> zzeqdVar2, zzeqd<zzceg> zzeqdVar3) {
        this.zzeuj = zzeqdVar;
        this.zzggi = zzeqdVar2;
        this.zzggj = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcds(this.zzeuj.get(), this.zzggi.get(), this.zzggj.get());
    }
}
