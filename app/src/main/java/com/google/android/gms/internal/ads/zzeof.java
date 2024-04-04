package com.google.android.gms.internal.ads;

import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.Texture2D;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeof extends zzeoa {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00fa, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (com.google.android.gms.internal.ads.zzenw.zza(r23, r8) > (-65)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (com.google.android.gms.internal.ads.zzenw.zza(r23, r8) > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0153, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.ads.zzeoa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(int i, byte[] bArr, int i2, int i3) {
        int i4;
        byte b;
        int zzj;
        int zzaq;
        long j;
        int zzaq2;
        if ((i2 | i3 | (bArr.length - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        long j2 = i2;
        long j3 = i3;
        if (i != 0) {
            if (j2 >= j3) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    j = j2 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte b3 = (byte) ((i >> 8) ^ (-1));
                if (b3 == 0) {
                    long j4 = j2 + 1;
                    b3 = zzenw.zza(bArr, j2);
                    if (j4 >= j3) {
                        zzaq2 = zzenz.zzaq(b2, b3);
                        return zzaq2;
                    }
                    j2 = j4;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    j = j2 + 1;
                }
                return -1;
            }
            byte b4 = (byte) ((i >> 8) ^ (-1));
            if (b4 == 0) {
                long j5 = j2 + 1;
                b4 = zzenw.zza(bArr, j2);
                if (j5 >= j3) {
                    zzaq = zzenz.zzaq(b2, b4);
                    return zzaq;
                }
                j2 = j5;
                b = 0;
            } else {
                b = (byte) (i >> 16);
            }
            if (b == 0) {
                long j6 = j2 + 1;
                b = zzenw.zza(bArr, j2);
                if (j6 >= j3) {
                    zzj = zzenz.zzj(b2, b4, b);
                    return zzj;
                }
                j2 = j6;
            }
            if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0 && b <= -65) {
                long j7 = j2 + 1;
                if (zzenw.zza(bArr, j2) <= -65) {
                    j2 = j7;
                }
            }
            return -1;
            j2 = j;
        }
        int i5 = (int) (j3 - j2);
        if (i5 >= 16) {
            long j8 = j2;
            i4 = 0;
            while (true) {
                if (i4 >= i5) {
                    i4 = i5;
                    break;
                }
                long j9 = j8 + 1;
                if (zzenw.zza(bArr, j8) < 0) {
                    break;
                }
                i4++;
                j8 = j9;
            }
        } else {
            i4 = 0;
        }
        int i6 = i5 - i4;
        long j10 = j2 + i4;
        while (true) {
            byte b5 = 0;
            while (true) {
                if (i6 <= 0) {
                    break;
                }
                long j11 = j10 + 1;
                byte zza = zzenw.zza(bArr, j10);
                if (zza < 0) {
                    j10 = j11;
                    b5 = zza;
                    break;
                }
                i6--;
                j10 = j11;
                b5 = zza;
            }
            if (i6 != 0) {
                int i7 = i6 - 1;
                if (b5 >= -32) {
                    if (b5 >= -16) {
                        if (i7 < 3) {
                            return zza(bArr, b5, j10, i7);
                        }
                        i6 = i7 - 3;
                        long j12 = j10 + 1;
                        byte zza2 = zzenw.zza(bArr, j10);
                        if (zza2 > -65 || (((b5 << 28) + (zza2 + 112)) >> 30) != 0) {
                            break;
                        }
                        long j13 = j12 + 1;
                        if (zzenw.zza(bArr, j12) > -65) {
                            break;
                        }
                        long j14 = j13 + 1;
                        if (zzenw.zza(bArr, j13) > -65) {
                            break;
                        }
                        j10 = j14;
                    } else {
                        if (i7 < 2) {
                            return zza(bArr, b5, j10, i7);
                        }
                        i6 = i7 - 2;
                        long j15 = j10 + 1;
                        byte zza3 = zzenw.zza(bArr, j10);
                        if (zza3 > -65 || ((b5 == -32 && zza3 < -96) || (b5 == -19 && zza3 >= -96))) {
                            break;
                        }
                        j10 = j15 + 1;
                        if (zzenw.zza(bArr, j15) > -65) {
                            break;
                        }
                    }
                } else if (i7 != 0) {
                    i6 = i7 - 1;
                    if (b5 < -62) {
                        break;
                    }
                    long j16 = j10 + 1;
                    if (zzenw.zza(bArr, j10) > -65) {
                        break;
                    }
                    j10 = j16;
                } else {
                    return b5;
                }
            } else {
                return 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeoa
    public final String zzo(byte[] bArr, int i, int i2) throws zzeld {
        boolean zze;
        boolean zze2;
        boolean zzf;
        boolean zzg;
        boolean zze3;
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte zza = zzenw.zza(bArr, i);
            zze3 = zzeob.zze(zza);
            if (!zze3) {
                break;
            }
            i++;
            zzeob.zza(zza, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte zza2 = zzenw.zza(bArr, i);
            zze = zzeob.zze(zza2);
            if (zze) {
                int i7 = i5 + 1;
                zzeob.zza(zza2, cArr, i5);
                while (i6 < i3) {
                    byte zza3 = zzenw.zza(bArr, i6);
                    zze2 = zzeob.zze(zza3);
                    if (!zze2) {
                        break;
                    }
                    i6++;
                    zzeob.zza(zza3, cArr, i7);
                    i7++;
                }
                i = i6;
                i5 = i7;
            } else {
                zzf = zzeob.zzf(zza2);
                if (!zzf) {
                    zzg = zzeob.zzg(zza2);
                    if (zzg) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            zzeob.zza(zza2, zzenw.zza(bArr, i6), zzenw.zza(bArr, i8), cArr, i5);
                            i = i8 + 1;
                            i5++;
                        } else {
                            throw zzeld.zzbjl();
                        }
                    } else {
                        if (i6 >= i3 - 2) {
                            throw zzeld.zzbjl();
                        }
                        int i9 = i6 + 1;
                        byte zza4 = zzenw.zza(bArr, i6);
                        int i10 = i9 + 1;
                        zzeob.zza(zza2, zza4, zzenw.zza(bArr, i9), zzenw.zza(bArr, i10), cArr, i5);
                        i = i10 + 1;
                        i5 = i5 + 1 + 1;
                    }
                } else if (i6 < i3) {
                    zzeob.zza(zza2, zzenw.zza(bArr, i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else {
                    throw zzeld.zzbjl();
                }
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeoa
    public final int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        int i3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            zzenw.zza(bArr, j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 >= c || j4 >= j5) {
                if (charAt3 < 2048 && j4 <= j5 - 2) {
                    long j6 = j4 + j;
                    zzenw.zza(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                    zzenw.zza(bArr, j6, (byte) ((charAt3 & '?') | 128));
                    j2 = j6 + j;
                    j3 = j;
                } else {
                    if ((charAt3 >= 55296 && 57343 >= charAt3) || j4 > j5 - 3) {
                        if (j4 <= j5 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt4 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    long j7 = j4 + 1;
                                    zzenw.zza(bArr, j4, (byte) ((codePoint >>> 18) | GameRenderer.GAME_STAGE_CLEAR_HIGH_SCORE_COUNT));
                                    long j8 = j7 + 1;
                                    zzenw.zza(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j9 = j8 + 1;
                                    zzenw.zza(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j3 = 1;
                                    j2 = j9 + 1;
                                    zzenw.zza(bArr, j9, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new zzeoc(i4 - 1, length);
                        }
                        if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                            throw new zzeoc(i4, length);
                        }
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(charAt3);
                        sb2.append(" at index ");
                        sb2.append(j4);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    long j10 = j4 + j;
                    zzenw.zza(bArr, j4, (byte) ((charAt3 >>> '\f') | Texture2D.SCRHEIGHT_480));
                    long j11 = j10 + j;
                    zzenw.zza(bArr, j10, (byte) (((charAt3 >>> 6) & 63) | 128));
                    zzenw.zza(bArr, j11, (byte) ((charAt3 & '?') | 128));
                    j2 = j11 + 1;
                    j3 = 1;
                }
                i4++;
                c = 128;
                long j12 = j3;
                j4 = j2;
                j = j12;
            } else {
                long j13 = j4 + j;
                zzenw.zza(bArr, j4, (byte) charAt3);
                j3 = j;
                j2 = j13;
            }
            i4++;
            c = 128;
            long j122 = j3;
            j4 = j2;
            j = j122;
        }
        return (int) j4;
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        int zzhw;
        int zzaq;
        int zzj;
        if (i2 == 0) {
            zzhw = zzenz.zzhw(i);
            return zzhw;
        }
        if (i2 == 1) {
            zzaq = zzenz.zzaq(i, zzenw.zza(bArr, j));
            return zzaq;
        }
        if (i2 == 2) {
            zzj = zzenz.zzj(i, zzenw.zza(bArr, j), zzenw.zza(bArr, j + 1));
            return zzj;
        }
        throw new AssertionError();
    }
}
