package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaml extends zzbey {
    private final AppMeasurementSdk zzdkc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaml(AppMeasurementSdk appMeasurementSdk) {
        this.zzdkc = appMeasurementSdk;
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final void performAction(Bundle bundle) throws RemoteException {
        this.zzdkc.performAction(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final Bundle performActionWithResponse(Bundle bundle) throws RemoteException {
        return this.zzdkc.performActionWithResponse(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final void logEvent(String str, String str2, Bundle bundle) throws RemoteException {
        this.zzdkc.logEvent(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final void zza(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzdkc.setUserProperty(str, str2, iObjectWrapper != null ? ObjectWrapper.unwrap(iObjectWrapper) : null);
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final Map getUserProperties(String str, String str2, boolean z) throws RemoteException {
        return this.zzdkc.getUserProperties(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final int getMaxUserProperties(String str) throws RemoteException {
        return this.zzdkc.getMaxUserProperties(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final void setConditionalUserProperty(Bundle bundle) throws RemoteException {
        this.zzdkc.setConditionalUserProperty(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        this.zzdkc.clearConditionalUserProperty(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final List getConditionalUserProperties(String str, String str2) throws RemoteException {
        return this.zzdkc.getConditionalUserProperties(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final String getAppInstanceId() throws RemoteException {
        return this.zzdkc.getAppInstanceId();
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final String getGmpAppId() throws RemoteException {
        return this.zzdkc.getGmpAppId();
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final long generateEventId() throws RemoteException {
        return this.zzdkc.generateEventId();
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final void beginAdUnitExposure(String str) throws RemoteException {
        this.zzdkc.beginAdUnitExposure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final void endAdUnitExposure(String str) throws RemoteException {
        this.zzdkc.endAdUnitExposure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final void setConsent(Bundle bundle) throws RemoteException {
        this.zzdkc.setConsent(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final void zzb(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        this.zzdkc.setCurrentScreen(iObjectWrapper != null ? (Activity) ObjectWrapper.unwrap(iObjectWrapper) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final String getCurrentScreenName() throws RemoteException {
        return this.zzdkc.getCurrentScreenName();
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final String getCurrentScreenClass() throws RemoteException {
        return this.zzdkc.getCurrentScreenClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbez
    public final String getAppIdOrigin() throws RemoteException {
        return this.zzdkc.getAppIdOrigin();
    }
}
