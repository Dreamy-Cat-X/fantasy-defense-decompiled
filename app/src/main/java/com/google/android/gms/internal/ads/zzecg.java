package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzecg extends zzeam<zzegi> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzecg() {
        super(zzegi.class, new zzecf(zzeaf.class));
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzefs.zza zzbao() {
        return zzefs.zza.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzeap<?, zzegi> zzbar() {
        return new zzeci(this, zzegl.class);
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ void zzc(zzegi zzegiVar) throws GeneralSecurityException {
        zzeik.zzz(zzegiVar.getVersion(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ zzegi zzp(zzejg zzejgVar) throws zzeld {
        return zzegi.zzx(zzejgVar, zzekd.zzbhz());
    }
}
