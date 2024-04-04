package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbqs implements zzepq<zzbqq> {
    private final zzeqd<Set<zzbxf<zzuz>>> zzftl;

    private zzbqs(zzeqd<Set<zzbxf<zzuz>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbqs zzg(zzeqd<Set<zzbxf<zzuz>>> zzeqdVar) {
        return new zzbqs(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbqq(this.zzftl.get());
    }
}
