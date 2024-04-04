package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzads {
    private static final AtomicReference<zzadp> zzded = new AtomicReference<>();
    static final AtomicBoolean zzdee = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzadp zztb() {
        return zzded.get();
    }

    public static void zza(zzadp zzadpVar) {
        zzded.set(zzadpVar);
    }
}
