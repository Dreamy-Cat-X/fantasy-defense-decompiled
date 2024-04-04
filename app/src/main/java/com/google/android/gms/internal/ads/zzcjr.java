package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcjr implements zzepq<zzbxf<zzdre>> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzcjy> zzfwa;
    private final zzeqd<zzcou> zzfwb;

    private zzcjr(zzeqd<zzcjy> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzcou> zzeqdVar3) {
        this.zzfwa = zzeqdVar;
        this.zzeuj = zzeqdVar2;
        this.zzfwb = zzeqdVar3;
    }

    public static zzcjr zzv(zzeqd<zzcjy> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzcou> zzeqdVar3) {
        return new zzcjr(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        zzbxf zzbxfVar;
        zzcjy zzcjyVar = this.zzfwa.get();
        Executor executor = this.zzeuj.get();
        zzcou zzcouVar = this.zzfwb.get();
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczk)).booleanValue()) {
            zzbxfVar = new zzbxf(zzcouVar, executor);
        } else {
            zzbxfVar = new zzbxf(zzcjyVar, executor);
        }
        return (zzbxf) zzepw.zza(zzbxfVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
