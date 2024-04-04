package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import com.google.android.gms.internal.ads.zzega;
import com.google.android.gms.internal.ads.zzegd;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzebf {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static zzegd zzb(zzega zzegaVar) {
        zzegd.zzb zzfn = zzegd.zzbev().zzfn(zzegaVar.zzben());
        for (zzega.zzb zzbVar : zzegaVar.zzbeo()) {
            zzfn.zzb((zzegd.zza) ((zzekq) zzegd.zza.zzbex().zzhx(zzbVar.zzbes().zzbea()).zzb(zzbVar.zzbax()).zzb(zzbVar.zzbay()).zzfo(zzbVar.zzbet()).zzbiz()));
        }
        return (zzegd) ((zzekq) zzfn.zzbiz());
    }

    public static void zzc(zzega zzegaVar) throws GeneralSecurityException {
        int zzben = zzegaVar.zzben();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzega.zzb zzbVar : zzegaVar.zzbeo()) {
            if (zzbVar.zzbax() == zzeft.ENABLED) {
                if (!zzbVar.zzber()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzbVar.zzbet())));
                }
                if (zzbVar.zzbay() == zzegm.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzbVar.zzbet())));
                }
                if (zzbVar.zzbax() == zzeft.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzbVar.zzbet())));
                }
                if (zzbVar.zzbet() == zzben) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (zzbVar.zzbes().zzbec() != zzefs.zza.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
