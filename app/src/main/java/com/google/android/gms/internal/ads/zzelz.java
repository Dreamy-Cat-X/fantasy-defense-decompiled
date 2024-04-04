package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzelz implements zzelw {
    @Override // com.google.android.gms.internal.ads.zzelw
    public final Map<?, ?> zzan(Object obj) {
        return (zzelx) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzelw
    public final zzelu<?, ?> zzas(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.zzelw
    public final Map<?, ?> zzao(Object obj) {
        return (zzelx) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzelw
    public final boolean zzap(Object obj) {
        return !((zzelx) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.ads.zzelw
    public final Object zzaq(Object obj) {
        ((zzelx) obj).zzbgi();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzelw
    public final Object zzar(Object obj) {
        return zzelx.zzbjv().zzbjw();
    }

    @Override // com.google.android.gms.internal.ads.zzelw
    public final Object zzf(Object obj, Object obj2) {
        zzelx zzelxVar = (zzelx) obj;
        zzelx zzelxVar2 = (zzelx) obj2;
        if (!zzelxVar2.isEmpty()) {
            if (!zzelxVar.isMutable()) {
                zzelxVar = zzelxVar.zzbjw();
            }
            zzelxVar.zza(zzelxVar2);
        }
        return zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelw
    public final int zzb(int i, Object obj, Object obj2) {
        zzelx zzelxVar = (zzelx) obj;
        if (zzelxVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzelxVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
