package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public enum zzum implements zzekv {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);

    private static final zzeku<zzum> zzep = new zzeku<zzum>() { // from class: com.google.android.gms.internal.ads.zzup
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzekv
    public final int zzv() {
        return this.value;
    }

    public static zzum zzcd(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static zzekx zzw() {
        return zzuo.zzer;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzum(int i) {
        this.value = i;
    }
}
