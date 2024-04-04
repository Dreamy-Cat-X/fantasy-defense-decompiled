package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbr implements zzepq<zzdbp> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<String> zzfrl;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<zzchw> zzgzz;

    private zzdbr(zzeqd<zzdzk> zzeqdVar, zzeqd<zzchw> zzeqdVar2, zzeqd<zzdmx> zzeqdVar3, zzeqd<String> zzeqdVar4) {
        this.zzeuj = zzeqdVar;
        this.zzgzz = zzeqdVar2;
        this.zzftm = zzeqdVar3;
        this.zzfrl = zzeqdVar4;
    }

    public static zzdbr zzi(zzeqd<zzdzk> zzeqdVar, zzeqd<zzchw> zzeqdVar2, zzeqd<zzdmx> zzeqdVar3, zzeqd<String> zzeqdVar4) {
        return new zzdbr(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdbp(this.zzeuj.get(), this.zzgzz.get(), this.zzftm.get(), this.zzfrl.get());
    }
}
