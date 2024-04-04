package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzave implements RewardItem {
    private final zzaup zzdxr;

    public zzave(zzaup zzaupVar) {
        this.zzdxr = zzaupVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzaup zzaupVar = this.zzdxr;
        if (zzaupVar == null) {
            return null;
        }
        try {
            return zzaupVar.getType();
        } catch (RemoteException e) {
            zzaym.zzd("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzaup zzaupVar = this.zzdxr;
        if (zzaupVar == null) {
            return 0;
        }
        try {
            return zzaupVar.getAmount();
        } catch (RemoteException e) {
            zzaym.zzd("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
