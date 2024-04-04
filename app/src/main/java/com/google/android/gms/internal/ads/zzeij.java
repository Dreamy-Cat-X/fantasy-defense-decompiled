package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeij {
    private static final ThreadLocal<SecureRandom> zzijj = new zzeii();

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom zzbfx() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] zzft(int i) {
        byte[] bArr = new byte[i];
        zzijj.get().nextBytes(bArr);
        return bArr;
    }
}
