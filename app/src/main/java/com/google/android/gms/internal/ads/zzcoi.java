package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcoi implements zzepq<zzcns> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzatl> zzgof;
    private final zzeqd<zzbij> zzgog;
    private final zzeqd<zzati> zzgoh;
    private final zzeqd<HashMap<String, zzcoh>> zzgoi;

    private zzcoi(zzeqd<Context> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzatl> zzeqdVar3, zzeqd<zzbij> zzeqdVar4, zzeqd<zzati> zzeqdVar5, zzeqd<HashMap<String, zzcoh>> zzeqdVar6) {
        this.zzeuo = zzeqdVar;
        this.zzftf = zzeqdVar2;
        this.zzgof = zzeqdVar3;
        this.zzgog = zzeqdVar4;
        this.zzgoh = zzeqdVar5;
        this.zzgoi = zzeqdVar6;
    }

    public static zzcoi zzb(zzeqd<Context> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzatl> zzeqdVar3, zzeqd<zzbij> zzeqdVar4, zzeqd<zzati> zzeqdVar5, zzeqd<HashMap<String, zzcoh>> zzeqdVar6) {
        return new zzcoi(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5, zzeqdVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcns(this.zzeuo.get(), this.zzftf.get(), this.zzgof.get(), this.zzgog.get(), this.zzgoh.get(), this.zzgoi.get());
    }
}
