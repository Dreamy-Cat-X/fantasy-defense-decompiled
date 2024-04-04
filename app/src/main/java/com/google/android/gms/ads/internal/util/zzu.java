package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbdh;
import com.google.android.gms.internal.ads.zzbei;
import com.google.android.gms.internal.ads.zztu;
import com.google.android.gms.internal.ads.zzum;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzu {
    public String getDefaultUserAgent(Context context) {
        return "";
    }

    public boolean isAttachedToWindow(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public boolean zza(Activity activity, Configuration configuration) {
        return false;
    }

    public void zzbf(Context context) {
    }

    public void zzi(Activity activity) {
    }

    public int zzza() {
        return 5;
    }

    public int zzzd() {
        return 1;
    }

    public long zzze() {
        return -1L;
    }

    public boolean zza(final Context context, final WebSettings webSettings) {
        zzbu.zza(context, new Callable(context, webSettings) { // from class: com.google.android.gms.ads.internal.util.zzt
            private final Context zzczq;
            private final WebSettings zzedc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczq = context;
                this.zzedc = webSettings;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.zzczq;
                WebSettings webSettings2 = this.zzedc;
                if (context2.getCacheDir() != null) {
                    webSettings2.setAppCachePath(context2.getCacheDir().getAbsolutePath());
                    webSettings2.setAppCacheMaxSize(0L);
                    webSettings2.setAppCacheEnabled(true);
                }
                webSettings2.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                webSettings2.setAllowContentAccess(false);
                return true;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public zzbdg zza(zzbdh zzbdhVar, zztu zztuVar, boolean z) {
        return new zzbei(zzbdhVar, zztuVar, z);
    }

    public ViewGroup.LayoutParams zzzb() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public Drawable zza(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public static boolean zzzc() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public CookieManager zzbg(Context context) {
        if (zzzc()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzd.zzc("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzp.zzku().zza(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public zzum zza(Context context, TelephonyManager telephonyManager) {
        return zzum.ENUM_UNKNOWN;
    }

    public int zza(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public int zzb(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public WebResourceResponse zza(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    private zzu() {
    }

    public static zzu zzdh(int i) {
        if (i >= 28) {
            return new zzab();
        }
        if (i >= 26) {
            return new zzac();
        }
        if (i >= 24) {
            return new zzz();
        }
        if (i >= 21) {
            return new zzaa();
        }
        if (i >= 19) {
            return new zzx();
        }
        if (i >= 18) {
            return new zzy();
        }
        if (i >= 17) {
            return new zzv();
        }
        return new zzu();
    }
}
