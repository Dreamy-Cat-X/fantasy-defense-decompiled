package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzaaf implements Runnable {
    private final /* synthetic */ zzaag zzckz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaaf(zzaag zzaagVar) {
        this.zzckz = zzaagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaty zzatyVar;
        zzaty zzatyVar2;
        zzatyVar = this.zzckz.zzcla;
        if (zzatyVar != null) {
            try {
                zzatyVar2 = this.zzckz.zzcla;
                zzatyVar2.onRewardedVideoAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzaym.zzd("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
