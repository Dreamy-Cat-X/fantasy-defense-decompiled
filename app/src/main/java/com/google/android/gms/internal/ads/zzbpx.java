package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbpx implements zzepq<zzbpu> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdmi> zzfue;
    private final zzeqd<zzard> zzfwu;

    private zzbpx(zzeqd<Context> zzeqdVar, zzeqd<zzdmi> zzeqdVar2, zzeqd<zzard> zzeqdVar3) {
        this.zzeuo = zzeqdVar;
        this.zzfue = zzeqdVar2;
        this.zzfwu = zzeqdVar3;
    }

    public static zzbpx zzl(zzeqd<Context> zzeqdVar, zzeqd<zzdmi> zzeqdVar2, zzeqd<zzard> zzeqdVar3) {
        return new zzbpx(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbpu(this.zzeuo.get(), this.zzfue.get(), this.zzfwu.get());
    }
}
