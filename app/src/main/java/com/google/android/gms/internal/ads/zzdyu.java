package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzdyu<V> extends zzdzd<V> {
    public static <V> zzdyu<V> zzg(zzdzl<V> zzdzlVar) {
        if (zzdzlVar instanceof zzdyu) {
            return (zzdyu) zzdzlVar;
        }
        return new zzdyw(zzdzlVar);
    }

    public final <X extends Throwable> zzdyu<V> zza(Class<X> cls, zzdvo<? super X, ? extends V> zzdvoVar, Executor executor) {
        zzdxx zzdxxVar = new zzdxx(this, cls, zzdvoVar);
        addListener(zzdxxVar, zzdzn.zza(executor, zzdxxVar));
        return zzdxxVar;
    }

    public final <X extends Throwable> zzdyu<V> zza(Class<X> cls, zzdyj<? super X, ? extends V> zzdyjVar, Executor executor) {
        zzdxy zzdxyVar = new zzdxy(this, cls, zzdyjVar);
        addListener(zzdxyVar, zzdzn.zza(executor, zzdxyVar));
        return zzdxyVar;
    }

    public final zzdyu<V> zza(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (zzdyu) zzdyz.zza(this, j, timeUnit, scheduledExecutorService);
    }

    public final <T> zzdyu<T> zzb(zzdyj<? super V, T> zzdyjVar, Executor executor) {
        zzdwa.checkNotNull(executor);
        zzdyb zzdybVar = new zzdyb(this, zzdyjVar);
        addListener(zzdybVar, zzdzn.zza(executor, zzdybVar));
        return zzdybVar;
    }

    public final <T> zzdyu<T> zza(zzdvo<? super V, T> zzdvoVar, Executor executor) {
        zzdwa.checkNotNull(zzdvoVar);
        zzdye zzdyeVar = new zzdye(this, zzdvoVar);
        addListener(zzdyeVar, zzdzn.zza(executor, zzdyeVar));
        return zzdyeVar;
    }
}
