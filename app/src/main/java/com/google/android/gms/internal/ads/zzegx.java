package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzegx implements zzeaf {
    private static final ThreadLocal<Cipher> zzihi = new zzegw();
    private static final ThreadLocal<Cipher> zzihj = new zzegz();
    private final SecretKeySpec zzihf;
    private final byte[] zzihk;
    private final byte[] zzihl;
    private final int zzihm;

    public zzegx(byte[] bArr, int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzihm = i;
        zzeik.zzfu(bArr.length);
        this.zzihf = new SecretKeySpec(bArr, "AES");
        Cipher cipher = zzihi.get();
        cipher.init(1, this.zzihf);
        byte[] zzo = zzo(cipher.doFinal(new byte[16]));
        this.zzihk = zzo;
        this.zzihl = zzo(zzo);
    }

    private static byte[] zzd(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    private static byte[] zzo(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) ((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7));
            i = i2;
        }
        bArr2[15] = (byte) ((bArr[15] << 1) ^ ((bArr[0] & 128) != 0 ? 135 : 0));
        return bArr2;
    }

    private final byte[] zza(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(zzd(bArr3, this.zzihk));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = zzd(copyOfRange, this.zzihk);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zzihl, 16);
            for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(zzd(doFinal, bArr2));
    }

    @Override // com.google.android.gms.internal.ads.zzeaf
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzihm;
        if (length > (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i + 16];
        byte[] zzft = zzeij.zzft(i);
        System.arraycopy(zzft, 0, bArr3, 0, this.zzihm);
        Cipher cipher = zzihi.get();
        cipher.init(1, this.zzihf);
        byte[] zza = zza(cipher, 0, zzft, 0, zzft.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] zza2 = zza(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = zzihj.get();
        cipher2.init(1, this.zzihf, new IvParameterSpec(zza));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.zzihm);
        byte[] zza3 = zza(cipher, 2, bArr3, this.zzihm, bArr.length);
        int length2 = bArr.length + this.zzihm;
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[length2 + i2] = (byte) ((zza2[i2] ^ zza[i2]) ^ zza3[i2]);
        }
        return bArr3;
    }
}
