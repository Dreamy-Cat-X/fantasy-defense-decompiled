package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcdt implements zzepq<zzcdr> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<com.google.android.gms.ads.internal.util.zzax> zzffs;
    private final zzeqd<Clock> zzfra;

    public zzcdt(zzeqd<com.google.android.gms.ads.internal.util.zzax> zzeqdVar, zzeqd<Clock> zzeqdVar2, zzeqd<Executor> zzeqdVar3) {
        this.zzffs = zzeqdVar;
        this.zzfra = zzeqdVar2;
        this.zzeuj = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcdr(this.zzffs.get(), this.zzfra.get(), this.zzeuj.get());
    }
}
