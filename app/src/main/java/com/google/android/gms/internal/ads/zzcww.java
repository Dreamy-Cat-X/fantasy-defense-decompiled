package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcww extends zzapd {
    private final String zzdhk;
    private final zzaoz zzgvt;
    private zzazc<JSONObject> zzgvu;
    private final JSONObject zzgvv;
    private boolean zzgvw;

    public zzcww(String str, zzaoz zzaozVar, zzazc<JSONObject> zzazcVar) {
        JSONObject jSONObject = new JSONObject();
        this.zzgvv = jSONObject;
        this.zzgvw = false;
        this.zzgvu = zzazcVar;
        this.zzdhk = str;
        this.zzgvt = zzaozVar;
        try {
            jSONObject.put("adapter_version", zzaozVar.zzvb().toString());
            this.zzgvv.put("sdk_version", this.zzgvt.zzvc().toString());
            this.zzgvv.put(AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzdhk);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzape
    public final synchronized void zzdn(String str) throws RemoteException {
        if (this.zzgvw) {
            return;
        }
        if (str == null) {
            onFailure("Adapter returned null signals");
            return;
        }
        try {
            this.zzgvv.put("signals", str);
        } catch (JSONException unused) {
        }
        this.zzgvu.set(this.zzgvv);
        this.zzgvw = true;
    }

    @Override // com.google.android.gms.internal.ads.zzape
    public final synchronized void onFailure(String str) throws RemoteException {
        if (this.zzgvw) {
            return;
        }
        try {
            this.zzgvv.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.zzgvu.set(this.zzgvv);
        this.zzgvw = true;
    }

    @Override // com.google.android.gms.internal.ads.zzape
    public final synchronized void zzh(zzvc zzvcVar) throws RemoteException {
        if (this.zzgvw) {
            return;
        }
        try {
            this.zzgvv.put("signal_error", zzvcVar.zzcgs);
        } catch (JSONException unused) {
        }
        this.zzgvu.set(this.zzgvv);
        this.zzgvw = true;
    }
}
