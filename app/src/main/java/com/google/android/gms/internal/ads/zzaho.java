package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzaho implements zzahv<zzbdh> {
    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(zzbdh zzbdhVar, Map map) {
        JSONObject zztj;
        zzbdh zzbdhVar2 = zzbdhVar;
        zzadx zzadt = zzbdhVar2.zzadt();
        if (zzadt != null && (zztj = zzadt.zztj()) != null) {
            zzbdhVar2.zza("nativeAdViewSignalsReady", zztj);
        } else {
            zzbdhVar2.zza("nativeAdViewSignalsReady", new JSONObject());
        }
    }
}
