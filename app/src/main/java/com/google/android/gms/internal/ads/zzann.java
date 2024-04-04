package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzann extends zzyx {
    private final Object lock = new Object();
    private volatile zzyz zzdmb;

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
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final float getCurrentTime() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zza(zzyz zzyzVar) throws RemoteException {
        synchronized (this.lock) {
            this.zzdmb = zzyzVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final zzyz zzrf() throws RemoteException {
        zzyz zzyzVar;
        synchronized (this.lock) {
            zzyzVar = this.zzdmb;
        }
        return zzyzVar;
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
