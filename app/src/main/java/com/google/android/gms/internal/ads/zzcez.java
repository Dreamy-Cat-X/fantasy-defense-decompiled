package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcez implements zzepq<zzces> {
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzbjo> zzgew;
    private final zzeqd<zzbxe> zzggv;

    public zzcez(zzeqd<Executor> zzeqdVar, zzeqd<zzbjo> zzeqdVar2, zzeqd<zzbxe> zzeqdVar3) {
        this.zzftf = zzeqdVar;
        this.zzgew = zzeqdVar2;
        this.zzggv = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzces(this.zzftf.get(), this.zzgew.get(), this.zzggv.get());
    }
}
