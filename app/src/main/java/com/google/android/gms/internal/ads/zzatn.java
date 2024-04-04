package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzatn implements zzasy {
    private zzalq<JSONObject, JSONObject> zzdxd;
    private zzalq<JSONObject, JSONObject> zzdxi;

    public zzatn(Context context) {
        this.zzdxi = com.google.android.gms.ads.internal.zzp.zzld().zza(context, zzayt.zzzz()).zza("google.afma.request.getAdDictionary", zzalt.zzdjj, zzalt.zzdjj);
        this.zzdxd = com.google.android.gms.ads.internal.zzp.zzld().zza(context, zzayt.zzzz()).zza("google.afma.sdkConstants.getSdkConstants", zzalt.zzdjj, zzalt.zzdjj);
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final zzalq<JSONObject, JSONObject> zzwi() {
        return this.zzdxd;
    }
}
