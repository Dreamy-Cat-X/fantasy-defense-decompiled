package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zza {
    public static AdSize zza(int i, int i2, String str) {
        return new AdSize(i, i2, str);
    }

    public static AdSize zza(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.zzc(true);
        adSize.zzr(i2);
        return adSize;
    }

    public static boolean zza(AdSize adSize) {
        return adSize.zzdt();
    }

    public static boolean zzb(AdSize adSize) {
        return adSize.zzdu();
    }

    public static int zzc(AdSize adSize) {
        return adSize.zzdv();
    }
}
