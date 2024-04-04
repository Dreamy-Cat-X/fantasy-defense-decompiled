package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
abstract class zzeln {
    private static final zzeln zziqm;
    private static final zzeln zziqn;

    private zzeln() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeln zzbjr() {
        return zziqm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeln zzbjs() {
        return zziqn;
    }

    static {
        zzelm zzelmVar = null;
        zziqm = new zzelp();
        zziqn = new zzelo();
    }
}
