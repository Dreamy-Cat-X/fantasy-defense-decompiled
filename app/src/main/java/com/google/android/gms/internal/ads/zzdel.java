package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdel implements zzdeu<zzder<Bundle>> {
    private final Context zzaaf;
    private final zzdzk zzgfs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdel(zzdzk zzdzkVar, Context context) {
        this.zzgfs = zzdzkVar;
        this.zzaaf = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzder<Bundle>> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdeo
            private final zzdel zzhbn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhbn = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhbn.zzatr();
            }
        });
    }

    public static Bundle zza(Context context, JSONArray jSONArray) {
        int i;
        Object obj;
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            if (optInt == 0) {
                i = zzdep.zzhbo;
            } else if (optInt == 1) {
                i = zzdep.zzhbp;
            } else {
                i = optInt != 2 ? 0 : zzdep.zzhbq;
            }
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i != 0) {
                String[] split = optString2.split("/");
                if (split.length > 2 || split.length == 0) {
                    obj = null;
                } else {
                    if (split.length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i3 = zzdeq.zzhbs[i - 1];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            if (obj instanceof Integer) {
                                bundle.putInt(optString, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                bundle.putLong(optString, ((Long) obj).longValue());
                            } else if (obj instanceof Float) {
                                bundle.putFloat(optString, ((Float) obj).floatValue());
                            }
                        } else if (i3 == 3 && (obj instanceof Boolean)) {
                            bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzder zzatr() throws Exception {
        String str = (String) zzwo.zzqq().zzd(zzabh.zzcwx);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            final Bundle zza = zza(this.zzaaf, new JSONArray(str));
            return new zzder(zza) { // from class: com.google.android.gms.internal.ads.zzden
                private final Bundle zzdzq;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdzq = zza;
                }

                @Override // com.google.android.gms.internal.ads.zzder
                public final void zzr(Object obj) {
                    ((Bundle) obj).putBundle("shared_pref", this.zzdzq);
                }
            };
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zzb("JSON parsing error", e);
            return null;
        }
    }
}
