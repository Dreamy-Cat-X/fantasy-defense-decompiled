package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdeh implements zzepq<zzdef> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzayt> zzfov;

    private zzdeh(zzeqd<zzdzk> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<zzayt> zzeqdVar3) {
        this.zzeuj = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzfov = zzeqdVar3;
    }

    public static zzdeh zzad(zzeqd<zzdzk> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<zzayt> zzeqdVar3) {
        return new zzdeh(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdef(this.zzeuj.get(), this.zzeuo.get(), this.zzfov.get());
    }
}
