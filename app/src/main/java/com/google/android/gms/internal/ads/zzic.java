package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzic {
    public static final zzic zzaid = new zzib();

    public abstract zzid zza(int i, zzid zzidVar, boolean z, long j);

    public abstract zzie zza(int i, zzie zzieVar, boolean z);

    public abstract int zzc(Object obj);

    public abstract int zzff();

    public abstract int zzfg();

    public final boolean isEmpty() {
        return zzff() == 0;
    }

    public final zzid zza(int i, zzid zzidVar, boolean z) {
        return zza(i, zzidVar, false, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if ((zzff() - 1) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(int i, zzie zzieVar, zzid zzidVar, int i2) {
        zza(i, zzieVar, false);
        zza(0, zzidVar, false);
        int i3 = 1;
        if (i != 0) {
            return i + 1;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
            }
            i3 = 0;
        } else if (zzff() - 1 == 0) {
            i3 = -1;
        }
        if (i3 == -1) {
            return -1;
        }
        zza(i3, zzidVar, false);
        return 0;
    }
}
