package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbby implements zzepc {
    private final ByteBuffer zzamh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbby(ByteBuffer byteBuffer) {
        this.zzamh = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.zzepc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzepc
    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.zzamh.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.zzamh.remaining());
        byte[] bArr = new byte[min];
        this.zzamh.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzepc
    public final long size() throws IOException {
        return this.zzamh.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzepc
    public final long position() throws IOException {
        return this.zzamh.position();
    }

    @Override // com.google.android.gms.internal.ads.zzepc
    public final void zzfc(long j) throws IOException {
        this.zzamh.position((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzepc
    public final ByteBuffer zzh(long j, long j2) throws IOException {
        int position = this.zzamh.position();
        this.zzamh.position((int) j);
        ByteBuffer slice = this.zzamh.slice();
        slice.limit((int) j2);
        this.zzamh.position(position);
        return slice;
    }
}
