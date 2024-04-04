package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdey<T> implements zzepq<zzdet<T>> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<Set<zzdeu<? extends zzder<T>>>> zzhca;

    private zzdey(zzeqd<Executor> zzeqdVar, zzeqd<Set<zzdeu<? extends zzder<T>>>> zzeqdVar2) {
        this.zzeuj = zzeqdVar;
        this.zzhca = zzeqdVar2;
    }

    public static <T> zzdey<T> zzbb(zzeqd<Executor> zzeqdVar, zzeqd<Set<zzdeu<? extends zzder<T>>>> zzeqdVar2) {
        return new zzdey<>(zzeqdVar, zzeqdVar2);
    }

    public static <T> zzdet<T> zza(Executor executor, Set<zzdeu<? extends zzder<T>>> set) {
        return new zzdet<>(executor, set);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzeuj.get(), this.zzhca.get());
    }
}
