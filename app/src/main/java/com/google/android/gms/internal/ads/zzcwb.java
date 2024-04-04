package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcwb implements zzepq<zzcvv> {
    private final zzeqd<zzdzk> zzftf;
    private final zzeqd<zzdqy> zzftq;
    private final zzeqd<zzblx> zzgro;
    private final zzeqd<Context> zzgvd;
    private final zzeqd<zzacd> zzgve;

    public zzcwb(zzeqd<Context> zzeqdVar, zzeqd<zzblx> zzeqdVar2, zzeqd<zzdqy> zzeqdVar3, zzeqd<zzdzk> zzeqdVar4, zzeqd<zzacd> zzeqdVar5) {
        this.zzgvd = zzeqdVar;
        this.zzgro = zzeqdVar2;
        this.zzftq = zzeqdVar3;
        this.zzftf = zzeqdVar4;
        this.zzgve = zzeqdVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcvv(this.zzgvd.get(), this.zzgro.get(), this.zzftq.get(), this.zzftf.get(), this.zzgve.get());
    }
}
