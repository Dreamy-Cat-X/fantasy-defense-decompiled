package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdps implements zzepq<Executor> {
    public static zzdps zzawu() {
        zzdps zzdpsVar;
        zzdpsVar = zzdpv.zzhnv;
        return zzdpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Executor) zzepw.zza(zzayv.zzegm, "Cannot return null from a non-@Nullable @Provides method");
    }
}
