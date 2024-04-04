package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbmr implements zzepq<zzbmo> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzayt> zzfov;
    private final zzeqd<zzbdh> zzftc;
    private final zzeqd<zzdmi> zzfue;

    public zzbmr(zzeqd<Context> zzeqdVar, zzeqd<zzbdh> zzeqdVar2, zzeqd<zzdmi> zzeqdVar3, zzeqd<zzayt> zzeqdVar4) {
        this.zzeuo = zzeqdVar;
        this.zzftc = zzeqdVar2;
        this.zzfue = zzeqdVar3;
        this.zzfov = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbmo(this.zzeuo.get(), this.zzftc.get(), this.zzfue.get(), this.zzfov.get());
    }
}
