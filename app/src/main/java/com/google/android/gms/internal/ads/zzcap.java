package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcap implements zzepq<JSONObject> {
    private final zzcan zzgbi;

    public zzcap(zzcan zzcanVar) {
        this.zzgbi = zzcanVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (JSONObject) zzepw.zza(this.zzgbi.zzank(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
