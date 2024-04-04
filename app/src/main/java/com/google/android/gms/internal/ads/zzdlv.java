package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdlv extends AdMetadataListener {
    private final /* synthetic */ zzyn zzhgx;
    private final /* synthetic */ zzdlw zzhgy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdlv(zzdlw zzdlwVar, zzyn zzynVar) {
        this.zzhgy = zzdlwVar;
        this.zzhgx = zzynVar;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        zzcgg zzcggVar;
        zzcggVar = this.zzhgy.zzhhb;
        if (zzcggVar != null) {
            try {
                this.zzhgx.onAdMetadataChanged();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
