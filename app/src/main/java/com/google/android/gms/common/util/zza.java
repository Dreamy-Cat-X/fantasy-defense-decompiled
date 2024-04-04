package com.google.android.gms.common.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zza {
    private static long zzb;
    private static final IntentFilter zza = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static float zzc = Float.NaN;

    public static int zza(Context context) {
        boolean isScreenOn;
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, zza);
        int i = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & (PlatformVersion.isAtLeastJellyBeanMR1() ? 7 : 3)) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (PlatformVersion.isAtLeastKitKatWatch()) {
            isScreenOn = powerManager.isInteractive();
        } else {
            isScreenOn = powerManager.isScreenOn();
        }
        return (isScreenOn ? 2 : 0) | i;
    }

    public static synchronized float zzb(Context context) {
        synchronized (zza.class) {
            if (SystemClock.elapsedRealtime() - zzb < 60000 && !Float.isNaN(zzc)) {
                return zzc;
            }
            if (context.getApplicationContext().registerReceiver(null, zza) != null) {
                zzc = r6.getIntExtra("level", -1) / r6.getIntExtra("scale", -1);
            }
            zzb = SystemClock.elapsedRealtime();
            return zzc;
        }
    }
}
