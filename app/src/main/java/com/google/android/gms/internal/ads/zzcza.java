package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final /* synthetic */ class zzcza implements zzdvo {
    static final zzdvo zzdyn = new zzcza();

    private zzcza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdvo
    public final Object apply(Object obj) {
        String optString;
        optString = ((JSONObject) obj).optString("nas");
        return optString;
    }
}
