package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public interface IGmsServiceBroker extends IInterface {
    void getService(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) throws RemoteException;

    /* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static abstract class Stub extends Binder implements IGmsServiceBroker {
        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static class zza implements IGmsServiceBroker {
            private final IBinder zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            public zza(IBinder iBinder) {
                this.zza = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.zza;
            }

            @Override // com.google.android.gms.common.internal.IGmsServiceBroker
            public final void getService(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(iGmsCallbacks != null ? iGmsCallbacks.asBinder() : null);
                    if (getServiceRequest != null) {
                        obtain.writeInt(1);
                        getServiceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zza.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IGmsCallbacks zzoVar;
            if (i > 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzoVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                if (queryLocalInterface instanceof IGmsCallbacks) {
                    zzoVar = (IGmsCallbacks) queryLocalInterface;
                } else {
                    zzoVar = new zzo(readStrongBinder);
                }
            }
            if (i == 46) {
                getService(zzoVar, parcel.readInt() != 0 ? GetServiceRequest.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i == 47) {
                if (parcel.readInt() != 0) {
                    zzv.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            }
            parcel.readInt();
            if (i != 4) {
                parcel.readString();
            }
            if (i == 1) {
                parcel.readString();
                parcel.createStringArray();
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
            } else {
                if (i != 2 && i != 23 && i != 25 && i != 27) {
                    if (i != 30) {
                        if (i == 34) {
                            parcel.readString();
                        } else if (i != 41 && i != 43 && i != 37 && i != 38) {
                            switch (i) {
                                case 9:
                                    parcel.readString();
                                    parcel.createStringArray();
                                    parcel.readString();
                                    parcel.readStrongBinder();
                                    parcel.readString();
                                    if (parcel.readInt() != 0) {
                                        break;
                                    }
                                    break;
                                case 10:
                                    parcel.readString();
                                    parcel.createStringArray();
                                    break;
                                case 19:
                                    parcel.readStrongBinder();
                                    if (parcel.readInt() != 0) {
                                        break;
                                    }
                                    break;
                            }
                        }
                    }
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                }
                if (parcel.readInt() != 0) {
                }
            }
            throw new UnsupportedOperationException();
        }
    }
}
