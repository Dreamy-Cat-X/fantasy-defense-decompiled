package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcka implements zzepq<zzcjy> {
    private final zzeqd<Clock> zzfra;
    private final zzeqd<zzcjs> zzgkg;
    private final zzeqd<Set<zzckb>> zzgkh;

    private zzcka(zzeqd<zzcjs> zzeqdVar, zzeqd<Set<zzckb>> zzeqdVar2, zzeqd<Clock> zzeqdVar3) {
        this.zzgkg = zzeqdVar;
        this.zzgkh = zzeqdVar2;
        this.zzfra = zzeqdVar3;
    }

    public static zzcka zzw(zzeqd<zzcjs> zzeqdVar, zzeqd<Set<zzckb>> zzeqdVar2, zzeqd<Clock> zzeqdVar3) {
        return new zzcka(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcjy(this.zzgkg.get(), this.zzgkh.get(), this.zzfra.get());
    }
}
