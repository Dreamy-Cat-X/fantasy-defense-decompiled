package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbkb {
    private final zzcju zzdgu;
    private final zzdro zzdgv;
    private final zzdmt zzexh;

    public zzbkb(zzcju zzcjuVar, zzdmt zzdmtVar, zzdro zzdroVar) {
        this.zzdgv = zzdroVar;
        this.zzdgu = zzcjuVar;
        this.zzexh = zzdmtVar;
    }

    public final void zzb(long j, int i) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczk)).booleanValue()) {
            this.zzdgv.zzb(zzdrp.zzgz("ad_closed").zzb(this.zzexh.zzhiz.zzera).zzu("show_time", String.valueOf(j)).zzu("ad_format", "app_open_ad").zzu("acr", zzdx(i)));
        } else {
            this.zzdgu.zzaqt().zza(this.zzexh.zzhiz.zzera).zzr("action", "ad_closed").zzr("show_time", String.valueOf(j)).zzr("ad_format", "app_open_ad").zzr("acr", zzdx(i)).zzaqv();
        }
    }

    private static String zzdx(int i) {
        int i2 = zzbka.zzfsg[i - 1];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "u" : "cb" : "ac" : "cc" : "h" : "bb";
    }
}
