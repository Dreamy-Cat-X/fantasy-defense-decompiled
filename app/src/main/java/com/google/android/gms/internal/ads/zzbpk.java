package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbpk implements zzepq<zzbpl> {
    private final zzeqd<zzckx> zzevt;
    private final zzeqd<com.google.android.gms.ads.internal.util.zzf> zzfco;
    private final zzeqd<zzayt> zzfrk;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<Context> zzfwd;

    private zzbpk(zzeqd<Context> zzeqdVar, zzeqd<zzdmx> zzeqdVar2, zzeqd<zzayt> zzeqdVar3, zzeqd<com.google.android.gms.ads.internal.util.zzf> zzeqdVar4, zzeqd<zzckx> zzeqdVar5) {
        this.zzfwd = zzeqdVar;
        this.zzftm = zzeqdVar2;
        this.zzfrk = zzeqdVar3;
        this.zzfco = zzeqdVar4;
        this.zzevt = zzeqdVar5;
    }

    public static zzbpk zzb(zzeqd<Context> zzeqdVar, zzeqd<zzdmx> zzeqdVar2, zzeqd<zzayt> zzeqdVar3, zzeqd<com.google.android.gms.ads.internal.util.zzf> zzeqdVar4, zzeqd<zzckx> zzeqdVar5) {
        return new zzbpk(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbpl(this.zzfwd.get(), this.zzftm.get(), this.zzfrk.get(), this.zzfco.get(), this.zzevt.get());
    }
}
