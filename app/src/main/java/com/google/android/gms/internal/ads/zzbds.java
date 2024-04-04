package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbds extends FrameLayout implements zzbdh {
    private final zzbdh zzeqn;
    private final zzbaj zzeqo;
    private final AtomicBoolean zzeqp;

    public zzbds(zzbdh zzbdhVar) {
        super(zzbdhVar.getContext());
        this.zzeqp = new AtomicBoolean();
        this.zzeqn = zzbdhVar;
        this.zzeqo = new zzbaj(zzbdhVar.zzadd(), this, this);
        addView(this.zzeqn.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbeq
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final zzbaj zzaax() {
        return this.zzeqo;
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void onPause() {
        this.zzeqo.onPause();
        this.zzeqn.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzado() {
        this.zzeqo.onDestroy();
        this.zzeqn.zzado();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzadu() {
        setBackgroundColor(0);
        this.zzeqn.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzabi() {
        this.zzeqn.zzabi();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final WebView getWebView() {
        return this.zzeqn.getWebView();
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zza(String str, Map<String, ?> map) {
        this.zzeqn.zza(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zza(String str, JSONObject jSONObject) {
        this.zzeqn.zza(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zza(String str, zzahv<? super zzbdh> zzahvVar) {
        this.zzeqn.zza(str, zzahvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzb(String str, zzahv<? super zzbdh> zzahvVar) {
        this.zzeqn.zzb(str, zzahvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zza(String str, Predicate<zzahv<? super zzbdh>> predicate) {
        this.zzeqn.zza(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzadb() {
        this.zzeqn.zzadb();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzdv(int i) {
        this.zzeqn.zzdv(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzvz() {
        this.zzeqn.zzvz();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzadc() {
        this.zzeqn.zzadc();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zza(boolean z, long j) {
        this.zzeqn.zza(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void zzcv(String str) {
        this.zzeqn.zzcv(str);
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void zzb(String str, JSONObject jSONObject) {
        this.zzeqn.zzb(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbaq, com.google.android.gms.internal.ads.zzbej
    public final Activity zzaba() {
        return this.zzeqn.zzaba();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final Context zzadd() {
        return this.zzeqn.zzadd();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbaq
    public final com.google.android.gms.ads.internal.zzb zzabb() {
        return this.zzeqn.zzabb();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final com.google.android.gms.ads.internal.overlay.zze zzade() {
        return this.zzeqn.zzade();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final IObjectWrapper zzadm() {
        return this.zzeqn.zzadm();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final com.google.android.gms.ads.internal.overlay.zze zzadf() {
        return this.zzeqn.zzadf();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbep
    public final zzbew zzadg() {
        return this.zzeqn.zzadg();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final String zzadh() {
        return this.zzeqn.zzadh();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final zzbet zzadi() {
        return this.zzeqn.zzadi();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final WebViewClient zzadj() {
        return this.zzeqn.zzadj();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final boolean zzadk() {
        return this.zzeqn.zzadk();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbeo
    public final zzef zzadl() {
        return this.zzeqn.zzadl();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbaq, com.google.android.gms.internal.ads.zzber
    public final zzayt zzabf() {
        return this.zzeqn.zzabf();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final boolean zzadn() {
        return this.zzeqn.zzadn();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final boolean isDestroyed() {
        return this.zzeqn.isDestroyed();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final boolean zzadp() {
        return this.zzeqn.zzadp();
    }

    @Override // com.google.android.gms.ads.internal.zzk
    public final void zzkn() {
        this.zzeqn.zzkn();
    }

    @Override // com.google.android.gms.ads.internal.zzk
    public final void zzkm() {
        this.zzeqn.zzkm();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final String getRequestId() {
        return this.zzeqn.getRequestId();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final String zzabc() {
        return this.zzeqn.zzabc();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzdq(int i) {
        this.zzeqn.zzdq(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabd() {
        return this.zzeqn.zzabd();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final zzabw zzaaz() {
        return this.zzeqn.zzaaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbaq
    public final zzabv zzabe() {
        return this.zzeqn.zzabe();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbaq
    public final zzbeb zzaay() {
        return this.zzeqn.zzaay();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zza(com.google.android.gms.ads.internal.overlay.zze zzeVar) {
        this.zzeqn.zza(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzaq(IObjectWrapper iObjectWrapper) {
        this.zzeqn.zzaq(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zza(zzbew zzbewVar) {
        this.zzeqn.zza(zzbewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzba(boolean z) {
        this.zzeqn.zzba(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzadr() {
        this.zzeqn.zzadr();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzbw(Context context) {
        this.zzeqn.zzbw(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzal(boolean z) {
        this.zzeqn.zzal(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void setRequestedOrientation(int i) {
        this.zzeqn.setRequestedOrientation(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzb(com.google.android.gms.ads.internal.overlay.zze zzeVar) {
        this.zzeqn.zzb(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzbb(boolean z) {
        this.zzeqn.zzbb(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbaq
    public final void zza(String str, zzbcj zzbcjVar) {
        this.zzeqn.zza(str, zzbcjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final zzbcj zzfc(String str) {
        return this.zzeqn.zzfc(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzads() {
        this.zzeqn.zzads();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void destroy() {
        final IObjectWrapper zzadm = zzadm();
        if (zzadm != null) {
            com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(zzadm) { // from class: com.google.android.gms.internal.ads.zzbdv
                private final IObjectWrapper zzeqr;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzeqr = zzadm;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzp.zzlf().zzac(this.zzeqr);
                }
            });
            com.google.android.gms.ads.internal.util.zzm.zzecu.postDelayed(new zzbdu(this), ((Integer) zzwo.zzqq().zzd(zzabh.zzcuq)).intValue());
            return;
        }
        this.zzeqn.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void loadData(String str, String str2, String str3) {
        this.zzeqn.loadData(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zzeqn.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void loadUrl(String str) {
        this.zzeqn.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzb(String str, String str2, String str3) {
        this.zzeqn.zzb(str, str2, str3);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbdh
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzeqn.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbdh
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zzeqn.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zzeqn.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zzeqn.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void onResume() {
        this.zzeqn.onResume();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzadv() {
        TextView textView = new TextView(getContext());
        Resources resources = com.google.android.gms.ads.internal.zzp.zzku().getResources();
        textView.setText(resources != null ? resources.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzax(boolean z) {
        this.zzeqn.zzax(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zza(zzadw zzadwVar) {
        this.zzeqn.zza(zzadwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zza(zzsd zzsdVar) {
        this.zzeqn.zza(zzsdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final zzsd zzadw() {
        return this.zzeqn.zzadw();
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zza(zzqw zzqwVar) {
        this.zzeqn.zza(zzqwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zza(zzadx zzadxVar) {
        this.zzeqn.zza(zzadxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final zzadx zzadt() {
        return this.zzeqn.zzadt();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbaq
    public final void zza(zzbeb zzbebVar) {
        this.zzeqn.zza(zzbebVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final boolean zzadq() {
        return this.zzeqn.zzadq();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zzbc(boolean z) {
        this.zzeqn.zzbc(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzav(boolean z) {
        this.zzeqn.zzav(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzwa() {
        this.zzeqn.zzwa();
    }

    @Override // com.google.android.gms.internal.ads.zzben
    public final void zza(com.google.android.gms.ads.internal.overlay.zzb zzbVar) {
        this.zzeqn.zza(zzbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzben
    public final void zzb(boolean z, int i) {
        this.zzeqn.zzb(z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzben
    public final void zza(boolean z, int i, String str) {
        this.zzeqn.zza(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzben
    public final void zza(boolean z, int i, String str, String str2) {
        this.zzeqn.zza(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzben
    public final void zza(com.google.android.gms.ads.internal.util.zzbf zzbfVar, zzcpy zzcpyVar, zzcju zzcjuVar, zzdro zzdroVar, String str, String str2, int i) {
        this.zzeqn.zza(zzbfVar, zzcpyVar, zzcjuVar, zzdroVar, str, str2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final boolean zzc(boolean z, int i) {
        if (!this.zzeqp.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcoj)).booleanValue()) {
            return false;
        }
        if (this.zzeqn.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zzeqn.getParent()).removeView(this.zzeqn.getView());
        }
        return this.zzeqn.zzc(z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final boolean zzadx() {
        return this.zzeqp.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbcw
    public final zzdmi zzacn() {
        return this.zzeqn.zzacn();
    }

    @Override // com.google.android.gms.internal.ads.zzbdh, com.google.android.gms.internal.ads.zzbec
    public final zzdmj zzady() {
        return this.zzeqn.zzady();
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void onAdClicked() {
        zzbdh zzbdhVar = this.zzeqn;
        if (zzbdhVar != null) {
            zzbdhVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdh
    public final void zza(zzdmi zzdmiVar, zzdmj zzdmjVar) {
        this.zzeqn.zza(zzdmiVar, zzdmjVar);
    }
}
