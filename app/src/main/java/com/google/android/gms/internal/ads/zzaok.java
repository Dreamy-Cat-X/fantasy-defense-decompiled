package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzaok implements Runnable {
    private final /* synthetic */ zzaoa zzdmy;
    private final /* synthetic */ AdRequest.ErrorCode zzdmz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaok(zzaoa zzaoaVar, AdRequest.ErrorCode errorCode) {
        this.zzdmy = zzaoaVar;
        this.zzdmz = errorCode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzamz zzamzVar;
        try {
            zzamzVar = this.zzdmy.zzdmn;
            zzamzVar.onAdFailedToLoad(zzaom.zza(this.zzdmz));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }
}
