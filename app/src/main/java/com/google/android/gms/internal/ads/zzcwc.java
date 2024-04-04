package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcwc implements com.google.android.gms.ads.internal.zzg {
    private final /* synthetic */ zzdmi zzgtm;
    private final /* synthetic */ zzdmt zzgue;
    private final /* synthetic */ zzazc zzgvf;
    private final /* synthetic */ zzcwi zzgvg;
    private final /* synthetic */ zzcwa zzgvh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcwc(zzcwa zzcwaVar, zzazc zzazcVar, zzdmt zzdmtVar, zzdmi zzdmiVar, zzcwi zzcwiVar) {
        this.zzgvh = zzcwaVar;
        this.zzgvf = zzazcVar;
        this.zzgue = zzdmtVar;
        this.zzgtm = zzdmiVar;
        this.zzgvg = zzcwiVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzkb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzkc() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzh(View view) {
        zzcwf zzcwfVar;
        zzazc zzazcVar = this.zzgvf;
        zzcwfVar = this.zzgvh.zzgvc;
        zzazcVar.set(zzcwfVar.zza(this.zzgue, this.zzgtm, view, this.zzgvg));
    }
}
