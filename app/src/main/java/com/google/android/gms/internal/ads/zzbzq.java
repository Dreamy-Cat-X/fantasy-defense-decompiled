package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzuc;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbzq implements zzepq<zzbzr> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzawg> zzfoy;
    private final zzeqd<View> zzfqf;
    private final zzeqd<zzuc.zza.EnumC0024zza> zzfrl;
    private final zzeqd<zzawh> zzfuk;

    private zzbzq(zzeqd<zzawh> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<zzawg> zzeqdVar3, zzeqd<View> zzeqdVar4, zzeqd<zzuc.zza.EnumC0024zza> zzeqdVar5) {
        this.zzfuk = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzfoy = zzeqdVar3;
        this.zzfqf = zzeqdVar4;
        this.zzfrl = zzeqdVar5;
    }

    public static zzbzq zzd(zzeqd<zzawh> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<zzawg> zzeqdVar3, zzeqd<View> zzeqdVar4, zzeqd<zzuc.zza.EnumC0024zza> zzeqdVar5) {
        return new zzbzq(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbzr(this.zzfuk.get(), this.zzeuo.get(), this.zzfoy.get(), this.zzfqf.get(), this.zzfrl.get());
    }
}
