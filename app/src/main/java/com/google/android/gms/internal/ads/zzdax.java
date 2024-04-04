package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdax implements zzepq<zzdaw> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzaxs> zzgza;

    private zzdax(zzeqd<Executor> zzeqdVar, zzeqd<zzaxs> zzeqdVar2) {
        this.zzeuj = zzeqdVar;
        this.zzgza = zzeqdVar2;
    }

    public static zzdax zzas(zzeqd<Executor> zzeqdVar, zzeqd<zzaxs> zzeqdVar2) {
        return new zzdax(zzeqdVar, zzeqdVar2);
    }

    public static zzdaw zza(Executor executor, zzaxs zzaxsVar) {
        return new zzdaw(executor, zzaxsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzeuj.get(), this.zzgza.get());
    }
}
