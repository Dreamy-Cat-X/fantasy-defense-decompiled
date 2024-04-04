package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcsm implements zzcqq<zzbyd> {
    private final Context context;
    private final zzayt zzbos;
    private final Executor zzfqs;
    private final zzdmx zzfve;
    private final zzcgx zzger;
    private final zzbzd zzgsh;

    public zzcsm(Context context, zzayt zzaytVar, zzdmx zzdmxVar, Executor executor, zzbzd zzbzdVar, zzcgx zzcgxVar) {
        this.context = context;
        this.zzfve = zzdmxVar;
        this.zzgsh = zzbzdVar;
        this.zzfqs = executor;
        this.zzbos = zzaytVar;
        this.zzger = zzcgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final boolean zza(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        return (zzdmiVar.zzhht == null || zzdmiVar.zzhht.zzdrd == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final zzdzl<zzbyd> zzb(final zzdmt zzdmtVar, final zzdmi zzdmiVar) {
        final zzchn zzchnVar = new zzchn();
        zzdzl<zzbyd> zzb = zzdyz.zzb(zzdyz.zzag(null), new zzdyj(this, zzdmiVar, zzdmtVar, zzchnVar) { // from class: com.google.android.gms.internal.ads.zzcsp
            private final zzdmi zzgrj;
            private final zzdmt zzgrk;
            private final zzchn zzgrl;
            private final zzcsm zzgsr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsr = this;
                this.zzgrj = zzdmiVar;
                this.zzgrk = zzdmtVar;
                this.zzgrl = zzchnVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgsr.zzb(this.zzgrj, this.zzgrk, this.zzgrl, obj);
            }
        }, this.zzfqs);
        zzchnVar.getClass();
        zzb.addListener(zzcso.zza(zzchnVar), this.zzfqs);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzb(final zzdmi zzdmiVar, zzdmt zzdmtVar, zzchn zzchnVar, Object obj) throws Exception {
        final zzbdh zza = this.zzger.zza(this.zzfve.zzbpe, zzdmiVar, zzdmtVar.zzhiz.zzera);
        zza.zzax(zzdmiVar.zzdve);
        zzchnVar.zzc(this.context, zza.getView());
        zzazc zzazcVar = new zzazc();
        final zzbyf zza2 = this.zzgsh.zza(new zzbnp(zzdmtVar, zzdmiVar, null), new zzbye(new zzcss(this.context, this.zzbos, zzazcVar, zzdmiVar, zza), zza));
        zzazcVar.set(zza2);
        zza2.zzagh().zza(new zzbrj(zza) { // from class: com.google.android.gms.internal.ads.zzcsr
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
        zza2.zzahe().zza(zza, true);
        zza2.zzahe();
        return zzdyz.zzb(zzcgz.zza(zza, zzdmiVar.zzhht.zzdrb, zzdmiVar.zzhht.zzdrd), new zzdvo(this, zza, zzdmiVar, zza2) { // from class: com.google.android.gms.internal.ads.zzcsq
            private final zzdmi zzfti;
            private final zzbdh zzgfd;
            private final zzcsm zzgsr;
            private final zzbyf zzgss;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsr = this;
                this.zzgfd = zza;
                this.zzfti = zzdmiVar;
                this.zzgss = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj2) {
                zzbdh zzbdhVar = this.zzgfd;
                zzdmi zzdmiVar2 = this.zzfti;
                zzbyf zzbyfVar = this.zzgss;
                if (zzdmiVar2.zzdvy) {
                    zzbdhVar.zzadv();
                }
                zzbdhVar.zzadc();
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcoh)).booleanValue()) {
                    zzbdhVar.onPause();
                }
                return zzbyfVar.zzahw();
            }
        }, this.zzfqs);
    }
}
