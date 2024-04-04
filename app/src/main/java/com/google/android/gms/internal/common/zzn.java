package com.google.android.gms.internal.common;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzn {
    public static <T> zzo<T> zza(zzo<T> zzoVar) {
        if ((zzoVar instanceof zzp) || (zzoVar instanceof zzq)) {
            return zzoVar;
        }
        if (zzoVar instanceof Serializable) {
            return new zzq(zzoVar);
        }
        return new zzp(zzoVar);
    }
}
