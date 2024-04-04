package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzayw implements Executor {
    private final Handler zzego = new com.google.android.gms.ads.internal.util.zzg(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzp.zzkq();
                com.google.android.gms.ads.internal.util.zzm.zza(com.google.android.gms.ads.internal.zzp.zzku().getApplicationContext(), th);
                throw th;
            }
        }
        this.zzego.post(runnable);
    }
}
