package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzzh extends zzwr {
    private final /* synthetic */ zzze zzcke;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzh(zzze zzzeVar) {
        this.zzcke = zzzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwr, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        VideoController videoController;
        videoController = this.zzcke.zzcjq;
        videoController.zza(this.zzcke.zzdw());
        super.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzwr, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(int i) {
        VideoController videoController;
        videoController = this.zzcke.zzcjq;
        videoController.zza(this.zzcke.zzdw());
        super.onAdFailedToLoad(i);
    }

    @Override // com.google.android.gms.internal.ads.zzwr, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        VideoController videoController;
        videoController = this.zzcke.zzcjq;
        videoController.zza(this.zzcke.zzdw());
        super.onAdFailedToLoad(loadAdError);
    }
}
