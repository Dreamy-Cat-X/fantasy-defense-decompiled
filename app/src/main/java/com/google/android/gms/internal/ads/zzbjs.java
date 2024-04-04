package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbjs implements zzrm {
    private final Clock zzbpw;
    private final ScheduledExecutorService zzfro;
    private ScheduledFuture<?> zzfrp;
    private long zzfrq = -1;
    private long zzfrr = -1;
    private Runnable zzebo = null;
    private boolean zzfrs = false;

    public zzbjs(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zzfro = scheduledExecutorService;
        this.zzbpw = clock;
        com.google.android.gms.ads.internal.zzp.zzkt().zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzp(boolean z) {
        if (z) {
            zzaja();
        } else {
            zzaiz();
        }
    }

    public final synchronized void zza(int i, Runnable runnable) {
        this.zzebo = runnable;
        long j = i;
        this.zzfrq = this.zzbpw.elapsedRealtime() + j;
        this.zzfrp = this.zzfro.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    private final synchronized void zzaiz() {
        if (!this.zzfrs) {
            if (this.zzfrp != null && !this.zzfrp.isDone()) {
                this.zzfrp.cancel(true);
                this.zzfrr = this.zzfrq - this.zzbpw.elapsedRealtime();
            } else {
                this.zzfrr = -1L;
            }
            this.zzfrs = true;
        }
    }

    private final synchronized void zzaja() {
        if (this.zzfrs) {
            if (this.zzfrr > 0 && this.zzfrp != null && this.zzfrp.isCancelled()) {
                this.zzfrp = this.zzfro.schedule(this.zzebo, this.zzfrr, TimeUnit.MILLISECONDS);
            }
            this.zzfrs = false;
        }
    }
}
