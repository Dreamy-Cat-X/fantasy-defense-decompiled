package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzawy {
    public static String zzc(String str, Context context, boolean z) {
        String zzae;
        if ((((Boolean) zzwo.zzqq().zzd(zzabh.zzcnw)).booleanValue() && !z) || !com.google.android.gms.ads.internal.zzp.zzlo().zzz(context) || TextUtils.isEmpty(str) || (zzae = com.google.android.gms.ads.internal.zzp.zzlo().zzae(context)) == null) {
            return str;
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcno)).booleanValue()) {
            String str2 = (String) zzwo.zzqq().zzd(zzabh.zzcnp);
            if (!str.contains(str2)) {
                return str;
            }
            if (com.google.android.gms.ads.internal.zzp.zzkq().zzei(str)) {
                com.google.android.gms.ads.internal.zzp.zzlo().zzg(context, zzae);
                return zzb(str, context).replace(str2, zzae);
            }
            if (!com.google.android.gms.ads.internal.zzp.zzkq().zzej(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzp.zzlo().zzh(context, zzae);
            return zzb(str, context).replace(str2, zzae);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzp.zzkq().zzei(str)) {
            com.google.android.gms.ads.internal.zzp.zzlo().zzg(context, zzae);
            return zza(zzb(str, context), "fbs_aeid", zzae).toString();
        }
        if (!com.google.android.gms.ads.internal.zzp.zzkq().zzej(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzp.zzlo().zzh(context, zzae);
        return zza(zzb(str, context), "fbs_aeid", zzae).toString();
    }

    private static String zzb(String str, Context context) {
        String zzac = com.google.android.gms.ads.internal.zzp.zzlo().zzac(context);
        String zzad = com.google.android.gms.ads.internal.zzp.zzlo().zzad(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zzac)) {
            str = zza(str, "gmp_app_id", zzac).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(zzad)) ? str : zza(str, "fbs_aiid", zzad).toString();
    }

    public static String zzb(Uri uri, Context context) {
        if (!com.google.android.gms.ads.internal.zzp.zzlo().zzz(context)) {
            return uri.toString();
        }
        String zzae = com.google.android.gms.ads.internal.zzp.zzlo().zzae(context);
        if (zzae == null) {
            return uri.toString();
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcno)).booleanValue()) {
            String str = (String) zzwo.zzqq().zzd(zzabh.zzcnp);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                com.google.android.gms.ads.internal.zzp.zzlo().zzg(context, zzae);
                return zzb(uri2, context).replace(str, zzae);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            String uri3 = zza(zzb(uri.toString(), context), "fbs_aeid", zzae).toString();
            com.google.android.gms.ads.internal.zzp.zzlo().zzg(context, zzae);
            return uri3;
        }
        return uri.toString();
    }

    private static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }
}
