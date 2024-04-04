package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdqe implements zzepq<ScheduledExecutorService> {
    private final zzeqd<ThreadFactory> zzhoa;

    public zzdqe(zzeqd<ThreadFactory> zzeqdVar) {
        this.zzhoa = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (ScheduledExecutorService) zzepw.zza(zzdus.zzaza().zzb(1, this.zzhoa.get(), zzdvb.zzhtr), "Cannot return null from a non-@Nullable @Provides method");
    }
}
