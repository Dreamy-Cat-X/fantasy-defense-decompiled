package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcjm implements zzepq<zzbxf<zzbtf>> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzcjk> zzfwa;
    private final zzeqd<zzcoo> zzfwb;

    private zzcjm(zzeqd<zzcjk> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzcoo> zzeqdVar3) {
        this.zzfwa = zzeqdVar;
        this.zzeuj = zzeqdVar2;
        this.zzfwb = zzeqdVar3;
    }

    public static zzcjm zzs(zzeqd<zzcjk> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzcoo> zzeqdVar3) {
        return new zzcjm(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        zzbxf zzbxfVar;
        zzcjk zzcjkVar = this.zzfwa.get();
        Executor executor = this.zzeuj.get();
        zzcoo zzcooVar = this.zzfwb.get();
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczk)).booleanValue()) {
            zzbxfVar = new zzbxf(zzcooVar, executor);
        } else {
            zzbxfVar = new zzbxf(zzcjkVar, executor);
        }
        return (zzbxf) zzepw.zza(zzbxfVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
