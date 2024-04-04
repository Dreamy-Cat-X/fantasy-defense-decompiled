package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbxg implements zzepq<zzbxe> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<Set<zzbxf<zzqv>>> zzftl;
    private final zzeqd<zzdmi> zzfue;

    private zzbxg(zzeqd<Context> zzeqdVar, zzeqd<Set<zzbxf<zzqv>>> zzeqdVar2, zzeqd<zzdmi> zzeqdVar3) {
        this.zzeuo = zzeqdVar;
        this.zzftl = zzeqdVar2;
        this.zzfue = zzeqdVar3;
    }

    public static zzbxg zzo(zzeqd<Context> zzeqdVar, zzeqd<Set<zzbxf<zzqv>>> zzeqdVar2, zzeqd<zzdmi> zzeqdVar3) {
        return new zzbxg(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbxe(this.zzeuo.get(), this.zzftl.get(), this.zzfue.get());
    }
}
