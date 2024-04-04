package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbwj implements zzepq<zzcud> {
    private final zzeqd<zzcuf> zzfcq;
    private final zzeqd<zzcqx> zzfcr;
    private final zzeqd<Clock> zzfra;
    private final zzbvl zzfzc;

    private zzbwj(zzbvl zzbvlVar, zzeqd<Clock> zzeqdVar, zzeqd<zzcuf> zzeqdVar2, zzeqd<zzcqx> zzeqdVar3) {
        this.zzfzc = zzbvlVar;
        this.zzfra = zzeqdVar;
        this.zzfcq = zzeqdVar2;
        this.zzfcr = zzeqdVar3;
    }

    public static zzbwj zza(zzbvl zzbvlVar, zzeqd<Clock> zzeqdVar, zzeqd<zzcuf> zzeqdVar2, zzeqd<zzcqx> zzeqdVar3) {
        return new zzbwj(zzbvlVar, zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzcud) zzepw.zza(this.zzfzc.zza(this.zzfra.get(), this.zzfcq.get(), this.zzfcr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
