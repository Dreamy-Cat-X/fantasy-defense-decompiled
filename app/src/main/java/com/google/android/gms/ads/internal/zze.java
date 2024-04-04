package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzalq;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzaxt;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzayy;
import com.google.android.gms.internal.ads.zzdyz;
import com.google.android.gms.internal.ads.zzdzl;
import com.google.android.gms.internal.ads.zzwo;
import com.kt.olleh.inapp.net.ResTags;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zze {
    private Context context;
    private long zzboo = 0;

    public final void zza(Context context, zzayt zzaytVar, String str, Runnable runnable) {
        zza(context, zzaytVar, true, null, str, null, runnable);
    }

    public final void zza(Context context, zzayt zzaytVar, String str, zzaxt zzaxtVar) {
        zza(context, zzaytVar, false, zzaxtVar, zzaxtVar != null ? zzaxtVar.zzxx() : null, str, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0051, code lost:
    
        if (r11.zzxv() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zza(Context context, zzayt zzaytVar, boolean z, zzaxt zzaxtVar, String str, String str2, Runnable runnable) {
        if (zzp.zzkx().elapsedRealtime() - this.zzboo < 5000) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Not retrying to fetch app settings");
            return;
        }
        this.zzboo = zzp.zzkx().elapsedRealtime();
        boolean z2 = false;
        if (zzaxtVar != null) {
            if (!(zzp.zzkx().currentTimeMillis() - zzaxtVar.zzxu() > ((Long) zzwo.zzqq().zzd(zzabh.zzctb)).longValue())) {
            }
        }
        z2 = true;
        if (z2) {
            if (context == null) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Context not provided to fetch application settings");
                return;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.zzd.zzex("App settings could not be fetched. Required parameters missing");
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.context = applicationContext;
            zzalq zza = zzp.zzld().zzb(this.context, zzaytVar).zza("google.afma.config.fetchAppSettings", zzalt.zzdjj, zzalt.zzdjj);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(ResTags.APP_ID, str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                zzdzl zzh = zza.zzh(jSONObject);
                zzdzl zzb = zzdyz.zzb(zzh, zzd.zzbon, zzayv.zzegn);
                if (runnable != null) {
                    zzh.addListener(runnable, zzayv.zzegn);
                }
                zzayy.zza(zzb, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Error requesting application settings", e);
            }
        }
    }
}
