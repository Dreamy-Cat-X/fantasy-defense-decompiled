package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzehj implements zzeaj {
    private static final byte[] zzibl = new byte[0];
    private final String zziht;
    private final byte[] zzihu;
    private final zzehr zzihv;
    private final zzehg zzihw;
    private final ECPrivateKey zzihx;
    private final zzehl zzihy;

    public zzehj(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzehr zzehrVar, zzehg zzehgVar) throws GeneralSecurityException {
        this.zzihx = eCPrivateKey;
        this.zzihy = new zzehl(eCPrivateKey);
        this.zzihu = bArr;
        this.zziht = str;
        this.zzihv = zzehrVar;
        this.zzihw = zzehgVar;
    }
}
