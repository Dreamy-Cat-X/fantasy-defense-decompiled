package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdgd implements zzdeu<zzder<JSONObject>> {
    private final JSONObject zzhct;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdgd(Context context) {
        this.zzhct = zzatg.zzw(context);
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzder<JSONObject>> zzata() {
        return zzdyz.zzag(new zzder(this) { // from class: com.google.android.gms.internal.ads.zzdgg
            private final zzdgd zzhcu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhcu = this;
            }

            @Override // com.google.android.gms.internal.ads.zzder
            public final void zzr(Object obj) {
                this.zzhcu.zzq((JSONObject) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zzhct);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zzd.zzeb("Failed putting version constants.");
        }
    }
}
