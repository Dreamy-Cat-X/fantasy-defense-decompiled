package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcbj extends zzyx {
    private final Object lock = new Object();

    @Nullable
    private zzyu zzgcz;

    @Nullable
    private final zzanm zzgda;

    public zzcbj(@Nullable zzyu zzyuVar, @Nullable zzanm zzanmVar) {
        this.zzgcz = zzyuVar;
        this.zzgda = zzanmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void play() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void stop() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void mute(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final boolean isMuted() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final int getPlaybackState() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final float getDuration() throws RemoteException {
        zzanm zzanmVar = this.zzgda;
        if (zzanmVar != null) {
            return zzanmVar.getVideoDuration();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final float getCurrentTime() throws RemoteException {
        zzanm zzanmVar = this.zzgda;
        if (zzanmVar != null) {
            return zzanmVar.getVideoCurrentTime();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zza(zzyz zzyzVar) throws RemoteException {
        synchronized (this.lock) {
            if (this.zzgcz != null) {
                this.zzgcz.zza(zzyzVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final zzyz zzrf() throws RemoteException {
        synchronized (this.lock) {
            if (this.zzgcz == null) {
                return null;
            }
            return this.zzgcz.zzrf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final float getAspectRatio() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final boolean isCustomControlsEnabled() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final boolean isClickToExpandEnabled() throws RemoteException {
        throw new RemoteException();
    }
}
