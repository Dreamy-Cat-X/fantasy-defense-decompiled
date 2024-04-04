package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public class zzazj<T> {
    private final zzazc<T> zzegv = new zzazc<>();
    private final AtomicInteger zzegw = new AtomicInteger(0);

    public zzazj() {
        zzdyz.zza(this.zzegv, new zzazi(this), zzayv.zzegn);
    }

    @Deprecated
    public final void zza(zzazg<T> zzazgVar, zzaze zzazeVar) {
        zzdyz.zza(this.zzegv, new zzazl(this, zzazgVar, zzazeVar), zzayv.zzegn);
    }

    @Deprecated
    public final void zzl(T t) {
        this.zzegv.set(t);
    }

    @Deprecated
    public final void reject() {
        this.zzegv.setException(new Exception());
    }

    @Deprecated
    public final int getStatus() {
        return this.zzegw.get();
    }
}
