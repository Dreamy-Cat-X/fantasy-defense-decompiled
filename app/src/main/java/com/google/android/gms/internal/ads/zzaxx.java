package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaxx {
    private final Object lock;
    private volatile int zzebc;
    private volatile long zzebd;

    private zzaxx() {
        this.lock = new Object();
        this.zzebc = zzaxw.zzeay;
        this.zzebd = 0L;
    }

    public final void zzxm() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzebc == zzaxw.zzeba) {
                if (this.zzebd + ((Long) zzwo.zzqq().zzd(zzabh.zzcwo)).longValue() <= currentTimeMillis) {
                    this.zzebc = zzaxw.zzeay;
                }
            }
        }
        long currentTimeMillis2 = com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzebc != 2) {
                return;
            }
            this.zzebc = 3;
            if (this.zzebc == zzaxw.zzeba) {
                this.zzebd = currentTimeMillis2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaxx(zzaxu zzaxuVar) {
        this();
    }
}
