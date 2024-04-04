package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbxm implements zzepq<zzbxn> {
    private final zzeqd<zzdsh> zzewa;
    private final zzeqd<zzdmi> zzfqe;

    private zzbxm(zzeqd<zzdmi> zzeqdVar, zzeqd<zzdsh> zzeqdVar2) {
        this.zzfqe = zzeqdVar;
        this.zzewa = zzeqdVar2;
    }

    public static zzbxm zzs(zzeqd<zzdmi> zzeqdVar, zzeqd<zzdsh> zzeqdVar2) {
        return new zzbxm(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbxn(this.zzfqe.get(), this.zzewa.get());
    }
}
