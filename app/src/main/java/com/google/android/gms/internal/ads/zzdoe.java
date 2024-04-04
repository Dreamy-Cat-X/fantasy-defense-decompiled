package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdoe implements zzepq<zzdod> {
    private final zzeqd<zzayt> zzfrk;
    private final zzeqd<Context> zzfwd;
    private final zzeqd<zzaxs> zzgza;

    public zzdoe(zzeqd<Context> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<zzaxs> zzeqdVar3) {
        this.zzfwd = zzeqdVar;
        this.zzfrk = zzeqdVar2;
        this.zzgza = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdod(this.zzfwd.get(), this.zzfrk.get(), this.zzgza.get());
    }
}
