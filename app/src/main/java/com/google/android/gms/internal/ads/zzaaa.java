package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaaa extends zzyb {
    private zzajc zzckx;

    @Override // com.google.android.gms.internal.ads.zzxy
    public final String getVersionString() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void setAppMuted(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void setAppVolume(float f) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zza(zzaak zzaakVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zza(zzamt zzamtVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zza(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zzb(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zzcd(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zzce(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final float zzqz() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final boolean zzra() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zzrc() {
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void initialize() throws RemoteException {
        zzaym.zzev("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzayd.zzaae.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzzz
            private final zzaaa zzckw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzckw = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzckw.zzrt();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zza(zzajc zzajcVar) throws RemoteException {
        this.zzckx = zzajcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final List<zzaiv> zzrb() throws RemoteException {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzrt() {
        zzajc zzajcVar = this.zzckx;
        if (zzajcVar != null) {
            try {
                zzajcVar.zze(Collections.emptyList());
            } catch (RemoteException e) {
                zzaym.zzd("Could not notify onComplete event.", e);
            }
        }
    }
}
