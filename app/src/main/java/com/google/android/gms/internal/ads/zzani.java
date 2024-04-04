package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzani extends zzgw implements zzang {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzani(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String getHeadline() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final List getImages() throws RemoteException {
        Parcel zza = zza(3, zzdo());
        ArrayList zzb = zzgy.zzb(zza);
        zza.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String getBody() throws RemoteException {
        Parcel zza = zza(4, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final zzaej zztm() throws RemoteException {
        Parcel zza = zza(5, zzdo());
        zzaej zzo = zzaem.zzo(zza.readStrongBinder());
        zza.recycle();
        return zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String getCallToAction() throws RemoteException {
        Parcel zza = zza(6, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final double getStarRating() throws RemoteException {
        Parcel zza = zza(7, zzdo());
        double readDouble = zza.readDouble();
        zza.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String getStore() throws RemoteException {
        Parcel zza = zza(8, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String getPrice() throws RemoteException {
        Parcel zza = zza(9, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void recordImpression() throws RemoteException {
        zzb(10, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(11, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zzv(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(12, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final boolean getOverrideImpressionRecording() throws RemoteException {
        Parcel zza = zza(13, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final boolean getOverrideClickHandling() throws RemoteException {
        Parcel zza = zza(14, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final Bundle getExtras() throws RemoteException {
        Parcel zza = zza(15, zzdo());
        Bundle bundle = (Bundle) zzgy.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(16, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final zzyu getVideoController() throws RemoteException {
        Parcel zza = zza(17, zzdo());
        zzyu zzk = zzyx.zzk(zza.readStrongBinder());
        zza.recycle();
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final IObjectWrapper zzvf() throws RemoteException {
        Parcel zza = zza(18, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final zzaeb zztn() throws RemoteException {
        Parcel zza = zza(19, zzdo());
        zzaeb zzm = zzaee.zzm(zza.readStrongBinder());
        zza.recycle();
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final IObjectWrapper zzvg() throws RemoteException {
        Parcel zza = zza(20, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final IObjectWrapper zzto() throws RemoteException {
        Parcel zza = zza(21, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, iObjectWrapper2);
        zzgy.zza(zzdo, iObjectWrapper3);
        zzb(22, zzdo);
    }
}
