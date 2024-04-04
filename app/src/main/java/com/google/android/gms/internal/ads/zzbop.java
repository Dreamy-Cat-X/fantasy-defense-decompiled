package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbop implements zzepq<zzbxf<zzbqr>> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzbis> zzfry;

    private zzbop(zzeqd<zzbis> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        this.zzfry = zzeqdVar;
        this.zzeuj = zzeqdVar2;
    }

    public static zzbop zzh(zzeqd<zzbis> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        return new zzbop(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzfry.get(), this.zzeuj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
