package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbvv implements zzepq<Set<zzbxf<zzbqw>>> {
    private final zzbvl zzfzc;

    private zzbvv(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbvv zzo(zzbvl zzbvlVar) {
        return new zzbvv(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(this.zzfzc.zzaly(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
