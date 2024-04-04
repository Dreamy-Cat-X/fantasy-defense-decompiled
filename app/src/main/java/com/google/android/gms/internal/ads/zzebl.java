package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzebl extends zzeam<zzedv> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebl() {
        super(zzedv.class, new zzebo(zzeid.class));
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzefs.zza zzbao() {
        return zzefs.zza.SYMMETRIC;
    }

    public static void zza(zzedv zzedvVar) throws GeneralSecurityException {
        zzeik.zzz(zzedvVar.getVersion(), 0);
        zzeik.zzfu(zzedvVar.zzbbh().size());
        zza(zzedvVar.zzbbw());
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzeap<?, zzedv> zzbar() {
        return new zzebn(this, zzedy.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(zzedz zzedzVar) throws GeneralSecurityException {
        if (zzedzVar.zzbcc() < 12 || zzedzVar.zzbcc() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ void zzc(zzedv zzedvVar) throws GeneralSecurityException {
        zza(zzedvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ zzedv zzp(zzejg zzejgVar) throws zzeld {
        return zzedv.zzg(zzejgVar, zzekd.zzbhz());
    }
}
