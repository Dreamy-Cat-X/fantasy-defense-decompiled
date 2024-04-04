package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdgq implements zzdeu<zzdgn> {
    private Context context;
    private ScheduledExecutorService zzfpk;
    private zzara zzhdb;

    public zzdgq(zzara zzaraVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zzhdb = zzaraVar;
        this.zzfpk = scheduledExecutorService;
        this.context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdgn> zzata() {
        return zzdyz.zzb(zzdyz.zza(this.zzhdb.zzo(this.context), ((Long) zzwo.zzqq().zzd(zzabh.zzctc)).longValue(), TimeUnit.MILLISECONDS, this.zzfpk), zzdgp.zzdyn, zzayv.zzegi);
    }
}
