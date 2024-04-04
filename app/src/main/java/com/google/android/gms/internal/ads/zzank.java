package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzank extends zzgv implements zzanh {
    public zzank() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
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
                zzaej zztp = zztp();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zztp);
                return true;
            case 6:
                String callToAction = getCallToAction();
                parcel2.writeNoException();
                parcel2.writeString(callToAction);
                return true;
            case 7:
                String advertiser = getAdvertiser();
                parcel2.writeNoException();
                parcel2.writeString(advertiser);
                return true;
            case 8:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 9:
                zzu(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                zzv(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                boolean overrideImpressionRecording = getOverrideImpressionRecording();
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, overrideImpressionRecording);
                return true;
            case 12:
                boolean overrideClickHandling = getOverrideClickHandling();
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, overrideClickHandling);
                return true;
            case 13:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzgy.zzb(parcel2, extras);
                return true;
            case 14:
                zzw(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper zzvf = zzvf();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzvf);
                return true;
            case 16:
                zzyu videoController = getVideoController();
                parcel2.writeNoException();
                zzgy.zza(parcel2, videoController);
                return true;
            case 17:
            case 18:
            default:
                return false;
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
        }
    }
}
