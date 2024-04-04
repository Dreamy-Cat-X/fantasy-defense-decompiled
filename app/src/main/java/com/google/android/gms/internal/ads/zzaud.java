package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaud implements RewardItem {
    private final zzato zzdxl;

    public zzaud(zzato zzatoVar) {
        this.zzdxl = zzatoVar;
    }

    @Override // com.google.android.gms.ads.reward.RewardItem
    public final String getType() {
        zzato zzatoVar = this.zzdxl;
        if (zzatoVar == null) {
            return null;
        }
        try {
            return zzatoVar.getType();
        } catch (RemoteException e) {
            zzaym.zzd("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardItem
    public final int getAmount() {
        zzato zzatoVar = this.zzdxl;
        if (zzatoVar == null) {
            return 0;
        }
        try {
            return zzatoVar.getAmount();
        } catch (RemoteException e) {
            zzaym.zzd("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
