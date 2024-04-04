package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcrg implements zzcqq<zzbki> {
    private final Context context;
    private final Executor zzfqs;
    private final zzcgx zzger;
    private final zzbkd zzgrq;

    public zzcrg(zzbkd zzbkdVar, Context context, Executor executor, zzcgx zzcgxVar) {
        this.context = context;
        this.zzgrq = zzbkdVar;
        this.zzfqs = executor;
        this.zzger = zzcgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final boolean zza(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        return (zzdmiVar.zzhht == null || zzdmiVar.zzhht.zzdrd == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final zzdzl<zzbki> zzb(final zzdmt zzdmtVar, final zzdmi zzdmiVar) {
        return zzdyz.zzb(zzdyz.zzag(null), new zzdyj(this, zzdmtVar, zzdmiVar) { // from class: com.google.android.gms.internal.ads.zzcrj
            private final zzdmi zzfti;
            private final zzdmt zzggd;
            private final zzcrg zzgrt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgrt = this;
                this.zzggd = zzdmtVar;
                this.zzfti = zzdmiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgrt.zza(this.zzggd, this.zzfti, obj);
            }
        }, this.zzfqs);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(zzdmt zzdmtVar, zzdmi zzdmiVar, Object obj) throws Exception {
        zzvp zzb = zzdnd.zzb(this.context, zzdmiVar.zzhhv);
        final zzbdh zza = this.zzger.zza(zzb, zzdmiVar, zzdmtVar.zzhiz.zzera);
        final zzbjv zza2 = this.zzgrq.zza(new zzbnp(zzdmtVar, zzdmiVar, null), new zzbju(zza.getView(), zza, zzdnd.zzh(zzb), zzdmiVar.zzfru, zzdmiVar.zzfrv, zzdmiVar.zzfrw));
        zza2.zzahe().zza(zza, false);
        zza2.zzagh().zza(new zzbrj(zza) { // from class: com.google.android.gms.internal.ads.zzcri
            private final zzbdh zzesn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzesn = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzbrj
            public final void onAdImpression() {
                zzbdh zzbdhVar = this.zzesn;
                if (zzbdhVar.zzadi() != null) {
                    zzbdhVar.zzadi().zzacv();
                }
            }
        }, zzayv.zzegn);
        zza2.zzahe();
        return zzdyz.zzb(zzcgz.zza(zza, zzdmiVar.zzhht.zzdrb, zzdmiVar.zzhht.zzdrd), new zzdvo(zza2) { // from class: com.google.android.gms.internal.ads.zzcrl
            private final zzbjv zzgru;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgru = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj2) {
                return this.zzgru.zzahg();
            }
        }, zzayv.zzegn);
    }
}
