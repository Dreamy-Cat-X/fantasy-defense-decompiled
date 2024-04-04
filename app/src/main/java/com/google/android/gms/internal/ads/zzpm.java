package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzpm {
    public byte[] data;
    private int limit;
    private int position;

    public zzpm() {
    }

    public zzpm(int i) {
        this.data = new byte[i];
        this.limit = i;
    }

    public zzpm(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public final void reset(int i) {
        zzc(capacity() < i ? new byte[i] : this.data, i);
    }

    public final void zzc(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
        this.position = 0;
    }

    public final void reset() {
        this.position = 0;
        this.limit = 0;
    }

    public final int zziv() {
        return this.limit - this.position;
    }

    public final int limit() {
        return this.limit;
    }

    public final void zzbh(int i) {
        zzpf.checkArgument(i >= 0 && i <= this.data.length);
        this.limit = i;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int capacity() {
        byte[] bArr = this.data;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final void zzbi(int i) {
        zzpf.checkArgument(i >= 0 && i <= this.limit);
        this.position = i;
    }

    public final void zzbj(int i) {
        zzbi(this.position + i);
    }

    public final void zze(byte[] bArr, int i, int i2) {
        System.arraycopy(this.data, this.position, bArr, i, i2);
        this.position += i2;
    }

    public final int readUnsignedByte() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
    }

    public final int readUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    public final int zziw() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        this.position = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final short readShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i2 + 1;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final long zzix() {
        byte[] bArr = this.data;
        int i = this.position + 1;
        this.position = i;
        long j = (bArr[r1] & 255) << 24;
        int i2 = i + 1;
        this.position = i2;
        long j2 = j | ((bArr[i] & 255) << 16);
        int i3 = i2 + 1;
        this.position = i3;
        long j3 = j2 | ((bArr[i2] & 255) << 8);
        this.position = i3 + 1;
        return (bArr[i3] & 255) | j3;
    }

    public final long zziy() {
        byte[] bArr = this.data;
        int i = this.position + 1;
        this.position = i;
        long j = bArr[r1] & 255;
        int i2 = i + 1;
        this.position = i2;
        long j2 = j | ((bArr[i] & 255) << 8);
        int i3 = i2 + 1;
        this.position = i3;
        long j3 = j2 | ((bArr[i2] & 255) << 16);
        this.position = i3 + 1;
        return ((bArr[i3] & 255) << 24) | j3;
    }

    public final int readInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i2 + 1;
        this.position = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 16);
        int i6 = i4 + 1;
        this.position = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.position = i6 + 1;
        return (bArr[i6] & 255) | i7;
    }

    public final long readLong() {
        byte[] bArr = this.data;
        int i = this.position + 1;
        this.position = i;
        long j = (bArr[r1] & 255) << 56;
        int i2 = i + 1;
        this.position = i2;
        long j2 = j | ((bArr[i] & 255) << 48);
        int i3 = i2 + 1;
        this.position = i3;
        long j3 = j2 | ((bArr[i2] & 255) << 40);
        int i4 = i3 + 1;
        this.position = i4;
        long j4 = j3 | ((bArr[i3] & 255) << 32);
        int i5 = i4 + 1;
        this.position = i5;
        long j5 = j4 | ((bArr[i4] & 255) << 24);
        int i6 = i5 + 1;
        this.position = i6;
        long j6 = j5 | ((bArr[i5] & 255) << 16);
        int i7 = i6 + 1;
        this.position = i7;
        long j7 = j6 | ((bArr[i6] & 255) << 8);
        this.position = i7 + 1;
        return (bArr[i7] & 255) | j7;
    }

    public final int zziz() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        int i4 = i2 + 1;
        this.position = i4;
        int i5 = (bArr[i2] & 255) | i3;
        this.position = i4 + 2;
        return i5;
    }

    public final int zzja() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(readInt);
        throw new IllegalStateException(sb.toString());
    }

    public final long zzjb() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(readLong);
        throw new IllegalStateException(sb.toString());
    }

    public final String zzbk(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.position + i) - 1;
        String str = new String(this.data, this.position, (i2 >= this.limit || this.data[i2] != 0) ? i : i - 1);
        this.position += i;
        return str;
    }

    public final String zzjc() {
        if (zziv() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && this.data[i] != 0) {
            i++;
        }
        byte[] bArr = this.data;
        int i2 = this.position;
        String str = new String(bArr, i2, i - i2);
        this.position = i;
        if (i < this.limit) {
            this.position = i + 1;
        }
        return str;
    }
}
