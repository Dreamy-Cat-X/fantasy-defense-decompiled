package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdrz implements zzepq<zzdrw> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzayt> zzfov;

    public zzdrz(zzeqd<Context> zzeqdVar, zzeqd<zzayt> zzeqdVar2) {
        this.zzeuo = zzeqdVar;
        this.zzfov = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdrw(this.zzeuo.get(), this.zzfov.get());
    }
}
