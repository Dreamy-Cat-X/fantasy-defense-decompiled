package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbyu implements zzepq<Set<zzbxf<zzbwy>>> {
    private final zzeqd<zzbzp> zzfry;

    private zzbyu(zzeqd<zzbzp> zzeqdVar) {
        this.zzfry = zzeqdVar;
    }

    public static zzbyu zzw(zzeqd<zzbzp> zzeqdVar) {
        return new zzbyu(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(Collections.singleton(zzbxf.zzb(this.zzfry.get(), zzayv.zzegn)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
