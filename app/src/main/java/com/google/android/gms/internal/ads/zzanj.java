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
public final class zzanj extends zzgw implements zzanh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final String getHeadline() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final List getImages() throws RemoteException {
        Parcel zza = zza(3, zzdo());
        ArrayList zzb = zzgy.zzb(zza);
        zza.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final String getBody() throws RemoteException {
        Parcel zza = zza(4, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final zzaej zztp() throws RemoteException {
        Parcel zza = zza(5, zzdo());
        zzaej zzo = zzaem.zzo(zza.readStrongBinder());
        zza.recycle();
        return zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final String getCallToAction() throws RemoteException {
        Parcel zza = zza(6, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final String getAdvertiser() throws RemoteException {
        Parcel zza = zza(7, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final void recordImpression() throws RemoteException {
        zzb(8, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(9, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final void zzv(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(10, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final boolean getOverrideImpressionRecording() throws RemoteException {
        Parcel zza = zza(11, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final boolean getOverrideClickHandling() throws RemoteException {
        Parcel zza = zza(12, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final Bundle getExtras() throws RemoteException {
        Parcel zza = zza(13, zzdo());
        Bundle bundle = (Bundle) zzgy.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(14, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final IObjectWrapper zzvf() throws RemoteException {
        Parcel zza = zza(15, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final zzyu getVideoController() throws RemoteException {
        Parcel zza = zza(16, zzdo());
        zzyu zzk = zzyx.zzk(zza.readStrongBinder());
        zza.recycle();
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final zzaeb zztn() throws RemoteException {
        Parcel zza = zza(19, zzdo());
        zzaeb zzm = zzaee.zzm(zza.readStrongBinder());
        zza.recycle();
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final IObjectWrapper zzvg() throws RemoteException {
        Parcel zza = zza(20, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final IObjectWrapper zzto() throws RemoteException {
        Parcel zza = zza(21, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, iObjectWrapper2);
        zzgy.zza(zzdo, iObjectWrapper3);
        zzb(22, zzdo);
    }
}
