package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaaz extends zzaaw<String> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaaz(int i, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ String zza(Bundle bundle) {
        String valueOf = String.valueOf(getKey());
        if (bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            String valueOf2 = String.valueOf(getKey());
            return bundle.getString(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag."));
        }
        return zzsa();
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ void zza(SharedPreferences.Editor editor, String str) {
        editor.putString(getKey(), str);
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ String zzb(JSONObject jSONObject) {
        return jSONObject.optString(getKey(), zzsa());
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ String zza(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(getKey(), zzsa());
    }
}
