package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzafd extends zzgw implements zzafb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final IObjectWrapper zztl() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final String getHeadline() throws RemoteException {
        Parcel zza = zza(3, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final List getImages() throws RemoteException {
        Parcel zza = zza(4, zzdo());
        ArrayList zzb = zzgy.zzb(zza);
        zza.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final String getBody() throws RemoteException {
        Parcel zza = zza(5, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final zzaej zztp() throws RemoteException {
        zzaej zzaelVar;
        Parcel zza = zza(6, zzdo());
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

    @Override // com.google.android.gms.internal.ads.zzafb
    public final String getCallToAction() throws RemoteException {
        Parcel zza = zza(7, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final String getAdvertiser() throws RemoteException {
        Parcel zza = zza(8, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final Bundle getExtras() throws RemoteException {
        Parcel zza = zza(9, zzdo());
        Bundle bundle = (Bundle) zzgy.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void destroy() throws RemoteException {
        zzb(10, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final zzyu getVideoController() throws RemoteException {
        Parcel zza = zza(11, zzdo());
        zzyu zzk = zzyx.zzk(zza.readStrongBinder());
        zza.recycle();
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void performClick(Bundle bundle) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, bundle);
        zzb(12, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final boolean recordImpression(Bundle bundle) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, bundle);
        Parcel zza = zza(13, zzdo);
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void reportTouchEvent(Bundle bundle) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, bundle);
        zzb(14, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final zzaeb zztn() throws RemoteException {
        zzaeb zzaedVar;
        Parcel zza = zza(15, zzdo());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzaedVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof zzaeb) {
                zzaedVar = (zzaeb) queryLocalInterface;
            } else {
                zzaedVar = new zzaed(readStrongBinder);
            }
        }
        zza.recycle();
        return zzaedVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final IObjectWrapper zzto() throws RemoteException {
        Parcel zza = zza(16, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel zza = zza(17, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }
}
