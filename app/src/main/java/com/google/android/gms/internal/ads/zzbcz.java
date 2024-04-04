package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbcz extends WebChromeClient {
    private final zzbdh zzdhu;

    public zzbcz(zzbdh zzbdhVar) {
        this.zzdhu = zzbdhVar;
    }

    private final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        com.google.android.gms.ads.internal.zza zzaco;
        try {
        } catch (WindowManager.BadTokenException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Fail to display Dialog.", e);
        }
        if (this.zzdhu != null && this.zzdhu.zzadi() != null && this.zzdhu.zzadi().zzaco() != null && (zzaco = this.zzdhu.zzadi().zzaco()) != null && !zzaco.zzjy()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            zzaco.zzbk(sb.toString());
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builder.setView(linearLayout).setPositiveButton(R.string.ok, new zzbdf(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzbdc(jsPromptResult)).setOnCancelListener(new zzbdd(jsPromptResult)).create().show();
        } else {
            builder.setMessage(str3).setPositiveButton(R.string.ok, new zzbda(jsResult)).setNegativeButton(R.string.cancel, new zzbdb(jsResult)).setOnCancelListener(new zzbcy(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zzdhu.zzadj() != null) {
            webView2.setWebViewClient(this.zzdhu.zzadj());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzbdh)) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zze zzade = ((zzbdh) webView).zzade();
        if (zzade == null) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzade.close();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzbde.zzeox[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            com.google.android.gms.ads.internal.util.zzd.zzev(sb2);
        } else if (i == 2) {
            com.google.android.gms.ads.internal.util.zzd.zzex(sb2);
        } else if (i == 3 || i == 4) {
            com.google.android.gms.ads.internal.util.zzd.zzew(sb2);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.util.zzd.zzdy(sb2);
        } else {
            com.google.android.gms.ads.internal.util.zzd.zzew(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072L, j4), 1048576L);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zze zzade = this.zzdhu.zzade();
        if (zzade == null) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Could not get ad overlay when hiding custom view.");
        } else {
            zzade.zzvs();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Context zza(WebView webView) {
        if (!(webView instanceof zzbdh)) {
            return webView.getContext();
        }
        zzbdh zzbdhVar = (zzbdh) webView;
        Activity zzaba = zzbdhVar.zzaba();
        return zzaba != null ? zzaba : zzbdhVar.getContext();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zza(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zze zzade = this.zzdhu.zzade();
        if (zzade == null) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzade.zza(view, customViewCallback);
            zzade.setRequestedOrientation(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            com.google.android.gms.ads.internal.zzp.zzkq();
            if (!com.google.android.gms.ads.internal.util.zzm.zzp(this.zzdhu.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                com.google.android.gms.ads.internal.zzp.zzkq();
                if (!com.google.android.gms.ads.internal.util.zzm.zzp(this.zzdhu.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }
}
