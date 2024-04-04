package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzzv implements Runnable {
    private final /* synthetic */ zzzw zzckt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzv(zzzw zzzwVar) {
        this.zzckt = zzzwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzzu.zza(this.zzckt.zzcku) != null) {
            try {
                zzzu.zza(this.zzckt.zzcku).onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzaym.zzd("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
