package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbeo;
import com.google.android.gms.internal.ads.zzbeq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbef<WebViewT extends zzbej & zzbeo & zzbeq> {
    private final zzbeg zzeso;
    private final WebViewT zzesp;

    public zzbef(WebViewT webviewt, zzbeg zzbegVar) {
        this.zzeso = zzbegVar;
        this.zzesp = webviewt;
    }

    @JavascriptInterface
    public final void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zzd.zzex("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzbeh
                private final String zzdhw;
                private final zzbef zzesq;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzesq = this;
                    this.zzdhw = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzesq.zzfn(this.zzdhw);
                }
            });
        }
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zzd.zzeb("Click string is empty, not proceeding.");
            return "";
        }
        zzef zzadl = this.zzesp.zzadl();
        if (zzadl == null) {
            com.google.android.gms.ads.internal.util.zzd.zzeb("Signal utils is empty, ignoring.");
            return "";
        }
        zzdv zzca = zzadl.zzca();
        if (zzca == null) {
            com.google.android.gms.ads.internal.util.zzd.zzeb("Signals object is empty, ignoring.");
            return "";
        }
        if (this.zzesp.getContext() == null) {
            com.google.android.gms.ads.internal.util.zzd.zzeb("Context is null, ignoring.");
            return "";
        }
        return zzca.zza(this.zzesp.getContext(), str, this.zzesp.getView(), this.zzesp.zzaba());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzfn(String str) {
        this.zzeso.zzj(Uri.parse(str));
    }
}
