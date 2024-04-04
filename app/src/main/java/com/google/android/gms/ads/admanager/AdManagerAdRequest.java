package com.google.android.gms.ads.admanager;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.internal.ads.zzzc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class AdManagerAdRequest extends AdRequest {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class Builder extends AdRequest.Builder {
        @Override // com.google.android.gms.ads.AdRequest.Builder
        public final Builder setAdInfo(AdInfo adInfo) {
            this.zzacs.zza(adInfo);
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        public final /* synthetic */ AdRequest build() {
            return new AdManagerAdRequest(this);
        }
    }

    private AdManagerAdRequest(Builder builder) {
        super(builder);
    }

    @Override // com.google.android.gms.ads.AdRequest
    public final zzzc zzds() {
        return this.zzact;
    }
}
