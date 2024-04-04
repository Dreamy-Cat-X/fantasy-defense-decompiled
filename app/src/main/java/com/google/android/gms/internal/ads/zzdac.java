package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdac implements zzdeu<Object> {
    private final Executor executor;
    private final zzdzl<String> zzgyu;

    public zzdac(zzdzl<String> zzdzlVar, Executor executor) {
        this.zzgyu = zzdzlVar;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<Object> zzata() {
        return zzdyz.zzb(this.zzgyu, zzdab.zzbon, this.executor);
    }
}
