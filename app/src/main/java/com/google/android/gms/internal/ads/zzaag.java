package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaag extends zzatu {
    private zzaty zzcla;

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void destroy() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void pause() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void resume() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void setAppPackageName(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void setCustomData(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void setUserId(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void show() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zza(zzatt zzattVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zza(zzxn zzxnVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final zzyt zzkh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final boolean zzrv() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zza(zzaue zzaueVar) throws RemoteException {
        zzaym.zzev("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzayd.zzaae.post(new zzaaf(this));
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zza(zzaty zzatyVar) throws RemoteException {
        this.zzcla = zzatyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }
}
