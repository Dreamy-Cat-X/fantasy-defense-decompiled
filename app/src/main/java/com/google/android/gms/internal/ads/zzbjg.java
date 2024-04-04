package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbjg implements zzepq<zzbjf> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzamd> zzfqx;
    private final zzeqd<zzbjd> zzfqy;
    private final zzeqd<zzbiw> zzfqz;
    private final zzeqd<Clock> zzfra;

    private zzbjg(zzeqd<zzamd> zzeqdVar, zzeqd<zzbjd> zzeqdVar2, zzeqd<Executor> zzeqdVar3, zzeqd<zzbiw> zzeqdVar4, zzeqd<Clock> zzeqdVar5) {
        this.zzfqx = zzeqdVar;
        this.zzfqy = zzeqdVar2;
        this.zzeuj = zzeqdVar3;
        this.zzfqz = zzeqdVar4;
        this.zzfra = zzeqdVar5;
    }

    public static zzbjg zza(zzeqd<zzamd> zzeqdVar, zzeqd<zzbjd> zzeqdVar2, zzeqd<Executor> zzeqdVar3, zzeqd<zzbiw> zzeqdVar4, zzeqd<Clock> zzeqdVar5) {
        return new zzbjg(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbjf(this.zzfqx.get(), this.zzfqy.get(), this.zzeuj.get(), this.zzfqz.get(), this.zzfra.get());
    }
}
