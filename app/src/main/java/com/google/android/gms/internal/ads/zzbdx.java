package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.internal.ads.zzuc;
import com.kt.olleh.inapp.net.InAppError;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzbdx extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzbdh {
    private int maxHeight;
    private int maxWidth;
    private String zzacv;
    private final zzayt zzbpd;
    private final WindowManager zzbqu;
    private int zzbvg;
    private int zzdoz;
    private int zzdpa;
    private boolean zzdrc;
    private String zzdss;
    private Boolean zzeak;
    private zzabw zzekv;
    private final zztu zzepa;
    private final zzbex zzeqt;
    private final zzef zzequ;
    private final zzacm zzeqv;
    private final com.google.android.gms.ads.internal.zzk zzeqw;
    private final com.google.android.gms.ads.internal.zzb zzeqx;
    private final float zzeqy;
    private zzdmi zzeqz;
    private zzdmj zzera;
    private boolean zzerb;
    private boolean zzerc;
    private zzbdg zzerd;
    private com.google.android.gms.ads.internal.overlay.zze zzere;
    private IObjectWrapper zzerf;
    private zzbew zzerg;
    private boolean zzerh;
    private boolean zzeri;
    private boolean zzerj;
    private int zzerk;
    private boolean zzerl;
    private boolean zzerm;
    private zzbeb zzern;
    private boolean zzero;
    private boolean zzerp;
    private zzadx zzerq;
    private zzadw zzerr;
    private zzsd zzers;
    private int zzert;
    private int zzeru;
    private zzabw zzerv;
    private zzabw zzerw;
    private zzabv zzerx;
    private WeakReference<View.OnClickListener> zzery;
    private com.google.android.gms.ads.internal.overlay.zze zzerz;
    private boolean zzesa;
    private com.google.android.gms.ads.internal.util.zzbz zzesb;
    private Map<String, zzbcj> zzesc;
    private final DisplayMetrics zzxh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbdx zzc(Context context, zzbew zzbewVar, String str, boolean z, boolean z2, zzef zzefVar, zzacm zzacmVar, zzayt zzaytVar, zzaby zzabyVar, com.google.android.gms.ads.internal.zzk zzkVar, com.google.android.gms.ads.internal.zzb zzbVar, zztu zztuVar, zzdmi zzdmiVar, zzdmj zzdmjVar) {
        return new zzbdx(new zzbex(context), zzbewVar, str, z, z2, zzefVar, zzacmVar, zzaytVar, zzabyVar, zzkVar, zzbVar, zztuVar, zzdmiVar, zzdmjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbeq
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final WebView getWebView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final zzbaj zzaax() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final boolean zzadx() {
        return false;
    }

    private zzbdx(zzbex zzbexVar, zzbew zzbewVar, String str, boolean z, boolean z2, zzef zzefVar, zzacm zzacmVar, zzayt zzaytVar, zzaby zzabyVar, com.google.android.gms.ads.internal.zzk zzkVar, com.google.android.gms.ads.internal.zzb zzbVar, zztu zztuVar, zzdmi zzdmiVar, zzdmj zzdmjVar) {
        super(zzbexVar);
        zzdmj zzdmjVar2;
        this.zzerb = false;
        this.zzerc = false;
        this.zzerl = true;
        this.zzerm = false;
        this.zzdss = "";
        this.zzdpa = -1;
        this.zzdoz = -1;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.zzeqt = zzbexVar;
        this.zzerg = zzbewVar;
        this.zzacv = str;
        this.zzeri = z;
        this.zzerk = -1;
        this.zzequ = zzefVar;
        this.zzeqv = zzacmVar;
        this.zzbpd = zzaytVar;
        this.zzeqw = zzkVar;
        this.zzeqx = zzbVar;
        this.zzbqu = (WindowManager) getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzp.zzkq();
        DisplayMetrics zza = com.google.android.gms.ads.internal.util.zzm.zza(this.zzbqu);
        this.zzxh = zza;
        this.zzeqy = zza.density;
        this.zzepa = zztuVar;
        this.zzeqz = zzdmiVar;
        this.zzera = zzdmjVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzp.zzkq().zzq(zzbexVar, zzaytVar.zzbrf));
        com.google.android.gms.ads.internal.zzp.zzks().zza(getContext(), settings);
        setDownloadListener(this);
        zzaec();
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            addJavascriptInterface(new zzbef(this, new zzbeg(this) { // from class: com.google.android.gms.internal.ads.zzbee
                private final zzbdh zzesn;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzesn = this;
                }

                @Override // com.google.android.gms.internal.ads.zzbeg
                public final void zzj(Uri uri) {
                    zzbet zzadi = this.zzesn.zzadi();
                    if (zzadi == null) {
                        com.google.android.gms.ads.internal.util.zzd.zzev("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    } else {
                        zzadi.zzj(uri);
                    }
                }
            }), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.zzesb = new com.google.android.gms.ads.internal.util.zzbz(this.zzeqt.zzaba(), this, this, null);
        zzaeg();
        zzabv zzabvVar = new zzabv(new zzaby(true, "make_wv", this.zzacv));
        this.zzerx = zzabvVar;
        zzabvVar.zzsk().zzc(zzabyVar);
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqu)).booleanValue() && (zzdmjVar2 = this.zzera) != null && zzdmjVar2.zzbvf != null) {
            this.zzerx.zzsk().zzg("gqi", this.zzera.zzbvf);
        }
        zzabw zzb = zzabp.zzb(this.zzerx.zzsk());
        this.zzekv = zzb;
        this.zzerx.zza("native:view_create", zzb);
        this.zzerw = null;
        this.zzerv = null;
        com.google.android.gms.ads.internal.zzp.zzks().zzbf(zzbexVar);
        com.google.android.gms.ads.internal.zzp.zzku().zzxn();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbdh
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzbdg) {
            this.zzerd = (zzbdg) webViewClient;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbaq
    public final com.google.android.gms.ads.internal.zzb zzabb() {
        return this.zzeqx;
    }

    private final boolean zzadz() {
        int i;
        int i2;
        if (!this.zzerd.zzacp() && !this.zzerd.zzacq()) {
            return false;
        }
        zzwo.zzqm();
        DisplayMetrics displayMetrics = this.zzxh;
        int zzb = zzayd.zzb(displayMetrics, displayMetrics.widthPixels);
        zzwo.zzqm();
        DisplayMetrics displayMetrics2 = this.zzxh;
        int zzb2 = zzayd.zzb(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzaba = this.zzeqt.zzaba();
        if (zzaba == null || zzaba.getWindow() == null) {
            i = zzb;
            i2 = zzb2;
        } else {
            com.google.android.gms.ads.internal.zzp.zzkq();
            int[] zzf = com.google.android.gms.ads.internal.util.zzm.zzf(zzaba);
            zzwo.zzqm();
            int zzb3 = zzayd.zzb(this.zzxh, zzf[0]);
            zzwo.zzqm();
            i2 = zzayd.zzb(this.zzxh, zzf[1]);
            i = zzb3;
        }
        if (this.zzdoz == zzb && this.zzdpa == zzb2 && this.maxWidth == i && this.maxHeight == i2) {
            return false;
        }
        boolean z = (this.zzdoz == zzb && this.zzdpa == zzb2) ? false : true;
        this.zzdoz = zzb;
        this.zzdpa = zzb2;
        this.maxWidth = i;
        this.maxHeight = i2;
        new zzaqf(this).zza(zzb, zzb2, i, i2, this.zzxh.density, this.zzbqu.getDefaultDisplay().getRotation());
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zza(String str, Map<String, ?> map) {
        try {
            zza(str, com.google.android.gms.ads.internal.zzp.zzkq().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Could not convert parameters to JSON.");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (isDestroyed()) {
            com.google.android.gms.ads.internal.util.zzd.zzez("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    private final synchronized void zzfk(String str) {
        if (!isDestroyed()) {
            loadUrl(str);
        } else {
            com.google.android.gms.ads.internal.util.zzd.zzex("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbdh
    public final synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            try {
                super.loadUrl(str);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                com.google.android.gms.ads.internal.zzp.zzku().zza(e, "AdWebViewImpl.loadUrl");
                com.google.android.gms.ads.internal.util.zzd.zzd("Could not call loadUrl. ", e);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.zzd.zzex("#004 The webview is destroyed. Ignoring action.");
    }

    private final synchronized void zzfl(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            com.google.android.gms.ads.internal.zzp.zzku().zza(e, "AdWebViewImpl.loadUrlUnsafe");
            com.google.android.gms.ads.internal.util.zzd.zzd("Could not call loadUrl. ", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbdh
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            com.google.android.gms.ads.internal.util.zzd.zzex("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbdh
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            com.google.android.gms.ads.internal.util.zzd.zzex("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized void zzb(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, zzbem.zzf(str2, zzbem.zzaei()), "text/html", "UTF-8", str3);
        } else {
            com.google.android.gms.ads.internal.util.zzd.zzex("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final synchronized void zza(String str, ValueCallback<String> valueCallback) {
        if (!isDestroyed()) {
            evaluateJavascript(str, null);
        } else {
            com.google.android.gms.ads.internal.util.zzd.zzex("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final void zzfm(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzxl() == null) {
                zzaea();
            }
            if (zzxl().booleanValue()) {
                zza(str, (ValueCallback<String>) null);
                return;
            } else {
                String valueOf = String.valueOf(str);
                zzfk(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
                return;
            }
        }
        String valueOf2 = String.valueOf(str);
        zzfk(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void zzcv(String str) {
        zzfm(str);
    }

    private final synchronized void zzaea() {
        Boolean zzxl = com.google.android.gms.ads.internal.zzp.zzku().zzxl();
        this.zzeak = zzxl;
        if (zzxl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zza((Boolean) true);
            } catch (IllegalStateException unused) {
                zza((Boolean) false);
            }
        }
    }

    private final void zza(Boolean bool) {
        synchronized (this) {
            this.zzeak = bool;
        }
        com.google.android.gms.ads.internal.zzp.zzku().zza(bool);
    }

    private final synchronized Boolean zzxl() {
        return this.zzeak;
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void zzb(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        zzfm(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zza(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        com.google.android.gms.ads.internal.util.zzd.zzdy(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        zzfm(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzadb() {
        zzaeb();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzbpd.zzbrf);
        zza("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzdv(int i) {
        if (i == 0) {
            zzabp.zza(this.zzerx.zzsk(), this.zzekv, "aebb2");
        }
        zzaeb();
        if (this.zzerx.zzsk() != null) {
            this.zzerx.zzsk().zzg("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzbpd.zzbrf);
        zza("onhide", hashMap);
    }

    private final void zzaeb() {
        zzabp.zza(this.zzerx.zzsk(), this.zzekv, "aeh2");
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzvz() {
        if (this.zzerv == null) {
            zzabp.zza(this.zzerx.zzsk(), this.zzekv, "aes2");
            zzabw zzb = zzabp.zzb(this.zzerx.zzsk());
            this.zzerv = zzb;
            this.zzerx.zza("native:view_show", zzb);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzbpd.zzbrf);
        zza("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzadc() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzp.zzkv().zzra()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzp.zzkv().zzqz()));
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzad.zzbh(getContext())));
        zza("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zza(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z ? InAppError.FAILED : InAppError.SUCCESS);
        hashMap.put("duration", Long.toString(j));
        zza("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized com.google.android.gms.ads.internal.overlay.zze zzade() {
        return this.zzere;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized IObjectWrapper zzadm() {
        return this.zzerf;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized com.google.android.gms.ads.internal.overlay.zze zzadf() {
        return this.zzerz;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbep
    public final synchronized zzbew zzadg() {
        return this.zzerg;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized String zzadh() {
        return this.zzacv;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final WebViewClient zzadj() {
        return this.zzerd;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized boolean zzadk() {
        return this.zzdrc;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbeo
    public final zzef zzadl() {
        return this.zzequ;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbaq, com.google.android.gms.internal.ads.zzber
    public final zzayt zzabf() {
        return this.zzbpd;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized boolean zzadn() {
        return this.zzeri;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzp.zzkq();
            com.google.android.gms.ads.internal.util.zzm.zza(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            com.google.android.gms.ads.internal.util.zzd.zzdy(sb.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.zzerd.zzacq() && !this.zzerd.zzacr()) {
            synchronized (this) {
                if (this.zzerq != null) {
                    this.zzerq.zzc(motionEvent);
                }
            }
        } else {
            zzef zzefVar = this.zzequ;
            if (zzefVar != null) {
                zzefVar.zza(motionEvent);
            }
            zzacm zzacmVar = this.zzeqv;
            if (zzacmVar != null) {
                zzacmVar.zza(motionEvent);
            }
        }
        if (isDestroyed()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d6 A[Catch: all -> 0x01fe, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:40:0x0084, B:45:0x0080, B:47:0x0091, B:49:0x0099, B:51:0x00ab, B:54:0x00b2, B:56:0x00ce, B:57:0x00d9, B:60:0x00d5, B:61:0x00de, B:64:0x00e3, B:66:0x00eb, B:69:0x00f8, B:76:0x011e, B:78:0x0125, B:82:0x012f, B:84:0x0141, B:86:0x0151, B:94:0x016b, B:96:0x01c0, B:97:0x01c4, B:99:0x01cb, B:104:0x01d6, B:106:0x01dc, B:107:0x01df, B:109:0x01e3, B:110:0x01ec, B:114:0x01f9), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0141 A[Catch: all -> 0x01fe, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:40:0x0084, B:45:0x0080, B:47:0x0091, B:49:0x0099, B:51:0x00ab, B:54:0x00b2, B:56:0x00ce, B:57:0x00d9, B:60:0x00d5, B:61:0x00de, B:64:0x00e3, B:66:0x00eb, B:69:0x00f8, B:76:0x011e, B:78:0x0125, B:82:0x012f, B:84:0x0141, B:86:0x0151, B:94:0x016b, B:96:0x01c0, B:97:0x01c4, B:99:0x01cb, B:104:0x01d6, B:106:0x01dc, B:107:0x01df, B:109:0x01e3, B:110:0x01ec, B:114:0x01f9), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016b A[Catch: all -> 0x01fe, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:40:0x0084, B:45:0x0080, B:47:0x0091, B:49:0x0099, B:51:0x00ab, B:54:0x00b2, B:56:0x00ce, B:57:0x00d9, B:60:0x00d5, B:61:0x00de, B:64:0x00e3, B:66:0x00eb, B:69:0x00f8, B:76:0x011e, B:78:0x0125, B:82:0x012f, B:84:0x0141, B:86:0x0151, B:94:0x016b, B:96:0x01c0, B:97:0x01c4, B:99:0x01cb, B:104:0x01d6, B:106:0x01dc, B:107:0x01df, B:109:0x01e3, B:110:0x01ec, B:114:0x01f9), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final synchronized void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int size;
        if (isDestroyed()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzeri && !this.zzerg.zzaen()) {
            if (this.zzerg.zzaep()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.zzerg.zzaeo()) {
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcso)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzbeb zzaay = zzaay();
                float aspectRatio = zzaay != null ? zzaay.getAspectRatio() : 0.0f;
                if (aspectRatio == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                int i4 = (int) (size3 * aspectRatio);
                int i5 = (int) (size2 / aspectRatio);
                if (size3 == 0 && i5 != 0) {
                    i4 = (int) (i5 * aspectRatio);
                    size3 = i5;
                } else if (size2 == 0 && i4 != 0) {
                    i5 = (int) (i4 / aspectRatio);
                    size2 = i4;
                }
                setMeasuredDimension(Math.min(i4, size2), Math.min(i5, size3));
                return;
            }
            if (this.zzerg.isFluid()) {
                if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcsr)).booleanValue() && PlatformVersion.isAtLeastJellyBeanMR1()) {
                    zza("/contentHeight", new zzbdz(this));
                    zzfm("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    float f = this.zzxh.density;
                    int size4 = View.MeasureSpec.getSize(i);
                    if (this.zzeru == -1) {
                        size = View.MeasureSpec.getSize(i2);
                    } else {
                        size = (int) (this.zzeru * f);
                    }
                    setMeasuredDimension(size4, size);
                    return;
                }
                super.onMeasure(i, i2);
                return;
            }
            if (this.zzerg.zzaem()) {
                setMeasuredDimension(this.zzxh.widthPixels, this.zzxh.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size5 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size6 = View.MeasureSpec.getSize(i2);
            int i6 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                if (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) {
                    i6 = size6;
                }
                if (this.zzerg.widthPixels <= i3 && this.zzerg.heightPixels <= i6) {
                    z = false;
                    if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcvj)).booleanValue()) {
                        boolean z2 = ((float) this.zzerg.widthPixels) / this.zzeqy <= ((float) i3) / this.zzeqy && ((float) this.zzerg.heightPixels) / this.zzeqy <= ((float) i6) / this.zzeqy;
                        if (z) {
                            z = z2;
                        }
                    }
                    if (!z) {
                        int i7 = (int) (this.zzerg.widthPixels / this.zzeqy);
                        int i8 = (int) (this.zzerg.heightPixels / this.zzeqy);
                        int i9 = (int) (size5 / this.zzeqy);
                        int i10 = (int) (size6 / this.zzeqy);
                        StringBuilder sb = new StringBuilder(103);
                        sb.append("Not enough space to show ad. Needs ");
                        sb.append(i7);
                        sb.append("x");
                        sb.append(i8);
                        sb.append(" dp, but only has ");
                        sb.append(i9);
                        sb.append("x");
                        sb.append(i10);
                        sb.append(" dp.");
                        com.google.android.gms.ads.internal.util.zzd.zzex(sb.toString());
                        if (getVisibility() != 8) {
                            setVisibility(4);
                        }
                        setMeasuredDimension(0, 0);
                        if (!this.zzerb) {
                            this.zzepa.zza(zztw.zza.zzb.BANNER_SIZE_INVALID);
                            this.zzerb = true;
                            return;
                        }
                    } else {
                        if (getVisibility() != 8) {
                            setVisibility(0);
                        }
                        if (!this.zzerc) {
                            this.zzepa.zza(zztw.zza.zzb.BANNER_SIZE_VALID);
                            this.zzerc = true;
                        }
                        setMeasuredDimension(this.zzerg.widthPixels, this.zzerg.heightPixels);
                    }
                    return;
                }
                z = true;
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcvj)).booleanValue()) {
                }
                if (!z) {
                }
                return;
            }
            i3 = size5;
            if (mode2 != Integer.MIN_VALUE) {
            }
            i6 = size6;
            if (this.zzerg.widthPixels <= i3) {
                z = false;
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcvj)).booleanValue()) {
                }
                if (!z) {
                }
                return;
            }
            z = true;
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcvj)).booleanValue()) {
            }
            if (!z) {
            }
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzadz = zzadz();
        com.google.android.gms.ads.internal.overlay.zze zzade = zzade();
        if (zzade == null || !zzadz) {
            return;
        }
        zzade.zzvy();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized void zza(com.google.android.gms.ads.internal.overlay.zze zzeVar) {
        this.zzere = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized void zzaq(IObjectWrapper iObjectWrapper) {
        this.zzerf = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized void zzb(com.google.android.gms.ads.internal.overlay.zze zzeVar) {
        this.zzerz = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized void zza(zzbew zzbewVar) {
        this.zzerg = zzbewVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized void zzba(boolean z) {
        boolean z2 = z != this.zzeri;
        this.zzeri = z;
        zzaec();
        if (z2) {
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcnb)).booleanValue() || !this.zzerg.zzaem()) {
                new zzaqf(this).zzdu(z ? "expanded" : "default");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzadr() {
        this.zzesb.zzzq();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.zzesb.onAttachedToWindow();
        }
        boolean z = this.zzero;
        if (this.zzerd != null && this.zzerd.zzacq()) {
            if (!this.zzerp) {
                this.zzerd.zzacs();
                this.zzerd.zzact();
                this.zzerp = true;
            }
            zzadz();
            z = true;
        }
        zzbd(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.zzesb.onDetachedFromWindow();
            }
            super.onDetachedFromWindow();
            if (this.zzerp && this.zzerd != null && this.zzerd.zzacq() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzerd.zzacs();
                this.zzerd.zzact();
                this.zzerp = false;
            }
        }
        zzbd(false);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzbw(Context context) {
        this.zzeqt.setBaseContext(context);
        this.zzesb.zzj(this.zzeqt.zzaba());
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized void zzal(boolean z) {
        if (this.zzere != null) {
            this.zzere.zza(this.zzerd.zzacp(), z);
        } else {
            this.zzdrc = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized void setRequestedOrientation(int i) {
        this.zzerk = i;
        if (this.zzere != null) {
            this.zzere.setRequestedOrientation(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbaq, com.google.android.gms.internal.ads.zzbej
    public final Activity zzaba() {
        return this.zzeqt.zzaba();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final Context zzadd() {
        return this.zzeqt.zzadd();
    }

    private final synchronized void zzaec() {
        if (!this.zzeri && !this.zzerg.zzaem()) {
            if (Build.VERSION.SDK_INT < 18) {
                com.google.android.gms.ads.internal.util.zzd.zzdy("Disabling hardware acceleration on an AdView.");
                zzaed();
                return;
            } else {
                com.google.android.gms.ads.internal.util.zzd.zzdy("Enabling hardware acceleration on an AdView.");
                zzaee();
                return;
            }
        }
        com.google.android.gms.ads.internal.util.zzd.zzdy("Enabling hardware acceleration on an overlay.");
        zzaee();
    }

    private final synchronized void zzaed() {
        if (!this.zzerj) {
            setLayerType(1, null);
        }
        this.zzerj = true;
    }

    private final synchronized void zzaee() {
        if (this.zzerj) {
            setLayerType(0, null);
        }
        this.zzerj = false;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbdh
    public final synchronized void destroy() {
        zzaeg();
        this.zzesb.zzzr();
        if (this.zzere != null) {
            this.zzere.close();
            this.zzere.onDestroy();
            this.zzere = null;
        }
        this.zzerf = null;
        this.zzerd.reset();
        if (this.zzerh) {
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzlm();
        zzbcg.zzc(this);
        zzaef();
        this.zzerh = true;
        com.google.android.gms.ads.internal.util.zzd.zzeb("Initiating WebView self destruct sequence in 3...");
        com.google.android.gms.ads.internal.util.zzd.zzeb("Loading blank page in WebView, 2...");
        zzfl("about:blank");
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzerh) {
                    this.zzerd.reset();
                    com.google.android.gms.ads.internal.zzp.zzlm();
                    zzbcg.zzc(this);
                    zzaef();
                    zzxo();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized void zzado() {
        com.google.android.gms.ads.internal.util.zzd.zzeb("Destroying WebView!");
        zzxo();
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzbdy(this));
    }

    private final synchronized void zzxo() {
        if (!this.zzesa) {
            this.zzesa = true;
            com.google.android.gms.ads.internal.zzp.zzku().zzxo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized boolean isDestroyed() {
        return this.zzerh;
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (isDestroyed()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzads() {
        if (this.zzerw == null) {
            zzabw zzb = zzabp.zzb(this.zzerx.zzsk());
            this.zzerw = zzb;
            this.zzerx.zza("native:view_load", zzb);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbdh
    public final void onPause() {
        if (isDestroyed()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbdh
    public final void onResume() {
        if (isDestroyed()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Could not resume webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzadv() {
        com.google.android.gms.ads.internal.util.zzd.zzeb("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzax(boolean z) {
        this.zzerd.zzax(z);
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (isDestroyed()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized void zzbb(boolean z) {
        this.zzerl = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized boolean zzadp() {
        return this.zzerl;
    }

    @Override // com.google.android.gms.ads.internal.zzk
    public final synchronized void zzkm() {
        this.zzerm = true;
        if (this.zzeqw != null) {
            this.zzeqw.zzkm();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzk
    public final synchronized void zzkn() {
        this.zzerm = false;
        if (this.zzeqw != null) {
            this.zzeqw.zzkn();
        }
    }

    private final synchronized void zzaef() {
        if (this.zzesc != null) {
            Iterator<zzbcj> it = this.zzesc.values().iterator();
            while (it.hasNext()) {
                it.next().release();
            }
        }
        this.zzesc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbaq
    public final synchronized void zza(String str, zzbcj zzbcjVar) {
        if (this.zzesc == null) {
            this.zzesc = new HashMap();
        }
        this.zzesc.put(str, zzbcjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final synchronized zzbcj zzfc(String str) {
        if (this.zzesc == null) {
            return null;
        }
        return this.zzesc.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final synchronized String getRequestId() {
        return this.zzdss;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final synchronized String zzabc() {
        if (this.zzera == null) {
            return null;
        }
        return this.zzera.zzbvf;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final synchronized void zzdq(int i) {
        this.zzbvg = i;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final synchronized int zzabd() {
        return this.zzbvg;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final synchronized void zzabi() {
        if (this.zzerr != null) {
            this.zzerr.zzth();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized void zza(zzadw zzadwVar) {
        this.zzerr = zzadwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized void zza(zzsd zzsdVar) {
        this.zzers = zzsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized zzsd zzadw() {
        return this.zzers;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final zzabw zzaaz() {
        return this.zzekv;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbaq
    public final zzabv zzabe() {
        return this.zzerx;
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbdh
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzery = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized void zza(zzadx zzadxVar) {
        this.zzerq = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized zzadx zzadt() {
        return this.zzerq;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbaq
    public final synchronized zzbeb zzaay() {
        return this.zzern;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbaq
    public final synchronized void zza(zzbeb zzbebVar) {
        if (this.zzern != null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzern = zzbebVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized boolean zzadq() {
        return this.zzert > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final synchronized void zzbc(boolean z) {
        int i = this.zzert + (z ? 1 : -1);
        this.zzert = i;
        if (i <= 0 && this.zzere != null) {
            this.zzere.zzwb();
        }
    }

    private final void zzaeg() {
        zzaby zzsk;
        zzabv zzabvVar = this.zzerx;
        if (zzabvVar == null || (zzsk = zzabvVar.zzsk()) == null || com.google.android.gms.ads.internal.zzp.zzku().zzxk() == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzku().zzxk().zza(zzsk);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzadu() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzav(boolean z) {
        this.zzerd.zzav(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzwa() {
        com.google.android.gms.ads.internal.overlay.zze zzade = zzade();
        if (zzade != null) {
            zzade.zzwa();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzben
    public final void zza(com.google.android.gms.ads.internal.overlay.zzb zzbVar) {
        this.zzerd.zza(zzbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzben
    public final void zzb(boolean z, int i) {
        this.zzerd.zzb(z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzben
    public final void zza(boolean z, int i, String str) {
        this.zzerd.zza(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzben
    public final void zza(boolean z, int i, String str, String str2) {
        this.zzerd.zza(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzben
    public final void zza(com.google.android.gms.ads.internal.util.zzbf zzbfVar, zzcpy zzcpyVar, zzcju zzcjuVar, zzdro zzdroVar, String str, String str2, int i) {
        this.zzerd.zza(zzbfVar, zzcpyVar, zzcjuVar, zzdroVar, str, str2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zza(zzqw zzqwVar) {
        synchronized (this) {
            this.zzero = zzqwVar.zzbqz;
        }
        zzbd(zzqwVar.zzbqz);
    }

    private final void zzbd(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? InAppError.FAILED : InAppError.SUCCESS);
        zza("onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zza(String str, zzahv<? super zzbdh> zzahvVar) {
        zzbdg zzbdgVar = this.zzerd;
        if (zzbdgVar != null) {
            zzbdgVar.zza(str, zzahvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzb(String str, zzahv<? super zzbdh> zzahvVar) {
        zzbdg zzbdgVar = this.zzerd;
        if (zzbdgVar != null) {
            zzbdgVar.zzb(str, zzahvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zza(String str, Predicate<zzahv<? super zzbdh>> predicate) {
        zzbdg zzbdgVar = this.zzerd;
        if (zzbdgVar != null) {
            zzbdgVar.zza(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final boolean zzc(final boolean z, final int i) {
        destroy();
        this.zzepa.zza(new zztt(z, i) { // from class: com.google.android.gms.internal.ads.zzbdw
            private final int zzedk;
            private final boolean zzeqs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeqs = z;
                this.zzedk = i;
            }

            @Override // com.google.android.gms.internal.ads.zztt
            public final void zza(zzuc.zzi.zza zzaVar) {
                zzbdx.zza(this.zzeqs, this.zzedk, zzaVar);
            }
        });
        this.zzepa.zza(zztw.zza.zzb.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbcw
    public final zzdmi zzacn() {
        return this.zzeqz;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbec
    public final zzdmj zzady() {
        return this.zzera;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void onAdClicked() {
        zzbdg zzbdgVar = this.zzerd;
        if (zzbdgVar != null) {
            zzbdgVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zza(zzdmi zzdmiVar, zzdmj zzdmjVar) {
        this.zzeqz = zzdmiVar;
        this.zzera = zzdmjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final /* synthetic */ zzbet zzadi() {
        return this.zzerd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(boolean z, int i, zzuc.zzi.zza zzaVar) {
        zzuc.zzae.zza zzpy = zzuc.zzae.zzpy();
        if (zzpy.zzpx() != z) {
            zzpy.zzx(z);
        }
        zzaVar.zza((zzuc.zzae) ((zzekq) zzpy.zzcv(i).zzbiz()));
    }
}
