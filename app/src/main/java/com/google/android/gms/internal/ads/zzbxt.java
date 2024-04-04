package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbxt implements zzepq<zzbxp> {
    private final zzeqd<Set<zzbxf<zzaif>>> zzftl;

    public zzbxt(zzeqd<Set<zzbxf<zzaif>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbxp(this.zzftl.get());
    }
}
