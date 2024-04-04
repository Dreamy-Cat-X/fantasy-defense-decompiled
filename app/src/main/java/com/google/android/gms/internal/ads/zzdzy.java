package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdzy<V> extends zzdzh<V> {
    private final Callable<V> zzhys;
    private final /* synthetic */ zzdzw zzhzn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzy(zzdzw zzdzwVar, Callable<V> callable) {
        this.zzhzn = zzdzwVar;
        this.zzhys = (Callable) zzdwa.checkNotNull(callable);
    }

    @Override // com.google.android.gms.internal.ads.zzdzh
    final boolean isDone() {
        return this.zzhzn.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzdzh
    final V zzbae() throws Exception {
        return this.zzhys.call();
    }

    @Override // com.google.android.gms.internal.ads.zzdzh
    final void zzb(V v, Throwable th) {
        if (th == null) {
            this.zzhzn.set(v);
        } else {
            this.zzhzn.setException(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdzh
    final String zzbaf() {
        return this.zzhys.toString();
    }
}
