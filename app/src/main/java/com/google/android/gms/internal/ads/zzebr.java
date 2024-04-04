package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzebr extends zzeam<zzeeh> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebr() {
        super(zzeeh.class, new zzebu(zzeaf.class));
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzefs.zza zzbao() {
        return zzefs.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzeap<?, zzeeh> zzbar() {
        return new zzebt(this, zzeek.class);
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ void zzc(zzeeh zzeehVar) throws GeneralSecurityException {
        zzeeh zzeehVar2 = zzeehVar;
        zzeik.zzz(zzeehVar2.getVersion(), 0);
        zzeik.zzfu(zzeehVar2.zzbbh().size());
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ zzeeh zzp(zzejg zzejgVar) throws zzeld {
        return zzeeh.zzk(zzejgVar, zzekd.zzbhz());
    }
}
