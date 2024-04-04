package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcjk implements zzbqw, zzbsg, zzbtf {
    private final zzcjs zzgjv;
    private final zzckd zzgjw;

    public zzcjk(zzcjs zzcjsVar, zzckd zzckdVar) {
        this.zzgjv = zzcjsVar;
        this.zzgjw = zzckdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void onAdLoaded() {
        this.zzgjv.zzsq().put("action", "loaded");
        this.zzgjw.zzo(this.zzgjv.zzsq());
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzd(zzvc zzvcVar) {
        this.zzgjv.zzsq().put("action", "ftl");
        this.zzgjv.zzsq().put("ftl", String.valueOf(zzvcVar.errorCode));
        this.zzgjv.zzsq().put("ed", zzvcVar.zzcgt);
        this.zzgjw.zzo(this.zzgjv.zzsq());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzd(zzasu zzasuVar) {
        this.zzgjv.zzi(zzasuVar.zzdvn);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzb(zzdmt zzdmtVar) {
        this.zzgjv.zzc(zzdmtVar);
    }
}
