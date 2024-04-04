package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdjz {
    public static zzdjv<zzbkd, zzbki> zza(Context context, zzdok zzdokVar, zzdpf zzdpfVar) {
        return zzc(context, zzdokVar, zzdpfVar);
    }

    public static zzdjv<zzbkm, zzbks> zzb(Context context, zzdok zzdokVar, zzdpf zzdpfVar) {
        return zzc(context, zzdokVar, zzdpfVar);
    }

    private static <AppOpenAdRequestComponent extends zzbqb<AppOpenAd>, AppOpenAd extends zzbmz> zzdjv<AppOpenAdRequestComponent, AppOpenAd> zzc(Context context, zzdok zzdokVar, zzdpf zzdpfVar) {
        if (((Integer) zzwo.zzqq().zzd(zzabh.zzcxv)).intValue() > 0) {
            zzdpe zza = zzdpfVar.zza(zzdox.AppOpen, context, zzdokVar, new zzdjd(new zzdiy()));
            return new zzdiz(new zzdjq(new zzdjn()), new zzdji(zza.zzhft, zzayv.zzegi), zza.zzhmw, zzayv.zzegi);
        }
        return new zzdjn();
    }
}
