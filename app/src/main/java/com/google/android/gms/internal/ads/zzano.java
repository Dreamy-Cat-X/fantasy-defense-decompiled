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
public final class zzano extends zzgw implements zzanm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzano(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final String getHeadline() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final List getImages() throws RemoteException {
        Parcel zza = zza(3, zzdo());
        ArrayList zzb = zzgy.zzb(zza);
        zza.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final String getBody() throws RemoteException {
        Parcel zza = zza(4, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final zzaej zztm() throws RemoteException {
        Parcel zza = zza(5, zzdo());
        zzaej zzo = zzaem.zzo(zza.readStrongBinder());
        zza.recycle();
        return zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final String getCallToAction() throws RemoteException {
        Parcel zza = zza(6, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final String getAdvertiser() throws RemoteException {
        Parcel zza = zza(7, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final double getStarRating() throws RemoteException {
        Parcel zza = zza(8, zzdo());
        double readDouble = zza.readDouble();
        zza.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final String getStore() throws RemoteException {
        Parcel zza = zza(9, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final String getPrice() throws RemoteException {
        Parcel zza = zza(10, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final zzyu getVideoController() throws RemoteException {
        Parcel zza = zza(11, zzdo());
        zzyu zzk = zzyx.zzk(zza.readStrongBinder());
        zza.recycle();
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final zzaeb zztn() throws RemoteException {
        Parcel zza = zza(12, zzdo());
        zzaeb zzm = zzaee.zzm(zza.readStrongBinder());
        zza.recycle();
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final IObjectWrapper zzvf() throws RemoteException {
        Parcel zza = zza(13, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final IObjectWrapper zzvg() throws RemoteException {
        Parcel zza = zza(14, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final IObjectWrapper zzto() throws RemoteException {
        Parcel zza = zza(15, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final Bundle getExtras() throws RemoteException {
        Parcel zza = zza(16, zzdo());
        Bundle bundle = (Bundle) zzgy.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final boolean getOverrideImpressionRecording() throws RemoteException {
        Parcel zza = zza(17, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final boolean getOverrideClickHandling() throws RemoteException {
        Parcel zza = zza(18, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final void recordImpression() throws RemoteException {
        zzb(19, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(20, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, iObjectWrapper2);
        zzgy.zza(zzdo, iObjectWrapper3);
        zzb(21, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(22, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final float getMediaContentAspectRatio() throws RemoteException {
        Parcel zza = zza(23, zzdo());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final float getVideoDuration() throws RemoteException {
        Parcel zza = zza(24, zzdo());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final float getVideoCurrentTime() throws RemoteException {
        Parcel zza = zza(25, zzdo());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }
}
