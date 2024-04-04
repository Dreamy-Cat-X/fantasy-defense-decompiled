package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdnp {
    public static void zza(int i, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zzd.zzew(sb.toString());
        com.google.android.gms.ads.internal.util.zzd.zza(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzku().zzb(th, str);
    }

    public static void zze(Context context, boolean z) {
        if (z) {
            com.google.android.gms.ads.internal.util.zzd.zzew("This request is sent from a test device.");
            return;
        }
        zzwo.zzqm();
        String zzbm = zzayd.zzbm(context);
        StringBuilder sb = new StringBuilder(String.valueOf(zzbm).length() + 101);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(zzbm);
        sb.append("\") to get test ads on this device.");
        com.google.android.gms.ads.internal.util.zzd.zzew(sb.toString());
    }
}
