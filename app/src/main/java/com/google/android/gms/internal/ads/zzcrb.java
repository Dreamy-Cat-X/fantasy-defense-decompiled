package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcrb implements zzcqq<zzbks> {
    private final Context context;
    private final zzayt zzbos;
    private final Executor zzfqs;
    private final zzdmx zzfve;
    private final zzcgx zzger;
    private final zzbkm zzgrm;

    public zzcrb(zzbkm zzbkmVar, Context context, Executor executor, zzcgx zzcgxVar, zzdmx zzdmxVar, zzayt zzaytVar) {
        this.context = context;
        this.zzgrm = zzbkmVar;
        this.zzfqs = executor;
        this.zzger = zzcgxVar;
        this.zzfve = zzdmxVar;
        this.zzbos = zzaytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final boolean zza(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        return (zzdmiVar.zzhht == null || zzdmiVar.zzhht.zzdrd == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final zzdzl<zzbks> zzb(final zzdmt zzdmtVar, final zzdmi zzdmiVar) {
        final zzchn zzchnVar = new zzchn();
        zzdzl<zzbks> zzb = zzdyz.zzb(zzdyz.zzag(null), new zzdyj(this, zzdmiVar, zzdmtVar, zzchnVar) { // from class: com.google.android.gms.internal.ads.zzcra
            private final zzcrb zzgri;
            private final zzdmi zzgrj;
            private final zzdmt zzgrk;
            private final zzchn zzgrl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgri = this;
                this.zzgrj = zzdmiVar;
                this.zzgrk = zzdmtVar;
                this.zzgrl = zzchnVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgri.zza(this.zzgrj, this.zzgrk, this.zzgrl, obj);
            }
        }, this.zzfqs);
        zzchnVar.getClass();
        zzb.addListener(zzcrd.zza(zzchnVar), this.zzfqs);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(final zzdmi zzdmiVar, zzdmt zzdmtVar, zzchn zzchnVar, Object obj) throws Exception {
        final zzbdh zza = this.zzger.zza(this.zzfve.zzbpe, zzdmiVar, zzdmtVar.zzhiz.zzera);
        zza.zzax(zzdmiVar.zzdve);
        zzchnVar.zzc(this.context, zza.getView());
        zzazc zzazcVar = new zzazc();
        final zzbkk zza2 = this.zzgrm.zza(new zzbnp(zzdmtVar, zzdmiVar, null), new zzbye(new zzcrh(this.zzbos, zzazcVar, zzdmiVar, zza, this.zzfve), zza), new zzbkn(zzdmiVar.zzfru));
        zza2.zzahe().zza(zza, false);
        zzazcVar.set(zza2);
        zza2.zzagh().zza(new zzbrj(zza) { // from class: com.google.android.gms.internal.ads.zzcrc
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
        return zzdyz.zzb(zzcgz.zza(zza, zzdmiVar.zzhht.zzdrb, zzdmiVar.zzhht.zzdrd), new zzdvo(this, zza, zzdmiVar, zza2) { // from class: com.google.android.gms.internal.ads.zzcrf
            private final zzdmi zzfti;
            private final zzbdh zzgfd;
            private final zzcrb zzgri;
            private final zzbkk zzgrp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgri = this;
                this.zzgfd = zza;
                this.zzfti = zzdmiVar;
                this.zzgrp = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj2) {
                zzbdh zzbdhVar = this.zzgfd;
                zzdmi zzdmiVar2 = this.zzfti;
                zzbkk zzbkkVar = this.zzgrp;
                if (zzdmiVar2.zzdvy) {
                    zzbdhVar.zzadv();
                }
                zzbdhVar.zzadc();
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcoh)).booleanValue()) {
                    zzbdhVar.onPause();
                }
                return zzbkkVar.zzahd();
            }
        }, this.zzfqs);
    }
}
