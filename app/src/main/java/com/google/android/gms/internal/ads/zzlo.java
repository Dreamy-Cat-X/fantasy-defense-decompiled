package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzlo {
    private static final int[] zzazz = {zzps.zzbh("isom"), zzps.zzbh("iso2"), zzps.zzbh("iso3"), zzps.zzbh("iso4"), zzps.zzbh("iso5"), zzps.zzbh("iso6"), zzps.zzbh("avc1"), zzps.zzbh("hvc1"), zzps.zzbh("hev1"), zzps.zzbh("mp41"), zzps.zzbh("mp42"), zzps.zzbh("3g2a"), zzps.zzbh("3g2b"), zzps.zzbh("3gr6"), zzps.zzbh("3gs6"), zzps.zzbh("3ge6"), zzps.zzbh("3gg6"), zzps.zzbh("M4V "), zzps.zzbh("M4A "), zzps.zzbh("f4v "), zzps.zzbh("kddi"), zzps.zzbh("M4VP"), zzps.zzbh("qt  "), zzps.zzbh("MSNV")};

    public static boolean zzd(zzjy zzjyVar) throws IOException, InterruptedException {
        return zza(zzjyVar, true);
    }

    public static boolean zze(zzjy zzjyVar) throws IOException, InterruptedException {
        return zza(zzjyVar, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zza(zzjy zzjyVar, boolean z) throws IOException, InterruptedException {
        boolean z2;
        boolean z3;
        long length = zzjyVar.getLength();
        if (length == -1 || length > 4096) {
            length = 4096;
        }
        int i = (int) length;
        zzpm zzpmVar = new zzpm(64);
        int i2 = 0;
        boolean z4 = false;
        while (i2 < i) {
            zzpmVar.reset(8);
            zzjyVar.zza(zzpmVar.data, 0, 8);
            long zzix = zzpmVar.zzix();
            int readInt = zzpmVar.readInt();
            int i3 = 16;
            if (zzix == 1) {
                zzjyVar.zza(zzpmVar.data, 8, 8);
                zzpmVar.zzbh(16);
                zzix = zzpmVar.zzjb();
            } else {
                i3 = 8;
            }
            long j = i3;
            if (zzix < j) {
                return false;
            }
            i2 += i3;
            if (readInt != zzkv.zzatv) {
                if (readInt == zzkv.zzaue || readInt == zzkv.zzaug) {
                    z2 = true;
                    break;
                }
                if ((i2 + zzix) - j >= i) {
                    break;
                }
                int i4 = (int) (zzix - j);
                i2 += i4;
                if (readInt == zzkv.zzasu) {
                    if (i4 < 8) {
                        return false;
                    }
                    zzpmVar.reset(i4);
                    zzjyVar.zza(zzpmVar.data, 0, i4);
                    int i5 = i4 / 4;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            break;
                        }
                        if (i6 == 1) {
                            zzpmVar.zzbj(4);
                        } else {
                            int readInt2 = zzpmVar.readInt();
                            if ((readInt2 >>> 8) != zzps.zzbh("3gp")) {
                                for (int i7 : zzazz) {
                                    if (i7 != readInt2) {
                                    }
                                }
                                z3 = false;
                                if (!z3) {
                                    z4 = true;
                                    break;
                                }
                            }
                            z3 = true;
                            if (!z3) {
                            }
                        }
                        i6++;
                    }
                    if (!z4) {
                        return false;
                    }
                } else if (i4 != 0) {
                    zzjyVar.zzah(i4);
                }
            }
        }
        z2 = false;
        return z4 && z == z2;
    }
}
