package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcpb implements zzepq<zzbxf<zzdre>> {
    private final zzeqd<zzcpn> zzeui;
    private final zzeqd<Executor> zzeuj;

    private zzcpb(zzeqd<zzcpn> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        this.zzeui = zzeqdVar;
        this.zzeuj = zzeqdVar2;
    }

    public static zzcpb zzap(zzeqd<zzcpn> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        return new zzcpb(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzeui.get(), this.zzeuj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
