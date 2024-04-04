package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdgs implements zzepq<zzdgq> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzara> zzewc;
    private final zzeqd<ScheduledExecutorService> zzfqc;

    public zzdgs(zzeqd<zzara> zzeqdVar, zzeqd<ScheduledExecutorService> zzeqdVar2, zzeqd<Context> zzeqdVar3) {
        this.zzewc = zzeqdVar;
        this.zzfqc = zzeqdVar2;
        this.zzeuo = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdgq(this.zzewc.get(), this.zzfqc.get(), this.zzeuo.get());
    }
}
