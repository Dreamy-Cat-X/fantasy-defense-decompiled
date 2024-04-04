package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdni implements zzepq<zzdnj> {
    private final zzeqd<zzdsh> zzewa;
    private final zzeqd<zzdmi> zzfue;
    private final zzeqd<zzdmj> zzghp;
    private final zzeqd<zzcpy> zzghv;

    private zzdni(zzeqd<zzcpy> zzeqdVar, zzeqd<zzdsh> zzeqdVar2, zzeqd<zzdmi> zzeqdVar3, zzeqd<zzdmj> zzeqdVar4) {
        this.zzghv = zzeqdVar;
        this.zzewa = zzeqdVar2;
        this.zzfue = zzeqdVar3;
        this.zzghp = zzeqdVar4;
    }

    public static zzdni zzk(zzeqd<zzcpy> zzeqdVar, zzeqd<zzdsh> zzeqdVar2, zzeqd<zzdmi> zzeqdVar3, zzeqd<zzdmj> zzeqdVar4) {
        return new zzdni(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdnj(this.zzghv.get(), this.zzewa.get(), this.zzfue.get(), this.zzghp.get());
    }
}
