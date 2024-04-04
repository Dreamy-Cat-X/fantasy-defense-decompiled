package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzbey extends zzgv implements zzbez {
    public zzbey() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                performAction((Bundle) zzgy.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle performActionWithResponse = performActionWithResponse((Bundle) zzgy.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzgy.zzb(parcel2, performActionWithResponse);
                return true;
            case 3:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) zzgy.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                zza(parcel.readString(), parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map userProperties = getUserProperties(parcel.readString(), parcel.readString(), zzgy.zza(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(userProperties);
                return true;
            case 6:
                int maxUserProperties = getMaxUserProperties(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(maxUserProperties);
                return true;
            case 7:
                setConditionalUserProperty((Bundle) zzgy.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzgy.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List conditionalUserProperties = getConditionalUserProperties(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(conditionalUserProperties);
                return true;
            case 10:
                String appInstanceId = getAppInstanceId();
                parcel2.writeNoException();
                parcel2.writeString(appInstanceId);
                return true;
            case 11:
                String gmpAppId = getGmpAppId();
                parcel2.writeNoException();
                parcel2.writeString(gmpAppId);
                return true;
            case 12:
                long generateEventId = generateEventId();
                parcel2.writeNoException();
                parcel2.writeLong(generateEventId);
                return true;
            case 13:
                beginAdUnitExposure(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                endAdUnitExposure(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                String currentScreenName = getCurrentScreenName();
                parcel2.writeNoException();
                parcel2.writeString(currentScreenName);
                return true;
            case 17:
                String currentScreenClass = getCurrentScreenClass();
                parcel2.writeNoException();
                parcel2.writeString(currentScreenClass);
                return true;
            case 18:
                String appIdOrigin = getAppIdOrigin();
                parcel2.writeNoException();
                parcel2.writeString(appIdOrigin);
                return true;
            case 19:
                setConsent((Bundle) zzgy.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
