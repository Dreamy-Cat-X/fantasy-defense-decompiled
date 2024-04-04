package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzebq extends zzeam<zzeec> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebq() {
        super(zzeec.class, new zzebp(zzeaf.class));
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzefs.zza zzbao() {
        return zzefs.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzeap<?, zzeec> zzbar() {
        return new zzebs(this, zzeed.class);
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ void zzc(zzeec zzeecVar) throws GeneralSecurityException {
        zzeec zzeecVar2 = zzeecVar;
        zzeik.zzz(zzeecVar2.getVersion(), 0);
        zzeik.zzfu(zzeecVar2.zzbbh().size());
        if (zzeecVar2.zzbcf().zzbcc() != 12 && zzeecVar2.zzbcf().zzbcc() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ zzeec zzp(zzejg zzejgVar) throws zzeld {
        return zzeec.zzi(zzejgVar, zzekd.zzbhz());
    }
}
