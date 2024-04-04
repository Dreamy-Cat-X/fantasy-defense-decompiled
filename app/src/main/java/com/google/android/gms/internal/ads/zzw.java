package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzw extends Thread {
    private final BlockingQueue<zzaa<?>> zzaj;
    private final zzx zzak;
    private final zzk zzn;
    private final zzak zzo;
    private volatile boolean zzp = false;

    public zzw(BlockingQueue<zzaa<?>> blockingQueue, zzx zzxVar, zzk zzkVar, zzak zzakVar) {
        this.zzaj = blockingQueue;
        this.zzak = zzxVar;
        this.zzn = zzkVar;
        this.zzo = zzakVar;
    }

    public final void quit() {
        this.zzp = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                processRequest();
            } catch (InterruptedException unused) {
                if (this.zzp) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaq.e("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    private final void processRequest() throws InterruptedException {
        zzaa<?> take = this.zzaj.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        take.zzd(3);
        try {
            take.zzc("network-queue-take");
            take.isCanceled();
            TrafficStats.setThreadStatsTag(take.zzd());
            zzy zzc = this.zzak.zzc(take);
            take.zzc("network-http-complete");
            if (zzc.zzam && take.zzl()) {
                take.zzd("not-modified");
                take.zzm();
                return;
            }
            zzaj<?> zza = take.zza(zzc);
            take.zzc("network-parse-complete");
            if (take.zzh() && zza.zzbq != null) {
                this.zzn.zza(take.zze(), zza.zzbq);
                take.zzc("network-cache-written");
            }
            take.zzk();
            this.zzo.zzb(take, zza);
            take.zza(zza);
        } catch (zzao e) {
            e.zza(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.zzo.zza(take, e);
            take.zzm();
        } catch (Exception e2) {
            zzaq.zza(e2, "Unhandled exception %s", e2.toString());
            zzao zzaoVar = new zzao(e2);
            zzaoVar.zza(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.zzo.zza(take, zzaoVar);
            take.zzm();
        } finally {
            take.zzd(4);
        }
    }
}
