package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
final class zza implements Runnable {
    private final Runnable zza;
    private final int zzb;

    public zza(Runnable runnable, int i) {
        this.zza = runnable;
        this.zzb = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.zzb);
        this.zza.run();
    }
}
