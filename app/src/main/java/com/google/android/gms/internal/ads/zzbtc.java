package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbtc implements Runnable {
    private final WeakReference<zzbsx> zzfxy;

    private zzbtc(zzbsx zzbsxVar) {
        this.zzfxy = new WeakReference<>(zzbsxVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbsx zzbsxVar = this.zzfxy.get();
        if (zzbsxVar != null) {
            zzbsx.zza(zzbsxVar);
        }
    }
}
