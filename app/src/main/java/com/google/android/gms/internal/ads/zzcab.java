package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcab implements zzepq<Set<String>> {
    private final zzeqd<zzcbt> zzfte;

    public zzcab(zzeqd<zzcbt> zzeqdVar) {
        this.zzfte = zzeqdVar;
    }

    public static Set<String> zza(zzcbt zzcbtVar) {
        Set emptySet;
        if (zzcbtVar.zzaok() != null) {
            emptySet = Collections.singleton("banner");
        } else {
            emptySet = Collections.emptySet();
        }
        return (Set) zzepw.zza(emptySet, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzfte.get());
    }
}
