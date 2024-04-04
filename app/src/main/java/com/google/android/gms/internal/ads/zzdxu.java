package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdxu extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        zzdwa.checkNotNull(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        zzdwa.checkNotNull(bArr);
    }
}
