package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzboi implements zzepq<zzaxr> {
    private final zzeqd<zzayc> zzfby;
    private final zzeqd<Clock> zzfra;
    private final zzeqd<zzdmx> zzftm;

    private zzboi(zzeqd<Clock> zzeqdVar, zzeqd<zzayc> zzeqdVar2, zzeqd<zzdmx> zzeqdVar3) {
        this.zzfra = zzeqdVar;
        this.zzfby = zzeqdVar2;
        this.zzftm = zzeqdVar3;
    }

    public static zzboi zzg(zzeqd<Clock> zzeqdVar, zzeqd<zzayc> zzeqdVar2, zzeqd<zzdmx> zzeqdVar3) {
        return new zzboi(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzaxr) zzepw.zza(this.zzfby.get().zza(this.zzfra.get(), this.zzftm.get().zzhje), "Cannot return null from a non-@Nullable @Provides method");
    }
}
