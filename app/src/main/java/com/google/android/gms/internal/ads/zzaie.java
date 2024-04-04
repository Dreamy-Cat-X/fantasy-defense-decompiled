package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaie implements zzaid {
    private final /* synthetic */ zzazc zzdhc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaie(zzaib zzaibVar, zzazc zzazcVar) {
        this.zzdhc = zzazcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final void zzc(JSONObject jSONObject) {
        this.zzdhc.set(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final void onFailure(String str) {
        this.zzdhc.setException(new zzaln(str));
    }
}
