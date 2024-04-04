package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbrs implements zzepq<zzbrl> {
    private final zzeqd<Set<zzbxf<zzbrm>>> zzftl;

    private zzbrs(zzeqd<Set<zzbxf<zzbrm>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbrs zzj(zzeqd<Set<zzbxf<zzbrm>>> zzeqdVar) {
        return new zzbrs(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbrl(this.zzftl.get());
    }
}
