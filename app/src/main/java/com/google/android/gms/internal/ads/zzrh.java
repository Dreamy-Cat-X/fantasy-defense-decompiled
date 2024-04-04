package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzrh {
    private final Object zzbsk = new Object();
    private zzrk zzbsl = null;
    private boolean zzbsm = false;

    public final void initialize(Context context) {
        synchronized (this.zzbsk) {
            if (!this.zzbsm) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    com.google.android.gms.ads.internal.util.zzd.zzex("Can not cast Context to Application");
                    return;
                }
                if (this.zzbsl == null) {
                    this.zzbsl = new zzrk();
                }
                this.zzbsl.zza(application, context);
                this.zzbsm = true;
            }
        }
    }

    public final void zza(zzrm zzrmVar) {
        synchronized (this.zzbsk) {
            if (this.zzbsl == null) {
                this.zzbsl = new zzrk();
            }
            this.zzbsl.zza(zzrmVar);
        }
    }

    public final void zzb(zzrm zzrmVar) {
        synchronized (this.zzbsk) {
            if (this.zzbsl == null) {
                return;
            }
            this.zzbsl.zzb(zzrmVar);
        }
    }

    public final Activity getActivity() {
        synchronized (this.zzbsk) {
            if (this.zzbsl == null) {
                return null;
            }
            return this.zzbsl.getActivity();
        }
    }

    public final Context getContext() {
        synchronized (this.zzbsk) {
            if (this.zzbsl == null) {
                return null;
            }
            return this.zzbsl.getContext();
        }
    }
}
