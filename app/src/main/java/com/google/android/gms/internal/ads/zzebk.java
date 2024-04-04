package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzebk extends zzeam<zzedr> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebk() {
        super(zzedr.class, new zzebj(zzeaf.class));
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzefs.zza zzbao() {
        return zzefs.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzeap<?, zzedr> zzbar() {
        return new zzebm(this, zzedu.class);
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ void zzc(zzedr zzedrVar) throws GeneralSecurityException {
        zzedr zzedrVar2 = zzedrVar;
        zzeik.zzz(zzedrVar2.getVersion(), 0);
        new zzebl();
        zzebl.zza(zzedrVar2.zzbbp());
        new zzedc();
        zzedc.zza(zzedrVar2.zzbbq());
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ zzedr zzp(zzejg zzejgVar) throws zzeld {
        return zzedr.zze(zzejgVar, zzekd.zzbhz());
    }
}
