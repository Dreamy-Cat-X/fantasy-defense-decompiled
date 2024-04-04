package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdmc extends zzatu {
    private final zzdmw zzfxf;
    private boolean zzgww = false;
    private final zzdlo zzhgz;
    private final zzdkp zzhha;
    private zzcgg zzhhb;

    public zzdmc(zzdlo zzdloVar, zzdkp zzdkpVar, zzdmw zzdmwVar) {
        this.zzhgz = zzdloVar;
        this.zzhha = zzdkpVar;
        this.zzfxf = zzdmwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void setAppPackageName(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final synchronized void zza(zzaue zzaueVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (zzabj.zzcp(zzaueVar.zzbup)) {
            return;
        }
        if (zzaso()) {
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcvk)).booleanValue()) {
                return;
            }
        }
        zzdll zzdllVar = new zzdll(null);
        this.zzhhb = null;
        this.zzhgz.zzed(zzdmp.zzhis);
        this.zzhgz.zza(zzaueVar.zzdsi, zzaueVar.zzbup, zzdllVar, new zzdmb(this));
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void destroy() throws RemoteException {
        zzl(null);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzhha.zza(null);
        if (this.zzhhb != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzhhb.zzakn().zzce(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void pause() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzhhb != null) {
            this.zzhhb.zzakn().zzcc(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void resume() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzhhb != null) {
            this.zzhhb.zzakn().zzcd(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final synchronized void show() throws RemoteException {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Activity activity;
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzhhb == null) {
            return;
        }
        if (iObjectWrapper != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof Activity) {
                activity = (Activity) unwrap;
                this.zzhhb.zzb(this.zzgww, activity);
            }
        }
        activity = null;
        this.zzhhb.zzb(this.zzgww, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final boolean zzrv() {
        zzcgg zzcggVar = this.zzhhb;
        return zzcggVar != null && zzcggVar.zzrv();
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.zzhhb == null || this.zzhhb.zzako() == null) {
            return null;
        }
        return this.zzhhb.zzako().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final boolean isLoaded() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzaso();
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zza(zzaty zzatyVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzhha.zzb(zzatyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zza(zzatt zzattVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzhha.zzb(zzattVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zza(zzxn zzxnVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzxnVar == null) {
            this.zzhha.zza(null);
        } else {
            this.zzhha.zza(new zzdme(this, zzxnVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzcgg zzcggVar = this.zzhhb;
        return zzcggVar != null ? zzcggVar.getAdMetadata() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final synchronized void setUserId(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzfxf.zzdxo = str;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final synchronized void setCustomData(String str) throws RemoteException {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcos)).booleanValue()) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
            this.zzfxf.zzdxp = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzgww = z;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final synchronized zzyt zzkh() throws RemoteException {
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcyb)).booleanValue()) {
            return null;
        }
        if (this.zzhhb == null) {
            return null;
        }
        return this.zzhhb.zzako();
    }

    private final synchronized boolean zzaso() {
        boolean z;
        if (this.zzhhb != null) {
            z = this.zzhhb.isClosed() ? false : true;
        }
        return z;
    }
}
