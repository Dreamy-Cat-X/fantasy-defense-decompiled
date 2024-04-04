package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzecs extends zzeao<zzeai, zzefd> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzecs(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzeao
    public final /* synthetic */ zzeai zzah(zzefd zzefdVar) throws GeneralSecurityException {
        zzefd zzefdVar2 = zzefdVar;
        zzeez zzbcx = zzefdVar2.zzbcx();
        zzefg zzbcz = zzbcx.zzbcz();
        return new zzehi(zzehm.zza(zzecw.zza(zzbcz.zzbdm()), zzefdVar2.zzbdh().toByteArray(), zzefdVar2.zzbdi().toByteArray()), zzbcz.zzbdo().toByteArray(), zzecw.zza(zzbcz.zzbdn()), zzecw.zza(zzbcx.zzbdb()), new zzecy(zzbcx.zzbda().zzbcu()));
    }
}
