package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.ads.AdRequest;
import com.google.android.gms.internal.ads.zzadd;
import com.google.android.gms.internal.ads.zzaym;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzd extends zzaym {
    public static void zzeb(String str) {
        if (zzye()) {
            Log.v(AdRequest.LOGTAG, str);
        }
    }

    public static void zza(String str, Throwable th) {
        if (zzye()) {
            Log.v(AdRequest.LOGTAG, str, th);
        }
    }

    public static boolean zzye() {
        return isLoggable(2) && zzadd.zzdda.get().booleanValue();
    }
}
