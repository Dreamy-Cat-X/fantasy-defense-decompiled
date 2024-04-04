package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaha extends zzagh {
    private final UnifiedNativeAd.UnconfirmedClickListener zzdfw;

    public zzaha(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zzdfw = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void onUnconfirmedClickReceived(String str) {
        this.zzdfw.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void onUnconfirmedClickCancelled() {
        this.zzdfw.onUnconfirmedClickCancelled();
    }
}
