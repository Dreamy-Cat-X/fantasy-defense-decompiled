package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzafh extends zzgw implements zzaff {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final String zzct(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        Parcel zza = zza(1, zzdo);
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final zzaej zzcu(String str) throws RemoteException {
        zzaej zzaelVar;
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        Parcel zza = zza(2, zzdo);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzaelVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof zzaej) {
                zzaelVar = (zzaej) queryLocalInterface;
            } else {
                zzaelVar = new zzael(readStrongBinder);
            }
        }
        zza.recycle();
        return zzaelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final List<String> getAvailableAssetNames() throws RemoteException {
        Parcel zza = zza(3, zzdo());
        ArrayList<String> createStringArrayList = zza.createStringArrayList();
        zza.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final String getCustomTemplateId() throws RemoteException {
        Parcel zza = zza(4, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void performClick(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(5, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void recordImpression() throws RemoteException {
        zzb(6, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final zzyu getVideoController() throws RemoteException {
        Parcel zza = zza(7, zzdo());
        zzyu zzk = zzyx.zzk(zza.readStrongBinder());
        zza.recycle();
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void destroy() throws RemoteException {
        zzb(8, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final IObjectWrapper zztq() throws RemoteException {
        Parcel zza = zza(9, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        Parcel zza = zza(10, zzdo);
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final IObjectWrapper zztl() throws RemoteException {
        Parcel zza = zza(11, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zztr() throws RemoteException {
        Parcel zza = zza(12, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zzts() throws RemoteException {
        Parcel zza = zza(13, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(14, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void zztt() throws RemoteException {
        zzb(15, zzdo());
    }
}
