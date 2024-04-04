package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcrh implements zzbzl {
    private final zzayt zzbos;
    private final zzdmx zzfve;
    private final zzdmi zzgdb;
    private final zzdzl<zzbkk> zzgrr;
    private final zzbdh zzgrs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcrh(zzayt zzaytVar, zzdzl<zzbkk> zzdzlVar, zzdmi zzdmiVar, zzbdh zzbdhVar, zzdmx zzdmxVar) {
        this.zzbos = zzaytVar;
        this.zzgrr = zzdzlVar;
        this.zzgdb = zzdmiVar;
        this.zzgrs = zzbdhVar;
        this.zzfve = zzdmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zza(boolean z, Context context) {
        int i;
        int i2;
        zzbkk zzbkkVar = (zzbkk) zzdyz.zzb(this.zzgrr);
        this.zzgrs.zzba(true);
        com.google.android.gms.ads.internal.zzi zziVar = new com.google.android.gms.ads.internal.zzi(true, true, false, 0.0f, -1, z, this.zzgdb.zzfrw, false);
        com.google.android.gms.ads.internal.zzp.zzkp();
        zzbzb zzahf = zzbkkVar.zzahf();
        zzbdh zzbdhVar = this.zzgrs;
        if (this.zzgdb.zzhic != -1) {
            i = this.zzgdb.zzhic;
        } else {
            if (this.zzfve.zzhjh != null) {
                if (this.zzfve.zzhjh.orientation == 1) {
                    i2 = 7;
                } else if (this.zzfve.zzhjh.orientation == 2) {
                    i2 = 6;
                }
                com.google.android.gms.ads.internal.overlay.zzo.zza(context, new AdOverlayInfoParcel((zzuz) null, zzahf, (com.google.android.gms.ads.internal.overlay.zzu) null, zzbdhVar, i2, this.zzbos, this.zzgdb.zzdui, zziVar, this.zzgdb.zzhht.zzdrb, this.zzgdb.zzhht.zzdrd), true);
            }
            com.google.android.gms.ads.internal.util.zzd.zzdy("Error setting app open orientation; no targeting orientation available.");
            i = this.zzgdb.zzhic;
        }
        i2 = i;
        com.google.android.gms.ads.internal.overlay.zzo.zza(context, new AdOverlayInfoParcel((zzuz) null, zzahf, (com.google.android.gms.ads.internal.overlay.zzu) null, zzbdhVar, i2, this.zzbos, this.zzgdb.zzdui, zziVar, this.zzgdb.zzhht.zzdrb, this.zzgdb.zzhht.zzdrd), true);
    }
}
