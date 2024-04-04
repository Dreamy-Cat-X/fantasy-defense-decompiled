package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeqc {
    private static String zzjap;

    public static String zzcm(Context context) {
        String str = zzjap;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            zzjap = null;
        } else if (arrayList.size() == 1) {
            zzjap = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(str2) && !zzd(context, intent) && arrayList.contains(str2)) {
            zzjap = str2;
        } else if (arrayList.contains("com.android.chrome")) {
            zzjap = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            zzjap = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            zzjap = "com.chrome.dev";
        } else if (arrayList.contains("com.google.android.apps.chrome")) {
            zzjap = "com.google.android.apps.chrome";
        }
        return zzjap;
    }

    private static boolean zzd(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
