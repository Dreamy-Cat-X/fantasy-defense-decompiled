package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzdut {
    ExecutorService zza(int i, ThreadFactory threadFactory, int i2);

    ExecutorService zza(ThreadFactory threadFactory, int i);

    ExecutorService zzb(ThreadFactory threadFactory, int i);

    ScheduledExecutorService zzb(int i, ThreadFactory threadFactory, int i2);

    ExecutorService zzel(int i);

    ExecutorService zzem(int i);
}
