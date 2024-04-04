package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzedd extends zzeap<zzedn, zzedm> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedd(zzedb zzedbVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzedm zze(zzedn zzednVar) throws GeneralSecurityException {
        zzedn zzednVar2 = zzednVar;
        return (zzedm) ((zzekq) zzedm.zzbbj().zzew(0).zzt(zzejg.zzt(zzeij.zzft(zzednVar2.getKeySize()))).zzd(zzednVar2.zzbbi()).zzbiz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzedn zzr(zzejg zzejgVar) throws zzeld {
        return zzedn.zzd(zzejgVar, zzekd.zzbhz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ void zzd(zzedn zzednVar) throws GeneralSecurityException {
        zzedn zzednVar2 = zzednVar;
        zzedb.zza(zzednVar2.zzbbi());
        zzedb.zzeu(zzednVar2.getKeySize());
    }
}
