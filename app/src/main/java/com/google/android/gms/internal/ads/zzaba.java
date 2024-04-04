package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaba extends zzaaw<Float> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaba(int i, String str, Float f) {
        super(1, str, f, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ Float zza(Bundle bundle) {
        String valueOf = String.valueOf(getKey());
        if (bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            String valueOf2 = String.valueOf(getKey());
            return Float.valueOf(bundle.getFloat(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
        }
        return zzsa();
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ void zza(SharedPreferences.Editor editor, Float f) {
        editor.putFloat(getKey(), f.floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ Float zzb(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(getKey(), zzsa().floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ Float zza(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(getKey(), zzsa().floatValue()));
    }
}
