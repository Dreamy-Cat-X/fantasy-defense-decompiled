package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzcnl implements zzdyj {
    static final zzdyj zzbon = new zzcnl();

    private zzcnl() {
    }

    @Override // com.google.android.gms.internal.ads.zzdyj
    public final zzdzl zzf(Object obj) {
        return zzdyz.immediateFailedFuture(((ExecutionException) obj).getCause());
    }
}
