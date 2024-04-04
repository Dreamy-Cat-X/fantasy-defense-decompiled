package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzebn extends zzeap<zzedy, zzedv> {
    private final /* synthetic */ zzebl zzibg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzebn(zzebl zzeblVar, Class cls) {
        super(cls);
        this.zzibg = zzeblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzedv zze(zzedy zzedyVar) throws GeneralSecurityException {
        zzedy zzedyVar2 = zzedyVar;
        return (zzedv) ((zzekq) zzedv.zzbbx().zzc(zzedyVar2.zzbbw()).zzu(zzejg.zzt(zzeij.zzft(zzedyVar2.getKeySize()))).zzey(0).zzbiz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ zzedy zzr(zzejg zzejgVar) throws zzeld {
        return zzedy.zzh(zzejgVar, zzekd.zzbhz());
    }

    @Override // com.google.android.gms.internal.ads.zzeap
    public final /* synthetic */ void zzd(zzedy zzedyVar) throws GeneralSecurityException {
        zzedy zzedyVar2 = zzedyVar;
        zzeik.zzfu(zzedyVar2.getKeySize());
        zzebl zzeblVar = this.zzibg;
        zzebl.zza(zzedyVar2.zzbbw());
    }
}
