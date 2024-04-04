package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzehz implements zzehs<Mac> {
    @Override // com.google.android.gms.internal.ads.zzehs
    public final /* synthetic */ Mac zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }
}
