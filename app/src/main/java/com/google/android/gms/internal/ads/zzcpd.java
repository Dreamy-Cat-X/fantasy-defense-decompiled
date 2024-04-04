package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcpd implements zzepq<zzcpa> {
    private final zzeqd<Context> zzeuo;

    private zzcpd(zzeqd<Context> zzeqdVar) {
        this.zzeuo = zzeqdVar;
    }

    public static zzcpd zzaf(zzeqd<Context> zzeqdVar) {
        return new zzcpd(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcpa(this.zzeuo.get());
    }
}
