package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeie implements zzedk {
    private final ThreadLocal<Mac> zzija = new zzeih(this);
    private final String zzijb;
    private final Key zzijc;
    private final int zzijd;

    public zzeie(String str, Key key) throws GeneralSecurityException {
        this.zzijb = str;
        this.zzijc = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c = 0;
                    break;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c = 1;
                    break;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c = 2;
                    break;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.zzijd = 20;
        } else if (c == 1) {
            this.zzijd = 32;
        } else if (c == 2) {
            this.zzijd = 48;
        } else if (c == 3) {
            this.zzijd = 64;
        } else {
            String valueOf = String.valueOf(str);
            throw new NoSuchAlgorithmException(valueOf.length() != 0 ? "unknown Hmac algorithm: ".concat(valueOf) : new String("unknown Hmac algorithm: "));
        }
        this.zzija.get();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final byte[] zzd(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > this.zzijd) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.zzija.get().update(bArr);
        return Arrays.copyOf(this.zzija.get().doFinal(), i);
    }
}
