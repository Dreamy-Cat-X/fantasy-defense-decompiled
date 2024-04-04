package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdze<V> {
    private final boolean zzhyc;
    private final zzdws<zzdzl<? extends V>> zzhyy;

    private zzdze(boolean z, zzdws<zzdzl<? extends V>> zzdwsVar) {
        this.zzhyc = z;
        this.zzhyy = zzdwsVar;
    }

    public final <C> zzdzl<C> zzb(Callable<C> callable, Executor executor) {
        return new zzdyn(this.zzhyy, this.zzhyc, executor, callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdze(boolean z, zzdws zzdwsVar, zzdzc zzdzcVar) {
        this(z, zzdwsVar);
    }
}
