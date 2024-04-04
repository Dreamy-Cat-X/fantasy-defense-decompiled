package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public enum zzeft implements zzekv {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    private static final zzeku<zzeft> zzep = new zzeku<zzeft>() { // from class: com.google.android.gms.internal.ads.zzefw
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzekv
    public final int zzv() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    public static zzeft zzfk(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zzv());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    zzeft(int i) {
        this.value = i;
    }
}
