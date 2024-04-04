package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdnw implements zzepq<Clock> {
    private final zzdnx zzhkq;

    public zzdnw(zzdnx zzdnxVar) {
        this.zzhkq = zzdnxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Clock) zzepw.zza(DefaultClock.getInstance(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
