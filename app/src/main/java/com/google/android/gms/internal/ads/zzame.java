package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzame implements zzaid {
    private final /* synthetic */ zzalz zzdjt;
    private final zzalb zzdjw;
    private final zzazc<O> zzdjx;

    public zzame(zzalz zzalzVar, zzalb zzalbVar, zzazc<O> zzazcVar) {
        this.zzdjt = zzalzVar;
        this.zzdjw = zzalbVar;
        this.zzdjx = zzazcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final void zzc(JSONObject jSONObject) {
        zzals zzalsVar;
        try {
            try {
                zzazc<O> zzazcVar = this.zzdjx;
                zzalsVar = this.zzdjt.zzdjp;
                zzazcVar.set(zzalsVar.zzd(jSONObject));
                this.zzdjw.release();
            } catch (IllegalStateException unused) {
                this.zzdjw.release();
            } catch (JSONException e) {
                this.zzdjx.setException(e);
                this.zzdjw.release();
            }
        } catch (Throwable th) {
            this.zzdjw.release();
            throw th;
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
        } finally {
            this.zzdjw.release();
        }
    }
}
