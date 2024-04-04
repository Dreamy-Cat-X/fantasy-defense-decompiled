package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzehc extends zzehf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzehc(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzehf
    public final int zzbfs() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzehf
    final int[] zzb(int[] iArr, int i) {
        if (iArr.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
        }
        int[] iArr2 = new int[16];
        zzehf.zza(iArr2, this.zziho);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }
}
