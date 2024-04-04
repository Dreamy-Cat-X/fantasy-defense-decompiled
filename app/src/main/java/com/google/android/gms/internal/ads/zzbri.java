package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbri extends zzbvk<zzbrj> {
    private boolean zzfxq;

    public zzbri(Set<zzbxf<zzbrj>> set) {
        super(set);
        this.zzfxq = false;
    }

    public final synchronized void onAdImpression() {
        if (!this.zzfxq) {
            zza(zzbrh.zzfxn);
            this.zzfxq = true;
        }
    }
}
