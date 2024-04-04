package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzear {
    private final zzega zzhzx;

    private zzear(zzega zzegaVar) {
        this.zzhzx = zzegaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final zzear zza(zzega zzegaVar) throws GeneralSecurityException {
        if (zzegaVar == null || zzegaVar.zzbep() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzear(zzegaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzega zzbat() {
        return this.zzhzx;
    }

    public final String toString() {
        return zzebf.zzb(this.zzhzx).toString();
    }
}
