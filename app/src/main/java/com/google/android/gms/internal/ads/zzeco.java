package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeco extends zzeay<zzefc, zzefd> {
    private static final byte[] zzibt = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeco() {
        super(zzefc.class, zzefd.class, new zzecn(zzeaj.class));
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzefs.zza zzbao() {
        return zzefs.zza.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzeap<zzeey, zzefc> zzbar() {
        return new zzecq(this, zzeey.class);
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ void zzc(zzemd zzemdVar) throws GeneralSecurityException {
        zzefc zzefcVar = (zzefc) zzemdVar;
        if (zzefcVar.zzbbh().isEmpty()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzeik.zzz(zzefcVar.getVersion(), 0);
        zzecw.zza(zzefcVar.zzbde().zzbcx());
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ zzemd zzp(zzejg zzejgVar) throws zzeld {
        return zzefc.zzr(zzejgVar, zzekd.zzbhz());
    }
}
