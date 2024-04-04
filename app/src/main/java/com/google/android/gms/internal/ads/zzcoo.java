package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcoo implements zzbqw, zzbsg, zzbtf {
    private final zzdro zzdgv;
    private final zzayc zzeaa;
    private final zzdrp zzgon;

    public zzcoo(zzdrp zzdrpVar, zzdro zzdroVar, zzayc zzaycVar) {
        this.zzgon = zzdrpVar;
        this.zzdgv = zzdroVar;
        this.zzeaa = zzaycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void onAdLoaded() {
        this.zzdgv.zzb(this.zzgon.zzu("action", "loaded"));
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzd(zzvc zzvcVar) {
        this.zzgon.zzu("action", "ftl").zzu("ftl", String.valueOf(zzvcVar.errorCode)).zzu("ed", zzvcVar.zzcgt);
        this.zzdgv.zzb(this.zzgon);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzd(zzasu zzasuVar) {
        this.zzgon.zzr(zzasuVar.zzdvn);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzb(zzdmt zzdmtVar) {
        this.zzgon.zza(zzdmtVar, this.zzeaa);
    }
}
