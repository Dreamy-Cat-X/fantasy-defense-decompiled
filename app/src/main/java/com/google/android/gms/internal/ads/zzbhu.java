package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbhu implements zzepq<com.google.android.gms.ads.internal.util.zzax> {
    private final zzeqd<Context> zzeuo;

    public zzbhu(zzeqd<Context> zzeqdVar) {
        this.zzeuo = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (com.google.android.gms.ads.internal.util.zzax) zzepw.zza(new com.google.android.gms.ads.internal.util.zzax(this.zzeuo.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
