package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzqg implements Handler.Callback, Choreographer.FrameCallback {
    private static final zzqg zzbmh = new zzqg();
    private final Handler handler;
    public volatile long zzbmg;
    private final HandlerThread zzbmi;
    private Choreographer zzbmj;
    private int zzbmk;

    public static zzqg zzjp() {
        return zzbmh;
    }

    private zzqg() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.zzbmi = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.zzbmi.getLooper(), this);
        this.handler = handler;
        handler.sendEmptyMessage(0);
    }

    public final void zzjq() {
        this.handler.sendEmptyMessage(1);
    }

    public final void removeObserver() {
        this.handler.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.zzbmg = j;
        this.zzbmj.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.zzbmj = Choreographer.getInstance();
            return true;
        }
        if (i == 1) {
            int i2 = this.zzbmk + 1;
            this.zzbmk = i2;
            if (i2 == 1) {
                this.zzbmj.postFrameCallback(this);
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i3 = this.zzbmk - 1;
        this.zzbmk = i3;
        if (i3 == 0) {
            this.zzbmj.removeFrameCallback(this);
            this.zzbmg = 0L;
        }
        return true;
    }
}
