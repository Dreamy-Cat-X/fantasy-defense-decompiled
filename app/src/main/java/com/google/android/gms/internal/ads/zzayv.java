package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzayv {
    public static final zzdzk zzegi;
    public static final zzdzk zzegj;
    public static final zzdzk zzegk;
    public static final ScheduledExecutorService zzegl;
    public static final zzdzk zzegm;
    public static final zzdzk zzegn;

    private static ThreadFactory zzfa(String str) {
        return new zzayx(str);
    }

    private static zzdzk zza(Executor executor) {
        return new zzayz(executor, null);
    }

    static {
        ExecutorService threadPoolExecutor;
        ExecutorService threadPoolExecutor2;
        ExecutorService threadPoolExecutor3;
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor = zzdus.zzaza().zza(zzfa("Default"), zzdvb.zzhtr);
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, (int) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 10L, TimeUnit.SECONDS, new SynchronousQueue(), zzfa("Default"));
        }
        zzegi = zza(threadPoolExecutor);
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor2 = zzdus.zzaza().zza(5, zzfa("Loader"), zzdvb.zzhtq);
        } else {
            threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzfa("Loader"));
            ((ThreadPoolExecutor) threadPoolExecutor2).allowCoreThreadTimeOut(true);
        }
        zzegj = zza(threadPoolExecutor2);
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor3 = zzdus.zzaza().zzb(zzfa("Activeview"), zzdvb.zzhtq);
        } else {
            threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzfa("Activeview"));
            ((ThreadPoolExecutor) threadPoolExecutor3).allowCoreThreadTimeOut(true);
        }
        zzegk = zza(threadPoolExecutor3);
        zzegl = new zzayu(3, zzfa("Schedule"));
        zzegm = zza(new zzayw());
        zzegn = zza(zzdzn.zzbai());
    }
}
