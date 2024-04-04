package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbwc implements zzepq<Set<zzbxf<AppEventListener>>> {
    private final zzbvl zzfzc;

    private zzbwc(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbwc zzw(zzbvl zzbvlVar) {
        return new zzbwc(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(this.zzfzc.zzamb(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
