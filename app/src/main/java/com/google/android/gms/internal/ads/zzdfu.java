package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdfu implements zzepq<zzdfs> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzatb> zzewc;
    private final zzeqd<String> zzfww;

    public zzdfu(zzeqd<zzatb> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<String> zzeqdVar3, zzeqd<zzdzk> zzeqdVar4) {
        this.zzewc = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzfww = zzeqdVar3;
        this.zzeuj = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdfs(this.zzewc.get(), this.zzeuo.get(), this.zzfww.get(), this.zzeuj.get());
    }
}
