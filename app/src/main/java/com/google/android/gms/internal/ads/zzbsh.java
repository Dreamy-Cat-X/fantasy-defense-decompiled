package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbsh implements zzepq<zzbsf> {
    private final zzeqd<Set<zzbxf<AdMetadataListener>>> zzftl;

    private zzbsh(zzeqd<Set<zzbxf<AdMetadataListener>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbsh zzm(zzeqd<Set<zzbxf<AdMetadataListener>>> zzeqdVar) {
        return new zzbsh(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbsf(this.zzftl.get());
    }
}
