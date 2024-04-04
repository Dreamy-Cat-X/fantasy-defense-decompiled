package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbei extends zzbel {
    public zzbei(zzbdh zzbdhVar, zztu zztuVar, boolean z) {
        super(zzbdhVar, zztuVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbdg, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zza(webView, str, (Map<String, String>) null);
    }
}
