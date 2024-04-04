package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzvj extends zzxm {
    private final AdMetadataListener zzchn;

    public zzvj(AdMetadataListener adMetadataListener) {
        this.zzchn = adMetadataListener;
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void onAdMetadataChanged() {
        AdMetadataListener adMetadataListener = this.zzchn;
        if (adMetadataListener != null) {
            adMetadataListener.onAdMetadataChanged();
        }
    }
}
