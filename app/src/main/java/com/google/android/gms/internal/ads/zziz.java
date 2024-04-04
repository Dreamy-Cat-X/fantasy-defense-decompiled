package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zziz implements zzii {
    private int[] zzame;
    private boolean zzamf;
    private int[] zzamg;
    private boolean zzami;
    private ByteBuffer zzamh = zzaiz;
    private ByteBuffer zzalg = zzaiz;
    private int zzahl = -1;
    private int zzamd = -1;

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzfk() {
        return 2;
    }

    public final void zzb(int[] iArr) {
        this.zzame = iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final boolean zzb(int i, int i2, int i3) throws zzih {
        boolean z = !Arrays.equals(this.zzame, this.zzamg);
        int[] iArr = this.zzame;
        this.zzamg = iArr;
        if (iArr == null) {
            this.zzamf = false;
            return z;
        }
        if (i3 != 2) {
            throw new zzih(i, i2, i3);
        }
        if (!z && this.zzamd == i && this.zzahl == i2) {
            return false;
        }
        this.zzamd = i;
        this.zzahl = i2;
        this.zzamf = i2 != this.zzamg.length;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.zzamg;
            if (i4 >= iArr2.length) {
                return true;
            }
            int i5 = iArr2[i4];
            if (i5 >= i2) {
                throw new zzih(i, i2, i3);
            }
            this.zzamf = (i5 != i4) | this.zzamf;
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final boolean isActive() {
        return this.zzamf;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzfj() {
        int[] iArr = this.zzamg;
        return iArr == null ? this.zzahl : iArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final void zzn(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.zzahl * 2)) * this.zzamg.length) << 1;
        if (this.zzamh.capacity() < length) {
            this.zzamh = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.zzamh.clear();
        }
        while (position < limit) {
            for (int i : this.zzamg) {
                this.zzamh.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.zzahl << 1;
        }
        byteBuffer.position(limit);
        this.zzamh.flip();
        this.zzalg = this.zzamh;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final void zzfl() {
        this.zzami = true;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final ByteBuffer zzfm() {
        ByteBuffer byteBuffer = this.zzalg;
        this.zzalg = zzaiz;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final boolean zzfe() {
        return this.zzami && this.zzalg == zzaiz;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final void flush() {
        this.zzalg = zzaiz;
        this.zzami = false;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final void reset() {
        flush();
        this.zzamh = zzaiz;
        this.zzahl = -1;
        this.zzamd = -1;
        this.zzamg = null;
        this.zzamf = false;
    }
}
