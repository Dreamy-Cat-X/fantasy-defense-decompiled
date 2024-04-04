package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzach implements zzeqe {
    private CustomTabsSession zzdaq;
    private CustomTabsClient zzdar;
    private CustomTabsServiceConnection zzdas;
    private zzack zzdat;

    public static boolean zzj(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzeqc.zzcm(context));
                }
            }
        }
        return false;
    }

    public final void zzc(Activity activity) {
        CustomTabsServiceConnection customTabsServiceConnection = this.zzdas;
        if (customTabsServiceConnection == null) {
            return;
        }
        activity.unbindService(customTabsServiceConnection);
        this.zzdar = null;
        this.zzdaq = null;
        this.zzdas = null;
    }

    public final CustomTabsSession zzss() {
        CustomTabsClient customTabsClient = this.zzdar;
        if (customTabsClient == null) {
            this.zzdaq = null;
        } else if (this.zzdaq == null) {
            this.zzdaq = customTabsClient.newSession(null);
        }
        return this.zzdaq;
    }

    public final void zza(zzack zzackVar) {
        this.zzdat = zzackVar;
    }

    public final void zzd(Activity activity) {
        String zzcm;
        if (this.zzdar == null && (zzcm = zzeqc.zzcm(activity)) != null) {
            zzeqf zzeqfVar = new zzeqf(this);
            this.zzdas = zzeqfVar;
            CustomTabsClient.bindCustomTabsService(activity, zzcm, zzeqfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeqe
    public final void zza(CustomTabsClient customTabsClient) {
        this.zzdar = customTabsClient;
        customTabsClient.warmup(0L);
        zzack zzackVar = this.zzdat;
        if (zzackVar != null) {
            zzackVar.zzsu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeqe
    public final void zzst() {
        this.zzdar = null;
        this.zzdaq = null;
        zzack zzackVar = this.zzdat;
        if (zzackVar != null) {
            zzackVar.zzsv();
        }
    }
}
