package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzehw implements zzehs<KeyPairGenerator> {
    @Override // com.google.android.gms.internal.ads.zzehs
    public final /* synthetic */ KeyPairGenerator zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
