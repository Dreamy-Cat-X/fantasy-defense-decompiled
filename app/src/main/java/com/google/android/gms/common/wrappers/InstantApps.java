package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public class InstantApps {
    private static Context zza;
    private static Boolean zzb;

    public static synchronized boolean isInstantApp(Context context) {
        synchronized (InstantApps.class) {
            Context applicationContext = context.getApplicationContext();
            if (zza != null && zzb != null && zza == applicationContext) {
                return zzb.booleanValue();
            }
            zzb = null;
            if (PlatformVersion.isAtLeastO()) {
                zzb = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    zzb = true;
                } catch (ClassNotFoundException unused) {
                    zzb = false;
                }
            }
            zza = applicationContext;
            return zzb.booleanValue();
        }
    }
}
