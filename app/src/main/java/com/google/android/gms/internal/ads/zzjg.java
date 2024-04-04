package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzjg implements zzii {
    private boolean zzami;
    private int zzamd = -1;
    private int zzahl = -1;
    private int zzakb = 0;
    private ByteBuffer zzamh = zzaiz;
    private ByteBuffer zzalg = zzaiz;

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzfk() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final boolean zzb(int i, int i2, int i3) throws zzih {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new zzih(i, i2, i3);
        }
        if (this.zzamd == i && this.zzahl == i2 && this.zzakb == i3) {
            return false;
        }
        this.zzamd = i;
        this.zzahl = i2;
        this.zzakb = i3;
        if (i3 != 2) {
            return true;
        }
        this.zzamh = zzaiz;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final boolean isActive() {
        int i = this.zzakb;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzfj() {
        return this.zzahl;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081 A[ADDED_TO_REGION, LOOP:2: B:24:0x0081->B:25:0x0083, LOOP_START, PHI: r0
      0x0081: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:10:0x0041, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.google.android.gms.internal.ads.zzii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzn(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        int i4 = this.zzakb;
        if (i4 == Integer.MIN_VALUE) {
            i3 /= 3;
        } else if (i4 != 3) {
            if (i4 == 1073741824) {
                i = i3 / 2;
                if (this.zzamh.capacity() >= i) {
                    this.zzamh = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                } else {
                    this.zzamh.clear();
                }
                i2 = this.zzakb;
                if (i2 != Integer.MIN_VALUE) {
                    while (position < limit) {
                        this.zzamh.put(byteBuffer.get(position + 1));
                        this.zzamh.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else if (i2 == 3) {
                    while (position < limit) {
                        this.zzamh.put((byte) 0);
                        this.zzamh.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else {
                    if (i2 != 1073741824) {
                        throw new IllegalStateException();
                    }
                    while (position < limit) {
                        this.zzamh.put(byteBuffer.get(position + 2));
                        this.zzamh.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                this.zzamh.flip();
                this.zzalg = this.zzamh;
            }
            throw new IllegalStateException();
        }
        i = i3 << 1;
        if (this.zzamh.capacity() >= i) {
        }
        i2 = this.zzakb;
        if (i2 != Integer.MIN_VALUE) {
        }
        byteBuffer.position(byteBuffer.limit());
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
        this.zzamd = -1;
        this.zzahl = -1;
        this.zzakb = 0;
    }
}
