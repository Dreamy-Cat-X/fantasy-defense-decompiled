package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdgn implements zzder<JSONObject> {
    private Bundle zzhcz;

    public zzdgn(Bundle bundle) {
        this.zzhcz = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (this.zzhcz != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbk.zzb(com.google.android.gms.ads.internal.util.zzbk.zzb(jSONObject2, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.zzp.zzkq().zzc(this.zzhcz));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zzd.zzeb("Failed putting parental controls bundle.");
            }
        }
    }
}
