package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: D:\decomp\classes.dex */
abstract class zziq {
    private static final zziq zza;
    private static final zziq zzb;

    private zziq() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zziq zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zziq zzb() {
        return zzb;
    }

    static {
        zzip zzipVar = null;
        zza = new zzis();
        zzb = new zzir();
    }
}
