package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzckp implements zzepq<Set<zzbxf<zzbsg>>> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzckv> zzghw;
    private final zzckl zzgkv;

    private zzckp(zzckl zzcklVar, zzeqd<zzckv> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        this.zzgkv = zzcklVar;
        this.zzghw = zzeqdVar;
        this.zzeuj = zzeqdVar2;
    }

    public static zzckp zzd(zzckl zzcklVar, zzeqd<zzckv> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        return new zzckp(zzcklVar, zzeqdVar, zzeqdVar2);
    }

    public static Set<zzbxf<zzbsg>> zzb(zzckl zzcklVar, zzckv zzckvVar, Executor executor) {
        return (Set) zzepw.zza(zzckl.zzc(zzckvVar, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzb(this.zzgkv, this.zzghw.get(), this.zzeuj.get());
    }
}
