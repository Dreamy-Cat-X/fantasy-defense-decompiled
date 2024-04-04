package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzecc extends zzeam<zzege> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzecc() {
        super(zzege.class, new zzecb(zzeaf.class));
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzefs.zza zzbao() {
        return zzefs.zza.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzeap<?, zzege> zzbar() {
        return new zzece(this, zzegh.class);
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ void zzc(zzege zzegeVar) throws GeneralSecurityException {
        zzeik.zzz(zzegeVar.getVersion(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ zzege zzp(zzejg zzejgVar) throws zzeld {
        return zzege.zzv(zzejgVar, zzekd.zzbhz());
    }
}
