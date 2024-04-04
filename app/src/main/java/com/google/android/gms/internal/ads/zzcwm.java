package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcwm implements com.google.android.gms.ads.internal.zzg {
    private final /* synthetic */ zzbyf zzgvo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcwm(zzcwl zzcwlVar, zzbyf zzbyfVar) {
        this.zzgvo = zzbyfVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzh(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzkb() {
        this.zzgvo.zzagg().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzkc() {
        this.zzgvo.zzagh().onAdImpression();
        this.zzgvo.zzagi().zzamp();
    }
}
