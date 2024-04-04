package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzahd implements zzahv<zzbdh> {
    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(zzbdh zzbdhVar, Map map) {
        zzbdh zzbdhVar2 = zzbdhVar;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.zzd.zzex("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                com.google.android.gms.ads.internal.util.zzd.zzex("No timestamp given for CSI tick.");
                return;
            }
            try {
                long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() + (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis());
                if (TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                zzbdhVar2.zzabe().zzb(str2, str3, elapsedRealtime);
                return;
            } catch (NumberFormatException e) {
                com.google.android.gms.ads.internal.util.zzd.zzd("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                com.google.android.gms.ads.internal.util.zzd.zzex("No value given for CSI experiment.");
                return;
            }
            zzaby zzsk = zzbdhVar2.zzabe().zzsk();
            if (zzsk == null) {
                com.google.android.gms.ads.internal.util.zzd.zzex("No ticker for WebView, dropping experiment ID.");
                return;
            } else {
                zzsk.zzg("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                com.google.android.gms.ads.internal.util.zzd.zzex("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(str6)) {
                com.google.android.gms.ads.internal.util.zzd.zzex("No name given for CSI extra.");
                return;
            }
            zzaby zzsk2 = zzbdhVar2.zzabe().zzsk();
            if (zzsk2 == null) {
                com.google.android.gms.ads.internal.util.zzd.zzex("No ticker for WebView, dropping extra parameter.");
            } else {
                zzsk2.zzg(str6, str7);
            }
        }
    }
}
