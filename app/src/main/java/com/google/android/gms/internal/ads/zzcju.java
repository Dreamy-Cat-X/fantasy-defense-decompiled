package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class zzcju {
    private final Executor executor;
    private final zzckd zzgjw;
    private final Map<String, String> zzgka;

    public zzcju(zzckd zzckdVar, Executor executor) {
        this.zzgjw = zzckdVar;
        this.zzgka = zzckdVar.zzaqz();
        this.executor = executor;
    }

    public final zzcjx zzaqt() {
        return zzcjx.zzb(new zzcjx(this));
    }
}
