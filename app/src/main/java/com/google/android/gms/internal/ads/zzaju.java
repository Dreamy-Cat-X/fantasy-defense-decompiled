package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.instream.InstreamAd;
import com.google.android.gms.ads.instream.InstreamAdView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaju extends InstreamAd {
    private final zzajj zzdhs;
    private VideoController zzcjq = zzuf();
    private MediaContent zzbni = zzug();

    public zzaju(zzajj zzajjVar) {
        this.zzdhs = zzajjVar;
    }

    @Override // com.google.android.gms.ads.instream.InstreamAd
    public final void zza(InstreamAdView instreamAdView) {
        if (instreamAdView == null) {
            zzaym.zzev("showInView: parameter view must not be null.");
            return;
        }
        try {
            this.zzdhs.zzr(ObjectWrapper.wrap(instreamAdView));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.instream.InstreamAd
    public final MediaContent getMediaContent() {
        return this.zzbni;
    }

    @Override // com.google.android.gms.ads.instream.InstreamAd
    public final VideoController getVideoController() {
        return this.zzcjq;
    }

    @Override // com.google.android.gms.ads.instream.InstreamAd
    public final float getVideoDuration() {
        VideoController videoController = this.zzcjq;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getVideoDuration();
    }

    @Override // com.google.android.gms.ads.instream.InstreamAd
    public final float getVideoCurrentTime() {
        VideoController videoController = this.zzcjq;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getVideoCurrentTime();
    }

    @Override // com.google.android.gms.ads.instream.InstreamAd
    public final float getAspectRatio() {
        VideoController videoController = this.zzcjq;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getAspectRatio();
    }

    @Override // com.google.android.gms.ads.instream.InstreamAd
    public final void destroy() {
        try {
            this.zzdhs.destroy();
            this.zzcjq = null;
            this.zzbni = null;
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    private final VideoController zzuf() {
        VideoController videoController = new VideoController();
        try {
            videoController.zza(this.zzdhs.getVideoController());
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
        return videoController;
    }

    private final MediaContent zzug() {
        try {
            if (this.zzdhs.zztx() != null) {
                return new zzzs(this.zzdhs.zztx());
            }
            return null;
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return null;
        }
    }
}
