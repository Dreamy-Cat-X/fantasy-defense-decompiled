package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzpp {
    private byte[] data;
    private int zzbkf;
    private int zzbkg = 0;
    private int zzbkh;

    public zzpp(byte[] bArr, int i, int i2) {
        this.data = bArr;
        this.zzbkf = i;
        this.zzbkh = i2;
        zzjh();
    }

    public final void zzbm(int i) {
        int i2 = this.zzbkf;
        int i3 = (i / 8) + i2;
        this.zzbkf = i3;
        int i4 = this.zzbkg + (i % 8);
        this.zzbkg = i4;
        if (i4 > 7) {
            this.zzbkf = i3 + 1;
            this.zzbkg = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.zzbkf) {
                if (zzbn(i2)) {
                    this.zzbkf++;
                    i2 += 2;
                }
            } else {
                zzjh();
                return;
            }
        }
    }

    public final boolean zzjd() {
        return zzbl(1) == 1;
    }

    public final int zzbl(int i) {
        int i2;
        int i3;
        if (i == 0) {
            return 0;
        }
        int i4 = i / 8;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = zzbn(this.zzbkf + 1) ? this.zzbkf + 2 : this.zzbkf + 1;
            int i8 = this.zzbkg;
            if (i8 != 0) {
                byte[] bArr = this.data;
                i3 = ((bArr[i7] & 255) >>> (8 - i8)) | ((bArr[this.zzbkf] & 255) << i8);
            } else {
                i3 = this.data[this.zzbkf];
            }
            i -= 8;
            i5 |= (255 & i3) << i;
            this.zzbkf = i7;
        }
        if (i > 0) {
            int i9 = this.zzbkg + i;
            byte b = (byte) (255 >> (8 - i));
            int i10 = zzbn(this.zzbkf + 1) ? this.zzbkf + 2 : this.zzbkf + 1;
            if (i9 > 8) {
                byte[] bArr2 = this.data;
                i2 = (b & (((255 & bArr2[i10]) >> (16 - i9)) | ((bArr2[this.zzbkf] & 255) << (i9 - 8)))) | i5;
                this.zzbkf = i10;
            } else {
                i2 = (b & ((255 & this.data[this.zzbkf]) >> (8 - i9))) | i5;
                if (i9 == 8) {
                    this.zzbkf = i10;
                }
            }
            i5 = i2;
            this.zzbkg = i9 % 8;
        }
        zzjh();
        return i5;
    }

    public final int zzje() {
        return zzjg();
    }

    public final int zzjf() {
        int zzjg = zzjg();
        return (zzjg % 2 == 0 ? -1 : 1) * ((zzjg + 1) / 2);
    }

    private final int zzjg() {
        int i = 0;
        while (!zzjd()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? zzbl(i) : 0);
    }

    private final boolean zzbn(int i) {
        if (2 > i || i >= this.zzbkh) {
            return false;
        }
        byte[] bArr = this.data;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    private final void zzjh() {
        int i;
        int i2;
        int i3 = this.zzbkf;
        zzpf.checkState(i3 >= 0 && (i = this.zzbkg) >= 0 && i < 8 && (i3 < (i2 = this.zzbkh) || (i3 == i2 && i == 0)));
    }
}
