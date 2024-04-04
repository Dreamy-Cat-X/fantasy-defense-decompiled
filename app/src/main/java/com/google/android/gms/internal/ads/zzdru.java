package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdru implements zzdro {
    private final zzdry zzgkk;
    private final zzdrw zzgkl;
    private final zzdrl zzhqe;

    public zzdru(zzdrl zzdrlVar, zzdry zzdryVar, zzdrw zzdrwVar) {
        this.zzhqe = zzdrlVar;
        this.zzgkk = zzdryVar;
        this.zzgkl = zzdrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdro
    public final void zzb(zzdrp zzdrpVar) {
        this.zzhqe.zzgx(zzc(zzdrpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdro
    public final String zzc(zzdrp zzdrpVar) {
        zzdry zzdryVar = this.zzgkk;
        Map<String, String> zzlr = zzdrpVar.zzlr();
        this.zzgkl.zzq(zzlr);
        return zzdryVar.zzr(zzlr);
    }
}
