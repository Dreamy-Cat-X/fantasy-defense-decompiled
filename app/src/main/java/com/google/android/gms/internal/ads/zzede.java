package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzede extends zzeap<zzefo, zzefk> {
    private final /* synthetic */ zzedc zzicg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzede(zzedc zzedcVar, Class cls) {
        super(cls);
        this.zzicg = zzedcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzefk zze(zzefo zzefoVar) throws GeneralSecurityException {
        zzefo zzefoVar2 = zzefoVar;
        return (zzefk) ((zzekq) zzefk.zzbds().zzfi(0).zzd(zzefoVar2.zzbdr()).zzae(zzejg.zzt(zzeij.zzft(zzefoVar2.getKeySize()))).zzbiz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzefo zzr(zzejg zzejgVar) throws zzeld {
        return zzefo.zzu(zzejgVar, zzekd.zzbhz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ void zzd(zzefo zzefoVar) throws GeneralSecurityException {
        zzefo zzefoVar2 = zzefoVar;
        if (zzefoVar2.getKeySize() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzedc.zza(zzefoVar2.zzbdr());
    }
}
