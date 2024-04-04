package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzba extends FilterInputStream {
    private final long zzcm;
    private long zzcn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzba(InputStream inputStream, long j) {
        super(inputStream);
        this.zzcm = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.zzcn++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.zzcn += read;
        }
        return read;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzp() {
        return this.zzcm - this.zzcn;
    }
}
