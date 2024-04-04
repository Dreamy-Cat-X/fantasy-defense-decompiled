package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbpg implements zzepq<zzbxf<zzbrj>> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzcji> zzfwa;
    private final zzeqd<zzcom> zzfwb;

    private zzbpg(zzeqd<zzcji> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzcom> zzeqdVar3) {
        this.zzfwa = zzeqdVar;
        this.zzeuj = zzeqdVar2;
        this.zzfwb = zzeqdVar3;
    }

    public static zzbpg zzj(zzeqd<zzcji> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzcom> zzeqdVar3) {
        return new zzbpg(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        zzbxf zzbxfVar;
        zzcji zzcjiVar = this.zzfwa.get();
        Executor executor = this.zzeuj.get();
        zzcom zzcomVar = this.zzfwb.get();
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczk)).booleanValue()) {
            zzbxfVar = new zzbxf(zzcomVar, executor);
        } else {
            zzbxfVar = new zzbxf(zzcjiVar, executor);
        }
        return (zzbxf) zzepw.zza(zzbxfVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
