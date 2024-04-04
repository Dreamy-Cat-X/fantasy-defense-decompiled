package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzchw {
    private final Executor executor;
    private final Map<String, Map<String, JSONObject>> zzgiw = new ConcurrentHashMap();
    private JSONObject zzgix;
    private boolean zzwi;

    public zzchw(Executor executor) {
        this.executor = executor;
    }

    public final void zzapz() {
        com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzb(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzchz
            private final zzchw zzgiy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgiy = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgiy.zzaqc();
            }
        });
        this.executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzchy
            private final zzchw zzgiy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgiy = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgiy.zzaqb();
            }
        });
    }

    @CheckForNull
    public final JSONObject zzq(String str, String str2) {
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcsz)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzwi) {
            zzaqd();
        }
        Map<String, JSONObject> map = this.zzgiw.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String zza = zzcid.zza(this.zzgix, str, str2);
        if (zza == null) {
            return null;
        }
        return map.get(zza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaqa, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzaqd() {
        Map<String, JSONObject> map;
        this.zzwi = true;
        zzaxt zzyl = com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyl();
        if (zzyl == null) {
            return;
        }
        JSONObject zzxz = zzyl.zzxz();
        if (zzxz == null) {
            return;
        }
        this.zzgix = zzxz.optJSONObject("ad_unit_patterns");
        JSONArray optJSONArray = zzxz.optJSONArray("ad_unit_id_settings");
        if (optJSONArray == null) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("ad_unit_id");
                String optString2 = optJSONObject.optString("format");
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                if (optString != null && optJSONObject2 != null && optString2 != null) {
                    if (this.zzgiw.containsKey(optString2)) {
                        map = this.zzgiw.get(optString2);
                    } else {
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        this.zzgiw.put(optString2, concurrentHashMap);
                        map = concurrentHashMap;
                    }
                    map.put(optString, optJSONObject2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaqc() {
        this.executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcib
            private final zzchw zzgiy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgiy = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgiy.zzaqd();
            }
        });
    }
}
