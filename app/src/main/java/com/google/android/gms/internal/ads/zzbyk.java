package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbyk implements zzepq<zzbxf<zzbsg>> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzayt> zzfov;
    private final zzeqd<zzdmi> zzfrj;
    private final zzeqd<zzdmx> zzftm;
    private final zzbye zzfzr;

    private zzbyk(zzbye zzbyeVar, zzeqd<Context> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<zzdmi> zzeqdVar3, zzeqd<zzdmx> zzeqdVar4) {
        this.zzfzr = zzbyeVar;
        this.zzeuo = zzeqdVar;
        this.zzfov = zzeqdVar2;
        this.zzfrj = zzeqdVar3;
        this.zzftm = zzeqdVar4;
    }

    public static zzbyk zza(zzbye zzbyeVar, zzeqd<Context> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<zzdmi> zzeqdVar3, zzeqd<zzdmx> zzeqdVar4) {
        return new zzbyk(zzbyeVar, zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        final Context context = this.zzeuo.get();
        final zzayt zzaytVar = this.zzfov.get();
        final zzdmi zzdmiVar = this.zzfrj.get();
        final zzdmx zzdmxVar = this.zzftm.get();
        return (zzbxf) zzepw.zza(new zzbxf(new zzbsg(context, zzaytVar, zzdmiVar, zzdmxVar) { // from class: com.google.android.gms.internal.ads.zzbyh
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
}
