package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzask extends zzgv implements zzasl {
    public zzask() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            zzasm zzasmVar = null;
            zzaso zzasoVar = null;
            zzaso zzasoVar2 = null;
            zzaso zzasoVar3 = null;
            zzaso zzasoVar4 = null;
            if (i == 2) {
                zzasf zzasfVar = (zzasf) zzgy.zza(parcel, zzasf.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof zzasm) {
                        zzasmVar = (zzasm) queryLocalInterface;
                    } else {
                        zzasmVar = new zzasp(readStrongBinder);
                    }
                }
                zza(zzasfVar, zzasmVar);
                parcel2.writeNoException();
            } else if (i == 4) {
                zzasu zzasuVar = (zzasu) zzgy.zza(parcel, zzasu.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface2 instanceof zzaso) {
                        zzasoVar4 = (zzaso) queryLocalInterface2;
                    } else {
                        zzasoVar4 = new zzasq(readStrongBinder2);
                    }
                }
                zza(zzasuVar, zzasoVar4);
                parcel2.writeNoException();
            } else if (i == 5) {
                zzasu zzasuVar2 = (zzasu) zzgy.zza(parcel, zzasu.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface3 instanceof zzaso) {
                        zzasoVar3 = (zzaso) queryLocalInterface3;
                    } else {
                        zzasoVar3 = new zzasq(readStrongBinder3);
                    }
                }
                zzb(zzasuVar2, zzasoVar3);
                parcel2.writeNoException();
            } else if (i == 6) {
                zzasu zzasuVar3 = (zzasu) zzgy.zza(parcel, zzasu.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface4 instanceof zzaso) {
                        zzasoVar2 = (zzaso) queryLocalInterface4;
                    } else {
                        zzasoVar2 = new zzasq(readStrongBinder4);
                    }
                }
                zzc(zzasuVar3, zzasoVar2);
                parcel2.writeNoException();
            } else {
                if (i != 7) {
                    return false;
                }
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface5 instanceof zzaso) {
                        zzasoVar = (zzaso) queryLocalInterface5;
                    } else {
                        zzasoVar = new zzasq(readStrongBinder5);
                    }
                }
                zza(readString, zzasoVar);
                parcel2.writeNoException();
            }
        } else {
            zzash zza = zza((zzasf) zzgy.zza(parcel, zzasf.CREATOR));
            parcel2.writeNoException();
            zzgy.zzb(parcel2, zza);
        }
        return true;
    }
}
