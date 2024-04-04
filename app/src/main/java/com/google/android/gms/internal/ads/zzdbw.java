package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbw implements zzepq<zzdmg> {
    private final zzeqd<Clock> zzfra;

    public zzdbw(zzeqd<Clock> zzeqdVar) {
        this.zzfra = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzdmg) zzepw.zza(new zzdmg(this.zzfra.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
