package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaic {
    private final Context context;
    private final View view;
    private final zzef zzbpj;

    public zzaic(Context context, zzef zzefVar, View view) {
        this.context = context;
        this.zzbpj = zzefVar;
        this.view = view;
    }

    private static Intent zzf(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    private final ResolveInfo zzb(Intent intent) {
        return zza(intent, new ArrayList<>());
    }

    private final ResolveInfo zza(Intent intent, ArrayList<ResolveInfo> arrayList) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = this.context.getPackageManager();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzp.zzku().zza(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            int i = 0;
            while (true) {
                if (i >= queryIntentActivities.size()) {
                    break;
                }
                ResolveInfo resolveInfo2 = queryIntentActivities.get(i);
                if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                    resolveInfo = resolveActivity;
                    break;
                }
                i++;
            }
        }
        arrayList.addAll(queryIntentActivities);
        return resolveInfo;
    }

    private static Intent zza(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent zze(Map<String, String> map) {
        boolean z;
        ResolveInfo zza;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo zzb;
        ActivityManager activityManager = (ActivityManager) this.context.getSystemService("activity");
        String str = map.get("u");
        Uri uri = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri zze = zzahz.zze(zzahz.zza(this.context, this.zzbpj, Uri.parse(str), this.view, null));
        boolean parseBoolean = Boolean.parseBoolean(map.get("use_first_package"));
        boolean parseBoolean2 = Boolean.parseBoolean(map.get("use_running_process"));
        if (!Boolean.parseBoolean(map.get("use_custom_tabs"))) {
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzctu)).booleanValue()) {
                z = false;
                if (!"http".equalsIgnoreCase(zze.getScheme())) {
                    uri = zze.buildUpon().scheme("https").build();
                } else if ("https".equalsIgnoreCase(zze.getScheme())) {
                    uri = zze.buildUpon().scheme("http").build();
                }
                ArrayList<ResolveInfo> arrayList = new ArrayList<>();
                Intent zzf = zzf(zze);
                Intent zzf2 = zzf(uri);
                if (z) {
                    com.google.android.gms.ads.internal.zzp.zzkq();
                    com.google.android.gms.ads.internal.util.zzm.zzb(this.context, zzf);
                    com.google.android.gms.ads.internal.zzp.zzkq();
                    com.google.android.gms.ads.internal.util.zzm.zzb(this.context, zzf2);
                }
                zza = zza(zzf, arrayList);
                if (zza == null) {
                    return zza(zzf, zza);
                }
                if (zzf2 != null && (zzb = zzb(zzf2)) != null) {
                    Intent zza2 = zza(zzf, zzb);
                    if (zzb(zza2) != null) {
                        return zza2;
                    }
                }
                if (arrayList.size() == 0) {
                    return zzf;
                }
                if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                    ArrayList<ResolveInfo> arrayList2 = arrayList;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        ResolveInfo resolveInfo = arrayList2.get(i);
                        i++;
                        ResolveInfo resolveInfo2 = resolveInfo;
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (it.hasNext()) {
                            if (it.next().processName.equals(resolveInfo2.activityInfo.packageName)) {
                                return zza(zzf, resolveInfo2);
                            }
                        }
                    }
                }
                return parseBoolean ? zza(zzf, arrayList.get(0)) : zzf;
            }
        }
        z = true;
        if (!"http".equalsIgnoreCase(zze.getScheme())) {
        }
        ArrayList<ResolveInfo> arrayList3 = new ArrayList<>();
        Intent zzf3 = zzf(zze);
        Intent zzf22 = zzf(uri);
        if (z) {
        }
        zza = zza(zzf3, arrayList3);
        if (zza == null) {
        }
    }
}
