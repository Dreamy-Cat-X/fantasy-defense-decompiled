package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzejp extends OutputStream {
    private static final byte[] zzikp = new byte[0];
    private int zziks;
    private int zzikt;
    private final int zzikq = 128;
    private final ArrayList<zzejg> zzikr = new ArrayList<>();
    private byte[] buffer = new byte[128];

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejp(int i) {
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        if (this.zzikt == this.buffer.length) {
            zzgc(1);
        }
        byte[] bArr = this.buffer;
        int i2 = this.zzikt;
        this.zzikt = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (i2 <= this.buffer.length - this.zzikt) {
            System.arraycopy(bArr, i, this.buffer, this.zzikt, i2);
            this.zzikt += i2;
            return;
        }
        int length = this.buffer.length - this.zzikt;
        System.arraycopy(bArr, i, this.buffer, this.zzikt, length);
        int i3 = i2 - length;
        zzgc(i3);
        System.arraycopy(bArr, i + length, this.buffer, 0, i3);
        this.zzikt = i3;
    }

    public final synchronized zzejg zzbgc() {
        if (this.zzikt < this.buffer.length) {
            if (this.zzikt > 0) {
                byte[] bArr = this.buffer;
                int i = this.zzikt;
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
                this.zzikr.add(new zzejq(bArr2));
            }
        } else {
            this.zzikr.add(new zzejq(this.buffer));
            this.buffer = zzikp;
        }
        this.zziks += this.zzikt;
        this.zzikt = 0;
        return zzejg.zzl(this.zzikr);
    }

    private final synchronized int size() {
        return this.zziks + this.zzikt;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    private final void zzgc(int i) {
        this.zzikr.add(new zzejq(this.buffer));
        int length = this.zziks + this.buffer.length;
        this.zziks = length;
        this.buffer = new byte[Math.max(this.zzikq, Math.max(i, length >>> 1))];
        this.zzikt = 0;
    }
}
