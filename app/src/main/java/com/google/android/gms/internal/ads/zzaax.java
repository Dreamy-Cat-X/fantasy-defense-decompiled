package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaax extends zzaaw<Long> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaax(int i, String str, Long l) {
        super(1, str, l, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ Long zza(Bundle bundle) {
        String valueOf = String.valueOf(getKey());
        if (bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            String valueOf2 = String.valueOf(getKey());
            return Long.valueOf(bundle.getLong(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
        }
        return zzsa();
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ void zza(SharedPreferences.Editor editor, Long l) {
        editor.putLong(getKey(), l.longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ Long zzb(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(getKey(), zzsa().longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final /* synthetic */ Long zza(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(getKey(), zzsa().longValue()));
    }
}
