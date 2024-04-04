package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdgf implements zzepq<zzdgd> {
    private final zzeqd<Context> zzfwd;

    public zzdgf(zzeqd<Context> zzeqdVar) {
        this.zzfwd = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdgd(this.zzfwd.get());
    }
}
