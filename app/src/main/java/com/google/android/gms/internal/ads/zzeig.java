package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeig implements zzeas {
    private final zzedk zzijg;
    private final int zzijh;

    public zzeig(zzedk zzedkVar, int i) throws GeneralSecurityException {
        this.zzijg = zzedkVar;
        this.zzijh = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzedkVar.zzd(new byte[0], i);
    }

    @Override // com.google.android.gms.internal.ads.zzeas
    public final byte[] zzk(byte[] bArr) throws GeneralSecurityException {
        return this.zzijg.zzd(bArr, this.zzijh);
    }
}
