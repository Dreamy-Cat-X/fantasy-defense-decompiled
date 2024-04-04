package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbt implements zzepq<zzdbo<zzdex>> {
    private final zzeqd<zzdfa> zzewl;
    private final zzeqd<Clock> zzfra;

    public zzdbt(zzeqd<zzdfa> zzeqdVar, zzeqd<Clock> zzeqdVar2) {
        this.zzewl = zzeqdVar;
        this.zzfra = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzdbo) zzepw.zza(new zzdbo(this.zzewl.get(), zzacw.zzdbw.get().longValue(), this.zzfra.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
