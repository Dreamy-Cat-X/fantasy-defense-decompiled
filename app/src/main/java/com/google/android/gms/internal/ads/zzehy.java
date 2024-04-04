package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzehy implements zzehs<MessageDigest> {
    @Override // com.google.android.gms.internal.ads.zzehs
    public final /* synthetic */ MessageDigest zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, provider);
    }
}
