package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzehx implements zzehs<KeyFactory> {
    @Override // com.google.android.gms.internal.ads.zzehs
    public final /* synthetic */ KeyFactory zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
