package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzboq implements zzepq<zzbxf<zzbsg>> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzbis> zzfry;

    private zzboq(zzeqd<zzbis> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        this.zzfry = zzeqdVar;
        this.zzeuj = zzeqdVar2;
    }

    public static zzboq zzi(zzeqd<zzbis> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        return new zzboq(zzeqdVar, zzeqdVar2);
    }

    public static zzbxf<zzbsg> zza(zzbis zzbisVar, Executor executor) {
        return (zzbxf) zzepw.zza(new zzbxf(zzbisVar, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzfry.get(), this.zzeuj.get());
    }
}
