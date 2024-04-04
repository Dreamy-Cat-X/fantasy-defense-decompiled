package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzelv<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void zza(zzeka zzekaVar, zzelu<K, V> zzeluVar, K k, V v) throws IOException {
        zzekj.zza(zzekaVar, zzeluVar.zziqu, 1, k);
        zzekj.zza(zzekaVar, zzeluVar.zziqw, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int zza(zzelu<K, V> zzeluVar, K k, V v) {
        return zzekj.zza(zzeluVar.zziqu, 1, k) + zzekj.zza(zzeluVar.zziqw, 2, v);
    }
}
