package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzahr implements zzahv<zzbdh> {
    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(zzbdh zzbdhVar, Map map) {
        zzbdh zzbdhVar2 = zzbdhVar;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzbdhVar2.zzkm();
        } else if ("resume".equals(str)) {
            zzbdhVar2.zzkn();
        }
    }
}
