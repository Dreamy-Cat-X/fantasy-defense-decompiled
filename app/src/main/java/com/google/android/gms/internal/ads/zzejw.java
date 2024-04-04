package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzejw extends zzejr {
    private final byte[] buffer;
    private int pos;
    private int zzake;
    private int zzilb;
    private int zzild;
    private int zzile;
    private final InputStream zzilf;
    private int zzilg;
    private zzejv zzilh;

    private zzejw(InputStream inputStream, int i) {
        super();
        this.zzile = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.zzilh = null;
        zzeks.zza(inputStream, "input");
        this.zzilf = inputStream;
        this.buffer = new byte[4096];
        this.zzake = 0;
        this.pos = 0;
        this.zzilg = 0;
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
            if (this.zzake - this.pos >= 10) {
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
        if (zzbhn > 0 && zzbhn <= this.zzake - this.pos) {
            String str = new String(this.buffer, this.pos, zzbhn, zzeks.UTF_8);
            this.pos += zzbhn;
            return str;
        }
        if (zzbhn == 0) {
            return "";
        }
        if (zzbhn <= this.zzake) {
            zzgj(zzbhn);
            String str2 = new String(this.buffer, this.pos, zzbhn, zzeks.UTF_8);
            this.pos += zzbhn;
            return str2;
        }
        return new String(zzg(zzbhn, false), zzeks.UTF_8);
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final String zzbhc() throws IOException {
        byte[] zzg;
        int zzbhn = zzbhn();
        int i = this.pos;
        if (zzbhn <= this.zzake - i && zzbhn > 0) {
            zzg = this.buffer;
            this.pos = i + zzbhn;
        } else {
            if (zzbhn == 0) {
                return "";
            }
            if (zzbhn <= this.zzake) {
                zzgj(zzbhn);
                zzg = this.buffer;
                this.pos = zzbhn;
            } else {
                zzg = zzg(zzbhn, false);
            }
            i = 0;
        }
        return zzenz.zzo(zzg, i, zzbhn);
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final zzejg zzbhd() throws IOException {
        int zzbhn = zzbhn();
        int i = this.zzake;
        int i2 = this.pos;
        if (zzbhn <= i - i2 && zzbhn > 0) {
            zzejg zzi = zzejg.zzi(this.buffer, i2, zzbhn);
            this.pos += zzbhn;
            return zzi;
        }
        if (zzbhn == 0) {
            return zzejg.zzikj;
        }
        byte[] zzgl = zzgl(zzbhn);
        if (zzgl != null) {
            return zzejg.zzt(zzgl);
        }
        int i3 = this.pos;
        int i4 = this.zzake;
        int i5 = i4 - i3;
        this.zzilg += i4;
        this.pos = 0;
        this.zzake = 0;
        List<byte[]> zzgm = zzgm(zzbhn - i5);
        byte[] bArr = new byte[zzbhn];
        System.arraycopy(this.buffer, i3, bArr, 0, i5);
        for (byte[] bArr2 : zzgm) {
            System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
            i5 += bArr2.length;
        }
        return zzejg.zzu(bArr);
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
        int i3 = this.zzake;
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
        int i3 = this.zzake;
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
        if (this.zzake - i < 4) {
            zzgj(4);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzbhq() throws IOException {
        int i = this.pos;
        if (this.zzake - i < 8) {
            zzgj(8);
            i = this.pos;
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
        int i2 = i + this.zzilg + this.pos;
        int i3 = this.zzile;
        if (i2 > i3) {
            throw zzeld.zzbjd();
        }
        this.zzile = i2;
        zzbhr();
        return i3;
    }

    private final void zzbhr() {
        int i = this.zzake + this.zzilb;
        this.zzake = i;
        int i2 = this.zzilg + i;
        int i3 = this.zzile;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzilb = i4;
            this.zzake = i - i4;
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
        return this.pos == this.zzake && !zzgk(1);
    }

    @Override // com.google.android.gms.internal.ads.zzejr
    public final int zzbhm() {
        return this.zzilg + this.pos;
    }

    private final void zzgj(int i) throws IOException {
        if (zzgk(i)) {
            return;
        }
        if (i > (this.zzikx - this.zzilg) - this.pos) {
            throw zzeld.zzbjj();
        }
        throw zzeld.zzbjd();
    }

    private final boolean zzgk(int i) throws IOException {
        while (this.pos + i > this.zzake) {
            int i2 = this.zzikx;
            int i3 = this.zzilg;
            int i4 = this.pos;
            if (i > (i2 - i3) - i4 || i3 + i4 + i > this.zzile) {
                return false;
            }
            if (i4 > 0) {
                int i5 = this.zzake;
                if (i5 > i4) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.zzilg += i4;
                this.zzake -= i4;
                this.pos = 0;
            }
            InputStream inputStream = this.zzilf;
            byte[] bArr2 = this.buffer;
            int i6 = this.zzake;
            int read = inputStream.read(bArr2, i6, Math.min(bArr2.length - i6, (this.zzikx - this.zzilg) - this.zzake));
            if (read == 0 || read < -1 || read > this.buffer.length) {
                String valueOf = String.valueOf(this.zzilf.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                sb.append(valueOf);
                sb.append("#read(byte[]) returned invalid result: ");
                sb.append(read);
                sb.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb.toString());
            }
            if (read <= 0) {
                return false;
            }
            this.zzake += read;
            zzbhr();
            if (this.zzake >= i) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }

    private final byte zzbhs() throws IOException {
        if (this.pos == this.zzake) {
            zzgj(1);
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i];
    }

    private final byte[] zzg(int i, boolean z) throws IOException {
        byte[] zzgl = zzgl(i);
        if (zzgl != null) {
            return zzgl;
        }
        int i2 = this.pos;
        int i3 = this.zzake;
        int i4 = i3 - i2;
        this.zzilg += i3;
        this.pos = 0;
        this.zzake = 0;
        List<byte[]> zzgm = zzgm(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, i2, bArr, 0, i4);
        for (byte[] bArr2 : zzgm) {
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    private final byte[] zzgl(int i) throws IOException {
        if (i == 0) {
            return zzeks.zzikp;
        }
        if (i < 0) {
            throw zzeld.zzbje();
        }
        int i2 = this.zzilg + this.pos + i;
        if (i2 - this.zzikx > 0) {
            throw zzeld.zzbjj();
        }
        int i3 = this.zzile;
        if (i2 > i3) {
            zzgi((i3 - this.zzilg) - this.pos);
            throw zzeld.zzbjd();
        }
        int i4 = this.zzake - this.pos;
        int i5 = i - i4;
        if (i5 >= 4096 && i5 > this.zzilf.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, this.pos, bArr, 0, i4);
        this.zzilg += this.zzake;
        this.pos = 0;
        this.zzake = 0;
        while (i4 < i) {
            int read = this.zzilf.read(bArr, i4, i - i4);
            if (read == -1) {
                throw zzeld.zzbjd();
            }
            this.zzilg += read;
            i4 += read;
        }
        return bArr;
    }

    private final List<byte[]> zzgm(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.zzilf.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw zzeld.zzbjd();
                }
                this.zzilg += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzgi(int i) throws IOException {
        int i2 = this.zzake;
        int i3 = this.pos;
        if (i <= i2 - i3 && i >= 0) {
            this.pos = i3 + i;
            return;
        }
        if (i < 0) {
            throw zzeld.zzbje();
        }
        int i4 = this.zzilg;
        int i5 = this.pos;
        int i6 = i4 + i5 + i;
        int i7 = this.zzile;
        if (i6 > i7) {
            zzgi((i7 - i4) - i5);
            throw zzeld.zzbjd();
        }
        this.zzilg = i4 + i5;
        int i8 = this.zzake - i5;
        this.zzake = 0;
        this.pos = 0;
        while (i8 < i) {
            try {
                long j = i - i8;
                long skip = this.zzilf.skip(j);
                if (skip >= 0 && skip <= j) {
                    if (skip == 0) {
                        break;
                    } else {
                        i8 += (int) skip;
                    }
                } else {
                    String valueOf = String.valueOf(this.zzilf.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                    sb.append(valueOf);
                    sb.append("#skip returned invalid result: ");
                    sb.append(skip);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
            } finally {
                this.zzilg += i8;
                zzbhr();
            }
        }
        if (i8 >= i) {
            return;
        }
        int i9 = this.zzake;
        int i10 = i9 - this.pos;
        this.pos = i9;
        zzgj(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.zzake;
            if (i11 > i12) {
                i10 += i12;
                this.pos = i12;
                zzgj(1);
            } else {
                this.pos = i11;
                return;
            }
        }
    }
}
