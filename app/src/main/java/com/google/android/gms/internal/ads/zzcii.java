package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcii implements zzepq<zzbxf<zzbsg>> {
    private final zzeqd<zzcir> zzeui;
    private final zzeqd<Executor> zzeuj;

    private zzcii(zzeqd<zzcir> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        this.zzeui = zzeqdVar;
        this.zzeuj = zzeqdVar2;
    }

    public static zzcii zzz(zzeqd<zzcir> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        return new zzcii(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzeui.get(), this.zzeuj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
