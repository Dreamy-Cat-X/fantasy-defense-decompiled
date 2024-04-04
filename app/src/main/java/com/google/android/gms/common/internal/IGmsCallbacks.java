package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    void zza(int i, Bundle bundle) throws RemoteException;

    void zza(int i, IBinder iBinder, zzc zzcVar) throws RemoteException;

    /* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static abstract class zza extends com.google.android.gms.internal.common.zza implements IGmsCallbacks {
        public zza() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        @Override // com.google.android.gms.internal.common.zza
        protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                onPostInitComplete(parcel.readInt(), parcel.readStrongBinder(), (Bundle) com.google.android.gms.internal.common.zzd.zza(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                zza(parcel.readInt(), (Bundle) com.google.android.gms.internal.common.zzd.zza(parcel, Bundle.CREATOR));
            } else {
                if (i != 3) {
                    return false;
                }
                zza(parcel.readInt(), parcel.readStrongBinder(), (zzc) com.google.android.gms.internal.common.zzd.zza(parcel, zzc.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
