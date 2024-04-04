package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbya implements zzepq<zzbxu> {
    private final zzeqd<Set<zzbxf<VideoController.VideoLifecycleCallbacks>>> zzftl;

    private zzbya(zzeqd<Set<zzbxf<VideoController.VideoLifecycleCallbacks>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbya zzv(zzeqd<Set<zzbxf<VideoController.VideoLifecycleCallbacks>>> zzeqdVar) {
        return new zzbya(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbxu(this.zzftl.get());
    }
}
