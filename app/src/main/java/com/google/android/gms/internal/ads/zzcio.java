package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcio implements zzepq<Set<zzbxf<zzdre>>> {
    private final zzeqd<zzcje> zzeui;
    private final zzeqd<Executor> zzeuj;

    private zzcio(zzeqd<Executor> zzeqdVar, zzeqd<zzcje> zzeqdVar2) {
        this.zzeuj = zzeqdVar;
        this.zzeui = zzeqdVar2;
    }

    public static zzcio zzac(zzeqd<Executor> zzeqdVar, zzeqd<zzcje> zzeqdVar2) {
        return new zzcio(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        Set emptySet;
        Executor executor = this.zzeuj.get();
        zzcje zzcjeVar = this.zzeui.get();
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcuj)).booleanValue()) {
            emptySet = Collections.singleton(new zzbxf(zzcjeVar, executor));
        } else {
            emptySet = Collections.emptySet();
        }
        return (Set) zzepw.zza(emptySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
