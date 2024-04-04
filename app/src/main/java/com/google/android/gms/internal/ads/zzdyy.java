package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdyy<V> extends zzdyv<V> implements zzdzl<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdyv
    /* renamed from: zzbah, reason: merged with bridge method [inline-methods] */
    public abstract zzdzl<? extends V> zzazi();

    @Override // com.google.android.gms.internal.ads.zzdzl
    public void addListener(Runnable runnable, Executor executor) {
        zzazi().addListener(runnable, executor);
    }
}
