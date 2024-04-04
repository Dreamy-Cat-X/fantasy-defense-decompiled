package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public enum zzcs implements zzekv {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);

    private static final zzeku<zzcs> zzep = new zzeku<zzcs>() { // from class: com.google.android.gms.internal.ads.zzcr
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzekv
    public final int zzv() {
        return this.value;
    }

    public static zzcs zzo(int i) {
        if (i == 0) {
            return UNKNOWN_PROTO;
        }
        if (i == 1) {
            return AFMA_SIGNALS;
        }
        if (i == 2) {
            return UNITY_SIGNALS;
        }
        if (i != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
    }

    public static zzekx zzw() {
        return zzct.zzer;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzcs(int i) {
        this.value = i;
    }
}
