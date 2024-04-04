package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzss extends AppOpenAd {
    private final zzsh zzbuk;

    public zzss(zzsh zzshVar) {
        this.zzbuk = zzshVar;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(Activity activity, FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.zzbuk.zza(ObjectWrapper.wrap(activity), new zzsi(fullScreenContentCallback));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final ResponseInfo getResponseInfo() {
        zzyt zzytVar;
        try {
            zzytVar = this.zzbuk.zzkh();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            zzytVar = null;
        }
        return ResponseInfo.zza(zzytVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final zzxg zzdx() {
        try {
            return this.zzbuk.zzdx();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void zza(zzsn zzsnVar) {
        try {
            this.zzbuk.zza(zzsnVar);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }
}
