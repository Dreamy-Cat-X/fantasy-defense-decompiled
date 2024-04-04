package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzed implements Runnable {
    private final /* synthetic */ int zzxm;
    private final /* synthetic */ int zzxn;
    private final /* synthetic */ int zzxo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzed(zzdx zzdxVar, int i, int i2, int i3) {
        this.zzxm = i;
        this.zzxn = i2;
        this.zzxo = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdsn zzdsnVar;
        zzdp zzdpVar;
        try {
            zzdpVar = zzdx.zzwe;
            zzdpVar.zza(MotionEvent.obtain(0L, this.zzxm, 0, this.zzxn, this.zzxo, 0));
        } catch (Exception e) {
            zzdsnVar = zzdx.zzwg;
            zzdsnVar.zza(2022, -1L, e);
        }
    }
}
