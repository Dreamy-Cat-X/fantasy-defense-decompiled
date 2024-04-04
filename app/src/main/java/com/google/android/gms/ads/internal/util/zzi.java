package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzacy;
import com.google.android.gms.internal.ads.zzaxt;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzdzl;
import com.google.android.gms.internal.ads.zzrl;
import com.google.android.gms.internal.ads.zzwo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzi implements zzf {
    private SharedPreferences zzclm;
    private boolean zzebx;
    private zzdzl<?> zzebz;
    private SharedPreferences.Editor zzecb;
    private String zzecd;
    private String zzece;
    private final Object lock = new Object();
    private final List<Runnable> zzeby = new ArrayList();
    private zzrl zzeca = null;
    private boolean zzecc = false;
    private boolean zzdsp = true;
    private boolean zzecf = true;
    private String zzdte = "";
    private long zzecg = 0;
    private long zzech = 0;
    private long zzeci = 0;
    private int zzecj = -1;
    private int zzeck = 0;
    private Set<String> zzecl = Collections.emptySet();
    private JSONObject zzecm = new JSONObject();
    private boolean zzdun = true;
    private boolean zzduy = true;
    private String zzecn = null;
    private int zzeco = -1;

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void initialize(Context context) {
        zza(context, (String) null, true);
    }

    public final void zza(final Context context, String str, boolean z) {
        final String concat;
        synchronized (this.lock) {
            if (this.zzclm != null) {
                return;
            }
            if (str == null) {
                concat = "admob";
            } else {
                String valueOf = String.valueOf(str);
                concat = valueOf.length() != 0 ? "admob__".concat(valueOf) : new String("admob__");
            }
            this.zzebz = zzayv.zzegi.submit(new Runnable(this, context, concat) { // from class: com.google.android.gms.ads.internal.util.zzh
                private final Context zzckg;
                private final String zzdkf;
                private final zzi zzebw;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzebw = this;
                    this.zzckg = context;
                    this.zzdkf = concat;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzebw.zzo(this.zzckg, this.zzdkf);
                }
            });
            this.zzebx = z;
        }
    }

    private final void zzyt() {
        zzdzl<?> zzdzlVar = this.zzebz;
        if (zzdzlVar == null || zzdzlVar.isDone()) {
            return;
        }
        try {
            this.zzebz.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            zzd.zzd("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            zzd.zzc("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            zzd.zzc("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            zzd.zzc("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void zzyu() {
        zzayv.zzegi.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzk
            private final zzi zzebw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzebw = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzebw.zzyf();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final zzrl zzyf() {
        if (!this.zzebx) {
            return null;
        }
        if ((zzyg() && zzyi()) || !zzacy.zzdcb.get().booleanValue()) {
            return null;
        }
        synchronized (this.lock) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.zzeca == null) {
                this.zzeca = new zzrl();
            }
            this.zzeca.zzmh();
            zzd.zzew("start fetching content...");
            return this.zzeca;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void zzao(boolean z) {
        zzyt();
        synchronized (this.lock) {
            if (this.zzdun == z) {
                return;
            }
            this.zzdun = z;
            if (this.zzecb != null) {
                this.zzecb.putBoolean("content_url_opted_out", z);
                this.zzecb.apply();
            }
            zzyu();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final boolean zzyg() {
        boolean z;
        zzyt();
        synchronized (this.lock) {
            z = this.zzdun;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void zzec(String str) {
        zzyt();
        synchronized (this.lock) {
            if (str != null) {
                if (!str.equals(this.zzecd)) {
                    this.zzecd = str;
                    if (this.zzecb != null) {
                        this.zzecb.putString("content_url_hashes", str);
                        this.zzecb.apply();
                    }
                    zzyu();
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final String zzyh() {
        String str;
        zzyt();
        synchronized (this.lock) {
            str = this.zzecd;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void zzap(boolean z) {
        zzyt();
        synchronized (this.lock) {
            if (this.zzduy == z) {
                return;
            }
            this.zzduy = z;
            if (this.zzecb != null) {
                this.zzecb.putBoolean("content_vertical_opted_out", z);
                this.zzecb.apply();
            }
            zzyu();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final boolean zzyi() {
        boolean z;
        zzyt();
        synchronized (this.lock) {
            z = this.zzduy;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void zzed(String str) {
        zzyt();
        synchronized (this.lock) {
            if (str != null) {
                if (!str.equals(this.zzece)) {
                    this.zzece = str;
                    if (this.zzecb != null) {
                        this.zzecb.putString("content_vertical_hashes", str);
                        this.zzecb.apply();
                    }
                    zzyu();
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final String zzyj() {
        String str;
        zzyt();
        synchronized (this.lock) {
            str = this.zzece;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void zzaq(boolean z) {
        zzyt();
        synchronized (this.lock) {
            if (z == this.zzecf) {
                return;
            }
            this.zzecf = z;
            if (this.zzecb != null) {
                this.zzecb.putBoolean("gad_idless", z);
                this.zzecb.apply();
            }
            zzyu();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final boolean zzys() {
        boolean z;
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcoa)).booleanValue()) {
            return false;
        }
        zzyt();
        synchronized (this.lock) {
            z = this.zzecf;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void zzde(int i) {
        zzyt();
        synchronized (this.lock) {
            if (this.zzeck == i) {
                return;
            }
            this.zzeck = i;
            if (this.zzecb != null) {
                this.zzecb.putInt("version_code", i);
                this.zzecb.apply();
            }
            zzyu();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final int zzyk() {
        int i;
        zzyt();
        synchronized (this.lock) {
            i = this.zzeck;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void zzee(String str) {
        zzyt();
        synchronized (this.lock) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis();
            this.zzecg = currentTimeMillis;
            if (str != null && !str.equals(this.zzdte)) {
                this.zzdte = str;
                if (this.zzecb != null) {
                    this.zzecb.putString("app_settings_json", str);
                    this.zzecb.putLong("app_settings_last_update_ms", currentTimeMillis);
                    this.zzecb.apply();
                }
                zzyu();
                Iterator<Runnable> it = this.zzeby.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final zzaxt zzyl() {
        zzaxt zzaxtVar;
        zzyt();
        synchronized (this.lock) {
            zzaxtVar = new zzaxt(this.zzdte, this.zzecg);
        }
        return zzaxtVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void zzb(Runnable runnable) {
        this.zzeby.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void zzez(long j) {
        zzyt();
        synchronized (this.lock) {
            if (this.zzech == j) {
                return;
            }
            this.zzech = j;
            if (this.zzecb != null) {
                this.zzecb.putLong("app_last_background_time_ms", j);
                this.zzecb.apply();
            }
            zzyu();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final long zzym() {
        long j;
        zzyt();
        synchronized (this.lock) {
            j = this.zzech;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void zzdf(int i) {
        zzyt();
        synchronized (this.lock) {
            if (this.zzecj == i) {
                return;
            }
            this.zzecj = i;
            if (this.zzecb != null) {
                this.zzecb.putInt("request_in_session_count", i);
                this.zzecb.apply();
            }
            zzyu();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final int zzyn() {
        int i;
        zzyt();
        synchronized (this.lock) {
            i = this.zzecj;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void zzfa(long j) {
        zzyt();
        synchronized (this.lock) {
            if (this.zzeci == j) {
                return;
            }
            this.zzeci = j;
            if (this.zzecb != null) {
                this.zzecb.putLong("first_ad_req_time_ms", j);
                this.zzecb.apply();
            }
            zzyu();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final long zzyo() {
        long j;
        zzyt();
        synchronized (this.lock) {
            j = this.zzeci;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void zza(String str, String str2, boolean z) {
        zzyt();
        synchronized (this.lock) {
            JSONArray optJSONArray = this.zzecm.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    } else {
                        length = i;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.zzecm.put(str, optJSONArray);
            } catch (JSONException e) {
                zzd.zzd("Could not update native advanced settings", e);
            }
            if (this.zzecb != null) {
                this.zzecb.putString("native_advanced_settings", this.zzecm.toString());
                this.zzecb.apply();
            }
            zzyu();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final JSONObject zzyp() {
        JSONObject jSONObject;
        zzyt();
        synchronized (this.lock) {
            jSONObject = this.zzecm;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void zzyq() {
        zzyt();
        synchronized (this.lock) {
            this.zzecm = new JSONObject();
            if (this.zzecb != null) {
                this.zzecb.remove("native_advanced_settings");
                this.zzecb.apply();
            }
            zzyu();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final String zzyr() {
        String str;
        zzyt();
        synchronized (this.lock) {
            str = this.zzecn;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzf
    public final void zzef(String str) {
        zzyt();
        synchronized (this.lock) {
            if (TextUtils.equals(this.zzecn, str)) {
                return;
            }
            this.zzecn = str;
            if (this.zzecb != null) {
                this.zzecb.putString("display_cutout", str);
                this.zzecb.apply();
            }
            zzyu();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.lock) {
            this.zzclm = sharedPreferences;
            this.zzecb = edit;
            if (PlatformVersion.isAtLeastM() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            this.zzecc = z;
            this.zzdsp = this.zzclm.getBoolean("use_https", this.zzdsp);
            this.zzdun = this.zzclm.getBoolean("content_url_opted_out", this.zzdun);
            this.zzecd = this.zzclm.getString("content_url_hashes", this.zzecd);
            this.zzecf = this.zzclm.getBoolean("gad_idless", this.zzecf);
            this.zzduy = this.zzclm.getBoolean("content_vertical_opted_out", this.zzduy);
            this.zzece = this.zzclm.getString("content_vertical_hashes", this.zzece);
            this.zzeck = this.zzclm.getInt("version_code", this.zzeck);
            this.zzdte = this.zzclm.getString("app_settings_json", this.zzdte);
            this.zzecg = this.zzclm.getLong("app_settings_last_update_ms", this.zzecg);
            this.zzech = this.zzclm.getLong("app_last_background_time_ms", this.zzech);
            this.zzecj = this.zzclm.getInt("request_in_session_count", this.zzecj);
            this.zzeci = this.zzclm.getLong("first_ad_req_time_ms", this.zzeci);
            this.zzecl = this.zzclm.getStringSet("never_pool_slots", this.zzecl);
            this.zzecn = this.zzclm.getString("display_cutout", this.zzecn);
            this.zzeco = this.zzclm.getInt("app_measurement_npa", this.zzeco);
            try {
                this.zzecm = new JSONObject(this.zzclm.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                zzd.zzd("Could not convert native advanced settings to json object", e);
            }
            zzyu();
        }
    }
}
