package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaan;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzyu;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object lock = new Object();
    private zzyu zzadq;
    private VideoLifecycleCallbacks zzadr;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public final void zza(zzyu zzyuVar) {
        synchronized (this.lock) {
            this.zzadq = zzyuVar;
            if (this.zzadr != null) {
                setVideoLifecycleCallbacks(this.zzadr);
            }
        }
    }

    public final zzyu zzdw() {
        zzyu zzyuVar;
        synchronized (this.lock) {
            zzyuVar = this.zzadq;
        }
        return zzyuVar;
    }

    public final void play() {
        synchronized (this.lock) {
            if (this.zzadq == null) {
                return;
            }
            try {
                this.zzadq.play();
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call play on video controller.", e);
            }
        }
    }

    public final void pause() {
        synchronized (this.lock) {
            if (this.zzadq == null) {
                return;
            }
            try {
                this.zzadq.pause();
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call pause on video controller.", e);
            }
        }
    }

    public final void stop() {
        synchronized (this.lock) {
            if (this.zzadq == null) {
                return;
            }
            try {
                this.zzadq.stop();
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call stop on video controller.", e);
            }
        }
    }

    public final void mute(boolean z) {
        synchronized (this.lock) {
            if (this.zzadq == null) {
                return;
            }
            try {
                this.zzadq.mute(z);
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call mute on video controller.", e);
            }
        }
    }

    public final boolean isMuted() {
        synchronized (this.lock) {
            if (this.zzadq == null) {
                return true;
            }
            try {
                return this.zzadq.isMuted();
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public final int getPlaybackState() {
        synchronized (this.lock) {
            if (this.zzadq == null) {
                return 0;
            }
            try {
                return this.zzadq.getPlaybackState();
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public final boolean isCustomControlsEnabled() {
        synchronized (this.lock) {
            if (this.zzadq == null) {
                return false;
            }
            try {
                return this.zzadq.isCustomControlsEnabled();
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public final boolean isClickToExpandEnabled() {
        synchronized (this.lock) {
            if (this.zzadq == null) {
                return false;
            }
            try {
                return this.zzadq.isClickToExpandEnabled();
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public final float getVideoDuration() {
        synchronized (this.lock) {
            if (this.zzadq == null) {
                return 0.0f;
            }
            try {
                return this.zzadq.getDuration();
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call getDuration on video controller.", e);
                return 0.0f;
            }
        }
    }

    public final float getVideoCurrentTime() {
        synchronized (this.lock) {
            if (this.zzadq == null) {
                return 0.0f;
            }
            try {
                return this.zzadq.getCurrentTime();
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call getCurrentTime on video controller.", e);
                return 0.0f;
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        Preconditions.checkNotNull(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.lock) {
            this.zzadr = videoLifecycleCallbacks;
            if (this.zzadq == null) {
                return;
            }
            try {
                this.zzadq.zza(new zzaan(videoLifecycleCallbacks));
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }

    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.lock) {
            videoLifecycleCallbacks = this.zzadr;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzadq != null;
        }
        return z;
    }

    @Deprecated
    public final float getAspectRatio() {
        synchronized (this.lock) {
            if (this.zzadq == null) {
                return 0.0f;
            }
            try {
                return this.zzadq.getAspectRatio();
            } catch (RemoteException e) {
                zzaym.zzc("Unable to call getAspectRatio on video controller.", e);
                return 0.0f;
            }
        }
    }
}
