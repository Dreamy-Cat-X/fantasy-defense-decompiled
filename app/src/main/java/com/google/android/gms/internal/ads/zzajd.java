package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzajd implements AdapterStatus {
    private final String description;
    private final int zzdhm;
    private final AdapterStatus.State zzdhn;

    public zzajd(AdapterStatus.State state, String str, int i) {
        this.zzdhn = state;
        this.description = str;
        this.zzdhm = i;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.zzdhn;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.description;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.zzdhm;
    }
}
