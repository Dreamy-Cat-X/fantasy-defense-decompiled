package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzagz implements zzahv<Object> {
    private final zzahc zzdfv;

    public zzagz(zzahc zzahcVar) {
        this.zzdfv = zzahcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zza(Object obj, Map<String, String> map) {
        if (this.zzdfv == null) {
            return;
        }
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            com.google.android.gms.ads.internal.util.zzd.zzew("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = com.google.android.gms.ads.internal.util.zzbk.zzh(new JSONObject(map.get("info")));
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Failed to convert ad metadata to Bundle.");
        } else {
            this.zzdfv.zza(str, bundle);
        }
    }
}
