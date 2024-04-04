package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzedb extends zzeam<zzedm> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedb() {
        super(zzedm.class, new zzeda(zzeas.class));
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzefs.zza zzbao() {
        return zzefs.zza.SYMMETRIC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(zzedq zzedqVar) throws GeneralSecurityException {
        if (zzedqVar.zzbbm() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzedqVar.zzbbm() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzeu(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzeap<?, zzedm> zzbar() {
        return new zzedd(this, zzedn.class);
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ void zzc(zzedm zzedmVar) throws GeneralSecurityException {
        zzedm zzedmVar2 = zzedmVar;
        zzeik.zzz(zzedmVar2.getVersion(), 0);
        zzeu(zzedmVar2.zzbbh().size());
        zza(zzedmVar2.zzbbi());
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ zzedm zzp(zzejg zzejgVar) throws zzeld {
        return zzedm.zzc(zzejgVar, zzekd.zzbhz());
    }
}
