package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaay extends zzaaw<Integer> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaay(int i, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ Integer zza(Bundle bundle) {
        String valueOf = String.valueOf(getKey());
        if (bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            String valueOf2 = String.valueOf(getKey());
            return Integer.valueOf(bundle.getInt(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
        }
        return zzsa();
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ void zza(SharedPreferences.Editor editor, Integer num) {
        editor.putInt(getKey(), num.intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ Integer zzb(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(getKey(), zzsa().intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ Integer zza(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(getKey(), zzsa().intValue()));
    }
}
