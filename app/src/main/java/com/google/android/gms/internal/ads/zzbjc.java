package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbjc implements zzepq<zzbjd> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzqs> zzfql;

    private zzbjc(zzeqd<Context> zzeqdVar, zzeqd<zzqs> zzeqdVar2) {
        this.zzeuo = zzeqdVar;
        this.zzfql = zzeqdVar2;
    }

    public static zzbjc zza(zzeqd<Context> zzeqdVar, zzeqd<zzqs> zzeqdVar2) {
        return new zzbjc(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbjd(this.zzeuo.get(), this.zzfql.get());
    }
}
