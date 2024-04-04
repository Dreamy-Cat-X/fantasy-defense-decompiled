package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzehu implements zzehs<KeyAgreement> {
    @Override // com.google.android.gms.internal.ads.zzehs
    public final /* synthetic */ KeyAgreement zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
