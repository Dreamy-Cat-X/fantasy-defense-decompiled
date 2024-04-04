package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.1.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzv {
    private static final zzw zza;
    private static zzw zzb;

    public static Executor zza(Executor executor) {
        return zzb.zza(executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Executor zzb(Executor executor) {
        return executor;
    }

    static {
        zzw zzwVar = zzx.zza;
        zza = zzwVar;
        zzb = zzwVar;
    }
}
