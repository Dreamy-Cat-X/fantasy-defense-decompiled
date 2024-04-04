package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzecm implements zzeaf {
    private static final ThreadLocal<Cipher> zzibr = new zzecl();
    private final SecretKey zzibs;

    public zzecm(byte[] bArr) throws GeneralSecurityException {
        zzeik.zzfu(bArr.length);
        this.zzibs = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.ads.zzeaf
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        byte[] zzft = zzeij.zzft(12);
        System.arraycopy(zzft, 0, bArr3, 0, 12);
        zzibr.get().init(1, this.zzibs, zzf(zzft, 0, zzft.length));
        if (bArr2 != null && bArr2.length != 0) {
            zzibr.get().updateAAD(bArr2);
        }
        int doFinal = zzibr.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (doFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
    }

    private static AlgorithmParameterSpec zzf(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i2);
        } catch (ClassNotFoundException unused) {
            if (zzeil.zzbfz()) {
                return new IvParameterSpec(bArr, 0, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }
}
