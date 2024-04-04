package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcgu implements zzepq<zzcqq<zzcgg>> {
    private final zzeqd<zzdzk> zzftf;
    private final zzeqd<zzdqy> zzftq;
    private final zzeqd<zzcum> zzftr;
    private final zzeqd<zzcvl> zzfts;

    public zzcgu(zzeqd<zzdqy> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<zzcum> zzeqdVar3, zzeqd<zzcvl> zzeqdVar4) {
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
