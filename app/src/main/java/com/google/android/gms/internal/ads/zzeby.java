package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeby extends zzeap<zzeeo, zzeel> {
    private final /* synthetic */ zzebw zzibj;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeby(zzebw zzebwVar, Class cls) {
        super(cls);
        this.zzibj = zzebwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzeel zze(zzeeo zzeeoVar) throws GeneralSecurityException {
        return (zzeel) ((zzekq) zzeel.zzbco().zzx(zzejg.zzt(zzeij.zzft(zzeeoVar.getKeySize()))).zzfb(0).zzbiz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzeeo zzr(zzejg zzejgVar) throws zzeld {
        return zzeeo.zzn(zzejgVar, zzekd.zzbhz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ void zzd(zzeeo zzeeoVar) throws GeneralSecurityException {
        zzeik.zzfu(zzeeoVar.getKeySize());
    }
}
