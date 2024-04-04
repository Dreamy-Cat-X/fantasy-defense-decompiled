package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdff implements zzder<JSONObject> {
    private final AdvertisingIdClient.Info zzhcd;
    private final String zzhce;

    public zzdff(AdvertisingIdClient.Info info, String str) {
        this.zzhcd = info;
        this.zzhce = str;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        try {
            JSONObject zzb = com.google.android.gms.ads.internal.util.zzbk.zzb(jSONObject, "pii");
            if (this.zzhcd != null && !TextUtils.isEmpty(this.zzhcd.getId())) {
                zzb.put("rdid", this.zzhcd.getId());
                zzb.put("is_lat", this.zzhcd.isLimitAdTrackingEnabled());
                zzb.put("idtype", "adid");
            } else {
                zzb.put("pdid", this.zzhce);
                zzb.put("pdidtype", "ssaid");
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zza("Failed putting Ad ID.", e);
        }
    }
}
