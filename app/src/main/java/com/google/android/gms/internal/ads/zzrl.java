package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzrl extends Thread {
    private final Object lock;
    private boolean started;
    private final int zzbrv;
    private final int zzbrx;
    private final boolean zzbry;
    private boolean zzbsv;
    private boolean zzbsw;
    private final zzri zzbsx;
    private final int zzbsy;
    private final int zzbsz;
    private final int zzbta;
    private final int zzbtb;
    private final int zzbtc;
    private final int zzbtd;
    private final String zzbte;
    private final boolean zzbtf;
    private final boolean zzbtg;

    public zzrl() {
        this(new zzri());
    }

    private zzrl(zzri zzriVar) {
        this.started = false;
        this.zzbsv = false;
        this.zzbsw = false;
        this.zzbsx = zzriVar;
        this.lock = new Object();
        this.zzbrv = zzacy.zzdcd.get().intValue();
        this.zzbsz = zzacy.zzdca.get().intValue();
        this.zzbrx = zzacy.zzdce.get().intValue();
        this.zzbta = zzacy.zzdcc.get().intValue();
        this.zzbtb = ((Integer) zzwo.zzqq().zzd(zzabh.zzcnd)).intValue();
        this.zzbtc = ((Integer) zzwo.zzqq().zzd(zzabh.zzcne)).intValue();
        this.zzbtd = ((Integer) zzwo.zzqq().zzd(zzabh.zzcnf)).intValue();
        this.zzbsy = zzacy.zzdcf.get().intValue();
        this.zzbte = (String) zzwo.zzqq().zzd(zzabh.zzcnh);
        this.zzbtf = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcni)).booleanValue();
        this.zzbry = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcnj)).booleanValue();
        this.zzbtg = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcnk)).booleanValue();
        setName("ContentFetchTask");
    }

    public final void zzmh() {
        synchronized (this.lock) {
            if (this.started) {
                com.google.android.gms.ads.internal.util.zzd.zzdy("Content hash thread already started, quiting...");
            } else {
                this.started = true;
                start();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    if (zzmi()) {
                        Activity activity = com.google.android.gms.ads.internal.zzp.zzkt().getActivity();
                        if (activity == null) {
                            com.google.android.gms.ads.internal.util.zzd.zzdy("ContentFetchThread: no activity. Sleeping.");
                            zzmk();
                        } else if (activity != null) {
                            View view = null;
                            try {
                                if (activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
                                    view = activity.getWindow().getDecorView().findViewById(R.id.content);
                                }
                            } catch (Exception e) {
                                com.google.android.gms.ads.internal.zzp.zzku().zza(e, "ContentFetchTask.extractContent");
                                com.google.android.gms.ads.internal.util.zzd.zzdy("Failed getting root view of activity. Content not extracted.");
                            }
                            if (view != null && view != null) {
                                view.post(new zzro(this, view));
                            }
                        }
                    } else {
                        com.google.android.gms.ads.internal.util.zzd.zzdy("ContentFetchTask: sleeping");
                        zzmk();
                    }
                    Thread.sleep(this.zzbsy * 1000);
                } catch (InterruptedException e2) {
                    com.google.android.gms.ads.internal.util.zzd.zzc("Error in ContentFetchTask", e2);
                }
            } catch (Exception e3) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Error in ContentFetchTask", e3);
                com.google.android.gms.ads.internal.zzp.zzku().zza(e3, "ContentFetchTask.run");
            }
            synchronized (this.lock) {
                while (this.zzbsv) {
                    try {
                        com.google.android.gms.ads.internal.util.zzd.zzdy("ContentFetchTask: waiting");
                        this.lock.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(View view) {
        try {
            zzrf zzrfVar = new zzrf(this.zzbrv, this.zzbsz, this.zzbrx, this.zzbta, this.zzbtb, this.zzbtc, this.zzbtd, this.zzbry);
            Context context = com.google.android.gms.ads.internal.zzp.zzkt().getContext();
            if (context != null && !TextUtils.isEmpty(this.zzbte)) {
                String str = (String) view.getTag(context.getResources().getIdentifier((String) zzwo.zzqq().zzd(zzabh.zzcng), "id", context.getPackageName()));
                if (str != null && str.equals(this.zzbte)) {
                    return;
                }
            }
            zzrp zza = zza(view, zzrfVar);
            zzrfVar.zzmf();
            if (zza.zzbtn == 0 && zza.zzbto == 0) {
                return;
            }
            if (zza.zzbto == 0 && zzrfVar.zzmg() == 0) {
                return;
            }
            if (zza.zzbto == 0 && this.zzbsx.zza(zzrfVar)) {
                return;
            }
            this.zzbsx.zzc(zzrfVar);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzp.zzku().zza(e, "ContentFetchTask.fetchContent");
        }
    }

    private static boolean zzmi() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Context context = com.google.android.gms.ads.internal.zzp.zzkt().getContext();
            if (context == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    return powerManager == null ? false : powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzp.zzku().zza(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final zzrp zza(View view, zzrf zzrfVar) {
        boolean z;
        if (view == null) {
            return new zzrp(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (!TextUtils.isEmpty(text)) {
                zzrfVar.zzb(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                return new zzrp(this, 1, 0);
            }
            return new zzrp(this, 0, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzbdh)) {
            WebView webView = (WebView) view;
            if (PlatformVersion.isAtLeastKitKat()) {
                zzrfVar.zzmd();
                webView.post(new zzrn(this, zzrfVar, webView, globalVisibleRect));
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new zzrp(this, 0, 1);
            }
            return new zzrp(this, 0, 0);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                zzrp zza = zza(viewGroup.getChildAt(i3), zzrfVar);
                i += zza.zzbtn;
                i2 += zza.zzbto;
            }
            return new zzrp(this, i, i2);
        }
        return new zzrp(this, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzrf zzrfVar, WebView webView, String str, boolean z) {
        zzrfVar.zzmc();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!this.zzbtf && !TextUtils.isEmpty(webView.getTitle())) {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzrfVar.zza(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzrfVar.zza(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzrfVar.zzlx()) {
                this.zzbsx.zzb(zzrfVar);
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zzd.zzdy("Json string may be malformed.");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zzd.zzb("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzp.zzku().zza(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final zzrf zzmj() {
        return this.zzbsx.zzo(this.zzbtg);
    }

    public final void wakeup() {
        synchronized (this.lock) {
            this.zzbsv = false;
            this.lock.notifyAll();
            com.google.android.gms.ads.internal.util.zzd.zzdy("ContentFetchThread: wakeup");
        }
    }

    private final void zzmk() {
        synchronized (this.lock) {
            this.zzbsv = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            com.google.android.gms.ads.internal.util.zzd.zzdy(sb.toString());
        }
    }

    public final boolean zzml() {
        return this.zzbsv;
    }
}
