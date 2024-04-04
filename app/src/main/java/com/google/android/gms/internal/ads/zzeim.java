package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeim extends zzehh {
    public zzeim(byte[] bArr) throws InvalidKeyException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzehh
    final zzehf zze(byte[] bArr, int i) throws InvalidKeyException {
        return new zzein(bArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzehh, com.google.android.gms.internal.ads.zzeaf
    public final /* bridge */ /* synthetic */ byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.zzc(bArr, bArr2);
    }
}
