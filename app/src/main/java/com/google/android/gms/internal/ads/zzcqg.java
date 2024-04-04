package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcqg implements zzepq<zzcpy> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdzk> zzgoz;

    public zzcqg(zzeqd<Context> zzeqdVar, zzeqd<zzdzk> zzeqdVar2) {
        this.zzeuo = zzeqdVar;
        this.zzgoz = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcpy(this.zzeuo.get(), this.zzgoz.get());
    }
}
