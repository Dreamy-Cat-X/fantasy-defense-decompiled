package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdrq implements zzdro {
    private final zzdro zzhpw;
    private final Queue<zzdrp> zzhpx = new LinkedBlockingQueue();
    private final int zzhpy = ((Integer) zzwo.zzqq().zzd(zzabh.zzczn)).intValue();
    private final AtomicBoolean zzhpz = new AtomicBoolean(false);

    public zzdrq(zzdro zzdroVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzhpw = zzdroVar;
        long intValue = ((Integer) zzwo.zzqq().zzd(zzabh.zzczm)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdrt
            private final zzdrq zzhqd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhqd = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzhqd.zzaxn();
            }
        }, intValue, intValue, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzdro
    public final void zzb(zzdrp zzdrpVar) {
        if (this.zzhpx.size() >= this.zzhpy) {
            if (this.zzhpz.getAndSet(true)) {
                return;
            }
            Queue<zzdrp> queue = this.zzhpx;
            zzdrp zzgz = zzdrp.zzgz("dropped_event");
            Map<String, String> zzlr = zzdrpVar.zzlr();
            if (zzlr.containsKey("action")) {
                zzgz.zzu("dropped_action", zzlr.get("action"));
            }
            queue.offer(zzgz);
            return;
        }
        this.zzhpx.offer(zzdrpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdro
    public final String zzc(zzdrp zzdrpVar) {
        return this.zzhpw.zzc(zzdrpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaxn() {
        while (!this.zzhpx.isEmpty()) {
            this.zzhpw.zzb(this.zzhpx.remove());
        }
    }
}
