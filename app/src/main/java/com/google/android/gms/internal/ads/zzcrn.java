package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcrn implements zzcqq<zzblb> {
    private final Context context;
    private final Executor zzfqs;
    private final zzdmx zzfve;
    private final zzcgx zzger;
    private final zzblx zzgrw;
    private final zzdvo<zzdmi, com.google.android.gms.ads.internal.util.zzag> zzgrx;

    public zzcrn(zzblx zzblxVar, Context context, Executor executor, zzcgx zzcgxVar, zzdmx zzdmxVar, zzdvo<zzdmi, com.google.android.gms.ads.internal.util.zzag> zzdvoVar) {
        this.context = context;
        this.zzgrw = zzblxVar;
        this.zzfqs = executor;
        this.zzger = zzcgxVar;
        this.zzfve = zzdmxVar;
        this.zzgrx = zzdvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final boolean zza(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        return (zzdmiVar.zzhht == null || zzdmiVar.zzhht.zzdrd == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final zzdzl<zzblb> zzb(final zzdmt zzdmtVar, final zzdmi zzdmiVar) {
        return zzdyz.zzb(zzdyz.zzag(null), new zzdyj(this, zzdmtVar, zzdmiVar) { // from class: com.google.android.gms.internal.ads.zzcrm
            private final zzdmi zzfti;
            private final zzdmt zzggd;
            private final zzcrn zzgrv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgrv = this;
                this.zzggd = zzdmtVar;
                this.zzfti = zzdmiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgrv.zzb(this.zzggd, this.zzfti, obj);
            }
        }, this.zzfqs);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzbdh zzbdhVar) {
        zzbdhVar.zzadc();
        zzbeb zzaay = zzbdhVar.zzaay();
        if (this.zzfve.zzhjc == null || zzaay == null) {
            return;
        }
        zzaay.zzb(this.zzfve.zzhjc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzb(zzdmt zzdmtVar, zzdmi zzdmiVar, Object obj) throws Exception {
        View zzchkVar;
        zzvp zzb = zzdnd.zzb(this.context, zzdmiVar.zzhhv);
        final zzbdh zza = this.zzger.zza(zzb, zzdmiVar, zzdmtVar.zzhiz.zzera);
        zza.zzax(zzdmiVar.zzdve);
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyk)).booleanValue() && zzdmiVar.zzhik) {
            zzchkVar = zzbmp.zza(this.context, zza.getView(), zzdmiVar);
        } else {
            zzchkVar = new zzchk(this.context, zza.getView(), this.zzgrx.apply(zzdmiVar));
        }
        zzblx zzblxVar = this.zzgrw;
        zzbnp zzbnpVar = new zzbnp(zzdmtVar, zzdmiVar, null);
        zza.getClass();
        final zzbla zza2 = zzblxVar.zza(zzbnpVar, new zzble(zzchkVar, zza, zzcrp.zzm(zza), zzdnd.zzh(zzb)));
        zza2.zzahe().zza(zza, false);
        zza2.zzagh().zza(new zzbrj(zza) { // from class: com.google.android.gms.internal.ads.zzcro
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
        zzdzl<?> zza3 = zzcgz.zza(zza, zzdmiVar.zzhht.zzdrb, zzdmiVar.zzhht.zzdrd);
        if (zzdmiVar.zzdvy) {
            zza.getClass();
            zza3.addListener(zzcrr.zze(zza), this.zzfqs);
        }
        zza3.addListener(new Runnable(this, zza) { // from class: com.google.android.gms.internal.ads.zzcrq
            private final zzbdh zzgfd;
            private final zzcrn zzgrv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgrv = this;
                this.zzgfd = zza;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgrv.zzl(this.zzgfd);
            }
        }, this.zzfqs);
        return zzdyz.zzb(zza3, new zzdvo(zza2) { // from class: com.google.android.gms.internal.ads.zzcrt
            private final zzbla zzgrz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgrz = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj2) {
                return this.zzgrz.zzahp();
            }
        }, zzayv.zzegn);
    }
}
