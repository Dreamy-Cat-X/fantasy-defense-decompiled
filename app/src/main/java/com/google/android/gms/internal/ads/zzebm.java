package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzebm extends zzeap<zzedu, zzedr> {
    private final /* synthetic */ zzebk zzibf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzebm(zzebk zzebkVar, Class cls) {
        super(cls);
        this.zzibf = zzebkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzedr zze(zzedu zzeduVar) throws GeneralSecurityException {
        zzedu zzeduVar2 = zzeduVar;
        zzedv zze = new zzebl().zzbar().zze(zzeduVar2.zzbbt());
        return (zzedr) ((zzekq) zzedr.zzbbr().zzc(zze).zzc(new zzedc().zzbar().zze(zzeduVar2.zzbbu())).zzex(0).zzbiz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzedu zzr(zzejg zzejgVar) throws zzeld {
        return zzedu.zzf(zzejgVar, zzekd.zzbhz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ void zzd(zzedu zzeduVar) throws GeneralSecurityException {
        zzedu zzeduVar2 = zzeduVar;
        new zzebl().zzbar().zzd(zzeduVar2.zzbbt());
        new zzedc().zzbar().zzd(zzeduVar2.zzbbu());
        zzeik.zzfu(zzeduVar2.zzbbt().getKeySize());
    }
}
