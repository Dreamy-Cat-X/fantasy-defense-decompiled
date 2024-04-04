package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbjj implements zzepq<zzbiw> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzqs> zzfrg;
    private final zzeqd<zzamd> zzfrh;

    private zzbjj(zzeqd<zzqs> zzeqdVar, zzeqd<zzamd> zzeqdVar2, zzeqd<Executor> zzeqdVar3) {
        this.zzfrg = zzeqdVar;
        this.zzfrh = zzeqdVar2;
        this.zzeuj = zzeqdVar3;
    }

    public static zzbjj zzb(zzeqd<zzqs> zzeqdVar, zzeqd<zzamd> zzeqdVar2, zzeqd<Executor> zzeqdVar3) {
        return new zzbjj(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        zzqs zzqsVar = this.zzfrg.get();
        return (zzbiw) zzepw.zza(new zzbiw(zzqsVar.getUniqueId(), this.zzfrh.get(), this.zzeuj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
