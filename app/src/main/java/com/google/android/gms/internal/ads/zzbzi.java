package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbzi implements zzepq<zzcqq<zzbyd>> {
    private final zzeqd<zzdzk> zzftf;
    private final zzeqd<zzdqy> zzftq;
    private final zzeqd<zzcsy> zzftr;
    private final zzeqd<zzcvl> zzfts;

    public zzbzi(zzeqd<zzdqy> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<zzcsy> zzeqdVar3, zzeqd<zzcvl> zzeqdVar4) {
        this.zzftq = zzeqdVar;
        this.zzftf = zzeqdVar2;
        this.zzftr = zzeqdVar3;
        this.zzfts = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzcqq) zzepw.zza(new zzcvp(this.zzftq.get(), this.zzftf.get(), this.zzfts.get(), this.zzftr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
