package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzegv implements zzeid {
    private static final ThreadLocal<Cipher> zzibr = new zzegu();
    private final SecretKeySpec zzihf;
    private final int zzihg;
    private final int zzihh;

    public zzegv(byte[] bArr, int i) throws GeneralSecurityException {
        zzeik.zzfu(bArr.length);
        this.zzihf = new SecretKeySpec(bArr, "AES");
        int blockSize = zzibr.get().getBlockSize();
        this.zzihh = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzihg = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeid
    public final byte[] zzn(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzihg;
        if (length > ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i) {
            int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.zzihg;
            StringBuilder sb = new StringBuilder(43);
            sb.append("plaintext length can not exceed ");
            sb.append(i2);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] bArr2 = new byte[bArr.length + i];
        byte[] zzft = zzeij.zzft(i);
        System.arraycopy(zzft, 0, bArr2, 0, this.zzihg);
        int length2 = bArr.length;
        int i3 = this.zzihg;
        Cipher cipher = zzibr.get();
        byte[] bArr3 = new byte[this.zzihh];
        System.arraycopy(zzft, 0, bArr3, 0, this.zzihg);
        cipher.init(1, this.zzihf, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length2, bArr2, i3) == length2) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
