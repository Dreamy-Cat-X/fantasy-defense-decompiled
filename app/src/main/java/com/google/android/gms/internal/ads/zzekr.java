package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzekr implements zzema {
    private static final zzekr zziox = new zzekr();

    private zzekr() {
    }

    public static zzekr zzbiu() {
        return zziox;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zze(Class<?> cls) {
        return zzekq.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final zzemb zzf(Class<?> cls) {
        if (!zzekq.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzemb) zzekq.zzd(cls.asSubclass(zzekq.class)).zza(zzekq.zze.zzipe, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
