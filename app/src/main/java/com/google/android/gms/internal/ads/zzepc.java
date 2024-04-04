package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzepc extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long position() throws IOException;

    int read(ByteBuffer byteBuffer) throws IOException;

    long size() throws IOException;

    void zzfc(long j) throws IOException;

    ByteBuffer zzh(long j, long j2) throws IOException;
}
