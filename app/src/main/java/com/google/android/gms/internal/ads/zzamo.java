package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzamo {
    private static zzamo zzdkg;
    private AtomicBoolean zzdkh = new AtomicBoolean(false);

    public static zzamo zzus() {
        if (zzdkg == null) {
            zzdkg = new zzamo();
        }
        return zzdkg;
    }

    zzamo() {
    }

    public final Thread zzc(final Context context, final String str) {
        if (!this.zzdkh.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable(this, context, str) { // from class: com.google.android.gms.internal.ads.zzamn
            private final Context zzckg;
            private final zzamo zzdke;
            private final String zzdkf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdke = this;
                this.zzckg = context;
                this.zzdkf = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = this.zzckg;
                String str2 = this.zzdkf;
                zzabh.initialize(context2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) zzwo.zzqq().zzd(zzabh.zzcns)).booleanValue());
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcnz)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzbfb) zzayp.zza(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzamq.zzbxt)).zza(ObjectWrapper.wrap(context2), new zzaml(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str2, bundle)));
                } catch (RemoteException | zzayr | NullPointerException e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}
