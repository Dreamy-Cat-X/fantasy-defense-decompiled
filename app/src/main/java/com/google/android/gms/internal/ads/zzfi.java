package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzfi {
    private static final char[] zzaac = "0123456789abcdef".toCharArray();

    public static String zzaq(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return zzcv.zza(bArr, true);
    }

    public static String zza(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        zzeip.zza(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean zzar(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean zza(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static long zza(double d, DisplayMetrics displayMetrics) {
        double d2 = displayMetrics.density;
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    public static Activity zzd(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        for (int i = 0; (context instanceof ContextWrapper) && i < 10; i++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
