package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcuv implements zzcqq<zzcgg> {
    private final Context context;
    private final zzayt zzbos;
    private final Executor zzfqs;
    private final zzdmx zzfve;
    private final zzcgx zzger;
    private final zzcgn zzgtv;

    public zzcuv(Context context, zzayt zzaytVar, zzdmx zzdmxVar, Executor executor, zzcgn zzcgnVar, zzcgx zzcgxVar) {
        this.context = context;
        this.zzfve = zzdmxVar;
        this.zzgtv = zzcgnVar;
        this.zzfqs = executor;
        this.zzbos = zzaytVar;
        this.zzger = zzcgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final boolean zza(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        return (zzdmiVar.zzhht == null || zzdmiVar.zzhht.zzdrd == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final zzdzl<zzcgg> zzb(final zzdmt zzdmtVar, final zzdmi zzdmiVar) {
        final zzchn zzchnVar = new zzchn();
        zzdzl<zzcgg> zzb = zzdyz.zzb(zzdyz.zzag(null), new zzdyj(this, zzdmiVar, zzdmtVar, zzchnVar) { // from class: com.google.android.gms.internal.ads.zzcuu
            private final zzdmi zzgrj;
            private final zzdmt zzgrk;
            private final zzchn zzgrl;
            private final zzcuv zzgtz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgtz = this;
                this.zzgrj = zzdmiVar;
                this.zzgrk = zzdmtVar;
                this.zzgrl = zzchnVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgtz.zzc(this.zzgrj, this.zzgrk, this.zzgrl, obj);
            }
        }, this.zzfqs);
        zzchnVar.getClass();
        zzb.addListener(zzcux.zza(zzchnVar), this.zzfqs);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzc(final zzdmi zzdmiVar, zzdmt zzdmtVar, zzchn zzchnVar, Object obj) throws Exception {
        final zzbdh zza = this.zzger.zza(this.zzfve.zzbpe, zzdmiVar, zzdmtVar.zzhiz.zzera);
        zza.zzax(zzdmiVar.zzdve);
        zzchnVar.zzc(this.context, zza.getView());
        zzazc zzazcVar = new zzazc();
        final zzcgi zza2 = this.zzgtv.zza(new zzbnp(zzdmtVar, zzdmiVar, null), new zzcgl(new zzcvb(this.context, this.zzger, this.zzfve, this.zzbos, zzdmiVar, zzazcVar, zza), zza));
        zzazcVar.set(zza2);
        zzaig.zza(zza, zza2.zzaig());
        zza2.zzagh().zza(new zzbrj(zza) { // from class: com.google.android.gms.internal.ads.zzcuw
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
        return zzdyz.zzb(zzcgz.zza(zza, zzdmiVar.zzhht.zzdrb, zzdmiVar.zzhht.zzdrd), new zzdvo(this, zza, zzdmiVar, zza2) { // from class: com.google.android.gms.internal.ads.zzcuz
            private final zzdmi zzfti;
            private final zzbdh zzgfd;
            private final zzcuv zzgtz;
            private final zzcgi zzgua;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgtz = this;
                this.zzgfd = zza;
                this.zzfti = zzdmiVar;
                this.zzgua = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj2) {
                zzbdh zzbdhVar = this.zzgfd;
                zzdmi zzdmiVar2 = this.zzfti;
                zzcgi zzcgiVar = this.zzgua;
                if (zzdmiVar2.zzdvy) {
                    zzbdhVar.zzadv();
                }
                zzbdhVar.zzadc();
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcoh)).booleanValue()) {
                    zzbdhVar.onPause();
                }
                return zzcgiVar.zzaif();
            }
        }, this.zzfqs);
    }
}
