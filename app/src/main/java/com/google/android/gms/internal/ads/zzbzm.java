package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzuc;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbzm implements zzepq<zzbzn> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzayt> zzfov;
    private final zzeqd<zzuc.zza.EnumC0024zza> zzfrl;
    private final zzeqd<zzbdh> zzftc;
    private final zzeqd<zzdmi> zzfue;

    private zzbzm(zzeqd<Context> zzeqdVar, zzeqd<zzbdh> zzeqdVar2, zzeqd<zzdmi> zzeqdVar3, zzeqd<zzayt> zzeqdVar4, zzeqd<zzuc.zza.EnumC0024zza> zzeqdVar5) {
        this.zzeuo = zzeqdVar;
        this.zzftc = zzeqdVar2;
        this.zzfue = zzeqdVar3;
        this.zzfov = zzeqdVar4;
        this.zzfrl = zzeqdVar5;
    }

    public static zzbzm zzc(zzeqd<Context> zzeqdVar, zzeqd<zzbdh> zzeqdVar2, zzeqd<zzdmi> zzeqdVar3, zzeqd<zzayt> zzeqdVar4, zzeqd<zzuc.zza.EnumC0024zza> zzeqdVar5) {
        return new zzbzm(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbzn(this.zzeuo.get(), this.zzftc.get(), this.zzfue.get(), this.zzfov.get(), this.zzfrl.get());
    }
}
