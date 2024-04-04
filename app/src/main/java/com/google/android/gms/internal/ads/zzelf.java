package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public enum zzelf {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzejg.class, zzejg.class, zzejg.zzikj),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);

    private final Class<?> zziqa;
    private final Class<?> zziqb;
    private final Object zziqc;

    zzelf(Class cls, Class cls2, Object obj) {
        this.zziqa = cls;
        this.zziqb = cls2;
        this.zziqc = obj;
    }

    public final Class<?> zzbjn() {
        return this.zziqb;
    }
}
