package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzyg extends zzye {
    private final MuteThisAdListener zzcjg;

    public zzyg(MuteThisAdListener muteThisAdListener) {
        this.zzcjg = muteThisAdListener;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final void onAdMuted() {
        this.zzcjg.onAdMuted();
    }
}
