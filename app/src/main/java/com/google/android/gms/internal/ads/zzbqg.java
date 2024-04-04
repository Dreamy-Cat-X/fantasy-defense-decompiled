package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbqg implements zzepq<Context> {
    private final zzeqd<Context> zzfwd;
    private final zzbqd zzfxg;

    private zzbqg(zzbqd zzbqdVar, zzeqd<Context> zzeqdVar) {
        this.zzfxg = zzbqdVar;
        this.zzfwd = zzeqdVar;
    }

    public static zzbqg zza(zzbqd zzbqdVar, zzeqd<Context> zzeqdVar) {
        return new zzbqg(zzbqdVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Context) zzepw.zza(this.zzfxg.zzcf(this.zzfwd.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
