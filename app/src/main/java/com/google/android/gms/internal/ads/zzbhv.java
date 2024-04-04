package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbhv implements zzepq<zzdtb> {
    private final zzeqd<Context> zzeuo;

    public zzbhv(zzeqd<Context> zzeqdVar) {
        this.zzeuo = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzdtb) zzepw.zza(new zzdtb(this.zzeuo.get(), com.google.android.gms.ads.internal.zzp.zzle().zzzn()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
