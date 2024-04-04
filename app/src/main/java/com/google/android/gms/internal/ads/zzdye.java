package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdye<I, O> extends zzdyc<I, O, zzdvo<? super I, ? extends O>, O> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdye(zzdzl<? extends I> zzdzlVar, zzdvo<? super I, ? extends O> zzdvoVar) {
        super(zzdzlVar, zzdvoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdyc
    final void setResult(@NullableDecl O o) {
        set(o);
    }

    @Override // com.google.android.gms.internal.ads.zzdyc
    @NullableDecl
    final /* synthetic */ Object zzd(Object obj, @NullableDecl Object obj2) throws Exception {
        return ((zzdvo) obj).apply(obj2);
    }
}
