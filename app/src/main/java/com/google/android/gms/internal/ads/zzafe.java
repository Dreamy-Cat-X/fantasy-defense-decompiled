package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzafe extends zzgv implements zzafb {
    public zzafe() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper zztl = zztl();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zztl);
                return true;
            case 3:
                String headline = getHeadline();
                parcel2.writeNoException();
                parcel2.writeString(headline);
                return true;
            case 4:
                List images = getImages();
                parcel2.writeNoException();
                parcel2.writeList(images);
                return true;
            case 5:
                String body = getBody();
                parcel2.writeNoException();
                parcel2.writeString(body);
                return true;
            case 6:
                zzaej zztp = zztp();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zztp);
                return true;
            case 7:
                String callToAction = getCallToAction();
                parcel2.writeNoException();
                parcel2.writeString(callToAction);
                return true;
            case 8:
                String advertiser = getAdvertiser();
                parcel2.writeNoException();
                parcel2.writeString(advertiser);
                return true;
            case 9:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzgy.zzb(parcel2, extras);
                return true;
            case 10:
                destroy();
                parcel2.writeNoException();
                return true;
            case 11:
                zzyu videoController = getVideoController();
                parcel2.writeNoException();
                zzgy.zza(parcel2, videoController);
                return true;
            case 12:
                performClick((Bundle) zzgy.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean recordImpression = recordImpression((Bundle) zzgy.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, recordImpression);
                return true;
            case 14:
                reportTouchEvent((Bundle) zzgy.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzaeb zztn = zztn();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zztn);
                return true;
            case 16:
                IObjectWrapper zzto = zzto();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzto);
                return true;
            case 17:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            default:
                return false;
        }
    }
}
