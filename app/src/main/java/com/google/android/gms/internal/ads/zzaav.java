package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaav extends zzaaw<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaav(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ Boolean zza(Bundle bundle) {
        String valueOf = String.valueOf(getKey());
        if (bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            String valueOf2 = String.valueOf(getKey());
            return Boolean.valueOf(bundle.getBoolean(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
        }
        return zzsa();
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ void zza(SharedPreferences.Editor editor, Boolean bool) {
        editor.putBoolean(getKey(), bool.booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ Boolean zzb(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(getKey(), zzsa().booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ Boolean zza(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(getKey(), zzsa().booleanValue()));
    }
}
