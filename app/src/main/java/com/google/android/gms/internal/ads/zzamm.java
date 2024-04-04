package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzamm implements zzaid {
    private final zzazc<O> zzdjx;
    private final /* synthetic */ zzamk zzdkd;

    public zzamm(zzamk zzamkVar, zzazc<O> zzazcVar) {
        this.zzdkd = zzamkVar;
        this.zzdjx = zzazcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final void zzc(JSONObject jSONObject) {
        zzals zzalsVar;
        try {
            zzazc<O> zzazcVar = this.zzdjx;
            zzalsVar = this.zzdkd.zzdjp;
            zzazcVar.set(zzalsVar.zzd(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzdjx.setException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final void onFailure(String str) {
        try {
            if (str == null) {
                this.zzdjx.setException(new zzaln());
            } else {
                this.zzdjx.setException(new zzaln(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
