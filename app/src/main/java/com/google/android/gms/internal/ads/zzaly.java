package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzaly {
    private static final com.google.android.gms.ads.internal.util.zzau<zzakb> zzdjm = new zzalx();
    private static final com.google.android.gms.ads.internal.util.zzau<zzakb> zzdjn = new zzama();
    private final zzako zzdjo;

    public zzaly(Context context, zzayt zzaytVar, String str) {
        this.zzdjo = new zzako(context, zzaytVar, str, zzdjm, zzdjn);
    }

    public final <I, O> zzalq<I, O> zza(String str, zzalr<I> zzalrVar, zzals<O> zzalsVar) {
        return new zzalz(this.zzdjo, str, zzalrVar, zzalsVar);
    }

    public final zzamd zzuq() {
        return new zzamd(this.zzdjo);
    }
}
