package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzwo;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zza {
    public static boolean zza(Context context, zzb zzbVar, zzu zzuVar) {
        int i = 0;
        if (zzbVar == null) {
            com.google.android.gms.ads.internal.util.zzd.zzex("No intent data for launcher overlay.");
            return false;
        }
        zzabh.initialize(context);
        if (zzbVar.intent != null) {
            return zza(context, zzbVar.intent, zzuVar);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(zzbVar.url)) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzbVar.mimeType)) {
            intent.setDataAndType(Uri.parse(zzbVar.url), zzbVar.mimeType);
        } else {
            intent.setData(Uri.parse(zzbVar.url));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzbVar.packageName)) {
            intent.setPackage(zzbVar.packageName);
        }
        if (!TextUtils.isEmpty(zzbVar.zzdpr)) {
            String[] split = zzbVar.zzdpr.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(zzbVar.zzdpr);
                com.google.android.gms.ads.internal.util.zzd.zzex(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        String str = zzbVar.zzdps;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Could not parse intent flags.");
            }
            intent.addFlags(i);
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzctv)).booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzctu)).booleanValue()) {
                com.google.android.gms.ads.internal.zzp.zzkq();
                com.google.android.gms.ads.internal.util.zzm.zzb(context, intent);
            }
        }
        return zza(context, intent, zzuVar);
    }

    private static boolean zza(Context context, Intent intent, zzu zzuVar) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            com.google.android.gms.ads.internal.util.zzd.zzeb(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            com.google.android.gms.ads.internal.zzp.zzkq();
            com.google.android.gms.ads.internal.util.zzm.zza(context, intent);
            if (zzuVar == null) {
                return true;
            }
            zzuVar.zzwe();
            return true;
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.zzd.zzex(e.getMessage());
            return false;
        }
    }
}
