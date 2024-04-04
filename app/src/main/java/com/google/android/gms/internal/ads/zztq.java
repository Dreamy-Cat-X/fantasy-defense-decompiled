package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zztq extends PushbackInputStream {
    private final /* synthetic */ zztl zzbvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zztq(zztl zztlVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zzbvr = zztlVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.zzbvr.zzbvk.disconnect();
        super.close();
    }
}
