package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbky implements zzepq<zzbsx> {
    private final zzeqd<Clock> zzfra;
    private final zzeqd<ScheduledExecutorService> zzfst;

    public zzbky(zzeqd<ScheduledExecutorService> zzeqdVar, zzeqd<Clock> zzeqdVar2) {
        this.zzfst = zzeqdVar;
        this.zzfra = zzeqdVar2;
    }

    public static zzbsx zza(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        return (zzbsx) zzepw.zza(new zzbsx(scheduledExecutorService, clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzfst.get(), this.zzfra.get());
    }
}
