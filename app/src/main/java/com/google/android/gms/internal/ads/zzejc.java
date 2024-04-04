package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzejc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzejb zzejbVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzejbVar.zzikc = b;
            return i2;
        }
        return zza(b, bArr, i2, zzejbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, zzejb zzejbVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzejbVar.zzikc = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzejbVar.zzikc = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzejbVar.zzikc = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzejbVar.zzikc = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzejbVar.zzikc = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i, zzejb zzejbVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzejbVar.zzikd = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzejbVar.zzikd = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzi(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzj(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzi(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzk(byte[] bArr, int i) {
        return Float.intBitsToFloat(zzh(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i, zzejb zzejbVar) throws zzeld {
        int zza = zza(bArr, i, zzejbVar);
        int i2 = zzejbVar.zzikc;
        if (i2 < 0) {
            throw zzeld.zzbje();
        }
        if (i2 == 0) {
            zzejbVar.zzike = "";
            return zza;
        }
        zzejbVar.zzike = new String(bArr, zza, i2, zzeks.UTF_8);
        return zza + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(byte[] bArr, int i, zzejb zzejbVar) throws zzeld {
        int zza = zza(bArr, i, zzejbVar);
        int i2 = zzejbVar.zzikc;
        if (i2 < 0) {
            throw zzeld.zzbje();
        }
        if (i2 == 0) {
            zzejbVar.zzike = "";
            return zza;
        }
        zzejbVar.zzike = zzenz.zzo(bArr, zza, i2);
        return zza + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(byte[] bArr, int i, zzejb zzejbVar) throws zzeld {
        int zza = zza(bArr, i, zzejbVar);
        int i2 = zzejbVar.zzikc;
        if (i2 < 0) {
            throw zzeld.zzbje();
        }
        if (i2 > bArr.length - zza) {
            throw zzeld.zzbjd();
        }
        if (i2 == 0) {
            zzejbVar.zzike = zzejg.zzikj;
            return zza;
        }
        zzejbVar.zzike = zzejg.zzi(bArr, zza, i2);
        return zza + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzemy zzemyVar, byte[] bArr, int i, int i2, zzejb zzejbVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zza(i4, bArr, i3, zzejbVar);
            i4 = zzejbVar.zzikc;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzeld.zzbjd();
        }
        Object newInstance = zzemyVar.newInstance();
        int i6 = i4 + i5;
        zzemyVar.zza(newInstance, bArr, i5, i6, zzejbVar);
        zzemyVar.zzak(newInstance);
        zzejbVar.zzike = newInstance;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzemy zzemyVar, byte[] bArr, int i, int i2, int i3, zzejb zzejbVar) throws IOException {
        zzemh zzemhVar = (zzemh) zzemyVar;
        Object newInstance = zzemhVar.newInstance();
        int zza = zzemhVar.zza((zzemh) newInstance, bArr, i, i2, i3, zzejbVar);
        zzemhVar.zzak(newInstance);
        zzejbVar.zzike = newInstance;
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzela<?> zzelaVar, zzejb zzejbVar) {
        zzekt zzektVar = (zzekt) zzelaVar;
        int zza = zza(bArr, i2, zzejbVar);
        zzektVar.zzhh(zzejbVar.zzikc);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzejbVar);
            if (i != zzejbVar.zzikc) {
                break;
            }
            zza = zza(bArr, zza2, zzejbVar);
            zzektVar.zzhh(zzejbVar.zzikc);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzela<?> zzelaVar, zzejb zzejbVar) throws IOException {
        zzekt zzektVar = (zzekt) zzelaVar;
        int zza = zza(bArr, i, zzejbVar);
        int i2 = zzejbVar.zzikc + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzejbVar);
            zzektVar.zzhh(zzejbVar.zzikc);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzeld.zzbjd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzemy<?> zzemyVar, int i, byte[] bArr, int i2, int i3, zzela<?> zzelaVar, zzejb zzejbVar) throws IOException {
        int zza = zza(zzemyVar, bArr, i2, i3, zzejbVar);
        zzelaVar.add(zzejbVar.zzike);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzejbVar);
            if (i != zzejbVar.zzikc) {
                break;
            }
            zza = zza(zzemyVar, bArr, zza2, i3, zzejbVar);
            zzelaVar.add(zzejbVar.zzike);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzent zzentVar, zzejb zzejbVar) throws zzeld {
        if ((i >>> 3) == 0) {
            throw zzeld.zzbjg();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzb = zzb(bArr, i2, zzejbVar);
            zzentVar.zzd(i, Long.valueOf(zzejbVar.zzikd));
            return zzb;
        }
        if (i4 == 1) {
            zzentVar.zzd(i, Long.valueOf(zzi(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zza = zza(bArr, i2, zzejbVar);
            int i5 = zzejbVar.zzikc;
            if (i5 < 0) {
                throw zzeld.zzbje();
            }
            if (i5 > bArr.length - zza) {
                throw zzeld.zzbjd();
            }
            if (i5 == 0) {
                zzentVar.zzd(i, zzejg.zzikj);
            } else {
                zzentVar.zzd(i, zzejg.zzi(bArr, zza, i5));
            }
            return zza + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzentVar.zzd(i, Integer.valueOf(zzh(bArr, i2)));
                return i2 + 4;
            }
            throw zzeld.zzbjg();
        }
        zzent zzbld = zzent.zzbld();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zza2 = zza(bArr, i2, zzejbVar);
            int i8 = zzejbVar.zzikc;
            i7 = i8;
            if (i8 == i6) {
                i2 = zza2;
                break;
            }
            int zza3 = zza(i7, bArr, zza2, i3, zzbld, zzejbVar);
            i7 = i8;
            i2 = zza3;
        }
        if (i2 > i3 || i7 != i6) {
            throw zzeld.zzbjk();
        }
        zzentVar.zzd(i, zzbld);
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzejb zzejbVar) throws zzeld {
        if ((i >>> 3) == 0) {
            throw zzeld.zzbjg();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzb(bArr, i2, zzejbVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zza(bArr, i2, zzejbVar) + zzejbVar.zzikc;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw zzeld.zzbjg();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zza(bArr, i2, zzejbVar);
            i6 = zzejbVar.zzikc;
            if (i6 == i5) {
                break;
            }
            i2 = zza(i6, bArr, i2, i3, zzejbVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzeld.zzbjk();
        }
        return i2;
    }
}
