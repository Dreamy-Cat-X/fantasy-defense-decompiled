package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdrr implements zzepq<zzdro> {
    private final zzeqd<zzdru> zzeuz;
    private final zzeqd<ScheduledExecutorService> zzfqc;
    private final zzeqd<zzdsd> zzhqa;

    public zzdrr(zzeqd<zzdru> zzeqdVar, zzeqd<zzdsd> zzeqdVar2, zzeqd<ScheduledExecutorService> zzeqdVar3) {
        this.zzeuz = zzeqdVar;
        this.zzhqa = zzeqdVar2;
        this.zzfqc = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        Object obj;
        zzepk zzav = zzepr.zzav(this.zzeuz);
        zzepk zzav2 = zzepr.zzav(this.zzhqa);
        ScheduledExecutorService scheduledExecutorService = this.zzfqc.get();
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczl)).booleanValue()) {
            obj = new zzdrq((zzdro) zzav.get(), scheduledExecutorService);
        } else {
            obj = (zzdro) zzav2.get();
        }
        return (zzdro) zzepw.zza(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
