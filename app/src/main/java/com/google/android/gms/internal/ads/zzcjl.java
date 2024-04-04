package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcjl implements zzepq<zzcji> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzcju> zzewb;
    private final zzeqd<zzdnk> zzewq;
    private final zzeqd<zzdmi> zzfqe;
    private final zzeqd<zzcpy> zzghv;
    private final zzeqd<zzdmt> zzgjx;

    private zzcjl(zzeqd<Context> zzeqdVar, zzeqd<zzdnk> zzeqdVar2, zzeqd<zzcju> zzeqdVar3, zzeqd<zzdmt> zzeqdVar4, zzeqd<zzdmi> zzeqdVar5, zzeqd<zzcpy> zzeqdVar6) {
        this.zzeuo = zzeqdVar;
        this.zzewq = zzeqdVar2;
        this.zzewb = zzeqdVar3;
        this.zzgjx = zzeqdVar4;
        this.zzfqe = zzeqdVar5;
        this.zzghv = zzeqdVar6;
    }

    public static zzcjl zza(zzeqd<Context> zzeqdVar, zzeqd<zzdnk> zzeqdVar2, zzeqd<zzcju> zzeqdVar3, zzeqd<zzdmt> zzeqdVar4, zzeqd<zzdmi> zzeqdVar5, zzeqd<zzcpy> zzeqdVar6) {
        return new zzcjl(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5, zzeqdVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcji(this.zzeuo.get(), this.zzewq.get(), this.zzewb.get(), this.zzgjx.get(), this.zzfqe.get(), this.zzghv.get());
    }
}
