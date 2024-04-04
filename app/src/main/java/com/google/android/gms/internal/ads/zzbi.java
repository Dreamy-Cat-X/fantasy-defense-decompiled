package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbi extends ByteArrayOutputStream {
    private final zzat zzce;

    public zzbi(zzat zzatVar, int i) {
        this.zzce = zzatVar;
        this.buf = zzatVar.zzf(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzce.zza(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.zzce.zza(this.buf);
    }

    private final void zzg(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        byte[] zzf = this.zzce.zzf((this.count + i) << 1);
        System.arraycopy(this.buf, 0, zzf, 0, this.count);
        this.zzce.zza(this.buf);
        this.buf = zzf;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        zzg(i2);
        super.write(bArr, i, i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        zzg(1);
        super.write(i);
    }
}
