package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzaaw<T> {
    private final String zzck;
    private final int zzcle;
    private final T zzclf;

    private zzaaw(int i, String str, T t) {
        this.zzcle = i;
        this.zzck = str;
        this.zzclf = t;
        zzwo.zzqp().zza(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T zza(SharedPreferences sharedPreferences);

    public abstract T zza(Bundle bundle);

    public abstract void zza(SharedPreferences.Editor editor, T t);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T zzb(JSONObject jSONObject);

    public final String getKey() {
        return this.zzck;
    }

    public final T zzsa() {
        return this.zzclf;
    }

    public static zzaaw<Boolean> zza(int i, String str, Boolean bool) {
        return new zzaav(i, str, bool);
    }

    public static zzaaw<Integer> zza(int i, String str, int i2) {
        return new zzaay(1, str, Integer.valueOf(i2));
    }

    public static zzaaw<Long> zzb(int i, String str, long j) {
        return new zzaax(1, str, Long.valueOf(j));
    }

    public static zzaaw<Float> zza(int i, String str, float f) {
        return new zzaba(1, str, Float.valueOf(0.0f));
    }

    public static zzaaw<String> zza(int i, String str, String str2) {
        return new zzaaz(1, str, str2);
    }

    public static zzaaw<String> zzb(int i, String str) {
        zzaaw<String> zza = zza(1, str, (String) null);
        zzwo.zzqp().zzc(zza);
        return zza;
    }

    public final int getSource() {
        return this.zzcle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaaw(int i, String str, Object obj, zzaav zzaavVar) {
        this(i, str, obj);
    }
}
