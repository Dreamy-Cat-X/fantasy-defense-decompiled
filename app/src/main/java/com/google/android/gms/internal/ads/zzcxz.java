package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcxz implements zzuz {
    private zzwq zzgws;

    public final synchronized void zzb(zzwq zzwqVar) {
        this.zzgws = zzwqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final synchronized void onAdClicked() {
        if (this.zzgws != null) {
            try {
                this.zzgws.onAdClicked();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zzd.zzd("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
