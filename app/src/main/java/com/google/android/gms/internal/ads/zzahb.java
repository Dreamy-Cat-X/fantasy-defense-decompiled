package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzahb implements zzahv<Object> {
    private final zzahe zzdfx;

    public zzahb(zzahe zzaheVar) {
        this.zzdfx = zzaheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            com.google.android.gms.ads.internal.util.zzd.zzex("App event with no name parameter.");
        } else {
            this.zzdfx.onAppEvent(str, map.get("info"));
        }
    }
}
