package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzatg extends zzati {
    private final Object lock = new Object();
    private final Context zzaaf;
    private SharedPreferences zzdxc;
    private final zzalq<JSONObject, JSONObject> zzdxd;

    public zzatg(Context context, zzalq<JSONObject, JSONObject> zzalqVar) {
        this.zzaaf = context.getApplicationContext();
        this.zzdxd = zzalqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzati
    public final zzdzl<Void> zzwr() {
        synchronized (this.lock) {
            if (this.zzdxc == null) {
                this.zzdxc = this.zzaaf.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis() - this.zzdxc.getLong("js_last_update", 0L) < zzade.zzddc.get().longValue()) {
            return zzdyz.zzag(null);
        }
        return zzdyz.zzb(this.zzdxd.zzh(zzw(this.zzaaf)), new zzdvo(this) { // from class: com.google.android.gms.internal.ads.zzatj
            private final zzatg zzdxg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdxg = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj) {
                return this.zzdxg.zzf((JSONObject) obj);
            }
        }, zzayv.zzegn);
    }

    public static JSONObject zzw(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzayt.zzzz().zzbrf);
            jSONObject.put("mf", zzade.zzddb.get());
            jSONObject.put("cl", "341976203");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zzf(JSONObject jSONObject) {
        zzabh.zza(this.zzaaf, 1, jSONObject);
        this.zzdxc.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis()).apply();
        return null;
    }
}
