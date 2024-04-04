package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcaj implements zzahv<Object> {
    private WeakReference<zzcah> zzgbd;

    private zzcaj(zzcah zzcahVar) {
        this.zzgbd = new WeakReference<>(zzcahVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zza(Object obj, Map<String, String> map) {
        zzcah zzcahVar = this.zzgbd.get();
        if (zzcahVar != null && "_ac".equals(map.get("eventName"))) {
            zzcah.zzb(zzcahVar).onAdClicked();
        }
    }
}
