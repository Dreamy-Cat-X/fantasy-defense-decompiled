package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbal {
    private long zzejb;
    private final long zzeja = TimeUnit.MILLISECONDS.toNanos(((Long) zzwo.zzqq().zzd(zzabh.zzcmo)).longValue());
    private boolean zzejc = true;

    public final void zzaaj() {
        this.zzejc = true;
    }

    public final void zza(SurfaceTexture surfaceTexture, zzazy zzazyVar) {
        if (zzazyVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.zzejc || Math.abs(timestamp - this.zzejb) >= this.zzeja) {
            this.zzejc = false;
            this.zzejb = timestamp;
            com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzbak(this, zzazyVar));
        }
    }
}
