package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbwi implements zzepq<Set<zzbxf<VideoController.VideoLifecycleCallbacks>>> {
    private final zzbvl zzfzc;

    private zzbwi(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbwi zzac(zzbvl zzbvlVar) {
        return new zzbwi(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
