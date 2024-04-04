package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzemr {
    private static final zzemr zziry = new zzemr();
    private final ConcurrentMap<Class<?>, zzemy<?>> zzisa = new ConcurrentHashMap();
    private final zzenb zzirz = new zzelq();

    public static zzemr zzbki() {
        return zziry;
    }

    public final <T> zzemy<T> zzh(Class<T> cls) {
        zzeks.zza(cls, "messageType");
        zzemy<T> zzemyVar = (zzemy) this.zzisa.get(cls);
        if (zzemyVar != null) {
            return zzemyVar;
        }
        zzemy<T> zzg = this.zzirz.zzg(cls);
        zzeks.zza(cls, "messageType");
        zzeks.zza(zzg, "schema");
        zzemy<T> zzemyVar2 = (zzemy) this.zzisa.putIfAbsent(cls, zzg);
        return zzemyVar2 != null ? zzemyVar2 : zzg;
    }

    public final <T> zzemy<T> zzax(T t) {
        return zzh(t.getClass());
    }

    private zzemr() {
    }
}
