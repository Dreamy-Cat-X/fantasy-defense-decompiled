package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbht implements zzepq<zzbho> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzchu> zzevi;
    private final zzeqd<zzckx> zzevt;
    private final zzeqd<zzchw> zzevv;
    private final zzeqd<zzayt> zzfov;
    private final zzeqd<zzcqv<zzdno, zzcsn>> zzfow;
    private final zzeqd<zzcwq> zzfox;
    private final zzeqd<zzawg> zzfoy;

    public zzbht(zzeqd<Context> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<zzchu> zzeqdVar3, zzeqd<zzcqv<zzdno, zzcsn>> zzeqdVar4, zzeqd<zzcwq> zzeqdVar5, zzeqd<zzckx> zzeqdVar6, zzeqd<zzawg> zzeqdVar7, zzeqd<zzchw> zzeqdVar8) {
        this.zzeuo = zzeqdVar;
        this.zzfov = zzeqdVar2;
        this.zzevi = zzeqdVar3;
        this.zzfow = zzeqdVar4;
        this.zzfox = zzeqdVar5;
        this.zzevt = zzeqdVar6;
        this.zzfoy = zzeqdVar7;
        this.zzevv = zzeqdVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbho(this.zzeuo.get(), this.zzfov.get(), this.zzevi.get(), this.zzfow.get(), this.zzfox.get(), this.zzevt.get(), this.zzfoy.get(), this.zzevv.get());
    }
}
