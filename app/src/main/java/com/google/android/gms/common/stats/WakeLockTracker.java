package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public class WakeLockTracker {
    private static Boolean zzb;
    private static WakeLockTracker zza = new WakeLockTracker();
    private static boolean zzc = false;

    public static WakeLockTracker getInstance() {
        return zza;
    }

    public void registerAcquireEvent(Context context, Intent intent, String str, String str2, String str3, int i, String str4) {
        registerEvent(context, intent.getStringExtra(LoggingConstants.EXTRA_WAKE_LOCK_KEY), 7, str, str2, str3, i, Arrays.asList(str4));
    }

    public void registerReleaseEvent(Context context, Intent intent) {
        registerEvent(context, intent.getStringExtra(LoggingConstants.EXTRA_WAKE_LOCK_KEY), 8, null, null, null, 0, null);
    }

    public void registerEvent(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        registerEvent(context, str, i, str2, str3, str4, i2, list, 0L);
    }

    public void registerEvent(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        if (zza()) {
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                Log.e("WakeLockTracker", valueOf.length() != 0 ? "missing wakeLock key. ".concat(valueOf) : new String("missing wakeLock key. "));
            } else if (7 == i || 8 == i || 10 == i || 11 == i) {
                zza(context, new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, StatsUtils.zza(list), str, SystemClock.elapsedRealtime(), com.google.android.gms.common.util.zza.zza(context), str3, StatsUtils.zza(context.getPackageName()), com.google.android.gms.common.util.zza.zzb(context), j, str4, false));
            }
        }
    }

    public void registerDeadlineEvent(Context context, String str, String str2, String str3, int i, List<String> list, boolean z, long j) {
        if (zza()) {
            zza(context, new WakeLockEvent(System.currentTimeMillis(), 16, str, i, StatsUtils.zza(list), null, j, com.google.android.gms.common.util.zza.zza(context), str2, StatsUtils.zza(context.getPackageName()), com.google.android.gms.common.util.zza.zzb(context), 0L, str3, z));
        }
    }

    private static void zza(Context context, WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new Intent().setComponent(LoggingConstants.zza).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (Exception e) {
            Log.wtf("WakeLockTracker", e);
        }
    }

    private static boolean zza() {
        if (zzb == null) {
            zzb = false;
        }
        return zzb.booleanValue();
    }
}
