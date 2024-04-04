package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdxx<V, X extends Throwable> extends zzdxv<V, X, zzdvo<? super X, ? extends V>, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxx(zzdzl<? extends V> zzdzlVar, Class<X> cls, zzdvo<? super X, ? extends V> zzdvoVar) {
        super(zzdzlVar, cls, zzdvoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdxv
    final void setResult(@NullableDecl V v) {
        set(v);
    }

    @Override // com.google.android.gms.internal.ads.zzdxv
    @NullableDecl
    final /* synthetic */ Object zza(Object obj, Throwable th) throws Exception {
        return ((zzdvo) obj).apply(th);
    }
}
