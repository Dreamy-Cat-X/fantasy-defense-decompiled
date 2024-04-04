package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzahq implements zzahv<Object> {
    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zza(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf(map.get("string"));
        com.google.android.gms.ads.internal.util.zzd.zzew(valueOf.length() != 0 ? "Received log message: ".concat(valueOf) : new String("Received log message: "));
    }
}
