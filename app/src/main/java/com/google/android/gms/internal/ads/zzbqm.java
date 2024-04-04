package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbqm extends zzys {
    private final List<zzvt> zzadt;
    private final String zzfxi;
    private final String zzfxj;

    public zzbqm(zzdmi zzdmiVar, String str, zzcqx zzcqxVar) {
        this.zzfxj = zzdmiVar == null ? null : zzdmiVar.zzfxj;
        String zzb = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) ? zzb(zzdmiVar) : null;
        this.zzfxi = zzb != null ? zzb : str;
        this.zzadt = zzcqxVar.getAdapterResponses();
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final String getMediationAdapterClassName() {
        return this.zzfxi;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final String getResponseId() {
        return this.zzfxj;
    }

    private static String zzb(zzdmi zzdmiVar) {
        try {
            return zzdmiVar.zzhhw.getString("class_name");
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final List<zzvt> getAdapterResponses() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcze)).booleanValue()) {
            return this.zzadt;
        }
        return null;
    }
}
