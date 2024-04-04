package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzans implements InitializationCompleteCallback {
    private final /* synthetic */ zzaix zzdml;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzans(zzanp zzanpVar, zzaix zzaixVar) {
        this.zzdml = zzaixVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zzdml.onInitializationSucceeded();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zzdml.onInitializationFailed(str);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }
}
