package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdzr<V> extends zzdyx<V> implements zzdzl<V>, ScheduledFuture<V> {
    private final ScheduledFuture<?> zzhzi;

    public zzdzr(zzdzl<V> zzdzlVar, ScheduledFuture<?> scheduledFuture) {
        super(zzdzlVar);
        this.zzhzi = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzdyv, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.zzhzi.cancel(z);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zzhzi.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return this.zzhzi.compareTo(delayed);
    }
}
