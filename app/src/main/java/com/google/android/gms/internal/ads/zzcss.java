package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcss implements zzbzl {
    private final Context context;
    private final zzayt zzbos;
    private final zzdmi zzgdb;
    private final zzdzl<zzbyf> zzgrr;
    private final zzbdh zzgrs;

    private zzcss(Context context, zzayt zzaytVar, zzdzl<zzbyf> zzdzlVar, zzdmi zzdmiVar, zzbdh zzbdhVar) {
        this.context = context;
        this.zzbos = zzaytVar;
        this.zzgrr = zzdzlVar;
        this.zzgdb = zzdmiVar;
        this.zzgrs = zzbdhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zza(boolean z, Context context) {
        zzbyf zzbyfVar = (zzbyf) zzdyz.zzb(this.zzgrr);
        this.zzgrs.zzba(true);
        com.google.android.gms.ads.internal.zzp.zzkq();
        com.google.android.gms.ads.internal.zzi zziVar = new com.google.android.gms.ads.internal.zzi(false, com.google.android.gms.ads.internal.util.zzm.zzay(this.context), false, 0.0f, -1, z, this.zzgdb.zzfrw, false);
        com.google.android.gms.ads.internal.zzp.zzkp();
        com.google.android.gms.ads.internal.overlay.zzo.zza(context, new AdOverlayInfoParcel((zzuz) null, zzbyfVar.zzahf(), (com.google.android.gms.ads.internal.overlay.zzu) null, this.zzgrs, this.zzgdb.zzhic, this.zzbos, this.zzgdb.zzdui, zziVar, this.zzgdb.zzhht.zzdrb, this.zzgdb.zzhht.zzdrd), true);
    }
}
