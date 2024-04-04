package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzaoe implements Runnable {
    private final /* synthetic */ zzaoa zzdmy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoe(zzaoa zzaoaVar) {
        this.zzdmy = zzaoaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzamz zzamzVar;
        try {
            zzamzVar = this.zzdmy.zzdmn;
            zzamzVar.onAdClosed();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }
}
