package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzdzl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zza {
    private volatile Thread thread;
    private final Runnable zzebo = new zzc(this);
    private boolean zzebp = false;

    public abstract void zzwc();

    public final zzdzl<?> zzyc() {
        return zzayv.zzegj.zzg(this.zzebo);
    }
}
