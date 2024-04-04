package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdke implements zzepq<zzdjv<zzcgn, zzcgg>> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdok> zzexa;
    private final zzeqd<zzdpf> zzexb;

    public zzdke(zzeqd<Context> zzeqdVar, zzeqd<zzdok> zzeqdVar2, zzeqd<zzdpf> zzeqdVar3) {
        this.zzeuo = zzeqdVar;
        this.zzexa = zzeqdVar2;
        this.zzexb = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        Object zzdjnVar;
        Context context = this.zzeuo.get();
        zzdok zzdokVar = this.zzexa.get();
        zzdpf zzdpfVar = this.zzexb.get();
        if (((Integer) zzwo.zzqq().zzd(zzabh.zzcxh)).intValue() > 0) {
            zzdpe zza = zzdpfVar.zza(zzdox.Rewarded, context, zzdokVar, new zzdjd(new zzdiy()));
            zzdjnVar = new zzdiz(new zzdjq(new zzdjn()), new zzdji(zza.zzhft, zzayv.zzegi), zza.zzhmw, zzayv.zzegi);
        } else {
            zzdjnVar = new zzdjn();
        }
        return (zzdjv) zzepw.zza(zzdjnVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
