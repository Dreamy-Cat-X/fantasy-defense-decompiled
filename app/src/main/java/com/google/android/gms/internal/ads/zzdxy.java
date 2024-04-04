package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdxy<V, X extends Throwable> extends zzdxv<V, X, zzdyj<? super X, ? extends V>, zzdzl<? extends V>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxy(zzdzl<? extends V> zzdzlVar, Class<X> cls, zzdyj<? super X, ? extends V> zzdyjVar) {
        super(zzdzlVar, cls, zzdyjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdxv
    final /* synthetic */ void setResult(Object obj) {
        setFuture((zzdzl) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzdxv
    final /* synthetic */ Object zza(Object obj, Throwable th) throws Exception {
        zzdyj zzdyjVar = (zzdyj) obj;
        zzdzl zzf = zzdyjVar.zzf(th);
        zzdwa.zza(zzf, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzdyjVar);
        return zzf;
    }
}
