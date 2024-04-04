package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdwa {
    public static void checkArgument(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @NonNullDecl
    public static <T> T zza(@NonNullDecl T t, @NullableDecl String str, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(zzdwi.zzb(str, obj));
    }

    public static int zzt(int i, int i2) {
        String zzb;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            zzb = zzdwi.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            zzb = zzdwi.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(zzb);
    }

    public static int zzu(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzc(i, i2, "index"));
        }
        return i;
    }

    public static int zzb(int i, int i2, @NullableDecl String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzc(i, i2, str));
        }
        return i;
    }

    private static String zzc(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return zzdwi.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzdwi.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void zzf(int i, int i2, int i3) {
        String zzc;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                zzc = zzc(i, i3, "start index");
            } else {
                zzc = (i2 < 0 || i2 > i3) ? zzc(i2, i3, "end index") : zzdwi.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(zzc);
        }
    }
}
