package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbom implements zzepq<zzbxf<zzuz>> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzbis> zzfry;

    private zzbom(zzeqd<zzbis> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        this.zzfry = zzeqdVar;
        this.zzeuj = zzeqdVar2;
    }

    public static zzbom zze(zzeqd<zzbis> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        return new zzbom(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzfry.get(), this.zzeuj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
