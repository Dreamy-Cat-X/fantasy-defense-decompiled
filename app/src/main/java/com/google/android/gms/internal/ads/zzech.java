package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzech extends zzeam<zzegr> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzech() {
        super(zzegr.class, new zzeck(zzeaf.class));
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzefs.zza zzbao() {
        return zzefs.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzeap<?, zzegr> zzbar() {
        return new zzecj(this, zzegs.class);
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ void zzc(zzegr zzegrVar) throws GeneralSecurityException {
        zzegr zzegrVar2 = zzegrVar;
        zzeik.zzz(zzegrVar2.getVersion(), 0);
        if (zzegrVar2.zzbbh().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ zzegr zzp(zzejg zzejgVar) throws zzeld {
        return zzegr.zzz(zzejgVar, zzekd.zzbhz());
    }
}
