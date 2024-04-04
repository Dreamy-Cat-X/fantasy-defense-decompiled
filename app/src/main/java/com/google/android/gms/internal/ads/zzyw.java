package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzyw extends zzgw implements zzyu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void play() throws RemoteException {
        zzb(1, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void pause() throws RemoteException {
        zzb(2, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void mute(boolean z) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.writeBoolean(zzdo, z);
        zzb(3, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final boolean isMuted() throws RemoteException {
        Parcel zza = zza(4, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final int getPlaybackState() throws RemoteException {
        Parcel zza = zza(5, zzdo());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final float getDuration() throws RemoteException {
        Parcel zza = zza(6, zzdo());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final float getCurrentTime() throws RemoteException {
        Parcel zza = zza(7, zzdo());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zza(zzyz zzyzVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzyzVar);
        zzb(8, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final float getAspectRatio() throws RemoteException {
        Parcel zza = zza(9, zzdo());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final boolean isCustomControlsEnabled() throws RemoteException {
        Parcel zza = zza(10, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final zzyz zzrf() throws RemoteException {
        zzyz zzzbVar;
        Parcel zza = zza(11, zzdo());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzzbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            if (queryLocalInterface instanceof zzyz) {
                zzzbVar = (zzyz) queryLocalInterface;
            } else {
                zzzbVar = new zzzb(readStrongBinder);
            }
        }
        zza.recycle();
        return zzzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final boolean isClickToExpandEnabled() throws RemoteException {
        Parcel zza = zza(12, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void stop() throws RemoteException {
        zzb(13, zzdo());
    }
}
