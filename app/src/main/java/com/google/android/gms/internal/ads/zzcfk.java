package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfk extends zzagm {
    private final String zzchy;
    private final zzcbi zzgao;
    private final zzcaz zzgdt;

    public zzcfk(String str, zzcaz zzcazVar, zzcbi zzcbiVar) {
        this.zzchy = str;
        this.zzgdt = zzcazVar;
        this.zzgao = zzcbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final IObjectWrapper zztl() throws RemoteException {
        return ObjectWrapper.wrap(this.zzgdt);
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String getHeadline() throws RemoteException {
        return this.zzgao.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final List<?> getImages() throws RemoteException {
        return this.zzgao.getImages();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final List<?> getMuteThisAdReasons() throws RemoteException {
        if (isCustomMuteThisAdEnabled()) {
            return this.zzgao.getMuteThisAdReasons();
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final boolean isCustomMuteThisAdEnabled() throws RemoteException {
        return (this.zzgao.getMuteThisAdReasons().isEmpty() || this.zzgao.zzanv() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String getBody() throws RemoteException {
        return this.zzgao.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final zzaej zztm() throws RemoteException {
        return this.zzgao.zztm();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String getCallToAction() throws RemoteException {
        return this.zzgao.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String getAdvertiser() throws RemoteException {
        return this.zzgao.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final double getStarRating() throws RemoteException {
        return this.zzgao.getStarRating();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String getStore() throws RemoteException {
        return this.zzgao.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String getPrice() throws RemoteException {
        return this.zzgao.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void destroy() throws RemoteException {
        this.zzgdt.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final zzyu getVideoController() throws RemoteException {
        return this.zzgao.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void performClick(Bundle bundle) throws RemoteException {
        this.zzgdt.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final boolean recordImpression(Bundle bundle) throws RemoteException {
        return this.zzgdt.zzh(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void reportTouchEvent(Bundle bundle) throws RemoteException {
        this.zzgdt.zzg(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final zzaeb zztn() throws RemoteException {
        return this.zzgao.zztn();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final IObjectWrapper zzto() throws RemoteException {
        return this.zzgao.zzto();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.zzchy;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final Bundle getExtras() throws RemoteException {
        return this.zzgao.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void zza(zzagi zzagiVar) throws RemoteException {
        this.zzgdt.zza(zzagiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void zza(zzyj zzyjVar) throws RemoteException {
        this.zzgdt.zza(zzyjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void zza(zzyf zzyfVar) throws RemoteException {
        this.zzgdt.zza(zzyfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void zztw() {
        this.zzgdt.zztw();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void recordCustomClickGesture() {
        this.zzgdt.recordCustomClickGesture();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final boolean isCustomClickGestureEnabled() {
        return this.zzgdt.isCustomClickGestureEnabled();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void cancelUnconfirmedClick() throws RemoteException {
        this.zzgdt.cancelUnconfirmedClick();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final zzaei zztx() throws RemoteException {
        return this.zzgdt.zzanp().zztx();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final zzyt zzkh() throws RemoteException {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyb)).booleanValue()) {
            return this.zzgdt.zzako();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final void zza(zzyo zzyoVar) throws RemoteException {
        this.zzgdt.zza(zzyoVar);
    }
}
