package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbg implements zzepq<zzdbe> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<Context> zzeuo;

    private zzdbg(zzeqd<zzdzk> zzeqdVar, zzeqd<Context> zzeqdVar2) {
        this.zzeuj = zzeqdVar;
        this.zzeuo = zzeqdVar2;
    }

    public static zzdbg zzat(zzeqd<zzdzk> zzeqdVar, zzeqd<Context> zzeqdVar2) {
        return new zzdbg(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdbe(this.zzeuj.get(), this.zzeuo.get());
    }
}
