package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbyx implements zzepq<zzbxf<zzbus>> {
    private final zzeqd<Executor> zzeuj;
    private final zzbye zzfzr;

    private zzbyx(zzbye zzbyeVar, zzeqd<Executor> zzeqdVar) {
        this.zzfzr = zzbyeVar;
        this.zzeuj = zzeqdVar;
    }

    public static zzbyx zzf(zzbye zzbyeVar, zzeqd<Executor> zzeqdVar) {
        return new zzbyx(zzbyeVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(this.zzfzr.zzb(this.zzeuj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
