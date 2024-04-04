package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzczv implements zzepq<zzczt> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<ViewGroup> zzgtj;
    private final zzeqd<zzdzk> zzgys;

    public zzczv(zzeqd<zzdzk> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<zzdmx> zzeqdVar3, zzeqd<ViewGroup> zzeqdVar4) {
        this.zzgys = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzftm = zzeqdVar3;
        this.zzgtj = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzczt(this.zzgys.get(), this.zzeuo.get(), this.zzftm.get(), this.zzgtj.get());
    }
}
