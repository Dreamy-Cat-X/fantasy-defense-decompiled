package com.google.android.gms.internal.ads;

import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.Texture2D;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeod extends zzeoa {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r13[r14] > (-65)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        if (r13[r14] > (-65)) goto L50;
     */
    @Override // com.google.android.gms.internal.ads.zzeoa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(int i, byte[] bArr, int i2, int i3) {
        int zzn;
        int zzn2;
        byte b;
        int i4;
        int zzj;
        int zzaq;
        int zzaq2;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i4 = i2 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte b3 = (byte) ((i >> 8) ^ (-1));
                if (b3 == 0) {
                    int i5 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i5 >= i3) {
                        zzaq2 = zzenz.zzaq(b2, b4);
                        return zzaq2;
                    }
                    i2 = i5;
                    b3 = b4;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i4 = i2 + 1;
                }
                return -1;
            }
            byte b5 = (byte) ((i >> 8) ^ (-1));
            if (b5 == 0) {
                int i6 = i2 + 1;
                b5 = bArr[i2];
                if (i6 >= i3) {
                    zzaq = zzenz.zzaq(b2, b5);
                    return zzaq;
                }
                i2 = i6;
                b = 0;
            } else {
                b = (byte) (i >> 16);
            }
            if (b == 0) {
                int i7 = i2 + 1;
                byte b6 = bArr[i2];
                if (i7 >= i3) {
                    zzj = zzenz.zzj(b2, b5, b6);
                    return zzj;
                }
                i2 = i7;
                b = b6;
            }
            if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                i4 = i2 + 1;
            }
            return -1;
            i2 = i4;
        }
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i8 = i2 + 1;
            byte b7 = bArr[i2];
            if (b7 < 0) {
                if (b7 < -32) {
                    if (i8 >= i3) {
                        return b7;
                    }
                    if (b7 >= -62) {
                        i2 = i8 + 1;
                        if (bArr[i8] > -65) {
                        }
                    }
                    return -1;
                }
                if (b7 >= -16) {
                    if (i8 >= i3 - 2) {
                        zzn2 = zzenz.zzn(bArr, i8, i3);
                        return zzn2;
                    }
                    int i9 = i8 + 1;
                    byte b8 = bArr[i8];
                    if (b8 <= -65 && (((b7 << 28) + (b8 + 112)) >> 30) == 0) {
                        int i10 = i9 + 1;
                        if (bArr[i9] <= -65) {
                            i2 = i10 + 1;
                            if (bArr[i10] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i8 < i3 - 1) {
                    int i11 = i8 + 1;
                    byte b9 = bArr[i8];
                    if (b9 <= -65 && ((b7 != -32 || b9 >= -96) && (b7 != -19 || b9 < -96))) {
                        i8 = i11 + 1;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                zzn = zzenz.zzn(bArr, i8, i3);
                return zzn;
            }
            i2 = i8;
        }
        return 0;
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
            byte b = bArr[i];
            zze3 = zzeob.zze(b);
            if (!zze3) {
                break;
            }
            i++;
            zzeob.zza(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            zze = zzeob.zze(b2);
            if (zze) {
                int i7 = i5 + 1;
                zzeob.zza(b2, cArr, i5);
                while (i6 < i3) {
                    byte b3 = bArr[i6];
                    zze2 = zzeob.zze(b3);
                    if (!zze2) {
                        break;
                    }
                    i6++;
                    zzeob.zza(b3, cArr, i7);
                    i7++;
                }
                i = i6;
                i5 = i7;
            } else {
                zzf = zzeob.zzf(b2);
                if (!zzf) {
                    zzg = zzeob.zzg(b2);
                    if (zzg) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            zzeob.zza(b2, bArr[i6], bArr[i8], cArr, i5);
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
                        byte b4 = bArr[i6];
                        int i10 = i9 + 1;
                        zzeob.zza(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                        i = i10 + 1;
                        i5 = i5 + 1 + 1;
                    }
                } else if (i6 < i3) {
                    zzeob.zza(b2, bArr[i6], cArr, i5);
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
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.ads.zzeoa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 >= 128 || i8 >= i6) {
                if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & '?') | 128);
                } else {
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || i8 > i6 - 3) {
                        if (i8 <= i6 - 4) {
                            int i10 = i7 + 1;
                            if (i10 != charSequence.length()) {
                                char charAt3 = charSequence.charAt(i10);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    int i11 = i8 + 1;
                                    bArr[i8] = (byte) ((codePoint >>> 18) | GameRenderer.GAME_STAGE_CLEAR_HIGH_SCORE_COUNT);
                                    int i12 = i11 + 1;
                                    bArr[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i13 = i12 + 1;
                                    bArr[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 = i13 + 1;
                                    bArr[i13] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new zzeoc(i7 - 1, length);
                        }
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                            throw new zzeoc(i7, length);
                        }
                        StringBuilder sb = new StringBuilder(37);
                        sb.append("Failed writing ");
                        sb.append(charAt2);
                        sb.append(" at index ");
                        sb.append(i8);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                    int i14 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> '\f') | Texture2D.SCRHEIGHT_480);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i3 = i15 + 1;
                    bArr[i15] = (byte) ((charAt2 & '?') | 128);
                }
                i7++;
            } else {
                i3 = i8 + 1;
                bArr[i8] = (byte) charAt2;
            }
            i8 = i3;
            i7++;
        }
        return i8;
    }
}
