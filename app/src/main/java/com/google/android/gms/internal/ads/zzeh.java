package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeh {
    private static Cipher zzxx;
    private static final Object zzxy = new Object();
    private static final Object zzxz = new Object();
    private final SecureRandom zzxw = null;

    public zzeh(SecureRandom secureRandom) {
    }

    public final byte[] zzao(String str) throws zzek {
        try {
            byte[] zzb = zzcv.zzb(str, false);
            if (zzb.length != 32) {
                throw new zzek(this);
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(zzb, 4, 16).get(bArr);
            for (int i = 0; i < 16; i++) {
                bArr[i] = (byte) (bArr[i] ^ 68);
            }
            return bArr;
        } catch (IllegalArgumentException e) {
            throw new zzek(this, e);
        }
    }

    public final String zzb(byte[] bArr, byte[] bArr2) throws zzek {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length != 16) {
            throw new zzek(this);
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzxy) {
                getCipher().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = getCipher().doFinal(bArr2);
                iv = getCipher().getIV();
            }
            int length = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length];
            allocate.get(bArr3);
            return zzcv.zza(bArr3, false);
        } catch (InvalidKeyException e) {
            throw new zzek(this, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new zzek(this, e2);
        } catch (BadPaddingException e3) {
            throw new zzek(this, e3);
        } catch (IllegalBlockSizeException e4) {
            throw new zzek(this, e4);
        } catch (NoSuchPaddingException e5) {
            throw new zzek(this, e5);
        }
    }

    public final byte[] zza(byte[] bArr, String str) throws zzek {
        byte[] doFinal;
        if (bArr.length != 16) {
            throw new zzek(this);
        }
        try {
            byte[] zzb = zzcv.zzb(str, false);
            if (zzb.length <= 16) {
                throw new zzek(this);
            }
            ByteBuffer allocate = ByteBuffer.allocate(zzb.length);
            allocate.put(zzb);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[zzb.length - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzxy) {
                getCipher().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = getCipher().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e) {
            throw new zzek(this, e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new zzek(this, e2);
        } catch (InvalidKeyException e3) {
            throw new zzek(this, e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new zzek(this, e4);
        } catch (BadPaddingException e5) {
            throw new zzek(this, e5);
        } catch (IllegalBlockSizeException e6) {
            throw new zzek(this, e6);
        } catch (NoSuchPaddingException e7) {
            throw new zzek(this, e7);
        }
    }

    private static Cipher getCipher() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (zzxz) {
            if (zzxx == null) {
                zzxx = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = zzxx;
        }
        return cipher;
    }
}
