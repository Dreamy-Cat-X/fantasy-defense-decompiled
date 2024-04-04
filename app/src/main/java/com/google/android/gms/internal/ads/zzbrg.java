package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbrg implements zzepq<zzbqy> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzbrc> zzfae;
    private final zzeqd<Set<zzbxf<zzbqv>>> zzftl;

    private zzbrg(zzeqd<zzbrc> zzeqdVar, zzeqd<Set<zzbxf<zzbqv>>> zzeqdVar2, zzeqd<Executor> zzeqdVar3) {
        this.zzfae = zzeqdVar;
        this.zzftl = zzeqdVar2;
        this.zzeuj = zzeqdVar3;
    }

    public static zzbrg zzn(zzeqd<zzbrc> zzeqdVar, zzeqd<Set<zzbxf<zzbqv>>> zzeqdVar2, zzeqd<Executor> zzeqdVar3) {
        return new zzbrg(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbqy(this.zzfae.get(), this.zzftl.get(), this.zzeuj.get());
    }
}
