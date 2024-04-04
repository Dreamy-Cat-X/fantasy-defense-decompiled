package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzaht implements zzahv<zzbdh> {
    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(zzbdh zzbdhVar, Map map) {
        zzbdh zzbdhVar2 = zzbdhVar;
        if (map.keySet().contains("start")) {
            zzbdhVar2.zzbc(true);
        }
        if (map.keySet().contains("stop")) {
            zzbdhVar2.zzbc(false);
        }
    }
}
