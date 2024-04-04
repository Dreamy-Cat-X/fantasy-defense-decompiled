package com.google.android.gms.internal.ads;

import com.google.android.gms.common.GooglePlayServicesUtilLight;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzdgx implements zzder {
    static final zzder zzhbl = new zzdgx();

    private zzdgx() {
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final void zzr(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
    }
}
