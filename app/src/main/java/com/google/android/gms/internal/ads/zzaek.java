package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaek extends zzgw implements zzaei {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaek(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final float getAspectRatio() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(3, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final IObjectWrapper zztk() throws RemoteException {
        Parcel zza = zza(4, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final float getDuration() throws RemoteException {
        Parcel zza = zza(5, zzdo());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final float getCurrentTime() throws RemoteException {
        Parcel zza = zza(6, zzdo());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final zzyu getVideoController() throws RemoteException {
        Parcel zza = zza(7, zzdo());
        zzyu zzk = zzyx.zzk(zza.readStrongBinder());
        zza.recycle();
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final boolean hasVideoContent() throws RemoteException {
        Parcel zza = zza(8, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final void zza(zzafv zzafvVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzafvVar);
        zzb(9, zzdo);
    }
}
