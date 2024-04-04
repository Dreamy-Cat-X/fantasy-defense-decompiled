package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzdwh;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbu {
    @Deprecated
    public static <T> T zza(Context context, Callable<T> callable) {
        try {
            return (T) zza(callable);
        } catch (Throwable th) {
            zzaym.zzc("Unexpected exception.", th);
            zzarw.zzq(context).zza(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }

    public static <T> T zza(zzdwh<T> zzdwhVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzdwhVar.get();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static <T> T zza(Callable<T> callable) throws Exception {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
