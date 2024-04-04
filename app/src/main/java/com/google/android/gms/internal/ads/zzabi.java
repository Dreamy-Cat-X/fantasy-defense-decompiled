package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzabi implements zzadp {
    private final /* synthetic */ zzabd zzczp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabi(zzabd zzabdVar) {
        this.zzczp = zzabdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final Boolean zzf(String str, boolean z) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zzczp.zzclm;
        return Boolean.valueOf(sharedPreferences.getBoolean(str, z));
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final Long getLong(String str, long j) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zzczp.zzclm;
            return Long.valueOf(sharedPreferences2.getLong(str, j));
        } catch (ClassCastException unused) {
            sharedPreferences = this.zzczp.zzclm;
            return Long.valueOf(sharedPreferences.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final Double zza(String str, double d) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zzczp.zzclm;
        return Double.valueOf(sharedPreferences.getFloat(str, (float) d));
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final String get(String str, String str2) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zzczp.zzclm;
        return sharedPreferences.getString(str, str2);
    }
}
