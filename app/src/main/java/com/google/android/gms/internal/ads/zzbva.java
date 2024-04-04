package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbva implements zzepq<zzbuy> {
    private final zzeqd<Set<zzbxf<AppEventListener>>> zzftl;

    private zzbva(zzeqd<Set<zzbxf<AppEventListener>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbva zzr(zzeqd<Set<zzbxf<AppEventListener>>> zzeqdVar) {
        return new zzbva(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbuy(this.zzftl.get());
    }
}
