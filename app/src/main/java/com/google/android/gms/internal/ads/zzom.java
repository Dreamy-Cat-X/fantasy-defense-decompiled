package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzom {
    void close() throws IOException;

    Uri getUri();

    int read(byte[] bArr, int i, int i2) throws IOException;

    long zza(zzor zzorVar) throws IOException;
}
