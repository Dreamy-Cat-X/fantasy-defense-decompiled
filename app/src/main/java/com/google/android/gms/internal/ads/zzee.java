package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzee implements Runnable {
    private final /* synthetic */ MotionEvent zzxp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzee(zzdx zzdxVar, MotionEvent motionEvent) {
        this.zzxp = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdsn zzdsnVar;
        zzdp zzdpVar;
        try {
            zzdpVar = zzdx.zzwe;
            zzdpVar.zza(this.zzxp);
        } catch (Exception e) {
            zzdsnVar = zzdx.zzwg;
            zzdsnVar.zza(2022, -1L, e);
        }
    }
}
