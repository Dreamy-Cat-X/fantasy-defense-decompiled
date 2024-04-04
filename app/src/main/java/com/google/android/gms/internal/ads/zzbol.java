package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbol implements zzbqr, zzbrj, zzbsg, zzbtf, zzuz {
    private final Clock zzbpw;
    private final zzaxr zzfvv;

    public zzbol(Clock clock, zzaxr zzaxrVar) {
        this.zzbpw = clock;
        this.zzfvv = zzaxrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdOpened() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzb(zzato zzatoVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzd(zzasu zzasuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void onAdClicked() {
        this.zzfvv.zzxh();
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void onAdLoaded() {
        this.zzfvv.zzan(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final void onAdImpression() {
        this.zzfvv.zzxg();
    }

    public final void zzf(zzvi zzviVar) {
        this.zzfvv.zze(zzviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzb(zzdmt zzdmtVar) {
        this.zzfvv.zzey(this.zzbpw.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdClosed() {
        this.zzfvv.zzxi();
    }

    public final String zzxj() {
        return this.zzfvv.zzxj();
    }
}
