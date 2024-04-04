package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzecq extends zzeap<zzeey, zzefc> {
    private final /* synthetic */ zzeco zzibu;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzecq(zzeco zzecoVar, Class cls) {
        super(cls);
        this.zzibu = zzecoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzefc zze(zzeey zzeeyVar) throws GeneralSecurityException {
        zzeey zzeeyVar2 = zzeeyVar;
        KeyPair zza = zzehm.zza(zzehm.zza(zzecw.zza(zzeeyVar2.zzbcx().zzbcz().zzbdm())));
        ECPublicKey eCPublicKey = (ECPublicKey) zza.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) zza.getPrivate();
        ECPoint w = eCPublicKey.getW();
        return (zzefc) ((zzekq) zzefc.zzbdf().zzfe(0).zzb((zzefd) ((zzekq) zzefd.zzbdj().zzff(0).zzc(zzeeyVar2.zzbcx()).zzac(zzejg.zzt(w.getAffineX().toByteArray())).zzad(zzejg.zzt(w.getAffineY().toByteArray())).zzbiz())).zzab(zzejg.zzt(eCPrivateKey.getS().toByteArray())).zzbiz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzeey zzr(zzejg zzejgVar) throws zzeld {
        return zzeey.zzq(zzejgVar, zzekd.zzbhz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ void zzd(zzeey zzeeyVar) throws GeneralSecurityException {
        zzecw.zza(zzeeyVar.zzbcx());
    }
}
