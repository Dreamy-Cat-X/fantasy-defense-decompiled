package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzaqf;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzbdh;
import com.google.android.gms.internal.ads.zzbdp;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzcqi;
import com.google.android.gms.internal.ads.zztu;
import com.google.android.gms.internal.ads.zzwo;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zze extends zzaqv implements zzy {
    private static final int zzdpv = Color.argb(0, 0, 0, 0);
    protected final Activity zzaap;
    zzbdh zzdhu;
    AdOverlayInfoParcel zzdpw;
    private zzk zzdpx;
    private zzr zzdpy;
    private FrameLayout zzdqa;
    private WebChromeClient.CustomViewCallback zzdqb;
    private zzh zzdqd;
    private Runnable zzdqh;
    private boolean zzdqi;
    private boolean zzdqj;
    private boolean zzdpz = false;
    private boolean zzdqc = false;
    private boolean zzbou = false;
    private boolean zzdqe = false;
    zzl zzdqf = zzl.BACK_BUTTON;
    private final Object zzdqg = new Object();
    private boolean zzdqk = false;
    private boolean zzdql = false;
    private boolean zzdqm = true;

    public zze(Activity activity) {
        this.zzaap = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onRestart() {
    }

    public final void close() {
        this.zzdqf = zzl.CUSTOM_CLOSE;
        this.zzaap.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdpw;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzdrf != 5) {
            return;
        }
        this.zzaap.overridePendingTransition(0, 0);
    }

    public final void zzvs() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdpw;
        if (adOverlayInfoParcel != null && this.zzdpz) {
            setRequestedOrientation(adOverlayInfoParcel.orientation);
        }
        if (this.zzdqa != null) {
            this.zzaap.setContentView(this.zzdqd);
            this.zzdqj = true;
            this.zzdqa.removeAllViews();
            this.zzdqa = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzdqb;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzdqb = null;
        }
        this.zzdpz = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzy
    public final void zzvt() {
        this.zzdqf = zzl.CLOSE_BUTTON;
        this.zzaap.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onBackPressed() {
        this.zzdqf = zzl.BACK_BUTTON;
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onUserLeaveHint() {
        if (this.zzdpw.zzdra != null) {
            this.zzdpw.zzdra.onUserLeaveHint();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final boolean zzvu() {
        this.zzdqf = zzl.BACK_BUTTON;
        zzbdh zzbdhVar = this.zzdhu;
        if (zzbdhVar == null) {
            return true;
        }
        boolean zzadp = zzbdhVar.zzadp();
        if (!zzadp) {
            this.zzdhu.zza("onbackblocked", Collections.emptyMap());
        }
        return zzadp;
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public void onCreate(Bundle bundle) {
        this.zzaap.requestWindowFeature(1);
        this.zzdqc = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel zzd = AdOverlayInfoParcel.zzd(this.zzaap.getIntent());
            this.zzdpw = zzd;
            if (zzd == null) {
                throw new zzi("Could not get info for ad overlay.");
            }
            if (zzd.zzbpd.zzegf > 7500000) {
                this.zzdqf = zzl.OTHER;
            }
            if (this.zzaap.getIntent() != null) {
                this.zzdqm = this.zzaap.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.zzdpw.zzdrh != null) {
                this.zzbou = this.zzdpw.zzdrh.zzbou;
            } else if (this.zzdpw.zzdrf == 5) {
                this.zzbou = true;
            } else {
                this.zzbou = false;
            }
            if (this.zzbou && this.zzdpw.zzdrf != 5 && this.zzdpw.zzdrh.zzboz != -1) {
                new zzj(this).zzyc();
            }
            if (bundle == null) {
                if (this.zzdpw.zzdra != null && this.zzdqm) {
                    this.zzdpw.zzdra.zzvn();
                }
                if (this.zzdpw.zzdrf != 1 && this.zzdpw.zzcgr != null) {
                    this.zzdpw.zzcgr.onAdClicked();
                }
            }
            zzh zzhVar = new zzh(this.zzaap, this.zzdpw.zzdrg, this.zzdpw.zzbpd.zzbrf);
            this.zzdqd = zzhVar;
            zzhVar.setId(1000);
            com.google.android.gms.ads.internal.zzp.zzks().zzi(this.zzaap);
            int i = this.zzdpw.zzdrf;
            if (i == 1) {
                zzak(false);
                return;
            }
            if (i == 2) {
                this.zzdpx = new zzk(this.zzdpw.zzdhu);
                zzak(false);
            } else if (i == 3) {
                zzak(true);
            } else {
                if (i == 5) {
                    zzak(false);
                    return;
                }
                throw new zzi("Could not determine ad overlay type.");
            }
        } catch (zzi e) {
            com.google.android.gms.ads.internal.util.zzd.zzex(e.getMessage());
            this.zzdqf = zzl.OTHER;
            this.zzaap.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onStart() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcug)).booleanValue()) {
            zzbdh zzbdhVar = this.zzdhu;
            if (zzbdhVar != null && !zzbdhVar.isDestroyed()) {
                this.zzdhu.onResume();
            } else {
                com.google.android.gms.ads.internal.util.zzd.zzex("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onResume() {
        if (this.zzdpw.zzdra != null) {
            this.zzdpw.zzdra.onResume();
        }
        zza(this.zzaap.getResources().getConfiguration());
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcug)).booleanValue()) {
            return;
        }
        zzbdh zzbdhVar = this.zzdhu;
        if (zzbdhVar != null && !zzbdhVar.isDestroyed()) {
            this.zzdhu.onResume();
        } else {
            com.google.android.gms.ads.internal.util.zzd.zzex("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onPause() {
        zzvs();
        if (this.zzdpw.zzdra != null) {
            this.zzdpw.zzdra.onPause();
        }
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcug)).booleanValue() && this.zzdhu != null && (!this.zzaap.isFinishing() || this.zzdpx == null)) {
            this.zzdhu.onPause();
        }
        zzvw();
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void zzad(IObjectWrapper iObjectWrapper) {
        zza((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdqc);
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onStop() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcug)).booleanValue() && this.zzdhu != null && (!this.zzaap.isFinishing() || this.zzdpx == null)) {
            this.zzdhu.onPause();
        }
        zzvw();
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void onDestroy() {
        zzbdh zzbdhVar = this.zzdhu;
        if (zzbdhVar != null) {
            try {
                this.zzdqd.removeView(zzbdhVar.getView());
            } catch (NullPointerException unused) {
            }
        }
        zzvw();
    }

    private final void zzaj(boolean z) {
        int intValue = ((Integer) zzwo.zzqq().zzd(zzabh.zzcui)).intValue();
        zzq zzqVar = new zzq();
        zzqVar.size = 50;
        zzqVar.paddingLeft = z ? intValue : 0;
        zzqVar.paddingRight = z ? 0 : intValue;
        zzqVar.paddingTop = 0;
        zzqVar.paddingBottom = intValue;
        this.zzdpy = new zzr(this.zzaap, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzdpw.zzdrc);
        this.zzdqd.addView(this.zzdpy, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void zzdr() {
        this.zzdqj = true;
    }

    public final void zza(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcoz)).booleanValue() && (adOverlayInfoParcel2 = this.zzdpw) != null && adOverlayInfoParcel2.zzdrh != null && this.zzdpw.zzdrh.zzbpb;
        boolean z5 = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcpa)).booleanValue() && (adOverlayInfoParcel = this.zzdpw) != null && adOverlayInfoParcel.zzdrh != null && this.zzdpw.zzdrh.zzbpc;
        if (z && z2 && z4 && !z5) {
            new zzaqf(this.zzdhu, "useCustomClose").zzds("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.zzdpy;
        if (zzrVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzrVar.zzal(z3);
        }
    }

    public final void zzvv() {
        this.zzdqd.removeView(this.zzdpy);
        zzaj(true);
    }

    public final void setRequestedOrientation(int i) {
        if (this.zzaap.getApplicationInfo().targetSdkVersion >= ((Integer) zzwo.zzqq().zzd(zzabh.zzcwp)).intValue()) {
            if (this.zzaap.getApplicationInfo().targetSdkVersion <= ((Integer) zzwo.zzqq().zzd(zzabh.zzcwq)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzwo.zzqq().zzd(zzabh.zzcwr)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzwo.zzqq().zzd(zzabh.zzcws)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzaap.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzp.zzku().zzb(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzaap);
        this.zzdqa = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzdqa.addView(view, -1, -1);
        this.zzaap.setContentView(this.zzdqa);
        this.zzdqj = true;
        this.zzdqb = customViewCallback;
        this.zzdpz = true;
    }

    private final void zzak(boolean z) throws zzi {
        if (!this.zzdqj) {
            this.zzaap.requestWindowFeature(1);
        }
        Window window = this.zzaap.getWindow();
        if (window == null) {
            throw new zzi("Invalid activity, no window available.");
        }
        zzbet zzadi = this.zzdpw.zzdhu != null ? this.zzdpw.zzdhu.zzadi() : null;
        boolean z2 = zzadi != null && zzadi.zzacp();
        this.zzdqe = false;
        if (z2) {
            if (this.zzdpw.orientation == 6) {
                this.zzdqe = this.zzaap.getResources().getConfiguration().orientation == 1;
            } else if (this.zzdpw.orientation == 7) {
                this.zzdqe = this.zzaap.getResources().getConfiguration().orientation == 2;
            }
        }
        boolean z3 = this.zzdqe;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(z3);
        com.google.android.gms.ads.internal.util.zzd.zzdy(sb.toString());
        setRequestedOrientation(this.zzdpw.orientation);
        window.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.zzd.zzdy("Hardware acceleration on the AdActivity window enabled.");
        if (!this.zzbou) {
            this.zzdqd.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        } else {
            this.zzdqd.setBackgroundColor(zzdpv);
        }
        this.zzaap.setContentView(this.zzdqd);
        this.zzdqj = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzp.zzkr();
                zzbdh zza = zzbdp.zza(this.zzaap, this.zzdpw.zzdhu != null ? this.zzdpw.zzdhu.zzadg() : null, this.zzdpw.zzdhu != null ? this.zzdpw.zzdhu.zzadh() : null, true, z2, null, null, this.zzdpw.zzbpd, null, null, this.zzdpw.zzdhu != null ? this.zzdpw.zzdhu.zzabb() : null, zztu.zzne(), null, null);
                this.zzdhu = zza;
                zza.zzadi().zza(null, this.zzdpw.zzdfv, null, this.zzdpw.zzdfx, this.zzdpw.zzdre, true, null, this.zzdpw.zzdhu != null ? this.zzdpw.zzdhu.zzadi().zzaco() : null, null, null, null, null, null, null);
                this.zzdhu.zzadi().zza(new zzbes(this) { // from class: com.google.android.gms.ads.internal.overlay.zzd
                    private final zze zzdpu;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdpu = this;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbes
                    public final void zzai(boolean z4) {
                        zze zzeVar = this.zzdpu;
                        if (zzeVar.zzdhu != null) {
                            zzeVar.zzdhu.zzvz();
                        }
                    }
                });
                if (this.zzdpw.url != null) {
                    this.zzdhu.loadUrl(this.zzdpw.url);
                } else if (this.zzdpw.zzdrd != null) {
                    this.zzdhu.loadDataWithBaseURL(this.zzdpw.zzdrb, this.zzdpw.zzdrd, "text/html", "UTF-8", null);
                } else {
                    throw new zzi("No URL or HTML to display in ad overlay.");
                }
                if (this.zzdpw.zzdhu != null) {
                    this.zzdpw.zzdhu.zzb(this);
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Error obtaining webview.", e);
                throw new zzi("Could not obtain webview for the overlay.");
            }
        } else {
            zzbdh zzbdhVar = this.zzdpw.zzdhu;
            this.zzdhu = zzbdhVar;
            zzbdhVar.zzbw(this.zzaap);
        }
        this.zzdhu.zza(this);
        if (this.zzdpw.zzdhu != null) {
            zzc(this.zzdpw.zzdhu.zzadm(), this.zzdqd);
        }
        if (this.zzdpw.zzdrf != 5) {
            ViewParent parent = this.zzdhu.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzdhu.getView());
            }
            if (this.zzbou) {
                this.zzdhu.zzadu();
            }
            this.zzdqd.addView(this.zzdhu.getView(), -1, -1);
        }
        if (!z && !this.zzdqe) {
            zzvz();
        }
        if (this.zzdpw.zzdrf != 5) {
            zzaj(z2);
            if (this.zzdhu.zzadk()) {
                zza(z2, true);
                return;
            }
            return;
        }
        zzcqi.zza(this.zzaap, this, this.zzdpw.zzdrj, this.zzdpw.zzdri, this.zzdpw.zzdgu, this.zzdpw.zzdgv, this.zzdpw.zzbvf, this.zzdpw.zzdrk);
    }

    private final void zzvw() {
        if (!this.zzaap.isFinishing() || this.zzdqk) {
            return;
        }
        this.zzdqk = true;
        if (this.zzdhu != null) {
            this.zzdhu.zzdv(this.zzdqf.zzwd());
            synchronized (this.zzdqg) {
                if (!this.zzdqi && this.zzdhu.zzadq()) {
                    this.zzdqh = new Runnable(this) { // from class: com.google.android.gms.ads.internal.overlay.zzg
                        private final zze zzdpu;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdpu = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzdpu.zzvx();
                        }
                    };
                    com.google.android.gms.ads.internal.util.zzm.zzecu.postDelayed(this.zzdqh, ((Long) zzwo.zzqq().zzd(zzabh.zzcoy)).longValue());
                    return;
                }
            }
        }
        zzvx();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzvx() {
        if (this.zzdql) {
            return;
        }
        this.zzdql = true;
        zzbdh zzbdhVar = this.zzdhu;
        if (zzbdhVar != null) {
            this.zzdqd.removeView(zzbdhVar.getView());
            zzk zzkVar = this.zzdpx;
            if (zzkVar != null) {
                this.zzdhu.zzbw(zzkVar.context);
                this.zzdhu.zzba(false);
                this.zzdpx.parent.addView(this.zzdhu.getView(), this.zzdpx.index, this.zzdpx.zzdqq);
                this.zzdpx = null;
            } else if (this.zzaap.getApplicationContext() != null) {
                this.zzdhu.zzbw(this.zzaap.getApplicationContext());
            }
            this.zzdhu = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdpw;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.zzdra != null) {
            this.zzdpw.zzdra.zza(this.zzdqf);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdpw;
        if (adOverlayInfoParcel2 == null || adOverlayInfoParcel2.zzdhu == null) {
            return;
        }
        zzc(this.zzdpw.zzdhu.zzadm(), this.zzdpw.zzdhu.getView());
    }

    private static void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzlf().zza(iObjectWrapper, view);
    }

    public final void zzvy() {
        if (this.zzdqe) {
            this.zzdqe = false;
            zzvz();
        }
    }

    private final void zzvz() {
        this.zzdhu.zzvz();
    }

    public final void zzwa() {
        this.zzdqd.zzdqo = true;
    }

    public final void zzwb() {
        synchronized (this.zzdqg) {
            this.zzdqi = true;
            if (this.zzdqh != null) {
                com.google.android.gms.ads.internal.util.zzm.zzecu.removeCallbacks(this.zzdqh);
                com.google.android.gms.ads.internal.util.zzm.zzecu.post(this.zzdqh);
            }
        }
    }

    private final void zza(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdpw;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || adOverlayInfoParcel2.zzdrh == null || !this.zzdpw.zzdrh.zzbov) ? false : true;
        boolean zza = com.google.android.gms.ads.internal.zzp.zzks().zza(this.zzaap, configuration);
        if ((this.zzbou && !z3) || zza) {
            z = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (adOverlayInfoParcel = this.zzdpw) != null && adOverlayInfoParcel.zzdrh != null && this.zzdpw.zzdrh.zzbpa) {
            z2 = true;
        }
        Window window = this.zzaap.getWindow();
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcpb)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            View decorView = window.getDecorView();
            int i = 256;
            if (z) {
                i = 5380;
                if (z2) {
                    i = 5894;
                }
            }
            decorView.setSystemUiVisibility(i);
            return;
        }
        if (z) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (Build.VERSION.SDK_INT < 19 || !z2) {
                return;
            }
            window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            return;
        }
        window.addFlags(2048);
        window.clearFlags(1024);
    }
}
