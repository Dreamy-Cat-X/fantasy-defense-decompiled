package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzecn extends zzeao<zzeaj, zzefc> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzecn(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzeao
    public final /* synthetic */ zzeaj zzah(zzefc zzefcVar) throws GeneralSecurityException {
        zzefc zzefcVar2 = zzefcVar;
        zzeez zzbcx = zzefcVar2.zzbde().zzbcx();
        zzefg zzbcz = zzbcx.zzbcz();
        zzeho zza = zzecw.zza(zzbcz.zzbdm());
        byte[] byteArray = zzefcVar2.zzbbh().toByteArray();
        return new zzehj((ECPrivateKey) zzeht.zziiw.zzhy("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, byteArray), zzehm.zza(zza))), zzbcz.zzbdo().toByteArray(), zzecw.zza(zzbcz.zzbdn()), zzecw.zza(zzbcx.zzbdb()), new zzecy(zzbcx.zzbda().zzbcu()));
    }
}
