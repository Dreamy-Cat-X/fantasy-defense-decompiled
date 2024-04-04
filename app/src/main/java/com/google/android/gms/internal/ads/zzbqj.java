package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqd;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbqj implements zzepq<zzbqd.zza> {
    private final zzbqd zzfxg;

    private zzbqj(zzbqd zzbqdVar) {
        this.zzfxg = zzbqdVar;
    }

    public static zzbqj zzm(zzbqd zzbqdVar) {
        return new zzbqj(zzbqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbqd.zza) zzepw.zza(this.zzfxg.zzalh(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
