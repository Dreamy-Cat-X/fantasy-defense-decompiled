package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcvb implements zzbzl {
    private final Context context;
    private final zzayt zzbos;
    private final zzdmi zzeqz;
    private final zzdmx zzfve;
    private final zzcgx zzger;
    private final zzdzl<zzcgi> zzgrr;
    private final zzbdh zzgub;

    private zzcvb(Context context, zzcgx zzcgxVar, zzdmx zzdmxVar, zzayt zzaytVar, zzdmi zzdmiVar, zzdzl<zzcgi> zzdzlVar, zzbdh zzbdhVar) {
        this.context = context;
        this.zzger = zzcgxVar;
        this.zzfve = zzdmxVar;
        this.zzbos = zzaytVar;
        this.zzeqz = zzdmiVar;
        this.zzgrr = zzdzlVar;
        this.zzgub = zzbdhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zza(boolean z, Context context) {
        zzbdh zzbdhVar;
        zzbdh zzbdhVar2;
        zzcgi zzcgiVar = (zzcgi) zzdyz.zzb(this.zzgrr);
        try {
            zzdmi zzdmiVar = this.zzeqz;
            if (!this.zzgub.zzadx()) {
                zzbdhVar2 = this.zzgub;
            } else {
                if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcol)).booleanValue()) {
                    zzbdhVar2 = this.zzgub;
                } else {
                    final zzbdh zze = this.zzger.zze(this.zzfve.zzbpe);
                    zzaig.zza(zze, zzcgiVar.zzaig());
                    final zzchn zzchnVar = new zzchn();
                    zzchnVar.zzc(this.context, zze.getView());
                    zzcgiVar.zzahe().zza(zze, true);
                    zze.zzadi().zza(new zzbes(zzchnVar, zze) { // from class: com.google.android.gms.internal.ads.zzcva
                        private final zzbdh zzgfd;
                        private final zzchn zzgrn;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzgrn = zzchnVar;
                            this.zzgfd = zze;
                        }

                        @Override // com.google.android.gms.internal.ads.zzbes
                        public final void zzai(boolean z2) {
                            zzchn zzchnVar2 = this.zzgrn;
                            zzbdh zzbdhVar3 = this.zzgfd;
                            zzchnVar2.zzapu();
                            zzbdhVar3.zzadc();
                            zzbdhVar3.zzadi().zzacv();
                        }
                    });
                    zzbet zzadi = zze.zzadi();
                    zze.getClass();
                    zzadi.zza(zzcvd.zzn(zze));
                    zze.zzb(zzdmiVar.zzhht.zzdrb, zzdmiVar.zzhht.zzdrd, null);
                    zzbdhVar = zze;
                    zzbdhVar.zzba(true);
                    com.google.android.gms.ads.internal.zzp.zzkq();
                    com.google.android.gms.ads.internal.zzi zziVar = new com.google.android.gms.ads.internal.zzi(false, com.google.android.gms.ads.internal.util.zzm.zzay(this.context), false, 0.0f, -1, z, this.zzeqz.zzfrw, this.zzeqz.zzbpc);
                    com.google.android.gms.ads.internal.zzp.zzkp();
                    com.google.android.gms.ads.internal.overlay.zzo.zza(context, new AdOverlayInfoParcel((zzuz) null, zzcgiVar.zzahf(), (com.google.android.gms.ads.internal.overlay.zzu) null, zzbdhVar, this.zzeqz.zzhic, this.zzbos, this.zzeqz.zzdui, zziVar, this.zzeqz.zzhht.zzdrb, this.zzeqz.zzhht.zzdrd), true);
                }
            }
            zzbdhVar = zzbdhVar2;
            zzbdhVar.zzba(true);
            com.google.android.gms.ads.internal.zzp.zzkq();
            com.google.android.gms.ads.internal.zzi zziVar2 = new com.google.android.gms.ads.internal.zzi(false, com.google.android.gms.ads.internal.util.zzm.zzay(this.context), false, 0.0f, -1, z, this.zzeqz.zzfrw, this.zzeqz.zzbpc);
            com.google.android.gms.ads.internal.zzp.zzkp();
            com.google.android.gms.ads.internal.overlay.zzo.zza(context, new AdOverlayInfoParcel((zzuz) null, zzcgiVar.zzahf(), (com.google.android.gms.ads.internal.overlay.zzu) null, zzbdhVar, this.zzeqz.zzhic, this.zzbos, this.zzeqz.zzdui, zziVar2, this.zzeqz.zzhht.zzdrb, this.zzeqz.zzhht.zzdrd), true);
        } catch (zzbdt e) {
            zzaym.zzc("", e);
        }
    }
}
