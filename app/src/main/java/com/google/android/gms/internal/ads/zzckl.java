package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzckl {
    public static Set<zzbxf<zzbrm>> zza(zzckv zzckvVar, Executor executor) {
        return zzc(zzckvVar, executor);
    }

    public static Set<zzbxf<AppEventListener>> zzb(zzckv zzckvVar, Executor executor) {
        return zzc(zzckvVar, executor);
    }

    public static Set<zzbxf<zzbsg>> zzc(zzckv zzckvVar, Executor executor) {
        return zzc(zzckvVar, executor);
    }

    public static Set<zzbxf<zzbqw>> zzd(zzckv zzckvVar, Executor executor) {
        return zzc(zzckvVar, executor);
    }

    public static Set<zzbxf<zzbqr>> zze(zzckv zzckvVar, Executor executor) {
        return zzc(zzckvVar, executor);
    }

    public static Set<zzbxf<zzbrj>> zzf(zzckv zzckvVar, Executor executor) {
        return zzc(zzckvVar, executor);
    }

    public static Set<zzbxf<zzuz>> zzg(zzckv zzckvVar, Executor executor) {
        return zzc(zzckvVar, executor);
    }

    public static Set<zzbxf<zzdre>> zzh(zzckv zzckvVar, Executor executor) {
        return zzc(zzckvVar, executor);
    }

    public static Set<zzbxf<zzbtf>> zzi(zzckv zzckvVar, Executor executor) {
        return zzc(zzckvVar, executor);
    }

    private static <T> Set<zzbxf<T>> zzc(T t, Executor executor) {
        if (zzadd.zzdda.get().booleanValue()) {
            return Collections.singleton(new zzbxf(t, executor));
        }
        return Collections.emptySet();
    }
}
