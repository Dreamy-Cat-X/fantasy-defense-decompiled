package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaym;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class WorkManagerUtil extends zzbi {
    private static void zzbs(Context context) {
        try {
            WorkManager.initialize(context.getApplicationContext(), new Configuration.Builder().build());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbf
    public final boolean zzd(IObjectWrapper iObjectWrapper, String str, String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzbs(context);
        Constraints build = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        try {
            WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(OfflineNotificationPoster.class).setConstraints(build).setInputData(new Data.Builder().putString("uri", str).putString("gws_query_id", str2).build()).addTag("offline_notification_work").build());
            return true;
        } catch (IllegalStateException e) {
            zzaym.zzd("Failed to instantiate WorkManager.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbf
    public final void zzap(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzbs(context);
        try {
            WorkManager workManager = WorkManager.getInstance(context);
            workManager.cancelAllWorkByTag("offline_ping_sender_work");
            workManager.enqueue(new OneTimeWorkRequest.Builder(OfflinePingSender.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).addTag("offline_ping_sender_work").build());
        } catch (IllegalStateException e) {
            zzaym.zzd("Failed to instantiate WorkManager.", e);
        }
    }
}
