package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.kt.olleh.inapp.net.InAppError;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzarw implements zzasa {
    private static final Object lock = new Object();
    private static zzasa zzdry = null;
    private static zzasa zzdrz = null;
    private final Context zzcln;
    private final Object zzdsa;
    private final WeakHashMap<Thread, Boolean> zzdsb;
    private final zzayt zzdsc;
    private final ExecutorService zzyr;

    public static zzasa zzq(Context context) {
        synchronized (lock) {
            if (zzdry == null) {
                if (zzadj.zzddp.get().booleanValue()) {
                    if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcyi)).booleanValue()) {
                        zzdry = new zzarw(context);
                    }
                }
                zzdry = new zzasd();
            }
        }
        return zzdry;
    }

    public static zzasa zzc(Context context, zzayt zzaytVar) {
        synchronized (lock) {
            if (zzdrz == null) {
                if (zzadj.zzddp.get().booleanValue()) {
                    if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcyi)).booleanValue()) {
                        zzarw zzarwVar = new zzarw(context, zzaytVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzarwVar.zzdsa) {
                                zzarwVar.zzdsb.put(thread, true);
                            }
                            thread.setUncaughtExceptionHandler(new zzasb(zzarwVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzary(zzarwVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzdrz = zzarwVar;
                    }
                }
                zzdrz = new zzasd();
            }
        }
        return zzdrz;
    }

    private zzarw(Context context) {
        this(context, zzayt.zzzz());
    }

    private zzarw(Context context, zzayt zzaytVar) {
        this.zzdsa = new Object();
        this.zzdsb = new WeakHashMap<>();
        this.zzyr = zzdus.zzaza().zzel(zzdvb.zzhtr);
        this.zzcln = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzdsc = zzaytVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r3 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Thread thread, Throwable th) {
        boolean z = true;
        if (th != null) {
            boolean z2 = false;
            boolean z3 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    if (zzayd.zzer(stackTraceElement.getClassName())) {
                        z2 = true;
                    }
                    if (getClass().getName().equals(stackTraceElement.getClassName())) {
                        z3 = true;
                    }
                }
            }
            if (z2) {
            }
        }
        z = false;
        if (z) {
            zza(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    public final void zza(Throwable th, String str) {
        zza(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    public final void zza(Throwable th, String str, float f) {
        if (zzayd.zzd(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        zzeip.zza(th, new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int i = 0;
        boolean z = Math.random() < ((double) f);
        int i2 = f > 0.0f ? (int) (1.0f / f) : 1;
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(zza(name, stringWriter2, str, i2).toString());
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                final String str2 = (String) obj;
                final zzayq zzayqVar = new zzayq();
                this.zzyr.execute(new Runnable(zzayqVar, str2) { // from class: com.google.android.gms.internal.ads.zzarz
                    private final String zzdhw;
                    private final zzayq zzdsf;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdsf = zzayqVar;
                        this.zzdhw = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzdsf.zzel(this.zzdhw);
                    }
                });
            }
        }
    }

    private final Uri.Builder zza(String str, String str2, String str3, int i) {
        boolean z;
        String str4;
        try {
            z = Wrappers.packageManager(this.zzcln).isCallerInstantApp();
        } catch (Throwable th) {
            zzaym.zzc("Error fetching instant app info", th);
            z = false;
        }
        try {
            str4 = this.zzcln.getPackageName();
        } catch (Throwable unused) {
            zzaym.zzex("Cannot obtain package name, proceeding.");
            str4 = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        if (!str6.startsWith(str5)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 1 + String.valueOf(str6).length());
            sb.append(str5);
            sb.append(" ");
            sb.append(str6);
            str6 = sb.toString();
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.zzdsc.zzbrf).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", zzabh.zzsb())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "341976203").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzadj.zzddn.get()));
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqe)).booleanValue()) {
            appendQueryParameter2.appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzcln))).appendQueryParameter("lite", this.zzdsc.zzegh ? InAppError.FAILED : InAppError.SUCCESS);
        }
        return appendQueryParameter2;
    }
}
