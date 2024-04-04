package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzsc extends zzrr {
    private MessageDigest zzbty;
    private final int zzbuf;
    private final int zzbug;

    public zzsc(int i) {
        int i2 = i / 8;
        this.zzbuf = i % 8 > 0 ? i2 + 1 : i2;
        this.zzbug = i;
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final byte[] zzbp(String str) {
        synchronized (this.mLock) {
            MessageDigest zzmm = zzmm();
            this.zzbty = zzmm;
            if (zzmm == null) {
                return new byte[0];
            }
            zzmm.reset();
            this.zzbty.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.zzbty.digest();
            int length = digest.length > this.zzbuf ? this.zzbuf : digest.length;
            byte[] bArr = new byte[length];
            System.arraycopy(digest, 0, bArr, 0, length);
            if (this.zzbug % 8 > 0) {
                long j = 0;
                for (int i = 0; i < length; i++) {
                    if (i > 0) {
                        j <<= 8;
                    }
                    j += bArr[i] & 255;
                }
                long j2 = j >>> (8 - (this.zzbug % 8));
                for (int i2 = this.zzbuf - 1; i2 >= 0; i2--) {
                    bArr[i2] = (byte) (255 & j2);
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
