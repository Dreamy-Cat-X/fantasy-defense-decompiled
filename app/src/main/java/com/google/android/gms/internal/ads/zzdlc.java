package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzdlc implements zzdjo {
    static final zzdjo zzgwi = new zzdlc();

    private zzdlc() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjo
    public final void zzp(Object obj) {
        ((AdMetadataListener) obj).onAdMetadataChanged();
    }
}
