package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaj<T> {
    public final T result;
    public final zzn zzbq;
    public final zzao zzbr;
    public boolean zzbs;

    public static <T> zzaj<T> zza(T t, zzn zznVar) {
        return new zzaj<>(t, zznVar);
    }

    public static <T> zzaj<T> zzd(zzao zzaoVar) {
        return new zzaj<>(zzaoVar);
    }

    public final boolean isSuccess() {
        return this.zzbr == null;
    }

    private zzaj(T t, zzn zznVar) {
        this.zzbs = false;
        this.result = t;
        this.zzbq = zznVar;
        this.zzbr = null;
    }

    private zzaj(zzao zzaoVar) {
        this.zzbs = false;
        this.result = null;
        this.zzbq = null;
        this.zzbr = zzaoVar;
    }
}
