package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeib implements zzehs<Signature> {
    @Override // com.google.android.gms.internal.ads.zzehs
    public final /* synthetic */ Signature zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
