package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbsx extends zzbvk<zzbtb> {
    private final Clock zzbpw;
    private boolean zzfrb;
    private final ScheduledExecutorService zzfro;
    private long zzfrq;
    private long zzfrr;
    private ScheduledFuture<?> zzfxx;

    public zzbsx(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.zzfrq = -1L;
        this.zzfrr = -1L;
        this.zzfrb = false;
        this.zzfro = scheduledExecutorService;
        this.zzbpw = clock;
    }

    public final synchronized void onPause() {
        if (!this.zzfrb) {
            if (this.zzfxx != null && !this.zzfxx.isCancelled()) {
                this.zzfxx.cancel(true);
                this.zzfrr = this.zzfrq - this.zzbpw.elapsedRealtime();
            } else {
                this.zzfrr = -1L;
            }
            this.zzfrb = true;
        }
    }

    public final synchronized void onResume() {
        if (this.zzfrb) {
            if (this.zzfrr > 0 && this.zzfxx.isCancelled()) {
                zzfd(this.zzfrr);
            }
            this.zzfrb = false;
        }
    }

    public final synchronized void zzalq() {
        this.zzfrb = false;
        zzfd(0L);
    }

    public final synchronized void zzdy(int i) {
        if (i <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i);
        if (!this.zzfrb) {
            if (this.zzbpw.elapsedRealtime() > this.zzfrq || this.zzfrq - this.zzbpw.elapsedRealtime() > millis) {
                zzfd(millis);
            }
        } else {
            if (this.zzfrr <= 0 || millis >= this.zzfrr) {
                millis = this.zzfrr;
            }
            this.zzfrr = millis;
        }
    }

    private final synchronized void zzfd(long j) {
        if (this.zzfxx != null && !this.zzfxx.isDone()) {
            this.zzfxx.cancel(true);
        }
        this.zzfrq = this.zzbpw.elapsedRealtime() + j;
        this.zzfxx = this.zzfro.schedule(new zzbtc(this), j, TimeUnit.MILLISECONDS);
    }

    public final void zzalr() {
        zza(zzbta.zzfxn);
    }
}
