package com.google.android.gms.internal.ads;

import java.io.PrintStream;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeip {
    private static final zzeio zzijn;
    private static final int zzijo;

    public static void zza(Throwable th, Throwable th2) {
        zzijn.zza(th, th2);
    }

    /* compiled from: com.google.android.gms:play-services-ads-base@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    static final class zza extends zzeio {
        zza() {
        }

        @Override // com.google.android.gms.internal.ads.zzeio
        public final void zza(Throwable th, Throwable th2) {
        }

        @Override // com.google.android.gms.internal.ads.zzeio
        public final void zza(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }
    }

    public static void zza(Throwable th, PrintWriter printWriter) {
        zzijn.zza(th, printWriter);
    }

    private static Integer zzbga() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    static {
        Integer num;
        zzeio zzaVar;
        try {
            num = zzbga();
        } catch (Throwable th) {
            th = th;
            num = null;
        }
        if (num != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                PrintStream printStream = System.err;
                String name = zza.class.getName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 133);
                sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                sb.append(name);
                sb.append("will be used. The error is: ");
                printStream.println(sb.toString());
                th.printStackTrace(System.err);
                zzaVar = new zza();
                zzijn = zzaVar;
                zzijo = num != null ? num.intValue() : 1;
            }
            if (num.intValue() >= 19) {
                zzaVar = new zzeiu();
                zzijn = zzaVar;
                zzijo = num != null ? num.intValue() : 1;
            }
        }
        if ((!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) != false) {
            zzaVar = new zzeis();
        } else {
            zzaVar = new zza();
        }
        zzijn = zzaVar;
        zzijo = num != null ? num.intValue() : 1;
    }
}
