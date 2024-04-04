package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzept<T> implements zzepk<T>, zzepq<T> {
    private static final zzept<Object> zzjal = new zzept<>(null);
    private final T zzeey;

    public static <T> zzepq<T> zzbb(T t) {
        return new zzept(zzepw.zza(t, "instance cannot be null"));
    }

    public static <T> zzepq<T> zzbc(T t) {
        if (t == null) {
            return zzjal;
        }
        return new zzept(t);
    }

    private zzept(T t) {
        this.zzeey = t;
    }

    @Override // com.google.android.gms.internal.ads.zzepk, com.google.android.gms.internal.ads.zzeqd
    public final T get() {
        return this.zzeey;
    }
}
