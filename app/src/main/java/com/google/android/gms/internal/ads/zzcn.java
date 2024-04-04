package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public enum zzcn implements zzekv {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);

    private static final zzeku<zzcn> zzep = new zzeku<zzcn>() { // from class: com.google.android.gms.internal.ads.zzcq
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzekv
    public final int zzv() {
        return this.value;
    }

    public static zzcn zzn(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i == 2) {
            return ENUM_FAILURE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static zzekx zzw() {
        return zzcp.zzer;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzcn(int i) {
        this.value = i;
    }
}
