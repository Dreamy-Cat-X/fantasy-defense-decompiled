package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxz;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdzq extends zzdxz.zzh<Void> implements Runnable {
    private final Runnable zzhzh;

    public zzdzq(Runnable runnable) {
        this.zzhzh = (Runnable) zzdwa.checkNotNull(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzhzh.run();
        } catch (Throwable th) {
            setException(th);
            throw zzdwk.zzj(th);
        }
    }
}
