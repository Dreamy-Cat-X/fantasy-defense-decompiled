package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzblm implements zzepq<zzbxf<zzbsg>> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzayt> zzfov;
    private final zzeqd<zzdmi> zzfrj;
    private final zzble zzftk;
    private final zzeqd<zzdmx> zzftm;

    public zzblm(zzble zzbleVar, zzeqd<Context> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<zzdmi> zzeqdVar3, zzeqd<zzdmx> zzeqdVar4) {
        this.zzftk = zzbleVar;
        this.zzeuo = zzeqdVar;
        this.zzfov = zzeqdVar2;
        this.zzfrj = zzeqdVar3;
        this.zzftm = zzeqdVar4;
    }

    public static zzbxf<zzbsg> zza(zzble zzbleVar, final Context context, final zzayt zzaytVar, final zzdmi zzdmiVar, final zzdmx zzdmxVar) {
        return (zzbxf) zzepw.zza(new zzbxf(new zzbsg(context, zzaytVar, zzdmiVar, zzdmxVar) { // from class: com.google.android.gms.internal.ads.zzblh
            private final Context zzczq;
            private final zzayt zzfth;
            private final zzdmi zzfti;
            private final zzdmx zzftj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczq = context;
                this.zzfth = zzaytVar;
                this.zzfti = zzdmiVar;
                this.zzftj = zzdmxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbsg
            public final void onAdLoaded() {
                com.google.android.gms.ads.internal.zzp.zzla().zzb(this.zzczq, this.zzfth.zzbrf, this.zzfti.zzhhy.toString(), this.zzftj.zzhje);
            }
        }, zzayv.zzegn), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzftk, this.zzeuo.get(), this.zzfov.get(), this.zzfrj.get(), this.zzftm.get());
    }
}
