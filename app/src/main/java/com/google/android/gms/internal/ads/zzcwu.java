package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcwu implements zzepq<zzcwq> {
    private final zzeqd<Executor> zzeuj;

    public zzcwu(zzeqd<Executor> zzeqdVar) {
        this.zzeuj = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcwq(this.zzeuj.get());
    }
}
