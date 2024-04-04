package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbsv implements zzepq<zzbst> {
    private final zzeqd<zzdmi> zzfqe;
    private final zzeqd<Set<zzbxf<zzbsy>>> zzftl;

    private zzbsv(zzeqd<Set<zzbxf<zzbsy>>> zzeqdVar, zzeqd<zzdmi> zzeqdVar2) {
        this.zzftl = zzeqdVar;
        this.zzfqe = zzeqdVar2;
    }

    public static zzbsv zzr(zzeqd<Set<zzbxf<zzbsy>>> zzeqdVar, zzeqd<zzdmi> zzeqdVar2) {
        return new zzbsv(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbst(this.zzftl.get(), this.zzfqe.get());
    }
}
