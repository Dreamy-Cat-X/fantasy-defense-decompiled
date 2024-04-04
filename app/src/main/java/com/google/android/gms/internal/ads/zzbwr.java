package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbwr implements zzepq<zzbwl> {
    private final zzeqd<Set<zzbxf<zzbwq>>> zzftl;

    public zzbwr(zzeqd<Set<zzbxf<zzbwq>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbwl(this.zzftl.get());
    }
}
