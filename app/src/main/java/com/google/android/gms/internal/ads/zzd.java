package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzd implements zzc {
    private final ByteBuffer zza;

    public zzd(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zzc
    public final long size() {
        return this.zza.capacity();
    }

    @Override // com.google.android.gms.internal.ads.zzc
    public final void zza(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.zza) {
            int i2 = (int) j;
            this.zza.position(i2);
            this.zza.limit(i2 + i);
            slice = this.zza.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
