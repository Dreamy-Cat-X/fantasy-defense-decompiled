package com.google.android.gms.ads.internal.util;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzaas;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzach;
import com.google.android.gms.internal.ads.zzacj;
import com.google.android.gms.internal.ads.zzadj;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzdva;
import com.google.android.gms.internal.ads.zzdyz;
import com.google.android.gms.internal.ads.zzdzl;
import com.google.android.gms.internal.ads.zzwo;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzm {
    public static final zzdva zzecu = new zzg(Looper.getMainLooper());
    private String zzbiq;
    private AtomicReference<Pattern> zzecs = new AtomicReference<>(null);
    private AtomicReference<Pattern> zzect = new AtomicReference<>(null);
    private boolean zzyn = true;
    private final Object zzecv = new Object();
    private boolean zzecw = false;
    private boolean zzecx = false;
    private final Executor zzecy = Executors.newSingleThreadExecutor();

    public static int zzdg(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        StringBuilder sb = new StringBuilder(97);
        sb.append("HTTP timeout too low: ");
        sb.append(i);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        zzd.zzex(sb.toString());
        return 60000;
    }

    public final void zza(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int zzdg = zzdg(i);
        StringBuilder sb = new StringBuilder(39);
        sb.append("HTTP timeout: ");
        sb.append(zzdg);
        sb.append(" milliseconds.");
        zzd.zzew(sb.toString());
        httpURLConnection.setConnectTimeout(zzdg);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zzdg);
        httpURLConnection.setRequestProperty("User-Agent", zzq(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public static boolean zzp(Context context, String str) {
        Context zzy = zzatp.zzy(context);
        return Wrappers.packageManager(zzy).checkPermission(str, zzy.getPackageName()) == 0;
    }

    public static void zzb(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            new zzbp(context, str, (String) obj).zzyc();
        }
    }

    public final int zza(Context context, Uri uri) {
        int i;
        if (!PlatformVersion.isAtLeastJellyBeanMR2()) {
            zzd.zzeb("Chrome Custom Tabs can only work with version Jellybean onwards.");
            i = zzacj.zzdau;
        } else if (!(context instanceof Activity)) {
            zzd.zzeb("Chrome Custom Tabs can only work with Activity context.");
            i = zzacj.zzdav;
        } else if (zzach.zzj(context)) {
            i = 0;
        } else {
            zzd.zzeb("Default browser does not support custom tabs.");
            i = zzacj.zzdaw;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        zzach zzachVar = new zzach();
        zzachVar.zza(new zzn(this, zzachVar, context, uri));
        zzachVar.zzd((Activity) context);
        return zzacj.zzdax;
    }

    public static String zza(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return sb.toString();
            }
        }
    }

    public final boolean zzal(Context context) {
        if (this.zzecw) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter);
        this.zzecw = true;
        return true;
    }

    public final boolean zzam(Context context) {
        if (this.zzecx) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new zzs(this, null), intentFilter);
        this.zzecx = true;
        return true;
    }

    private static String zzyv() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public final String zzq(Context context, String str) {
        synchronized (this.zzecv) {
            if (this.zzbiq != null) {
                return this.zzbiq;
            }
            if (str == null) {
                return zzyv();
            }
            try {
                this.zzbiq = com.google.android.gms.ads.internal.zzp.zzks().getDefaultUserAgent(context);
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(this.zzbiq)) {
                zzwo.zzqm();
                if (!zzayd.zzzv()) {
                    this.zzbiq = null;
                    zzecu.post(new zzq(this, context));
                    while (this.zzbiq == null) {
                        try {
                            this.zzecv.wait();
                        } catch (InterruptedException unused2) {
                            String zzyv = zzyv();
                            this.zzbiq = zzyv;
                            String valueOf = String.valueOf(zzyv);
                            zzd.zzex(valueOf.length() != 0 ? "Interrupted, use default user agent: ".concat(valueOf) : new String("Interrupted, use default user agent: "));
                        }
                    }
                } else {
                    this.zzbiq = zzan(context);
                }
            }
            String valueOf2 = String.valueOf(this.zzbiq);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 10 + String.valueOf(str).length());
            sb.append(valueOf2);
            sb.append(" (Mobile; ");
            sb.append(str);
            this.zzbiq = sb.toString();
            try {
                if (Wrappers.packageManager(context).isCallerInstantApp()) {
                    this.zzbiq = String.valueOf(this.zzbiq).concat(";aia");
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzp.zzku().zza(e, "AdUtil.getUserAgent");
            }
            String concat = String.valueOf(this.zzbiq).concat(")");
            this.zzbiq = concat;
            return concat;
        }
    }

    public static String zzan(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return zzyv();
        }
    }

    public static boolean zza(ClassLoader classLoader, Class<?> cls, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (Class.forName(it.next(), false, classLoader).isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public final JSONObject zzj(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zza(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final JSONObject zza(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return zzc(bundle);
            } catch (JSONException e) {
                zzd.zzc("Error converting Bundle to JSON", e);
            }
        }
        return null;
    }

    public final JSONObject zzc(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zza(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    private final JSONArray zza(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            zza(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void zza(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(zzc((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(zzj((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(zza((Collection<?>) obj));
            return;
        }
        if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object obj2 : (Object[]) obj) {
                zza(jSONArray2, obj2);
            }
            jSONArray.put(jSONArray2);
            return;
        }
        jSONArray.put(obj);
    }

    private final void zza(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzc((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, zzj((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, zza((Collection<?>) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, zza(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    public static Map<String, String> zzg(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public final zzdzl<Map<String, String>> zzh(Uri uri) {
        return zzdyz.zza(new Callable(uri) { // from class: com.google.android.gms.ads.internal.util.zzl
            private final Uri zzecr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzecr = uri;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.ads.internal.util.zzm.zzi(android.net.Uri):java.util.Map
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
                Caused by: java.lang.IndexOutOfBoundsException: Index: 0
                	at java.base/java.util.Collections$EmptyList.get(Unknown Source)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
                	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
                	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
                	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:63)
                	... 1 more
                */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                /*
                    r1 = this;
                    android.net.Uri r0 = r1.zzecr
                    java.util.Map r0 = com.google.android.gms.ads.internal.util.zzm.zzi(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzl.call():java.lang.Object");
            }
        }, this.zzecy);
    }

    public static String zzyw() {
        return UUID.randomUUID().toString();
    }

    public static int zzeg(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            zzd.zzex(sb.toString());
            return 0;
        }
    }

    public static String zzyx() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    private static int[] zzyy() {
        return new int[]{0, 0};
    }

    public static int[] zzf(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? zzyy() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static int[] zzg(Activity activity) {
        int[] zzf = zzf(activity);
        return new int[]{zzwo.zzqm().zzd(activity, zzf[0]), zzwo.zzqm().zzd(activity, zzf[1])};
    }

    public static int[] zzh(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] zzyy = (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? zzyy() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{zzwo.zzqm().zzd(activity, zzyy[0]), zzwo.zzqm().zzd(activity, zzyy[1])};
    }

    public static boolean zzeh(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static DisplayMetrics zza(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static AlertDialog.Builder zzao(Context context) {
        return new AlertDialog.Builder(context);
    }

    public static AlertDialog.Builder zzc(Context context, int i) {
        return new AlertDialog.Builder(context, i);
    }

    public static zzaas zzap(Context context) {
        return new zzaas(context);
    }

    public static Bitmap zzm(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public static PopupWindow zza(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    public static String zzaq(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                return runningTaskInfo.topActivity.getClassName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean zzar(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return true;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    return !(powerManager == null ? false : powerManager.isScreenOn());
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public final void zza(Context context, String str, String str2, Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzp.zzkq();
        bundle.putString("device", zzyx());
        bundle.putString("eids", TextUtils.join(",", zzabh.zzsb()));
        zzwo.zzqm();
        zzayd.zza(context, str, str2, bundle, true, new zzp(this, context, str));
    }

    public static void zzc(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzayv.zzegi.execute(runnable);
        }
    }

    public static Bitmap zzn(View view) {
        if (view == null) {
            return null;
        }
        Bitmap zzp = zzp(view);
        return zzp == null ? zzo(view) : zzp;
    }

    private static Bitmap zzo(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0 && height != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(createBitmap);
                view.layout(0, 0, width, height);
                view.draw(canvas);
                return createBitmap;
            }
            zzd.zzex("Width or height of view is zero");
            return null;
        } catch (RuntimeException e) {
            zzd.zzc("Fail to capture the webview", e);
            return null;
        }
    }

    private static Bitmap zzp(View view) {
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            r0 = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e) {
            zzd.zzc("Fail to capture the web view", e);
        }
        return r0;
    }

    public static void zza(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static int zzas(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    public final boolean zza(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zza(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzat(context));
    }

    private static KeyguardManager zzat(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    public static boolean zza(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z;
        if (!com.google.android.gms.ads.internal.zzp.zzkq().zzyn) {
            if ((keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode()) && !zzq(view)) {
                z = false;
                if (view.getVisibility() == 0 && view.isShown()) {
                    if ((powerManager != null || powerManager.isScreenOn()) && z) {
                        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcpy)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        z = true;
        if (view.getVisibility() == 0) {
            if (powerManager != null || powerManager.isScreenOn()) {
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcpy)).booleanValue()) {
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzq(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView != null) {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity != null) {
                    return false;
                }
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
            }
        }
        activity = null;
        if (activity != null) {
        }
    }

    public static boolean zzau(Context context) {
        KeyguardManager zzat;
        return context != null && PlatformVersion.isAtLeastJellyBean() && (zzat = zzat(context)) != null && zzat.isKeyguardLocked();
    }

    public static int zzr(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    public static boolean zzs(View view) {
        if (view == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof ScrollView)) {
            parent = parent.getParent();
        }
        return parent != null;
    }

    public static boolean zzav(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzd.zzc("Error loading class.", th);
            com.google.android.gms.ads.internal.zzp.zzku().zza(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static void zzb(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzb(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            zzd.zzdy(sb.toString());
        } catch (ActivityNotFoundException e) {
            zzd.zzc("No browser is found.", e);
        }
    }

    public static void zzb(Context context, Intent intent) {
        if (intent != null && PlatformVersion.isAtLeastJellyBeanMR2()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static void zzc(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e) {
            zzd.zzc("Error writing to file in internal storage.", e);
        }
    }

    public static String zzr(Context context, String str) {
        try {
            return new String(IOUtils.readInputStreamFully(context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            zzd.zzdy("Error reading from internal storage.");
            return "";
        }
    }

    public final boolean zzei(String str) {
        return zza(str, this.zzecs, (String) zzwo.zzqq().zzd(zzabh.zzcnm));
    }

    public final boolean zzej(String str) {
        return zza(str, this.zzect, (String) zzwo.zzqq().zzd(zzabh.zzcnn));
    }

    private static boolean zza(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String zzyz() {
        Resources resources = com.google.android.gms.ads.internal.zzp.zzku().getResources();
        return resources != null ? resources.getString(com.google.android.gms.ads.impl.R.string.s7) : "Test Ad";
    }

    public static WebResourceResponse zzd(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzp.zzkq().zzq(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = new zzax(context).zzb(str2, hashMap).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            zzd.zzd("Could not fetch MRAID JS.", e);
            return null;
        }
    }

    public static WebResourceResponse zzd(HttpURLConnection httpURLConnection) throws IOException {
        com.google.android.gms.ads.internal.zzp.zzkq();
        String contentType = httpURLConnection.getContentType();
        String str = "";
        String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
        com.google.android.gms.ads.internal.zzp.zzkq();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str2 = str;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && entry.getValue().size() > 0) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return com.google.android.gms.ads.internal.zzp.zzks().zza(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static void zza(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        boolean z = false;
        try {
            z = zzadj.zzddm.get().booleanValue();
        } catch (IllegalStateException unused) {
        }
        if (z) {
            CrashUtils.addDynamiteErrorToDropBox(context, th);
        }
    }

    public static String zzaw(Context context) {
        return !((Boolean) zzwo.zzqq().zzd(zzabh.zzcwu)).booleanValue() ? "" : context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
    }

    public static Bundle zzax(Context context) {
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcwv)).booleanValue()) {
            return null;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Bundle bundle = new Bundle();
        if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
            bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
        }
        String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (defaultSharedPreferences.contains(str)) {
                bundle.putString(str, defaultSharedPreferences.getString(str, null));
            }
        }
        return bundle;
    }

    public static boolean zzay(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzek(String str) {
        if (!zzayg.isEnabled()) {
            return false;
        }
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcul)).booleanValue()) {
            return false;
        }
        String str2 = (String) zzwo.zzqq().zzd(zzabh.zzcun);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) zzwo.zzqq().zzd(zzabh.zzcum);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String zzaz(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzd(getMetadata(context));
    }

    public static boolean zzba(Context context) {
        Bundle metadata = getMetadata(context);
        return TextUtils.isEmpty(zzd(metadata)) && !TextUtils.isEmpty(metadata.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    private static String zzd(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    private static Bundle getMetadata(Context context) {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zzd.zza("Error getting metadata", e);
            return null;
        }
    }

    public static boolean zzbb(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static void zzbc(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    public static boolean zzbd(Context context) {
        return NotificationManagerCompat.from(context).areNotificationsEnabled();
    }

    public static zzbf zzbe(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzd.zzev("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            if (queryLocalInterface instanceof zzbf) {
                return (zzbf) queryLocalInterface;
            }
            return new zzbh(iBinder);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzp.zzku().zza(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static void zza(DownloadManager.Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
    }

    public static final /* synthetic */ Map zzi(Uri uri) throws Exception {
        com.google.android.gms.ads.internal.zzp.zzkq();
        return zzg(uri);
    }
}
