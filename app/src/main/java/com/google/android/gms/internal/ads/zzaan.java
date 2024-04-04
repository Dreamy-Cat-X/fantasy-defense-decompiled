package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaan extends zzyy {
    private final VideoController.VideoLifecycleCallbacks zzadr;

    public zzaan(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zzadr = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onVideoStart() {
        this.zzadr.onVideoStart();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onVideoPlay() {
        this.zzadr.onVideoPlay();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onVideoPause() {
        this.zzadr.onVideoPause();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onVideoEnd() {
        this.zzadr.onVideoEnd();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onVideoMute(boolean z) {
        this.zzadr.onVideoMute(z);
    }
}
