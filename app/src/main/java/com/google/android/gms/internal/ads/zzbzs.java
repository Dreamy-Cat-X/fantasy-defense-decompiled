package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbzs implements zzepq<zzbzt> {
    private final zzeqd<zzcbt> zzfte;
    private final zzeqd<Map<String, zzcqq<zzbnf>>> zzfuq;
    private final zzeqd<Map<String, zzcqq<zzcaz>>> zzfzz;
    private final zzeqd<Map<String, zzctf<zzcaz>>> zzgaa;
    private final zzeqd<zzbna<zzblb>> zzgab;

    public zzbzs(zzeqd<Map<String, zzcqq<zzbnf>>> zzeqdVar, zzeqd<Map<String, zzcqq<zzcaz>>> zzeqdVar2, zzeqd<Map<String, zzctf<zzcaz>>> zzeqdVar3, zzeqd<zzbna<zzblb>> zzeqdVar4, zzeqd<zzcbt> zzeqdVar5) {
        this.zzfuq = zzeqdVar;
        this.zzfzz = zzeqdVar2;
        this.zzgaa = zzeqdVar3;
        this.zzgab = zzeqdVar4;
        this.zzfte = zzeqdVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbzt(this.zzfuq.get(), this.zzfzz.get(), this.zzgaa.get(), this.zzgab, this.zzfte.get());
    }
}
