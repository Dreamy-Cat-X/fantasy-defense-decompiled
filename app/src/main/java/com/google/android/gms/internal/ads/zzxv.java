package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzxv extends zzgw implements zzxt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzxg zza(IObjectWrapper iObjectWrapper, zzvp zzvpVar, String str, zzamt zzamtVar, int i) throws RemoteException {
        zzxg zzxiVar;
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzvpVar);
        zzdo.writeString(str);
        zzgy.zza(zzdo, zzamtVar);
        zzdo.writeInt(i);
        Parcel zza = zza(1, zzdo);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzxiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzxg) {
                zzxiVar = (zzxg) queryLocalInterface;
            } else {
                zzxiVar = new zzxi(readStrongBinder);
            }
        }
        zza.recycle();
        return zzxiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzxg zzb(IObjectWrapper iObjectWrapper, zzvp zzvpVar, String str, zzamt zzamtVar, int i) throws RemoteException {
        zzxg zzxiVar;
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzvpVar);
        zzdo.writeString(str);
        zzgy.zza(zzdo, zzamtVar);
        zzdo.writeInt(i);
        Parcel zza = zza(2, zzdo);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzxiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzxg) {
                zzxiVar = (zzxg) queryLocalInterface;
            } else {
                zzxiVar = new zzxi(readStrongBinder);
            }
        }
        zza.recycle();
        return zzxiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzxd zza(IObjectWrapper iObjectWrapper, String str, zzamt zzamtVar, int i) throws RemoteException {
        zzxd zzxfVar;
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeString(str);
        zzgy.zza(zzdo, zzamtVar);
        zzdo.writeInt(i);
        Parcel zza = zza(3, zzdo);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzxfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzxd) {
                zzxfVar = (zzxd) queryLocalInterface;
            } else {
                zzxfVar = new zzxf(readStrongBinder);
            }
        }
        zza.recycle();
        return zzxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzxy zzc(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzxy zzyaVar;
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        Parcel zza = zza(4, zzdo);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzyaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzxy) {
                zzyaVar = (zzxy) queryLocalInterface;
            } else {
                zzyaVar = new zzya(readStrongBinder);
            }
        }
        zza.recycle();
        return zzyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzaen zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, iObjectWrapper2);
        Parcel zza = zza(5, zzdo);
        zzaen zzp = zzaeq.zzp(zza.readStrongBinder());
        zza.recycle();
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzatv zza(IObjectWrapper iObjectWrapper, zzamt zzamtVar, int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzamtVar);
        zzdo.writeInt(i);
        Parcel zza = zza(6, zzdo);
        zzatv zzan = zzatu.zzan(zza.readStrongBinder());
        zza.recycle();
        return zzan;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzarh zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        Parcel zza = zza(7, zzdo);
        zzarh zzak = zzarg.zzak(zza.readStrongBinder());
        zza.recycle();
        return zzak;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzaqs zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        Parcel zza = zza(8, zzdo);
        zzaqs zzai = zzaqv.zzai(zza.readStrongBinder());
        zza.recycle();
        return zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzxy zza(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzxy zzyaVar;
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeInt(i);
        Parcel zza = zza(9, zzdo);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzyaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzxy) {
                zzyaVar = (zzxy) queryLocalInterface;
            } else {
                zzyaVar = new zzya(readStrongBinder);
            }
        }
        zza.recycle();
        return zzyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzxg zza(IObjectWrapper iObjectWrapper, zzvp zzvpVar, String str, int i) throws RemoteException {
        zzxg zzxiVar;
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzvpVar);
        zzdo.writeString(str);
        zzdo.writeInt(i);
        Parcel zza = zza(10, zzdo);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzxiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzxg) {
                zzxiVar = (zzxg) queryLocalInterface;
            } else {
                zzxiVar = new zzxi(readStrongBinder);
            }
        }
        zza.recycle();
        return zzxiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzaeu zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, iObjectWrapper2);
        zzgy.zza(zzdo, iObjectWrapper3);
        Parcel zza = zza(11, zzdo);
        zzaeu zzq = zzaet.zzq(zza.readStrongBinder());
        zza.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzauq zzb(IObjectWrapper iObjectWrapper, String str, zzamt zzamtVar, int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeString(str);
        zzgy.zza(zzdo, zzamtVar);
        zzdo.writeInt(i);
        Parcel zza = zza(12, zzdo);
        zzauq zzar = zzaut.zzar(zza.readStrongBinder());
        zza.recycle();
        return zzar;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzxg zzc(IObjectWrapper iObjectWrapper, zzvp zzvpVar, String str, zzamt zzamtVar, int i) throws RemoteException {
        zzxg zzxiVar;
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzvpVar);
        zzdo.writeString(str);
        zzgy.zza(zzdo, zzamtVar);
        zzdo.writeInt(i);
        Parcel zza = zza(13, zzdo);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzxiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzxg) {
                zzxiVar = (zzxg) queryLocalInterface;
            } else {
                zzxiVar = new zzxi(readStrongBinder);
            }
        }
        zza.recycle();
        return zzxiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzaxc zzb(IObjectWrapper iObjectWrapper, zzamt zzamtVar, int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzamtVar);
        zzdo.writeInt(i);
        Parcel zza = zza(14, zzdo);
        zzaxc zzas = zzaxf.zzas(zza.readStrongBinder());
        zza.recycle();
        return zzas;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzaqh zzc(IObjectWrapper iObjectWrapper, zzamt zzamtVar, int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzamtVar);
        zzdo.writeInt(i);
        Parcel zza = zza(15, zzdo);
        zzaqh zzag = zzaqk.zzag(zza.readStrongBinder());
        zza.recycle();
        return zzag;
    }
}
