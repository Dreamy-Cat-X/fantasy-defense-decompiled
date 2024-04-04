package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbpf implements zzepq<zzbxf<zzbsy>> {
    private final zzeqd<zzbti> zzeui;
    private final zzeqd<Executor> zzeuj;

    private zzbpf(zzeqd<zzbti> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        this.zzeui = zzeqdVar;
        this.zzeuj = zzeqdVar2;
    }

    public static zzbpf zzq(zzeqd<zzbti> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        return new zzbpf(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzeui.get(), this.zzeuj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
