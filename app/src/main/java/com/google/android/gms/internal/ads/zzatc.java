package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzatc {
    private float zzbrt;
    private int zzdoz;
    private int zzdpa;
    private int zzdwa;
    private boolean zzdwb;
    private boolean zzdwc;
    private int zzdwd;
    private int zzdwe;
    private int zzdwf;
    private String zzdwg;
    private int zzdwh;
    private int zzdwi;
    private int zzdwj;
    private boolean zzdwk;
    private int zzdwl;
    private double zzdwm;
    private boolean zzdwn;
    private String zzdwo;
    private String zzdwp;
    private boolean zzdwq;
    private boolean zzdwr;
    private String zzdws;
    private boolean zzdwt;
    private final boolean zzdwu;
    private boolean zzdwv;
    private String zzdww;
    private String zzdwx;
    private String zzdwy;
    private boolean zzdwz;

    public zzatc(Context context) {
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        zzr(context);
        zzs(context);
        zzt(context);
        Locale locale = Locale.getDefault();
        this.zzdwq = zza(packageManager, "geo:0,0?q=donuts") != null;
        this.zzdwr = zza(packageManager, "http://www.google.com") != null;
        this.zzdws = locale.getCountry();
        zzwo.zzqm();
        this.zzdwt = zzayd.zzzu();
        this.zzdwu = DeviceProperties.isLatchsky(context);
        this.zzdwv = DeviceProperties.isSidewinder(context);
        this.zzdww = locale.getLanguage();
        this.zzdwx = zza(context, packageManager);
        this.zzdwy = zzu(context);
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.zzbrt = displayMetrics.density;
        this.zzdoz = displayMetrics.widthPixels;
        this.zzdpa = displayMetrics.heightPixels;
    }

    public zzatc(Context context, zzatd zzatdVar) {
        zzr(context);
        zzs(context);
        zzt(context);
        this.zzdwo = Build.FINGERPRINT;
        this.zzdwp = Build.DEVICE;
        this.zzdwz = PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzach.zzj(context);
        this.zzdwq = zzatdVar.zzdwq;
        this.zzdwr = zzatdVar.zzdwr;
        this.zzdws = zzatdVar.zzdws;
        this.zzdwt = zzatdVar.zzdwt;
        this.zzdwu = zzatdVar.zzdwu;
        this.zzdwv = zzatdVar.zzdwv;
        this.zzdww = zzatdVar.zzdww;
        this.zzdwx = zzatdVar.zzdwx;
        this.zzdwy = zzatdVar.zzdwy;
        this.zzbrt = zzatdVar.zzbrt;
        this.zzdoz = zzatdVar.zzdoz;
        this.zzdpa = zzatdVar.zzdpa;
    }

    private final void zzr(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.zzdwa = audioManager.getMode();
                this.zzdwb = audioManager.isMusicActive();
                this.zzdwc = audioManager.isSpeakerphoneOn();
                this.zzdwd = audioManager.getStreamVolume(3);
                this.zzdwe = audioManager.getRingerMode();
                this.zzdwf = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzp.zzku().zza(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.zzdwa = -2;
        this.zzdwb = false;
        this.zzdwc = false;
        this.zzdwd = 0;
        this.zzdwe = 2;
        this.zzdwf = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzs(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.zzdwg = telephonyManager.getNetworkOperator();
        if (PlatformVersion.isAtLeastR()) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczj)).booleanValue()) {
                networkType = 0;
                this.zzdwi = networkType;
                this.zzdwj = telephonyManager.getPhoneType();
                this.zzdwh = -2;
                this.zzdwk = false;
                this.zzdwl = -1;
                com.google.android.gms.ads.internal.zzp.zzkq();
                if (com.google.android.gms.ads.internal.util.zzm.zzp(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    return;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    this.zzdwh = activeNetworkInfo.getType();
                    this.zzdwl = activeNetworkInfo.getDetailedState().ordinal();
                } else {
                    this.zzdwh = -1;
                }
                this.zzdwk = connectivityManager.isActiveNetworkMetered();
                return;
            }
        }
        networkType = telephonyManager.getNetworkType();
        this.zzdwi = networkType;
        this.zzdwj = telephonyManager.getPhoneType();
        this.zzdwh = -2;
        this.zzdwk = false;
        this.zzdwl = -1;
        com.google.android.gms.ads.internal.zzp.zzkq();
        if (com.google.android.gms.ads.internal.util.zzm.zzp(context, "android.permission.ACCESS_NETWORK_STATE")) {
        }
    }

    private final void zzt(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            this.zzdwm = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
            this.zzdwn = intExtra == 2 || intExtra == 5;
        } else {
            this.zzdwm = -1.0d;
            this.zzdwn = false;
        }
    }

    private static String zzu(Context context) {
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128);
            if (packageInfo != null) {
                int i = packageInfo.versionCode;
                String str = packageInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String zza(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo zza = zza(packageManager, "market://details?id=com.google.android.gms.ads");
        if (zza == null || (activityInfo = zza.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
            if (packageInfo != null) {
                int i = packageInfo.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private static ResolveInfo zza(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzp.zzku().zza(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final zzatd zzwq() {
        return new zzatd(this.zzdwa, this.zzdwq, this.zzdwr, this.zzdwg, this.zzdws, this.zzdwt, this.zzdwu, this.zzdwv, this.zzdwb, this.zzdwc, this.zzdww, this.zzdwx, this.zzdwy, this.zzdwd, this.zzdwh, this.zzdwi, this.zzdwj, this.zzdwe, this.zzdwf, this.zzbrt, this.zzdoz, this.zzdpa, this.zzdwm, this.zzdwn, this.zzdwk, this.zzdwl, this.zzdwo, this.zzdwz, this.zzdwp);
    }
}
