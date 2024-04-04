package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdah implements zzepq<zzdaf> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdbo<zzdex>> zzewl;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<zzaxs> zzgza;

    private zzdah(zzeqd<zzdbo<zzdex>> zzeqdVar, zzeqd<zzdmx> zzeqdVar2, zzeqd<Context> zzeqdVar3, zzeqd<zzaxs> zzeqdVar4) {
        this.zzewl = zzeqdVar;
        this.zzftm = zzeqdVar2;
        this.zzeuo = zzeqdVar3;
        this.zzgza = zzeqdVar4;
    }

    public static zzdah zzh(zzeqd<zzdbo<zzdex>> zzeqdVar, zzeqd<zzdmx> zzeqdVar2, zzeqd<Context> zzeqdVar3, zzeqd<zzaxs> zzeqdVar4) {
        return new zzdah(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdaf(this.zzewl.get(), this.zzftm.get(), this.zzeuo.get(), this.zzgza.get());
    }
}
