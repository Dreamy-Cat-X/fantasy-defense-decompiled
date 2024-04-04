package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzboe implements zzepq<zzbxf<zzbqr>> {
    private final zzboc zzfvs;
    private final zzeqd<zzbol> zzfvt;

    private zzboe(zzboc zzbocVar, zzeqd<zzbol> zzeqdVar) {
        this.zzfvs = zzbocVar;
        this.zzfvt = zzeqdVar;
    }

    public static zzboe zza(zzboc zzbocVar, zzeqd<zzbol> zzeqdVar) {
        return new zzboe(zzbocVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzfvt.get(), zzayv.zzegn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
