package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzepm<K, V, V2> {
    final LinkedHashMap<K, zzeqd<V>> zzjaf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzepm(int i) {
        this.zzjaf = zzepp.zzif(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public zzepm<K, V, V2> zza(K k, zzeqd<V> zzeqdVar) {
        this.zzjaf.put(zzepw.zza(k, "key"), zzepw.zza(zzeqdVar, "provider"));
        return this;
    }
}
