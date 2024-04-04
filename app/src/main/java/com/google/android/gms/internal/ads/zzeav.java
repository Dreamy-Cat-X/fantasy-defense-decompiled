package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import com.google.android.gms.internal.ads.zzega;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class zzeav {
    @Deprecated
    public static final zzear zzl(byte[] bArr) throws GeneralSecurityException {
        try {
            zzega zzc = zzega.zzc(bArr, zzekd.zzbhz());
            for (zzega.zzb zzbVar : zzc.zzbeo()) {
                if (zzbVar.zzbes().zzbec() == zzefs.zza.UNKNOWN_KEYMATERIAL || zzbVar.zzbes().zzbec() == zzefs.zza.SYMMETRIC || zzbVar.zzbes().zzbec() == zzefs.zza.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzear.zza(zzc);
        } catch (zzeld unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
