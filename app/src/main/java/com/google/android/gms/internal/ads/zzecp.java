package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzecp extends zzeam<zzefd> {
    public zzecp() {
        super(zzefd.class, new zzecs(zzeai.class));
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzefs.zza zzbao() {
        return zzefs.zza.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ void zzc(zzefd zzefdVar) throws GeneralSecurityException {
        zzefd zzefdVar2 = zzefdVar;
        zzeik.zzz(zzefdVar2.getVersion(), 0);
        zzecw.zza(zzefdVar2.zzbcx());
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ zzefd zzp(zzejg zzejgVar) throws zzeld {
        return zzefd.zzs(zzejgVar, zzekd.zzbhz());
    }
}
