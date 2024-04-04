package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbmt implements zzepq<zzbmq> {
    private final zzeqd<zzdmi> zzfqe;
    private final zzeqd<zzbri> zzfug;
    private final zzeqd<zzbsk> zzfuh;

    private zzbmt(zzeqd<zzdmi> zzeqdVar, zzeqd<zzbri> zzeqdVar2, zzeqd<zzbsk> zzeqdVar3) {
        this.zzfqe = zzeqdVar;
        this.zzfug = zzeqdVar2;
        this.zzfuh = zzeqdVar3;
    }

    public static zzbmt zzf(zzeqd<zzdmi> zzeqdVar, zzeqd<zzbri> zzeqdVar2, zzeqd<zzbsk> zzeqdVar3) {
        return new zzbmt(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbmq(this.zzfqe.get(), this.zzfug.get(), this.zzfuh.get());
    }
}
