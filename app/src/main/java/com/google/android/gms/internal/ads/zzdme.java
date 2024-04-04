package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdme extends AdMetadataListener {
    private final /* synthetic */ zzdmc zzhhc;
    private final /* synthetic */ zzxn zzhhd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdme(zzdmc zzdmcVar, zzxn zzxnVar) {
        this.zzhhc = zzdmcVar;
        this.zzhhd = zzxnVar;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        zzcgg zzcggVar;
        zzcggVar = this.zzhhc.zzhhb;
        if (zzcggVar != null) {
            try {
                this.zzhhd.onAdMetadataChanged();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
