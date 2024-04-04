package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzvt;
import com.google.android.gms.internal.ads.zzwo;
import com.google.android.gms.internal.ads.zzyt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class ResponseInfo {
    private final zzyt zzads;
    private final List<AdapterResponseInfo> zzadt = new ArrayList();

    private ResponseInfo(zzyt zzytVar) {
        this.zzads = zzytVar;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcze)).booleanValue()) {
            try {
                List<zzvt> adapterResponses = this.zzads.getAdapterResponses();
                if (adapterResponses != null) {
                    Iterator<zzvt> it = adapterResponses.iterator();
                    while (it.hasNext()) {
                        this.zzadt.add(AdapterResponseInfo.zza(it.next()));
                    }
                }
            } catch (RemoteException e) {
                zzaym.zzc("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.zzads.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzaym.zzc("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    public final String getResponseId() {
        try {
            return this.zzads.getResponseId();
        } catch (RemoteException e) {
            zzaym.zzc("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    public final List<AdapterResponseInfo> getAdapterResponses() {
        return this.zzadt;
    }

    public final JSONObject zzdq() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<AdapterResponseInfo> it = this.zzadt.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().zzdq());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }

    public final String toString() {
        try {
            return zzdq().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public static ResponseInfo zza(zzyt zzytVar) {
        if (zzytVar != null) {
            return new ResponseInfo(zzytVar);
        }
        return null;
    }
}
