package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdyb<I, O> extends zzdyc<I, O, zzdyj<? super I, ? extends O>, zzdzl<? extends O>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyb(zzdzl<? extends I> zzdzlVar, zzdyj<? super I, ? extends O> zzdyjVar) {
        super(zzdzlVar, zzdyjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdyc
    final /* synthetic */ void setResult(Object obj) {
        setFuture((zzdzl) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzdyc
    final /* synthetic */ Object zzd(Object obj, @NullableDecl Object obj2) throws Exception {
        zzdyj zzdyjVar = (zzdyj) obj;
        zzdzl<O> zzf = zzdyjVar.zzf(obj2);
        zzdwa.zza(zzf, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzdyjVar);
        return zzf;
    }
}
