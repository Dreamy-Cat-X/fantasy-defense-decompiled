package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzegw extends ThreadLocal<Cipher> {
    private static Cipher zzbbf() {
        try {
            return zzeht.zziiq.zzhy("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() {
        return zzbbf();
    }
}
