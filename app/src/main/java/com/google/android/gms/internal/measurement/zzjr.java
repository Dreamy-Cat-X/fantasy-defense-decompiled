package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzjr {
    private static final zzjr zza = new zzjr();
    private final ConcurrentMap<Class<?>, zzjv<?>> zzc = new ConcurrentHashMap();
    private final zzjy zzb = new zzit();

    public static zzjr zza() {
        return zza;
    }

    public final <T> zzjv<T> zza(Class<T> cls) {
        zzhx.zza(cls, "messageType");
        zzjv<T> zzjvVar = (zzjv) this.zzc.get(cls);
        if (zzjvVar != null) {
            return zzjvVar;
        }
        zzjv<T> zza2 = this.zzb.zza(cls);
        zzhx.zza(cls, "messageType");
        zzhx.zza(zza2, "schema");
        zzjv<T> zzjvVar2 = (zzjv) this.zzc.putIfAbsent(cls, zza2);
        return zzjvVar2 != null ? zzjvVar2 : zza2;
    }

    public final <T> zzjv<T> zza(T t) {
        return zza((Class) t.getClass());
    }

    private zzjr() {
    }
}
