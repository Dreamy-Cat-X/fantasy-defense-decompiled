package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbxu extends zzbvk<VideoController.VideoLifecycleCallbacks> {
    private boolean zzesh;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbxu(Set<zzbxf<VideoController.VideoLifecycleCallbacks>> set) {
        super(set);
    }

    public final void onVideoPause() {
        zza(zzbxx.zzfxn);
    }

    public final void onVideoEnd() {
        zza(zzbxw.zzfxn);
    }

    public final synchronized void onVideoStart() {
        zza(zzbxz.zzfxn);
        this.zzesh = true;
    }

    public final synchronized void onVideoPlay() {
        if (!this.zzesh) {
            zza(zzbxy.zzfxn);
            this.zzesh = true;
        }
        zza(zzbyb.zzfxn);
    }
}
