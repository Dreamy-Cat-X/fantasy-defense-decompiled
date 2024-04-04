package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdse implements zzepq<zzdsf> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdmw> zzfnj;
    private final zzeqd<zzef> zzfqg;
    private final zzeqd<Clock> zzfra;
    private final zzeqd<zzayt> zzfrk;
    private final zzeqd<String> zzgzg;
    private final zzeqd<String> zzgzo;
    private final zzeqd<zzcud> zzhqh;

    private zzdse(zzeqd<zzcud> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<String> zzeqdVar3, zzeqd<String> zzeqdVar4, zzeqd<Context> zzeqdVar5, zzeqd<zzdmw> zzeqdVar6, zzeqd<Clock> zzeqdVar7, zzeqd<zzef> zzeqdVar8) {
        this.zzhqh = zzeqdVar;
        this.zzfrk = zzeqdVar2;
        this.zzgzg = zzeqdVar3;
        this.zzgzo = zzeqdVar4;
        this.zzeuo = zzeqdVar5;
        this.zzfnj = zzeqdVar6;
        this.zzfra = zzeqdVar7;
        this.zzfqg = zzeqdVar8;
    }

    public static zzdse zzb(zzeqd<zzcud> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<String> zzeqdVar3, zzeqd<String> zzeqdVar4, zzeqd<Context> zzeqdVar5, zzeqd<zzdmw> zzeqdVar6, zzeqd<Clock> zzeqdVar7, zzeqd<zzef> zzeqdVar8) {
        return new zzdse(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5, zzeqdVar6, zzeqdVar7, zzeqdVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdsf(this.zzhqh.get(), this.zzfrk.get(), this.zzgzg.get(), this.zzgzo.get(), this.zzeuo.get(), this.zzfnj.get(), this.zzfra.get(), this.zzfqg.get());
    }
}
