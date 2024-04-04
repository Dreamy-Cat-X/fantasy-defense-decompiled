package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdqm {
    private final E zzhof;
    private final List<zzdzl<?>> zzhoi;
    private final /* synthetic */ zzdqk zzhoj;

    private zzdqm(zzdqk zzdqkVar, E e, List<zzdzl<?>> list) {
        this.zzhoj = zzdqkVar;
        this.zzhof = e;
        this.zzhoi = list;
    }

    public final <O> zzdqq<O> zzb(Callable<O> callable) {
        zzdzk zzdzkVar;
        zzdze zzk = zzdyz.zzk(this.zzhoi);
        zzdzl zzb = zzk.zzb(zzdqp.zzhah, zzayv.zzegn);
        zzdqk zzdqkVar = this.zzhoj;
        E e = this.zzhof;
        List<zzdzl<?>> list = this.zzhoi;
        zzdzkVar = zzdqkVar.zzgfs;
        return new zzdqq<>(zzdqkVar, e, zzb, list, zzk.zzb(callable, zzdzkVar));
    }
}
