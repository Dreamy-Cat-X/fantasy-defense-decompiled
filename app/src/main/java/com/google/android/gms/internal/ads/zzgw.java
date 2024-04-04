package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzgw implements IInterface {
    private final IBinder zzach;
    private final String zzaci;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgw(IBinder iBinder, String str) {
        this.zzach = iBinder;
        this.zzaci = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.zzach;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel zzdo() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzaci);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel zza(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.zzach.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzb(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.zzach.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzc(int i, Parcel parcel) throws RemoteException {
        try {
            this.zzach.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
