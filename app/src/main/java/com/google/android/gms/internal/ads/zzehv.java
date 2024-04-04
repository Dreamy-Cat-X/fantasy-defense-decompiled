package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzehv implements zzehs<Cipher> {
    @Override // com.google.android.gms.internal.ads.zzehs
    public final /* synthetic */ Cipher zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
