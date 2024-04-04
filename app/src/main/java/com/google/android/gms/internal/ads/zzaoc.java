package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzaoc implements Runnable {
    private final /* synthetic */ zzaoa zzdmy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoc(zzaoa zzaoaVar) {
        this.zzdmy = zzaoaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzamz zzamzVar;
        try {
            zzamzVar = this.zzdmy.zzdmn;
            zzamzVar.onAdOpened();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }
}
