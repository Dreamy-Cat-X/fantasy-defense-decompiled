package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzavm extends zzauo {
    private final String type;
    private final int zzdxh;

    public zzavm(zzaun zzaunVar) {
        this(zzaunVar != null ? zzaunVar.type : "", zzaunVar != null ? zzaunVar.zzdxh : 1);
    }

    public zzavm(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public zzavm(String str, int i) {
        this.type = str;
        this.zzdxh = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String getType() throws RemoteException {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final int getAmount() throws RemoteException {
        return this.zzdxh;
    }
}
