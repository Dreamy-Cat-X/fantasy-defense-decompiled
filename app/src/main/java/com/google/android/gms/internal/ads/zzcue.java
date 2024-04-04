package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcue implements zzepq<zzcuf> {
    private final zzeqd<zzcht> zzevh;
    private final zzeqd<zzcju> zzewb;
    private final zzeqd<zzdnk> zzewq;
    private final zzeqd<zzdro> zzghw;

    private zzcue(zzeqd<zzdnk> zzeqdVar, zzeqd<zzcht> zzeqdVar2, zzeqd<zzcju> zzeqdVar3, zzeqd<zzdro> zzeqdVar4) {
        this.zzewq = zzeqdVar;
        this.zzevh = zzeqdVar2;
        this.zzewb = zzeqdVar3;
        this.zzghw = zzeqdVar4;
    }

    public static zzcue zzf(zzeqd<zzdnk> zzeqdVar, zzeqd<zzcht> zzeqdVar2, zzeqd<zzcju> zzeqdVar3, zzeqd<zzdro> zzeqdVar4) {
        return new zzcue(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcuf(this.zzewq.get(), this.zzevh.get(), this.zzewb.get(), this.zzghw.get());
    }
}
