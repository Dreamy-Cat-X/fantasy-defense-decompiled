package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaae extends zzaut {
    @Override // com.google.android.gms.internal.ads.zzauq
    public final String getMediationAdapterClassName() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzauv zzauvVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzavd zzavdVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzavl zzavlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzyn zzynVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzyo zzyoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final zzyt zzkh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final zzaup zzru() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzvi zzviVar, zzauy zzauyVar) throws RemoteException {
        zza(zzauyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zzb(zzvi zzviVar, zzauy zzauyVar) throws RemoteException {
        zza(zzauyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }

    private static void zza(final zzauy zzauyVar) {
        zzaym.zzev("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzayd.zzaae.post(new Runnable(zzauyVar) { // from class: com.google.android.gms.internal.ads.zzaad
            private final zzauy zzcky;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcky = zzauyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzauy zzauyVar2 = this.zzcky;
                if (zzauyVar2 != null) {
                    try {
                        zzauyVar2.onRewardedAdFailedToLoad(1);
                    } catch (RemoteException e) {
                        zzaym.zze("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }
}
