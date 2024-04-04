package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfh extends zzafe {
    private final String zzchy;
    private final zzcbi zzgao;
    private final zzcaz zzgdt;

    public zzcfh(String str, zzcaz zzcazVar, zzcbi zzcbiVar) {
        this.zzchy = str;
        this.zzgdt = zzcazVar;
        this.zzgao = zzcbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final IObjectWrapper zztl() throws RemoteException {
        return ObjectWrapper.wrap(this.zzgdt);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final String getHeadline() throws RemoteException {
        return this.zzgao.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final List<?> getImages() throws RemoteException {
        return this.zzgao.getImages();
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final String getBody() throws RemoteException {
        return this.zzgao.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final zzaej zztp() throws RemoteException {
        return this.zzgao.zztp();
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final String getCallToAction() throws RemoteException {
        return this.zzgao.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final String getAdvertiser() throws RemoteException {
        return this.zzgao.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final Bundle getExtras() throws RemoteException {
        return this.zzgao.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void destroy() throws RemoteException {
        this.zzgdt.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final zzyu getVideoController() throws RemoteException {
        return this.zzgao.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void performClick(Bundle bundle) throws RemoteException {
        this.zzgdt.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final boolean recordImpression(Bundle bundle) throws RemoteException {
        return this.zzgdt.zzh(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void reportTouchEvent(Bundle bundle) throws RemoteException {
        this.zzgdt.zzg(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final zzaeb zztn() throws RemoteException {
        return this.zzgao.zztn();
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final IObjectWrapper zzto() throws RemoteException {
        return this.zzgao.zzto();
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.zzchy;
    }
}
