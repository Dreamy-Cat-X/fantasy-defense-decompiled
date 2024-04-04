package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzder;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddf<S extends zzder<?>> implements zzdeu<S> {
    private final ScheduledExecutorService zzfro;
    private final zzdeu<S> zzgzw;
    private final long zzhas;

    public zzddf(zzdeu<S> zzdeuVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zzgzw = zzdeuVar;
        this.zzhas = j;
        this.zzfro = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<S> zzata() {
        zzdzl<S> zzata = this.zzgzw.zzata();
        long j = this.zzhas;
        if (j > 0) {
            zzata = zzdyz.zza(zzata, j, TimeUnit.MILLISECONDS, this.zzfro);
        }
        return zzdyz.zzb(zzata, Throwable.class, zzddi.zzbon, zzayv.zzegn);
    }
}
