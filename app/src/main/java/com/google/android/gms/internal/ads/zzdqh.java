package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdqh implements zzepq<ThreadFactory> {
    public static zzdqh zzaxi() {
        zzdqh zzdqhVar;
        zzdqhVar = zzdqg.zzhoc;
        return zzdqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (ThreadFactory) zzepw.zza(new zzdpt(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
