package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrz;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcvt<AdT, AdapterT, ListenerT extends zzbrz> implements zzepq<zzcvp<AdT, AdapterT, ListenerT>> {
    private final zzeqd<zzcqv<AdapterT, ListenerT>> zzfow;
    private final zzeqd<zzdzk> zzftf;
    private final zzeqd<zzdqy> zzftq;
    private final zzeqd<zzcqy<AdT, AdapterT, ListenerT>> zzguv;

    private zzcvt(zzeqd<zzdqy> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<zzcqv<AdapterT, ListenerT>> zzeqdVar3, zzeqd<zzcqy<AdT, AdapterT, ListenerT>> zzeqdVar4) {
        this.zzftq = zzeqdVar;
        this.zzftf = zzeqdVar2;
        this.zzfow = zzeqdVar3;
        this.zzguv = zzeqdVar4;
    }

    public static <AdT, AdapterT, ListenerT extends zzbrz> zzcvt<AdT, AdapterT, ListenerT> zzg(zzeqd<zzdqy> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<zzcqv<AdapterT, ListenerT>> zzeqdVar3, zzeqd<zzcqy<AdT, AdapterT, ListenerT>> zzeqdVar4) {
        return new zzcvt<>(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcvp(this.zzftq.get(), this.zzftf.get(), this.zzfow.get(), this.zzguv.get());
    }
}
