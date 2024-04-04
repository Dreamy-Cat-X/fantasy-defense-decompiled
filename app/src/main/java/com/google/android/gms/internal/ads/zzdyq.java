package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdyq<V> extends zzdyp<V> {
    private final /* synthetic */ zzdyn zzhyr;
    private final Callable<V> zzhys;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdyq(zzdyn zzdynVar, Callable<V> callable, Executor executor) {
        super(zzdynVar, executor);
        this.zzhyr = zzdynVar;
        this.zzhys = (Callable) zzdwa.checkNotNull(callable);
    }

    @Override // com.google.android.gms.internal.ads.zzdzh
    final V zzbae() throws Exception {
        return this.zzhys.call();
    }

    @Override // com.google.android.gms.internal.ads.zzdyp
    final void setValue(V v) {
        this.zzhyr.set(v);
    }

    @Override // com.google.android.gms.internal.ads.zzdzh
    final String zzbaf() {
        return this.zzhys.toString();
    }
}
