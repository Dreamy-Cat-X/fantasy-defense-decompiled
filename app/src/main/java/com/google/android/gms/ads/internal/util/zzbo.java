package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzdva;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbo {
    private HandlerThread zzeev = null;
    private Handler handler = null;
    private int zzeew = 0;
    private final Object lock = new Object();

    public final Looper zzzn() {
        Looper looper;
        synchronized (this.lock) {
            if (this.zzeew == 0) {
                if (this.zzeev == null) {
                    zzd.zzeb("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.zzeev = handlerThread;
                    handlerThread.start();
                    this.handler = new zzdva(this.zzeev.getLooper());
                    zzd.zzeb("Looper thread started.");
                } else {
                    zzd.zzeb("Resuming the looper thread");
                    this.lock.notifyAll();
                }
            } else {
                Preconditions.checkNotNull(this.zzeev, "Invalid state: mHandlerThread should already been initialized.");
            }
            this.zzeew++;
            looper = this.zzeev.getLooper();
        }
        return looper;
    }

    public final Handler getHandler() {
        return this.handler;
    }
}
