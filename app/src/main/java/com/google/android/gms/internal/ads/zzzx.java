package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzzx implements Runnable {
    private final /* synthetic */ zzzy zzckv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzx(zzzy zzzyVar) {
        this.zzckv = zzzyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzwv zzwvVar;
        zzwv zzwvVar2;
        zzwvVar = this.zzckv.zzbpi;
        if (zzwvVar != null) {
            try {
                zzwvVar2 = this.zzckv.zzbpi;
                zzwvVar2.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzaym.zzd("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
