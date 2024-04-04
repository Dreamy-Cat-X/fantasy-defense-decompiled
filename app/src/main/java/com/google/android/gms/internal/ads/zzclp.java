package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzclp implements zzepq<zzcll> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<zzdzk> zzgmc;
    private final zzeqd<zzcmq> zzgmd;
    private final zzeqd<zzcns> zzgme;

    private zzclp(zzeqd<zzdzk> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<zzcmq> zzeqdVar3, zzeqd<zzcns> zzeqdVar4) {
        this.zzgmc = zzeqdVar;
        this.zzeuj = zzeqdVar2;
        this.zzgmd = zzeqdVar3;
        this.zzgme = zzeqdVar4;
    }

    public static zzclp zzd(zzeqd<zzdzk> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<zzcmq> zzeqdVar3, zzeqd<zzcns> zzeqdVar4) {
        return new zzclp(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcll(this.zzgmc.get(), this.zzeuj.get(), this.zzgmd.get(), zzepr.zzav(this.zzgme));
    }
}
