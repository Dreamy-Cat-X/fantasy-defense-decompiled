package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdad implements zzepq<zzdac> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzdzl<String>> zzgyv;

    private zzdad(zzeqd<zzdzl<String>> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        this.zzgyv = zzeqdVar;
        this.zzeuj = zzeqdVar2;
    }

    public static zzdad zzar(zzeqd<zzdzl<String>> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        return new zzdad(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdac(this.zzgyv.get(), this.zzeuj.get());
    }
}
