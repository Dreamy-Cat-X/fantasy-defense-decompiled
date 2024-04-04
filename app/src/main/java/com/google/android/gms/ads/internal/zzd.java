package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzdyj;
import com.google.android.gms.internal.ads.zzdyz;
import com.google.android.gms.internal.ads.zzdzl;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final /* synthetic */ class zzd implements zzdyj {
    static final zzdyj zzbon = new zzd();

    private zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzdyj
    public final zzdzl zzf(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            zzp.zzku().zzxq().zzee(jSONObject.getString("appSettingsJson"));
        }
        return zzdyz.zzag(null);
    }
}
