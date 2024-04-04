package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcsn extends zzaui implements zzbrz {
    private zzbsc zzgsn;
    private zzauj zzgsp;
    private zzbxs zzgsq;

    public final synchronized void zza(zzauj zzaujVar) {
        this.zzgsp = zzaujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrz
    public final synchronized void zza(zzbsc zzbscVar) {
        this.zzgsn = zzbscVar;
    }

    public final synchronized void zza(zzbxs zzbxsVar) {
        this.zzgsq = zzbxsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final synchronized void zzaf(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgsp != null) {
            this.zzgsp.zzaf(iObjectWrapper);
        }
        if (this.zzgsq != null) {
            this.zzgsq.onInitializationSucceeded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final synchronized void zzd(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.zzgsp != null) {
            this.zzgsp.zzd(iObjectWrapper, i);
        }
        if (this.zzgsq != null) {
            this.zzgsq.zzdz(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final synchronized void zzai(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgsp != null) {
            this.zzgsp.zzai(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final synchronized void zza(IObjectWrapper iObjectWrapper, zzaun zzaunVar) throws RemoteException {
        if (this.zzgsp != null) {
            this.zzgsp.zza(iObjectWrapper, zzaunVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final synchronized void zzak(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgsp != null) {
            this.zzgsp.zzak(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final synchronized void zzaj(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgsp != null) {
            this.zzgsp.zzaj(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.zzgsp != null) {
            this.zzgsp.zze(iObjectWrapper, i);
        }
        if (this.zzgsn != null) {
            this.zzgsn.onAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final synchronized void zzal(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgsp != null) {
            this.zzgsp.zzal(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final synchronized void zzam(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgsp != null) {
            this.zzgsp.zzam(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final synchronized void zzah(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgsp != null) {
            this.zzgsp.zzah(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final synchronized void zzag(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgsp != null) {
            this.zzgsp.zzag(iObjectWrapper);
        }
        if (this.zzgsn != null) {
            this.zzgsn.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.zzgsp != null) {
            this.zzgsp.zzb(bundle);
        }
    }
}
