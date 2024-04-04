package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdaw implements zzdeu<zzder<Bundle>> {
    private final Executor executor;
    private final zzaxs zzbpt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdaw(Executor executor, zzaxs zzaxsVar) {
        this.executor = executor;
        this.zzbpt = zzaxsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzder<Bundle>> zzata() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcrk)).booleanValue()) {
            return zzdyz.zzag(null);
        }
        return zzdyz.zzb(this.zzbpt.zzxr(), zzdav.zzdyn, this.executor);
    }
}
