package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdzo extends zzdzp implements zzdzk, ScheduledExecutorService {
    private final ScheduledExecutorService zzhzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzo(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.zzhzf = (ScheduledExecutorService) zzdwa.checkNotNull(scheduledExecutorService);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzdzq zzdzqVar = new zzdzq(runnable);
        return new zzdzr(zzdzqVar, this.zzhzf.scheduleWithFixedDelay(zzdzqVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzdzq zzdzqVar = new zzdzq(runnable);
        return new zzdzr(zzdzqVar, this.zzhzf.scheduleAtFixedRate(zzdzqVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzdzw zzf = zzdzw.zzf(callable);
        return new zzdzr(zzf, this.zzhzf.schedule(zzf, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzdzw zza = zzdzw.zza(runnable, (Object) null);
        return new zzdzr(zza, this.zzhzf.schedule(zza, j, timeUnit));
    }
}
