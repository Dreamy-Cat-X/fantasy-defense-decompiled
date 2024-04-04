package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzbel extends zzbdg {
    public zzbel(zzbdh zzbdhVar, zztu zztuVar, boolean z) {
        super(zzbdhVar, zztuVar, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse zza(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof zzbdh)) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzbdh zzbdhVar = (zzbdh) webView;
        if (this.zzepk != null) {
            this.zzepk.zza(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzbdhVar.zzadi() != null) {
            zzbdhVar.zzadi().zzvv();
        }
        if (zzbdhVar.zzadg().zzaem()) {
            str2 = (String) zzwo.zzqq().zzd(zzabh.zzcmz);
        } else if (zzbdhVar.zzadn()) {
            str2 = (String) zzwo.zzqq().zzd(zzabh.zzcmy);
        } else {
            str2 = (String) zzwo.zzqq().zzd(zzabh.zzcmx);
        }
        com.google.android.gms.ads.internal.zzp.zzkq();
        return com.google.android.gms.ads.internal.util.zzm.zzd(zzbdhVar.getContext(), zzbdhVar.zzabf().zzbrf, str2);
    }
}
