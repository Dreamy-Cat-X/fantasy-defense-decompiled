package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzckt implements zzepq<Set<zzbxf<zzbrj>>> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzckv> zzghw;
    private final zzckl zzgkv;

    private zzckt(zzckl zzcklVar, zzeqd<zzckv> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        this.zzgkv = zzcklVar;
        this.zzghw = zzeqdVar;
        this.zzeuj = zzeqdVar2;
    }

    public static zzckt zzh(zzckl zzcklVar, zzeqd<zzckv> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        return new zzckt(zzcklVar, zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(zzckl.zzf(this.zzghw.get(), this.zzeuj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
