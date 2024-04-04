package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdqk<E> {
    private static final zzdzl<?> zzhod = zzdyz.zzag(null);
    private final ScheduledExecutorService zzfro;
    private final zzdzk zzgfs;
    private final zzdqw<E> zzhoe;

    public zzdqk(zzdzk zzdzkVar, ScheduledExecutorService scheduledExecutorService, zzdqw<E> zzdqwVar) {
        this.zzgfs = zzdzkVar;
        this.zzfro = scheduledExecutorService;
        this.zzhoe = zzdqwVar;
    }

    public abstract String zzu(E e);

    public final zzdqo zzt(E e) {
        return new zzdqo(this, e);
    }

    public final <I> zzdqq<I> zza(E e, zzdzl<I> zzdzlVar) {
        return new zzdqq<>(this, e, zzdzlVar, Collections.singletonList(zzdzlVar), zzdzlVar);
    }

    public final zzdqm zza(E e, zzdzl<?>... zzdzlVarArr) {
        return new zzdqm(this, e, Arrays.asList(zzdzlVarArr));
    }

    public static /* synthetic */ zzdqw zzc(zzdqk zzdqkVar) {
        return zzdqkVar.zzhoe;
    }
}
