package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzebt extends zzeap<zzeek, zzeeh> {
    private final /* synthetic */ zzebr zzibi;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzebt(zzebr zzebrVar, Class cls) {
        super(cls);
        this.zzibi = zzebrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzeeh zze(zzeek zzeekVar) throws GeneralSecurityException {
        return (zzeeh) ((zzekq) zzeeh.zzbcl().zzw(zzejg.zzt(zzeij.zzft(zzeekVar.getKeySize()))).zzfa(0).zzbiz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzeek zzr(zzejg zzejgVar) throws zzeld {
        return zzeek.zzl(zzejgVar, zzekd.zzbhz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ void zzd(zzeek zzeekVar) throws GeneralSecurityException {
        zzeik.zzfu(zzeekVar.getKeySize());
    }
}
