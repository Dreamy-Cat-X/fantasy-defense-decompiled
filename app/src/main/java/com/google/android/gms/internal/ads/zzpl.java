package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzpl {
    public static final byte[] zzbjq = {0, 0, 0, 1};
    private static final float[] zzbkc = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzbkd = new Object();
    private static int[] zzbke = new int[10];

    public static int zzb(byte[] bArr, int i) {
        int i2;
        synchronized (zzbkd) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                        break;
                    }
                    i3++;
                }
                if (i3 < i) {
                    if (zzbke.length <= i4) {
                        zzbke = Arrays.copyOf(zzbke, zzbke.length << 1);
                    }
                    zzbke[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = zzbke[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    public static void zzp(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                int i4 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean zza(String str, byte b) {
        return ("video/avc".equals(str) && (b & 31) == 6) || ("video/hevc".equals(str) && ((b & 126) >> 1) == 39);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzpk zzd(byte[] bArr, int i, int i2) {
        int zzje;
        boolean z;
        int i3;
        boolean z2;
        boolean zzjd;
        float f;
        int zzbl;
        int i4;
        zzpp zzppVar = new zzpp(bArr, i, i2);
        zzppVar.zzbm(8);
        int zzbl2 = zzppVar.zzbl(8);
        zzppVar.zzbm(16);
        int zzje2 = zzppVar.zzje();
        if (zzbl2 == 100 || zzbl2 == 110 || zzbl2 == 122 || zzbl2 == 244 || zzbl2 == 44 || zzbl2 == 83 || zzbl2 == 86 || zzbl2 == 118 || zzbl2 == 128 || zzbl2 == 138) {
            zzje = zzppVar.zzje();
            boolean zzjd2 = zzje == 3 ? zzppVar.zzjd() : false;
            zzppVar.zzje();
            zzppVar.zzje();
            zzppVar.zzbm(1);
            if (zzppVar.zzjd()) {
                int i5 = zzje != 3 ? 8 : 12;
                int i6 = 0;
                while (i6 < i5) {
                    if (zzppVar.zzjd()) {
                        int i7 = i6 < 6 ? 16 : 64;
                        int i8 = 8;
                        int i9 = 8;
                        for (int i10 = 0; i10 < i7; i10++) {
                            if (i8 != 0) {
                                i8 = ((zzppVar.zzjf() + i9) + 256) % 256;
                            }
                            if (i8 != 0) {
                                i9 = i8;
                            }
                        }
                    }
                    i6++;
                }
            }
            z = zzjd2;
        } else {
            zzje = 1;
            z = false;
        }
        int zzje3 = zzppVar.zzje() + 4;
        int zzje4 = zzppVar.zzje();
        if (zzje4 == 0) {
            i3 = zzppVar.zzje() + 4;
        } else {
            if (zzje4 == 1) {
                boolean zzjd3 = zzppVar.zzjd();
                zzppVar.zzjf();
                zzppVar.zzjf();
                long zzje5 = zzppVar.zzje();
                for (int i11 = 0; i11 < zzje5; i11++) {
                    zzppVar.zzje();
                }
                z2 = zzjd3;
                i3 = 0;
                zzppVar.zzje();
                zzppVar.zzbm(1);
                int zzje6 = zzppVar.zzje() + 1;
                int zzje7 = zzppVar.zzje() + 1;
                zzjd = zzppVar.zzjd();
                int i12 = (2 - (zzjd ? 1 : 0)) * zzje7;
                if (!zzjd) {
                    zzppVar.zzbm(1);
                }
                zzppVar.zzbm(1);
                int i13 = zzje6 << 4;
                int i14 = i12 << 4;
                if (zzppVar.zzjd()) {
                    int zzje8 = zzppVar.zzje();
                    int zzje9 = zzppVar.zzje();
                    int zzje10 = zzppVar.zzje();
                    int zzje11 = zzppVar.zzje();
                    if (zzje == 0) {
                        i4 = 2 - (zzjd ? 1 : 0);
                    } else {
                        int i15 = zzje == 3 ? 1 : 2;
                        i4 = (2 - (zzjd ? 1 : 0)) * (zzje == 1 ? 2 : 1);
                        r7 = i15;
                    }
                    i13 -= (zzje8 + zzje9) * r7;
                    i14 -= (zzje10 + zzje11) * i4;
                }
                int i16 = i13;
                int i17 = i14;
                float f2 = 1.0f;
                if (zzppVar.zzjd() && zzppVar.zzjd()) {
                    zzbl = zzppVar.zzbl(8);
                    if (zzbl != 255) {
                        int zzbl3 = zzppVar.zzbl(16);
                        int zzbl4 = zzppVar.zzbl(16);
                        if (zzbl3 != 0 && zzbl4 != 0) {
                            f2 = zzbl3 / zzbl4;
                        }
                        f = f2;
                    } else {
                        float[] fArr = zzbkc;
                        if (zzbl < fArr.length) {
                            f = fArr[zzbl];
                        } else {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append("Unexpected aspect_ratio_idc value: ");
                            sb.append(zzbl);
                            Log.w("NalUnitUtil", sb.toString());
                        }
                    }
                    return new zzpk(zzje2, i16, i17, f, z, zzjd, zzje3, zzje4, i3, z2);
                }
                f = 1.0f;
                return new zzpk(zzje2, i16, i17, f, z, zzjd, zzje3, zzje4, i3, z2);
            }
            i3 = 0;
        }
        z2 = false;
        zzppVar.zzje();
        zzppVar.zzbm(1);
        int zzje62 = zzppVar.zzje() + 1;
        int zzje72 = zzppVar.zzje() + 1;
        zzjd = zzppVar.zzjd();
        int i122 = (2 - (zzjd ? 1 : 0)) * zzje72;
        if (!zzjd) {
        }
        zzppVar.zzbm(1);
        int i132 = zzje62 << 4;
        int i142 = i122 << 4;
        if (zzppVar.zzjd()) {
        }
        int i162 = i132;
        int i172 = i142;
        float f22 = 1.0f;
        if (zzppVar.zzjd()) {
            zzbl = zzppVar.zzbl(8);
            if (zzbl != 255) {
            }
            return new zzpk(zzje2, i162, i172, f, z, zzjd, zzje3, zzje4, i3, z2);
        }
        f = 1.0f;
        return new zzpk(zzje2, i162, i172, f, z, zzjd, zzje3, zzje4, i3, z2);
    }
}
