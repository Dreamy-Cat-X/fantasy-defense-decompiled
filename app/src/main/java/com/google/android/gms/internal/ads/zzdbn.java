package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzder;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdbn<S extends zzder<?>> {
    private final Clock zzbpw;
    public final zzdzl<S> zzgzt;
    private final long zzgzu;

    public zzdbn(zzdzl<S> zzdzlVar, long j, Clock clock) {
        this.zzgzt = zzdzlVar;
        this.zzbpw = clock;
        this.zzgzu = clock.elapsedRealtime() + j;
    }

    public final boolean hasExpired() {
        return this.zzgzu < this.zzbpw.elapsedRealtime();
    }
}
