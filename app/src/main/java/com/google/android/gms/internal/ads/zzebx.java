package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzebx extends zzeam<zzeep> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebx() {
        super(zzeep.class, new zzeca(zzeaf.class));
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzefs.zza zzbao() {
        return zzefs.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzeap<?, zzeep> zzbar() {
        return new zzebz(this, zzees.class);
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ void zzc(zzeep zzeepVar) throws GeneralSecurityException {
        zzeep zzeepVar2 = zzeepVar;
        zzeik.zzz(zzeepVar2.getVersion(), 0);
        if (zzeepVar2.zzbbh().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ zzeep zzp(zzejg zzejgVar) throws zzeld {
        return zzeep.zzo(zzejgVar, zzekd.zzbhz());
    }
}
