package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzael extends zzgw implements zzaej {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzael(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final IObjectWrapper zztg() throws RemoteException {
        Parcel zza = zza(1, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final Uri getUri() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        Uri uri = (Uri) zzgy.zza(zza, Uri.CREATOR);
        zza.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final double getScale() throws RemoteException {
        Parcel zza = zza(3, zzdo());
        double readDouble = zza.readDouble();
        zza.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final int getWidth() throws RemoteException {
        Parcel zza = zza(4, zzdo());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final int getHeight() throws RemoteException {
        Parcel zza = zza(5, zzdo());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }
}
