package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzejt extends zzejr {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzila;
    private int zzilb;
    private int zzilc;
    private int zzild;
    private int zzile;

    private zzejt(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzile = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzilc = i;
        this.zzila = z;
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final int zzbgv() throws IOException {
        if (zzbhl()) {
            this.zzild = 0;
            return 0;
        }
        int zzbhn = zzbhn();
        this.zzild = zzbhn;
        if ((zzbhn >>> 3) != 0) {
            return zzbhn;
        }
        throw zzeld.zzbjg();
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final void zzgd(int i) throws zzeld {
        if (this.zzild != i) {
            throw zzeld.zzbjh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final boolean zzge(int i) throws IOException {
        int zzbgv;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.limit - this.pos >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.buffer;
                    int i4 = this.pos;
                    this.pos = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzeld.zzbjf();
            }
            while (i3 < 10) {
                if (zzbhs() < 0) {
                    i3++;
                }
            }
            throw zzeld.zzbjf();
            return true;
        }
        if (i2 == 1) {
            zzgi(8);
            return true;
        }
        if (i2 == 2) {
            zzgi(zzbhn());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                zzgi(4);
                return true;
            }
            throw zzeld.zzbji();
        }
        do {
            zzbgv = zzbgv();
            if (zzbgv == 0) {
                break;
            }
        } while (zzge(zzbgv));
        zzgd(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzbhq());
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzbhp());
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final long zzbgw() throws IOException {
        return zzbho();
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final long zzbgx() throws IOException {
        return zzbho();
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final int zzbgy() throws IOException {
        return zzbhn();
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final long zzbgz() throws IOException {
        return zzbhq();
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final int zzbha() throws IOException {
        return zzbhp();
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final boolean zzbhb() throws IOException {
        return zzbho() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final String readString() throws IOException {
        int zzbhn = zzbhn();
        if (zzbhn > 0 && zzbhn <= this.limit - this.pos) {
            String str = new String(this.buffer, this.pos, zzbhn, zzeks.UTF_8);
            this.pos += zzbhn;
            return str;
        }
        if (zzbhn == 0) {
            return "";
        }
        if (zzbhn < 0) {
            throw zzeld.zzbje();
        }
        throw zzeld.zzbjd();
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final String zzbhc() throws IOException {
        int zzbhn = zzbhn();
        if (zzbhn > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzbhn <= i - i2) {
                String zzo = zzenz.zzo(this.buffer, i2, zzbhn);
                this.pos += zzbhn;
                return zzo;
            }
        }
        if (zzbhn == 0) {
            return "";
        }
        if (zzbhn <= 0) {
            throw zzeld.zzbje();
        }
        throw zzeld.zzbjd();
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final zzejg zzbhd() throws IOException {
        byte[] bArr;
        int zzbhn = zzbhn();
        if (zzbhn > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzbhn <= i - i2) {
                zzejg zzi = zzejg.zzi(this.buffer, i2, zzbhn);
                this.pos += zzbhn;
                return zzi;
            }
        }
        if (zzbhn == 0) {
            return zzejg.zzikj;
        }
        if (zzbhn > 0) {
            int i3 = this.limit;
            int i4 = this.pos;
            if (zzbhn <= i3 - i4) {
                int i5 = zzbhn + i4;
                this.pos = i5;
                bArr = Arrays.copyOfRange(this.buffer, i4, i5);
                return zzejg.zzu(bArr);
            }
        }
        if (zzbhn > 0) {
            throw zzeld.zzbjd();
        }
        if (zzbhn == 0) {
            bArr = zzeks.zzikp;
            return zzejg.zzu(bArr);
        }
        throw zzeld.zzbje();
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final int zzbhe() throws IOException {
        return zzbhn();
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final int zzbhf() throws IOException {
        return zzbhn();
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final int zzbhg() throws IOException {
        return zzbhp();
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final long zzbhh() throws IOException {
        return zzbhq();
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final int zzbhi() throws IOException {
        return zzgh(zzbhn());
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final long zzbhj() throws IOException {
        return zzfg(zzbho());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzbhn() throws IOException {
        int i;
        int i2 = this.pos;
        int i3 = this.limit;
        if (i3 != i2) {
            byte[] bArr = this.buffer;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.pos = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            i7 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i7 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.pos = i5;
                return i;
            }
        }
        return (int) zzbhk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long zzbho() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.pos;
        int i3 = this.limit;
        if (i3 != i2) {
            byte[] bArr = this.buffer;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.pos = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i5 = i7;
                        j4 = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            long j5 = i9;
                            int i10 = i5 + 1;
                            long j6 = j5 ^ (bArr[i5] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i5 = i10 + 1;
                                long j7 = j6 ^ (bArr[i10] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i10 = i5 + 1;
                                    j6 = j7 ^ (bArr[i5] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i5 = i10 + 1;
                                        j7 = j6 ^ (bArr[i10] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            int i11 = i5 + 1;
                                            j = (j7 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                            i5 = j < 0 ? i11 + 1 : i11;
                                            j4 = j;
                                        }
                                    }
                                }
                                j = j7 ^ j2;
                                j4 = j;
                            }
                            j4 = j3 ^ j6;
                            i5 = i10;
                        }
                    }
                    this.pos = i5;
                    return j4;
                }
                i = i6 ^ (-128);
                j4 = i;
                this.pos = i5;
                return j4;
            }
        }
        return zzbhk();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejr
    public final long zzbhk() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzbhs() & 128) == 0) {
                return j;
            }
        }
        throw zzeld.zzbjf();
    }

    private final int zzbhp() throws IOException {
        int i = this.pos;
        if (this.limit - i < 4) {
            throw zzeld.zzbjd();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzbhq() throws IOException {
        int i = this.pos;
        if (this.limit - i < 8) {
            throw zzeld.zzbjd();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final int zzgf(int i) throws zzeld {
        if (i < 0) {
            throw zzeld.zzbje();
        }
        int zzbhm = i + zzbhm();
        int i2 = this.zzile;
        if (zzbhm > i2) {
            throw zzeld.zzbjd();
        }
        this.zzile = zzbhm;
        zzbhr();
        return i2;
    }

    private final void zzbhr() {
        int i = this.limit + this.zzilb;
        this.limit = i;
        int i2 = i - this.zzilc;
        int i3 = this.zzile;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzilb = i4;
            this.limit = i - i4;
            return;
        }
        this.zzilb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final void zzgg(int i) {
        this.zzile = i;
        zzbhr();
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final boolean zzbhl() throws IOException {
        return this.pos == this.limit;
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final int zzbhm() {
        return this.pos - this.zzilc;
    }

    private final byte zzbhs() throws IOException {
        int i = this.pos;
        if (i == this.limit) {
            throw zzeld.zzbjd();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 1;
        return bArr[i];
    }

    private final void zzgi(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzeld.zzbje();
        }
        throw zzeld.zzbjd();
    }
}
