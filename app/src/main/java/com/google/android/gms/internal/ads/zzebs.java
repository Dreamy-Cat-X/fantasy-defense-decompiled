package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzebs extends zzeap<zzeed, zzeec> {
    private final /* synthetic */ zzebq zzibh;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzebs(zzebq zzebqVar, Class cls) {
        super(cls);
        this.zzibh = zzebqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzeec zze(zzeed zzeedVar) throws GeneralSecurityException {
        zzeed zzeedVar2 = zzeedVar;
        return (zzeec) ((zzekq) zzeec.zzbcg().zzv(zzejg.zzt(zzeij.zzft(zzeedVar2.getKeySize()))).zzb(zzeedVar2.zzbcf()).zzez(0).zzbiz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzeed zzr(zzejg zzejgVar) throws zzeld {
        return zzeed.zzj(zzejgVar, zzekd.zzbhz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ void zzd(zzeed zzeedVar) throws GeneralSecurityException {
        zzeed zzeedVar2 = zzeedVar;
        zzeik.zzfu(zzeedVar2.getKeySize());
        if (zzeedVar2.zzbcf().zzbcc() != 12 && zzeedVar2.zzbcf().zzbcc() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
