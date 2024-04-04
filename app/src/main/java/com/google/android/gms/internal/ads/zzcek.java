package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcek implements zzepq<zzceg> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzcdw> zzggi;

    public zzcek(zzeqd<Executor> zzeqdVar, zzeqd<zzcdw> zzeqdVar2) {
        this.zzeuj = zzeqdVar;
        this.zzggi = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzceg(this.zzeuj.get(), this.zzggi.get());
    }
}
