package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbqn implements zzepq<zzawd> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdmi> zzfrj;
    private final zzbqo zzfxk;
    private final zzeqd<zzayt> zzfxl;
    private final zzeqd<zzawf> zzfxm;

    private zzbqn(zzbqo zzbqoVar, zzeqd<Context> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<zzdmi> zzeqdVar3, zzeqd<zzawf> zzeqdVar4) {
        this.zzfxk = zzbqoVar;
        this.zzeuo = zzeqdVar;
        this.zzfxl = zzeqdVar2;
        this.zzfrj = zzeqdVar3;
        this.zzfxm = zzeqdVar4;
    }

    public static zzbqn zza(zzbqo zzbqoVar, zzeqd<Context> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<zzdmi> zzeqdVar3, zzeqd<zzawf> zzeqdVar4) {
        return new zzbqn(zzbqoVar, zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        Context context = this.zzeuo.get();
        zzayt zzaytVar = this.zzfxl.get();
        zzdmi zzdmiVar = this.zzfrj.get();
        zzawf zzawfVar = this.zzfxm.get();
        if (zzdmiVar.zzhhx != null) {
            return new zzavq(context, zzaytVar, zzdmiVar.zzhhx, zzdmiVar.zzhht.zzdrb, zzawfVar);
        }
        return null;
    }
}
