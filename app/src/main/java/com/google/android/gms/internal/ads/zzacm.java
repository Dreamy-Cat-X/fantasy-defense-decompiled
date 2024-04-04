package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzacm {
    private MotionEvent zzdbd = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private MotionEvent zzdbe = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    public final void zza(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zzdbd.getEventTime()) {
            this.zzdbd = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.zzdbe.getEventTime()) {
                return;
            }
            this.zzdbe = MotionEvent.obtain(motionEvent);
        }
    }

    public final MotionEvent zzsx() {
        return this.zzdbd;
    }

    public final MotionEvent zzsy() {
        return this.zzdbe;
    }
}
