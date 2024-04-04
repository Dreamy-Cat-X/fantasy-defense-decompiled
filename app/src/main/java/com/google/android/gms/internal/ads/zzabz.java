package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzabz implements CustomRenderedAd {
    private final zzacc zzdam;

    public zzabz(zzacc zzaccVar) {
        this.zzdam = zzaccVar;
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final String getBaseUrl() {
        try {
            return this.zzdam.zzsr();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final String getContent() {
        try {
            return this.zzdam.getContent();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final void onAdRendered(View view) {
        try {
            this.zzdam.zzn(view != null ? ObjectWrapper.wrap(view) : null);
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final void recordClick() {
        try {
            this.zzdam.recordClick();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final void recordImpression() {
        try {
            this.zzdam.recordImpression();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }
}
