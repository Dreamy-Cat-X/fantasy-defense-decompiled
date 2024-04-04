package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public interface zzbdh extends com.google.android.gms.ads.internal.zzk, zzajx, zzakl, zzbaq, zzbcw, zzbec, zzbej, zzben, zzbeo, zzbeq, zzber, zzqv, zzuz {
    void destroy();

    @Override // com.google.android.gms.internal.ads.zzbaq, com.google.android.gms.internal.ads.zzbej
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    @Override // com.google.android.gms.internal.ads.zzbeq
    View getView();

    WebView getWebView();

    int getWidth();

    boolean isDestroyed();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzbaq
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void zza(com.google.android.gms.ads.internal.overlay.zze zzeVar);

    void zza(zzadw zzadwVar);

    void zza(zzadx zzadxVar);

    @Override // com.google.android.gms.internal.ads.zzbaq
    void zza(zzbeb zzbebVar);

    void zza(zzbew zzbewVar);

    void zza(zzdmi zzdmiVar, zzdmj zzdmjVar);

    void zza(zzsd zzsdVar);

    void zza(String str, Predicate<zzahv<? super zzbdh>> predicate);

    void zza(String str, zzahv<? super zzbdh> zzahvVar);

    @Override // com.google.android.gms.internal.ads.zzbaq
    void zza(String str, zzbcj zzbcjVar);

    @Override // com.google.android.gms.internal.ads.zzbaq
    zzbeb zzaay();

    @Override // com.google.android.gms.internal.ads.zzbaq, com.google.android.gms.internal.ads.zzbej
    Activity zzaba();

    @Override // com.google.android.gms.internal.ads.zzbaq
    com.google.android.gms.ads.internal.zzb zzabb();

    @Override // com.google.android.gms.internal.ads.zzbaq
    zzabv zzabe();

    @Override // com.google.android.gms.internal.ads.zzbaq, com.google.android.gms.internal.ads.zzber
    zzayt zzabf();

    @Override // com.google.android.gms.internal.ads.zzbcw
    zzdmi zzacn();

    void zzadb();

    void zzadc();

    Context zzadd();

    com.google.android.gms.ads.internal.overlay.zze zzade();

    com.google.android.gms.ads.internal.overlay.zze zzadf();

    @Override // com.google.android.gms.internal.ads.zzbep
    zzbew zzadg();

    String zzadh();

    zzbet zzadi();

    WebViewClient zzadj();

    boolean zzadk();

    @Override // com.google.android.gms.internal.ads.zzbeo
    zzef zzadl();

    IObjectWrapper zzadm();

    boolean zzadn();

    void zzado();

    boolean zzadp();

    boolean zzadq();

    void zzadr();

    void zzads();

    zzadx zzadt();

    void zzadu();

    void zzadv();

    zzsd zzadw();

    boolean zzadx();

    @Override // com.google.android.gms.internal.ads.zzbec
    zzdmj zzady();

    void zzal(boolean z);

    void zzaq(IObjectWrapper iObjectWrapper);

    void zzax(boolean z);

    void zzb(com.google.android.gms.ads.internal.overlay.zze zzeVar);

    void zzb(String str, zzahv<? super zzbdh> zzahvVar);

    void zzb(String str, String str2, String str3);

    void zzba(boolean z);

    void zzbb(boolean z);

    void zzbc(boolean z);

    void zzbw(Context context);

    boolean zzc(boolean z, int i);

    void zzdv(int i);

    void zzvz();
}
