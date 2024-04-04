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
public final class zzdlw extends zzaut {
    private final String zzbup;
    private final zzdmw zzfxf;
    private final Context zzgwb;
    private final zzdlo zzhgz;
    private final zzdkp zzhha;
    private zzcgg zzhhb;

    public zzdlw(String str, zzdlo zzdloVar, Context context, zzdkp zzdkpVar, zzdmw zzdmwVar) {
        this.zzbup = str;
        this.zzhgz = zzdloVar;
        this.zzhha = zzdkpVar;
        this.zzfxf = zzdmwVar;
        this.zzgwb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final synchronized void zza(zzvi zzviVar, zzauy zzauyVar) throws RemoteException {
        zza(zzviVar, zzauyVar, zzdmp.zzhit);
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final synchronized void zzb(zzvi zzviVar, zzauy zzauyVar) throws RemoteException {
        zza(zzviVar, zzauyVar, zzdmp.zzhiu);
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zza(iObjectWrapper, ((Boolean) zzwo.zzqq().zzd(zzabh.zzcof)).booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final synchronized void zza(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzhhb == null) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Rewarded can not be shown before loaded");
            this.zzhha.zzk(zzdns.zza(zzdnu.NOT_READY, null, null));
        } else {
            this.zzhhb.zzb(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.zzhhb == null || this.zzhhb.zzako() == null) {
            return null;
        }
        return this.zzhhb.zzako().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final boolean isLoaded() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcgg zzcggVar = this.zzhhb;
        return (zzcggVar == null || zzcggVar.isUsed()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzauv zzauvVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzhha.zzb(zzauvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzavd zzavdVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzhha.zzb(zzavdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzyn zzynVar) {
        if (zzynVar == null) {
            this.zzhha.zza(null);
        } else {
            this.zzhha.zza(new zzdlv(this, zzynVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcgg zzcggVar = this.zzhhb;
        return zzcggVar != null ? zzcggVar.getAdMetadata() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final zzaup zzru() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcgg zzcggVar = this.zzhhb;
        if (zzcggVar != null) {
            return zzcggVar.zzru();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final synchronized void zza(zzavl zzavlVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdmw zzdmwVar = this.zzfxf;
        zzdmwVar.zzdxo = zzavlVar.zzdxo;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcos)).booleanValue()) {
            zzdmwVar.zzdxp = zzavlVar.zzdxp;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final zzyt zzkh() {
        zzcgg zzcggVar;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyb)).booleanValue() && (zzcggVar = this.zzhhb) != null) {
            return zzcggVar.zzako();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzyo zzyoVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.zzhha.zzd(zzyoVar);
    }

    private final synchronized void zza(zzvi zzviVar, zzauy zzauyVar, int i) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzhha.zzb(zzauyVar);
        com.google.android.gms.ads.internal.zzp.zzkq();
        if (com.google.android.gms.ads.internal.util.zzm.zzba(this.zzgwb) && zzviVar.zzchk == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Failed to load the ad because app ID is missing.");
            this.zzhha.zzd(zzdns.zza(zzdnu.APP_ID_MISSING, null, null));
        } else {
            if (this.zzhhb != null) {
                return;
            }
            zzdll zzdllVar = new zzdll(null);
            this.zzhgz.zzed(i);
            this.zzhgz.zza(zzviVar, this.zzbup, zzdllVar, new zzdly(this));
        }
    }
}
