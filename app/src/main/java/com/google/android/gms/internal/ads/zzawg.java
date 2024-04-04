package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzawg {
    private final AtomicReference<ExecutorService> zzdzc = new AtomicReference<>(null);
    private final Object zzdzd = new Object();
    private String zzdze = null;
    private String zzdzf = null;
    private final AtomicBoolean zzdzg = new AtomicBoolean(false);
    private final AtomicInteger zzdzh = new AtomicInteger(-1);
    private final AtomicReference<Object> zzdzi = new AtomicReference<>(null);
    private final AtomicReference<Object> zzdzj = new AtomicReference<>(null);
    private final ConcurrentMap<String, Method> zzdzk = new ConcurrentHashMap(9);
    private final AtomicReference<zzbez> zzdzl = new AtomicReference<>(null);
    private final BlockingQueue<FutureTask<?>> zzdzm = new ArrayBlockingQueue(20);
    private final Object zzdzn = new Object();

    public final boolean zzz(Context context) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcnl)).booleanValue() && !this.zzdzg.get()) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcnv)).booleanValue()) {
                return true;
            }
            if (this.zzdzh.get() == -1) {
                zzwo.zzqm();
                if (!zzayd.zzf(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    zzwo.zzqm();
                    if (zzayd.zzbo(context)) {
                        com.google.android.gms.ads.internal.util.zzd.zzex("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zzdzh.set(0);
                    }
                }
                this.zzdzh.set(1);
            }
            if (this.zzdzh.get() == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzaa(Context context) {
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcns)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzwo.zzqq().zzd(zzabh.zzcnt)).intValue()) {
            return false;
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcnu)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    public final void zza(Context context, zzaak zzaakVar) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcnx)).booleanValue() && zzz(context) && zzaa(context)) {
            synchronized (this.zzdzn) {
            }
        }
    }

    public final void zza(Context context, zzvi zzviVar) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcnx)).booleanValue() && zzz(context) && zzaa(context)) {
            synchronized (this.zzdzn) {
            }
        }
    }

    public final void setConsent(final Bundle bundle) {
        zza("setConsent", new zzawz(bundle) { // from class: com.google.android.gms.internal.ads.zzawj
            private final Bundle zzdzq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdzq = bundle;
            }

            @Override // com.google.android.gms.internal.ads.zzawz
            public final void zzb(zzbez zzbezVar) {
                zzbezVar.setConsent(this.zzdzq);
            }
        });
    }

    public final void zzd(Context context, final String str) {
        if (zzz(context)) {
            if (zzaa(context)) {
                zza("beginAdUnitExposure", new zzawz(str) { // from class: com.google.android.gms.internal.ads.zzawp
                    private final String zzdjy;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdjy = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzawz
                    public final void zzb(zzbez zzbezVar) {
                        zzbezVar.beginAdUnitExposure(this.zzdjy);
                    }
                });
            } else {
                zza(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void zze(Context context, final String str) {
        if (zzz(context)) {
            if (zzaa(context)) {
                zza("endAdUnitExposure", new zzawz(str) { // from class: com.google.android.gms.internal.ads.zzawo
                    private final String zzdjy;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdjy = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzawz
                    public final void zzb(zzbez zzbezVar) {
                        zzbezVar.endAdUnitExposure(this.zzdjy);
                    }
                });
            } else {
                zza(context, str, "endAdUnitExposure");
            }
        }
    }

    public final String zzab(Context context) {
        if (!zzz(context)) {
            return "";
        }
        if (zzaa(context)) {
            return (String) zza("getCurrentScreenNameOrScreenClass", "", (zzaww<String>) zzawr.zzdzp);
        }
        if (!zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdzi, true)) {
            return "";
        }
        try {
            String str = (String) zzl(context, "getCurrentScreenName").invoke(this.zzdzi.get(), new Object[0]);
            if (str == null) {
                str = (String) zzl(context, "getCurrentScreenClass").invoke(this.zzdzi.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception unused) {
            zzh("getCurrentScreenName", false);
            return "";
        }
    }

    @Deprecated
    public final void zzf(final Context context, final String str) {
        if (zzz(context) && (context instanceof Activity)) {
            if (zzaa(context)) {
                zza("setScreenName", new zzawz(context, str) { // from class: com.google.android.gms.internal.ads.zzawq
                    private final Context zzczq;
                    private final String zzdhw;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzczq = context;
                        this.zzdhw = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzawz
                    public final void zzb(zzbez zzbezVar) {
                        Context context2 = this.zzczq;
                        zzbezVar.zzb(ObjectWrapper.wrap(context2), this.zzdhw, context2.getPackageName());
                    }
                });
            } else if (zza(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzdzj, false)) {
                try {
                    zzm(context, "setCurrentScreen").invoke(this.zzdzj.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused) {
                    zzh("setCurrentScreen", false);
                }
            }
        }
    }

    public final String zzac(Context context) {
        if (!zzz(context)) {
            return null;
        }
        synchronized (this.zzdzd) {
            if (this.zzdze != null) {
                return this.zzdze;
            }
            if (zzaa(context)) {
                this.zzdze = (String) zza("getGmpAppId", this.zzdze, (zzaww<String>) zzawt.zzdzp);
            } else {
                this.zzdze = (String) zza("getGmpAppId", context);
            }
            return this.zzdze;
        }
    }

    public final String zzad(final Context context) {
        if (!zzz(context)) {
            return null;
        }
        long longValue = ((Long) zzwo.zzqq().zzd(zzabh.zzcnq)).longValue();
        if (zzaa(context)) {
            try {
                if (longValue < 0) {
                    return (String) zza("getAppInstanceId", (String) null, (zzaww<String>) zzaws.zzdzp);
                }
                return (String) zzxa().submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzawv
                    private final zzawg zzdzs;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdzs = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zzdzs.zzxc();
                    }
                }).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        if (longValue < 0) {
            return (String) zza("getAppInstanceId", context);
        }
        try {
            return (String) zzxa().submit(new Callable(this, context) { // from class: com.google.android.gms.internal.ads.zzawu
                private final Context zzckg;
                private final zzawg zzdzs;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdzs = this;
                    this.zzckg = context;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzdzs.zzah(this.zzckg);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused3) {
            return "TIME_OUT";
        } catch (Exception unused4) {
            return null;
        }
    }

    public final String zzae(Context context) {
        if (!zzz(context)) {
            return null;
        }
        if (zzaa(context)) {
            Long l = (Long) zza("getAdEventId", (String) null, (zzaww<String>) zzawi.zzdzp);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object zza = zza("generateEventId", context);
        if (zza != null) {
            return zza.toString();
        }
        return null;
    }

    public final String zzaf(Context context) {
        if (!zzz(context)) {
            return null;
        }
        synchronized (this.zzdzd) {
            if (this.zzdzf != null) {
                return this.zzdzf;
            }
            if (zzaa(context)) {
                this.zzdzf = (String) zza("getAppIdOrigin", this.zzdzf, (zzaww<String>) zzawl.zzdzp);
            } else {
                this.zzdzf = "fa";
            }
            return this.zzdzf;
        }
    }

    public final void zzg(Context context, String str) {
        zza(context, "_ac", str, (Bundle) null);
    }

    public final void zzh(Context context, String str) {
        zza(context, "_ai", str, (Bundle) null);
    }

    public final void zzi(Context context, String str) {
        zza(context, "_aq", str, (Bundle) null);
    }

    public final void zzj(Context context, String str) {
        zza(context, "_aa", str, (Bundle) null);
    }

    public final void zza(Context context, String str, String str2, String str3, int i) {
        if (zzz(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zza(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
        }
    }

    private final void zza(Context context, final String str, String str2, Bundle bundle) {
        if (zzz(context)) {
            final Bundle zzk = zzk(str2, str);
            if (bundle != null) {
                zzk.putAll(bundle);
            }
            if (zzaa(context)) {
                zza("logEventInternal", new zzawz(str, zzk) { // from class: com.google.android.gms.internal.ads.zzawk
                    private final String zzdjy;
                    private final Bundle zzdzr;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdjy = str;
                        this.zzdzr = zzk;
                    }

                    @Override // com.google.android.gms.internal.ads.zzawz
                    public final void zzb(zzbez zzbezVar) {
                        zzbezVar.logEvent("am", this.zzdjy, this.zzdzr);
                    }
                });
            } else if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdzi, true)) {
                try {
                    zzag(context).invoke(this.zzdzi.get(), "am", str, zzk);
                } catch (Exception unused) {
                    zzh("logEventInternal", true);
                }
            }
        }
    }

    private static Bundle zzk(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String valueOf = String.valueOf(str);
            com.google.android.gms.ads.internal.util.zzd.zzc(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Method zzag(Context context) {
        Method method = this.zzdzk.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
            this.zzdzk.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzh("logEventInternal", true);
            return null;
        }
    }

    private final Method zzk(Context context, String str) {
        Method method = this.zzdzk.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, String.class);
            this.zzdzk.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzh(str, false);
            return null;
        }
    }

    private final Method zzl(Context context, String str) {
        Method method = this.zzdzk.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzdzk.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzh(str, false);
            return null;
        }
    }

    private final Method zzm(Context context, String str) {
        Method method = this.zzdzk.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, Activity.class, String.class, String.class);
            this.zzdzk.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzh(str, false);
            return null;
        }
    }

    private final void zza(Context context, String str, String str2) {
        if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdzi, true)) {
            try {
                zzk(context, str2).invoke(this.zzdzi.get(), str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
            } catch (Exception unused) {
                zzh(str2, false);
            }
        }
    }

    private final Object zza(String str, Context context) {
        if (!zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdzi, true)) {
            return null;
        }
        try {
            return zzl(context, str).invoke(this.zzdzi.get(), new Object[0]);
        } catch (Exception unused) {
            zzh(str, true);
            return null;
        }
    }

    private final void zzh(String str, boolean z) {
        if (this.zzdzg.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        com.google.android.gms.ads.internal.util.zzd.zzex(sb.toString());
        if (z) {
            com.google.android.gms.ads.internal.util.zzd.zzex("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.zzdzg.set(true);
        }
    }

    private final ExecutorService zzxa() {
        ExecutorService threadPoolExecutor;
        if (this.zzdzc.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = zzdus.zzaza().zza(((Integer) zzwo.zzqq().zzd(zzabh.zzcnr)).intValue(), zzxb(), zzdvb.zzhtr);
            } else {
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzwo.zzqq().zzd(zzabh.zzcnr)).intValue(), ((Integer) zzwo.zzqq().zzd(zzabh.zzcnr)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), zzxb());
            }
            this.zzdzc.compareAndSet(null, threadPoolExecutor);
        }
        return this.zzdzc.get();
    }

    private final ThreadFactory zzxb() {
        return new zzawx(this);
    }

    private final boolean zza(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                zzh("getInstance", z);
                return false;
            }
        }
        return true;
    }

    private final void zza(final String str, final zzawz zzawzVar) {
        synchronized (this.zzdzl) {
            FutureTask<?> futureTask = new FutureTask<>(new Runnable(this, zzawzVar, str) { // from class: com.google.android.gms.internal.ads.zzawn
                private final String zzdkf;
                private final zzawg zzdzs;
                private final zzawz zzdzt;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdzs = this;
                    this.zzdzt = zzawzVar;
                    this.zzdkf = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzdzs.zza(this.zzdzt, this.zzdkf);
                }
            }, null);
            if (this.zzdzl.get() != null) {
                futureTask.run();
            } else {
                this.zzdzm.offer(futureTask);
            }
        }
    }

    private final <T> T zza(String str, T t, zzaww<T> zzawwVar) {
        synchronized (this.zzdzl) {
            if (this.zzdzl.get() != null) {
                try {
                    return zzawwVar.zza(this.zzdzl.get());
                } catch (Exception unused) {
                    zzh(str, false);
                }
            }
            return t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzawz zzawzVar, String str) {
        if (this.zzdzl.get() != null) {
            try {
                zzawzVar.zzb(this.zzdzl.get());
            } catch (Exception unused) {
                zzh(str, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzah(Context context) throws Exception {
        return (String) zza("getAppInstanceId", context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzxc() throws Exception {
        return (String) zza("getAppInstanceId", (String) null, (zzaww<String>) zzawm.zzdzp);
    }
}
