package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbvy implements zzepq<Set<zzbxf<AdMetadataListener>>> {
    private final zzbvl zzfzc;

    private zzbvy(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbvy zzr(zzbvl zzbvlVar) {
        return new zzbvy(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(this.zzfzc.zzama(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
