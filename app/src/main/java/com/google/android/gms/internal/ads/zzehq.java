package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzehq implements zzeaf {
    private final zzeid zziii;
    private final zzeas zziij;
    private final int zziik;

    public zzehq(zzeid zzeidVar, zzeas zzeasVar, int i) {
        this.zziii = zzeidVar;
        this.zziij = zzeasVar;
        this.zziik = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeaf
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzn = this.zziii.zzn(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzehd.zza(zzn, this.zziij.zzk(zzehd.zza(bArr2, zzn, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}
