package com.google.android.gms.internal.ads;

import androidx.room.RoomDatabase;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public enum zzgq implements zzekv {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    UNKNOWN(RoomDatabase.MAX_BIND_PARAMETER_CNT);

    private static final zzeku<zzgq> zzep = new zzeku<zzgq>() { // from class: com.google.android.gms.internal.ads.zzgp
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzekv
    public final int zzv() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzgq(int i) {
        this.value = i;
    }
}
