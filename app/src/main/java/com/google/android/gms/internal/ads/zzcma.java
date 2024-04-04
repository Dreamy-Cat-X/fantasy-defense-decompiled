package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcma implements zzepq<zzcmq> {
    private final zzeqd<Context> zzeuo;

    private zzcma(zzeqd<Context> zzeqdVar) {
        this.zzeuo = zzeqdVar;
    }

    public static zzcma zzac(zzeqd<Context> zzeqdVar) {
        return new zzcma(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzcmq) zzepw.zza(new zzcmq(this.zzeuo.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
