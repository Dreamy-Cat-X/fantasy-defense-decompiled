package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcur implements zzepq<zzcum> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzcgn> zzgro;

    public zzcur(zzeqd<Context> zzeqdVar, zzeqd<zzcgn> zzeqdVar2) {
        this.zzeuo = zzeqdVar;
        this.zzgro = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcum(this.zzeuo.get(), this.zzgro.get());
    }
}
