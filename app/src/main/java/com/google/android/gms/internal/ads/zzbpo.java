package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbpo implements zzepq<zzdvo<zzdmi, com.google.android.gms.ads.internal.util.zzag>> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzayt> zzfov;
    private final zzeqd<zzdmx> zzftm;

    public zzbpo(zzeqd<Context> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<zzdmx> zzeqdVar3) {
        this.zzeuo = zzeqdVar;
        this.zzfov = zzeqdVar2;
        this.zzftm = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        final Context context = this.zzeuo.get();
        final zzayt zzaytVar = this.zzfov.get();
        final zzdmx zzdmxVar = this.zzftm.get();
        return (zzdvo) zzepw.zza(new zzdvo(context, zzaytVar, zzdmxVar) { // from class: com.google.android.gms.internal.ads.zzbpp
            private final Context zzczq;
            private final zzayt zzfth;
            private final zzdmx zzfwf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczq = context;
                this.zzfth = zzaytVar;
                this.zzfwf = zzdmxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj) {
                Context context2 = this.zzczq;
                zzayt zzaytVar2 = this.zzfth;
                zzdmx zzdmxVar2 = this.zzfwf;
                zzdmi zzdmiVar = (zzdmi) obj;
                com.google.android.gms.ads.internal.util.zzag zzagVar = new com.google.android.gms.ads.internal.util.zzag(context2);
                zzagVar.zzem(zzdmiVar.zzdui);
                zzagVar.zzen(zzdmiVar.zzhhy.toString());
                zzagVar.zzad(zzaytVar2.zzbrf);
                zzagVar.setAdUnitId(zzdmxVar2.zzhje);
                return zzagVar;
            }
        }, "Cannot return null from a non-@Nullable @Provides method");
    }
}
