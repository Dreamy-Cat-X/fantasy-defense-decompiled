package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzem implements Application.ActivityLifecycleCallbacks {
    private final Application zzyd;
    private final WeakReference<Application.ActivityLifecycleCallbacks> zzye;
    private boolean zzyf = false;

    public zzem(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzye = new WeakReference<>(activityLifecycleCallbacks);
        this.zzyd = application;
    }

    private final void zza(zzeu zzeuVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.zzye.get();
            if (activityLifecycleCallbacks != null) {
                zzeuVar.zza(activityLifecycleCallbacks);
            } else {
                if (this.zzyf) {
                    return;
                }
                this.zzyd.unregisterActivityLifecycleCallbacks(this);
                this.zzyf = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzel(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(new zzeo(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(new zzen(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(new zzeq(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zza(new zzep(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzes(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zza(new zzer(this, activity));
    }
}
