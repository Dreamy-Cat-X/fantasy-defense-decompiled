package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzazi<T> implements zzdza<T> {
    private final /* synthetic */ zzazj zzegu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazi(zzazj zzazjVar) {
        this.zzegu = zzazjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void onSuccess(T t) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zzegu.zzegw;
        atomicInteger.set(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zzegu.zzegw;
        atomicInteger.set(-1);
    }
}
