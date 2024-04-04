package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdat implements zzepq<zzdar> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<zzayt> zzfxl;

    private zzdat(zzeqd<zzdzk> zzeqdVar, zzeqd<zzdmx> zzeqdVar2, zzeqd<zzayt> zzeqdVar3) {
        this.zzeuj = zzeqdVar;
        this.zzftm = zzeqdVar2;
        this.zzfxl = zzeqdVar3;
    }

    public static zzdat zzaa(zzeqd<zzdzk> zzeqdVar, zzeqd<zzdmx> zzeqdVar2, zzeqd<zzayt> zzeqdVar3) {
        return new zzdat(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdar(this.zzeuj.get(), this.zzftm.get(), this.zzfxl.get());
    }
}
