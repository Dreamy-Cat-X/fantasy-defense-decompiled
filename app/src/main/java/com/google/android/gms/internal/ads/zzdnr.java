package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdnr<T> {
    private final zzdzk zzgfs;
    private final Deque<zzdzl<T>> zzhjx = new LinkedBlockingDeque();
    private final Callable<T> zzhjy;

    public zzdnr(Callable<T> callable, zzdzk zzdzkVar) {
        this.zzhjy = callable;
        this.zzgfs = zzdzkVar;
    }

    public final synchronized void ensureSize(int i) {
        int size = i - this.zzhjx.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zzhjx.add(this.zzgfs.zze(this.zzhjy));
        }
    }

    public final synchronized zzdzl<T> zzavo() {
        ensureSize(1);
        return this.zzhjx.poll();
    }

    public final synchronized void zzd(zzdzl<T> zzdzlVar) {
        this.zzhjx.addFirst(zzdzlVar);
    }
}
