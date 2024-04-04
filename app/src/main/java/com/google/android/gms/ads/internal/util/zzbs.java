package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbs {
    private long zzeez;
    private long zzefa = Long.MIN_VALUE;
    private final Object lock = new Object();

    public zzbs(long j) {
        this.zzeez = j;
    }

    public final boolean tryAcquire() {
        synchronized (this.lock) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime();
            if (this.zzefa + this.zzeez > elapsedRealtime) {
                return false;
            }
            this.zzefa = elapsedRealtime;
            return true;
        }
    }

    public final void zzfb(long j) {
        synchronized (this.lock) {
            this.zzeez = j;
        }
    }
}
