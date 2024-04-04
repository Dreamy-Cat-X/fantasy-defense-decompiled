package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzder;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbo<S extends zzder<?>> implements zzdeu<S> {
    private final Clock zzbpw;
    private final AtomicReference<zzdbn<S>> zzgzv = new AtomicReference<>();
    private final zzdeu<S> zzgzw;
    private final long zzgzx;

    public zzdbo(zzdeu<S> zzdeuVar, long j, Clock clock) {
        this.zzbpw = clock;
        this.zzgzw = zzdeuVar;
        this.zzgzx = j;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<S> zzata() {
        zzdbn<S> zzdbnVar = this.zzgzv.get();
        if (zzdbnVar == null || zzdbnVar.hasExpired()) {
            zzdbnVar = new zzdbn<>(this.zzgzw.zzata(), this.zzgzx, this.zzbpw);
            this.zzgzv.set(zzdbnVar);
        }
        return zzdbnVar.zzgzt;
    }
}
