package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzhe {
    public static final int CHANNEL_OUT_7POINT1_SURROUND;
    public static final UUID UUID_NIL;
    private static final UUID zzaeh;
    private static final UUID zzaei;
    private static final UUID zzaej;

    public static long zzdo(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j / 1000;
    }

    public static long zzdp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j * 1000;
    }

    static {
        CHANNEL_OUT_7POINT1_SURROUND = zzps.SDK_INT < 23 ? PointerIconCompat.TYPE_GRAB : 6396;
        UUID_NIL = new UUID(0L, 0L);
        zzaeh = new UUID(1186680826959645954L, -5988876978535335093L);
        zzaei = new UUID(-1301668207276963122L, -6645017420763422227L);
        zzaej = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
