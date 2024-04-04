package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdjg<R> implements zzdpp {
    public final Executor executor;
    public final String zzbup;
    public final zzvi zzdsi;
    public final zzvu zzgzi;
    public final zzdjx<R> zzhfo;
    public final zzdka zzhfp;

    @Nullable
    private final zzdpa zzhfq;

    public zzdjg(zzdjx<R> zzdjxVar, zzdka zzdkaVar, zzvi zzviVar, String str, Executor executor, zzvu zzvuVar, @Nullable zzdpa zzdpaVar) {
        this.zzhfo = zzdjxVar;
        this.zzhfp = zzdkaVar;
        this.zzdsi = zzviVar;
        this.zzbup = str;
        this.executor = executor;
        this.zzgzi = zzvuVar;
        this.zzhfq = zzdpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final Executor getExecutor() {
        return this.executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    @Nullable
    public final zzdpa zzaus() {
        return this.zzhfq;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final zzdpp zzaut() {
        return new zzdjg(this.zzhfo, this.zzhfp, this.zzdsi, this.zzbup, this.executor, this.zzgzi, this.zzhfq);
    }
}
