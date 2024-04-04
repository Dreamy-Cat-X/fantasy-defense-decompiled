package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbw;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdsn {
    private static volatile zzbw.zza.zzc zzhqx = zzbw.zza.zzc.UNKNOWN;
    private final Context context;
    private final Executor executor;
    private final Task<zztz> zzhqw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(zzbw.zza.zzc zzcVar) {
        zzhqx = zzcVar;
    }

    public static zzdsn zza(final Context context, Executor executor) {
        return new zzdsn(context, executor, Tasks.call(executor, new Callable(context) { // from class: com.google.android.gms.internal.ads.zzdsp
            private final Context zzczq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczq = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdsn.zzck(this.zzczq);
            }
        }));
    }

    private zzdsn(Context context, Executor executor, Task<zztz> task) {
        this.context = context;
        this.executor = executor;
        this.zzhqw = task;
    }

    public final Task<Boolean> zzh(int i, long j) {
        return zza(i, j, null, null, null, null);
    }

    public final Task<Boolean> zza(int i, long j, Exception exc) {
        return zza(i, j, exc, null, null, null);
    }

    public final Task<Boolean> zza(int i, long j, String str, Map<String, String> map) {
        return zza(i, j, null, str, null, null);
    }

    public final Task<Boolean> zzg(int i, String str) {
        return zza(i, 0L, null, null, null, str);
    }

    public final Task<Boolean> zzb(int i, long j, String str) {
        return zza(i, j, null, null, null, str);
    }

    private final Task<Boolean> zza(final int i, long j, Exception exc, String str, Map<String, String> map, String str2) {
        final zzbw.zza.C0006zza zzc = zzbw.zza.zzs().zzj(this.context.getPackageName()).zzc(j);
        zzc.zza(zzhqx);
        if (exc != null) {
            zzc.zzk(zzdwk.zza(exc)).zzl(exc.getClass().getName());
        }
        if (str2 != null) {
            zzc.zzm(str2);
        }
        if (str != null) {
            zzc.zzn(str);
        }
        return this.zzhqw.continueWith(this.executor, new Continuation(zzc, i) { // from class: com.google.android.gms.internal.ads.zzdso
            private final int zzedk;
            private final zzbw.zza.C0006zza zzhqy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhqy = zzc;
                this.zzedk = i;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzdsn.zza(this.zzhqy, this.zzedk, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Boolean zza(zzbw.zza.C0006zza c0006zza, int i, Task task) throws Exception {
        if (task.isSuccessful()) {
            zzud zzf = ((zztz) task.getResult()).zzf(((zzbw.zza) ((zzekq) c0006zza.zzbiz())).toByteArray());
            zzf.zzbv(i);
            zzf.log();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ zztz zzck(Context context) throws Exception {
        return new zztz(context, "GLAS", null);
    }
}
