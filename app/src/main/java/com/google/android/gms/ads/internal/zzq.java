package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzact;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzdel;
import com.google.android.gms.internal.ads.zzvi;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzq {
    private final Context context;
    private final String zzbqp;
    private final Map<String, String> zzbqq = new TreeMap();
    private String zzbqr;
    private String zzbqs;

    public zzq(Context context, String str) {
        this.context = context.getApplicationContext();
        this.zzbqp = str;
    }

    public final String zzlp() {
        return this.zzbqs;
    }

    public final String getQuery() {
        return this.zzbqr;
    }

    public final String zzlq() {
        return this.zzbqp;
    }

    public final Map<String, String> zzlr() {
        return this.zzbqq;
    }

    public final void zza(zzvi zzviVar, zzayt zzaytVar) {
        this.zzbqr = zzviVar.zzchc.zzbqr;
        Bundle bundle = zzviVar.zzche != null ? zzviVar.zzche.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle == null) {
            return;
        }
        String str = zzact.zzdbp.get();
        for (String str2 : bundle.keySet()) {
            if (str.equals(str2)) {
                this.zzbqs = bundle.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.zzbqq.put(str2.substring(4), bundle.getString(str2));
            }
        }
        this.zzbqq.put("SDKVersion", zzaytVar.zzbrf);
        if (zzact.zzdbn.get().booleanValue()) {
            try {
                Bundle zza = zzdel.zza(this.context, new JSONArray(zzact.zzdbo.get()));
                for (String str3 : zza.keySet()) {
                    this.zzbqq.put(str3, zza.get(str3).toString());
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
            }
        }
    }
}
