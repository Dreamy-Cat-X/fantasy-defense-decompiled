package com.kt.olleh.inapp.crypt;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: D:\decomp\classes.dex */
public class AESCrypt {
    private static final String AESTYPE = "AES/ECB/PKCS5Padding";

    public static String encrypt(String str, String str2) throws Exception {
        if (str == null || "".equals(str)) {
            throw new NullPointerException("The key can not be null or an empty string..");
        }
        if (str2 == null || "".equals(str2)) {
            throw new NullPointerException("The cipher string can not be null or an empty string.");
        }
        Cipher cipher = Cipher.getInstance(AESTYPE);
        cipher.init(1, generateKey(str));
        return new String(encodeBase64(cipher.doFinal(str2.getBytes())));
    }

    public static String decrypt(String str, String str2) throws Exception {
        if (str == null || "".equals(str)) {
            throw new NullPointerException("The key can not be null or an empty string..");
        }
        if (str2 == null || "".equals(str2)) {
            throw new NullPointerException("The cipher string can not be null or an empty string.");
        }
        Cipher cipher = Cipher.getInstance(AESTYPE);
        cipher.init(2, generateKey(str));
        return new String(cipher.doFinal(decodeBase64(str2.getBytes()))).trim();
    }

    private static Key generateKey(String str) throws Exception {
        return new SecretKeySpec(str.getBytes(), "AES");
    }

    public static byte[] encodeBase64(byte[] bArr) {
        byte[] bArr2 = (byte[]) null;
        try {
            Class<?> cls = Class.forName("org.apache.commons.codec.binary.Base64");
            return (byte[]) cls.getMethod("encodeBase64", byte[].class).invoke(cls, bArr);
        } catch (Exception unused) {
            return bArr2;
        }
    }

    public static byte[] decodeBase64(byte[] bArr) {
        byte[] bArr2 = (byte[]) null;
        try {
            Class<?> cls = Class.forName("org.apache.commons.codec.binary.Base64");
            return (byte[]) cls.getMethod("decodeBase64", byte[].class).invoke(cls, bArr);
        } catch (Exception unused) {
            return bArr2;
        }
    }
}
