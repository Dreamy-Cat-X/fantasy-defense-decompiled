package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcop implements zzepq<zzcom> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdnk> zzewq;
    private final zzeqd<zzdmi> zzfqe;
    private final zzeqd<zzcpy> zzghv;
    private final zzeqd<zzdro> zzghw;
    private final zzeqd<String> zzgjm;
    private final zzeqd<zzdmt> zzgjx;

    private zzcop(zzeqd<Context> zzeqdVar, zzeqd<zzdnk> zzeqdVar2, zzeqd<zzdmt> zzeqdVar3, zzeqd<zzdmi> zzeqdVar4, zzeqd<zzcpy> zzeqdVar5, zzeqd<zzdro> zzeqdVar6, zzeqd<String> zzeqdVar7) {
        this.zzeuo = zzeqdVar;
        this.zzewq = zzeqdVar2;
        this.zzgjx = zzeqdVar3;
        this.zzfqe = zzeqdVar4;
        this.zzghv = zzeqdVar5;
        this.zzghw = zzeqdVar6;
        this.zzgjm = zzeqdVar7;
    }

    public static zzcop zzb(zzeqd<Context> zzeqdVar, zzeqd<zzdnk> zzeqdVar2, zzeqd<zzdmt> zzeqdVar3, zzeqd<zzdmi> zzeqdVar4, zzeqd<zzcpy> zzeqdVar5, zzeqd<zzdro> zzeqdVar6, zzeqd<String> zzeqdVar7) {
        return new zzcop(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5, zzeqdVar6, zzeqdVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcom(this.zzeuo.get(), this.zzewq.get(), this.zzgjx.get(), this.zzfqe.get(), this.zzghv.get(), this.zzghw.get(), this.zzgjm.get());
    }
}
