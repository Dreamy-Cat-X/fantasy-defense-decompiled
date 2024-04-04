package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbfl implements zzepq<Set<zzbxf<zzbwq>>> {
    private final zzeqd<zzcoq> zzeui;
    private final zzeqd<Executor> zzeuj;

    public zzbfl(zzeqd<zzcoq> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        this.zzeui = zzeqdVar;
        this.zzeuj = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        Set emptySet;
        zzcoq zzcoqVar = this.zzeui.get();
        Executor executor = this.zzeuj.get();
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqw)).booleanValue()) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczk)).booleanValue()) {
                emptySet = Collections.singleton(new zzbxf(zzcoqVar, executor));
                return (Set) zzepw.zza(emptySet, "Cannot return null from a non-@Nullable @Provides method");
            }
        }
        emptySet = Collections.emptySet();
        return (Set) zzepw.zza(emptySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
