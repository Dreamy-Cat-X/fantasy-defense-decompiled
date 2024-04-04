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
public final class zzagl extends zzgw implements zzagj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String getHeadline() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final List getImages() throws RemoteException {
        Parcel zza = zza(3, zzdo());
        ArrayList zzb = zzgy.zzb(zza);
        zza.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String getBody() throws RemoteException {
        Parcel zza = zza(4, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final zzaej zztm() throws RemoteException {
        zzaej zzaelVar;
        Parcel zza = zza(5, zzdo());
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

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String getCallToAction() throws RemoteException {
        Parcel zza = zza(6, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String getAdvertiser() throws RemoteException {
        Parcel zza = zza(7, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final double getStarRating() throws RemoteException {
        Parcel zza = zza(8, zzdo());
        double readDouble = zza.readDouble();
        zza.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String getStore() throws RemoteException {
        Parcel zza = zza(9, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String getPrice() throws RemoteException {
        Parcel zza = zza(10, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final zzyu getVideoController() throws RemoteException {
        Parcel zza = zza(11, zzdo());
        zzyu zzk = zzyx.zzk(zza.readStrongBinder());
        zza.recycle();
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel zza = zza(12, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void destroy() throws RemoteException {
        zzb(13, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final zzaeb zztn() throws RemoteException {
        zzaeb zzaedVar;
        Parcel zza = zza(14, zzdo());
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

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void performClick(Bundle bundle) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, bundle);
        zzb(15, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final boolean recordImpression(Bundle bundle) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, bundle);
        Parcel zza = zza(16, zzdo);
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void reportTouchEvent(Bundle bundle) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, bundle);
        zzb(17, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final IObjectWrapper zztl() throws RemoteException {
        Parcel zza = zza(18, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final IObjectWrapper zzto() throws RemoteException {
        Parcel zza = zza(19, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final Bundle getExtras() throws RemoteException {
        Parcel zza = zza(20, zzdo());
        Bundle bundle = (Bundle) zzgy.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void zza(zzagi zzagiVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzagiVar);
        zzb(21, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void cancelUnconfirmedClick() throws RemoteException {
        zzb(22, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final List getMuteThisAdReasons() throws RemoteException {
        Parcel zza = zza(23, zzdo());
        ArrayList zzb = zzgy.zzb(zza);
        zza.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final boolean isCustomMuteThisAdEnabled() throws RemoteException {
        Parcel zza = zza(24, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void zza(zzyj zzyjVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzyjVar);
        zzb(25, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void zza(zzyf zzyfVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzyfVar);
        zzb(26, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void zztw() throws RemoteException {
        zzb(27, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void recordCustomClickGesture() throws RemoteException {
        zzb(28, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final zzaei zztx() throws RemoteException {
        zzaei zzaekVar;
        Parcel zza = zza(29, zzdo());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzaekVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            if (queryLocalInterface instanceof zzaei) {
                zzaekVar = (zzaei) queryLocalInterface;
            } else {
                zzaekVar = new zzaek(readStrongBinder);
            }
        }
        zza.recycle();
        return zzaekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final boolean isCustomClickGestureEnabled() throws RemoteException {
        Parcel zza = zza(30, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final zzyt zzkh() throws RemoteException {
        Parcel zza = zza(31, zzdo());
        zzyt zzj = zzys.zzj(zza.readStrongBinder());
        zza.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void zza(zzyo zzyoVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzyoVar);
        zzb(32, zzdo);
    }
}
