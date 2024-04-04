package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzanf extends zzgv implements zzang {
    public zzanf() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String headline = getHeadline();
                parcel2.writeNoException();
                parcel2.writeString(headline);
                return true;
            case 3:
                List images = getImages();
                parcel2.writeNoException();
                parcel2.writeList(images);
                return true;
            case 4:
                String body = getBody();
                parcel2.writeNoException();
                parcel2.writeString(body);
                return true;
            case 5:
                zzaej zztm = zztm();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zztm);
                return true;
            case 6:
                String callToAction = getCallToAction();
                parcel2.writeNoException();
                parcel2.writeString(callToAction);
                return true;
            case 7:
                double starRating = getStarRating();
                parcel2.writeNoException();
                parcel2.writeDouble(starRating);
                return true;
            case 8:
                String store = getStore();
                parcel2.writeNoException();
                parcel2.writeString(store);
                return true;
            case 9:
                String price = getPrice();
                parcel2.writeNoException();
                parcel2.writeString(price);
                return true;
            case 10:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 11:
                zzu(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                zzv(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean overrideImpressionRecording = getOverrideImpressionRecording();
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, overrideImpressionRecording);
                return true;
            case 14:
                boolean overrideClickHandling = getOverrideClickHandling();
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, overrideClickHandling);
                return true;
            case 15:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzgy.zzb(parcel2, extras);
                return true;
            case 16:
                zzw(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 17:
                zzyu videoController = getVideoController();
                parcel2.writeNoException();
                zzgy.zza(parcel2, videoController);
                return true;
            case 18:
                IObjectWrapper zzvf = zzvf();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzvf);
                return true;
            case 19:
                zzaeb zztn = zztn();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zztn);
                return true;
            case 20:
                IObjectWrapper zzvg = zzvg();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzvg);
                return true;
            case 21:
                IObjectWrapper zzto = zzto();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzto);
                return true;
            case 22:
                zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
