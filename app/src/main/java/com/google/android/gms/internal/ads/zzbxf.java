package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbxf<T> {
    public Executor executor;
    public T zzfzh;

    public static <T> zzbxf<T> zzb(T t, Executor executor) {
        return new zzbxf<>(t, executor);
    }

    public zzbxf(T t, Executor executor) {
        this.zzfzh = t;
        this.executor = executor;
    }
}
