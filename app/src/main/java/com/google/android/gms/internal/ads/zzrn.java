package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzrn implements Runnable {
    private ValueCallback<String> zzbth = new zzrq(this);
    final /* synthetic */ zzrf zzbti;
    final /* synthetic */ WebView zzbtj;
    final /* synthetic */ boolean zzbtk;
    final /* synthetic */ zzrl zzbtl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrn(zzrl zzrlVar, zzrf zzrfVar, WebView webView, boolean z) {
        this.zzbtl = zzrlVar;
        this.zzbti = zzrfVar;
        this.zzbtj = webView;
        this.zzbtk = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzbtj.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzbtj.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zzbth);
            } catch (Throwable unused) {
                this.zzbth.onReceiveValue("");
            }
        }
    }
}
