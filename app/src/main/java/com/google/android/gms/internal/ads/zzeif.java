package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeif implements zzedk {
    private final SecretKey zzibs;
    private byte[] zzije;
    private byte[] zzijf;

    private static Cipher zzbfv() throws GeneralSecurityException {
        return zzeht.zziiq.zzhy("AES/ECB/NoPadding");
    }

    public zzeif(byte[] bArr) throws GeneralSecurityException {
        zzeik.zzfu(bArr.length);
        this.zzibs = new SecretKeySpec(bArr, "AES");
        Cipher zzbfv = zzbfv();
        zzbfv.init(1, this.zzibs);
        byte[] zzp = zzeha.zzp(zzbfv.doFinal(new byte[16]));
        this.zzije = zzp;
        this.zzijf = zzeha.zzp(zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final byte[] zzd(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] zzd;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher zzbfv = zzbfv();
        zzbfv.init(1, this.zzibs);
        double length = bArr.length;
        Double.isNaN(length);
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        if ((max << 4) == bArr.length) {
            zzd = zzehd.zza(bArr, (max - 1) << 4, this.zzije, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) << 4, bArr.length);
            if (copyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = Byte.MIN_VALUE;
            zzd = zzehd.zzd(copyOf, this.zzijf);
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < max - 1; i2++) {
            bArr2 = zzbfv.doFinal(zzehd.zza(bArr2, 0, bArr, i2 << 4, 16));
        }
        return Arrays.copyOf(zzbfv.doFinal(zzehd.zzd(zzd, bArr2)), i);
    }
}
