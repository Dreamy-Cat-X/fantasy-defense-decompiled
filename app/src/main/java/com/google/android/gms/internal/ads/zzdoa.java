package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdoa implements zzepq<zzdob> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzayc> zzfby;

    private zzdoa(zzeqd<Context> zzeqdVar, zzeqd<zzayc> zzeqdVar2) {
        this.zzeuo = zzeqdVar;
        this.zzfby = zzeqdVar2;
    }

    public static zzdoa zzbd(zzeqd<Context> zzeqdVar, zzeqd<zzayc> zzeqdVar2) {
        return new zzdoa(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdob(this.zzeuo.get(), this.zzfby.get());
    }
}
