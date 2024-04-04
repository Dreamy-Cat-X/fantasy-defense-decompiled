package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeic {
    private static long zzg(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    private static long zzg(byte[] bArr, int i, int i2) {
        return (zzg(bArr, i) >> i2) & 67108863;
    }

    private static void zza(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zze(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long zzg = zzg(bArr, 0, 0) & 67108863;
        int i = 3;
        long zzg2 = zzg(bArr, 3, 2) & 67108611;
        long zzg3 = zzg(bArr, 6, 4) & 67092735;
        long zzg4 = zzg(bArr, 9, 6) & 66076671;
        long zzg5 = zzg(bArr, 12, 8) & 1048575;
        long j = zzg2 * 5;
        long j2 = zzg3 * 5;
        long j3 = zzg4 * 5;
        long j4 = zzg5 * 5;
        int i2 = 17;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i3 = 0;
        while (i3 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i2, (byte) 0);
            }
            long zzg6 = j9 + zzg(bArr3, 0, 0);
            long zzg7 = j5 + zzg(bArr3, i, 2);
            long zzg8 = j6 + zzg(bArr3, 6, 4);
            long zzg9 = j7 + zzg(bArr3, 9, 6);
            long zzg10 = j8 + (zzg(bArr3, 12, 8) | (bArr3[16] << 24));
            long j10 = (zzg6 * zzg) + (zzg7 * j4) + (zzg8 * j3) + (zzg9 * j2) + (zzg10 * j);
            long j11 = (zzg6 * zzg2) + (zzg7 * zzg) + (zzg8 * j4) + (zzg9 * j3) + (zzg10 * j2);
            long j12 = (zzg6 * zzg3) + (zzg7 * zzg2) + (zzg8 * zzg) + (zzg9 * j4) + (zzg10 * j3);
            long j13 = (zzg6 * zzg4) + (zzg7 * zzg3) + (zzg8 * zzg2) + (zzg9 * zzg) + (zzg10 * j4);
            long j14 = j11 + (j10 >> 26);
            long j15 = j12 + (j14 >> 26);
            long j16 = j13 + (j15 >> 26);
            long j17 = (zzg6 * zzg5) + (zzg7 * zzg4) + (zzg8 * zzg3) + (zzg9 * zzg2) + (zzg10 * zzg) + (j16 >> 26);
            long j18 = (j10 & 67108863) + ((j17 >> 26) * 5);
            j5 = (j14 & 67108863) + (j18 >> 26);
            i3 += 16;
            j6 = j15 & 67108863;
            j7 = j16 & 67108863;
            j8 = j17 & 67108863;
            i2 = 17;
            i = 3;
            j9 = j18 & 67108863;
        }
        long j19 = j6 + (j5 >> 26);
        long j20 = j19 & 67108863;
        long j21 = j7 + (j19 >> 26);
        long j22 = j21 & 67108863;
        long j23 = j8 + (j21 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j9 + ((j23 >> 26) * 5);
        long j26 = j25 & 67108863;
        long j27 = (j5 & 67108863) + (j25 >> 26);
        long j28 = j26 + 5;
        long j29 = j28 & 67108863;
        long j30 = (j28 >> 26) + j27;
        long j31 = j20 + (j30 >> 26);
        long j32 = j22 + (j31 >> 26);
        long j33 = j32 & 67108863;
        long j34 = (j24 + (j32 >> 26)) - 67108864;
        long j35 = j34 >> 63;
        long j36 = j26 & j35;
        long j37 = j27 & j35;
        long j38 = j20 & j35;
        long j39 = j22 & j35;
        long j40 = j24 & j35;
        long j41 = j35 ^ (-1);
        long j42 = (j30 & 67108863 & j41) | j37;
        long j43 = (j31 & 67108863 & j41) | j38;
        long j44 = (j33 & j41) | j39;
        long j45 = (j34 & j41) | j40;
        long j46 = ((j42 << 26) | j36 | (j29 & j41)) & 4294967295L;
        long j47 = ((j42 >> 6) | (j43 << 20)) & 4294967295L;
        long j48 = ((j43 >> 12) | (j44 << 14)) & 4294967295L;
        long zzg11 = j46 + zzg(bArr, 16);
        long zzg12 = j47 + zzg(bArr, 20) + (zzg11 >> 32);
        long zzg13 = j48 + zzg(bArr, 24) + (zzg12 >> 32);
        long zzg14 = ((((j44 >> 18) | (j45 << 8)) & 4294967295L) + zzg(bArr, 28) + (zzg13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        zza(bArr4, zzg11 & 4294967295L, 0);
        zza(bArr4, zzg12 & 4294967295L, 4);
        zza(bArr4, zzg13 & 4294967295L, 8);
        zza(bArr4, zzg14, 12);
        return bArr4;
    }
}
