package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcqr implements zzepq<zzcqi> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzcju> zzewb;
    private final zzeqd<zzcpy> zzghv;
    private final zzeqd<zzdro> zzghw;
    private final zzeqd<zzayq> zzgrb;

    public zzcqr(zzeqd<Context> zzeqdVar, zzeqd<zzcpy> zzeqdVar2, zzeqd<zzayq> zzeqdVar3, zzeqd<zzcju> zzeqdVar4, zzeqd<zzdro> zzeqdVar5) {
        this.zzeuo = zzeqdVar;
        this.zzghv = zzeqdVar2;
        this.zzgrb = zzeqdVar3;
        this.zzewb = zzeqdVar4;
        this.zzghw = zzeqdVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcqi(this.zzeuo.get(), this.zzghv.get(), this.zzgrb.get(), this.zzewb.get(), this.zzghw.get());
    }
}
