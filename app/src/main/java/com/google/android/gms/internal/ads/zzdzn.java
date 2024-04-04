package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdzn {
    public static Executor zzbai() {
        return zzdys.INSTANCE;
    }

    public static zzdzk zza(ExecutorService executorService) {
        if (executorService instanceof zzdzk) {
            return (zzdzk) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new zzdzo((ScheduledExecutorService) executorService);
        }
        return new zzdzp(executorService);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor zza(Executor executor, zzdxz<?> zzdxzVar) {
        zzdwa.checkNotNull(executor);
        zzdwa.checkNotNull(zzdxzVar);
        return executor == zzdys.INSTANCE ? executor : new zzdzm(executor, zzdxzVar);
    }
}
