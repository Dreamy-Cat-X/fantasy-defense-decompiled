package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzrk implements Application.ActivityLifecycleCallbacks {
    private Context context;
    private Activity zzaap;
    private Runnable zzbst;
    private long zzbsu;
    private final Object lock = new Object();
    private boolean foreground = true;
    private boolean zzbsq = false;
    private final List<zzrm> zzbsr = new ArrayList();
    private final List<zzrx> zzbss = new ArrayList();
    private boolean zzze = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (this.zzze) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            setActivity((Activity) context);
        }
        this.context = application;
        this.zzbsu = ((Long) zzwo.zzqq().zzd(zzabh.zzcot)).longValue();
        this.zzze = true;
    }

    public final void zza(zzrm zzrmVar) {
        synchronized (this.lock) {
            this.zzbsr.add(zzrmVar);
        }
    }

    public final void zzb(zzrm zzrmVar) {
        synchronized (this.lock) {
            this.zzbsr.remove(zzrmVar);
        }
    }

    public final Activity getActivity() {
        return this.zzaap;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        setActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        setActivity(activity);
        this.zzbsq = false;
        boolean z = !this.foreground;
        this.foreground = true;
        if (this.zzbst != null) {
            com.google.android.gms.ads.internal.util.zzm.zzecu.removeCallbacks(this.zzbst);
        }
        synchronized (this.lock) {
            Iterator<zzrx> it = this.zzbss.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onActivityResumed(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzp.zzku().zza(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzaym.zzc("", e);
                }
            }
            if (z) {
                Iterator<zzrm> it2 = this.zzbsr.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().zzp(true);
                    } catch (Exception e2) {
                        zzaym.zzc("", e2);
                    }
                }
            } else {
                com.google.android.gms.ads.internal.util.zzd.zzdy("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        setActivity(activity);
        synchronized (this.lock) {
            Iterator<zzrx> it = this.zzbss.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onActivityPaused(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzp.zzku().zza(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzaym.zzc("", e);
                }
            }
        }
        this.zzbsq = true;
        if (this.zzbst != null) {
            com.google.android.gms.ads.internal.util.zzm.zzecu.removeCallbacks(this.zzbst);
        }
        zzdva zzdvaVar = com.google.android.gms.ads.internal.util.zzm.zzecu;
        zzrj zzrjVar = new zzrj(this);
        this.zzbst = zzrjVar;
        zzdvaVar.postDelayed(zzrjVar, this.zzbsu);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.lock) {
            if (this.zzaap == null) {
                return;
            }
            if (this.zzaap.equals(activity)) {
                this.zzaap = null;
            }
            Iterator<zzrx> it = this.zzbss.iterator();
            while (it.hasNext()) {
                try {
                    if (it.next().zza(activity)) {
                        it.remove();
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzp.zzku().zza(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    zzaym.zzc("", e);
                }
            }
        }
    }

    private final void setActivity(Activity activity) {
        synchronized (this.lock) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.zzaap = activity;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zza(zzrk zzrkVar, boolean z) {
        zzrkVar.foreground = false;
        return false;
    }
}
